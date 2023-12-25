import React from 'react';
import {
  Grid,
} from '@mui/material';
import Sidebar, { LinkType } from '../component/Sidebar';

interface PageLayoutProps {
  children: React.ReactNode;
}

export default function PageLayout({ children }: PageLayoutProps) {
  const navigationItems: LinkType[] = [
    { title: 'Home', url: '/' },
    { title: 'Statistics', url: '/statistics' },
  ];
  return (
    <div style={{ height: '100vh' }}>
      <Grid
        container
        spacing={2}
        justifyContent="flex-start" // added this
        style={{ height: 'calc(100%) ', flexWrap: 'nowrap' }}
      >
        <Grid item xs={2.5}>
          <Sidebar links={navigationItems} />
        </Grid>
        <Grid item xs={9} style={{ overflow: 'auto' }}>
          {children}
        </Grid>
      </Grid>
    </div>
  );
}
