import { Box, Button, Card, CardActionArea, Divider, Stack, Typography } from "@mui/material";
import React from "react";
import { BadSmell } from "../data/BadSmell";
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import ChevronRightIcon from '@mui/icons-material/ChevronRight';
import TreeView from '@mui/lab/TreeView';
import TreeItem from '@mui/lab/TreeItem';
import JavaCodeBlock from "./JavaCodeBlock";

export function BadSmellTreeView({ badSmell, selector }: { badSmell: BadSmell[];  selector: (selected: string) => void; }) {
  const [expanded, setExpanded] = React.useState<string[]>([]);

  const handleToggle = (event: React.SyntheticEvent, nodeIds: string[]) => {
    setExpanded(nodeIds);
  };



  const handleExpandClick = () => {
    setExpanded((oldExpanded) =>
      oldExpanded.length === 0 ? ['1', '5', '6', '7'] : [],
    );
  };

  return (
    <Box sx={{ flexGrow: 1, overflowY: 'auto' }}>
      <Box sx={{ mb: 1 }}>
        <Button onClick={handleExpandClick}>
          {expanded.length === 0 ? 'Expand all' : 'Collapse all'}
        </Button>
      </Box>
      <TreeView
        aria-label="controlled"
        defaultCollapseIcon={<ExpandMoreIcon />}
        defaultExpandIcon={<ChevronRightIcon />}
        expanded={expanded}
        onNodeToggle={handleToggle}
        multiSelect
      >
        {convertBadSmellToTree(badSmell).map((temp) => printChilds(temp, selector))}
      </TreeView>
    </Box>
  );
}
function printChilds(node: TreeNode, setSelected : (selected: string) => void) {
  if (node.children.length === 0) {
    return <TreeItem key={node.parent + node.label} nodeId={node.parent + node.label} label={node.label} >
      {CodeBlocks(node.badSmell, setSelected)}
    </TreeItem>
  } else {
    return <TreeItem key={node.parent + node.label} nodeId={node.parent + node.label} label={node.label}>
      {node.children.map((child) => printChilds(child, setSelected))}
      </TreeItem>
  }
  
}

type TreeNode = {
  parent: string;
  label: string;
  children: TreeNode[];
  badSmell: BadSmell[];
}
// convert an array of badsmell with filePath to a filetree. Each node has his foldername as name and upper folders as parent.
function convertBadSmellToTree(badSmell: BadSmell[]): TreeNode[] {
  const result: TreeNode[] = [];
  badSmell.forEach((badSmell) => {
    const filePath = badSmell.filePath;
    const folders = filePath.split("/");
    for (let index = 0; index < folders.length; index++) {
      const element = folders[index];
      const parent = index === 0 ? "" : folders.slice(0, index).join("/");
      if (!result.some((temp) => temp.parent === parent && temp.label === element)) {
        result.push({ parent: parent, label: element, children: [], badSmell: [] });
      }
    }
  });
  result.forEach((temp) => {
    result.find((temp2) => temp2.parent + "/" + temp2.label === temp.parent)?.children.push(temp);
    result.find((temp2) => temp2.label === temp.parent)?.children.push(temp);
  });
  badSmell.forEach((badSmell) => {
    const filePath = badSmell.filePath;
    result.find((temp) => temp.parent + "/" + temp.label === filePath)?.badSmell.push(badSmell);
  });
  return result.filter((temp) => temp.parent === "");

}

function CodeBlocks(params: BadSmell[], setSelected: (selected: string) => void) {
    return (
      <div >
            <Stack spacing={2} direction='column' alignItems={"center"}>
              {params.map((badSmell) => {
                return (
                  <Card key={badSmell.id} sx={{
                    alignItems: "center",
                    justifyContent: "center",
                    alignContent: "center",
                    width: "100%",
                  }} elevation={10}>
                    <CardActionArea onClick={e => setSelected(badSmell.identifier)}>
                    <BadSmellCardHeader  {...badSmell} />
                    <Typography padding="10px" fontSize={18} >{badSmell.messageMarkdown}</Typography>
                      <JavaCodeBlock code={badSmell.snippet} />
                      </ CardActionArea>
                    <OrangeDivider />
                  </Card>
                );
              })}
            </Stack>
      </div>
    );
}
function BadSmellCardHeader(badSmell: BadSmell) {
  return (<>
    <OrangeDivider />
    <Typography padding="10px" variant='h4' fontSize={24}>{badSmell.ruleID}</Typography>
    <Typography padding="10px" justifyContent={"flex-start"}>{badSmell.identifier}</Typography>
    <BlackDivider />  </>);
}
function BlackDivider() {
  return (<Divider sx={{
    borderBottomWidth: 2,
  }} />);
}
function OrangeDivider() {
  return <Divider sx={{ borderBottomWidth: 5}} />;
}
