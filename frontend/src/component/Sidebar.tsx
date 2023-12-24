import * as React from 'react';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Divider from '@mui/material/Divider';
import List from '@mui/material/List';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import MenuIcon from '@mui/icons-material/Menu';
import { LoginButton } from './LoginButton';
import { ListItemButton } from '@mui/material';
import { useNavigate } from 'react-router-dom';

export type LinkType = { title: string; url: string };

type Props = { links: LinkType[] };
interface ListItemsProps {
  links: LinkType[];
}

function ListItems(props: ListItemsProps) {
  const { links } = props;
  const navigate = useNavigate();

  return (
    <>
      {links.map(({ title, url }) => (
        <ListItemButton key={url}>
          <ListItemIcon>
            <MenuIcon />
          </ListItemIcon>
          <ListItemText
            primary={title}
            sx={{ color: '#fff' }}
            onClick={() => navigate(url)}
          />
        </ListItemButton>
      ))}
    </>
  );
}

function Sidebar(props: Props) {
  return (
    <Box sx={{ width: 250, bgcolor: '#272727', height: '100vh' }}>
      <Typography
        variant="h6"
        noWrap
        component="div"
        align="center"
        sx={{ flexGrow: 1, p: 2 }}
      >
        Laughing-Train
      </Typography>
      <Divider />
      <List>
        <ListItems links={props.links} />
      </List>
      <LoginButton
        sx={{ mx: 1, my: 1, color: '#fff', borderColor: '#fff', width: '90%' }}
      />
    </Box>
  );
}

export default Sidebar;
