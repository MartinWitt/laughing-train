export type AnalyzerStatus = {
  analyzerName: string;
  commitHash: string;
  localDateTime: string;
  numberOfIssues: number;
  status: Status;
};

export type Status = 'SUCCESS' | 'FAILURE';
