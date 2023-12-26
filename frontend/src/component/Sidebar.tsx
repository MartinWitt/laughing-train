import * as React from 'react';
import { useNavigate } from 'react-router-dom';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Divider from '@mui/material/Divider';
import List from '@mui/material/List';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import ListItemButton from '@mui/material/ListItemButton';
import MenuIcon from '@mui/icons-material/Menu';
import Collapse from '@mui/material/Collapse';
import { LoginButton } from './LoginButton';

export type LinkType = { title: string; url: string; subLinks?: LinkType[] };
interface ListItemsProps {
  links: LinkType[];
}

function NewComponent(props: { link: LinkType }) {
  const [open, setOpen] = React.useState(true);
  const navigate = useNavigate();

  return (
    <div>
      <ListItemButton onClick={() => setOpen(!open)}>
        <ListItemIcon>
          <MenuIcon />
        </ListItemIcon>
        <ListItemText primary={props.link.title} sx={{ color: '#fff' }} />
      </ListItemButton>
      <Collapse in={open} timeout="auto" unmountOnExit>
        <List disablePadding>
          {props.link.subLinks?.map((subLink: LinkType) => (
            <ListItemButton
              key={subLink.url}
              sx={{ pl: 4 }}
              onClick={() => navigate(subLink.url)}
            >
              <ListItemText primary={subLink.title} sx={{ color: '#fff' }} />
            </ListItemButton>
          ))}
        </List>
      </Collapse>
    </div>
  );
}

function ListItems(props: ListItemsProps) {
  const { links } = props;

  return (
    <>
      {links.map((link) => (
        <NewComponent key={link.url} link={link} />
      ))}
    </>
  );
}

function Sidebar() {
  const navigationItems: LinkType[] = [
    {
      title: 'Home',
      url: '/',
      subLinks: [{ title: 'LiveFeed', url: '/livefeed' }],
    },
    {
      title: 'Statistics',
      url: '/statistics',
      subLinks: [{ title: 'About', url: '/about' }],
    },
  ];

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
        <ListItems links={navigationItems} />
      </List>
      <LoginButton
        sx={{ mx: 1, my: 1, color: '#fff', borderColor: '#fff', width: '90%' }}
      />
    </Box>
  );
}

export default Sidebar;
