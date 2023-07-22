import {
  Button,
  CircularProgress,
  Divider,
  Grid,
  Stack,
  Typography,
} from '@mui/material';
import React from 'react';
import ProjectCard from '../component/ProjectCard';
import { useNavigate, useParams } from 'react-router-dom';
import { fetchProjectQuery } from '../ProjectData';
import HashSelector from '../component/HashSelector';
import { Project } from '../data/Project';
import { useQuery } from '@apollo/client';
import BadSmellList from '../component/BadSmellList';

function Resultview() {
  let navigate = useNavigate();
  let params = useParams();
  const { data, loading, error } = useQuery(fetchProjectQuery);
  if (error) {
    console.error(error);
  }
  console.log(params);
  if (loading) {
    return <CircularProgress />;
  }
  const project: Project | undefined = data.getProjects.find(
    (project: Project) => {
      return project.projectName === params.name;
    }
  );
  if (!project) {
    return <div>Project not found</div>;
  }
  return (
    <div>
      <br />
      <ProjectCard {...project} />
      <br />
      {addHashIfPresent(params.hash)}
      <Divider />
      <br />
      <HashSelector {...project} />
      <br />
      <Divider />
      <Grid container spacing={2}>
        <Grid item xs={10}>
          <BadSmellList {...projectWithSingleHash(project, params.hash)} />
        </Grid>
        <Divider />
        <br />
        <Grid item xs={2}>
          <Stack direction="column" spacing={2}>
            <Button
              variant="contained"
              href={
                '/mutation/refactor/' + project.projectName + '/' + params.hash
              }
            >
              Refactor
            </Button>
            <Button
              variant="contained"
              onClick={() => navigate(generateProjectConfigLink(project))}
            >
              Config
            </Button>
          </Stack>
        </Grid>
      </Grid>
    </div>
  );
}
export default Resultview;

function projectWithSingleHash(
  project: Project,
  hash: string | undefined
): Project {
  if (hash) {
    return {
      projectName: project.projectName,
      commitHashes: [hash],
      projectUrl: project.projectUrl,
      commits: project.commits,
    };
  }
  return project;
}
function addHashIfPresent(hash: string | undefined) {
  if (hash) {
    return <Typography>Current selected hash: {hash}</Typography>;
  }
  return <Typography>No hash selected</Typography>;
}
function toBase64(str: string) {
  return btoa(str);
}
function generateProjectConfigLink(project: Project) {
  return '/mutation/projectconfig/' + toBase64(project.projectUrl);
}
