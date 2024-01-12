import { Card, CardActionArea, Typography } from '@mui/material';
import { Box } from '@mui/system';
import Avatar from 'react-avatar';
import { useNavigate } from 'react-router';
import { Project } from '../data/Project';

interface DashBoardItemProps {
  project: Project;
}

function ProjectInfo(props: { project: Project }) {
  return (
    <Box marginLeft={5} marginRight={'auto'} display={'inline-block'}>
      <Typography variant="h5" component="div">
        {props.project.projectName}{' '}
      </Typography>
      <Typography variant="body1" component="div">
        {props.project.projectUrl}{' '}
      </Typography>
    </Box>
  );
}

function CommitInfo(props: { project: Project }) {
  return (
    <Box marginLeft={5} display={'inline-block'} alignSelf={'end'}>
      <Typography variant="body1">
        {props.project.commits.length} Commit(s)
      </Typography>
    </Box>
  );
}

function DashBoardItem(props: DashBoardItemProps) {
  const navigate = useNavigate();
  return (
    <Card sx={{ display: 'flex', flexDirection: 'row', width: '70%' }}>
      <CardActionArea
        sx={{ display: 'flex', justifyContent: 'space-between' }}
        onClick={() => navigate(toLink(props.project))}
      >
        <Avatar githubHandle={urlToGitHubHandle(props.project.projectUrl)} />
        <ProjectInfo project={props.project} />
        <CommitInfo project={props.project} />
      </CardActionArea>
    </Card>
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
