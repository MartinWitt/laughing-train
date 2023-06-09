import { ApolloClient, ApolloProvider, HttpLink, InMemoryCache } from '@apollo/client';
import { CssBaseline } from '@mui/material';
import { ThemeOptions, ThemeProvider, createTheme } from '@mui/material/styles';
import { ReactKeycloakProvider } from '@react-keycloak/web';
import React from 'react';
import ReactDOM from 'react-dom/client';
import {
  RouterProvider,
  createBrowserRouter,
} from "react-router-dom";
import keycloak from './Keycloak';
import PrivateRoute from './PrivateRoute';
import { AddProjectView } from './pages/AddProjectView';
import DashBoard from './pages/DashBoard';
import LandingPage from './pages/PageLayout';
import { ProjectConfigview } from './pages/ProjectConfigView';
import { RefactorView } from './pages/RefactorView';
import Resultview from './pages/Resultview';
import reportWebVitals from './reportWebVitals';
import { StatisticPage } from './pages/StatisticsPage';
const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);


const router = createBrowserRouter([

  {
    path: "/statistics",
    element: <StatisticPage />,
  },
  {
    path: "/",
    element: <LandingPage children={<DashBoard />} />,
    errorElement: <LandingPage children={<DashBoard />} />,
  },
  {
    path: "/mutation/addproject",
    element: <AddProjectView />,
  },
  {
    path: "/mutation/refactor/:name/:hash",
    element: <PrivateRoute> <LandingPage children={<RefactorView/>} /></PrivateRoute>,
  },
  {
    path: "/mutation/projectconfig/:projectUrl",
    element: <PrivateRoute><ProjectConfigview /></PrivateRoute>,
  },
  {
    path: "resultview/:name",
    element: <LandingPage children={<Resultview />} />,
    children: [
      {
        path: ":hash",
        element: <Resultview />,
      }],
  }
]);

const client = new ApolloClient({
  link: new HttpLink({
    uri: 'https://laughing-train.keksdose.xyz/graphql',
  }),
  connectToDevTools: true,
  cache: new InMemoryCache({
  }),
});
// https://bareynol.github.io/mui-theme-creator/#Card
const themeOptions: ThemeOptions = {
  palette: {
    mode: "dark",
    primary: {
      main: "#1976d2",
    },
    secondary: {
      main: "#dc004e",
    },
  },
  spacing: 8,
  components: {
    MuiCard: {
      styleOverrides: {
        root: {
          background: "linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)",
        },
      },
    },
    MuiButton: {
      styleOverrides: {
        root: {
          background: "linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)",
        },
      },
    }
  },
};
const theme = createTheme(
  themeOptions



);



root.render(
  <ReactKeycloakProvider authClient={keycloak}>
    <React.StrictMode>
      <ThemeProvider theme={theme} >
      
        <ApolloProvider client={client}>
          <RouterProvider router={router} />
          <CssBaseline />
        </ApolloProvider>
      </ThemeProvider>

    </React.StrictMode>
  </ReactKeycloakProvider>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
