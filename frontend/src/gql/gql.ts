/* eslint-disable */
import * as types from './graphql';
import { TypedDocumentNode as DocumentNode } from '@graphql-typed-document-node/core';

/**
 * Map of all GraphQL operations in the project.
 *
 * This map has several performance disadvantages:
 * 1. It is not tree-shakeable, so it will include all operations in the project.
 * 2. It is not minifiable, so the string of a GraphQL query will be multiple times inside the bundle.
 * 3. It does not support dead code elimination, so it will add unused operations.
 *
 * Therefore it is highly recommended to use the babel or swc plugin for production.
 */
const documents = {
    "\n  query getProjects {\n    getProjects {\n      projectName\n      projectUrl\n      commitHashes\n      commits {\n        analyzerStatuses {\n          analyzerName\n          commitHash\n          localDateTime\n          numberOfIssues\n          status\n        }\n        commitHash\n      }\n    }\n  }\n": types.GetProjectsDocument,
    "\n  query recentAnalyzerRuns {\n    recentAnalyzerRuns(size: 30) {\n      analyzerName\n      commitHash\n      timestamp\n      numberOfIssues\n      projectName\n      projectUrl\n      status\n    }\n  }\n": types.RecentAnalyzerRunsDocument,
    "\n  query getAvailableRefactorings {\n    availableRefactorings {\n      ruleId {\n        id\n      }\n    }\n  }\n": types.GetAvailableRefactoringsDocument,
    "\n  query getBadSmellsForHash($hash: String) {\n    byCommitHash(commitHash: $hash) {\n      identifier\n      ruleID\n      messageMarkdown\n      snippet\n      filePath\n      position {\n        startLine\n      }\n    }\n  }\n": types.GetBadSmellsForHashDocument,
    "\n  mutation addProject($projectName: String!, $projectUrl: String!) {\n    addProject(projectName: $projectName, projectUrl: $projectUrl) {\n      projectName\n      projectUrl\n    }\n  }\n": types.AddProjectDocument,
    "\n  mutation refactor($badSmellIdentifier: [String]) {\n    refactor(badSmellIdentifier: $badSmellIdentifier)\n  }\n": types.RefactorDocument,
    "\n  query login($notNeeded: String) {\n    login(notNeeded: $notNeeded)\n  }\n": types.LoginDocument,
    "\n  query getGitHubCommitsForProject($projectName: String!) {\n    getGitHubCommitsForProject(projectName: $projectName) {\n      analyzerStatuses {\n        analyzerName\n        commitHash\n        localDateTime\n        numberOfIssues\n        status\n      }\n      commitHash\n    }\n  }\n": types.GetGitHubCommitsForProjectDocument,
};

/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 *
 *
 * @example
 * ```ts
 * const query = graphql(`query GetUser($id: ID!) { user(id: $id) { name } }`);
 * ```
 *
 * The query argument is unknown!
 * Please regenerate the types.
 */
export function graphql(source: string): unknown;

/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query getProjects {\n    getProjects {\n      projectName\n      projectUrl\n      commitHashes\n      commits {\n        analyzerStatuses {\n          analyzerName\n          commitHash\n          localDateTime\n          numberOfIssues\n          status\n        }\n        commitHash\n      }\n    }\n  }\n"): (typeof documents)["\n  query getProjects {\n    getProjects {\n      projectName\n      projectUrl\n      commitHashes\n      commits {\n        analyzerStatuses {\n          analyzerName\n          commitHash\n          localDateTime\n          numberOfIssues\n          status\n        }\n        commitHash\n      }\n    }\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query recentAnalyzerRuns {\n    recentAnalyzerRuns(size: 30) {\n      analyzerName\n      commitHash\n      timestamp\n      numberOfIssues\n      projectName\n      projectUrl\n      status\n    }\n  }\n"): (typeof documents)["\n  query recentAnalyzerRuns {\n    recentAnalyzerRuns(size: 30) {\n      analyzerName\n      commitHash\n      timestamp\n      numberOfIssues\n      projectName\n      projectUrl\n      status\n    }\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query getAvailableRefactorings {\n    availableRefactorings {\n      ruleId {\n        id\n      }\n    }\n  }\n"): (typeof documents)["\n  query getAvailableRefactorings {\n    availableRefactorings {\n      ruleId {\n        id\n      }\n    }\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query getBadSmellsForHash($hash: String) {\n    byCommitHash(commitHash: $hash) {\n      identifier\n      ruleID\n      messageMarkdown\n      snippet\n      filePath\n      position {\n        startLine\n      }\n    }\n  }\n"): (typeof documents)["\n  query getBadSmellsForHash($hash: String) {\n    byCommitHash(commitHash: $hash) {\n      identifier\n      ruleID\n      messageMarkdown\n      snippet\n      filePath\n      position {\n        startLine\n      }\n    }\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  mutation addProject($projectName: String!, $projectUrl: String!) {\n    addProject(projectName: $projectName, projectUrl: $projectUrl) {\n      projectName\n      projectUrl\n    }\n  }\n"): (typeof documents)["\n  mutation addProject($projectName: String!, $projectUrl: String!) {\n    addProject(projectName: $projectName, projectUrl: $projectUrl) {\n      projectName\n      projectUrl\n    }\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  mutation refactor($badSmellIdentifier: [String]) {\n    refactor(badSmellIdentifier: $badSmellIdentifier)\n  }\n"): (typeof documents)["\n  mutation refactor($badSmellIdentifier: [String]) {\n    refactor(badSmellIdentifier: $badSmellIdentifier)\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query login($notNeeded: String) {\n    login(notNeeded: $notNeeded)\n  }\n"): (typeof documents)["\n  query login($notNeeded: String) {\n    login(notNeeded: $notNeeded)\n  }\n"];
/**
 * The graphql function is used to parse GraphQL queries into a document that can be used by GraphQL clients.
 */
export function graphql(source: "\n  query getGitHubCommitsForProject($projectName: String!) {\n    getGitHubCommitsForProject(projectName: $projectName) {\n      analyzerStatuses {\n        analyzerName\n        commitHash\n        localDateTime\n        numberOfIssues\n        status\n      }\n      commitHash\n    }\n  }\n"): (typeof documents)["\n  query getGitHubCommitsForProject($projectName: String!) {\n    getGitHubCommitsForProject(projectName: $projectName) {\n      analyzerStatuses {\n        analyzerName\n        commitHash\n        localDateTime\n        numberOfIssues\n        status\n      }\n      commitHash\n    }\n  }\n"];

export function graphql(source: string) {
  return (documents as any)[source] ?? {};
}

export type DocumentType<TDocumentNode extends DocumentNode<any, any>> = TDocumentNode extends DocumentNode<  infer TType,  any>  ? TType  : never;