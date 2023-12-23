/* eslint-disable */
import { gql } from '@apollo/client';
export type Maybe<T> = T | null;
export type InputMaybe<T> = Maybe<T>;
export type Exact<T extends { [key: string]: unknown }> = { [K in keyof T]: T[K] };
export type MakeOptional<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]?: Maybe<T[SubKey]> };
export type MakeMaybe<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]: Maybe<T[SubKey]> };
export type MakeEmpty<T extends { [key: string]: unknown }, K extends keyof T> = { [_ in K]?: never };
export type Incremental<T> = T | { [P in keyof T]?: P extends ' $fragmentName' | '__typename' ? T[P] : never };
/** All built-in and custom scalars, mapped to their actual values */
export type Scalars = {
  ID: { input: string; output: string; }
  String: { input: string; output: string; }
  Boolean: { input: boolean; output: boolean; }
  Int: { input: number; output: number; }
  Float: { input: number; output: number; }
};

export type AnalyzerRule = {
  ruleId?: Maybe<RuleId>;
};

export type AnalyzerRun = {
  __typename?: 'AnalyzerRun';
  analyzerName?: Maybe<Scalars['String']['output']>;
  commitHash?: Maybe<Scalars['String']['output']>;
  numberOfIssues: Scalars['Int']['output'];
  projectName?: Maybe<Scalars['String']['output']>;
  projectUrl?: Maybe<Scalars['String']['output']>;
  status?: Maybe<Scalars['String']['output']>;
  timestamp?: Maybe<Scalars['String']['output']>;
};

export type AnalyzerStatus = {
  __typename?: 'AnalyzerStatus';
  analyzerName?: Maybe<Scalars['String']['output']>;
  commitHash?: Maybe<Scalars['String']['output']>;
  numberOfIssues: Scalars['Int']['output'];
  status?: Maybe<Status>;
};

export type BadSmell = {
  __typename?: 'BadSmell';
  analyzer?: Maybe<Scalars['String']['output']>;
  commitHashes?: Maybe<Array<Maybe<Scalars['String']['output']>>>;
  filePath?: Maybe<Scalars['String']['output']>;
  identifier?: Maybe<Scalars['String']['output']>;
  messageMarkdown?: Maybe<Scalars['String']['output']>;
  name?: Maybe<Scalars['String']['output']>;
  position?: Maybe<Position>;
  ruleID?: Maybe<Scalars['String']['output']>;
  snippet?: Maybe<Scalars['String']['output']>;
};

export type GitHubCommit = {
  __typename?: 'GitHubCommit';
  analyzerStatuses?: Maybe<Array<Maybe<AnalyzerStatus>>>;
  commitHash?: Maybe<Scalars['String']['output']>;
};

/** Mutation root */
export type Mutation = {
  __typename?: 'Mutation';
  /** Adds a project to the database */
  addProject?: Maybe<Project>;
  /** Deletes a project from the database */
  deleteProject?: Maybe<Array<Maybe<Project>>>;
  /** Refactoring the given bad smells */
  refactor?: Maybe<Scalars['String']['output']>;
};


/** Mutation root */
export type MutationAddProjectArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
  projectUrl?: InputMaybe<Scalars['String']['input']>;
};


/** Mutation root */
export type MutationDeleteProjectArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
};


/** Mutation root */
export type MutationRefactorArgs = {
  badSmellIdentifier?: InputMaybe<Array<InputMaybe<Scalars['String']['input']>>>;
};

export type Position = {
  __typename?: 'Position';
  charLength: Scalars['Int']['output'];
  charOffset: Scalars['Int']['output'];
  endColumn: Scalars['Int']['output'];
  endLine: Scalars['Int']['output'];
  startColumn: Scalars['Int']['output'];
  startLine: Scalars['Int']['output'];
};

export type Project = {
  __typename?: 'Project';
  commitHashes?: Maybe<Array<Maybe<Scalars['String']['output']>>>;
  commits?: Maybe<Array<Maybe<GitHubCommit>>>;
  projectName?: Maybe<Scalars['String']['output']>;
  projectUrl?: Maybe<Scalars['String']['output']>;
};

export enum QodanaRules {
  CodeBlock_2Expr = 'CODE_BLOCK_2_EXPR',
  InnerClassMayBeStatic = 'INNER_CLASS_MAY_BE_STATIC',
  MethodMayBeStatic = 'METHOD_MAY_BE_STATIC',
  NonProtectedConstructorInAbstractClass = 'NON_PROTECTED_CONSTRUCTOR_IN_ABSTRACT_CLASS',
  NonStrictComparisonCanBeEquality = 'NON_STRICT_COMPARISON_CAN_BE_EQUALITY',
  ParameterNameDiffersFromOverriddenParameter = 'PARAMETER_NAME_DIFFERS_FROM_OVERRIDDEN_PARAMETER',
  PointlessBooleanExpression = 'POINTLESS_BOOLEAN_EXPRESSION',
  ProtectedMemberInFinalClass = 'PROTECTED_MEMBER_IN_FINAL_CLASS',
  RedundantArrayCreation = 'REDUNDANT_ARRAY_CREATION',
  SizeReplaceableByIsEmpty = 'SIZE_REPLACEABLE_BY_IS_EMPTY',
  ToArrayCallWithZeroLengthArrayArgument = 'TO_ARRAY_CALL_WITH_ZERO_LENGTH_ARRAY_ARGUMENT',
  UnnecessaryInterfaceModifier = 'UNNECESSARY_INTERFACE_MODIFIER',
  UnnecessaryLocalVariable = 'UNNECESSARY_LOCAL_VARIABLE',
  UnnecessaryModifier = 'UNNECESSARY_MODIFIER',
  UnnecessaryReturn = 'UNNECESSARY_RETURN',
  UnnecessaryStringEscape = 'UNNECESSARY_STRING_ESCAPE',
  UnnecessaryToStringCall = 'UNNECESSARY_TO_STRING_CALL',
  UnusedImport = 'UNUSED_IMPORT',
  UnusedLabel = 'UNUSED_LABEL',
  UtilityClassWithoutPrivateConstructor = 'UTILITY_CLASS_WITHOUT_PRIVATE_CONSTRUCTOR'
}

/** Query root */
export type Query = {
  __typename?: 'Query';
  /** Returns a list of all available refactorings */
  availableRefactorings?: Maybe<Array<Maybe<AnalyzerRule>>>;
  /** Gets all bad smells from the database by analyzer and commitHash */
  byAndAnalyzerAndCommitHash?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all bad smells from the database by commitHash */
  byCommitHash?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all bad smells from the database by identifier */
  byIdentifier?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all bad smells from the database by projectName */
  byProjectName?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all bad smells from the database by ruleID */
  byRuleID?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all bad smells from the database by ruleID and analyzer and commitHash */
  byRuleIDAndAnalyzerAndCommitHash?: Maybe<Array<Maybe<BadSmell>>>;
  /** Gets all fixable bad smells rules */
  fixableBadSmells?: Maybe<Array<Maybe<Scalars['String']['output']>>>;
  /** Gets all fixable bad smells from the database by projectUrl */
  fixableByProjectName?: Maybe<Array<Maybe<BadSmell>>>;
  /** Returns all github commits for a project from the database */
  getGitHubCommitsForProject?: Maybe<Array<Maybe<GitHubCommit>>>;
  /** Gets all commit hashes for a project from the database */
  getHashesForProject?: Maybe<Array<Maybe<Scalars['String']['output']>>>;
  /** Gets project with given name from the database */
  getProjectWithName?: Maybe<Project>;
  /** Gets all projects from the database */
  getProjects?: Maybe<Array<Maybe<Project>>>;
  /** Logins the user */
  login?: Maybe<Scalars['String']['output']>;
  /** Returns a sorted by date list of recent analyzer runs */
  recentAnalyzerRuns?: Maybe<Array<Maybe<AnalyzerRun>>>;
};


/** Query root */
export type QueryByAndAnalyzerAndCommitHashArgs = {
  analyzer?: InputMaybe<Scalars['String']['input']>;
  commitHash?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryByCommitHashArgs = {
  commitHash?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryByIdentifierArgs = {
  identifier?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryByProjectNameArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryByRuleIdArgs = {
  ruleID?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryByRuleIdAndAnalyzerAndCommitHashArgs = {
  analyzer?: InputMaybe<Scalars['String']['input']>;
  commitHash?: InputMaybe<Scalars['String']['input']>;
  ruleID?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryFixableByProjectNameArgs = {
  projectUrl?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryGetGitHubCommitsForProjectArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryGetHashesForProjectArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryGetProjectWithNameArgs = {
  projectName?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryLoginArgs = {
  notNeeded?: InputMaybe<Scalars['String']['input']>;
};


/** Query root */
export type QueryRecentAnalyzerRunsArgs = {
  size: Scalars['Int']['input'];
};

export type RuleId = {
  __typename?: 'RuleId';
  id?: Maybe<Scalars['String']['output']>;
};

export enum SpoonRules {
  AccessStaticViaInstance = 'ACCESS_STATIC_VIA_INSTANCE',
  IndexOfReplaceableByContains = 'INDEX_OF_REPLACEABLE_BY_CONTAINS',
  UnnecessaryImplements = 'UNNECESSARY_IMPLEMENTS',
  UnnecessaryToString = 'UNNECESSARY_TO_STRING'
}

export enum Status {
  Failure = 'FAILURE',
  Success = 'SUCCESS'
}
