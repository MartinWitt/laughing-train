import { Breadcrumbs, Link, Typography } from '@mui/material';
import React from 'react';

interface BreadcrumbItem {
  text: string;
  href?: string;
}

interface BreadcrumbsProps {
  items: BreadcrumbItem[];
}

function AppBreadcrumbs(props: BreadcrumbsProps) {
  const { items } = props;
  return (
    <Breadcrumbs aria-label="breadcrumb" sx={{ paddingTop: '5px' }}>
      {items.map((item, index) =>
        item.href ? (
          <Link color="inherit" href={item.href} key={index}>
            {item.text}
          </Link>
        ) : (
          <Typography color="textPrimary" key={index}>
            {item.text}
          </Typography>
        )
      )}
    </Breadcrumbs>
  );
}

export default AppBreadcrumbs;
