import { useQuery } from '@apollo/client';
import { fetchProjectQuery } from '../ProjectData';
import { Project } from '../data/Project';
import React, { useMemo } from 'react';
import ProjectTable from './ProjectTable';
import {LinearProgress} from "@mui/material";

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
    return <div><LinearProgress /></div>;
  }
  return <ProjectTable projects={filteredProjects} />;
}
