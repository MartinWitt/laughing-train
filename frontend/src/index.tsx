import React, { Children } from 'react';
import ReactDOM from 'react-dom/client';
// import './index.css';
import reportWebVitals from './reportWebVitals';
import styled, { ThemeProvider } from 'styled-components';
import GlobalStyle from './globalStyles';
import {
  createBrowserRouter,
  RouterProvider,
  Route,
} from "react-router-dom";
import DashBoard from './pages/DashBoard';
import Resultview from './pages/Resultview';
import { ApolloClient, ApolloProvider, HttpLink, InMemoryCache } from '@apollo/client';
import theme from 'styled-theming';
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
    uri: 'http://www.keksdose.xyz:8080/graphql/',
  }),
  connectToDevTools: true,
  cache: new InMemoryCache({
  }),
});
root.render(
  <React.StrictMode>
  <ApolloProvider client={client}>
    <RouterProvider router={router} />
    <GlobalStyle />
      </ApolloProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
