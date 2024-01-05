import { gql } from '@apollo/client';
import * as Apollo from '@apollo/client';
export type Maybe<T> = T | null;
export type InputMaybe<T> = Maybe<T>;
export type Exact<T extends { [key: string]: unknown }> = { [K in keyof T]: T[K] };
export type MakeOptional<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]?: Maybe<T[SubKey]> };
export type MakeMaybe<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]: Maybe<T[SubKey]> };
export type MakeEmpty<T extends { [key: string]: unknown }, K extends keyof T> = { [_ in K]?: never };
export type Incremental<T> = T | { [P in keyof T]?: P extends ' $fragmentName' | '__typename' ? T[P] : never };
const defaultOptions = {} as const;
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
  commitHash?: Maybe<Scalars['String']['output']>;
};

/** Mutation root */
export type Mutation = {
  __typename?: 'Mutation';
  /** Adds a project to the database */
  addProject?: Maybe<Project>;
  /** Deletes a project from the database */
  deleteProject?: Maybe<Array<Maybe<Project>>>;
  mineProject: Scalars['Boolean']['output'];
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
export type MutationMineProjectArgs = {
  url?: InputMaybe<Scalars['String']['input']>;
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
  /** Returns all github commits for a project from the database */
  getGitHubCommitsForProject?: Maybe<Array<Maybe<GitHubCommit>>>;
  /** Gets project with given name from the database */
  getProjectWithName?: Maybe<Project>;
  /** Gets all projects from the database */
  getProjects?: Maybe<Array<Maybe<Project>>>;
  /** Logins the user */
  login?: Maybe<Scalars['String']['output']>;
  recentRuns?: Maybe<Array<Maybe<AnalyzerRun>>>;
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
export type QueryGetGitHubCommitsForProjectArgs = {
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
export type QueryRecentRunsArgs = {
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

export type GetProjectsQueryVariables = Exact<{ [key: string]: never; }>;


export type GetProjectsQuery = { __typename?: 'Query', getProjects?: Array<{ __typename?: 'Project', projectName?: string | null, projectUrl?: string | null, commits?: Array<{ __typename?: 'GitHubCommit', commitHash?: string | null } | null> | null } | null> | null };

export type RecentAnalyzerRunsQueryVariables = Exact<{ [key: string]: never; }>;


export type RecentAnalyzerRunsQuery = { __typename?: 'Query', recentRuns?: Array<{ __typename?: 'AnalyzerRun', analyzerName?: string | null, commitHash?: string | null, numberOfIssues: number, projectName?: string | null, projectUrl?: string | null, status?: string | null, timestamp?: string | null } | null> | null };

export type RecentRunsQueryVariables = Exact<{ [key: string]: never; }>;


export type RecentRunsQuery = { __typename?: 'Query', recentRuns?: Array<{ __typename?: 'AnalyzerRun', analyzerName?: string | null, commitHash?: string | null, numberOfIssues: number, projectName?: string | null, projectUrl?: string | null, status?: string | null, timestamp?: string | null } | null> | null };

export type GetAvailableRefactoringsQueryVariables = Exact<{ [key: string]: never; }>;


export type GetAvailableRefactoringsQuery = { __typename?: 'Query', availableRefactorings?: Array<never | null> | null };

export type GetBadSmellsForHashQueryVariables = Exact<{
  hash?: InputMaybe<Scalars['String']['input']>;
}>;


export type GetBadSmellsForHashQuery = { __typename?: 'Query', byCommitHash?: Array<{ __typename?: 'BadSmell', identifier?: string | null, ruleID?: string | null, messageMarkdown?: string | null, snippet?: string | null, filePath?: string | null, position?: { __typename?: 'Position', startLine: number } | null } | null> | null };

export type AddProjectMutationVariables = Exact<{
  projectName: Scalars['String']['input'];
  projectUrl: Scalars['String']['input'];
}>;


export type AddProjectMutation = { __typename?: 'Mutation', addProject?: { __typename?: 'Project', projectName?: string | null, projectUrl?: string | null } | null };

export type RefactorMutationVariables = Exact<{
  badSmellIdentifier?: InputMaybe<Array<InputMaybe<Scalars['String']['input']>> | InputMaybe<Scalars['String']['input']>>;
}>;


export type RefactorMutation = { __typename?: 'Mutation', refactor?: string | null };

export type LoginQueryVariables = Exact<{
  notNeeded?: InputMaybe<Scalars['String']['input']>;
}>;


export type LoginQuery = { __typename?: 'Query', login?: string | null };


export const GetProjectsDocument = gql`
    query getProjects {
  getProjects {
    projectName
    projectUrl
    commits {
      commitHash
    }
  }
}
    `;

/**
 * __useGetProjectsQuery__
 *
 * To run a query within a React component, call `useGetProjectsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetProjectsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetProjectsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetProjectsQuery(baseOptions?: Apollo.QueryHookOptions<GetProjectsQuery, GetProjectsQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<GetProjectsQuery, GetProjectsQueryVariables>(GetProjectsDocument, options);
      }
export function useGetProjectsLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<GetProjectsQuery, GetProjectsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<GetProjectsQuery, GetProjectsQueryVariables>(GetProjectsDocument, options);
        }
export function useGetProjectsSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<GetProjectsQuery, GetProjectsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<GetProjectsQuery, GetProjectsQueryVariables>(GetProjectsDocument, options);
        }
export type GetProjectsQueryHookResult = ReturnType<typeof useGetProjectsQuery>;
export type GetProjectsLazyQueryHookResult = ReturnType<typeof useGetProjectsLazyQuery>;
export type GetProjectsSuspenseQueryHookResult = ReturnType<typeof useGetProjectsSuspenseQuery>;
export type GetProjectsQueryResult = Apollo.QueryResult<GetProjectsQuery, GetProjectsQueryVariables>;
export const RecentAnalyzerRunsDocument = gql`
    query recentAnalyzerRuns {
  recentRuns(size: 30) {
    analyzerName
    commitHash
    numberOfIssues
    projectName
    projectUrl
    status
    timestamp
  }
}
    `;

/**
 * __useRecentAnalyzerRunsQuery__
 *
 * To run a query within a React component, call `useRecentAnalyzerRunsQuery` and pass it any options that fit your needs.
 * When your component renders, `useRecentAnalyzerRunsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useRecentAnalyzerRunsQuery({
 *   variables: {
 *   },
 * });
 */
export function useRecentAnalyzerRunsQuery(baseOptions?: Apollo.QueryHookOptions<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>(RecentAnalyzerRunsDocument, options);
      }
export function useRecentAnalyzerRunsLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>(RecentAnalyzerRunsDocument, options);
        }
export function useRecentAnalyzerRunsSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>(RecentAnalyzerRunsDocument, options);
        }
export type RecentAnalyzerRunsQueryHookResult = ReturnType<typeof useRecentAnalyzerRunsQuery>;
export type RecentAnalyzerRunsLazyQueryHookResult = ReturnType<typeof useRecentAnalyzerRunsLazyQuery>;
export type RecentAnalyzerRunsSuspenseQueryHookResult = ReturnType<typeof useRecentAnalyzerRunsSuspenseQuery>;
export type RecentAnalyzerRunsQueryResult = Apollo.QueryResult<RecentAnalyzerRunsQuery, RecentAnalyzerRunsQueryVariables>;
export const RecentRunsDocument = gql`
    query recentRuns {
  recentRuns(size: 30) {
    analyzerName
    commitHash
    numberOfIssues
    projectName
    projectUrl
    status
    timestamp
  }
}
    `;

/**
 * __useRecentRunsQuery__
 *
 * To run a query within a React component, call `useRecentRunsQuery` and pass it any options that fit your needs.
 * When your component renders, `useRecentRunsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useRecentRunsQuery({
 *   variables: {
 *   },
 * });
 */
export function useRecentRunsQuery(baseOptions?: Apollo.QueryHookOptions<RecentRunsQuery, RecentRunsQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<RecentRunsQuery, RecentRunsQueryVariables>(RecentRunsDocument, options);
      }
export function useRecentRunsLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<RecentRunsQuery, RecentRunsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<RecentRunsQuery, RecentRunsQueryVariables>(RecentRunsDocument, options);
        }
export function useRecentRunsSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<RecentRunsQuery, RecentRunsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<RecentRunsQuery, RecentRunsQueryVariables>(RecentRunsDocument, options);
        }
export type RecentRunsQueryHookResult = ReturnType<typeof useRecentRunsQuery>;
export type RecentRunsLazyQueryHookResult = ReturnType<typeof useRecentRunsLazyQuery>;
export type RecentRunsSuspenseQueryHookResult = ReturnType<typeof useRecentRunsSuspenseQuery>;
export type RecentRunsQueryResult = Apollo.QueryResult<RecentRunsQuery, RecentRunsQueryVariables>;
export const GetAvailableRefactoringsDocument = gql`
    query getAvailableRefactorings {
  availableRefactorings {
    ruleId {
      id
    }
  }
}
    `;

/**
 * __useGetAvailableRefactoringsQuery__
 *
 * To run a query within a React component, call `useGetAvailableRefactoringsQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetAvailableRefactoringsQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetAvailableRefactoringsQuery({
 *   variables: {
 *   },
 * });
 */
export function useGetAvailableRefactoringsQuery(baseOptions?: Apollo.QueryHookOptions<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>(GetAvailableRefactoringsDocument, options);
      }
export function useGetAvailableRefactoringsLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>(GetAvailableRefactoringsDocument, options);
        }
export function useGetAvailableRefactoringsSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>(GetAvailableRefactoringsDocument, options);
        }
export type GetAvailableRefactoringsQueryHookResult = ReturnType<typeof useGetAvailableRefactoringsQuery>;
export type GetAvailableRefactoringsLazyQueryHookResult = ReturnType<typeof useGetAvailableRefactoringsLazyQuery>;
export type GetAvailableRefactoringsSuspenseQueryHookResult = ReturnType<typeof useGetAvailableRefactoringsSuspenseQuery>;
export type GetAvailableRefactoringsQueryResult = Apollo.QueryResult<GetAvailableRefactoringsQuery, GetAvailableRefactoringsQueryVariables>;
export const GetBadSmellsForHashDocument = gql`
    query getBadSmellsForHash($hash: String) {
  byCommitHash(commitHash: $hash) {
    identifier
    ruleID
    messageMarkdown
    snippet
    filePath
    position {
      startLine
    }
  }
}
    `;

/**
 * __useGetBadSmellsForHashQuery__
 *
 * To run a query within a React component, call `useGetBadSmellsForHashQuery` and pass it any options that fit your needs.
 * When your component renders, `useGetBadSmellsForHashQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useGetBadSmellsForHashQuery({
 *   variables: {
 *      hash: // value for 'hash'
 *   },
 * });
 */
export function useGetBadSmellsForHashQuery(baseOptions?: Apollo.QueryHookOptions<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>(GetBadSmellsForHashDocument, options);
      }
export function useGetBadSmellsForHashLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>(GetBadSmellsForHashDocument, options);
        }
export function useGetBadSmellsForHashSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>(GetBadSmellsForHashDocument, options);
        }
export type GetBadSmellsForHashQueryHookResult = ReturnType<typeof useGetBadSmellsForHashQuery>;
export type GetBadSmellsForHashLazyQueryHookResult = ReturnType<typeof useGetBadSmellsForHashLazyQuery>;
export type GetBadSmellsForHashSuspenseQueryHookResult = ReturnType<typeof useGetBadSmellsForHashSuspenseQuery>;
export type GetBadSmellsForHashQueryResult = Apollo.QueryResult<GetBadSmellsForHashQuery, GetBadSmellsForHashQueryVariables>;
export const AddProjectDocument = gql`
    mutation addProject($projectName: String!, $projectUrl: String!) {
  addProject(projectName: $projectName, projectUrl: $projectUrl) {
    projectName
    projectUrl
  }
}
    `;
export type AddProjectMutationFn = Apollo.MutationFunction<AddProjectMutation, AddProjectMutationVariables>;

/**
 * __useAddProjectMutation__
 *
 * To run a mutation, you first call `useAddProjectMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useAddProjectMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [addProjectMutation, { data, loading, error }] = useAddProjectMutation({
 *   variables: {
 *      projectName: // value for 'projectName'
 *      projectUrl: // value for 'projectUrl'
 *   },
 * });
 */
export function useAddProjectMutation(baseOptions?: Apollo.MutationHookOptions<AddProjectMutation, AddProjectMutationVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useMutation<AddProjectMutation, AddProjectMutationVariables>(AddProjectDocument, options);
      }
export type AddProjectMutationHookResult = ReturnType<typeof useAddProjectMutation>;
export type AddProjectMutationResult = Apollo.MutationResult<AddProjectMutation>;
export type AddProjectMutationOptions = Apollo.BaseMutationOptions<AddProjectMutation, AddProjectMutationVariables>;
export const RefactorDocument = gql`
    mutation refactor($badSmellIdentifier: [String]) {
  refactor(badSmellIdentifier: $badSmellIdentifier)
}
    `;
export type RefactorMutationFn = Apollo.MutationFunction<RefactorMutation, RefactorMutationVariables>;

/**
 * __useRefactorMutation__
 *
 * To run a mutation, you first call `useRefactorMutation` within a React component and pass it any options that fit your needs.
 * When your component renders, `useRefactorMutation` returns a tuple that includes:
 * - A mutate function that you can call at any time to execute the mutation
 * - An object with fields that represent the current status of the mutation's execution
 *
 * @param baseOptions options that will be passed into the mutation, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options-2;
 *
 * @example
 * const [refactorMutation, { data, loading, error }] = useRefactorMutation({
 *   variables: {
 *      badSmellIdentifier: // value for 'badSmellIdentifier'
 *   },
 * });
 */
export function useRefactorMutation(baseOptions?: Apollo.MutationHookOptions<RefactorMutation, RefactorMutationVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useMutation<RefactorMutation, RefactorMutationVariables>(RefactorDocument, options);
      }
export type RefactorMutationHookResult = ReturnType<typeof useRefactorMutation>;
export type RefactorMutationResult = Apollo.MutationResult<RefactorMutation>;
export type RefactorMutationOptions = Apollo.BaseMutationOptions<RefactorMutation, RefactorMutationVariables>;
export const LoginDocument = gql`
    query login($notNeeded: String) {
  login(notNeeded: $notNeeded)
}
    `;

/**
 * __useLoginQuery__
 *
 * To run a query within a React component, call `useLoginQuery` and pass it any options that fit your needs.
 * When your component renders, `useLoginQuery` returns an object from Apollo Client that contains loading, error, and data properties
 * you can use to render your UI.
 *
 * @param baseOptions options that will be passed into the query, supported options are listed on: https://www.apollographql.com/docs/react/api/react-hooks/#options;
 *
 * @example
 * const { data, loading, error } = useLoginQuery({
 *   variables: {
 *      notNeeded: // value for 'notNeeded'
 *   },
 * });
 */
export function useLoginQuery(baseOptions?: Apollo.QueryHookOptions<LoginQuery, LoginQueryVariables>) {
        const options = {...defaultOptions, ...baseOptions}
        return Apollo.useQuery<LoginQuery, LoginQueryVariables>(LoginDocument, options);
      }
export function useLoginLazyQuery(baseOptions?: Apollo.LazyQueryHookOptions<LoginQuery, LoginQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useLazyQuery<LoginQuery, LoginQueryVariables>(LoginDocument, options);
        }
export function useLoginSuspenseQuery(baseOptions?: Apollo.SuspenseQueryHookOptions<LoginQuery, LoginQueryVariables>) {
          const options = {...defaultOptions, ...baseOptions}
          return Apollo.useSuspenseQuery<LoginQuery, LoginQueryVariables>(LoginDocument, options);
        }
export type LoginQueryHookResult = ReturnType<typeof useLoginQuery>;
export type LoginLazyQueryHookResult = ReturnType<typeof useLoginLazyQuery>;
export type LoginSuspenseQueryHookResult = ReturnType<typeof useLoginSuspenseQuery>;
export type LoginQueryResult = Apollo.QueryResult<LoginQuery, LoginQueryVariables>;