
import { useQuery } from '@apollo/client';
import { Accordion, AccordionDetails, AccordionSummary, CircularProgress, colors, Divider, makeStyles, Paper, Stack, Typography } from '@mui/material';
import React from 'react';
import { BadSmell } from '../data/BadSmell';
import { Project } from "../data/Project";
import { fetchBadSmellsforHashQuery, filterDuplicateBadSmells } from '../ProjectData';
import JavaCodeBlock from './JavaCodeBlock';


export default function BadSmellList(project: Project) {
  const { data, error, loading } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: project.commitHashes[0]
    }
  });
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <CircularProgress />
  }
  console.log(data.byCommitHash);
  return (
    <div>
      <Typography variant='h2' align='center'>Bad Smells</Typography>
      <br />
      <Typography  align="center"> Bad Smells for hash {project.commitHashes[0]}</Typography>
      {toCodeBlocks(filterDuplicateBadSmells(data.byCommitHash))}
    </div>
  );
}

function toCodeBlocks(params: BadSmell[]) {
 return Array.from(groupByRuleID(params)).map((badSmell) => {
    return (
     <Accordion sx={{margin:"10l"}}> 
        <AccordionSummary sx={{justifyContent:"center"}} >
          <Typography variant="h5" align='center' alignContent={"center"} >{badSmell[0]} {badSmell[1].length}</Typography>
        </AccordionSummary>
        <Divider />
        <AccordionDetails sx={{ justifyContent: "center", backgroundColor:"#111135" }}>
        <Stack spacing={2} direction='column' alignItems={"center"}>
          {badSmell[1].map((badSmell) => {
            return (
              <Paper key={badSmell.id} sx={{
                alignItems: "center",
                justifyContent: "center",
                alignContent: "center",
              color: "#282a36", backgroundColor: "#282a36",
              width: "70%",
              boxShadow: "4px 4px 4px rgba(0, 0, 0, 0.25)",
              borderRadius: "25px",
            }} elevation={10} color='#282a36'>
              <h3>
                <Typography align='center' color={"#ffb86c"} fontSize={24}>{badSmell.ruleID}</Typography>
              </h3>
              <Typography fontSize={18} style={{ color: "#8be9fd" }} >{badSmell.messageMarkdown}</Typography>
              <br />
              <Divider color='#ffb86c' />
              <br />
              <Typography fontSize={18} style={{ color: "#8be9fd" }} >In file {badSmell.filePath}</Typography>
              <br />
              <Divider color='#ffb86c' />
              <br />
              <JavaCodeBlock code={badSmell.snippet} />
              <br />
            </Paper>
            );
          })}
          </Stack>
        </AccordionDetails>
      </Accordion>
    )
  });
}

function groupByRuleID(projects: BadSmell[]) : Map<string, BadSmell[]> {
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
