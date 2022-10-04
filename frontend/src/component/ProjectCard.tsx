import {Card, CardActionArea, CardContent, Chip, Stack, Typography } from "@mui/material";
import React from "react";
import Avatar from "react-avatar";
import { HashRouter, Link, Route, useNavigate } from "react-router-dom";
import { Project } from "../data/Project";
class ProjectCard extends React.Component<Project> {


  render() {
    return (
      <div>
        <ProjectListItem {...this.props}  />
      </div>

    );
  }
}
function ProjectListItem(project: Project) {
  const navigate = useNavigate();
  return <>
    <Card elevation={10} sx={{ width: "60%", alignContent: "center" }} onClick={() => navigate(toLink(project))}>
      <CardActionArea>
        <CardContent>
          <Stack alignSelf="center" direction="row" spacing={5} alignItems="stretch" justifyContent="space-evenly">
            <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} size="50" round={true} />
            <Typography gutterBottom variant="h5" component="div">{project.projectName}</Typography>
            <Chip label="To source code" component="a" href={project.projectUrl} clickable />
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