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

export type LinkType = { title: string; url: string };

interface Props {
  links: LinkType[];
}

interface ListItemsProps {
  links: LinkType[];
  subLinks: LinkType[];
}

function ListItems(props: ListItemsProps) {
  const { links, subLinks } = props;
  const navigate = useNavigate();
  const [open, setOpen] = React.useState(true);

  return (
    <>
      {links.map((link) =>
        link.title === 'Home' ? (
          <div key={link.url}>
            <ListItemButton onClick={() => setOpen(!open)}>
              <ListItemIcon>
                <MenuIcon />
              </ListItemIcon>
              <ListItemText primary={link.title} sx={{ color: '#fff' }} />
            </ListItemButton>
            <Collapse in={open} timeout="auto" unmountOnExit>
              <List component="div" disablePadding>
                {subLinks.map((subLink) => (
                  <ListItemButton
                    key={subLink.url}
                    sx={{ pl: 4 }}
                    onClick={() => navigate(subLink.url)}
                  >
                    <ListItemText
                      primary={subLink.title}
                      sx={{ color: '#fff' }}
                    />
                  </ListItemButton>
                ))}
              </List>
            </Collapse>
          </div>
        ) : (
          <ListItemButton key={link.url} onClick={() => navigate(link.url)}>
            <ListItemIcon>
              <MenuIcon />
            </ListItemIcon>
            <ListItemText primary={link.title} sx={{ color: '#fff' }} />
          </ListItemButton>
        )
      )}
    </>
  );
}

function Sidebar(props: Props) {
  const subLinks: LinkType[] = [{ title: 'LiveFeed', url: '/livefeed' }];

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
        <ListItems links={props.links} subLinks={subLinks} />
      </List>
      <LoginButton
        sx={{ mx: 1, my: 1, color: '#fff', borderColor: '#fff', width: '90%' }}
      />
    </Box>
  );
}

export default Sidebar;
