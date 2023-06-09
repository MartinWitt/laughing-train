import { Button, Grid, TextField, Typography } from "@mui/material";
import React from "react";
import { useNavigate } from "react-router";
import Headline from "../component/Headline";
import { ProjectList } from "../component/ProjectList";

export default function DashBoard() {
  const navigate = useNavigate();

  const [filter, setFilter] = React.useState("");

  return (
    <div>
      <br />
      <Grid
        container
        marginLeft={"5%"}
      >
        <Grid item xs={2} >
          <Typography variant="h4"> Search</Typography>
          <br />
          <TextField label="Filter" value={filter} onChange={(e) => setFilter(e.target.value)} />
          </Grid>
        <Grid item xs={7}>
          <ProjectList filter={filter} />
          </Grid>
        <Grid item xs={1} marginLeft={"5%"}>
              <Button onClick={() => navigate("/mutation/addproject")} variant="contained" >Add Project</Button>
          </Grid>
      </Grid>
    </div>
  );
}