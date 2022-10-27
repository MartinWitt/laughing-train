import { useQuery } from '@apollo/client';
import { Alert, Box, Button, TextField, Typography } from '@mui/material';
import React, { useState } from 'react';
import { useParams } from 'react-router';
import Headline from '../component/Headline';
import { fetchProjectConfigQuery } from '../ProjectData';

export function ProjectConfigview() {
  const { projectUrl } = useParams();
  const encodedProjectUrl = toBase64(projectUrl);
  const [sourceFolder, setSourceFolder] = useState("")
  const { loading, error} = useQuery(fetchProjectConfigQuery, {
    variables: { projectUrl: encodedProjectUrl },
    onCompleted: (data) => {
      setSourceFolder(data.getProjectConfig.sourceFolder)
    }
  });
  return (
    <div>
      <Headline />
      <Box padding={5}>
      <br />
      <Typography variant='h4'>Project Config </Typography>
      <br />
      {loading && <p>Loading...</p>}
      {error && <Alert severity="error">Can not fetch data. Are you logged in?</Alert>}
      <TextField label="SourceFolder" value={sourceFolder} onChange={(e) => setSourceFolder(e.target.value)} />
      <Button variant="contained" onClick={
        (e) => {
          console.log(sourceFolder);
          }}>Save</Button>
      </Box>
    </div>
  );
}
function toBase64(str: string | undefined): string {
  if (undefined === str) {
    return "";
  }
  return atob(str);
}