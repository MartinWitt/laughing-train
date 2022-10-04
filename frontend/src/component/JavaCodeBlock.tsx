import SyntaxHighlighter from 'react-syntax-highlighter';
import { dracula } from "react-syntax-highlighter/dist/esm/styles/hljs";
import React from 'react';
export default function javaCodeBlock(props: { code: string }) {
  return (
    <div>
      <SyntaxHighlighter language="java" style={dracula} sx={{ width: "300"}} wrapLongLines showInlineLineNumbers>
        {props.code}
      </SyntaxHighlighter>
    </div>
  );
}