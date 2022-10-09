import { Card, CardContent, CardMedia, Typography } from "@mui/material";
import React from "react";
import { BiPlus } from "react-icons/bi";


export function AddProjectCard() {
  return (
    <div>
      <Card>
        <CardMedia sx={{ justifyContent: "center", display: "flex" }}>
          <BiPlus size={100}/>
        </CardMedia>
        <CardContent>
          <Typography variant="h3">Add Project</Typography>
        </CardContent>
      </Card>
    </div>
  );
}