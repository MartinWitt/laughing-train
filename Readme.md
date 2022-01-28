# Laughing-train - java code refactoring tool

A code refactoring tool for java created with jgit and spoon for small diffs.

## General Info

This project is a java refactoring tool. It refactors multiple code smells in a java project. The refactorings are created with spoon and directly printed in the original source code. The changes or git-diffs are created with jgit and committed to a chosen branch. The full source file is not rewritten, but only the changed section. This reduces the diffs and the git-commits. For this we use a modified SniperJavaPrettyPrinter which detects modified sections and prints them in the diff.

## Technologies

Project is created with:
 - jgit 
 - spoon

## Features:
See https://github.com/MartinWitt/laughing-train/blob/gh-pages/BadSmells.md  
The following refactorings are currently supported:

  ### Junit4 Refactoring
  * Replace Junit 4 with Junit 5 `@Test` Annotation
  * Replace Junit 4 method sequence annotations with their Junit 5 replacements
  * Replace Junit 4 Asserts with Junit 5 Assertions
  * Replace Junit 4 expected exceptions with Junit 5 `assertThrows`
  * Replace Junit 4 Timeout value with Junit 5 Timeout annotation
  * Replace Junit 4 `Ignore` with Junit 5 `@Disabled` Annotation
  * Replace Junit 4 assertThat with Junit 5 `org.hamcrest.MatcherAssert.assertThat`
  ### Qodana Smell Refactoring
  * Replacement of `String.equals("")` with `String.isEmpty()`
  * Replacement of `Collection.size()==0` with `Collection.isEmpty()`
  * Replacement of `Collection.size()>0` with `!Collection.isEmpty()`
  * Removal of unnecessary field initialization, for example `boolean value = false` to `boolean value`
  * Replacement of `== true` and `== false` checks
  ### Multiple Refactorings
  * Removal of redundant superclass and superinterfaces
  * Add of missing override annotations
  * Removal of unused import statements
  * Sorting of import statements by JLS order(java, non-static, static)
## Setup:
  TODO
## Get started in 3 seconds
1. Checkout the repo
2. Open the repo inside your favorite IDE
3. https://github.com/MartinWitt/laughing-train/blob/9ffbb1abf75f999604a28a36c7989684f863d1a9/code-transformation/src/main/resources/app.properties insert your desired values here
4. Open https://github.com/MartinWitt/laughing-train/blob/78bde9fd069c9888ed87ce877916b993dbb35764/code-transformation/src/test/java/xyz/keksdose/spoon/code_solver/API.java
And try it yourself. If you want to change the used processor edit them here https://github.com/MartinWitt/laughing-train/blob/master/code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/TransformationEngine.java#L68

## Try it yourself(often out of date):

Create a gist, copy the ID and go to:
http://89.58.15.157:8080/refactor/`$your_GIST_ID`
The ID of https://gist.github.com/MartinWitt/a7fb7ce3d03e6a2e0cafcaa5e2dc20d1 is `a7fb7ce3d03e6a2e0cafcaa5e2dc20d1`
