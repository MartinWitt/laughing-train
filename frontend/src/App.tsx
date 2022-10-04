import React from 'react';
import styled, { ThemeProvider } from 'styled-components';
import Box from './basic/Box';
import Button from './Button';


const Code = styled.pre`
  font-family: "SFMono-Regular", Consolas, "Liberation Mono", Menlo, Courier, monospace;
  border: 3px solid;
  padding: 1em;
  border-radius: 0.25em;
`;

export default class App extends React.Component {
  state = {
    mode: 'dark',
    size: 'normal',
  };

  handleToggleMode = () => {
    this.setState({ mode: this.state.mode === 'light' ? 'dark' : 'light' });
  };

  handleToggleSize = () => {
    this.setState({ size: this.state.size === 'normal' ? 'large' : 'normal' });
  };

  render() {
    return (
      <ThemeProvider theme={{ mode: this.state.mode, size: this.state.size }}>
        <Box>
          <h1>styled-theming</h1>
          <Button onClick={this.handleToggleMode}>Toggle Mode</Button>
          <Button kind="primary" onClick={this.handleToggleSize}>Toggle Size</Button>
          <Button kind="success" onClick={this.handleToggleMode}>Toggle Mode</Button>
          <Button kind="warning" onClick={this.handleToggleSize}>Toggle Size</Button>
          <Button kind="danger" onClick={this.handleToggleMode}>Toggle Mode</Button>
        </Box>
      </ThemeProvider>
    );
  }
}