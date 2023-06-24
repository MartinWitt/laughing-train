# teamcity-clearcase 
 
# Bad smells
I found 223 bad smells with 120 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 89 | true |
| ToArrayCallWithZeroLengthArrayArgument | 21 | true |
| JavadocDeclaration | 13 | false |
| ConstantValue | 12 | false |
| IgnoreResultOfCall | 11 | false |
| IOStreamConstructor | 10 | false |
| CommentedOutCode | 6 | false |
| UnnecessaryToStringCall | 6 | true |
| RedundantStringFormatCall | 6 | false |
| DataFlowIssue | 5 | false |
| EmptyStatementBody | 4 | false |
| StringBufferReplaceableByString | 3 | false |
| DanglingJavadoc | 3 | false |
| FieldCanBeLocal | 3 | false |
| MalformedFormatString | 3 | false |
| UnusedAssignment | 3 | false |
| JavadocReference | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| DuplicatedCode | 2 | false |
| DuplicateExpressions | 2 | false |
| TrivialIf | 2 | false |
| AutoCloseableResource | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| SpringBeanConstructorArgInspection | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| RedundantTypeArguments | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ThrowableNotThrown | 1 | false |
| StringConcatenationInLoops | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CCStorage\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCRegion.java`
#### Snippet
```java
        out.add(new CCStorage(result.getServerHost(), result.getType(), result.getTag(), result.getGlobalPath()));
      }
      return out.toArray(new CCStorage[out.size()]);

    } catch (Exception e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CCSnapshotView\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCRegion.java`
#### Snippet
```java
        out.add(new CCSnapshotView(viewDescriptor));
      }
      return out.toArray(new CCSnapshotView[out.size()]);

    } catch (Exception e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CCVob\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCRegion.java`
#### Snippet
```java
        out.add(new CCVob(result.getTag(), result.getRegion(), result.getServerHost(), result.getGlobalPath()));
      }
      return out.toArray(new CCVob[out.size()]);

    } catch (Exception e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CCDelta\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      out.add(new CCDelta(this, change.isAddition(), change.isChange(), change.isDeletion(), change.getLocalPath(), change.getRevisionBefor(), change.getRevisionAfter()));
    }
    return out.toArray(new CCDelta[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CCHistory\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      out.add(new CCHistory(this, parser));
    }
    return out.toArray(new CCHistory[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new File\[links.size()\]'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
        }
      }
      return links.toArray(new File[links.size()]);

    } catch (IOException e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new File\[linksBuffer.size()\]'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
      LOG.info(String.format("Could not create initial structure: path \"%s\" does not exist", viewSourceRoot));
    }
    return linksBuffer.toArray(new File[linksBuffer.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      if (trim.startsWith(StorageParser.NAME_TOKEN) && !buffer.isEmpty()) {
        // next_section_reached
        out.add(new StorageParser(buffer.toArray(new String[buffer.size()])));
        buffer.clear();
      }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    }
    // do_not_forget_the_last
    out.add(new StorageParser(buffer.toArray(new String[buffer.size()])));// do
    return out.toArray(new StorageParser[out.size()]);
  }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new StorageParser\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    // do_not_forget_the_last
    out.add(new StorageParser(buffer.toArray(new String[buffer.size()])));// do
    return out.toArray(new StorageParser[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        if (trim.startsWith(VobParser.TAG_TOKEN) && !buffer.isEmpty()) {
          // reach the next section
          out.add(new VobParser(buffer.toArray(new String[buffer.size()])));
          buffer.clear();
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    }
    if (!buffer.isEmpty()) {
      out.add(new VobParser(buffer.toArray(new String[buffer.size()])));// do_not_forget_the_last
    }
    return out.toArray(new VobParser[out.size()]);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new VobParser\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      out.add(new VobParser(buffer.toArray(new String[buffer.size()])));// do_not_forget_the_last
    }
    return out.toArray(new VobParser[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    }
    Collections.addAll(out, extraEnvp);
    return out.toArray(new String[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new HistoryParser\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      buffer.add(new HistoryParser(line));
    }
    return buffer.toArray(new HistoryParser[buffer.size()]);

  }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ChangeParser\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        }
      }
      return out.toArray(new ChangeParser[out.size()]);
    } finally {
      reader.close();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        if (trim.startsWith(ViewParser.TAG_TOKEN) && !buffer.isEmpty()) {
          // reach the next section
          out.add(new ViewParser(buffer.toArray(new String[buffer.size()])));
          buffer.clear();
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[buffer.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    if (!buffer.isEmpty()) {
      // do_not_forget_the_last
      out.add(new ViewParser(buffer.toArray(new String[buffer.size()])));
    }
    return out.toArray(new ViewParser[out.size()]);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ViewParser\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      out.add(new ViewParser(buffer.toArray(new String[buffer.size()])));
    }
    return out.toArray(new ViewParser[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[out.size()\]'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      }
    }
    return out.toArray(new String[out.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Pattern\[patterns.size()\]'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      }
    }
    return patterns.toArray(new Pattern[patterns.size()]);
  }
}
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcessPool.java`
#### Snippet
```java
  }
  
  public static interface ProcessRunnable {
    void run(@NotNull ClearCaseInteractiveProcess process) throws IOException, VcsException;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcessPool.java`
#### Snippet
```java
  }

  public static interface ProcessComputable<T> {
    T compute(@NotNull ClearCaseInteractiveProcess process) throws IOException, VcsException;
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ChangesInverter.java`
#### Snippet
```java
  }

  private static interface Change {
    void process() throws IOException, VcsException;
  }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String CLEARTOOL_CHECK_AVAILABLE_COMMAND = "cleartool hostinfo"; //$NON-NLS-1$

  public static String CLIENT_NOT_FOUND_MESSAGE = "Cannot run \"cleartool\": the executable cannot be found. Please ensure the ClearCase client is installed on the TeamCity server and \"cleartool\" is present in the PATH.";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String CLEARTOOL_CHECK_AVAILABLE_COMMAND = "cleartool hostinfo"; //$NON-NLS-1$

  public static String CLIENT_NOT_FOUND_MESSAGE = "Cannot run \"cleartool\": the executable cannot be found. Please ensure the ClearCase client is installed on the TeamCity server and \"cleartool\" is present in the PATH.";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String CLEARTOOL_CHECK_AVAILABLE_COMMAND = "cleartool hostinfo"; //$NON-NLS-1$

  public static String CLIENT_NOT_FOUND_MESSAGE = "Cannot run \"cleartool\": the executable cannot be found. Please ensure the ClearCase client is installed on the TeamCity server and \"cleartool\" is present in the PATH.";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
  @NonNls
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String CC_VIEW_PATH = "cc-view-path"; //$NON-NLS-1$
  @NonNls
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BASE = "BASE"; //$NON-NLS-1$
  @NonNls
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCHES = "branches"; //$NON-NLS-1$
  @NonNls
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_CUSTOM = "custom"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String CLEARTOOL_CHECK_AVAILABLE_COMMAND = "cleartool hostinfo"; //$NON-NLS-1$

  public static String CLIENT_NOT_FOUND_MESSAGE = "Cannot run \"cleartool\": the executable cannot be found. Please ensure the ClearCase client is installed on the TeamCity server and \"cleartool\" is present in the PATH.";
}

```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String CLEARTOOL_CHECK_AVAILABLE_COMMAND = "cleartool hostinfo"; //$NON-NLS-1$

  public static String CLIENT_NOT_FOUND_MESSAGE = "Cannot run \"cleartool\": the executable cannot be found. Please ensure the ClearCase client is installed on the TeamCity server and \"cleartool\" is present in the PATH.";
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String RELATIVE_PATH = "rel-path"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER = "branch-provider"; //$NON-NLS-1$
  @NonNls
  public static final String BRANCH_PROVIDER_AUTO = "auto"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String GLOBAL_LABELS_VOB = "global-labels-vob"; //$NON-NLS-1$
  @NonNls
  public static final String USE_GLOBAL_LABEL = "use-global-label"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS_NAME_ONLY = "vobs"; //$NON-NLS-1$
  @NonNls
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TYPE = "TYPE"; //$NON-NLS-1$
  @NonNls
  public static final String UCM = "UCM"; //$NON-NLS-1$
  @NonNls
  public static final String BASE = "BASE"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$

  @NonNls
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_DEFAULT_OPTIONS = "clearcase.lshistory.options.default"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_VCS_ROOT_OPTIONS_BY_ID = "clearcase.lshistory.options.vcsRoot{%d}"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String VOBS = "vobs/"; //$NON-NLS-1$
  @NonNls
  public static final String MAIN = "main"; //$NON-NLS-1$
  @NonNls
  public static final String EMPTY = ""; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String NAME = "clearcase";
  @NonNls
  public static final String VIEW_TAG = "view-tag"; //$NON-NLS-1$  
  @NonNls
  public static final String VIEW_PATH = "view-path"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_LSHISTORY_UCM_DELAY = "clearcase.lshistory.ucm.delay.seconds"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java
  public static final String TEAMCITY_PROPERTY_AGENT_DISABLE_VALIDATION_ERRORS = "clearcase.agent.checkout.disable.validation.errors"; //$NON-NLS-1$  
  @NonNls
  public static final String TEAMCITY_PROPERTY_DO_NOT_TREAT_MAIN_AS_VERSION_IDENTIFIER = "clearcase.do.not.treat.main.as.version.identifier"; //$NON-NLS-1$
  @NonNls
  public static final String TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN = "clearcase.ignore.error.pattern"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Constants.java`
#### Snippet
```java

  @NonNls
  public static final String AGENT_CONFIGSPECS_SYS_PROP_PATTERN = "vcs.clearcase.configspec.%s"; //$NON-NLS-1$
  @NonNls
  public static final String AGENT_SOURCE_VIEW_TAG_PROP_PATTERN = "vcs.clearcase.view.tag.%s"; //$NON-NLS-1$
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  
  //Executor's part
  public static interface ICommandExecutor {
    String[] execAndWait(@NotNull String command) throws IOException;
    String[] execAndWait(@NotNull String command, @NotNull File workingDirectory) throws IOException;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
  }

  protected static interface ILineFilter {
    @NotNull
    String apply(@NotNull final String line);
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  }

  public static interface ConnectionProcessor {
    void process(@NotNull ClearCaseConnection connection) throws VcsException, IOException;
  }
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
    final long deadline = System.currentTimeMillis() + readTimeoutSeconds * 1000;

    while (true) {
      if (myInput.available() > 0) break;
      if (myError.available() > 0) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `http`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
   * Output will be discarded next to the method invocation
   *
   * @see http://youtrack.jetbrains.net/issue/TW-17141
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `sourceViewTag`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * 
   * @param root
   * @param sourceViewTag
   * @param viewRoot
   * @param logger
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `findVersionByNum` may produce `NullPointerException`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
    }

    return currentBranch.findVersionByNum(intVersion);
  }

```

### DataFlowIssue
Dereference of `parent.listFiles()` may produce `NullPointerException`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    while (parent != null) {
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
      }
```

### DataFlowIssue
Dereference of `absoluteLinkSource.listFiles()` may produce `NullPointerException`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
    if (linkTarget.exists() && linkTarget.isDirectory()) {// have to create link to each entry as far target can be created by other vcs root
      LOG.info(String.format("Target \"%s\" already exists. Create links for all children reqursive", linkTarget));
      for (File linkSourceChild : absoluteLinkSource.listFiles()) {
        createLinks(ccview, linkSourceChild, linkTarget, linkBuffer);
      }
```

### DataFlowIssue
Dereference of `viewSourceRoot.listFiles()` may produce `NullPointerException`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
    final File viewSourceRoot = new File(ccview.getLocalPath(), pathWithinView.trim());
    if (viewSourceRoot.exists()) {
      for (final File viewSourceEntry : viewSourceRoot.listFiles()) {// it's wrong
        createLinks(ccview, viewSourceEntry, publishTo, linksBuffer);
      }
```

### DataFlowIssue
Dereference of `currentDirectory.listFiles()` may produce `NullPointerException`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        long tmpByteCount = 0;
        List<File> files = new ArrayList<File>();
        for (File subFile : currentDirectory.listFiles()) {

          // check if subfile matches
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
    } else if (ConfigSpecRuleTokens.CREATE_BRANCH.equalsIgnoreCase(trimmedfirstWord)) {
      processor.processCreateBranchRule(rule, !lineIsBlockRuleEnd);
    } else if (lineIsBlockRuleEnd) {
      // ignoring wrong lines like "end element ..."
    } else if (ConfigSpecRuleTokens.LOAD.equalsIgnoreCase(trimmedfirstWord)) {
```

### EmptyStatementBody
`if` statement has empty body
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/WriteCorrectingVersionProcessor.java`
#### Snippet
```java
        myWriteProcessor.writeFile(version, new File(relPath).getName(), text, executable);
      }
      else if (changedElement.myChangeType == ChangedElementInfo.ChangeType.DELETED_FILE) {
        //ignore
      }
```

### EmptyStatementBody
`if` statement has empty body
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    }
    myScopePattern = createPattern(removeFirstSeparatorIfNeeded(scopePattern.trim()), false);
    if (versionSelectorWithOptions.startsWith("{")) {
      //todo
    }
```

### EmptyStatementBody
`if` statement has empty body
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    }
    myVersion = normalizedVersionSelector.substring(lastSeparatorPos + 1);
    if (myVersion.startsWith("{")) {
      //todo
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      clone = new CCSnapshotView(buildViewTag, ccOriginalStream, buildViewGlobalFolder.getAbsolutePath(), viewRoot);
    }
    clone.create(String.format("Clone view \'%s\' created", buildViewTag)); //$NON-NLS-1$
    return clone;
  }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      clone = new CCSnapshotView(buildViewTag, ccOriginalStream, buildViewGlobalFolder.getAbsolutePath(), viewRoot);
    }
    clone.create(String.format("Clone view \'%s\' created", buildViewTag)); //$NON-NLS-1$
    return clone;
  }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (10 lines)
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCVob.java`
#### Snippet
```java
  }

  //  public void load(final File dump, String reason) throws CCException {
  //    try {
  //      final VobObjectParser result = CTool.importVob(myTag, dump, reason);
```

### CommentedOutCode
Commented out code (2 lines)
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
       */
      // "-overwrite" does not support by 2003 final String command =
      // String.format("cleartool setcs -overwrite \"%s\"",
      // cffile.getAbsolutePath());
      final String command = String.format(CMD_SETCS, getCleartoolExecutable(), cffile.getAbsolutePath());
```

### CommentedOutCode
Commented out code (3 lines)
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    //private static Pattern PATTERN = Pattern.compile("(\\d\\d\\d\\d)(\\d\\d)(\\d\\d)\\.(\\d\\d)(\\d\\d)(\\d\\d)#--#(.*)#--#(.*)#--#(.*)#--#(.*)#--#(.*)#--#(.*)#--#(.*)");
    private static final Pattern PATTERN_WITHOUT_COMMENTS = Pattern.compile("(\\d*)\\.(\\d*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)");
    //private static Pattern PATTERN = Pattern.compile("(\\d*)\\.(\\d*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)");
    //    private static Pattern PATTERN = Pattern.compile("(\\d*)\\.(\\d*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)#--#(.*?)");    
    //    private static Pattern ACTIVITY_PATTERN = Pattern.compile("(.*)#--#(.*)");
```

### CommentedOutCode
Commented out code (13 lines)
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
          activity = activityStr.length() > 0 ? activityStr : null;

          //          // event
          //          event = matcher.group(7);
          //          // parse last group potentially contains activity
```

### CommentedOutCode
Commented out code (2 lines)
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyyMMddHHmmss");

    //    static final String OUTPUT_FORMAT = "%Nd#--#%En#--#%m#--#%Vn#--#%o#--#%e#--#%Nc#--#%[activity]p\\n";
    //    static final String OUTPUT_FORMAT =                "%Nd#--#%En#--#%m#--#%Vn#--#%o#--#%e#--#%Nc#--#%[activity]p\\n";    
    static final String OUTPUT_FORMAT_WITHOUT_COMMENTS = "%Nd#--#%En#--#%m#--#%Vn#--#%o#--#%e#--#%[activity]p\\n";
```

### CommentedOutCode
Commented out code (12 lines)
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  }

  /*
  private Version makeBranch(final ClearCaseConnection connection,
                             final String branchName,
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'EditClearcaseSettingsController'#treeend

*** ** * ** ***

|-------------------------------------------|---|-----------|
| **EditClearcaseSettingsController(...):** |   | **Bean:** |
| WebControllerManager controllerManager    |   | **???**   |
in `clearcase-server/src/META-INF/build-server-plugin-clearcase.xml`
#### Snippet
```java

  <!-- Web part -->
  <bean id="editClearcaseSettingsController" class="jetbrains.buildServer.controllers.EditClearcaseSettingsController"/>
</beans>

```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    final File file = Util.createTempFile();
    try {
      final String command = String.format(CMD_UPDATE, getCleartoolExecutable(), file.getAbsolutePath());
      getCommandExecutor().execAndWait(command, path);
      return parseUpdateOut(new FileInputStream(file));
    } finally {
      file.delete();
    }
```

### DuplicatedCode
Duplicated code
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        if (trim.startsWith(NAME_TOKEN)) {
          myTag = getRest(trim, NAME_TOKEN);
        } else if (trim.startsWith(TYPE_TOKEN)) {
          myType = getRest(trim, TYPE_TOKEN);
        } else if (trim.startsWith(GLOBAL_PATH_TOKEN)) {
          myGlobalPath = getRest(trim, GLOBAL_PATH_TOKEN);
        } else if (trim.startsWith(SERVER_HOST_TOKEN)) {
          myServerHost = getRest(trim, SERVER_HOST_TOKEN);
        }
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `rule.substring(thirdWord.length()).trim()`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java

      if (ConfigSpecRuleTokens.STANDARD_FILE.equals(trimmedSecondWord) || ConfigSpecRuleTokens.STANDARD_DIRECTORY.equals(trimmedSecondWord)) {
        rule = rule.substring(thirdWord.length()).trim();
        processor.processStandartRule(trimmedSecondWord + ":", trimmedThirdWord, rule);
      } else if (ConfigSpecRuleTokens.STANDARD_ELTYPE.equals(trimmedSecondWord)) {
```

### DuplicateExpressions
Multiple occurrences of `rule.substring(thirdWord.length()).trim()`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
        processor.processStandartRule(trimmedSecondWord + ":", trimmedThirdWord, rule);
      } else if (ConfigSpecRuleTokens.STANDARD_ELTYPE.equals(trimmedSecondWord)) {
        rule = rule.substring(thirdWord.length()).trim();
        String fourthWord = extractFirstWord(rule), trimmedFourthWord = trimQuotes(fourthWord.trim());
        rule = rule.substring(fourthWord.length()).trim();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java

    return doGetConfigSpecFromStream(viewPath.getClearCaseViewPathFile(), ClearCaseConnection.getConfigSpecInputStream(process), null,
                                     new FileOutputStream(outputConfigSpecFile), outputConfigSpecFile);
  }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
          outputFile.createNewFile();
        }
        outputStream = new FileOutputStream(outputFile);
      }
      try {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
        FileUtil.delete(datFile);
      }
      final BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(datFile));
      FileUtil.copyStreams(new ByteArrayInputStream(content.getBytes()), out);
      out.flush();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheElement.java`
#### Snippet
```java
    final List<ChangedElementInfo> changedElements = loadChanges(nearestCache);
    
    final DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(myCacheFile));
    final WriteVersionProcessor writeProcessor = new WriteVersionProcessor(outputStream);
    try {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheElement.java`
#### Snippet
```java
    //noinspection ResultOfMethodCallIgnored
    myCacheFile.getParentFile().mkdirs();
    final DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(myCacheFile));
    try {
      connection.processAllVersions(version, new WriteVersionProcessor(outputStream), true, false);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  public void processAllRevisions(final boolean processRoot) throws IOException, VcsException {
    final Stack<ReadCacheItem> readDirs = new Stack<ReadCacheItem>();
    DataInputStream input = new DataInputStream(new FileInputStream(myCacheFile));
    int index = 0;
    try {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    ConfigSpec oldConfigSpec = null;
    if (checkCSChange && configSpecFile != null && configSpecFile.isFile()) {
      oldConfigSpec = ConfigSpecParseUtil.getConfigSpecFromStream(myViewPath.getClearCaseViewPathFile(), new FileInputStream(configSpecFile), configSpecFile);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      final String command = String.format(CMD_LSCHANGE, getCleartoolExecutable(), file.getAbsolutePath());
      getCommandExecutor().execAndWait(command, path);
      return parseUpdateOut(new FileInputStream(file));
    } finally {
      file.delete();
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
          int secondQuotaIdx = message.indexOf("\"", firstQuotaIdx + 1);
          final String absolutePath = message.substring(firstQuotaIdx + 1, secondQuotaIdx);
          return parseUpdateOut(new FileInputStream(absolutePath));
        }
        else {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      final String command = String.format(CMD_UPDATE, getCleartoolExecutable(), file.getAbsolutePath());
      getCommandExecutor().execAndWait(command, path);
      return parseUpdateOut(new FileInputStream(file));
    } finally {
      file.delete();
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
    private Pattern[] myIgnoreErrorPatterns = new Pattern[0];

    protected ClearCaseErrorFilter(final Pattern... ignorePatterns) {
      if (ignorePatterns.length > 0) {
        myIgnoreErrorPatterns = ignorePatterns;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
        if (errorMessage.trim().length() > 0) {
          throw new IOException(
            new StringBuilder("Error executing ").append(Arrays.toString(params)).append(": ").append(errorMessage).toString());
        }
      }
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
          isValid = true;
          // date
          final String dateStr = new StringBuilder(matcher.group(1)).append(matcher.group(2)).toString();
          date = DATE_FORMATTER.parse(dateStr);
          // relative path(object)
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  @Override
  public String toString(){
    return new StringBuilder().append(getPathElement()).append(getVersion()).toString();
  }
}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    StringBuffer margin = new StringBuffer();
    while (parent != null) {
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
      }
      parent = parent.getParentFile();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    final String globalPath = getGlobalPath();
    if(globalPath == null){
      throw new CCException(String.format("Cannot drop view: Global Path lost '%s'", this.toString()));
    }
    try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        names.append("\"").append(file.getName()).append("\"").append(" ");
      }
      String command = String.format(CMD_RMELEM, getCleartoolExecutable(), reason, names.toString());
      getCommandExecutor().execAndWait(command, root);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      process.getInputStream().close();
      if (LOG.isDebugEnabled()) {
        LOG.debug(String.format("Command stdout:\n%s", outBuffer.toString()));
      }
      if (result != 0 || (errBuffer != null && errBuffer.length() > 0)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      }
      if (result != 0 || (errBuffer != null && errBuffer.length() > 0)) {
        LOG.debug(String.format("Command stderr:\n%s", errBuffer.toString()));
        throw new IOException(String.format("%s: command: {\"%s\" in: \"%s\"}", errBuffer.toString().trim(), command.trim(), dir.getAbsolutePath()));
      }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      return fromRoot == null || getViewPath(fromRoot).equals(getViewPath(toRoot))
             ? VcsSupportUtil.collectBuildChanges(toRoot, fromVersion, toVersion, checkoutRules, this)
             : Collections.<ModificationData>emptyList();
    }
    catch (IOException e) {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Kind.java`
#### Snippet
```java
 */

/**
 * 
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        FileUtil.close(writer);
      }
      /**
       * set NOTE: must be executed under root hierarchy of Snapshot View
       */
```

### DanglingJavadoc
Dangling Javadoc comment
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  
  static VobObjectParser createVob(final String tag, final String reason) throws IOException, InterruptedException {
    /**
     * check the Tag already exists
     */
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ClearCaseErrorFilter` may be 'static'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
  }

  private final class ClearCaseErrorFilter implements ILineFilter {
    static final String WARN_LOG_MESSAGE_PATTERN = "Error was detected but rejected by filter: %s";

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
    private final AgentRunningBuild build;
    private final CCSnapshotView view;
    private final CCDelta[] changes;
    private final File publishTo;
    private final String pathWithinView;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java

  @SuppressWarnings("unused")
  private static String ourSessionUser;
  @SuppressWarnings("unused")
  private static String ourSessionPassword;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  private static String ourSessionUser;
  @SuppressWarnings("unused")
  private static String ourSessionPassword;
  private static String ourCleartoolExecutable = "cleartool"; //$NON-NLS-1$
  
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCHistory.java`
#### Snippet
```java

    if (myFile != null ? !myFile.equals(ccHistory.myFile) : ccHistory.myFile != null) return false;
    if (myVersion != null ? !myVersion.equals(ccHistory.myVersion) : ccHistory.myVersion != null) return false;

    return true;
```

### TrivialIf
`if` statement can be simplified
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

    final Version version = processBranches(fullFileName, branches);
    if (version == null) return null;

//    return myMkBranchOption == null ? version : makeBranch(connection, myMkBranchOption, fullFileName, version);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    try {
      if (!getLocalPath().exists()) {
        getLocalPath().mkdirs();
      }
      final ViewParser parser = CTool.lsView(getTag());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
    try {
      if (!linkTargetOwnerDirectory.exists()) {
        linkTargetOwnerDirectory.mkdirs();
      }
      final File linkTarget = new File(linkTargetOwnerDirectory.getAbsolutePath(), absoluteLinkSource.getName());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
    for (File element : getCreatedLinks(ccview)) {
      LOG.debug(String.format("Deleting \"%s\"", element));
      element.delete();
    }
    discardStorage(ccview);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      return parseUpdateOut(new FileInputStream(file));
    } finally {
      file.delete();
    }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java

    } finally {
      cffile.delete();
    }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      return parseUpdateOut(new FileInputStream(file));
    } finally {
      file.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    final File parentFile = new File(localViewPath).getParentFile();
    if (parentFile != null && !parentFile.exists()) {
      parentFile.mkdirs();
    }
    //fire
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
      do {
        final byte[] read = new byte[available];
        myError.read(read);
        final String line = new String(read);
        result.append(line);
```

### IgnoreResultOfCall
Result of `String.substring()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      }
      if (nextQuotePos != -1) {
        command.substring(1, nextQuotePos);
        return command.substring(1, nextQuotePos);
      }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        for (File destination : destinations) {
          if (!destination.exists()) {
            destination.getParentFile().mkdirs();
            destination.createNewFile();
          }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
          if (!destination.exists()) {
            destination.getParentFile().mkdirs();
            destination.createNewFile();
          }
        }
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
      if (new ClearCaseSupport().isClearCaseClientNotFound()) {
        validationResultBuffer.add(new InvalidProperty(Constants.CC_VIEW_PATH, Constants.CLIENT_NOT_FOUND_MESSAGE));
        debug(String.format(VALIDATION_FAILED, getClass().getSimpleName()));
        return false;
      }
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
        return false;
      }
      debug(String.format(VALIDATION_PASSED, getClass().getSimpleName()));
      return true;
    }
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
      try {
        Util.execAndWait(Constants.CLEARTOOL_CHECK_AVAILABLE_COMMAND);
        debug(String.format(VALIDATION_PASSED, getClass().getSimpleName()));
        return true;
      } catch (Exception e) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        final Transferrer[] transferrers = new Transferrer[destinationCount];
        for (int i = 0; i < destinationCount; i++) {
          transferrers[i] = new Transferrer(new FileInputStream(source).getChannel(), new FileOutputStream(destinations[i]).getChannel());
        }

```

### AutoCloseableResource
'FileOutputStream' used without 'try'-with-resources statement
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        final Transferrer[] transferrers = new Transferrer[destinationCount];
        for (int i = 0; i < destinationCount; i++) {
          transferrers[i] = new Transferrer(new FileInputStream(source).getChannel(), new FileOutputStream(destinations[i]).getChannel());
        }

```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
readTimeoutSeconds \* 1000: integer multiplication implicitly cast to long
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java

    final int readTimeoutSeconds = getReadTimeoutSeconds();
    final long deadline = System.currentTimeMillis() + readTimeoutSeconds * 1000;

    while (true) {
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        if (sourceFile.isDirectory()) {
          File parent = sourceFile.getParentFile();
          if (parent == null) {
            // baseFile is the file system root
            baseDirectory = sourceFile;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'this == o' covered by subsequent condition 'o instanceof FirstRevision'
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/Revision.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object o) {
      return this == o || o instanceof FirstRevision;
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.vcs.*;`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
import jetbrains.buildServer.util.filters.Filter;
import jetbrains.buildServer.util.filters.FilterUtil;
import jetbrains.buildServer.vcs.*;
import jetbrains.buildServer.vcs.clearcase.CCException;
import jetbrains.buildServer.vcs.clearcase.CCSnapshotView;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
   * @param localRoot
   *          folder where a CC view root is
   * @return
   * @throws CCException
   *           if the localRoot is not under CC View
```

### JavadocDeclaration
`@throws` tag description is missing
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
   * Regenerates view.dat from the CC Server
   * 
   * @throws CCException
   */
  public CCSnapshotView restore() throws CCException {
```

### JavadocDeclaration
`@param root` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * creates new View's clone in the "checkoutRoot"
   * 
   * @param root
   * @param sourceViewTag
   * @param viewRoot
```

### JavadocDeclaration
`@param sourceViewTag` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * 
   * @param root
   * @param sourceViewTag
   * @param viewRoot
   * @param logger
```

### JavadocDeclaration
`@param viewRoot` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * @param root
   * @param sourceViewTag
   * @param viewRoot
   * @param logger
   * @return
```

### JavadocDeclaration
`@param logger` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * @param sourceViewTag
   * @param viewRoot
   * @param logger
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * @param viewRoot
   * @param logger
   * @return
   */
  protected CCSnapshotView createNew(AgentRunningBuild build, VcsRoot root, File viewRoot, BuildProgressLogger logger) throws CCException {
```

### JavadocDeclaration
`@param root` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * looks for "sourceViewTag" in the "checkoutRoot" directory
   * 
   * @param root
   * @throws CCException
   */
```

### JavadocDeclaration
`@throws` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * 
   * @param root
   * @throws CCException
   */
  protected CCSnapshotView findView(AgentRunningBuild build, VcsRoot root, File viewRoot, BuildProgressLogger logger) throws CCException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
   * Performs initial copying to checkout directory
   * 
   * @throws InterruptedException
   */
  File[] publishLinks(CCSnapshotView ccview, File publishTo, String pathWithinView, BuildProgressLogger logger) throws CCException {
```

### JavadocDeclaration
InterruptedException is not declared to be thrown by method publishLinks
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
   * Performs initial copying to checkout directory
   * 
   * @throws InterruptedException
   */
  File[] publishLinks(CCSnapshotView ccview, File publishTo, String pathWithinView, BuildProgressLogger logger) throws CCException {
```

### JavadocDeclaration
Tag `param` is not allowed here
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  /**
   * @param command
   * @return
   */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  /**
   * @param command
   * @return
   */
  private static long ourTotalSleepTime;
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `clearcase-agent/src/META-INF/build-agent-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean id="clearcaseCheckoutOnAgent" class="jetbrains.buildServer.vcs.clearcase.agent.ClearCaseAgentSupport"/>
</beans>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `clearcase-server/src/META-INF/build-server-plugin-clearcase.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="clearcase" class="jetbrains.buildServer.buildTriggers.vcs.clearcase.ClearCaseSupport" />

```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ClearCaseAgentSupport.java`
#### Snippet
```java

  private void dumpEnvironment() {
    LOG.debug(String.format("ClearCase Agent Support environment:"));    
    LOG.debug(String.format("Running user: %s", System.getProperty("user.name")));
    LOG.debug(String.format("Environment variables: %s", System.getenv()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    StringBuffer margin = new StringBuffer();
    while (parent != null) {
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
      }
      parent = parent.getParentFile();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      if (CCStorage.View.equals(storage.getType())) {
        hasViewsStorageLocation = true;
        LOG.debug(String.format("create:: a \"Server Storage Location\" exists for a view")); //$NON-NLS-1$
        break;
      }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java

    //try to find and use original view location as base 
    LOG.debug(String.format("create:: preparing target location for the snapshot view storage directory")); //$NON-NLS-1$
    final String ccOriginalViewTag = getSourceViewTag(build, root);
    LOG.debug(String.format("create:: found source view tag: \"%s\"", ccOriginalViewTag)); //$NON-NLS-1$
```

### RedundantStringFormatCall
Redundant call to `format()`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      ourCleartoolExecutable = executable.trim();
    } else {
      LOG.warn(String.format("Could not set CleartoolExecutable to \"null\""));
    }
  }
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Runtime exception instance `new RuntimeException()` is not thrown
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java

        } catch (ParseException e) {
          new RuntimeException(e);
        }
        // labels
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementProvider.java`
#### Snippet
```java
      if (!line.endsWith(ClearCaseConnection.LINE_END_DELIMITER)) {
        while (myNextLine != null && !line.endsWith(ClearCaseConnection.LINE_END_DELIMITER)) {
          line += '\n' + myNextLine;
          myNextLine = myReader.readLine();
        }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `io` initializer `new IOException(e.getMessage())` is redundant
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcessPool.java`
#### Snippet
```java
    }
    catch (final ExecutionException e) {
      final IOException io = new IOException(e.getMessage());
      io.initCause(e);
      throw io;
```

### UnusedAssignment
Variable `versionBeforStartIdx` initializer `0` is redundant
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      line = line.substring(tokenLength).trim();
      // get local path
      int versionBeforStartIdx = 0;
      if (line.startsWith("\"")) {
        versionBeforStartIdx = line.indexOf("\"", 1);
```

### UnusedAssignment
Variable `baseDirectoryPathLength` initializer `0` is redundant
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
          for (Source source : sources) {
            File baseDirectory = source.getBaseDirectory();
            int baseDirectoryPathLength = 0;
            String baseDirectoryPath = baseDirectory.getPath();
            if (baseDirectoryPath.endsWith(File.separator)) {
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `useGlobalLabel` is always 'true'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
        if (globalLabelsVOB == null || trim(globalLabelsVOB).length() == 0) { //$NON-NLS-1$
          result.add(new InvalidProperty(Constants.GLOBAL_LABELS_VOB, Messages.getString("ClearCaseValidation.global_label_vob_lost_error_message"))); //$NON-NLS-1$
          debug(String.format(DOUBLLE_PARAM_VALIDATION_FAILED, useGlobalLabel, globalLabelsVOB));
          return false;
        }
```

### ConstantValue
Condition `stream == null` is always `false`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      try {
        final StreamParser stream = CTool.lsStream(getTag());
        if (stream == null) {
          throw new CCException(String.format("Could not find stream for \"%s\"", getTag()));
        }
```

### ConstantValue
Condition `cacheFile == null` is always `false`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  public CacheElement getCache(@NotNull final DateRevision version, @NotNull final String path, @NotNull final IncludeRule includeRule, @NotNull final VcsRoot root) {
    final File cacheFile = createCacheFile(version.getDate(), path, root);
    if (cacheFile == null) return null;
    return new CacheElement(version, cacheFile, this, path, includeRule, myParentSupport, root);
  }
```

### ConstantValue
Condition `!(e instanceof VcsException)` is always `false`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
    } catch (Exception e) {
      build.getBuildLogger().buildFailureDescription(Messages.getString("AbstractSourceProvider.update_root_target_error_message")); //$NON-NLS-1$
      if (!(e instanceof VcsException)) {
        throw new VcsException(e);
      }
```

### ConstantValue
Value `parser.comment` is always 'null'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCHistory.java`
#### Snippet
```java
    myVersion = parser.version;

    myComment = parser.comment;

  }
```

### ConstantValue
Condition `line != null` is always `true`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    try {
      String line = reader.readLine().trim();
      if (line != null) {
        if (line.startsWith("*")) {
          line = line.substring(1).trim();
```

### ConstantValue
Value `appentVersion` is always 'true'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
      if (appentVersion) {
        if (!pathElement.isIsFromViewPath() && pathElement.getVersion() == null) {
          final Version lastVersion = getLastVersion(CCPathElement.createPath(pathElementList, i + 1, appentVersion), isFile);
          if (lastVersion != null) {
            pathElement.setVersion(lastVersion.getWholeName());
```

### ConstantValue
Value `isFile` is always 'true'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  public Version getLastVersion(@NotNull final String path, final boolean isFile) throws VcsException {
    if (isFile) {
      return doGetLastVersion(path, isFile);
    }
    if (!myDirectoryVersionCache.containsKey(path)) {
```

### ConstantValue
Condition `branches == null` is always `false`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  public Version findVersion(final VersionTree versionTree, final String fullFileName) throws VcsException {
    final Collection<Branch> branches = findBranches(versionTree);
    if (branches == null) {
      return null;
    }
```

### ConstantValue
Value `recursive` is always 'true'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
          if (subFile.isDirectory()) {
            if (recursive) {
              DirectoryInfo tmpInfo = expand(baseDirectoryPathLength, subFile, pattern, recursive);
              if (tmpInfo != null) {
                files.addAll(tmpInfo.getFiles());
```

### ConstantValue
Condition `parser != null` is always `true`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      try{
        final ViewParser parser = CTool.lsView(viewTag);
        if(parser != null){
          return new CCSnapshotView(parser);
        }
```

### ConstantValue
Condition `errBuffer != null` is always `true` when reached
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        LOG.debug(String.format("Command stdout:\n%s", outBuffer.toString()));
      }
      if (result != 0 || (errBuffer != null && errBuffer.length() > 0)) {
        LOG.debug(String.format("Command stderr:\n%s", errBuffer.toString()));
        throw new IOException(String.format("%s: command: {\"%s\" in: \"%s\"}", errBuffer.toString().trim(), command.trim(), dir.getAbsolutePath()));
```

