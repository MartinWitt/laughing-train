import { FormControl, MenuItem, Select, Typography } from '@mui/material';
import React from 'react';
import { Project } from '../data/Project';
import { GitHubCommit } from '../data/GitHubCommit';

export function HashSelector({ project, hash, setHash }: HashSelectorProps) {
  return (
    <>
      <Typography align="center" variant="h6">
        Choose a hash to view the results
      </Typography>
      <FormControl
        sx={{ display: 'flex', justifyContent: 'center', minWidth: 200 }}
      >
        <Select
          id="hash-select"
          value={hash}
          onChange={(event) => {
            setHash(event.target.value as string);
          }}
        >
          {project.commits.map((hash: GitHubCommit) => (
            <MenuItem key={hash.commitHash} value={hash.commitHash}>
              {hash.commitHash}
            </MenuItem>
          ))}
        </Select>
      </FormControl>
    </>
  );
}

export default HashSelector;

interface HashSelectorProps {
  project: Project;
  hash: string;
  setHash: (hash: string) => void;
}
