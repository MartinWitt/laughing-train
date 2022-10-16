
import { useQuery } from '@apollo/client';
import { Accordion, AccordionDetails, AccordionSummary, Box, Card, Checkbox, CircularProgress, Divider, Link, Stack, Typography } from '@mui/material';
import { BadSmell } from '../data/BadSmell';
import { Project } from "../data/Project";
import { fetchBadSmellsforHashQuery, filterDuplicateBadSmells } from '../ProjectData';
import JavaCodeBlock from './JavaCodeBlock';
import React, { useState } from 'react';

export default function BadSmellList(project: Project) {
  const [badSmellFilter, setBadSmellFilter] = useState([""]);
  const [badSmells, setBadSmell] = useState<BadSmell[]>([]);
  
  const { data, error, loading } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: project.commitHashes[0]
    }, onCompleted: (data) => {
      setBadSmell(filterDuplicateBadSmells(data.byCommitHash));
    }
  });
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <CircularProgress />
  }
  function name(label: string) {
    setBadSmellFilter(addIfMissingRemoveIfPresent(badSmellFilter, label));
    console.log(badSmellFilter);
  }
  return (
    <div>
      <Typography variant='h2' align='center'>Bad Smells</Typography>
      <br />
      <Typography align="center"> Bad Smells for hash {project.commitHashes[0]}</Typography>
      <Box display={"flex"} flexDirection={"row"} >
        <Box display="inline-block" width={"20%"} border={2}>
          <Typography variant='h4' align='center'>Filter</Typography>
          <Divider />
          <Stack>
            {listOfUniqueRules(data.byCommitHash).map((badSmell) => {
              return (<>
                
                <SelectionBox label={badSmell.ruleID} addFunction={name} badSmells={badSmells} setBadSmellFunction={setBadSmell} />
                <Divider />
                </>)
            })}
            </Stack>
        </Box>
        <Box display="inline-block" width={"70%"}>
          {toCodeBlocks(filterDuplicateBadSmells(badSmells), project)}
      </Box>
      </ Box>
    </div>
  );
}
function addIfMissingRemoveIfPresent(array: string[], value: string) {
  if (array.includes(value)) {
    array.splice(array.indexOf(value), 1);
  } else {
    array.push(value);
  }
  return array;
}
function SelectionBox({ label, addFunction, badSmells, setBadSmellFunction }: { label: string; addFunction: (label: string) => void; badSmells:BadSmell[]; setBadSmellFunction: (badSmell: BadSmell[]) => void; }) {
  return (<Box>
    <Typography>{label}</Typography>
    <Checkbox defaultChecked onClick={e => { addFunction(label); setBadSmellFunction(removeWithId(badSmells, label)) }} />
  </Box>)
}
function removeWithId(badSmells: BadSmell[], id: string) {
  console.log("HI" + badSmells.length)
  var test = badSmells.filter((badSmell) => {
    return id != badSmell.ruleID;
  });
  console.log(badSmells.length)
  return test;
}
function listOfUniqueRules(badSmells: BadSmell[]): BadSmell[] {
  const ids = badSmells.map(o => o.ruleID)
  const filtered = badSmells.filter(({ ruleID }, index) => !ids.includes(ruleID, index + 1));
  return filtered;
}
function toCodeBlocks(params: BadSmell[], project: Project) {
  console.log(params.filter((badSmell) => badSmell.ruleID === "NonStrictComparisonCanBeEquality"));
 return Array.from(groupByRuleID(params)).map((badSmell) => {
   return (
      <div >
     <Accordion > 
        <AccordionSummary sx={{justifyContent:"center"}} >
          <Typography variant="h5" align='center' alignContent={"center"} >{badSmell[0]} {badSmell[1].length}</Typography>
        </AccordionSummary>
        <Divider />
        <AccordionDetails sx={{ justifyContent: "center", backgroundColor:"#111135" }}>
        <Stack spacing={2} direction='column' alignItems={"center"}>
            {badSmell[1].map((badSmell) => {
              return (
                <Card key={badSmell.id} sx={{
                  alignItems: "center",
                  justifyContent: "center",
                  alignContent: "center",
                  color: "#282a36", backgroundColor: "#282a36",
                  width: "70%",
              }} elevation={10} color='#282a36'>
              <BadSmellCardHeader  {...badSmell}   />
              <Typography padding="10px"  fontSize={18} style={{ color: "#8be9fd" }} >{badSmell.messageMarkdown}</Typography>
              <JavaCodeBlock code={badSmell.snippet} />
              <BadSmellCardFooter badSmell={badSmell} project={project} />
              <OrangeDivider />
            </Card>
            );
          })}
          </Stack>
        </AccordionDetails>
       </Accordion>
     </div>
    )
  });
}
function OrangeDivider() {
  return <Divider sx={{ borderBottomWidth: 5, borderBlockColor: '#FFA500' }} />;
}

function createGithubLink(badSmell:BadSmell, project:Project) {
  return project.projectUrl + "/tree/" + project.commitHashes[0] +"/"+ badSmell.filePath+"#L"+badSmell.startLine;
  
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

function BadSmellCardHeader(badSmell: BadSmell) {
  return (<>
    <OrangeDivider />
    <Typography padding="10px" variant='h4' color={"#ffb86c"} fontSize={24}>{badSmell.ruleID}</Typography>
    <Typography color={"#8be9fd"} padding="10px" justifyContent={"flex-start"}> Qodana | {badSmell.id}</Typography>
    <BlackDivider/>  </>);
}

function BadSmellCardFooter({ badSmell, project }: { badSmell: BadSmell; project: Project; }) {
  return (<>
    <BlackDivider />
    <Typography padding="10px" fontSize={18} style={{
      color: "#8be9fd"
    }}>In file {badSmell.filePath} at line {badSmell.startLine}</Typography>
    {GitHubLink(badSmell, project)}
  </>);
}
function GitHubLink(badSmell: BadSmell, project: Project) {
  return <Link padding="10px" href={createGithubLink(badSmell, project)} underline='hover' color='#ffb86c'>See on GitHub</Link>;
}


    function BlackDivider() {
      return (<Divider sx={{
  borderBottomWidth: 2,
  borderBlockColor: '#282A36'
}} />);
    }
