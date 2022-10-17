import { useQuery } from "@apollo/client";
import { Box, Button, Card, CardActionArea, CircularProgress, Grid, Stack, TextField, Typography } from "@mui/material";
import React, { useMemo } from "react";
import Avatar from "react-avatar";
import { useNavigate } from "react-router";
import Headline from "../component/Headline";
import { Project } from "../data/Project";
import { fetchProjectQuery } from "../ProjectData";

export default function DashBoard() {
  const { data, loading, error } = useQuery(fetchProjectQuery);
  const navigate = useNavigate();
  const [filter, setFilter] = React.useState("");
  const filteredProjects = useMemo(() => {
    if (!data) {
      return [];
    }
    return data.getProjects.filter((project: Project) => {
      return project.projectName.toLowerCase().match(filter.toLowerCase());
    });
  }, [data, filter]);
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <CircularProgress />;
  }
  return (
    <div>
      <Headline />
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
          <ProjectList projects={filteredProjects} />
          </Grid>
        <Grid item xs={1} marginLeft={"5%"}>
              <Button onClick={() => navigate("/mutation/addproject")} variant="contained" >Add Project</Button>
          </Grid>
      </Grid>
    </div>
  );
}

 
function ProjectList({ projects }: { projects: Project[] }) {
  return <Stack
    alignItems="stretch"
    spacing={5}>
    {projects.map((project) => {
      return (
          <DashBoardItem {...project} />
      );
    })}
  </Stack>;
}

function DashBoardItem(project: Project) {
  const navigate = useNavigate();
  return <>
    <Card sx={{ display: "flex", flexDirection: "row", width:"100%"}}>
      <CardActionArea onClick={() => navigate(toLink(project))}>
        <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} />
        <Box marginLeft={5} marginRight={"auto"} display={"inline-block"}>
          <Typography variant="h5" component="div">{project.projectName} </ Typography>
          <Typography variant="body1" component="div">{project.projectUrl} </ Typography>
        </Box>
        <Box marginLeft={5}   display={"inline-block"} alignSelf={"flex-end"}>
          <Typography variant="body1" >{project.commitHashes.length} Commits</ Typography>
        </Box>
      </CardActionArea>
    </Card>
  </>
}
function toLink(project: Project): string {
  return "/resultview/" + project.projectName;
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