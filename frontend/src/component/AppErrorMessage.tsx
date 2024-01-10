import { Typography } from '@mui/material';
import { Error } from '@mui/icons-material';

type AppErrorMessageProps = {
  message: string;
};

export function AppErrorMessage(props: AppErrorMessageProps) {
  let { message } = props;
  return (
    <div style={{ display: 'flex', alignItems: 'center' }}>
      <Error />
      <Typography>{message}</Typography>
    </div>
  );
}
