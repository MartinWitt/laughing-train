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
import { ThemeProvider, createTheme, ThemeOptions } from '@mui/material/styles';
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
// https://bareynol.github.io/mui-theme-creator/#Card
export const themeOptions: ThemeOptions = {
  palette: {
    mode: 'dark',
    primary: {
      main: '#e64a19',
    },
    secondary: {
      main: '#00e676',
    },
  },
  spacing: 8,
};
const theme = createTheme(
  themeOptions
  

  
);



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
