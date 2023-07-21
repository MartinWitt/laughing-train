import { Alert, Typography } from '@mui/material';
import { useKeycloak } from '@react-keycloak/web';

const PrivateRoute = (child: any) => {
  const { keycloak } = useKeycloak();

  const isLoggedIn = keycloak.authenticated;
  return isLoggedIn ? (
    child.children
  ) : (
    <>
      <Alert severity="error">
        {' '}
        <Typography variant="h4">
          You are not logged in. Please log in to access this page.
        </Typography>
      </Alert>
    </>
  );
};

export default PrivateRoute;
