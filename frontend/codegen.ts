
import type { CodegenConfig } from '@graphql-codegen/cli';

const config: CodegenConfig = {
  overwrite: true,
  schema: "http://localhost:8080/graphql/schema.graphql",
  //documents: "src/**/*.tsx",
  generates: {
    "src/gql/": {
      preset: "client",
      plugins: ["typescript-react-apollo", "typescript-operations"],
      hooks: {
        afterAllFileWrite: ["prettier --write"],
      }
    },
  }
};

export default config;
