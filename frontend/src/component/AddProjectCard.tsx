import { Card, CardActionArea, CardContent, CardMedia, Typography } from "@mui/material";
import React from "react";
import { BiPlus } from "react-icons/bi";
import { useNavigate } from "react-router";


export function AddProjectCard() {
  const navigate = useNavigate();
  return (
    <div>
      <Card>
        <CardActionArea onClick={() => navigate("/mutation/addproject")}>
        <CardMedia sx={{ justifyContent: "center", display: "flex" }}>
          <BiPlus size={100}/>
        </CardMedia>
        <CardContent>
          <Typography variant="h3">Add Project</Typography>
          </CardContent>
        </CardActionArea>
      </Card>
    </div>
  );
}