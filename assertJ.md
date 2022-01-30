# Change Log
## The following bad smells are found in the code:
### EmptyStringCheck
- Empty String check was written as `c.getSimpleName().equals("")` and refactored to `c.getSimpleName().isEmpty()``org.assertj.core.presentation.StandardRepresentation`
- Empty String check was written as `extension.equals("")` and refactored to `extension.isEmpty()``org.assertj.core.util.Files`
