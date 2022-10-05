import {Card, CardActionArea, CardContent, Chip, Stack, Typography } from "@mui/material";
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
      color: "#282a36", backgroundColor: "#282a36", width: "70%", display: "flex",
      justifyContent: "center",
      alignItems: "center",
      textAlign: "center",
      verticalAlign: "middle",
      boxShadow: "4px 4px 4px rgba(0, 0, 0, 0.25)",
      borderRadius: "25px"
    }} onClick={() => navigate(toLink(project))} color="#44475a">
      <CardActionArea>
        <CardContent>
          <Stack alignSelf="center" direction="row" spacing={5} alignItems="stretch" justifyContent="space-evenly">
            <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} size="80" round={true}/>
            <Typography color={"#8be9fd"} fontSize={40} gutterBottom variant="h5" component="div">{urlToGitHubHandle(project.projectUrl)}/{project.projectName}</Typography>
            <Chip label="To source code" component="a" href={project.projectUrl} clickable sx={{ color:"#8be9fd", height:"80", width:"80"}} />
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