import React from 'react';
import {
  Grid,
  AppBar,
  Toolbar,
  List,
  ListItem,
  ListItemText,
  Box,
  Divider,
} from '@mui/material';
import { LoginButton } from '../component/LoginButton';
import { useNavigate } from 'react-router';
import Sidebar, { LinkType } from '../component/Sidebar';

interface NameProps {
  name: string;
}

interface Link {
  name: string;
  href: string;
}
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
        style={{ height: 'calc(100%) ', flexWrap: 'nowrap' }}
      >
        <Grid item sx={{ width: '200px' }}>
          <Sidebar links={navigationItems} />
        </Grid>
        <Grid item xs={9} sx={{}}>
          {children}
        </Grid>
        <Grid item xs={1}></Grid>
      </Grid>
    </div>
  );
}
