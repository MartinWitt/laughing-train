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



interface NameProps {
  name: string;
}

function Name({ name }: NameProps) {
  return (
    <h1 style={{ fontSize: '20px', fontWeight: 'bold', margin: '0 0 0 5px' }}>
      {name}
    </h1>
  );
}

function Navigation({ links }: NavigationProps) {
  const navigate = useNavigate();
  return (
    <List>
      {links.map((link) => (
        <>
          <ListItem
            key={link.href}
            onClick={() => navigate(link.href, { replace: true })}
          >
            <ListItemText primary={link.name} />
          </ListItem>
          <Divider sx={{ height: 1, backgroundColor: 'white' }} />
        </>
      ))}
      <LoginButton />
    </List>
  );
}
interface PageLayoutProps {
  children: React.ReactNode;
}
interface Link {
  name: string;
  href: string;
}
interface NavigationProps {
  links: Link[];
}

export default function PageLayout({ children }: PageLayoutProps) {
  const navigationItems: Link[] = [
    { name: 'Home', href: '/'},
    { name: 'Statistics', href: '/statistics' },
  ];
  return (
    <div style={{ height: '100vh' }}>
      <Grid
        container
        spacing={2}
        style={{ height: 'calc(100%) ', flexWrap: 'nowrap' }}
      >
        <Grid
          item
          sx={{ width: '200px'}}
        >
          <Box
            sx={{
              height: '100%',
              bgcolor: '#272727',
              overflow: 'hidden',
              position: 'fixed',
            }}
          >
            <AppBar position="static" elevation={0} sx={{ bgcolor: '#272727', marginTop:"10px", marginLeft:"10px"}}>
              <Name name="Laughing-Train" />
              <Toolbar>
                <Navigation links={navigationItems} />
              </Toolbar>
            </AppBar>
          </Box>
        </Grid>
        <Grid item xs={9} sx={{}}>
          {children}
        </Grid>
        <Grid item xs={1}></Grid>
      </Grid>
    </div>
  );
}
