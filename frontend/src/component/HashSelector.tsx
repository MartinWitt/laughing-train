import {
  Button,
  FormControl,
  InputLabel,
  MenuItem,
  Select,
  Typography,
} from '@mui/material';
import React, { useState } from 'react';
import { useNavigate } from 'react-router';
import { Project } from '../data/Project';

function HashSelector(project: Project) {
  const navigate = useNavigate();
  const [selectedHash, setSelectedHash] = useState(project.commitHashes[0]);
  return (
    <div>
      <Typography align="center" variant="h6">
        Choose a hash to view the results
      </Typography>
      <br />
      <FormControl
        sx={{ display: 'flex', justifyContent: 'center', minWidth: 200 }}
      >
        <InputLabel id="hash-select-label">Commit Hash</InputLabel>
        <Select
          labelId="hash-select-label"
          id="hash-select"
          value={selectedHash}
          onChange={(event) => handleHashChange(event.target.value as string)}
        >
          {project.commitHashes.map((hash: string) => (
            <MenuItem key={hash} value={hash}>
              {hash}
            </MenuItem>
          ))}
        </Select>
      </FormControl>
      <br />
      <br />
      <Button
        variant="contained"
        onClick={() => navigate(toLink(project, selectedHash))}
      >
        View Results
      </Button>
    </div>
  );

  function handleHashChange(hash: string) {
    setSelectedHash(hash);
  }
}

export default HashSelector;

function toLink(project: Project, hash: string): string {
  return '/resultview/' + project.projectName + '/' + hash;
}
