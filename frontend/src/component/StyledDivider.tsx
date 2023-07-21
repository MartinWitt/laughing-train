import { Divider as MuiDivider } from '@mui/material';
import React from 'react';

interface DividerProps {
  thickness?: number;
  color?: string;
  orientation?: 'horizontal' | 'vertical';
}

export function StyledDivider({
  thickness = 1,
  color = 'grey',
  orientation = 'horizontal',
}: DividerProps) {
  const sxProps =
    orientation === 'horizontal'
      ? { borderBottomWidth: thickness, borderColor: color }
      : { borderRightWidth: thickness, borderColor: color };
  return <MuiDivider sx={sxProps} />;
}
