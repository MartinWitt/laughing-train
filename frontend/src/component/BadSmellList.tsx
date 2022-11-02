
import { useQuery } from '@apollo/client';
import { Accordion, AccordionDetails, AccordionSummary, Box, Card, Checkbox, CircularProgress, Divider, FormControlLabel, Link, Stack, Typography } from '@mui/material';
import { BadSmell } from '../data/BadSmell';
import { Project } from "../data/Project";
import { fetchBadSmellsforHashQuery } from '../ProjectData';
import JavaCodeBlock from './JavaCodeBlock';
import React, { useMemo, useState } from 'react';

export default function BadSmellList(project: Project) {
  const [badSmellFilter, setBadSmellFilter] = useState([""]);

  const { data, error, loading } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: project.commitHashes[0]
    }
  });
  const filteredBadSmells = useMemo(() => {
    console.log(badSmellFilter);
    if (!data) {
      return [];
    }
    return data.byCommitHash.filter((badSmell: BadSmell) => {
      return !badSmellFilter.includes(badSmell.ruleID.ruleId);
    });
  }, [data, badSmellFilter]);
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <CircularProgress />
  }
  function setBadSmellFilterForRuleID(ruleID: string) {
    if (badSmellFilter.includes(ruleID)) {
      setBadSmellFilter(badSmellFilter.filter((id: string) => id !== ruleID));
    } else {
      setBadSmellFilter([...badSmellFilter, ruleID]);
    }
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
                <SelectionBox label={badSmell.ruleID.ruleId} addFunction={setBadSmellFilterForRuleID} />
                <Divider />
              </>)
            })}
          </Stack>
        </Box>
        <Box display="inline-block" width={"70%"}>
          <BadSmellBlocks badSmells={filteredBadSmells} project={project} />
        </Box>
      </ Box>
    </div>
  );
}

function SelectionBox({ label, addFunction }: { label: string; addFunction: (label: string) => void; }) {
  return (<Box>
    <FormControlLabel control={<Checkbox  />}
      defaultChecked onClick={e => { addFunction(label); }} label={label}  />
  </Box>)
}

function listOfUniqueRules(badSmells: BadSmell[]): BadSmell[] {
  const ids = badSmells.map(o => o.ruleID)
  const filtered = badSmells.filter(({ ruleID }, index) => !ids.includes(ruleID, index + 1));
  return filtered;
}
function BadSmellBlocks({ badSmells, project }: { badSmells: BadSmell[]; project: Project }) {
  return <>
    {CodeBlocks(badSmells, project)}
  </>
}
function CodeBlocks(params: BadSmell[], project: Project) {
  return Array.from(groupByRuleID(params)).map((badSmell) => {
    return (
      <div >
        <Accordion key={badSmell[0].toString()} >
          <AccordionSummary sx={{ justifyContent: "center" }} >
            <Typography variant="h5" align='center' alignContent={"center"} >{badSmell[0]} {badSmell[1].length}</Typography>
          </AccordionSummary>
          <Divider />
          <AccordionDetails sx={{ justifyContent: "center"}}>
            <Stack spacing={2} direction='column' alignItems={"center"}>
              {badSmell[1].map((badSmell) => {
                return (
                  <Card key={badSmell.id} sx={{
                    alignItems: "center",
                    justifyContent: "center",
                    alignContent: "center",
                    width: "100%",
                  }} elevation={10}>
                    <BadSmellCardHeader  {...badSmell} />
                    <Typography padding="10px" fontSize={18} >{badSmell.messageMarkdown}</Typography>
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
  return <Divider sx={{ borderBottomWidth: 5}} />;
}

function createGithubLink(badSmell: BadSmell, project: Project) {
  return project.projectUrl + "/tree/" + project.commitHashes[0] + "/" + badSmell.filePath + "#L" + badSmell.position.startLine;

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
  return (<>
    <OrangeDivider />
    <Typography padding="10px" variant='h4' fontSize={24}>{badSmell.ruleID.ruleId}</Typography>
    <Typography padding="10px" justifyContent={"flex-start"}>{badSmell.identifier}</Typography>
    <BlackDivider />  </>);
}

function BadSmellCardFooter({ badSmell, project }: { badSmell: BadSmell; project: Project; }) {
  return (<>
    <BlackDivider />
    <Typography padding="10px" fontSize={18} >In file {badSmell.filePath} at line {badSmell.position.startLine}</Typography>
    {GitHubLink(badSmell, project)}
  </>);
}
function GitHubLink(badSmell: BadSmell, project: Project) {
  return <Link padding="10px" href={createGithubLink(badSmell, project)} underline='hover'>See on GitHub</Link>;
}


function BlackDivider() {
  return (<Divider sx={{
    borderBottomWidth: 2,
  }} />);
}
