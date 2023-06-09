import { Button, Typography } from "@mui/material";
import React from "react";
import { useKeycloak } from "@react-keycloak/web";

export function LoginButton() {
  const { keycloak } = useKeycloak();

  const handleAuth = () => {
    if (keycloak.authenticated) {
      handleLogout();
    } else {
      handleLogin();
    }
  };

  const handleLogin = () => {
    keycloak.login({
      prompt: "login",
    });
  };

  const handleLogout = () => {
    keycloak.logout();
  };

  const getButtonText = () => {
    if (keycloak.authenticated) {
      return `${keycloak.tokenParsed?.name}`;
    } else {
      return "Login";
    }
  };

  return (
    <Button onClick={handleAuth}>
      <Typography sx={{ color:"white" }}   >
        {getButtonText()}
      </Typography>
    </Button>
  );
}