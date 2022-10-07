import { CardActionArea, Card, CardMedia, CardContent, Typography } from "@mui/material";
import Avatar from "react-avatar";
import { Project } from "../data/Project";
import React from "react";
import { useNavigate } from "react-router";

export function DashBoardCard(project: Project) {
  const navigate = useNavigate();
  return (
    <CardActionArea onClick={() => navigate(toLink(project))}>
      <Card elevation={10}>
        <CardMedia sx={{justifyContent: "center", display: "flex" }} >
          <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} />
        </CardMedia>
        <CardContent >
          <Typography fontSize={40} className={project.projectName} variant={'h2'}>
            {project.projectName}
          </Typography>
          <Typography align="center" className={urlToGitHubHandle(project.projectUrl)}>{urlToGitHubHandle(project.projectUrl)}</Typography>
        </CardContent>
      </Card>
    </CardActionArea>
  );
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
function toLink(project: Project): string {
  return "/resultview/" + project.projectName;
}