import React, { useEffect, useState } from 'react';
import {
  Box,
  Breadcrumbs,
  Container,
  Link,
  Paper,
  styled,
  Typography,
} from '@mui/material';
import { Error } from '@mui/icons-material';
import PageLayout from './PageLayout';

function getBreadcrumbs() {
  return (
    <Breadcrumbs aria-label="breadcrumb" sx={{ paddingTop: '10px' }}>
      <Link color="inherit" href="/">
        Home
      </Link>
      <Typography color="textPrimary">About</Typography>
    </Breadcrumbs>
  );
}

const AboutPage = () => {
  const [data, setData] = useState<APIData | null>(null);

  useEffect(() => {
    fetch('https://laughing-train.keksdose.xyz/q/info')
      .then((response) => response.json())
      .then((data: APIData) => setData(data))
      .catch((error) =>
        console.error('Error while fetching API data: ', error)
      );
  }, []);

  // Check if data is loaded
  if (data === null)
    return (
      <PageLayout>
        {getBreadcrumbs()}
        <Box
          padding="5px"
          display="flex"
          flexDirection="row"
          alignItems="center"
        >
          <Error> </Error>
          <Typography variant="h5">Loading...</Typography>
        </Box>
      </PageLayout>
    );

  return (
    <PageLayout>
      {getBreadcrumbs()}
      <Container maxWidth="md" sx={{ alignSelf: 'left' }}>
        <DataSection title="Git" data={data.git} />
        <DataSection title="Java" data={data.java} />
        <DataSection title="OS" data={data.os} />
        <DataSection title="Build" data={data.build} />
      </Container>
    </PageLayout>
  );
};

export default AboutPage;
interface Commit {
  id: string;
  time: string;
}

interface Git {
  branch: string;
  commit: Commit;
}

interface Java {
  version: string;
}

interface OS {
  name: string;
  version: string;
  arch: string;
}

interface Build {
  group: string;
  artifact: string;
  version: string;
  time: string;
}

interface APIData {
  git: Git;
  java: Java;
  os: OS;
  build: Build;
}
const DataSection = (props: { title: string; data: any }) => {
  const { title, data } = props;
  return (
    <StyledBox>
      <Paper elevation={3} sx={{ padding: '5px' }}>
        <Typography variant="h5" gutterBottom align="left">
          {title}
        </Typography>
        {Object.keys(data).map((key) => {
          // If the key is 'commit', it's an object - list its keys and values separately
          if (key === 'commit' && typeof data[key] === 'object') {
            return (
              <>
                {Object.keys(data[key]).map((subKey) => {
                  return (
                    <Typography align="left" key={subKey}>{`Commit ${subKey
                      .charAt(0)
                      .toUpperCase()}${subKey.slice(1)}: ${
                      data[key][subKey]
                    }`}</Typography>
                  );
                })}
              </>
            );
          } else {
            return (
              <Typography align="left" key={key}>{`${key
                .charAt(0)
                .toUpperCase()}${key.slice(1)}: ${data[key]}`}</Typography>
            );
          }
        })}
      </Paper>
    </StyledBox>
  );
};
const StyledBox = styled(Box)({
  backgroundColor: '#f5f5f5', // lighter gray background
  borderRadius: '15px', // rounded corners
  margin: '10px 0', // some vertical margin to separate the boxes
});
