import { useQuery } from "@apollo/client";
import { CircularProgress, Grid, Stack } from "@mui/material";
import React from "react";
import { DashBoardCard } from "../component/DashBoardCard";
import Headline from "../component/Headline";
import { Project } from "../data/Project";
import { fetchProjectQuery, filterDuplicates } from "../ProjectData";

export default function DashBoard() {
  const { data, loading, error } = useQuery(fetchProjectQuery);
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
      {toBlock(toProps(data.getProjects))}
    </div>
  );
}


function toProps(params: Project[]): ProjectListProps {
  return {
    projects: filterDuplicates(params)
  }
}


type ProjectListProps = {
  projects: Project[];
}

function toBlock(params: ProjectListProps): JSX.Element {
  return (
    projectList(params.projects)
  )
}
  
function projectList(params: Project[]) {
  return <Grid
    container
    alignItems="stretch"
    spacing={5}>
    {params.map((project) => {
      return (
        <Grid item> 
          <DashBoardCard {...project} />
          </Grid>
      );
    })}
  </Grid>;
}
