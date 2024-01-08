import PageLayout from './PageLayout';
import {
  Box,
  LinearProgress,
  Paper,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from '@mui/material';
import { Error } from '@mui/icons-material';
import { GetProjectsQuery, useGetProjectsQuery } from '../gql/graphql-types';
import Avatar from 'react-avatar';
import React from 'react';
import AppBreadcrumbs from '../component/StyledBreadCrumb';

const breadcrumbItems = [
  { text: 'Statistics', href: '/statistics' },
  { text: 'Organizations' },
];

type OrgStats = {
  name: string;
  projectCount: number;
  commitCount: number;
};
type OrgData = {
  [key: string]: OrgStats;
};

function calculateOrganizationStats(data: GetProjectsQuery): OrgData {
  const organizations: OrgData = {};
  data.getProjects!.forEach((project) => {
    const urlParts = project!.projectUrl!.split('/');
    const owner = urlParts[urlParts.length - 2];
    let commitCount = project!.commits?.length || 0;
    if (!organizations[owner]) {
      organizations[owner] = {
        name: owner,
        projectCount: 0,
        commitCount: 0,
      };
    }
    organizations[owner].projectCount += 1;
    organizations[owner].commitCount += commitCount;
  });
  return organizations;
}

type OrgStatsTableProps = {
  organizations: OrgData;
};

function OrgStatsTable(props: OrgStatsTableProps) {
  let { organizations } = props;
  return (
    <TableContainer component={Paper}>
      <Table aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>Organization</TableCell>
            <TableCell align="right">Project Count</TableCell>
            <TableCell align="right">Commit Count</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {Object.values(organizations).map((org) => (
            <TableRow key={org.name}>
              <TableCell component="th" scope="row">
                <Avatar
                  githubHandle={org.name}
                  alt={org.name}
                  size={'50'}
                  style={{ marginRight: '10px' }}
                />
                {org.name}
              </TableCell>
              <TableCell align="right">{org.projectCount}</TableCell>
              <TableCell align="right">{org.commitCount}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}

function ErrorComponent() {
  return (
    <PageLayout>
      <AppBreadcrumbs items={breadcrumbItems} />
      <Box padding="5px" display="flex" flexDirection="row" alignItems="center">
        <Error />
        <Typography variant="h5">No Data found </Typography>
      </Box>
    </PageLayout>
  );
}

export function OrganizationStatisticPage() {
  const { loading, error, data } = useGetProjectsQuery();
  if (loading) {
    return (
      <PageLayout>
        <AppBreadcrumbs items={breadcrumbItems} />
        <LinearProgress />
      </PageLayout>
    );
  }
  if (error) {
    return <ErrorComponent />;
  }
  if (!data || data.getProjects?.length === 0) {
    return <ErrorComponent />;
  }
  const organizations = calculateOrganizationStats(data);

  return (
    <PageLayout>
      <AppBreadcrumbs items={breadcrumbItems} />
      <OrgStatsTable organizations={organizations} />
    </PageLayout>
  );
}
