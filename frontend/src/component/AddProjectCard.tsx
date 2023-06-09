import { Card, CardMedia, Typography } from "@mui/material";
import React from "react";
import { BiPlus } from "react-icons/bi";
import { useNavigate } from "react-router";

export function AddProjectCard() {
  const navigate = useNavigate();
  return (
    <Card onClick={() => navigate("/mutation/addproject")} sx={{ display: "flex", flexDirection: "column", alignItems: "center", justifyContent: "center" }}>
      <CardMedia>
        <BiPlus size={100} />
      </CardMedia>
      <Typography variant="h3">Add Project</Typography>
    </Card>
  );
}