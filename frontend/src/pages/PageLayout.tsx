import React from "react";
import { Grid, AppBar, Toolbar, List, ListItem, ListItemText, Box } from "@mui/material";
import { LoginButton } from "../component/LoginButton";
import { useNavigate } from "react-router";

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


function Navigation({ links }: NavigationProps) {
  const navigate = useNavigate();
  return (
    <List>
      {links.map((link) => (
        <ListItem key={link.href} onClick={() => navigate(link.href, { replace: true })}>
          <ListItemText primary={link.name} />
        </ListItem>
      ))}
    </List>
  );
}
interface PageLayoutProps {
  children: React.ReactNode;
}
interface Link {
  name: string;
  href: string;

}
interface NavigationProps {
  links: Link[];
}

export default function PageLayout({ children }: PageLayoutProps) {
  const navigationItems: Link[] = [
    { name: "Home", href: "/" },
    { name: "Statistics", href: "/statistics" }
  ];
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
                <Navigation links={navigationItems} />
              </Toolbar>
            </AppBar>
            <LoginButton />
          </Box>
        </Grid>
        <Grid item xs={9}>
          {children}
        </Grid>
        <Grid item xs={1}></Grid>
      </Grid>
    </div>
  );
}