import React from "react";
import { Grid, AppBar, Toolbar, List, ListItem, ListItemText, Box } from "@mui/material";
import { LoginButton } from "../component/LoginButton";

interface LogoProps {
  src: string;
  alt: string;
}

function Logo({ src, alt }: LogoProps) {
  return <img src={src} alt={alt} style={{ height: "40px", marginRight: "5px" }} />;
}

interface NameProps {
  name: string;
}

function Name({ name }: NameProps) {
  return <h1 style={{ fontSize: "20px", fontWeight: "bold", margin: "0 0 0 5px" }}>{name}</h1>;
}

interface NavigationProps {
  items: string[];
}

function Navigation({ items }: NavigationProps) {
  return (
    <List style={{ padding: 0 }}>
      {items.map((item) => (
        <ListItem button key={item}>
          <ListItemText primary={item} />
        </ListItem>
      ))}
    </List>
  );
}
interface PageLayoutProps {
  children: React.ReactNode;
}

export default function PageLayout({ children }: PageLayoutProps) {
  const navigationItems = ["Home", "About", "Contact"];
  return (
    <div style={{ height: "100vh" }}>
      <AppBar position="static">
        <Toolbar>
          <Logo src="/logo512.jpg" alt="Logo" />
          <Name name="Laughing-Train" />
        </Toolbar>
      </AppBar>
      <Grid container spacing={2} style={{ height: "calc(100%) ", flexWrap: "nowrap" }}>
        <Grid item sx={{ width: "200px" }}>
          <Box sx={{ height: "100%", width: "100%", bgcolor: "#f0f0f0", overflow: "hidden" }}>
            <AppBar position="static">
              <Toolbar>
                <Navigation items={navigationItems} />
              </Toolbar>
            </AppBar>
            <LoginButton />
          </Box>
        </Grid>
        <Grid item xs={6}>
          {children}
        </Grid>
        <Grid item xs={3}></Grid>
      </Grid>
    </div>
  );
}