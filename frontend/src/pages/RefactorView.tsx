import { useMutation, useQuery } from "@apollo/client";
import { Alert, Button, Chip, Stack, Typography } from "@mui/material";
import Grid2  from '@mui/material/Unstable_Grid2'; // Grid version 2

import React from "react";
import { useParams } from "react-router";
import { BadSmellTreeView } from "../component/BadSmellTree";
import { BadSmell } from "../data/BadSmell";
import { fetchBadSmellsforHashQuery, refactorQuery } from "../ProjectData";

export function RefactorView() {
  const [selected, addSelected] = React.useState<string[]>([]);
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
  const allBadsmells: BadSmell[] = dataBadSmell.byCommitHash as BadSmell[];
  
  console.log(allBadsmells);
  return (

    <div>
        <h1>RefactorView</h1>
        <h2>{name}</h2>
      <h2>{hash}</h2>
      <Grid2 container>
        <Grid2 xs={2}>Search</Grid2>
        <Grid2 xs={8}><BadSmellTreeView {...{ badSmell: allBadsmells, selector: handleSelect }} /></Grid2>
        <Grid2 xs={2}>
          <Stack>
            {selected.map((value) => {
              return <Chip label={value} size="medium" onClick={(e) => handleSelect(value)}/>;
            })}
          </Stack>
          <Button value={"Refactor"} onClick={(e) => {
            e.preventDefault();
            refactorBadSmell({
              variables: {
                badSmellIdentifier: selected,
              }
            });
          }} />
          </Grid2>
      </Grid2>
        </div>
    );
}