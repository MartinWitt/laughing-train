import { Chip, Grid, Typography } from "@mui/material";
import React, { useState } from "react";
import { useNavigate } from "react-router";
import { Project } from "../data/Project";

function HashSelector(project : Project) {
  const navigate = useNavigate();
  const [selectedHash, setSelectedHash] = useState("")
  return (
    <div>

      <Typography align="center" alignContent={"center"}>Choose a hash to view the results</Typography> 
      <div><br/>
        <Grid direction="row" container spacing={1} alignItems="stretch" justifyContent="flex-start" >
          {project.commitHashes.map((hash: string) => {
            if (hash === selectedHash) {
              return <Grid item key={hash}>  <Chip variant="outlined" label={hash} onClick={selectHashClick(hash)} sx={{justifyContent: "stretch", backgroundColor: "primary.main"}} /> </Grid>;
            }
            return <Grid item key={hash}>  <Chip label={hash} onClick={selectHashClick(hash)} sx={{justifyContent: "stretch", fontFamily: "monospace"}} /> </Grid>;
        })}
        </Grid>
            </div>
          </div>
        );

  function selectHashClick(hash: string): React.MouseEventHandler<HTMLDivElement> | undefined {
    return () => {
      setSelectedHash(hash);
      navigate(toLink(project, hash));
    };
  }
    }


export default HashSelector;

function toLink(project: Project, hash: string): string {
  return "/resultview/" + project.projectName+"/"+ hash;
}
