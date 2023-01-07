
import { Button, Typography } from "@mui/material";
import React from "react";
import { useKeycloak } from "@react-keycloak/web";

export function LoginButton() {
  const { keycloak } = useKeycloak();
  return (
    <Button
      onClick={doAuth}
    >
      <Typography sx={{ fontSize: "30" }} fontWeight={"bold"}>{state()}</Typography>
    </Button>
  );

  function state() {
    if (keycloak.authenticated) {
      return "Logout " + keycloak.tokenParsed?.name;
    } else {
      return "Login";
    }
  }
  function login() {

    keycloak.login({
      prompt: "login",
    });
  }
  function logout() {
    keycloak.logout();
  }
  function doAuth() {
    if (keycloak.authenticated) {
      logout();
    } else {
      login();
    }
  }
}