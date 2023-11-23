import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
  useTheme,
} from '@mui/material';
import { Project } from '../data/Project';
import { AnalyzerStatus } from '../data/AnalyzerStatus';
import { useState } from 'react';
import {
  DateTimeFormatter,
  Duration,
  LocalDateTime,
  TemporalAccessor,
  ZoneOffset,
} from '@js-joda/core';

interface ProjectTableProps {
  projects: Project[];
}

function ProjectTable(props: ProjectTableProps) {
  const { projects } = props;
  const [sortConfig, setSortConfig] = useState<{
    key: string;
    direction: string;
  }>({ key: 'analyzerDate', direction: 'descending' });

  const sortedProjects = projects.sort((a, b) => {
    const aStatus = getSpoonAnalyzerResult(a);
    const bStatus = getSpoonAnalyzerResult(b);
    if (aStatus === undefined && bStatus !== undefined) {
      return 1;
    }
    if (aStatus !== undefined && bStatus === undefined) {
      return -1;
    }
    if (sortConfig.direction === 'ascending') {
      if (sortConfig.key === 'projectUrl') {
        return a[sortConfig.key] > b[sortConfig.key] ? 1 : -1;
      }
      if (sortConfig.key === 'analyzerDate') {
        if (aStatus && bStatus) {
          return aStatus.localDateTime > bStatus.localDateTime ? 1 : -1;
        }
        return 0;
      }
      if (sortConfig.key === 'resultCount') {
        if (aStatus && bStatus) {
          return aStatus.numberOfIssues > bStatus.numberOfIssues ? 1 : -1;
        }
        return 0;
      }
    }
    if (sortConfig.direction === 'descending') {
      if (sortConfig.key === 'projectUrl') {
        return a[sortConfig.key] < b[sortConfig.key] ? 1 : -1;
      }
      if (sortConfig.key === 'analyzerDate') {
        if (aStatus && bStatus) {
          return aStatus.localDateTime < bStatus.localDateTime ? 1 : -1;
        }
        return 0;
      }
      if (sortConfig.key === 'resultCount') {
        if (aStatus && bStatus) {
          return aStatus.numberOfIssues < bStatus.numberOfIssues ? 1 : -1;
        }
        return 0;
      }
    }
    return 0;
  });

  const requestSort = (key: string) => {
    let direction = 'ascending';
    if (sortConfig.key === key && sortConfig.direction === 'ascending') {
      direction = 'descending';
    }
    setSortConfig({ key, direction });
  };

  return (
    <TableContainer sx={{ overflow: 'hidden' }}>
      <Table>
        <TableHead sx={{ fontSize: 'Medium' }}>
          <TableRow>
            <SortableTableCell
              label="Project"
              sortConfig={sortConfig}
              requestSort={requestSort}
              sortKey="projectUrl"
            />
            <SortableTableCell
              label="Time since run"
              sortConfig={sortConfig}
              requestSort={requestSort}
              sortKey="analyzerDate"
            />
            <SortableTableCell
              label="Number of Results"
              sortConfig={sortConfig}
              requestSort={requestSort}
              sortKey="resultCount"
            />
          </TableRow>
        </TableHead>
        <TableBody>
          {sortedProjects.map((project) => tableCell(project))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}

interface SortableTableCellProps {
  label: string;
  sortConfig: { key: string; direction: string };
  requestSort: (key: string) => void;
  sortKey: string;
}

function tableCell(project: Project) {
  const status = getSpoonAnalyzerResult(project);
  if (status === undefined) {
    return <></>;
  }
  return (
    <TableRow
      key={project.projectUrl}
      onClick={() => (window.location.href = toLink(project))}
    >
      <TableCell>{project.projectUrl}</TableCell>
      <TableCell>{toDateTime(status.localDateTime)}</TableCell>
      <TableCell>{status.numberOfIssues}</TableCell>
    </TableRow>
  );
}

function SortableTableCell(props: SortableTableCellProps) {
  const { label, sortConfig, requestSort, sortKey } = props;
  const isSorted = sortConfig.key === sortKey;
  const direction = isSorted ? sortConfig.direction : 'none';
  const theme = useTheme();

  return (
    <TableCell
      onClick={() => requestSort(sortKey)}
      style={{
        fontWeight: 'bold',
        fontSize: '16px',
        color: 'white',
        backgroundColor: theme.palette.secondary.main,
      }}
    >
      {label}
      {isSorted && <span>{direction === 'ascending' ? ' ▲' : ' ▼'}</span>}
    </TableCell>
  );
}

export default ProjectTable;

function getSpoonAnalyzerResult(project: Project): AnalyzerStatus | undefined {
  if (project.commits.length === 0) {
    return undefined;
  }
  const lastCommit = project.commits[project.commits.length - 1];
  if (
    lastCommit.analyzerStatuses === undefined ||
    lastCommit.analyzerStatuses === null
  ) {
    return undefined;
  }
  return lastCommit.analyzerStatuses.find(
    (status) => status.analyzerName === 'spoon-analyzer'
  );
}

function toDateTime(date: string) {
  const formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
  const parsedDate: TemporalAccessor = formatter.parse(date);
  const localDateTime = LocalDateTime.from(parsedDate);
  const now = LocalDateTime.now(ZoneOffset.UTC);
  const duration = Duration.between(localDateTime, now);
  const hours = duration.toHours();
  return <Typography>{hours} hours ago</Typography>;
}

function toLink(project: Project): string {
  return '/resultview/' + project.projectName;
}
