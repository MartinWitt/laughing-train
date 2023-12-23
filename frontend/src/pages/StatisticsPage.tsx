import { useQuery } from '@apollo/client';
import PageLayout from './PageLayout';
import {
  Box,
  Card,
  CardContent,
  CardHeader,
  Divider,
  LinearProgress,
  Typography,
} from '@mui/material';
import Avatar from 'react-avatar';
import { FancyText } from '../styled/FancyText';
import { GetProjectsQuery, Project } from '../gql/graphql';
import { Error } from '@mui/icons-material';
import { graphql } from '../gql';
import { useGetProjectsQuery } from '../gql/graphql-types';

function toCard(card: CardData[]) {
  const { owner, url } = card[0];
  return (
    <Card
      key={url}
      sx={{
        width: 275,
        height: 275,
        margin: 2,
        boxShadow: '0px 4px 8px rgba(0, 0, 0, 0.2)',
      }}
    >
      <CardHeader
        sx={{ flexDirection: 'column-reverse' }}
        avatar={<Avatar githubHandle={owner} />}
        title={<FancyText variant="h6">{owner}</FancyText>}
      />
      <CardContent>
        <FancyText>{card.length} Projects</FancyText>
      </CardContent>
    </Card>
  );
}
type CardData = {
  owner: string;
  name: string;
  url: string;
  commitHashes: string[];
};

function Statistics({ projects }: { projects: CardData[] }) {
  // group the projects by owner
  const groupedProjects: { [key: string]: CardData[] } = {};
  projects.forEach((project) => {
    if (groupedProjects[project.owner]) {
      groupedProjects[project.owner].push(project);
    } else {
      groupedProjects[project.owner] = [project];
    }
  });

  const numOwners = Object.keys(groupedProjects).length;

  return (
    <Box
      sx={{
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        marginTop: 4,
      }}
    >
      <FancyText sx={{ fontSize: 60 }} variant="h1">
        Statistics
      </FancyText>
      <Divider sx={{ width: '50%', margin: '2rem 0' }} />
      <FancyText>{numOwners} owners</FancyText>
      <FancyText>{projects.length} projects</FancyText>
      <Divider sx={{ width: '50%', margin: '2rem 0' }} />
      <div style={{ display: 'flex', flexWrap: 'wrap' }}>
        {Object.values(groupedProjects).map((card) => toCard(card))}
      </div>
    </Box>
  );
}

const postsQueryDocument = graphql(`
  query getProjects {
    getProjects {
      projectName
      projectUrl
      commitHashes
      commits {
        analyzerStatuses {
          analyzerName
          commitHash
          localDateTime
          numberOfIssues
          status
        }
        commitHash
      }
    }
  }
`);
export function StatisticPage() {
  const { loading, error, data } = useGetProjectsQuery();

  if (loading) return <PageLayout children={<LinearProgress />}></PageLayout>;
  if (error)
    return (
      <PageLayout>
        <Error>
          console.error(error);
          {error.message}
        </Error>
      </PageLayout>
    );
  if (!data || data.getProjects?.length === 0) {
    return (
      <PageLayout>
        <Box padding={5} display="flex" flexDirection="row" alignItems="center">
          <Error />
          <Typography variant="h5">No Data found </Typography>
        </Box>
      </PageLayout>
    );
  }
  const projects: CardData[] = data.getProjects!.map((project) => {
    const urlParts = project!.projectUrl!.split('/');
    const owner = urlParts[urlParts.length - 2];
    const name = urlParts[urlParts.length - 1];
    const url = urlParts.join('/');
    const commitHashes = project!.commitHashes;
    return { owner, name, url, commitHashes } as CardData;
  });

  return (
    <PageLayout>
      <Statistics projects={projects} />
    </PageLayout>
  );
}
