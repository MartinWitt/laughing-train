
import { useLazyQuery } from "@apollo/client";
import { Button, Typography } from "@mui/material";
import React from "react";
import { loginQuery } from "../ProjectData";

export function LoginButton() {
  const [ login,{ data, error } ] = useLazyQuery(loginQuery);
  return (
    <Button
      onClick={() => {
        login();
        if (data) {
          console.log(data);
          console.log("Login successful");
        }
        if (error) {
          console.log(error);
          console.log("Login failed");
        }
      }}
    >
      <Typography sx={{ fontSize: "30" }} fontWeight={"bold"}>Login</Typography>
    </Button>
  );

}