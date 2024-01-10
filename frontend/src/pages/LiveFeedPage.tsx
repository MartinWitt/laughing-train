import PageLayout from './PageLayout';
import {
  Box,
  LinearProgress,
  Link,
  Table,
  TableBody,
  TableCell,
  TableHead,
  TableRow,
  Typography,
} from '@mui/material';
import { useRecentRunsQuery } from '../gql/graphql-types';
import { Error } from '@mui/icons-material';
import React from 'react';
import AppBreadcrumbs from '../component/AppBreadcrumbs';
import { DateTimeFormatter, LocalDateTime } from '@js-joda/core';
import { useNavigate } from 'react-router-dom';

const breadcrumbItems = [{ text: 'Home', href: '/home' }, { text: 'LiveFeed' }];

function generateKeys(
  projectUrl: string | null | undefined,
  timestamp: string | null | undefined,
  analyzerName: string | null | undefined
) {
  return `${projectUrl ?? ''}_${timestamp ?? ''}_${analyzerName ?? ''}`;
}

export function LiveFeedPage() {
  const { data, loading, error } = useRecentRunsQuery({});
  console.log(error);
  if (loading || error) {
    return (
      <PageLayout>
        <AppBreadcrumbs items={breadcrumbItems} />
        <LinearProgress sx={{ paddingTop: '5px' }} />
      </PageLayout>
    );
  }
  console.log(data);

  if (!data?.recentRuns || data.recentRuns.length === 0) {
    return (
      <PageLayout>
        <AppBreadcrumbs items={breadcrumbItems} />
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
      <AppBreadcrumbs items={breadcrumbItems} />
      <Table
        style={{ maxHeight: '100vh', overflow: 'auto', scrollbarWidth: 'none' }}
      >
        <TableHead>
          <TableCell>Project Name</TableCell>
          <TableCell>Project Url</TableCell>
          <TableCell>Commit</TableCell>
          <TableCell>Analyzer</TableCell>
          <TableCell>Number of Issues</TableCell>
          <TableCell>Status</TableCell>
          <TableCell>Timestamp</TableCell>
        </TableHead>
        <TableBody>
          {data.recentRuns?.map((run) => {
            return (
              <TableRow
                key={generateKeys(
                  run?.projectUrl,
                  run?.analyzerName,
                  run?.timestamp
                )}
              >
                <TableCell>{run?.projectName}</TableCell>
                <TableCell>{ClickableTableCell(run!.projectUrl!)}</TableCell>
                <TableCell>{stripCommitHash(run?.commitHash)}</TableCell>
                <TableCell>{run?.analyzerName}</TableCell>
                <TableCell>{run?.numberOfIssues}</TableCell>
                <TableCell>{run?.status}</TableCell>
                <TableCell>{formatTimestamp(run?.timestamp!)}</TableCell>
              </TableRow>
            );
          })}
        </TableBody>
      </Table>
    </PageLayout>
  );
}

function stripCommitHash(commitHash: string | null | undefined): string {
  if (commitHash) {
    return commitHash.substring(0, 7);
  }
  return '';
}
const formatTimestamp = (timestamp: string): string => {
  const dateTime = LocalDateTime.parse(timestamp);
  return dateTime.format(DateTimeFormatter.ofPattern(' d/M/yyyy HH:mm'));
};

function ClickableTableCell(url: string) {
  const navigate = useNavigate();

  return (
    <TableCell>
      <Link
        sx={{
          color: 'white',
          '&:hover': {
            color: 'black',
          },
        }}
      >
        <a
          href={url}
          target="_blank"
          rel="noopener noreferrer"
          onClick={(event) => {
            event.preventDefault();
            navigate(url);
          }}
        >
          {url}
        </a>
      </Link>
    </TableCell>
  );
}
