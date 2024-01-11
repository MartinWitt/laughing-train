import { Box, Button, Grid, TextField, Typography } from '@mui/material';
import React, { ChangeEvent } from 'react';
import { useNavigate } from 'react-router';
import { useGetProjectsQuery } from '../gql/graphql-types';
import AppBreadcrumbs from '../component/AppBreadcrumbs';
import { AppErrorMessage } from '../component/AppErrorMessage';
import { AppLoadingBar } from '../component/AppLoadingBar';
import { Project } from '../data/Project';
import DashBoardItem from '../component/DashBoardItem';

const breadcrumbItems = [
  { text: 'Home', href: '/home' },
  { text: 'Dashboard' },
];

interface SearchFieldProps {
  value: string;
  onChange: (e: ChangeEvent<HTMLInputElement>) => void;
}
function SearchField(props: SearchFieldProps) {
  return (
    <>
      <Typography variant="h4">Search</Typography>
      <TextField
        value={props.value}
        onChange={props.onChange}
        sx={{ padding: 5 }}
      />
    </>
  );
}

export default function DashBoard() {
  const [filter, setFilter] = React.useState('');
  const { data, error, loading } = useGetProjectsQuery();
  if (error) {
    return (
      <>
        <AppBreadcrumbs items={breadcrumbItems} />
        <AppErrorMessage message={error.message} />
      </>
    );
  }
  if (loading) {
    return (
      <>
        <AppBreadcrumbs items={breadcrumbItems} />
        <AppLoadingBar />
      </>
    );
  }
  const projects: Project[] =
    data?.getProjects?.map((project: any) => toProject(project)) || [];
  return (
    <div>
      <AppBreadcrumbs items={breadcrumbItems} />
      <Box sx={{ top: 0, zIndex: 1 }}>
        <SearchField
          value={filter}
          onChange={(e) => setFilter(e.target.value)}
        />
        <AddProjectButton />
      </Box>
      <Box>
        <Grid container marginLeft={'5%'}>
          {projects.map((project: Project) => (
            <DashBoardItem project={project} />
          ))}
          <Grid item xs={12}></Grid>
        </Grid>
      </Box>
    </div>
  );
}

function AddProjectButton() {
  const navigate = useNavigate();
  return (
    <Button
      onClick={() => navigate('/mutation/addproject')}
      variant="contained"
    >
      Add Project
    </Button>
  );
}
function toProject(project: any): Project {
  return {
    projectName: project.projectName,
    projectUrl: project.projectUrl,
    commits: project.commits.map((commit: any) => ({
      commitHash: commit.commitHash,
    })),
  };
}
