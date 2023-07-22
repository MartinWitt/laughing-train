import { Card, CardActionArea, Typography } from '@mui/material';
import { Box } from '@mui/system';
import Avatar from 'react-avatar';
import { useNavigate } from 'react-router';
import { Project } from '../data/Project';

function DashBoardItem(project: Project) {
  const navigate = useNavigate();
  return (
    <>
      <Card sx={{ display: 'flex', flexDirection: 'row', width: '100%' }}>
        <CardActionArea onClick={() => navigate(toLink(project))}>
          <Avatar githubHandle={urlToGitHubHandle(project.projectUrl)} />
          <Box marginLeft={5} marginRight={'auto'} display={'inline-block'}>
            <Typography variant="h5" component="div">
              {project.projectName}{' '}
            </Typography>
            <Typography variant="body1" component="div">
              {project.projectUrl}{' '}
            </Typography>
          </Box>
          <Box marginLeft={5} display={'inline-block'} alignSelf={'flex-end'}>
            <Typography variant="body1">
              {project.commitHashes.length} Commits
            </Typography>
          </Box>
        </CardActionArea>
      </Card>
    </>
  );
}
function toLink(project: Project): string {
  return '/resultview/' + project.projectName;
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
