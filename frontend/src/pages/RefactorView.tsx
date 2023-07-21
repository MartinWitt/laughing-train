import { useMutation, useQuery } from '@apollo/client';
import {
  Alert,
  Button,
  Chip,
  Stack,
  TextField,
  Typography,
} from '@mui/material';
import Grid2 from '@mui/material/Unstable_Grid2'; // Grid version 2

import React, { useMemo } from 'react';
import { useParams } from 'react-router';
import { BadSmellTreeView } from '../component/BadSmellTree';
import { BadSmell } from '../data/BadSmell';
import { fetchBadSmellsforHashQuery, refactorQuery } from '../ProjectData';

export function RefactorView() {
  const [selected, setSelected] = React.useState<string[]>([]);
  const [search, setSearch] = React.useState<string>('');
  const handleSelect = (values: string[]) => {
    if (values.length === 1) {
      if (selected.includes(values[0])) {
        setSelected(
          selected.filter((identifier: string) => identifier !== values[0])
        );
      } else {
        setSelected([...selected, values[0]]);
      }
    } else {
      const temp = [...selected, ...values];
      setSelected(temp);
    }
  };
  const [refactorBadSmell] = useMutation(refactorQuery, {
    onError: (error) => {
      console.log(error);
    },
    onCompleted: (data) => {
      console.log(data);
    },
  });
  // function combine 2 arrays:
  // const arr1 = [1, 2, 3];
  // const arr2 = [4, 5, 6];
  // const arr3 = [...arr1, ...arr2];

  const { hash, name } = useParams();
  const {
    data: dataBadSmell,
    error: errorBadSmell,
    loading: loadingBadSmell,
  } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: hash,
    },
  });
  // eslint-disable-next-line react-hooks/exhaustive-deps
  let allBadsmells: BadSmell[] =
    dataBadSmell !== undefined ? dataBadSmell.byCommitHash : [];
  allBadsmells = useMemo(
    () =>
      allBadsmells.filter((badSmell: BadSmell) => {
        return (
          badSmell.ruleID.toLowerCase().includes(search.toLowerCase()) ||
          badSmell.messageMarkdown.toLowerCase().includes(search.toLowerCase())
        );
      }),
    [allBadsmells, search]
  );
  if (hash === 'undefined') {
    return (
      <div>
        <Alert severity="error">Hash not found</Alert>
        <Typography variant="h4" alignContent={'center'}>
          Hash not found. Please go back an select a hash before
        </Typography>
      </div>
    );
  }
  if (errorBadSmell) {
    return (
      <Alert severity="error">Error Loading ruleset. Are you logged in?</Alert>
    );
  }
  if (loadingBadSmell) {
    return <Alert severity="info">Loading</Alert>;
  }

  return (
    <div>
      <br />
      <Typography variant="h4" alignContent={'center'}>
        Refactor {name} at {hash}
      </Typography>
      <Grid2 container padding={5}>
        <Grid2 xs={2}>
          <Typography variant="h4"> Search</Typography>
          <br />
          <TextField
            label="Filter"
            value={search}
            onChange={(e) => setSearch(e.target.value)}
          />
          <br />
          <StackSelector {...{ dataBadSmell, handleSelect }} />
        </Grid2>
        <Grid2 xs={8}>
          <BadSmellTreeView
            {...{ badSmell: allBadsmells, selector: handleSelect }}
          />
        </Grid2>
        <Grid2 xs={2}>
          <StackSelectedRule
            {...{ selected: selected, handleSelect: handleSelect }}
          />
          <Button
            variant="contained"
            size="large"
            value={''}
            onClick={() => {
              refactorBadSmell({
                variables: {
                  badSmellIdentifier: selected,
                },
              });
            }}
          >
            Refactor
          </Button>
        </Grid2>
      </Grid2>
    </div>
  );
}
function StackSelectedRule({
  selected,
  handleSelect,
}: {
  selected: string[];
  handleSelect: (value: [string]) => void;
}) {
  return (
    <Stack>
      {selected.map((value: string) => {
        return (
          <Chip
            label={value}
            key={value}
            size="medium"
            onClick={() => handleSelect([value])}
          />
        );
      })}
    </Stack>
  );
}

function StackSelector({
  dataBadSmell,
  handleSelect,
}: {
  dataBadSmell: any;
  handleSelect: (value: string[]) => void;
}): JSX.Element {
  const badSmells: BadSmell[] = dataBadSmell.byCommitHash;
  return (
    <Stack spacing={0.5}>
      {listOfUniqueRules(badSmells).map((badSmell: BadSmell) => {
        return (
          <Chip
            key={badSmell.ruleID}
            label={badSmell.ruleID}
            onClick={(e) =>
              handleSelect(
                toRuleIDs(filterBadSmells(badSmells, e.currentTarget.innerText))
              )
            }
          />
        );
      })}
    </Stack>
  );
}

function filterBadSmells(BadSmell: BadSmell[], ruleID: string): BadSmell[] {
  return BadSmell.filter((inner: BadSmell) => {
    return inner.ruleID === ruleID;
  });
}
function toRuleIDs(badSmells: BadSmell[]): string[] {
  return badSmells.map((badSmell: BadSmell) => {
    return badSmell.identifier;
  });
}

function listOfUniqueRules(badSmells: BadSmell[]): BadSmell[] {
  const ids = badSmells.map((o) => o.ruleID);
  const filtered = badSmells.filter(
    ({ ruleID }, index) => !ids.includes(ruleID, index + 1)
  );
  return filtered;
}
