import {Button, Card, CardActionArea, CardContent, Stack, Typography } from "@mui/material";
import React from "react";
import Avatar from "react-avatar";
import { useNavigate } from "react-router-dom";
import { Project } from "../data/Project";

class ProjectCard extends React.Component<Project> {

  render() {
    return (
      <div>
        <ProjectListItem {...this.props} />
      </div>

    );
  }
}

function ProjectListItem(project: Project) {
  const navigate = useNavigate();
  return <>
    <Card elevation={10} sx={{
      display: "flex",
      verticalAlign: "middle",
      boxShadow: "4px 4px 4px rgba(0, 0, 0, 0.25)",
    }} onClick={() => navigate(toLink(project))}>
      <CardActionArea>
        <CardContent sx={{}}>
          <Stack alignSelf="center" direction="row" spacing={5} alignItems="normal" justifyContent="space-evenly">
            <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} size="100"/>
            <Typography textAlign="center"  fontSize={40} variant="h5" component="div">{urlToGitHubHandle(project.projectUrl)}<br/>{project.projectName}</Typography>
            <Button variant="contained" href={project.projectUrl}>To source code</Button>
          </Stack>
        </CardContent>
      </CardActionArea>
    </Card>
    <br />
  </>;
}
function urlToGitHubHandle(params: string) {
  if (params === undefined) {
    return "";
  }
  let url = params.split("/");
  // the first pop return the projectname
  url.pop()
  return url.pop();
}
export default ProjectCard;

function toLink(project: Project) : string{
  return "/resultview/" + project.projectName;
}