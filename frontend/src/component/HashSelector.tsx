import { Chip, Grid, Typography } from "@mui/material";
import React from "react";
import { useNavigate } from "react-router";
import { Project } from "../data/Project";

function HashSelector(project : Project) {
  const navigate = useNavigate();
  console.log(project);

  return (
    <div>

      <Typography align="center" alignContent={"center"} variant="h2">Hash Selector</Typography>  
      <Typography align="center" alignContent={"center"}>Choose a hash to view the results</Typography> 
      <div><br/>
        <Grid direction="row" container>
          {project.commitHashes.map((hash: string) => {
            return <Chip label={hash} key={hash} onClick={() => navigate(toLink(project, hash))} />;
        })}
        </Grid>
            </div>
          </div>
        );
    }


export default HashSelector;

function toLink(project: Project, hash: string): string {
  return "/resultview/" + project.projectName+"/"+ hash;
}