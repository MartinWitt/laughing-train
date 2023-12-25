import PageLayout from './PageLayout';
import {
  Box,
  Breadcrumbs,
  LinearProgress,
  Link,
  Table,
  TableCell,
  TableHead,
  Typography,
} from '@mui/material';
import { useRecentRunsQuery } from '../gql/graphql-types';
import { Error } from '@mui/icons-material';
import React from 'react';

export function LiveViewPage() {
  const { data, loading, error } = useRecentRunsQuery({});
  if (loading || error) {
    return (
      <>
        <Breadcrumbs aria-label="breadcrumb">
          <Link color="inherit" href="/">
            Home
          </Link>
          <Typography color="textPrimary">LiveView</Typography>
        </Breadcrumbs>
        <LinearProgress sx={{ paddingTop: '5px' }} />
      </>
    );
  }
  if (!data?.recentRuns || data.recentRuns.length === 0) {
    return (
      <PageLayout>
        <Breadcrumbs aria-label="breadcrumb" sx={{ paddingTop: '5px' }}>
          <Link color="inherit" href="/">
            Home
          </Link>
          <Typography color="textPrimary">LiveView</Typography>
        </Breadcrumbs>
        <Box
          sx={{
            display: 'flex',
            flexDirection: 'row',
            alignItems: 'center',
            paddingTop: '5px',
          }}
        >
          <Error />
          <Typography variant="h5" color={'white'}>
            No Data found
          </Typography>
        </Box>
      </PageLayout>
    );
  }
  return (
    <PageLayout>
      <Breadcrumbs aria-label="breadcrumb" sx={{ paddingTop: '10px' }}>
        <Link color="inherit" href="/">
          Home
        </Link>
        <Typography color="textPrimary">LiveView</Typography>
      </Breadcrumbs>
      <Table>
        <TableHead>
          <TableCell>Project</TableCell>
          <TableCell>Commit</TableCell>
          <TableCell>Analyzer</TableCell>
          <TableCell>Number of Issues</TableCell>
          <TableCell>Status</TableCell>
          <TableCell>Timestamp</TableCell>
        </TableHead>
      </Table>
    </PageLayout>
  );
}
