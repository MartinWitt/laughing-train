# teamcity-clearcase 
 
# Bad smells
I found 497 bad smells with 158 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 110 | false |
| UnnecessaryModifier | 89 | true |
| ReturnNull | 49 | false |
| SizeReplaceableByIsEmpty | 31 | true |
| ToArrayCallWithZeroLengthArrayArgument | 21 | true |
| BoundedWildcard | 14 | false |
| ObsoleteCollection | 13 | false |
| ConstantValue | 13 | false |
| DynamicRegexReplaceableByCompiledPattern | 13 | false |
| AssignmentToMethodParameter | 12 | false |
| IgnoreResultOfCall | 11 | false |
| StringBufferReplaceableByStringBuilder | 10 | false |
| NestedAssignment | 9 | false |
| RedundantSuppression | 8 | false |
| CommentedOutCode | 6 | false |
| RedundantStringFormatCall | 6 | false |
| UtilityClassWithoutPrivateConstructor | 6 | true |
| UnnecessaryToStringCall | 6 | true |
| EmptyMethod | 5 | false |
| ZeroLengthArrayInitialization | 5 | false |
| DataFlowIssue | 5 | false |
| SystemOutErr | 4 | false |
| Convert2Lambda | 4 | false |
| StringBufferReplaceableByString | 3 | false |
| MalformedFormatString | 3 | false |
| UnusedAssignment | 3 | false |
| StringEqualsEmptyString | 3 | false |
| UnnecessaryStringEscape | 2 | true |
| KeySetIterationMayUseEntrySet | 2 | false |
| DuplicateExpressions | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| RedundantFieldInitialization | 2 | false |
| IOResource | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| Java8MapApi | 2 | false |
| Finalize | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| InstanceofCatchParameter | 1 | false |
| DoubleBraceInitialization | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| FieldMayBeStatic | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| ThrowableNotThrown | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  @Override
  protected void finalize() throws Throwable {
    System.out.println(dump());
    super.finalize();
```

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `ourDefault` from instance context
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

  public ClearCaseSupport() {
    ourDefault = this;
    myCache = null;
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
Commented out code (12 lines)
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  }

  /*
  private Version makeBranch(final ClearCaseConnection connection,
                             final String branchName,
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CorrectingAddedDirectoryVersionProcessor.java`
#### Snippet
```java
class CorrectingAddedDirectoryVersionProcessor implements VersionProcessor {
  
  private final Stack<ChangedElementInfo> myCurrentDirs = new Stack<ChangedElementInfo>();
  
  public CorrectingAddedDirectoryVersionProcessor(final ChangedElementInfo topDir) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CorrectingAddedDirectoryVersionProcessor.java`
#### Snippet
```java
class CorrectingAddedDirectoryVersionProcessor implements VersionProcessor {
  
  private final Stack<ChangedElementInfo> myCurrentDirs = new Stack<ChangedElementInfo>();
  
  public CorrectingAddedDirectoryVersionProcessor(final ChangedElementInfo topDir) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }

  private String createRelPath(final Stack<ReadCacheItem> readDirs) {
    StringBuilder result = new StringBuilder();
    for (ReadCacheItem readDir : readDirs) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }
  
  private String createIOPath(final Stack<ReadCacheItem> readDirs, final ClearCaseConnection connection) {
    StringBuilder result = new StringBuilder();
    if (connection != null) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java

  public void processAllRevisions(final boolean processRoot) throws IOException, VcsException {
    final Stack<ReadCacheItem> readDirs = new Stack<ReadCacheItem>();
    DataInputStream input = new DataInputStream(new FileInputStream(myCacheFile));
    int index = 0;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java

  public void processAllRevisions(final boolean processRoot) throws IOException, VcsException {
    final Stack<ReadCacheItem> readDirs = new Stack<ReadCacheItem>();
    DataInputStream input = new DataInputStream(new FileInputStream(myCacheFile));
    int index = 0;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }

  private String createFullPath(final Stack<ReadCacheItem> readDirs, final ClearCaseConnection connection) {
    StringBuilder result = new StringBuilder();
    if (connection != null) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/WriteCorrectingVersionProcessor.java`
#### Snippet
```java
    }
    myWriteProcessor = writeProcessor;
    myIgnoreStack = new Stack<String>();
  }

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/WriteCorrectingVersionProcessor.java`
#### Snippet
```java
  private final Map<String, ChangedElementInfo> myChangedElements = new HashMap<String, ChangedElementInfo>();
  private final WriteVersionProcessor myWriteProcessor;
  private final Stack<String> myIgnoreStack;

  public WriteCorrectingVersionProcessor(final List<ChangedElementInfo> changedElements,
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java

  private boolean rightVersionExists(final ConfigSpecStandardRule rule, final Branch rootBranch) {
    final Stack<Branch> stack = new Stack<Branch>();
    stack.push(rootBranch);

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java

  private boolean rightVersionExists(final ConfigSpecStandardRule rule, final Branch rootBranch) {
    final Stack<Branch> stack = new Stack<Branch>();
    stack.push(rootBranch);

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  public static String normalizeFileName(final String fullFileName) throws VcsException {
    final String[] dirs = PLATFORM_SEPARATOR_REGEXP.split(fullFileName);
    Stack<String> stack = new Stack<String>();

    for (String dir : dirs) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  public static String normalizeFileName(final String fullFileName) throws VcsException {
    final String[] dirs = PLATFORM_SEPARATOR_REGEXP.split(fullFileName);
    Stack<String> stack = new Stack<String>();

    for (String dir : dirs) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `filesBefore.keySet()` may be replaced with 'entrySet()' iteration
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCParseUtil.java`
#### Snippet
```java
      final Map<String, SimpleDirectoryChildElement> filesAfter = collectMap(elementsAfter);

      for (final String fileName : filesBefore.keySet()) {
        if (!filesAfter.containsKey(fileName)) {
          final SimpleDirectoryChildElement sourceElement = filesBefore.get(fileName);
```

### KeySetIterationMayUseEntrySet
Iteration over `filesAfter.keySet()` may be replaced with 'entrySet()' iteration
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCParseUtil.java`
#### Snippet
```java
      }

      for (final String fileName : filesAfter.keySet()) {
        if (!filesBefore.containsKey(fileName)) {
          final SimpleDirectoryChildElement targetElement = filesAfter.get(fileName);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CommentHolder.java`
#### Snippet
```java

  public void addActivity(String str) {
    if (str != null && str.length() > 0) {
      myActivities.add(str);
    }
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CommentHolder.java`
#### Snippet
```java

  public void addDescription(String str) {
    if (str != null && str.length() > 0) {
      myDescriptions.add(str);
    }
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CommentHolder.java`
#### Snippet
```java

  public void addComment(String str) {
    if (str != null && str.length() > 0) {
      if (!myDescriptions.contains(str)) {
        myComments.add(str);
```

### SizeReplaceableByIsEmpty
`s.length() > 0` can be replaced with '!s.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
    for (int i = 0; i < versions.size() - 1; i++) {
      String s = versions.get(i);
      if (s.length() > 0) {
        branches.add(s);
      }
```

### SizeReplaceableByIsEmpty
`versions.size() == 0` can be replaced with 'versions.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
    final List<String> versions = StringUtil.split(version, false, File.separatorChar);

    if (versions.size() == 0) return;

    String lastVers = versions.get(versions.size() - 1);
```

### SizeReplaceableByIsEmpty
`comment.length() > 0` can be replaced with '!comment.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
        String[] strings = lastVers.substring(commentBegin + 1, commentEnd).split(",");
        for (String comment : strings) {
          if (comment.length() > 0) {
            comments.add(comment.trim());
          }
```

### SizeReplaceableByIsEmpty
`errorMesage.trim().length() > 0` can be replaced with '!errorMesage.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
      if (myError.available() > 0) {
        final String errorMesage = readError();
        if (errorMesage.trim().length() > 0) {
          throw new VcsException(errorMesage);
        }
```

### SizeReplaceableByIsEmpty
`trimmedLine.length() != 0` can be replaced with '!trimmedLine.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
    for (String aLine : lines) {
      final String trimmedLine = aLine.trim();
      if (trimmedLine.length() != 0) {
        result = doProcessLine(processor, trimmedLine, false, inputConfigSpecFile, outputConfigSpecFile, result);
      }
```

### SizeReplaceableByIsEmpty
`group.length() > 0` can be replaced with '!group.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
    if (matcher.matches()) {
      final String group = matcher.group(1);
      myLastOutput = group.length() > 0 ? group : null; //keep the informational output
      final String retCode = matcher.group(3);
      if (!"0".equals(retCode)) {
```

### SizeReplaceableByIsEmpty
`errorMessage.trim().length() > 0` can be replaced with '!errorMessage.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
        final String errorMessage = readError();
        //check there is any message(we can ignore kind of error)
        if (errorMessage.trim().length() > 0) {
          throw new IOException(
            new StringBuilder("Error executing ").append(Arrays.toString(params)).append(": ").append(errorMessage).toString());
```

### SizeReplaceableByIsEmpty
`versions.size() == 0` can be replaced with 'versions.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  @Nullable
  private Version processVersions(final Collection<Version> versions, final String fullFileName) throws VcsException {
    if (versions.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`ss.length() > 0` can be replaced with '!ss.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    boolean wordShouldBeReturned = false;
    String ss = s;
    while (ss.length() > 0) {
      final String word = ConfigSpecParseUtil.extractFirstWord(ss), trimmedWord = word.trim();
      if (wordShouldBeReturned) return trimmedWord;
```

### SizeReplaceableByIsEmpty
`elements[3].trim().length() > 0` can be replaced with '!elements\[3\].trim().isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        }
        // labels
        if (elements.length > 3 && elements[3].trim().length() > 0) {
          String labels = elements[3].trim();
          labels = labels.substring(1, labels.length() - 1);// extract brackets
```

### SizeReplaceableByIsEmpty
`trim.length() > 0` can be replaced with '!trim.isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    for (String line : stdOut) {
      final String trim = line.trim();
      if (trim.length() > 0) {
        if (trim.startsWith(ViewParser.TAG_TOKEN) && !buffer.isEmpty()) {
          // reach the next section
```

### SizeReplaceableByIsEmpty
`trim.length() > 0` can be replaced with '!trim.isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    for (String line : stdOut) {
      final String trim = line.trim();
      if (trim.length() > 0) {
        if (trim.startsWith(VobParser.TAG_TOKEN) && !buffer.isEmpty()) {
          // reach the next section
```

### SizeReplaceableByIsEmpty
`response[0].trim().length() == 0` can be replaced with 'response\[0\].trim().isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    }
    final String[] response = getCommandExecutor().execAndWait(String.format(cmd, getCleartoolExecutable(), file.getAbsolutePath()), root);
    return !(response.length == 0 || (response.length == 1 && response[0].trim().length() == 0));
  }

```

### SizeReplaceableByIsEmpty
`activityStr.length() > 0` can be replaced with '!activityStr.isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
          //activity
          final String activityStr = matcher.group(8/*9*/);
          activity = activityStr.length() > 0 ? activityStr : null;

          //          // event
```

### SizeReplaceableByIsEmpty
`trim(globalLabelsVOB).length() == 0` can be replaced with 'trim(globalLabelsVOB).isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
      final String globalLabelsVOB = properties.get(Constants.GLOBAL_LABELS_VOB);
      if (useGlobalLabel) {
        if (globalLabelsVOB == null || trim(globalLabelsVOB).length() == 0) { //$NON-NLS-1$
          result.add(new InvalidProperty(Constants.GLOBAL_LABELS_VOB, Messages.getString("ClearCaseValidation.global_label_vob_lost_error_message"))); //$NON-NLS-1$
          debug(String.format(DOUBLLE_PARAM_VALIDATION_FAILED, useGlobalLabel, globalLabelsVOB));
```

### SizeReplaceableByIsEmpty
`describe.trim().length() > 0` can be replaced with '!describe.trim().isEmpty()'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      final CCDelta[] changes = setupConfigSpec(ccview, getConfigSpecs(build, root), toVersion);
      final String describe = describe(changes);
      if (describe.trim().length() > 0) {
        build.getBuildLogger().message(String.format(Messages.getString("AbstractSourceProvider.changes_loaded_target_message"), describe)); //$NON-NLS-1$
      } else {
```

### SizeReplaceableByIsEmpty
`line.trim().length() > 0` can be replaced with '!line.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.trim().length() > 0) {
          String elementVersion = readVersion(line);
          versionTree.addVersion(elementVersion);
```

### SizeReplaceableByIsEmpty
`pathElements.size() == 0` can be replaced with 'pathElements.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    final List<CCPathElement> pathElements = CCPathElement.splitIntoPathElements(path);

    if (pathElements.size() == 0 || ccViewRootElements.size() == 0)
      return ".";

```

### SizeReplaceableByIsEmpty
`ccViewRootElements.size() == 0` can be replaced with 'ccViewRootElements.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    final List<CCPathElement> pathElements = CCPathElement.splitIntoPathElements(path);

    if (pathElements.size() == 0 || ccViewRootElements.size() == 0)
      return ".";

```

### SizeReplaceableByIsEmpty
`result.trim().length() == 0` can be replaced with 'result.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java

    final String result = CCPathElement.createPath(pathElements, viewPathElements.size(), pathElements.size(), true);
    return result.trim().length() == 0 ? "." : result;
  }

```

### SizeReplaceableByIsEmpty
`outBuffer.toString().trim().length() > 0` can be replaced with '!outBuffer.toString().trim().isEmpty()'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        throw new IOException(String.format("%s: command: {\"%s\" in: \"%s\"}", errBuffer.toString().trim(), command.trim(), dir.getAbsolutePath()));
      }
      if (outBuffer.toString().trim().length() > 0) {
        return trimElements(outBuffer.toString().trim().split("\n+"));
      }
```

### SizeReplaceableByIsEmpty
`prop.trim().length() > 0` can be replaced with '!prop.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
    final ArrayList<Pattern> patterns = new ArrayList<Pattern>();
    final String prop = TeamCityProperties.getPropertyOrNull(Constants.TEAMCITY_PROPERTY_IGNORE_ERROR_PATTERN);
    if (prop != null && prop.trim().length() > 0) {
      for (String pstr : COLON_OR_SEMICOLON_PATTERN.split(prop)) {
        if (pstr.trim().length() > 0) {
```

### SizeReplaceableByIsEmpty
`pstr.trim().length() > 0` can be replaced with '!pstr.trim().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
    if (prop != null && prop.trim().length() > 0) {
      for (String pstr : COLON_OR_SEMICOLON_PATTERN.split(prop)) {
        if (pstr.trim().length() > 0) {
          try {
            patterns.add(Pattern.compile(pstr, Pattern.DOTALL | Pattern.MULTILINE));
```

### SizeReplaceableByIsEmpty
`trim(viewPath).length() != 0` can be replaced with '!trim(viewPath).isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  public static ViewPath getViewPath(@NotNull final VcsRoot vcsRoot) throws VcsException, IOException {
    final String viewPath = vcsRoot.getProperty(Constants.VIEW_PATH);
    if (viewPath != null && trim(viewPath).length() != 0) {
      return getViewPath(viewPath);
    }
```

### SizeReplaceableByIsEmpty
`viewPathElements.size() > 0` can be replaced with '!viewPathElements.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
      String currentViewPath = null;

      if (viewPathElements.size() > 0) {
        currentViewPath = viewPathElements.remove(0);
      }
```

### SizeReplaceableByIsEmpty
`pathElements.size() > 0` can be replaced with '!pathElements.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
    final List<String> viewPathElements = StringUtil.split(viewPath, false, File.separatorChar);

    if (pathElements.size() > 0 && pathElements.get(0).getPathElement().length() == 0) {
      if (viewPathElements.size() > 0) {
        viewPathElements.set(0, "");
```

### SizeReplaceableByIsEmpty
`pathElements.get(0).getPathElement().length() == 0` can be replaced with 'pathElements.get(0).getPathElement().isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
    final List<String> viewPathElements = StringUtil.split(viewPath, false, File.separatorChar);

    if (pathElements.size() > 0 && pathElements.get(0).getPathElement().length() == 0) {
      if (viewPathElements.size() > 0) {
        viewPathElements.set(0, "");
```

### SizeReplaceableByIsEmpty
`viewPathElements.size() > 0` can be replaced with '!viewPathElements.isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java

    if (pathElements.size() > 0 && pathElements.get(0).getPathElement().length() == 0) {
      if (viewPathElements.size() > 0) {
        viewPathElements.set(0, "");
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ReadCacheItem`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }

  private String createRelPath(final Stack<ReadCacheItem> readDirs) {
    StringBuilder result = new StringBuilder();
    for (ReadCacheItem readDir : readDirs) {
```

### BoundedWildcard
Can generalize to `? extends ReadCacheItem`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }
  
  private String createIOPath(final Stack<ReadCacheItem> readDirs, final ClearCaseConnection connection) {
    StringBuilder result = new StringBuilder();
    if (connection != null) {
```

### BoundedWildcard
Can generalize to `? extends ReadCacheItem`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java
  }

  private String createFullPath(final Stack<ReadCacheItem> readDirs, final ClearCaseConnection connection) {
    StringBuilder result = new StringBuilder();
    if (connection != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/Revision.java`
#### Snippet
```java

    @Override
    public void appendLSHistoryOptions(@NotNull final List<String> optionList) {
      optionList.add("-since");
      optionList.add(getDateString());
```

### BoundedWildcard
Can generalize to `? extends CCPathElement`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java
  }

  public boolean isVersionIsInsideView(final ClearCaseConnection connection, final List<CCPathElement> pathElements, final boolean isFile) throws VcsException, IOException {
    StringBuilder filePath = new StringBuilder();
    StringBuilder objectPath = new StringBuilder();
```

### BoundedWildcard
Can generalize to `? extends ConfigSpecStandardRule`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java
  private static final Logger LOG = Logger.getLogger(ConfigSpecImpl.class);

  public ConfigSpecImpl(final List<ConfigSpecLoadRule> loadRules, final List<ConfigSpecStandardRule> standardRules) {
    myLoadRules = loadRules;
    myStandardRules = standardRules;
```

### BoundedWildcard
Can generalize to `? extends Version`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  }

  private String collectVersions(final Collection<Version> versions) {
    StringBuilder sb = new StringBuilder();
    for (Version version : versions) {
```

### BoundedWildcard
Can generalize to `? extends Branch`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

  @Nullable
  private Version findVersionByNumber(final Collection<Branch> branches, final int versionNumber, final String fullFileName) throws VcsException {
    Collection<Version> versions = new HashSet<Version>();
    for (Branch branch : branches) {
```

### BoundedWildcard
Can generalize to `? extends Branch`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

  @Nullable
  private Version getLastVersion(final Collection<Branch> branches, final String fullFileName) throws VcsException {
    Collection<Version> versions = new HashSet<Version>();
    for (Branch branch : branches) {
```

### BoundedWildcard
Can generalize to `? extends Branch`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

  @Nullable
  private Version findVersionWithComment(final Collection<Branch> branches, final String labelName, final String fullFileName) throws VcsException {
    Collection<Version> versions = new HashSet<Version>();
    for (Branch branch : branches) {
```

### BoundedWildcard
Can generalize to `? extends SimpleDirectoryChildElement`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCParseUtil.java`
#### Snippet
```java

  @NotNull
  private static Map<String, SimpleDirectoryChildElement> collectMap(@NotNull final List<SimpleDirectoryChildElement> elementsBefore) {
    final HashMap<String, SimpleDirectoryChildElement> result = new HashMap<String, SimpleDirectoryChildElement>();
    for (final SimpleDirectoryChildElement element : elementsBefore) {
```

### BoundedWildcard
Can generalize to `? extends CCPathElement`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  }

  public static String createPath(final List<CCPathElement> ccPathElements, final int startIndex, final int endIndex, final boolean appentVersion) {
    StringBuffer result = new StringBuffer();
    boolean first = true;
```

### BoundedWildcard
Can generalize to `? extends CCPathElement`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  }

  public static String createRelativePathWithVersions(final List<CCPathElement> pathElementList) {
    StringBuffer result = new StringBuffer();
    for (CCPathElement pathElement : pathElementList) {
```

### BoundedWildcard
Can generalize to `? extends CCPathElement`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  }

  public static String createPathWithoutVersions(final List<CCPathElement> pathElementList) {
    StringBuffer result = new StringBuffer();
    for (CCPathElement pathElement : pathElementList) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ISourceProvider.java`
#### Snippet
```java
interface ISourceProvider extends UpdateByCheckoutRules2 {
  
  String[] getConfigSpecs(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root) throws CCException; 
  
//  void publish(final @NotNull AgentRunningBuild build, final @NotNull CCSnapshotView ccview, final @NotNull CCDelta[] changes, final @NotNull File publishTo, final @NotNull String pathWithinView, final @NotNull BuildProgressLogger logger) throws CCException;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ISourceProvider.java`
#### Snippet
```java
interface ISourceProvider extends UpdateByCheckoutRules2 {
  
  String[] getConfigSpecs(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root) throws CCException; 
  
//  void publish(final @NotNull AgentRunningBuild build, final @NotNull CCSnapshotView ccview, final @NotNull CCDelta[] changes, final @NotNull File publishTo, final @NotNull String pathWithinView, final @NotNull BuildProgressLogger logger) throws CCException;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ISourceProvider.java`
#### Snippet
```java
//  void publish(final @NotNull AgentRunningBuild build, final @NotNull CCSnapshotView ccview, final @NotNull CCDelta[] changes, final @NotNull File publishTo, final @NotNull String pathWithinView, final @NotNull BuildProgressLogger logger) throws CCException;
  
  void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;
  
}
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ISourceProvider.java`
#### Snippet
```java
//  void publish(final @NotNull AgentRunningBuild build, final @NotNull CCSnapshotView ccview, final @NotNull CCDelta[] changes, final @NotNull File publishTo, final @NotNull String pathWithinView, final @NotNull BuildProgressLogger logger) throws CCException;
  
  void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;
  
}
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ISourceProvider.java`
#### Snippet
```java
//  void publish(final @NotNull AgentRunningBuild build, final @NotNull CCSnapshotView ccview, final @NotNull CCDelta[] changes, final @NotNull File publishTo, final @NotNull String pathWithinView, final @NotNull BuildProgressLogger logger) throws CCException;
  
  void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;
  
}
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  public File getCacheDir(final @NotNull VcsRoot root) {
    return getCacheDir(root, false);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  private File createCacheBaseDir(final @NotNull String path, final @NotNull VcsRoot vcsRoot) {
    return new File(getCacheDir(vcsRoot), String.valueOf(Hash.calc(path)));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  private File createCacheBaseDir(final @NotNull String path, final @NotNull VcsRoot vcsRoot) {
    return new File(getCacheDir(vcsRoot), String.valueOf(Hash.calc(path)));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  public void cleanup(final @NotNull VcsRoot root) {
    final File cacheDir = getCacheDir(root);
    if (cacheDir == null) return;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  public CacheElement getNearestExistingCache(final @NotNull DateRevision version, final @NotNull String path, final @NotNull IncludeRule includeRule, final @NotNull VcsRoot vcsRoot) {
    File baseDir = createCacheBaseDir(path, vcsRoot);
    File[] cacheFiles = baseDir.listFiles();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  public CacheElement getNearestExistingCache(final @NotNull DateRevision version, final @NotNull String path, final @NotNull IncludeRule includeRule, final @NotNull VcsRoot vcsRoot) {
    File baseDir = createCacheBaseDir(path, vcsRoot);
    File[] cacheFiles = baseDir.listFiles();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  public CacheElement getNearestExistingCache(final @NotNull DateRevision version, final @NotNull String path, final @NotNull IncludeRule includeRule, final @NotNull VcsRoot vcsRoot) {
    File baseDir = createCacheBaseDir(path, vcsRoot);
    File[] cacheFiles = baseDir.listFiles();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  public CacheElement getNearestExistingCache(final @NotNull DateRevision version, final @NotNull String path, final @NotNull IncludeRule includeRule, final @NotNull VcsRoot vcsRoot) {
    File baseDir = createCacheBaseDir(path, vcsRoot);
    File[] cacheFiles = baseDir.listFiles();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  public void register(final @NotNull SBuildServer server, final @NotNull EventDispatcher<BuildServerListener> dispatcher) {
    server.registerExtension(AfterBuildsCleanupExtension.class, ClearCaseStructureCache.class.getName(), new ClearcaseCacheGeneralDataCleaner());

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  public void register(final @NotNull SBuildServer server, final @NotNull EventDispatcher<BuildServerListener> dispatcher) {
    server.registerExtension(AfterBuildsCleanupExtension.class, ClearCaseStructureCache.class.getName(), new ClearcaseCacheGeneralDataCleaner());

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  private final @NotNull ClearCaseSupport myParentSupport;

  public ClearCaseStructureCache(final @NotNull File baseDir, final @NotNull ClearCaseSupport support) {
    myBaseDir = baseDir;
    myParentSupport = support;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  private final @NotNull ClearCaseSupport myParentSupport;

  public ClearCaseStructureCache(final @NotNull File baseDir, final @NotNull ClearCaseSupport support) {
    myBaseDir = baseDir;
    myParentSupport = support;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  private void cleanupSubFolder(final @NotNull File subDir, final boolean keepLastCache) {
    File[] versCaches = subDir.listFiles();
    if (versCaches == null) return;
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

public class ClearCaseStructureCache {
  private final @NotNull File myBaseDir;
  private final @NotNull ClearCaseSupport myParentSupport;

```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  public void clearCaches(final @NotNull VcsRoot root) {
    final File dir = getCacheDir(root);
    if (dir != null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  private File createCacheFile(final @NotNull Date version, final @NotNull String path, final @NotNull VcsRoot root) {
    return new File(createCacheBaseDir(path, root), String.valueOf(version.getTime()));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  private File createCacheFile(final @NotNull Date version, final @NotNull String path, final @NotNull VcsRoot root) {
    return new File(createCacheBaseDir(path, root), String.valueOf(version.getTime()));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java

  @Nullable
  private File createCacheFile(final @NotNull Date version, final @NotNull String path, final @NotNull VcsRoot root) {
    return new File(createCacheBaseDir(path, root), String.valueOf(version.getTime()));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  }

  private void cleanupFolder(final @NotNull File dir, final boolean keepLastCache) {
    File[] subDirs = dir.listFiles();
    if (subDirs != null) {
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
public class ClearCaseStructureCache {
  private final @NotNull File myBaseDir;
  private final @NotNull ClearCaseSupport myParentSupport;

  public ClearCaseStructureCache(final @NotNull File baseDir, final @NotNull ClearCaseSupport support) {
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/DirectoryChildElement.java`
#### Snippet
```java
  private final int myVersion;
  private final @NotNull String myFullPath;
  private final @NotNull String myStringVersion;

  public DirectoryChildElement(@NotNull final Type type,
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/DirectoryChildElement.java`
#### Snippet
```java
  private final @NotNull String myPath;
  private final int myVersion;
  private final @NotNull String myFullPath;
  private final @NotNull String myStringVersion;

```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/DirectoryChildElement.java`
#### Snippet
```java

public class DirectoryChildElement extends SimpleDirectoryChildElement {
  private final @NotNull String myPath;
  private final int myVersion;
  private final @NotNull String myFullPath;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/CheckoutDirectoryBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    final File pathWithinAView = getRelativePathWithinAView(vcsRoot);
    LOG.debug(String.format("Relative Path within a View: '%s'", pathWithinAView)); //$NON-NLS-1$    
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/CheckoutDirectoryBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    final File pathWithinAView = getRelativePathWithinAView(vcsRoot);
    LOG.debug(String.format("Relative Path within a View: '%s'", pathWithinAView)); //$NON-NLS-1$    
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/CheckoutDirectoryBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    final File pathWithinAView = getRelativePathWithinAView(vcsRoot);
    LOG.debug(String.format("Relative Path within a View: '%s'", pathWithinAView)); //$NON-NLS-1$    
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/CheckoutDirectoryBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
    //use temporary for build
    final File ccCheckoutRoot = getCCRootDirectory(build, root, checkoutRoot, rules);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/CheckoutDirectoryBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
    //use temporary for build
    final File ccCheckoutRoot = getCCRootDirectory(build, root, checkoutRoot, rules);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot/*final @NotNull AgentRunningBuild build*/, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    LOG.debug(String.format("Validating Checkout Rules '%s'", rules.toString().trim()));
    final List<IncludeRule> includeRules = rules.getIncludeRules();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot/*final @NotNull AgentRunningBuild build*/, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    LOG.debug(String.format("Validating Checkout Rules '%s'", rules.toString().trim()));
    final List<IncludeRule> includeRules = rules.getIncludeRules();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot/*final @NotNull AgentRunningBuild build*/, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    LOG.debug(String.format("Validating Checkout Rules '%s'", rules.toString().trim()));
    final List<IncludeRule> includeRules = rules.getIncludeRules();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  static File getRulePath(final @NotNull IncludeRule rule) {
    return new File(rule.getTo());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootPath(final @NotNull File checkoutRoot, final @NotNull File ruleToPath, final @NotNull File relativePathWitninAView) throws VcsValidationException {
    final String relativePathWitninAViewPath = relativePathWitninAView.getPath();
    final String checkoutRuleRightPath = ruleToPath.getPath();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootPath(final @NotNull File checkoutRoot, final @NotNull File ruleToPath, final @NotNull File relativePathWitninAView) throws VcsValidationException {
    final String relativePathWitninAViewPath = relativePathWitninAView.getPath();
    final String checkoutRuleRightPath = ruleToPath.getPath();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootPath(final @NotNull File checkoutRoot, final @NotNull File ruleToPath, final @NotNull File relativePathWitninAView) throws VcsValidationException {
    final String relativePathWitninAViewPath = relativePathWitninAView.getPath();
    final String checkoutRuleRightPath = ruleToPath.getPath();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    return getRelativeClearCaseVievRootDirectory(vcsRoot, checkoutRoot, rules.getIncludeRules().get(0));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    return getRelativeClearCaseVievRootDirectory(vcsRoot, checkoutRoot, rules.getIncludeRules().get(0));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    return getRelativeClearCaseVievRootDirectory(vcsRoot, checkoutRoot, rules.getIncludeRules().get(0));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    return getRelativeClearCaseVievRootDirectory(vcsRoot, checkoutRoot, rules.getIncludeRules().get(0));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootDirectory(/*final @NotNull AgentRunningBuild build, */final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull IncludeRule includeRule) throws VcsValidationException {
    //VCS & Runner settings:
    //Checkout directory: dev/views
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootDirectory(/*final @NotNull AgentRunningBuild build, */final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull IncludeRule includeRule) throws VcsValidationException {
    //VCS & Runner settings:
    //Checkout directory: dev/views
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/RuleBasedSourceProvider.java`
#### Snippet
```java
  }

  protected File getRelativeClearCaseVievRootDirectory(/*final @NotNull AgentRunningBuild build, */final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull IncludeRule includeRule) throws VcsValidationException {
    //VCS & Runner settings:
    //Checkout directory: dev/views
```

### MissortedModifiers
Missorted modifiers `final private`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecBuilder.java`
#### Snippet
```java
public class ConfigSpecBuilder implements ConfigSpecRulesProcessor {
  final private List<ConfigSpecLoadRule> myLoadRules = new ArrayList<ConfigSpecLoadRule>();
  final private List<ConfigSpecStandardRule> myStandardRules = new ArrayList<ConfigSpecStandardRule>();
  final private File myViewRoot;

```

### MissortedModifiers
Missorted modifiers `final private`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecBuilder.java`
#### Snippet
```java

public class ConfigSpecBuilder implements ConfigSpecRulesProcessor {
  final private List<ConfigSpecLoadRule> myLoadRules = new ArrayList<ConfigSpecLoadRule>();
  final private List<ConfigSpecStandardRule> myStandardRules = new ArrayList<ConfigSpecStandardRule>();
  final private File myViewRoot;
```

### MissortedModifiers
Missorted modifiers `final private`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecBuilder.java`
#### Snippet
```java
  final private List<ConfigSpecLoadRule> myLoadRules = new ArrayList<ConfigSpecLoadRule>();
  final private List<ConfigSpecStandardRule> myStandardRules = new ArrayList<ConfigSpecStandardRule>();
  final private File myViewRoot;

  public ConfigSpecBuilder(final File viewRoot) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java

    @NotNull
    public String apply(final @NotNull String line) {
      for (final Pattern pattern : myIgnoreErrorPatterns) {
        final Matcher matcher = pattern.matcher(line);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
  }

  public void copyFileContentTo(final @NotNull String versionFqn, final @NotNull String destFileFqn) throws IOException, VcsException {
    final InputStream input = executeAndReturnProcessInput(new String[]{"get", "-to", destFileFqn, versionFqn});
    input.close();
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
  }

  public void copyFileContentTo(final @NotNull String versionFqn, final @NotNull String destFileFqn) throws IOException, VcsException {
    final InputStream input = executeAndReturnProcessInput(new String[]{"get", "-to", destFileFqn, versionFqn});
    input.close();
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java

  public static final @NonNls String CHECKEDOUT = "CHECKEDOUT";
  public static final @NonNls String LATEST = "LATEST";

  public static final @NonNls String MKBRANCH_OPTION = "-mkbranch";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String FILE_INCLUSION = "include";
  public static final @NonNls String CREATE_BRANCH = "mkbranch";
  public static final @NonNls String STANDARD = "element";

  public static final @NonNls String STANDARD_FILE = "-file";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String STANDARD_FILE = "-file";
  public static final @NonNls String STANDARD_DIRECTORY = "-directory";
  public static final @NonNls String STANDARD_ELTYPE = "-eltype";

  public static final @NonNls String BLOCK_RULE_END = "end";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String STANDARD = "element";

  public static final @NonNls String STANDARD_FILE = "-file";
  public static final @NonNls String STANDARD_DIRECTORY = "-directory";
  public static final @NonNls String STANDARD_ELTYPE = "-eltype";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
public class ConfigSpecRuleTokens {
  public static final @NonNls String LOAD = "load";
  public static final @NonNls String TIME = "time";
  public static final @NonNls String FILE_INCLUSION = "include";
  public static final @NonNls String CREATE_BRANCH = "mkbranch";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String LOAD = "load";
  public static final @NonNls String TIME = "time";
  public static final @NonNls String FILE_INCLUSION = "include";
  public static final @NonNls String CREATE_BRANCH = "mkbranch";
  public static final @NonNls String STANDARD = "element";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java

  public static final @NonNls String STANDARD_FILE = "-file";
  public static final @NonNls String STANDARD_DIRECTORY = "-directory";
  public static final @NonNls String STANDARD_ELTYPE = "-eltype";

```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String LATEST = "LATEST";

  public static final @NonNls String MKBRANCH_OPTION = "-mkbranch";
}

```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String BLOCK_RULE_END = "end";

  public static final @NonNls String CHECKEDOUT = "CHECKEDOUT";
  public static final @NonNls String LATEST = "LATEST";

```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String STANDARD_ELTYPE = "-eltype";

  public static final @NonNls String BLOCK_RULE_END = "end";

  public static final @NonNls String CHECKEDOUT = "CHECKEDOUT";
```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
  public static final @NonNls String TIME = "time";
  public static final @NonNls String FILE_INCLUSION = "include";
  public static final @NonNls String CREATE_BRANCH = "mkbranch";
  public static final @NonNls String STANDARD = "element";

```

### MissortedModifiers
Missorted modifiers `public static final @NonNls`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java

public class ConfigSpecRuleTokens {
  public static final @NonNls String LOAD = "load";
  public static final @NonNls String TIME = "time";
  public static final @NonNls String FILE_INCLUSION = "include";
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  public void drop(final @NotNull File folder, final @NotNull File[] files, String reason) throws CCException {
    try {
      CTool.rmelem(folder/*myLocalPath*/, files, reason);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  public void drop(final @NotNull File folder, final @NotNull File[] files, String reason) throws CCException {
    try {
      CTool.rmelem(folder/*myLocalPath*/, files, reason);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  public CCDelta[] update(final @NotNull File path) throws CCException {
    try {
      final ChangeParser[] history = CTool.update(path, new Date());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  protected CCHistory[] add(final @NotNull File[] files, String reason) throws CCException {
    try {
      CCHistory lastRevision = null;       
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  protected CCHistory checkin(final @NotNull File file, String reason) throws CCException {
    try {
      // TODO: check the File inside the View
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }
  
  CCSnapshotView(final @NotNull ViewParser parser) {
    this(parser.getRegion(), parser.getServerHost(), parser.getTag(), parser.getGlobalPath(),
         parser.getAttributes() != null && parser.getAttributes().contains(ViewParser.ATTRIBUTE_UCM), parser.getOwner());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  protected void checkout(final @NotNull File file, String reason) throws CCException {
    try {
      // TODO: check the File inside the View
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  }

  public boolean isCheckedout(final @NotNull File file) throws CCException {
    try {
      return CTool.isCheckedout(myLocalPath, file);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  }
  
  public static void setCommandExecutor(final @NotNull ICommandExecutor executor) {
    ourCommandExecutor = executor;
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  }

  static StreamParser lsStream(final @NotNull String viewTag) throws IOException, InterruptedException {
    final String command = String.format(CMD_LSSTREAM, getCleartoolExecutable(), viewTag);
    return new StreamParser(getCommandExecutor().execAndWait(command));
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
  }

  static abstract class AbstractCCParser implements ICCOutputParser {

    private final String[] myStdOut;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) {
    return new File(build.getAgentTempDirectory(), build.getBuildTypeId());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) {
    return new File(build.getAgentTempDirectory(), build.getBuildTypeId());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java

  @Override
  protected File getCCRootDirectory(AgentRunningBuild build, final @NotNull VcsRoot vcsRoot, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) {
    return new File(build.getAgentTempDirectory(), build.getBuildTypeId());
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected boolean isAncestor(final @NotNull File ancestor, final @NotNull File parentCandidate) {
    String nparent = parentCandidate.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    String nancestor = ancestor.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected boolean isAncestor(final @NotNull File ancestor, final @NotNull File parentCandidate) {
    String nparent = parentCandidate.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    String nancestor = ancestor.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * removes all view.dat files in the directories starting from 'from' till 'to'(from child to parent)
   */
  private void cleanClearCaseData(final @NotNull File from, final @NotNull File to) {
    File parent = from;
    while (parent != null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
   * removes all view.dat files in the directories starting from 'from' till 'to'(from child to parent)
   */
  private void cleanClearCaseData(final @NotNull File from, final @NotNull File to) {
    File parent = from;
    while (parent != null) {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected static File getRelativePathWithinAView(final @NotNull VcsRoot vcsRoot) {
    return new File(vcsRoot.getProperty(Constants.RELATIVE_PATH));
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected abstract File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;

  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected abstract File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;

  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected abstract File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;

  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  protected abstract File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;

  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    //do nothing
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    //do nothing
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  public void validate(final @NotNull File checkoutRoot, final @NotNull VcsRoot vcsRoot, final @NotNull CheckoutRules rules) throws VcsValidationException {
    //do nothing
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  protected abstract File getCCRootDirectory(final @NotNull AgentRunningBuild build, final @NotNull VcsRoot root, final @NotNull File checkoutRoot, final @NotNull CheckoutRules rules) throws VcsValidationException;

  protected CCSnapshotView getView(AgentRunningBuild build, VcsRoot root, File checkoutRoot, final @NotNull CheckoutRules rules, BuildProgressLogger logger) throws VcsValidationException, CCException {
    // use tmp for build
    final File ccCheckoutRoot = getCCRootDirectory(build, root, checkoutRoot, rules);
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  @NonNls
  public static final String LINE_END_DELIMITER = "###----###";
  public final static String FORMAT = "%u" //user
      + DELIMITER + "%Nd" //date
      + DELIMITER + "%En" //object name
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  }

  private static boolean isUCMView(final @NotNull VcsRoot root) {
    return root.getProperty(Constants.TYPE, Constants.BASE).equals(Constants.UCM);
  }
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  static final Logger LOG = Logger.getLogger(ClearCaseConnection.class);

  public final static String DELIMITER = "#--#";

  @NonNls
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  }
  
  static String testConnection(final @NotNull VcsRoot vcsRoot) throws IOException, VcsException {
    final String viewPath = ClearCaseSupport.getViewPath(vcsRoot).getWholePath();
    return ClearCaseInteractiveProcessPool.doWithProcess(viewPath, new ClearCaseInteractiveProcessPool.ProcessComputable<String>() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

      private State state = State.START;
      private final static Logger LOGGER = Logger.getLogger(FileCopier.class.getName());
      // the copy intervall we want to get in ms
      private static final int WANTED_TIME = 1000;
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

      public final static String FILE_PROPERTY = "file";
      public final static String BYTE_COUNTER_PROPERTY = "byte_counter";
      public final static String STATE_PROPERTY = "state";

```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    public static class FileCopier {

      public final static String FILE_PROPERTY = "file";
      public final static String BYTE_COUNTER_PROPERTY = "byte_counter";
      public final static String STATE_PROPERTY = "state";
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  }

  public static String[] makeArguments(final @NotNull String command) {
    return ParametersList.parse(command);
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  }

  public static boolean isExecutableNotFoundException(final @NotNull Exception e) {
    return EXE_NOT_FOUND_PATTERN.matcher(e.getMessage().trim()).matches();
  }
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    }

    public ExecutableNotFoundException(final @NotNull String command, final @NotNull String message) {
      super(message);
      myExecutable = extractExecutable(command);
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    }

    public ExecutableNotFoundException(final @NotNull String command, final @NotNull String message) {
      super(message);
      myExecutable = extractExecutable(command);
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      private long oldCopiedBytes;
      private long copiedBytes;
      private final static NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
      private long position;
      private long sourceLength;
```

### MissortedModifiers
Missorted modifiers `final static`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      public final static String FILE_PROPERTY = "file";
      public final static String BYTE_COUNTER_PROPERTY = "byte_counter";
      public final static String STATE_PROPERTY = "state";

      public enum State {
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  }

  public String testConnection(final @NotNull VcsRoot vcsRoot) throws VcsException {
    final String[] validationResult = new String[] { "Passed" };
    //validate in general
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

  @Autowired
  public ClearCaseSupport(final @NotNull SBuildServer server, final @NotNull ServerPaths serverPaths, final @NotNull EventDispatcher<BuildServerListener> dispatcher) {
    this();
    File cachesRootDir = new File(new File(serverPaths.getCachesDir()), "clearCase");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

  @Autowired
  public ClearCaseSupport(final @NotNull SBuildServer server, final @NotNull ServerPaths serverPaths, final @NotNull EventDispatcher<BuildServerListener> dispatcher) {
    this();
    File cachesRootDir = new File(new File(serverPaths.getCachesDir()), "clearCase");
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

  @Autowired
  public ClearCaseSupport(final @NotNull SBuildServer server, final @NotNull ServerPaths serverPaths, final @NotNull EventDispatcher<BuildServerListener> dispatcher) {
    this();
    File cachesRootDir = new File(new File(serverPaths.getCachesDir()), "clearCase");
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  private static final Pattern COLON_OR_SEMICOLON_PATTERN = Pattern.compile("[;:]");

  private @Nullable ClearCaseStructureCache myCache;

  private static ClearCaseSupport ourDefault;
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
  private static final int EXPECTED_CHANGE_FIELD_COUNT = 9;
  private static final String EVENT = "event ";
  private static final ThreadLocal<DateFormat> ourDateFormat = new ThreadLocal<DateFormat>() {
    @Override
    protected DateFormat initialValue() {
```

### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCCommonParseUtil.java`
#### Snippet
```java
  @NonNls @NotNull public static final String OUTPUT_DATE_FORMAT = "yyyyMMdd.HHmmss";
  @NonNls @NotNull private static final String INPUT_DATE_FORMAT = "dd-MMMM-yyyy.HH:mm:ss";
  @NotNull private static final ThreadLocal<DateFormat> ourDateFormat = new ThreadLocal<DateFormat>() {
    @Override
    protected DateFormat initialValue() {
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`path = path + element.getObjectVersion()` could be simplified to 'path += element.getObjectVersion()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    String path = element.getObjectName().trim();
    if (path.endsWith(CCParseUtil.CC_VERSION_SEPARATOR)) {
      path = path + element.getObjectVersion();
    } else {
      path = path + CCParseUtil.CC_VERSION_SEPARATOR + element.getObjectVersion();
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
    final StringBuilder buffer = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      if (isEndOfCommandOutput(line, params)) {
        final String theRest = getLastOutput();
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
      int result = configSpecIncludesIndex;

      while ((line = reader.readLine()) != null) {
        if (writer != null) {
          writer.write(line);
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseFileAttr.java`
#### Snippet
```java
    String fileType = null;
    boolean executable = false;
    while ((line  = reader.readLine() ) != null) {
      if (line.startsWith(ELEMENT_TYPE)) {
        fileType = line.substring(ELEMENT_TYPE.length());
```

### NestedAssignment
Result of assignment expression used
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      final ArrayList<ChangeParser> out = new ArrayList<ChangeParser>();
      String line;
      while ((line = reader.readLine()) != null) {
        if (ChangeParser.accept(line)) {
          out.add(new ChangeParser(line));
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
        try {
          String line;
          while ((line = reader.readLine()) != null) {
            result.append(line).append('\n');
          }
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java

      String line;
      while ((line = reader.readLine()) != null) {
        if (line.trim().length() > 0) {
          String elementVersion = readVersion(line);
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    try {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.equals(label)) {
          return true;
```

### NestedAssignment
Result of assignment expression used
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
      try {
        String line;
        while ((line = reader.readLine()) != null) {
          final SimpleDirectoryChildElement element = CCParseUtil.readChildFromLSFormat(line);
          if (element != null) {
```

### NestedAssignment
Result of assignment expression used
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
          byte[] buffer = new byte[1];
          int in;
          while ((in = inStream.read()) > -1) {// use
            // "final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));"
            // instead
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myTempFile` is accessed in both synchronized and unsynchronized contexts
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPatchProvider.java`
#### Snippet
```java
	private static final Logger LOG = Logger.getLogger(CCPatchProvider.class);	
	
  private File myTempFile;
  private final ClearCaseConnection myConnection;
  public static final String CLEARCASE_OPTIMIZE_INITIAL_CHECKOUT_PROPERTY_NAME = "clearcase.optimize.initial.checkout";
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  }

  public void dispose() throws VcsException {
    // TODO Auto-generated method stub
  }
```

### EmptyMethod
The method is empty
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      }

      public void dispose() {}
    };
  }
```

### EmptyMethod
The method is empty
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      }

      public void dispose() {}
    };
  }
```

### EmptyMethod
All implementations of this method are empty
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRulesProcessor.java`
#### Snippet
```java
public interface ConfigSpecRulesProcessor {
  void processLoadRule(final String rule);
  void processTimeRule(final String rule, final boolean isBlockStart);
  void processCreateBranchRule(final String rule, final boolean isBlockStart);
  void processStandartRule(final String scope, final String pattern, final String rule);
```

### EmptyMethod
All implementations of this method are empty
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRulesProcessor.java`
#### Snippet
```java
  void processLoadRule(final String rule);
  void processTimeRule(final String rule, final boolean isBlockStart);
  void processCreateBranchRule(final String rule, final boolean isBlockStart);
  void processStandartRule(final String scope, final String pattern, final String rule);
}
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  protected String myTag;

  private boolean isUcm = false;

  private String myStream;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
  private String myVersion;

  private boolean myIsFromViewPath = false;

  public CCPathElement(final String pathElement, final boolean hasVersion) {
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    } catch (Throwable e) {
      LOG.debug(e.getMessage(), e);
      if(e instanceof ExecutableNotFoundException){
        return false;
      }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CommentHolder.java`
#### Snippet
```java

  public String toString() {
    final StringBuffer result = new StringBuffer();

    if (!myActivities.isEmpty()) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
  protected String readError() throws IOException {
    if (myError == null) return "";
    final StringBuffer result = new StringBuffer();
    int available = myError.available();
    if (available > 0) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer commandLine` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
  @Override
  protected String createCommandLineString(@NotNull final String[] args) {
    final StringBuffer commandLine = new StringBuffer();
    commandLine.append("cleartool");
    for (final String arg : args) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer margin` may be declared as 'StringBuilder'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
  private void dumpDirsHierarchy(final String absolutePath) {
    File parent = new File(absolutePath).getParentFile();
    StringBuffer margin = new StringBuffer();
    while (parent != null) {
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer out` may be declared as 'StringBuilder'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java

  protected static void report(final String message, boolean trapException) throws VcsValidationException {
    final StringBuffer out = new StringBuffer(message).append(". ");
    if (!trapException) {
      out.append(Messages.getString("ConvensionBasedSourceProvider.validation_failed_error_message_tail")); //$NON-NLS-1$
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java

  private String describe(CCDelta[] changes) {
    StringBuffer buffer = new StringBuffer();
    int added = 0;
    int changed = 0;
```

### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    return ClearCaseInteractiveProcessPool.doWithProcess(viewPath, new ClearCaseInteractiveProcessPool.ProcessComputable<String>() {
      public String compute(@NotNull final ClearCaseInteractiveProcess process) throws IOException, VcsException {
        final StringBuffer result = new StringBuffer();
        final String[] params = isUCMView(vcsRoot) ? new String[] { "lsstream", "-long" } : new String[] { "describe", insertDots(viewPath, true) };
        final InputStream input = process.executeAndReturnProcessInput(params);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer readableOut` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

    //format exception if something is
    final StringBuffer readableOut = new StringBuffer();
    if (!validationErrors.isEmpty()) {
      for (final Map.Entry<IValidation, Collection<InvalidProperty>> entry : validationErrors.entrySet()) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer specsBuffer` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
              final CCSnapshotView ccView = CCSnapshotView.init(viewRoot);
              LOG.debug(String.format("The \"%s\" view initialized", ccView));
              final StringBuffer specsBuffer = new StringBuffer();
              for (String spec : ccView.getConfigSpec()) {
                specsBuffer.append(spec).append("\n");
```

### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java

  public static String createPath(final List<CCPathElement> ccPathElements, final int startIndex, final int endIndex, final boolean appentVersion) {
    StringBuffer result = new StringBuffer();
    boolean first = true;
    for (int i = startIndex; i < endIndex; i++) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcess.java`
#### Snippet
```java
    static final String WARN_LOG_MESSAGE_PATTERN = "Error was detected but rejected by filter: %s";

    private Pattern[] myIgnoreErrorPatterns = new Pattern[0];

    protected ClearCaseErrorFilter(final Pattern... ignorePatterns) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      try {
        getCommandExecutor().execAndWait(command, "yes", myLocalPath);
        return new ChangeParser[0];// should not reach there

      } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    private String myPath;

    private String[] myLabels = new String[0];

    protected VersionParser(String[] stdout) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
  static class ValidationComposite {

    private IValidation[] myValidators = new IValidation[0];

    ValidationComposite(IValidation... validators) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        return trimElements(outBuffer.toString().trim().split("\n+"));
      }
      return new String[0];

    } catch (IOException e) {
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
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      ourCleartoolExecutable = executable.trim();
    } else {
      LOG.warn(String.format("Could not set CleartoolExecutable to \"null\""));
    }
  }
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

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  @Nullable
  public Map<String, String> getDefaultVcsProperties() {
    return new HashMap<String, String>() {{
      put(Constants.BRANCH_PROVIDER, Constants.BRANCH_PROVIDER_AUTO);
    }};
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `VcsValidationException` ends with 'Exception'
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/VcsValidationException.java`
#### Snippet
```java
import jetbrains.buildServer.vcs.VcsException;

public class VcsValidationException extends VcsException {

  public VcsValidationException() {
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
Value `parser.comment` is always 'null'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCHistory.java`
#### Snippet
```java
    myVersion = parser.version;

    myComment = parser.comment;

  }
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
Condition `e instanceof VcsException` is always `true`
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

## RuleId[id=IOResource]
### IOResource
'FileInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        final Transferrer[] transferrers = new Transferrer[destinationCount];
        for (int i = 0; i < destinationCount; i++) {
          transferrers[i] = new Transferrer(new FileInputStream(source).getChannel(), new FileOutputStream(destinations[i]).getChannel());
        }

```

### IOResource
'FileOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        final Transferrer[] transferrers = new Transferrer[destinationCount];
        for (int i = 0; i < destinationCount; i++) {
          transferrers[i] = new Transferrer(new FileInputStream(source).getChannel(), new FileOutputStream(destinations[i]).getChannel());
        }

```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `comment` may be 'static'
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
    final String operation;
    final String event;
    final String comment = null;
    final String activity;

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ClearCaseInteractiveProcessPool` has only 'static' members, and lacks a 'private' constructor
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/ClearCaseInteractiveProcessPool.java`
#### Snippet
```java
import org.jetbrains.annotations.TestOnly;

public class ClearCaseInteractiveProcessPool {
  @NotNull private static ClearCaseFacade ourProcessExecutor = new ClearCaseFacade() {
    @NotNull
```

### UtilityClassWithoutPrivateConstructor
Class `CCCommonParseUtil` has only 'static' members, and lacks a 'private' constructor
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCCommonParseUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class CCCommonParseUtil {
  @NonNls @NotNull public static final String OUTPUT_DATE_FORMAT = "yyyyMMdd.HHmmss";
  @NonNls @NotNull private static final String INPUT_DATE_FORMAT = "dd-MMMM-yyyy.HH:mm:ss";
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigSpecParseUtil` has only 'static' members, and lacks a 'private' constructor
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class ConfigSpecParseUtil {
  public static ConfigSpec getAndSaveConfigSpec(final ViewPath viewPath, final File outputConfigSpecFile, final ClearCaseInteractiveProcess process) throws VcsException, IOException {
    clearOldSavedVersion(outputConfigSpecFile);
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigSpecRuleTokens` has only 'static' members, and lacks a 'private' constructor
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecRuleTokens.java`
#### Snippet
```java
import org.jetbrains.annotations.NonNls;

public class ConfigSpecRuleTokens {
  public static final @NonNls String LOAD = "load";
  public static final @NonNls String TIME = "time";
```

### UtilityClassWithoutPrivateConstructor
Class `CTool` has only 'static' members, and lacks a 'private' constructor
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class CTool {

  public static final String CLEARTOOL_EXEC_PATH_ENV = "CLEARTOOL_PATH"; //$NON-NLS-1$
```

### UtilityClassWithoutPrivateConstructor
Class `Finder` has only 'static' members, and lacks a 'private' constructor
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  }

  public static class Finder {

    public static CCSnapshotView findView(CCRegion region, String viewTag) throws CCException {
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
Dereference of `currentDirectory.listFiles()` may produce `NullPointerException`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        long tmpByteCount = 0;
        List<File> files = new ArrayList<File>();
        for (File subFile : currentDirectory.listFiles()) {

          // check if subfile matches
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
        final CCPathElement currentPair = new CCPathElement(subName.substring(0, subName.length() - CCParseUtil.CC_VERSION_SEPARATOR.length()), true);
        result.add(currentPair);
        i = processVersion(currentPair, i, subNames);
        hadVersionSeparator = true;
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java
        final CCPathElement currentPair = new CCPathElement(subName, true);
        result.add(currentPair);
        i = processVersion(currentPair, i, subNames);
      }
      else {
```

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ViewPath.java`
#### Snippet
```java

  private void appendPath(@NotNull final StringBuilder sb, @Nullable final String additionalPath) {
    if (additionalPath != null && !"".equals(additionalPath)) {
      sb.append(File.separatorChar);
      sb.append(additionalPath);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/CacheProcessor.java`
#### Snippet
```java

  private boolean isRoot(final String name) {
    return "".equals(name);
  }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    try {
      final String viewRoot = reader.readLine();
      if (viewRoot == null || "".equals(viewRoot.trim())) {
        int offset = 0;
        if (normalPath.startsWith(UNIX_VIEW_PATH_PREFIX)) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

          // wait until all transferrers completed their execution
          //noinspection ForLoopReplaceableByForEach
          for (int i = 0; i < destinationCount; i++) {
            try {
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
      return myProcess.executeAndReturnProcessInput(params);
    }
    //noinspection SSBasedInspection
    return new ByteArrayInputStream("".getBytes());
  }
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("deprecation")
  public String getCurrentVersion(@NotNull final VcsRoot root) throws VcsException {
    final Ref<String> result = new Ref<String>();
    try {
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementMerger.java`
#### Snippet
```java

  private boolean isFirstNewer() {
    //noinspection ConstantConditions
    final Date firstDate = myFirstNextElement.getDate(), secondDate = mySecondNextElement.getDate();
    //noinspection ConstantConditions
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementMerger.java`
#### Snippet
```java
    //noinspection ConstantConditions
    final Date firstDate = myFirstNextElement.getDate(), secondDate = mySecondNextElement.getDate();
    //noinspection ConstantConditions
    return firstDate.equals(secondDate) // event ID order can be not the same as date order in case of using VOB replicas
           ? myFirstNextElement.getEventID() > mySecondNextElement.getEventID()
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementMerger.java`
#### Snippet
```java
  private HistoryElement getFirstNext() throws IOException {
    try {
      //noinspection ConstantConditions
      return myFirstNextElement;
    }
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementMerger.java`
#### Snippet
```java
  private HistoryElement getSecondNext() throws IOException {
    try {
      //noinspection ConstantConditions
      return mySecondNextElement;
    }
```

### RedundantSuppression
Redundant suppression
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementProvider.java`
#### Snippet
```java
    }
    try {
      //noinspection ConstantConditions
      return myNextElement;
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    StringBuffer margin = new StringBuffer();
    while (parent != null) {
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      System.err.println(String.format("%sdir(%s)", margin.toString(), parent.getPath()));
      for (File file : parent.listFiles()) {
        System.err.println(String.format("%s%s", margin.toString(), file.getPath()));
      }
      parent = parent.getParentFile();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
      if (getCCRootsCount(build) == scheduledRequests.size()) {
        try {
          System.err.println("the last");
          //          createLinks(ccview, absoluteLinkSource, linkTargetOwnerDirectory, linkBuffer);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    System.out.println(dump());
    super.finalize();
  }
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
    }
    final String eventId = parts[0].trim();
    final String[] strings = parts[1].trim().split(ClearCaseConnection.DELIMITER, EXPECTED_CHANGE_FIELD_COUNT);
    if (strings.length < EXPECTED_CHANGE_FIELD_COUNT - 1) {
      return null;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecParseUtil.java`
#### Snippet
```java
      return nextQuotePos == -1 ? line : line.substring(0, nextQuotePos + 1);
    } else {
      final String lineWithSpaces = line.replaceFirst("\\s", " ");
      final int firstSpacePos = lineWithSpaces.indexOf(' ');
      return firstSpacePos == -1 ? lineWithSpaces : lineWithSpaces.substring(0, firstSpacePos);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

  private static String escapeBackSlash(final String s) {
    return s.replace("\\","\\\\");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    String result = pattern;
    result = escapeDots(result);
    result = result.replace("*", ".*");
    result = result.replace("?", ".");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    result = escapeDots(result);
    result = result.replace("*", ".*");
    result = result.replace("?", ".");

    String escapedSeparator = escapeBackSlash(File.separator);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
        final String trim = line.trim();
        if (trim.startsWith(TAG_TOKEN)) {
          final String[] split = trim.split(" +");
          myTag = getRest(String.format("%s %s", split[0], split[1]), TAG_TOKEN);// as far as cleartool put the comment next to the tag
        } else if (trim.startsWith(GLOBAL_PATH_TOKEN)) {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
          String labels = elements[3].trim();
          labels = labels.substring(1, labels.length() - 1);// extract brackets
          myLabels = labels.split(", ");
        }
      }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      if (versionBeforStartIdx != -1) {
        String versionsPart = line.substring(versionBeforStartIdx + 1).trim();
        final String[] versions = versionsPart.split("[ +]");
        if (versions.length > 0) {
          myVersionAfter = versions[0];
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java

  protected boolean isAncestor(final @NotNull File ancestor, final @NotNull File parentCandidate) {
    String nparent = parentCandidate.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    String nancestor = ancestor.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    return nparent.endsWith(nancestor);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
  protected boolean isAncestor(final @NotNull File ancestor, final @NotNull File parentCandidate) {
    String nparent = parentCandidate.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    String nancestor = ancestor.getPath().replace("\\", "/"); //$NON-NLS-1$ //$NON-NLS-2$
    return nparent.endsWith(nancestor);
  }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      LOG.debug(String.format("Found ConfigSpecs for \"%s\": %s", root.getName(), configSpecs)); //$NON-NLS-1$
    }
    return configSpecs.split("\n+"); //$NON-NLS-1$
  }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      }
      if (outBuffer.toString().trim().length() > 0) {
        return trimElements(outBuffer.toString().trim().split("\n+"));
      }
      return new String[0];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
      }
      //treat first argument as executable executable
      String[] arguments = command.split("\\s+");
      if (arguments.length > 1) {
        return arguments[0];
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  }

  public static java.io.File createTempFile() throws IOException {
    return java.io.File.createTempFile("clearcase-agent", "tmp");
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  public static java.io.File createTempFile() throws IOException {
    return java.io.File.createTempFile("clearcase-agent", "tmp");
  }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `InteractiveProcess()` of an abstract class should not be declared 'public'
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java
  @Nullable private final OutputStream myOutput;

  public InteractiveProcess(@Nullable final InputStream inputStream,
                            @Nullable final InputStream errorStream,
                            @Nullable final OutputStream outputStream) {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/LinkBasedSourceProvider.java`
#### Snippet
```java
      //schedule publish
      Collection<PublishingRequest> requests = requestsMap.get(build.getBuildTypeId());
      if (requests == null) {
        requests = new ArrayList<PublishingRequest>();
        requestsMap.put(build.getBuildTypeId(), requests);
```

### Java8MapApi
Can be replaced with single 'Map.merge' method call
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    ourTotalSleepTime += delay;
    final Long classCounter = ourClassesSleepTime.get(sleepClass);
    if (classCounter == null) {
      ourClassesSleepTime.put(sleepClass, delay);
    } else {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        }

        barrier = new CyclicBarrier(destinationCount, new Runnable() {

          public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  private static Thread pipe(final InputStream inStream, final PrintStream outStream, final StringBuffer out) {
    Thread reader = new Thread(new Runnable() {
      public void run() {
        try {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      }

      Collections.sort(list, new Comparator<ModificationData>() {
        public int compare(final ModificationData o1, final ModificationData o2) {
          return o1.getVcsDate().compareTo(o2.getVcsDate());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
  @NotNull
  public Comparator<String> getVersionComparator() {
    return new Comparator<String>() {
      public int compare(@NotNull final String versionString1, @NotNull final String versionString2) {
        try {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `line`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java

    static boolean accept(String line) {
      line = line.trim();
      return line.startsWith(UPDATED_TOKEN) || line.startsWith(NEW_TOKEN) || line.startsWith(UNLOADED_DELETED_TOKEN);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java
      }
      // extract token
      line = line.substring(tokenLength).trim();
      // get local path
      int versionBeforStartIdx = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CTool.java`
#### Snippet
```java

    HistoryParser(String line) throws IOException {
      line = line.trim();
      Matcher matcher = PATTERN_WITHOUT_COMMENTS.matcher(line);
      if (matcher.matches()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `checkoutDirectory`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      if (!checkoutDirectory.isAbsolute()) {
        final String relativeCheckoutPath = checkoutDirectory.getPath();
        checkoutDirectory = new File(build.getAgentConfiguration().getWorkDirectory(), relativeCheckoutPath);
        LOG.debug(String.format("Relative Checkout path '%s' was expanded to '%s'", relativeCheckoutPath, checkoutDirectory));
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `version`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
  private static String normalizeVersion(String version) {
    if (version.startsWith(File.separator)) {
      version = version.substring(1);
    }
    return version;
```

### AssignmentToMethodParameter
Assignment to method parameter `childCandidatePath`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  public static boolean isUnderPath(@NotNull String childCandidatePath, @NotNull String patentCandidatePath) {
    childCandidatePath = trimLastSeparator(childCandidatePath);
    patentCandidatePath = trimLastSeparator(patentCandidatePath);
    return patentCandidatePath.equals(childCandidatePath)
```

### AssignmentToMethodParameter
Assignment to method parameter `patentCandidatePath`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
  public static boolean isUnderPath(@NotNull String childCandidatePath, @NotNull String patentCandidatePath) {
    childCandidatePath = trimLastSeparator(childCandidatePath);
    patentCandidatePath = trimLastSeparator(patentCandidatePath);
    return patentCandidatePath.equals(childCandidatePath)
        || (patentCandidatePath.length() < childCandidatePath.length() && childCandidatePath.startsWith(patentCandidatePath) && (childCandidatePath.charAt(patentCandidatePath.length()) == '\\' || childCandidatePath.charAt(patentCandidatePath.length()) == '/'));
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

  private static String trimLastSeparator(@NotNull String path) {
    path = path.trim();
    if (path.charAt(path.length() - 1) == '/' || path.charAt(path.length() - 1) == '\\') {
      path = path.substring(0, path.length() - 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
    path = path.trim();
    if (path.charAt(path.length() - 1) == '/' || path.charAt(path.length() - 1) == '\\') {
      path = path.substring(0, path.length() - 1);
    }
    return path;
```

### AssignmentToMethodParameter
Assignment to method parameter `command`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java

    private String extractExecutable(@NotNull String command) {
      command = command.trim();
      //respect 'long names'
      int nextQuotePos = -1;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java

  private static int processVersion(final CCPathElement currentPair, int i, final List<String> subNames) {
    for (i += 1; i < subNames.size(); i++) {
      currentPair.appendVersion(subNames.get(i));
      try {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCPathElement.java`
#### Snippet
```java

  private static int processVersion(final CCPathElement currentPair, int i, final List<String> subNames) {
    for (i += 1; i < subNames.size(); i++) {
      currentPair.appendVersion(subNames.get(i));
      try {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionHolder.java`
#### Snippet
```java
      if (brancheName.equals(inheritedBranche.getName())) return inheritedBranche;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementProvider.java`
#### Snippet
```java
    }
    catch (final ParseException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
      return comment.substring(firstPos + 1, lastPos);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
  public static HistoryElement readFrom(final String line) throws ParseException {
    if (!line.startsWith(EVENT)) {
      return null;
    }
    final String[] parts = line.substring(EVENT.length()).split(":", 2);
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
    final String[] parts = line.substring(EVENT.length()).split(":", 2);
    if (parts.length < 2) {
      return null;
    }
    final String eventId = parts[0].trim();
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElement.java`
#### Snippet
```java
    final String[] strings = parts[1].trim().split(ClearCaseConnection.DELIMITER, EXPECTED_CHANGE_FIELD_COUNT);
    if (strings.length < EXPECTED_CHANGE_FIELD_COUNT - 1) {
      return null;
    } else if (strings.length == EXPECTED_CHANGE_FIELD_COUNT - 1) {
      return createHistoryElement(eventId, strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], "");
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
    final File cacheDir = new File(myBaseDir, String.valueOf(root.getId()));

    if (createDirs && !cacheDir.exists() && !cacheDir.mkdirs()) return null;

    return cacheDir;
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/structure/ClearCaseStructureCache.java`
#### Snippet
```java
  public CacheElement getCache(@NotNull final DateRevision version, @NotNull final String path, @NotNull final IncludeRule includeRule, @NotNull final VcsRoot root) {
    final File cacheFile = createCacheFile(version.getDate(), path, root);
    if (cacheFile == null) return null;
    return new CacheElement(version, cacheFile, this, path, includeRule, myParentSupport, root);
  }
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
      if (branch.equals(topBranch.getName())) return topBranch;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
      intVersion = Integer.parseInt(lastVers);
    } catch (NumberFormatException e) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/VersionTree.java`
#### Snippet
```java
      }

      if (currentBranch == null) return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/HistoryElementMerger.java`
#### Snippet
```java
  @Nullable
  private HistoryElement readNext(@NotNull final HistoryElementIterator iterator) throws IOException {
    return iterator.hasNext() ? iterator.next() : null;
  }
}
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
      version = version.getNextVersion();
    }
    return null;

  }
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
  public Version findVersionByNumber(final int versionNumber) {
    if (myFirstVersion == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
    } while (version != null);

    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
      version = version.getNextVersion();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Branch.java`
#### Snippet
```java
  public Version getLastVersion() {
    if (myFirstVersion == null) {
      return null;
    }
    
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/process/InteractiveProcess.java`
#### Snippet
```java

  protected String getLastOutput() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/Revision.java`
#### Snippet
```java
  @Nullable
  public static Revision fromString(@Nullable final String stringRevision) throws ParseException {
    return stringRevision == null ? null : fromNotNullString(stringRevision);
  }

```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/Revision.java`
#### Snippet
```java
    @Override
    public DateRevision getDateRevision() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/ClearCaseAgentSupport.java`
#### Snippet
```java
      try {
        final DateRevision revision = Revision.fromNotNullString(toVersion).getDateRevision();
        if (revision == null) return null;
        return Revision.fromDate(Dates.after(revision.getDate(), Dates.ONE_SECOND)).getDateString(); // add one second to not miss the change with exactly the same date
      }
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/versionTree/Version.java`
#### Snippet
```java
      if (brancheName.equals(inheritedBranche.getName())) return inheritedBranche;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java
  private Version doGetCurrentVersion(final String ccViewRoot, final String fullFileName, final VersionTree versionTree, final boolean isFile) throws VcsException {
    if (!isUnderLoadRules(ccViewRoot, fullFileName)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecImpl.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    final Collection<Branch> branches = findBranches(versionTree);
    if (branches == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java

    final Version version = processBranches(fullFileName, branches);
    if (version == null) return null;

//    return myMkBranchOption == null ? version : makeBranch(connection, myMkBranchOption, fullFileName, version);
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
  private Version processVersions(final Collection<Version> versions, final String fullFileName) throws VcsException {
    if (versions.size() == 0) {
      return null;
    }
    if (versions.size() > 1) {
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
      if (ConfigSpecRuleTokens.MKBRANCH_OPTION.equalsIgnoreCase(trimmedWord)) wordShouldBeReturned = true;      
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/configSpec/ConfigSpecStandardRule.java`
#### Snippet
```java
    else {
      if (ConfigSpecRuleTokens.CHECKEDOUT.equalsIgnoreCase(myVersion)) {
        return null; //todo
      } else if (ConfigSpecRuleTokens.LATEST.equalsIgnoreCase(myVersion)) {
        return getLastVersion(branches, fullFileName);
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      CTool.rmname(myLocalPath, file, reason);
      //      CTool.checkin(myLocalPath, file.getParentFile(), reason);
      return null;
    } catch (Exception e) {
      throw new CCException(e);
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
    try {
      CTool.rmver(myLocalPath, file, version, reason);
      return null;
    } catch (Exception e) {
      throw new CCException(e);
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/CCSnapshotView.java`
#### Snippet
```java
      // TODO: check the File inside the View
      CTool.checkin(myLocalPath, file, reason);
      return null;//TODO: 
    } catch (Exception e) {
      throw new CCException(e);
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/CCParseUtil.java`
#### Snippet
```java
    }

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseValidation.java`
#### Snippet
```java
      return val.trim();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-agent/src/jetbrains/buildServer/vcs/clearcase/agent/AbstractSourceProvider.java`
#### Snippet
```java
      }
      LOG.debug(String.format("findView::found: %s", "no one suitable view's folder found")); //$NON-NLS-1$ //$NON-NLS-2$
      return null;

    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    } else {
      LOG.debug("ClearCase: last element version not found for " + pathWithoutVersion);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseConnection.java`
#### Snippet
```java
    final HistoryElementIterator iterator = new HistoryElementProvider(getChanges(null, "-all"));
    try {
      return iterator.hasNext() ? iterator.next() : null;
    }
    finally {
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        }
      } catch (Exception e) {
        return null;
      }
      return null;
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        return null;
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        if (!currentDirectory.exists()) {
          LOGGER.warn(currentDirectory + " does not exist");
          return null;
        }

```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        if (!currentDirectory.isDirectory()) {
          LOGGER.warn(currentDirectory + " is no directory");
          return null;
        }

```

### ReturnNull
Return of `null`
in `clearcase-common/src/jetbrains/buildServer/vcs/clearcase/Util.java`
#### Snippet
```java
        if (!currentDirectory.canRead()) {
          LOGGER.warn("can not read " + currentDirectory);
          return null;
        }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
    return FileUtil.isAncestor(parentFile, childFile, false)
           ? FileUtil.getRelativePath(parentFile.getAbsolutePath(), childFile.getAbsolutePath(), File.separatorChar)
           : null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
    final File file = new File(filePath);
    String relativePath = isAbsolute(file) ? getRelativePathIfAncestor(clearCaseViewPathFile, file) : file.getPath();
    if (relativePath == null) return null;
    if (StringUtil.startsWithIgnoreCase(relativePath.replace('\\','/'), Constants.VOBS)) {
      relativePath = relativePath.substring(Constants.VOBS.length());
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java

    if (file == null)
      return null;

    return sb.toString();
```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
        return key;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `clearcase-server/src/jetbrains/buildServer/buildTriggers/vcs/clearcase/ClearCaseSupport.java`
#### Snippet
```java
      return string.trim();
    }
    return null;
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

