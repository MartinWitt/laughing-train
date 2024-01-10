import { Button, Divider, Grid, Stack, Typography } from '@mui/material';
import React, { useState } from 'react';
import AppProjectCard from '../component/AppProjectCard';
import { useParams } from 'react-router-dom';
import HashSelector from '../component/HashSelector';
import { Project } from '../data/Project';
import BadSmellList from '../component/BadSmellList';
import AppBreadcrumbs from '../component/AppBreadcrumbs';
import { AppErrorMessage } from '../component/AppErrorMessage';
import { AppLoadingBar } from '../component/AppLoadingBar';
import { useGetProjectQuery } from '../gql/graphql-types';

const breadcrumbItems = [{ text: 'Home', href: '/home' }, { text: 'Results' }];

function RefactorButton(props: { project: Project; hash: string }) {
  return (
    <Button
      variant="contained"
      href={
        '/mutation/refactor/' + props.project.projectName + '/' + props.hash
      }
    >
      Refactor
    </Button>
  );
}

export function ResultView() {
  const [hash, setHash] = useState('');
  function setHashLogged(hash: string) {
    console.log('Changing: ' + hash);
    return setHash(hash);
  }
  const params = useParams();
  const { data, loading, error } = useGetProjectQuery({
    variables: { projectName: params.name! },
  });
  console.log(data);
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
  const project: Project = {
    projectName: data?.getProjectWithName?.projectName!,
    projectUrl: data?.getProjectWithName?.projectUrl!,
    commits: (data?.getProjectWithName?.commits || []).map((commit: any) => ({
      commitHash: commit.commitHash,
    })),
  };

  if (!project) {
    return (
      <>
        <AppBreadcrumbs items={breadcrumbItems} />
        <AppErrorMessage message={'Project not found'} />
      </>
    );
  }
  return (
    <>
      <AppProjectCard project={project} />
      <HashDisplay hash={hash} />
      <Divider />
      <HashSelector project={project} hash={hash} setHash={setHashLogged} />
      <Divider />
      <Grid container spacing={2}>
        <Grid item xs={10}>
          <BadSmellList project={project} hash={hash} />
        </Grid>
        <Divider />
        <Grid item xs={2}>
          <Stack direction="column" spacing={2}>
            <RefactorButton project={project} hash={hash} />
          </Stack>
        </Grid>
      </Grid>
    </>
  );
}
export default ResultView;

function HashDisplay({ hash }: HashDisplayProps) {
  if (hash) {
    return <Typography>Current selected hash: {hash}</Typography>;
  }
  return <Typography>No hash selected</Typography>;
}
interface HashDisplayProps {
  hash: string | undefined;
}
