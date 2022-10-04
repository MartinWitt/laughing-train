import { useQuery } from "@apollo/client";
import { Stack } from "@mui/material";
import React from "react";
import { useLoaderData } from "react-router-dom";
import { sys } from "typescript";
import Headline from "../component/Headline";
import ProjectCard from "../component/ProjectCard";
import { Project } from "../data/Project";
import { fetchProjectQuery, filterDuplicates } from "../ProjectData";

export default function DashBoard() {
  const { data, loading, error } = useQuery(fetchProjectQuery);
  if (error) {
    console.error(error);
  }
  if (loading) {
    return <div>Loading...</div>;
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
  return <Stack
    justifyContent="space-evenly"
    alignItems="stretch"
    spacing={5}>
    {params.map((project) => {
      return (
        <ProjectCard {...project} />
      );
    })}
  </Stack>;
}
