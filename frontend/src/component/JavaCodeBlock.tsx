import { CodeBlock, atomOneDark } from 'react-code-blocks';
import React from 'react';
export default function javaCodeBlock(props: { code: string }) {
  return (
    <CodeBlock
      text={props.code}
      language={'java'}
      showLineNumbers={false}
      theme={atomOneDark}
    />
  );
}
