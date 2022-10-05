import { useQuery } from "@apollo/client";
import { Chip, Paper, Typography } from "@mui/material";
import { Stack } from "@mui/system";
import React, { useState } from "react";
import { useNavigate } from "react-router";
import { Project } from "../data/Project";

function HashSelector(project : Project) {
  const navigate = useNavigate();
  console.log(project);

  return (
    <div>
      <Paper sx={{
        color: "#282a36", backgroundColor: "#282a36", width: "70%",
        justifyContent: "center",
        alignItems: "center",
        textAlign: "center",
        verticalAlign: "middle",
        boxShadow: "4px 4px 4px rgba(0, 0, 0, 0.25)",
        borderRadius: "25px",
        }} elevation={10} >
        <h1>Hash Selector</h1>
      <Typography color={"#8be9fd"} alignContent={"center"}>Choose a hash to view the results</Typography> 
      </Paper>
      <div><br/>
        <Stack direction="row">
          {project.commitHashes.map((hash: string) => {
            return <Chip label={hash} key={hash} onClick={() => navigate(toLink(project, hash))} variant="outlined" sx={{ color:"#8be9fd"} } />;
        })}
        </Stack>
            </div>
          </div>
        );
    }


export default HashSelector;

function toLink(project: Project, hash: string): string {
  return "/resultview/" + project.projectName+"/"+ hash;
}