import { useMutation, useQuery } from "@apollo/client";
import { Alert, Button, Chip, Stack, TextField, Typography } from "@mui/material";
import Grid2  from '@mui/material/Unstable_Grid2'; // Grid version 2

import React, { useMemo } from "react";
import { useParams } from "react-router";
import { BadSmellTreeView } from "../component/BadSmellTree";
import Headline from "../component/Headline";
import { BadSmell } from "../data/BadSmell";
import { fetchBadSmellsforHashQuery, refactorQuery } from "../ProjectData";


export function RefactorView() {
  const [selected, addSelected] = React.useState<string[]>([]);
  const [search, setSearch] = React.useState<string>("");
  const handleSelect = (value: string) => {
    if (selected.includes(value)) {
      addSelected(selected.filter((identifier: string) => identifier !== value));
      console.log("remove" + value);
      console.log(selected);
    } else {
      addSelected([...selected, value]);
      console.log("added " + value);
      console.log([...selected, value]);
    }
  };
  const [refactorBadSmell] = useMutation(
    refactorQuery,
    {
      onError: (error) => { console.log(error) },
      onCompleted: (data) => {
        console.log(data);
      }
    }
  )
  // const { data : rules, loading : loadingRules, error : errorRules } = useQuery(fetchAvailableRefactorings);
  const { hash, name } = useParams();
  const { data : dataBadSmell, error : errorBadSmell, loading : loadingBadSmell } = useQuery(fetchBadSmellsforHashQuery, {
    variables: {
      hash: hash
    }
  });
  // eslint-disable-next-line react-hooks/exhaustive-deps
  let allBadsmells: BadSmell[] = (dataBadSmell !==undefined) ? dataBadSmell.byCommitHash : [];
  allBadsmells = useMemo(() =>
    allBadsmells.filter((badSmell: BadSmell) => {
      return badSmell.ruleID.toLowerCase().includes(search.toLowerCase()) || badSmell.messageMarkdown.toLowerCase().includes(search.toLowerCase());
    })
    , [allBadsmells, search])
  if (hash === "undefined") {
    return <div>
      <Alert severity="error">Hash not found</Alert>
      <Typography variant="h4" alignContent={"center"}>Hash not found. Please go back an select a hash before</Typography>
    </div>;
  }
  if (/*errorRules ||*/ errorBadSmell) {
    return <Alert severity="error">Error Loading ruleset. Are you logged in?</Alert>
  }
  if (/* loadingRules ||*/ loadingBadSmell) {
    return <Alert severity="info">Loading</Alert>;
  }

    return (

    <div>
      <Headline />
      <br />
      <Typography variant="h4" alignContent={"center"}>Refactor {name} at {hash}</Typography>
      <Grid2 container padding={5}>
        <Grid2 xs={2} >
          <Typography variant="h4"> Search</Typography>
          <br />
            <TextField label="Filter" value={search} onChange={(e) => setSearch(e.target.value)} />
            <br />
            <StackSelector {...{ dataBadSmell, handleSelect }} />
        </Grid2>
        <Grid2 xs={8}><BadSmellTreeView {...{ badSmell: allBadsmells, selector: handleSelect }} /></Grid2>
          <Grid2 xs={2}>
          <StackSelectedRule {...{ selected: selected, handleSelect: handleSelect }} />
          <Button variant="contained" size="large" value={""} onClick={(e) => {
            e.preventDefault();
            refactorBadSmell({
              variables: {
                badSmellIdentifier: selected,
              }
            });
            }} >Refactor</Button>
          </Grid2>
      </Grid2>
        </div>
    );
}
function StackSelectedRule({ selected, handleSelect }: { selected: string[]; handleSelect: (value: string) => void; }) {
  console.log(selected);
  return <Stack>
    {selected.map((value) => {
      return <Chip  label={value} size="medium" onClick={(e) => handleSelect(value)} />;
    })}
  </Stack>;
}

function StackSelector({ dataBadSmell, handleSelect }: { dataBadSmell: any; handleSelect: (value: string) => void; }) {
  return <Stack spacing={0.5}>
    {listOfUniqueRules(dataBadSmell.byCommitHash).map((badSmell: BadSmell) => {
      return <Chip  key={badSmell.ruleID} label={badSmell.ruleID} onClick={(e) => dataBadSmell.byCommitHash.filter((badSmell: BadSmell) => {
        console.log(e.currentTarget.innerText)
        return badSmell.ruleID === e.currentTarget.innerText;
      }).forEach((badSmell: BadSmell) => {
        handleSelect(badSmell.identifier);
      })} />;
    })}
  </Stack>;
}

function listOfUniqueRules(badSmells: BadSmell[]): BadSmell[] {
  const ids = badSmells.map(o => o.ruleID)
  const filtered = badSmells.filter(({ ruleID }, index) => !ids.includes(ruleID, index + 1));
  return filtered;
}