import { Box, Button, Grid, TextField, Typography } from '@mui/material';
import React from 'react';
import { useNavigate } from 'react-router';
import { ProjectList } from '../component/ProjectList';

export default function DashBoard() {
  const navigate = useNavigate();

  const [filter, setFilter] = React.useState('');

  return (
    <div>
      <Box sx={{ top: 0, zIndex: 1 }}>
        <Grid container marginLeft={'5%'} alignItems="center">
          <Grid item xs={8} md={4} lg={2} padding={1}>
            <Typography variant="h4">Search</Typography>
            <br />
            <TextField
              label="Filter"
              value={filter}
              onChange={(e) => setFilter(e.target.value)}
            />
          </Grid>
          <Grid item xs={4} md={2} lg={1} marginLeft="auto">
            <Button
              onClick={() => navigate('/mutation/addproject')}
              variant="contained"
              sx={{ width: '100%' }}
            >
              Add Project
            </Button>
          </Grid>
        </Grid>
      </Box>
      <Box>
        <Grid container marginLeft={'5%'}>
          <Grid item xs={12}>
            <ProjectList filter={filter} />
          </Grid>
        </Grid>
      </Box>
    </div>
  );
}
