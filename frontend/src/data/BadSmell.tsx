import { Position } from "./Position"

export type BadSmell = {
  identifier: string
  name: string
  messageMarkdown: string
  snippet: string
  ruleID: string
  commitHashes: [string]
  filePath: string
  position: Position
}