import React from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import DashBoard from './pages/DashBoard';
import Resultview from './pages/Resultview';
import { ApolloClient, ApolloProvider, HttpLink, InMemoryCache } from '@apollo/client';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { CssBaseline } from '@mui/material';
import { AddProjectView } from './pages/AddProjectView';
import { RefactorView } from './pages/RefactorView';
const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);

const router = createBrowserRouter([
  {
    path: "/",
    element: <DashBoard />,
    errorElement: <DashBoard />,
  },
  {
    path: "/mutation/addproject",
    element: <AddProjectView />,
  },
  {
    path: "/mutation/refactor/:name/:hash",
    element: <RefactorView />,
  },
  {
    path: "/resultview",
    element: <DashBoard />,
    errorElement: <DashBoard />,
  },
  {
    path: "resultview/:name",
    element: <Resultview />,
    children: [
      {
        path: ":hash",
        element: <Resultview />,
      }],
  },
  {
    path: "/Laughing-Train",
    element: <DashBoard />,
    errorElement: <DashBoard />,
  },
  {
    path: "/DashBoard",
    element: <DashBoard />,
    errorElement: <DashBoard />,
  },
  
    
]);

const client = new ApolloClient({
  link: new HttpLink({
    uri: 'https://laughing-train.keksdose.xyz/graphql',
  }),
  connectToDevTools: true,
  cache: new InMemoryCache({
  }),
});
const theme = createTheme({
  palette: {
    mode: "dark",
    background: {
      default: "#111135",
      paper: "#2369b9",
    },
    primary: {
      main: "#2369b9"
    },
    divider: "#b92369"
  },
  typography: {
    h1: {
      color: "#b92369"
    }
  },

  
});
theme.spacing(10)


root.render(
  <React.StrictMode>
    <ThemeProvider theme={theme} >
  <ApolloProvider client={client}>
        <RouterProvider router={router} />
        <CssBaseline />
      </ApolloProvider>
    </ThemeProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
