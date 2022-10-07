
export type BadSmell = {
  id: string
  name: string
  messageMarkdown: string
  snippet: string
  ruleID: string
  commitHashes: [string]
  filePath: string
  startLine: number
}