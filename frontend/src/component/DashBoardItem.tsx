import { Card, CardActionArea, Typography } from '@mui/material';
import { Box } from '@mui/system';
import Avatar from 'react-avatar';
import { useNavigate } from 'react-router';
import { Project } from '../data/Project';

interface DashBoardItemProps {
  project: Project;
}
function DashBoardItem(props: DashBoardItemProps) {
  const navigate = useNavigate();
  return (
    <>
      <Card sx={{ display: 'flex', flexDirection: 'row', width: '100%' }}>
        <CardActionArea onClick={() => navigate(toLink(props.project))}>
          <Avatar githubHandle={urlToGitHubHandle(props.project.projectUrl)} />
          <Box marginLeft={5} marginRight={'auto'} display={'inline-block'}>
            <Typography variant="h5" component="div">
              {props.project.projectName}{' '}
            </Typography>
            <Typography variant="body1" component="div">
              {props.project.projectUrl}{' '}
            </Typography>
          </Box>
          <Box marginLeft={5} display={'inline-block'} alignSelf={'flex-end'}>
            <Typography variant="body1">
              {props.project.commits.length} Commits
            </Typography>
          </Box>
        </CardActionArea>
      </Card>
    </>
  );
}
function toLink(project: Project): string {
  return '/results/' + project.projectName;
}
function urlToGitHubHandle(params: string) {
  if (params === undefined) {
    return '';
  }
  let url = params.split('/');
  // the first pop return the projectname
  url.pop();
  return url.pop();
}
export default DashBoardItem;
