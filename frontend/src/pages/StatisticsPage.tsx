import PageLayout from './PageLayout';
import {
  Box,
  Breadcrumbs,
  LinearProgress,
  Link,
  Paper,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from '@mui/material';
import { Error } from '@mui/icons-material';
import { useGetProjectsQuery, GetProjectsQuery } from '../gql/graphql-types';
import Avatar from 'react-avatar';
import React from 'react';

type OrgStats = {
  name: string;
  projectCount: number;
  commitCount: number;
  issuesCount: number;
};
type OrgData = {
  [key: string]: OrgStats;
};

export function calculateOrganizationStats(data: GetProjectsQuery): OrgData {
  const organizations: OrgData = {};
  data.getProjects!.forEach((project) => {
    const urlParts = project!.projectUrl!.split('/');
    const owner = urlParts[urlParts.length - 2];
    let commitCount = project!.commits?.length || 0;
    let issuesCount = 0;
    if (!organizations[owner]) {
      organizations[owner] = {
        name: owner,
        projectCount: 0,
        commitCount: 0,
        issuesCount: 0,
      };
    }
    organizations[owner].projectCount += 1;
    organizations[owner].commitCount += commitCount;
    organizations[owner].issuesCount += issuesCount;
  });
  console.log(organizations);
  return organizations;
}

type OrgStatsTableProps = {
  organizations: OrgData;
};

export const OrgStatsTable: React.FC<OrgStatsTableProps> = ({
  organizations,
}) => {
  return (
    <TableContainer component={Paper}>
      <Table aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>Organization</TableCell>
            <TableCell align="right">Project Count</TableCell>
            <TableCell align="right">Commit Count</TableCell>
            <TableCell align="right">Issues Count</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {Object.values(organizations).map((org) => (
            <TableRow key={org.name}>
              <TableCell component="th" scope="row">
                <Avatar
                  githubHandle={org.name}
                  alt={org.name}
                  size={'50'}
                  style={{ marginRight: '10px' }}
                />
                {org.name}
              </TableCell>
              <TableCell align="right">{org.projectCount}</TableCell>
              <TableCell align="right">{org.commitCount}</TableCell>
              <TableCell align="right">{org.issuesCount}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};

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
  console.log(data);
  if (!data || data.getProjects?.length === 0) {
    return (
      <PageLayout>
        <Paper
          style={{
            backgroundColor: '#3f51b5',
            padding: '10px',
            margin: '20px',
          }}
        >
          <Breadcrumbs aria-label="breadcrumb">
            <Link color="inherit" href="/">
              Home
            </Link>
            <Typography color="textPrimary">Statistics</Typography>
          </Breadcrumbs>
        </Paper>
        <Box
          padding="5px"
          display="flex"
          flexDirection="row"
          alignItems="center"
        >
          <Error />
          <Typography variant="h5">No Data found </Typography>
        </Box>
      </PageLayout>
    );
  }
  const organizations = calculateOrganizationStats(data);

  return (
    <PageLayout>
      <Breadcrumbs aria-label="breadcrumb" sx={{ paddingTop: '10px' }}>
        <Link color="inherit" href="/">
          Home
        </Link>
        <Typography color="textPrimary">Statistics</Typography>
      </Breadcrumbs>
      <OrgStatsTable organizations={organizations} />
    </PageLayout>
  );
}
