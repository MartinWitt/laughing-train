import { useQuery } from '@apollo/client';
import { Project } from '../data/Project';
import React, { useMemo } from 'react';
import ProjectTable from './ProjectTable';
import { LinearProgress } from '@mui/material';
import { recentAnalyzerRuns } from '../ProjectData';
import { AnalyzerRun } from '../data/AnalyzerRun';

export function ProjectList({ filter }: { filter: string }) {
  const { data, loading, error } = useQuery(recentAnalyzerRuns);

  const filteredProjects = useMemo(() => {
    if (!data) {
      return [];
    }
    return data.recentAnalyzerRuns.filter((analyzerRun: AnalyzerRun) => {
      return analyzerRun.projectName.toLowerCase().match(filter.toLowerCase());
    });
  }, [data, filter]);
  if (error) {
    console.error(error);
  }
  if (loading) {
    return (
      <div>
        <LinearProgress />
      </div>
    );
  }
  return <ProjectTable projects={filteredProjects} />;
}
