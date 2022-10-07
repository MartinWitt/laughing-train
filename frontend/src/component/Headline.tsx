
import { AppBar, Box, Button, Card, Container, IconButton, Stack, Toolbar, Typography } from '@mui/material';
import React from 'react';


const pages = ["Laughing-Train", "DashBoard", "Settings", "Reports"]
class Headline extends React.Component {

  render() {
    return (
      <AppBar position="static" sx={{backgroundColor:"#FFFFFF"}}>
        <Toolbar>
          {buttons(pages)}
        </Toolbar>
      </AppBar>
    );
  }
}
export default Headline;

function buttons(params:string[]) : JSX.Element[] {
  return params.map((page) => {
    return (
      <Button key={page} href={"/" + page}>
        <Typography sx={{fontSize:"30"}} fontWeight={"bold"}>{page}</Typography>
      </Button>
    );
  });
}