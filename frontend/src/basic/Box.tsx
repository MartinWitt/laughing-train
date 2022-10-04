import styled from 'styled-components';
import theme from 'styled-theming';
import colors from '../colors';

const fontSize = theme('size', {
  normal: '1em',
  large: '1.2em',
});

const boxBackgroundColor = theme('mode', {
  light: colors.grayLight,
  dark: colors.grayDarker,
});

const boxColor = theme('mode', {
  light: colors.grayDarker,
  dark: colors.grayLighter,
});

const Box = styled.div`
  position: relative;
  width: 20%;
  height: 20%;
  padding: 0em;
  font-size: ${fontSize};
  background-color: ${boxBackgroundColor};
  color: ${boxColor};
`;

export default Box;

