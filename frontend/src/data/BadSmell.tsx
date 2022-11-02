import { Position } from "./Position"

export type BadSmell = {
  identifier: string
  id: string
  name: string
  messageMarkdown: string
  snippet: string
  ruleID: string
  commitHashes: [string]
  filePath: string
  position: Position
}