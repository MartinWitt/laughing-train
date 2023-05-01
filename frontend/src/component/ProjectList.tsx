import { useQuery } from "@apollo/client";
import { Stack } from "@mui/material";
import { fetchProjectQuery } from "../ProjectData";
import { Project } from "../data/Project";
import DashBoardItem from "./DashBoardItem";
import React, { useMemo } from "react";


export function ProjectList({ filter }: { filter: string }) {

  const { data, loading, error } = useQuery(fetchProjectQuery);

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
    return <div>Loading...</div>;
  }
  
  return <Stack
    alignItems="stretch"
    spacing={5}>
    {filteredProjects.map((project : Project) => {
      return (
        <DashBoardItem key={project.projectUrl} {...project} />
      );
    })}
  </Stack>;
}