import { Position } from "./Position"
import { RuleID } from "./RuleID"

export type BadSmell = {
  identifier: string
  id: string
  name: string
  messageMarkdown: string
  snippet: string
  ruleID: RuleID
  commitHashes: [string]
  filePath: string
  position: Position
}