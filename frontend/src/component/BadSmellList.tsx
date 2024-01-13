import { useQuery } from '@apollo/client';
import {
  Accordion,
  AccordionDetails,
  AccordionSummary,
  Box,
  Card,
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
import { AppLoadingBar } from './AppLoadingBar';

export default function BadSmellList({ project, hash }: BadSmellListProps) {
  const [badSmellFilter] = useState(['']);

  const { data, error, loading } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: hash,
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
    return <AppLoadingBar />;
  }

  return (
    <div>
      <Typography variant="h3" align="center" margin={2}>
        Bad Smells
      </Typography>
      <br />
      <Box display={'flex'} flexDirection={'row'}>
        <Box display="inline-block" width={'100%'}>
          <BadSmellBlocks
            badSmells={filteredBadSmells}
            project={project}
            hash={hash}
          />
        </Box>
      </Box>
    </div>
  );
}

function BadSmellBlocks({
  badSmells,
  project,
  hash,
}: {
  badSmells: BadSmell[];
  project: Project;
  hash: string;
}) {
  return <>{CodeBlocks(badSmells, project, hash)}</>;
}
function CodeBlocks(params: BadSmell[], project: Project, hash: string) {
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
                    <BadSmellCardFooter
                      badSmell={badSmell}
                      project={project}
                      hash={hash}
                    />
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

function createGithubLink(badSmell: BadSmell, project: Project, hash: string) {
  return (
    project.projectUrl +
    '/tree/' +
    hash +
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
  hash,
}: {
  badSmell: BadSmell;
  project: Project;
  hash: string;
}) {
  return (
    <>
      <StyledDivider thickness={2} color="black" orientation="horizontal" />
      <Typography padding="10px" fontSize={18}>
        In file {badSmell.filePath} at line {badSmell.position.startLine}
      </Typography>
      {GitHubLink(badSmell, project, hash)}
    </>
  );
}
function GitHubLink(badSmell: BadSmell, project: Project, hash: string) {
  return (
    <Link
      padding="10px"
      href={createGithubLink(badSmell, project, hash)}
      underline="hover"
    >
      See on GitHub
    </Link>
  );
}
interface BadSmellListProps {
  project: Project;
  hash: string;
}
