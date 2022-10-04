import { useQuery } from "@apollo/client";
import { Chip } from "@mui/material";
import { Stack } from "@mui/system";
import React, { useState } from "react";
import { useNavigate } from "react-router";
import { Project } from "../data/Project";

function HashSelector(project : Project) {
  const navigate = useNavigate();
  console.log(project);
  return (
    <div>
      
            <h1>Hash Selector</h1>
            <p>Choose a hash to view the results</p>
            <div>
        Selector
        <Stack direction="row">
          {project.commitHashes.map((hash: string) => {
            return <Chip label={hash} key={hash} onClick={() =>navigate(toLink(project, hash))} variant="outlined" />;
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