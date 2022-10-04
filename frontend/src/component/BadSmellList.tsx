
import { useQuery } from '@apollo/client';
import { colors, Divider, Paper, Typography } from '@mui/material';
import React from 'react';
import { ReactMarkdown } from 'react-markdown/lib/react-markdown';
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
    return <div>Loading...</div>
  }
  console.log(data.byCommitHash);
  return (
    <div>
      <h1>Bad Smells</h1>
      <p>Bad Smells for hash {project.commitHashes[0]}</p>
      <div>
        {toCodeBlocks(filterDuplicateBadSmells(data.byCommitHash))}
      </div>
    </div>
  );
}

function toCodeBlocks(params:BadSmell[]) {
 return params.map((badSmell: BadSmell) => {
   return <Paper key={badSmell.id} sx={{ width: "70%", backgroundColor:"#282a36" }} elevation={10} color='#282a36'>
      <h3>
       <Typography align='center' color={"#ffb86c"} fontSize={24}>{badSmell.ruleID}</Typography>
     </h3>
     <Typography fontSize={18} style={{ color: "#8be9fd" }} >{badSmell.messageMarkdown}</Typography>
     <br />
     <Divider color='#ffb86c' />
     <JavaCodeBlock code={badSmell.snippet} />
     <br/>
    </Paper>
  });
}