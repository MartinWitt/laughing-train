// globalStyles.js
import { createGlobalStyle } from 'styled-components';

const GlobalStyle = createGlobalStyle`
body {
  margin: 0;
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen',
    'Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',
    sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  padding: 20px;
  background-color: #1e1e1e;
  color: #f8f8f2;
}
.divider {
  margin: 10px 0;
  color: #ffb86c;
}
code {
  font-family: source-code-pro, Menlo, Monaco, Consolas, 'Courier New',
    monospace;
}
Text {
  color: #8be9fd;
}
text:hover {
  color: #f1fa8c;
}
Typography {
  color: #8be9fd;
}
h1 {
  color: #ffb86c;
}
`;

export default GlobalStyle;