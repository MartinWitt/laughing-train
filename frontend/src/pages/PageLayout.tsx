import React from 'react';
import { Grid } from '@mui/material';
import Sidebar from '../component/Sidebar';

interface PageLayoutProps {
  children: React.ReactNode;
}

export default function PageLayout({ children }: PageLayoutProps) {
  return (
    <div style={{ height: '100vh' }}>
      <Grid container spacing={2}>
        <Grid item style={{ width: '400px' }}>
          <Sidebar />
        </Grid>
        <Grid item>{children}</Grid>
      </Grid>
    </div>
  );
}
