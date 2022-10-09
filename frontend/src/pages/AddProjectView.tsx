import { useMutation } from "@apollo/client";
import { Alert, Button, Divider, Paper, TextField, Typography } from "@mui/material";
import React, { useState } from "react";
import { useNavigate } from "react-router";
import Headline from "../component/Headline";
import { addprojectQuery } from "../ProjectData";


export function AddProjectView() {
  const nagivate = useNavigate();
  const [url, setUrl] = useState("");
  const [projectname, setProjectName] = useState("");
  const [owner, setOwner] = useState("");
  const onUserInput = (event: React.ChangeEvent<HTMLInputElement>) => {
    setUrl(event.target.value);
    const stringArray = urlToGitHubHandle(event.target.value);
    setOwner(stringArray[0]);
    setProjectName(stringArray[1]);
  }
  const [addProject, { loading, data } ] = useMutation(addprojectQuery, {
    variables: {
      projectName: projectname,
      projectUrl: url,
    }
  });
  return (
    <div>
      <Headline />
      <br />
      <Paper sx={{ alignSelf: "center", justifyContent: "center", padding:"30px",margin:"10px" }} >
        <Typography variant="h3">
          Add Project
        </Typography>
        <br/>
        <TextField variant="outlined"  id="github-url" label="Github Url" required onInput={onUserInput} fullWidth></TextField>
        <Divider sx={{ marginTop: "40px", marginBottom:"40px" }} />
        <Typography variant="h5">Result of parsing:</Typography>
        <br />
        <Typography>ProjectOwner {owner}</Typography>
        <Typography>ProjectName: {projectname}</Typography>
        <Divider sx={{ marginTop: "40px", marginBottom: "40px" }} />
        <Button variant="contained" sx={{ marginLeft: "10px" }} onClick={() =>nagivate("/")}>Cancel</Button>
        <Button variant="contained" onClick={() => addProject()}>Save</Button>
        {loading && <Typography>Loading...</Typography>}
        {data && <Alert severity="success">Project added</Alert>}
      </Paper>
    </div>);
}
function urlToGitHubHandle(params: string): string[] {
  const stringArray: string[] = [];
  if (params === undefined) {
    return [];
  }
  let url = params.split("/");
  // the first pop return the projectname
  const owner = url.pop();
  if (owner !== undefined) {
    stringArray.push(owner);
  } else {
    stringArray.push("");
  }
  const name = url.pop();
  if (name !== undefined) {
    stringArray.push(name);
  } else {
    stringArray.push("");
  }
  return stringArray;
}