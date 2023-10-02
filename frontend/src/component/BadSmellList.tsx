import { useQuery } from '@apollo/client';
import {
  Accordion,
  AccordionDetails,
  AccordionSummary,
  Box,
  Card,
  LinearProgress,
  Divider,
  Link,
  Stack,
  Typography,
} from '@mui/material';
import { BadSmell } from '../data/BadSmell';
import { Project } from '../data/Project';
import { fetchBadSmellsforHashQuery } from '../ProjectData';
import JavaCodeBlock from './JavaCodeBlock';
import React, { useMemo, useState } from 'react';
import { StyledDivider } from './StyledDivider';

export default function BadSmellList(project: Project) {
  const [badSmellFilter] = useState(['']);

  const { data, error, loading } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: project.commitHashes[0],
    },
  });
  const filteredBadSmells = useMemo(() => {
    if (!data) {
      return [];
    }
    const badSmellMap = new Map<string, BadSmell>();
    data.byCommitHash.forEach((badSmell: BadSmell) => {
      if (!badSmellMap.has(badSmell.identifier)) {
        badSmellMap.set(badSmell.identifier, badSmell);
      }
    });
    return Array.from(badSmellMap.values()).filter((badSmell: BadSmell) => {
      return !badSmellFilter.includes(badSmell.identifier);
    });
  }, [data, badSmellFilter]);
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <LinearProgress />;
  }

  return (
    <div>
      <Typography variant="h2" align="center">
        Bad Smells
      </Typography>
      <br />
      <Box display={'flex'} flexDirection={'row'}>
        <Box display="inline-block" width={'100%'}>
          <BadSmellBlocks badSmells={filteredBadSmells} project={project} />
        </Box>
      </Box>
    </div>
  );
}

function BadSmellBlocks({
  badSmells,
  project,
}: {
  badSmells: BadSmell[];
  project: Project;
}) {
  return <>{CodeBlocks(badSmells, project)}</>;
}
function CodeBlocks(params: BadSmell[], project: Project) {
  return Array.from(groupByRuleID(params)).map((badSmell) => {
    return (
      <div key={badSmell[0].toString()}>
        <Accordion key={badSmell[0].toString()}>
          <AccordionSummary sx={{ justifyContent: 'center' }}>
            <Typography variant="h5" align="center" alignContent={'center'}>
              {badSmell[0]} {badSmell[1].length}
            </Typography>
          </AccordionSummary>
          <Divider />
          <AccordionDetails sx={{ justifyContent: 'center' }}>
            <Stack spacing={2} direction="column" alignItems={'center'}>
              {badSmell[1].map((badSmell) => {
                return (
                  <Card
                    key={badSmell.identifier}
                    sx={{
                      alignItems: 'center',
                      justifyContent: 'center',
                      alignContent: 'center',
                      width: '100%',
                    }}
                    elevation={10}
                  >
                    <BadSmellCardHeader {...badSmell} />
                    <Typography padding="10px" fontSize={18}>
                      {badSmell.messageMarkdown}
                    </Typography>
                    <JavaCodeBlock code={badSmell.snippet} />
                    <BadSmellCardFooter badSmell={badSmell} project={project} />
                    <StyledDivider
                      thickness={2}
                      color="orange"
                      orientation="horizontal"
                    />
                  </Card>
                );
              })}
            </Stack>
          </AccordionDetails>
        </Accordion>
      </div>
    );
  });
}

function createGithubLink(badSmell: BadSmell, project: Project) {
  return (
    project.projectUrl +
    '/tree/' +
    project.commitHashes[0] +
    '/' +
    badSmell.filePath +
    '#L' +
    badSmell.position.startLine
  );
}

function groupByRuleID(projects: BadSmell[]): Map<string, BadSmell[]> {
  const map = new Map();
  projects.forEach((item) => {
    const key = item.ruleID;
    const collection = map.get(key);
    if (!collection) {
      map.set(key, [item]);
    } else {
      collection.push(item);
    }
  });
  return map;
}

function BadSmellCardHeader(badSmell: BadSmell) {
  return (
    <>
      <StyledDivider thickness={2} color="orange" orientation="horizontal" />
      <Typography padding="10px" variant="h4" fontSize={24}>
        {badSmell.ruleID}
      </Typography>
      <Typography padding="10px" justifyContent={'flex-start'}>
        {badSmell.identifier}
      </Typography>
      <StyledDivider thickness={2} color="black" orientation="horizontal" />
    </>
  );
}

function BadSmellCardFooter({
  badSmell,
  project,
}: {
  badSmell: BadSmell;
  project: Project;
}) {
  return (
    <>
      <StyledDivider thickness={2} color="black" orientation="horizontal" />
      <Typography padding="10px" fontSize={18}>
        In file {badSmell.filePath} at line {badSmell.position.startLine}
      </Typography>
      {GitHubLink(badSmell, project)}
    </>
  );
}
function GitHubLink(badSmell: BadSmell, project: Project) {
  return (
    <Link
      padding="10px"
      href={createGithubLink(badSmell, project)}
      underline="hover"
    >
      See on GitHub
    </Link>
  );
}
