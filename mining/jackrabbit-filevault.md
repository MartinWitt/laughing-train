# jackrabbit-filevault 
 
# Bad smells
I found 1842 bad smells with 495 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 280 | true |
| NestedAssignment | 149 | false |
| NullableProblems | 148 | false |
| AssignmentToMethodParameter | 104 | false |
| ReturnNull | 101 | false |
| DataFlowIssue | 99 | false |
| SizeReplaceableByIsEmpty | 93 | true |
| ConstantValue | 84 | false |
| BoundedWildcard | 66 | false |
| RedundantFieldInitialization | 53 | false |
| SystemOutErr | 43 | false |
| UnnecessaryFullyQualifiedName | 42 | false |
| IgnoreResultOfCall | 40 | false |
| ToArrayCallWithZeroLengthArrayArgument | 38 | true |
| ProtectedMemberInFinalClass | 27 | true |
| ZeroLengthArrayInitialization | 27 | false |
| StringBufferReplaceableByStringBuilder | 26 | false |
| DuplicateThrows | 24 | false |
| MissortedModifiers | 24 | false |
| UnnecessaryToStringCall | 19 | true |
| StringEqualsEmptyString | 19 | false |
| UnnecessaryBoxing | 19 | false |
| CommentedOutCode | 18 | false |
| DeprecatedIsStillUsed | 18 | false |
| CharsetObjectCanBeUsed | 15 | false |
| UtilityClassWithoutPrivateConstructor | 12 | true |
| RedundantClassCall | 11 | false |
| StringOperationCanBeSimplified | 9 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| StringBufferReplaceableByString | 9 | false |
| UseOfPropertiesAsHashtable | 9 | false |
| WhileCanBeForeach | 8 | false |
| UnnecessarySemicolon | 8 | false |
| RedundantSuppression | 8 | false |
| RedundantImplements | 8 | false |
| KeySetIterationMayUseEntrySet | 7 | false |
| UNUSED_IMPORT | 7 | false |
| UnusedAssignment | 7 | false |
| AssignmentToForLoopParameter | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| EmptyMethod | 6 | false |
| CStyleArrayDeclaration | 5 | false |
| RedundantArrayCreation | 5 | true |
| DuplicateBranchesInSwitch | 5 | false |
| AbstractClassNeverImplemented | 5 | false |
| InstanceofCatchParameter | 5 | false |
| IOResource | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| DuplicateExpressions | 4 | false |
| NonShortCircuitBoolean | 4 | false |
| MismatchedJavadocCode | 4 | false |
| EmptyStatementBody | 3 | false |
| FinalStaticMethod | 3 | false |
| UnnecessaryUnboxing | 3 | false |
| PublicFieldAccessedInSynchronizedContext | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| PointlessBooleanExpression | 3 | true |
| ArrayEquality | 3 | false |
| Convert2Lambda | 3 | false |
| NotNullFieldNotInitialized | 2 | false |
| RedundantMethodOverride | 2 | false |
| UnnecessaryInitCause | 2 | false |
| SamePackageImport | 2 | false |
| UseCompareMethod | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| NonFinalFieldOfException | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| ThrowableNotThrown | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| FinalPrivateMethod | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| MethodOverloadsParentMethod | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| UseBulkOperation | 1 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| ObsoleteCollection | 1 | false |
| UnnecessaryEmptyArrayUsage | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| MalformedFormatString | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| OptionalIsPresent | 1 | false |
| Convert2MethodRef | 1 | false |
| RedundantCollectionOperation | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| Java8MapApi | 1 | false |
| UnnecessaryContinue | 1 | false |
| ThreadStartInConstruction | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Value\[values.size()\]'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/DocViewPropertyValueFactory.java`
#### Snippet
```java
            values.add(getValue(value, property.getType()));
        }
        return values.toArray(new Value[values.size()]);
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new RepositoryCFile\[ret.size()\]'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/RepositoryCFile.java`
#### Snippet
```java
                    ret.add(new RepositoryCFile(niter.nextNode()));
                }
                return ret.toArray(new RepositoryCFile[ret.size()]);
            } else {
                return ConsoleFile.EMPTY_ARRAY;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[tokens.size()\]'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
            tokens.add(buf.toString());
        }
        return (String[]) tokens.toArray(new String[tokens.size()]);
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[triggers.size()\]'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
        }
        Set triggers = currentCtx.getCommandsGroup().getTriggers();
        reader.addCompletor(new SimpleCompletor((String[]) triggers.toArray(new String[triggers.size()])));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[rts.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
                rts.add(p.getRoot());
            }
            String[] filterRoots = rts.toArray(new String[rts.size()]);
            addManifestAttribute(mf, MF_PACKAGE_ID, id.toString());
            addManifestAttribute(mf, MF_PACKAGE_DESC, properties.getProperty(NAME_DESCRIPTION));
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new NodeTypeDefinition\[nodeTypes.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JcrNodeTypeInstaller.java`
#### Snippet
```java
        if (nodeTypes.size() > 0) {
            try {
                ntMgr.registerNodeTypes(nodeTypes.toArray(new NodeTypeDefinition[nodeTypes.size()]), true);
            } catch (UnsupportedOperationException e) {
                log.error("Unable to install node types.");
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[namespaces.keySet().size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ContentAnalyzer.java`
#### Snippet
```java

    public String[] getNamespaceURIs() {
        return namespaces.keySet().toArray(new String[namespaces.keySet().size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Principal\[existingPrincipals.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
                // remove existing policy for 'overwrite'
                if (aclHandling == AccessControlHandling.OVERWRITE) {
                    psPolicy.removePrincipals(existingPrincipals.toArray(new Principal[existingPrincipals.size()]));
                }
            } else {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[prefixes.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
                // need to traverse the nodes to get all namespaces
                loadNamespaces(prefixes, "", getNode());
                namespacePrefixes = prefixes.toArray(new String[prefixes.size()]);
            } catch (RepositoryException e) {
                throw new IllegalStateException("Internal error while loading namespaces", e);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strings.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java

        // return string array
        return strings.toArray(new String[strings.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[segs.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Version.java`
#### Snippet
```java
            }
        }
        return new Version(str.toString(), segs.toArray(new String[segs.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[vals.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
                values = Constants.EMPTY_STRING_ARRAY;
            } else {
                values = vals.toArray(new String[vals.size()]);
            }
        } else {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[deps.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
            }
        }
        return deps.toArray(new Dependency[deps.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[deps.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
            }
        }
        return deps.toArray(new Dependency[deps.size()]);
    }
    
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[rules.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
            rules.add(type + ":" + patt);
        }
        setNode.setProperty(propertyName, rules.toArray(new String[rules.size()]));
    }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[installState.getDependencies().size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FsPackageProperties.java`
#### Snippet
```java
            return Dependency.EMPTY;
        } else {
            return installState.getDependencies().toArray(new Dependency[installState.getDependencies().size()]);
        } 
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[unresolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
        }

        return new DependencyReportImpl(id, unresolved.toArray(new Dependency[unresolved.size()]),
                resolved.toArray(new PackageId[resolved.size()])
        );
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[resolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java

        return new DependencyReportImpl(id, unresolved.toArray(new Dependency[unresolved.size()]),
                resolved.toArray(new PackageId[resolved.size()])
        );
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[usages.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
            }
        }
        return usages.toArray(new PackageId[usages.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[installState.getDependencies().size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    public FSRegisteredPackage(FSPackageRegistry registry, FSInstallState installState) throws IOException {
        this.id = installState.getPackageId();
        this.dependencies = installState.getDependencies().toArray(new Dependency[installState.getDependencies().size()]);
        this.filter = installState.getFilter();
        this.packageProperties = new FsPackageProperties(installState);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[ids.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            }
        }
        return ids.toArray(new PackageId[ids.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[deps.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
                    }
                }
                return deps.toArray(new Dependency[deps.size()]);
            }
        } catch (RepositoryException e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Value\[values.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
                }
            }
            defNode.setProperty(PN_DEPENDENCIES, values.toArray(new Value[values.size()]));
            if (autoSave) {
                defNode.getSession().save();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[ds.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
                    }
                }
                defNode.setProperty(PN_DEPENDENCIES, ds.toArray(new String[ds.size()]));
            }
            defNode.setProperty(PN_DESCRIPTION, props.getDescription());
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[uninstallTasks.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
        }

        for (PackageId id: uninstallTasks.keySet().toArray(new PackageId[uninstallTasks.size()])) {
            resolveUninstall(id, packageTasks, uninstallTasks, new HashSet<>(), uninstallTasks.get(id).getOptions());
        }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[installTasks.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
        packageTasks.addAll(removeTasks.values());

        for (PackageId id: installTasks.keySet().toArray(new PackageId[installTasks.size()])) {
            PackageTask task = installTasks.get(id);
            resolveInstall(id, packageTasks, installTasks, new HashSet<>(), task.getType(), task.getOptions());
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[unresolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            }
        }
        return unresolved.toArray(new Dependency[unresolved.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[processed.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        Set<PackageId> processed = new HashSet<PackageId>();
        extractSubpackages(opts, processed);
        PackageId[] ret = processed.toArray(new PackageId[processed.size()]);
        Arrays.sort(ret);
        mgr.dispatch(PackageEvent.Type.EXTRACT_SUB_PACKAGES, getDefinition().getId(), ret);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[resolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            }
        }
        return resolved.toArray(new PackageId[resolved.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SyncHandler\[newSyncSpecs.size()\]'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
            log.info("Added sync specification: {}", spec);
        }
        syncHandlers = newSyncSpecs.toArray(new SyncHandler[newSyncSpecs.size()]);
        enabled = config.vault_sync_enabled();
        checkDelay = config.vault_sync_fscheckinterval() * 1000;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Dependency\[unresolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
        }

        return new DependencyReportImpl(id, unresolved.toArray(new Dependency[unresolved.size()]),
                resolved.toArray(new PackageId[resolved.size()])
        );
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[resolved.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java

        return new DependencyReportImpl(id, unresolved.toArray(new Dependency[unresolved.size()]),
                resolved.toArray(new PackageId[resolved.size()])
        );
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PackageId\[subpackages.size()\]'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
            Dependency autoDependency = hasOwnContent ? new Dependency(pkg.getId()) : null;
            registerSubPackages(pkg, packagesRoot, DEFAULT_PACKAGE_ROOT_PATH, replace, subpackages, autoDependency);
            dispatch(Type.EXTRACT_SUB_PACKAGES, pkg.getId(), subpackages.keySet().toArray(new PackageId[subpackages.size()]));
        }
        return subpackages;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new WordElement\[lines.size()\]'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
            lines.add(new WordElement(source, word.toString(), gutter.toString()));
        }
        return (WordElement[]) lines.toArray(new WordElement[lines.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[pendingJcrChanges.size()\]'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    public void prepareForSync() {
        // assert locked
        preparedJcrChanges = pendingJcrChanges.toArray(new String[pendingJcrChanges.size()]);
        pendingJcrChanges.clear();
        pendingFsChanges.clear();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LineElementsFactory.IStringElement\[lines.size()\]'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
        }
        if (ignoreWS) {
            return (LineElementsFactory.IStringElement[]) lines.toArray(new LineElementsFactory.IStringElement[lines.size()]);
        } else {
            return (LineElementsFactory.StringElement[]) lines.toArray(new LineElementsFactory.StringElement[lines.size()]);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new LineElementsFactory.StringElement\[lines.size()\]'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
            return (LineElementsFactory.IStringElement[]) lines.toArray(new LineElementsFactory.IStringElement[lines.size()]);
        } else {
            return (LineElementsFactory.StringElement[]) lines.toArray(new LineElementsFactory.StringElement[lines.size()]);
        }
    }
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Document.Element\[elems.size()\]'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                }
            }
            return (Document.Element[]) elems.toArray(new Document.Element[elems.size()]);
        }
    }
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidatorFactory.java`
#### Snippet
```java
     * Reserved prefix for all validator ids integrated in this JAR. No custom validator ids must start with this prefix.
     */
    public static final String ID_PREFIX_JACKRABBIT = "jackrabbit-";
    /**
     * Creates a new validator for the given context.
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidatorFactory.java`
#### Snippet
```java
     * Reserved prefix for all validator ids integrated in this JAR. No custom validator ids must start with this prefix.
     */
    public static final String ID_PREFIX_JACKRABBIT = "jackrabbit-";
    /**
     * Creates a new validator for the given context.
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidatorFactory.java`
#### Snippet
```java
     * Reserved prefix for all validator ids integrated in this JAR. No custom validator ids must start with this prefix.
     */
    public static final String ID_PREFIX_JACKRABBIT = "jackrabbit-";
    /**
     * Creates a new validator for the given context.
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java

    @ObjectClassDefinition(name = "Apache Jackrabbit FileVault RCP Task Manager", description = "Manages tasks for RCP (remote copy)")
    public static @interface ComponentPropertyType {
        @AttributeDefinition(name = "Serialized Tasks", description = "The JSON serialization of all tasks. Credentials are not stored in here, but rather in the bundle context data file.")
        String serialized_tasks_json() default "";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/DependencyResolver.java`
#### Snippet
```java
     * @throws IOException in case some error happened during resolving
     */
    public @NotNull Collection<PackageInfo> resolvePackageInfo(@NotNull Dependency[] dependencies, @NotNull Map<PackageId, URI> dependencyLocations) throws IOException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleFile.java`
#### Snippet
```java
public interface ConsoleFile {

    public static final ConsoleFile[] EMPTY_ARRAY = new ConsoleFile[0];

    Object unwrap();
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleFile.java`
#### Snippet
```java
public interface ConsoleFile {

    public static final ConsoleFile[] EMPTY_ARRAY = new ConsoleFile[0];

    Object unwrap();
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleFile.java`
#### Snippet
```java
public interface ConsoleFile {

    public static final ConsoleFile[] EMPTY_ARRAY = new ConsoleFile[0];

    Object unwrap();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleFileSystem.java`
#### Snippet
```java
    ConsoleFile getRoot();

    public String getSchemePrefix();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleCommand.java`
#### Snippet
```java
public interface ConsoleCommand extends CliCommand {

    public boolean execute(ConsoleExecutionContext ctx, CommandLine cl)
            throws Exception;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ImportInfo.java`
#### Snippet
```java
     * The modification type
     */
    public static enum Type {
        /** created */
        CRE,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ImportInfo.java`
#### Snippet
```java
     * The modification type
     */
    public static enum Type {
        /** created */
        CRE,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ArtifactIterator.java`
#### Snippet
```java
     * @throws NoSuchElementException iteration has no more artifacts.
     */
    public Artifact nextArtifact() throws NoSuchElementException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/AggregateManager.java`
#### Snippet
```java
     * @param listener optional listener
     */
    public void startTracking(ProgressTrackerListener listener);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/AggregateManager.java`
#### Snippet
```java
     * Stops tracking of aggregate lifecycle
     */
    public void stopTracking();


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryFactory.java`
#### Snippet
```java
            throws RepositoryException;
    
    public Repository createRepository(RepositoryAddress address, ConnectionOptions options)
            throws RepositoryException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryFactory.java`
#### Snippet
```java
    public Set<String> getSupportedSchemes();

    public Repository createRepository(RepositoryAddress address)
            throws RepositoryException;
    
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryFactory.java`
#### Snippet
```java
public interface RepositoryFactory {

    public Set<String> getSupportedSchemes();

    public Repository createRepository(RepositoryAddress address)
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/SerializationType.java`
#### Snippet
```java
     * @param contentType the default content type
     */
    private SerializationType(String name, String contentType) {
        this.name = name;
        this.contentType = contentType;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/VaultFsTransaction.java`
#### Snippet
```java
     * the transaction info
     */
    public static class Info {

        private final Type type;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/VaultFsTransaction.java`
#### Snippet
```java
     * the transaction info
     */
    public static class Info {

        private final Type type;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/VaultFsTransaction.java`
#### Snippet
```java
    Collection<Info> commit() throws RepositoryException, IOException;

    public enum Type {
        ADDED, ADDED_X, DELETED, MODIFIED, MOVED, MKDIR, ERROR
    }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Catch all" item filter.
     */
    public static final ItemFilter ALL = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Catch all" item filter.
     */
    public static final ItemFilter ALL = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Catch all" item filter.
     */
    public static final ItemFilter ALL = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs.
     */
    public boolean matches(Item item, int depth) throws RepositoryException;
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Miss all" item filter.
     */
    public static final ItemFilter NONE = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Miss all" item filter.
     */
    public static final ItemFilter NONE = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilter.java`
#### Snippet
```java
     * The "Miss all" item filter.
     */
    public static final ItemFilter NONE = new ItemFilter() {

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Artifact.java`
#### Snippet
```java
     * @return the type of this artifact.
     */
    public ArtifactType getType();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Artifact.java`
#### Snippet
```java
     * @return the serialization type of this artifact.
     */
    public SerializationType getSerializationType();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Artifact.java`
#### Snippet
```java
     * @return the final name
     */
    public String getRelativePath();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Artifact.java`
#### Snippet
```java
     * @return the (repository) extension of this artifact.
     */
    public String getExtension();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Artifact.java`
#### Snippet
```java
     * @return the relative platform path
     */
    public String getPlatformPath();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onWalkEnd(Node root) throws RepositoryException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs
     */
    public void onNodeIgnored(Node node, int depth) throws RepositoryException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onNodeEnd(Node node, boolean included, int depth)
            throws RepositoryException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onChildren(Node node, int depth) throws RepositoryException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onNodeBegin(Node node, boolean included, int depth)
            throws RepositoryException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onWalkBegin(Node root) throws RepositoryException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AggregateWalkListener.java`
#### Snippet
```java
     * @throws RepositoryException if a repository error occurs.
     */
    public void onProperty(Property prop, int depth) throws RepositoryException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:statement
     */
    public static final String JCR_STATEMENT = "jcr:statement";
    /**
     * jcr:successors
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:statement
     */
    public static final String JCR_STATEMENT = "jcr:statement";
    /**
     * jcr:successors
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:statement
     */
    public static final String JCR_STATEMENT = "jcr:statement";
    /**
     * jcr:successors
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mixinTypes
     */
    public static final String JCR_MIXINTYPES = "jcr:mixinTypes";
    /**
     * jcr:multiple
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mixinTypes
     */
    public static final String JCR_MIXINTYPES = "jcr:mixinTypes";
    /**
     * jcr:multiple
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mixinTypes
     */
    public static final String JCR_MIXINTYPES = "jcr:mixinTypes";
    /**
     * jcr:multiple
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:created
     */
    public static final String JCR_CREATED = "jcr:created";
    /**
     * jcr:data
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:created
     */
    public static final String JCR_CREATED = "jcr:created";
    /**
     * jcr:data
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:created
     */
    public static final String JCR_CREATED = "jcr:created";
    /**
     * jcr:data
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:title
     */
    public static final String MIX_TITLE = "mix:title";
    /**
     * mix:created
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:title
     */
    public static final String MIX_TITLE = "mix:title";
    /**
     * mix:created
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:title
     */
    public static final String MIX_TITLE = "mix:title";
    /**
     * mix:created
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:frozenNode
     */
    public static final String NT_FROZENNODE = "nt:frozenNode";
    /**
     * nt:hierarchyNode
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:frozenNode
     */
    public static final String NT_FROZENNODE = "nt:frozenNode";
    /**
     * nt:hierarchyNode
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:frozenNode
     */
    public static final String NT_FROZENNODE = "nt:frozenNode";
    /**
     * nt:hierarchyNode
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:sameNameSiblings
     */
    public static final String JCR_SAMENAMESIBLINGS = "jcr:sameNameSiblings";
    /**
     * jcr:statement
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:sameNameSiblings
     */
    public static final String JCR_SAMENAMESIBLINGS = "jcr:sameNameSiblings";
    /**
     * jcr:statement
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:sameNameSiblings
     */
    public static final String JCR_SAMENAMESIBLINGS = "jcr:sameNameSiblings";
    /**
     * jcr:statement
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryType
     */
    public static final String JCR_PRIMARYTYPE = "jcr:primaryType";
    /**
     * jcr:propertyDefinition
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryType
     */
    public static final String JCR_PRIMARYTYPE = "jcr:primaryType";
    /**
     * jcr:propertyDefinition
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryType
     */
    public static final String JCR_PRIMARYTYPE = "jcr:primaryType";
    /**
     * jcr:propertyDefinition
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultPrimaryType
     */
    public static final String JCR_DEFAULTPRIMARYTYPE = "jcr:defaultPrimaryType";
    /**
     * jcr:defaultValues
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultPrimaryType
     */
    public static final String JCR_DEFAULTPRIMARYTYPE = "jcr:defaultPrimaryType";
    /**
     * jcr:defaultValues
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultPrimaryType
     */
    public static final String JCR_DEFAULTPRIMARYTYPE = "jcr:defaultPrimaryType";
    /**
     * jcr:defaultValues
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionableUuid
     */
    public static final String JCR_VERSIONABLEUUID = "jcr:versionableUuid";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionableUuid
     */
    public static final String JCR_VERSIONABLEUUID = "jcr:versionableUuid";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionableUuid
     */
    public static final String JCR_VERSIONABLEUUID = "jcr:versionableUuid";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionLabels
     */
    public static final String JCR_VERSIONLABELS = "jcr:versionLabels";
    /**
     * jcr:versionStorage
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionLabels
     */
    public static final String JCR_VERSIONLABELS = "jcr:versionLabels";
    /**
     * jcr:versionStorage
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionLabels
     */
    public static final String JCR_VERSIONLABELS = "jcr:versionLabels";
    /**
     * jcr:versionStorage
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:createdBy
     */
    public static final String JCR_CREATED_BY = "jcr:createdBy";
    /**
     * jcr:lastModifiedBy
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:createdBy
     */
    public static final String JCR_CREATED_BY = "jcr:createdBy";
    /**
     * jcr:lastModifiedBy
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:createdBy
     */
    public static final String JCR_CREATED_BY = "jcr:createdBy";
    /**
     * jcr:lastModifiedBy
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionHistory
     */
    public static final String NT_VERSIONHISTORY = "nt:versionHistory";
    /**
     * nt:versionLabels
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionHistory
     */
    public static final String NT_VERSIONHISTORY = "nt:versionHistory";
    /**
     * nt:versionLabels
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionHistory
     */
    public static final String NT_VERSIONHISTORY = "nt:versionHistory";
    /**
     * nt:versionLabels
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isCheckedOut
     */
    public static final String JCR_ISCHECKEDOUT = "jcr:isCheckedOut";
    /**
     * jcr:isMixin
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isCheckedOut
     */
    public static final String JCR_ISCHECKEDOUT = "jcr:isCheckedOut";
    /**
     * jcr:isMixin
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isCheckedOut
     */
    public static final String JCR_ISCHECKEDOUT = "jcr:isCheckedOut";
    /**
     * jcr:isMixin
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lastModified
     */
    public static final String MIX_LAST_MODIFIED = "mix:lastModified";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lastModified
     */
    public static final String MIX_LAST_MODIFIED = "mix:lastModified";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lastModified
     */
    public static final String MIX_LAST_MODIFIED = "mix:lastModified";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mimeType
     */
    public static final String JCR_MIMETYPE = "jcr:mimeType";
    /**
     * jcr:mixinTypes
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mimeType
     */
    public static final String JCR_MIMETYPE = "jcr:mimeType";
    /**
     * jcr:mixinTypes
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mimeType
     */
    public static final String JCR_MIMETYPE = "jcr:mimeType";
    /**
     * jcr:mixinTypes
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionedChild
     */
    public static final String NT_VERSIONEDCHILD = "nt:versionedChild";

    // future JSR283 item and node type names
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionedChild
     */
    public static final String NT_VERSIONEDCHILD = "nt:versionedChild";

    // future JSR283 item and node type names
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionedChild
     */
    public static final String NT_VERSIONEDCHILD = "nt:versionedChild";

    // future JSR283 item and node type names
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:autoCreated
     */
    public static final String JCR_AUTOCREATED = "jcr:autoCreated";
    /**
     * jcr:baseVersion
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:autoCreated
     */
    public static final String JCR_AUTOCREATED = "jcr:autoCreated";
    /**
     * jcr:baseVersion
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:autoCreated
     */
    public static final String JCR_AUTOCREATED = "jcr:autoCreated";
    /**
     * jcr:baseVersion
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:successors
     */
    public static final String JCR_SUCCESSORS = "jcr:successors";
    /**
     * jcr:supertypes
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:successors
     */
    public static final String JCR_SUCCESSORS = "jcr:successors";
    /**
     * jcr:supertypes
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:successors
     */
    public static final String JCR_SUCCESSORS = "jcr:successors";
    /**
     * jcr:supertypes
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModifiedBy
     */
    public static final String JCR_LAST_MODIFIED_BY = "jcr:lastModifiedBy";
    /**
     * mix:title
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModifiedBy
     */
    public static final String JCR_LAST_MODIFIED_BY = "jcr:lastModifiedBy";
    /**
     * mix:title
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModifiedBy
     */
    public static final String JCR_LAST_MODIFIED_BY = "jcr:lastModifiedBy";
    /**
     * mix:title
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:query
     */
    public static final String NT_QUERY = "nt:query";
    /**
     * nt:resource
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:query
     */
    public static final String NT_QUERY = "nt:query";
    /**
     * nt:resource
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:query
     */
    public static final String NT_QUERY = "nt:query";
    /**
     * nt:resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredPrimaryTypes
     */
    public static final String JCR_REQUIREDPRIMARYTYPES = "jcr:requiredPrimaryTypes";
    /**
     * jcr:requiredType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredPrimaryTypes
     */
    public static final String JCR_REQUIREDPRIMARYTYPES = "jcr:requiredPrimaryTypes";
    /**
     * jcr:requiredType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredPrimaryTypes
     */
    public static final String JCR_REQUIREDPRIMARYTYPES = "jcr:requiredPrimaryTypes";
    /**
     * jcr:requiredType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:childNodeDefinition
     */
    public static final String JCR_CHILDNODEDEFINITION = "jcr:childNodeDefinition";
    /**
     * jcr:content
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:childNodeDefinition
     */
    public static final String JCR_CHILDNODEDEFINITION = "jcr:childNodeDefinition";
    /**
     * jcr:content
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:childNodeDefinition
     */
    public static final String JCR_CHILDNODEDEFINITION = "jcr:childNodeDefinition";
    /**
     * jcr:content
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:version
     */
    public static final String NT_VERSION = "nt:version";
    /**
     * nt:versionHistory
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:version
     */
    public static final String NT_VERSION = "nt:version";
    /**
     * nt:versionHistory
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:version
     */
    public static final String NT_VERSION = "nt:version";
    /**
     * nt:versionHistory
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenNode
     */
    public static final String JCR_FROZENNODE = "jcr:frozenNode";
    /**
     * jcr:frozenPrimaryType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenNode
     */
    public static final String JCR_FROZENNODE = "jcr:frozenNode";
    /**
     * jcr:frozenPrimaryType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenNode
     */
    public static final String JCR_FROZENNODE = "jcr:frozenNode";
    /**
     * jcr:frozenPrimaryType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockIsDeep
     */
    public static final String JCR_LOCKISDEEP = "jcr:lockIsDeep";
    /**
     * jcr:lockOwner
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockIsDeep
     */
    public static final String JCR_LOCKISDEEP = "jcr:lockIsDeep";
    /**
     * jcr:lockOwner
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockIsDeep
     */
    public static final String JCR_LOCKISDEEP = "jcr:lockIsDeep";
    /**
     * jcr:lockOwner
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModified
     */
    public static final String JCR_LASTMODIFIED = "jcr:lastModified";
    /**
     * jcr:lockIsDeep
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModified
     */
    public static final String JCR_LASTMODIFIED = "jcr:lastModified";
    /**
     * jcr:lockIsDeep
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lastModified
     */
    public static final String JCR_LASTMODIFIED = "jcr:lastModified";
    /**
     * jcr:lockIsDeep
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:hasOrderableChildNodes
     */
    public static final String JCR_HASORDERABLECHILDNODES = "jcr:hasOrderableChildNodes";
    /**
     * jcr:isCheckedOut
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:hasOrderableChildNodes
     */
    public static final String JCR_HASORDERABLECHILDNODES = "jcr:hasOrderableChildNodes";
    /**
     * jcr:isCheckedOut
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:hasOrderableChildNodes
     */
    public static final String JCR_HASORDERABLECHILDNODES = "jcr:hasOrderableChildNodes";
    /**
     * jcr:isCheckedOut
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:child
     */
    public static final String JCR_CHILD = "jcr:child";
    /**
     * jcr:childNodeDefinition
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:child
     */
    public static final String JCR_CHILD = "jcr:child";
    /**
     * jcr:childNodeDefinition
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:child
     */
    public static final String JCR_CHILD = "jcr:child";
    /**
     * jcr:childNodeDefinition
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:system
     */
    public static final String JCR_SYSTEM = "jcr:system";
    /**
     * jcr:uuid
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:system
     */
    public static final String JCR_SYSTEM = "jcr:system";
    /**
     * jcr:uuid
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:system
     */
    public static final String JCR_SYSTEM = "jcr:system";
    /**
     * jcr:uuid
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:path used with query results
     */
    public static final String JCR_PATH = "jcr:path";
    /**
     * Pseudo property jcr:score used with query results
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:path used with query results
     */
    public static final String JCR_PATH = "jcr:path";
    /**
     * Pseudo property jcr:score used with query results
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:path used with query results
     */
    public static final String JCR_PATH = "jcr:path";
    /**
     * Pseudo property jcr:score used with query results
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockOwner
     */
    public static final String JCR_LOCKOWNER = "jcr:lockOwner";
    /**
     * jcr:mandatory
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockOwner
     */
    public static final String JCR_LOCKOWNER = "jcr:lockOwner";
    /**
     * jcr:mandatory
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:lockOwner
     */
    public static final String JCR_LOCKOWNER = "jcr:lockOwner";
    /**
     * jcr:mandatory
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:versionable
     */
    public static final String MIX_VERSIONABLE = "mix:versionable";
    /**
     * nt:base
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:versionable
     */
    public static final String MIX_VERSIONABLE = "mix:versionable";
    /**
     * nt:base
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:versionable
     */
    public static final String MIX_VERSIONABLE = "mix:versionable";
    /**
     * nt:base
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:created
     */
    public static final String MIX_CREATED = "mix:created";
    /**
     * mix:lastModified
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:created
     */
    public static final String MIX_CREATED = "mix:created";
    /**
     * mix:lastModified
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:created
     */
    public static final String MIX_CREATED = "mix:created";
    /**
     * mix:lastModified
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:referenceable
     */
    public static final String MIX_REFERENCEABLE = "mix:referenceable";
    /**
     * mix:versionable
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:referenceable
     */
    public static final String MIX_REFERENCEABLE = "mix:referenceable";
    /**
     * mix:versionable
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:referenceable
     */
    public static final String MIX_REFERENCEABLE = "mix:referenceable";
    /**
     * mix:versionable
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenPrimaryType
     */
    public static final String JCR_FROZENPRIMARYTYPE = "jcr:frozenPrimaryType";
    /**
     * jcr:frozenUuid
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenPrimaryType
     */
    public static final String JCR_FROZENPRIMARYTYPE = "jcr:frozenPrimaryType";
    /**
     * jcr:frozenUuid
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenPrimaryType
     */
    public static final String JCR_FROZENPRIMARYTYPE = "jcr:frozenPrimaryType";
    /**
     * jcr:frozenUuid
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:content
     */
    public static final String JCR_CONTENT = "jcr:content";
    /**
     * jcr:created
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:content
     */
    public static final String JCR_CONTENT = "jcr:content";
    /**
     * jcr:created
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:content
     */
    public static final String JCR_CONTENT = "jcr:content";
    /**
     * jcr:created
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:file
     */
    public static final String NT_FILE = "nt:file";
    /**
     * nt:folder
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:file
     */
    public static final String NT_FILE = "nt:file";
    /**
     * nt:folder
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:file
     */
    public static final String NT_FILE = "nt:file";
    /**
     * nt:folder
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:onParentVersion
     */
    public static final String JCR_ONPARENTVERSION = "jcr:onParentVersion";
    /**
     * jcr:predecessors
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:onParentVersion
     */
    public static final String JCR_ONPARENTVERSION = "jcr:onParentVersion";
    /**
     * jcr:predecessors
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:onParentVersion
     */
    public static final String JCR_ONPARENTVERSION = "jcr:onParentVersion";
    /**
     * jcr:predecessors
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:nodeType
     */
    public static final String NT_NODETYPE = "nt:nodeType";
    /**
     * nt:propertyDefinition
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:nodeType
     */
    public static final String NT_NODETYPE = "nt:nodeType";
    /**
     * nt:propertyDefinition
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:nodeType
     */
    public static final String NT_NODETYPE = "nt:nodeType";
    /**
     * nt:propertyDefinition
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mandatory
     */
    public static final String JCR_MANDATORY = "jcr:mandatory";
    /**
     * jcr:mergeFailed
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mandatory
     */
    public static final String JCR_MANDATORY = "jcr:mandatory";
    /**
     * jcr:mergeFailed
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mandatory
     */
    public static final String JCR_MANDATORY = "jcr:mandatory";
    /**
     * jcr:mergeFailed
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:predecessors
     */
    public static final String JCR_PREDECESSORS = "jcr:predecessors";
    /**
     * jcr:primaryItemName
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:predecessors
     */
    public static final String JCR_PREDECESSORS = "jcr:predecessors";
    /**
     * jcr:primaryItemName
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:predecessors
     */
    public static final String JCR_PREDECESSORS = "jcr:predecessors";
    /**
     * jcr:primaryItemName
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultValues
     */
    public static final String JCR_DEFAULTVALUES = "jcr:defaultValues";
    /**
     * jcr:encoding
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultValues
     */
    public static final String JCR_DEFAULTVALUES = "jcr:defaultValues";
    /**
     * jcr:encoding
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:defaultValues
     */
    public static final String JCR_DEFAULTVALUES = "jcr:defaultValues";
    /**
     * jcr:encoding
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:childNodeDefinition
     */
    public static final String NT_CHILDNODEDEFINITION = "nt:childNodeDefinition";
    /**
     * nt:file
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:childNodeDefinition
     */
    public static final String NT_CHILDNODEDEFINITION = "nt:childNodeDefinition";
    /**
     * nt:file
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:childNodeDefinition
     */
    public static final String NT_CHILDNODEDEFINITION = "nt:childNodeDefinition";
    /**
     * nt:file
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:supertypes
     */
    public static final String JCR_SUPERTYPES = "jcr:supertypes";
    /**
     * jcr:system
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:supertypes
     */
    public static final String JCR_SUPERTYPES = "jcr:supertypes";
    /**
     * jcr:system
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:supertypes
     */
    public static final String JCR_SUPERTYPES = "jcr:supertypes";
    /**
     * jcr:system
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:rootVersion
     */
    public static final String JCR_ROOTVERSION = "jcr:rootVersion";
    /**
     * jcr:sameNameSiblings
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:rootVersion
     */
    public static final String JCR_ROOTVERSION = "jcr:rootVersion";
    /**
     * jcr:sameNameSiblings
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:rootVersion
     */
    public static final String JCR_ROOTVERSION = "jcr:rootVersion";
    /**
     * jcr:sameNameSiblings
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryItemName
     */
    public static final String JCR_PRIMARYITEMNAME = "jcr:primaryItemName";
    /**
     * jcr:primaryType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryItemName
     */
    public static final String JCR_PRIMARYITEMNAME = "jcr:primaryItemName";
    /**
     * jcr:primaryType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:primaryItemName
     */
    public static final String JCR_PRIMARYITEMNAME = "jcr:primaryItemName";
    /**
     * jcr:primaryType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:propertyDefinition
     */
    public static final String JCR_PROPERTYDEFINITION = "jcr:propertyDefinition";
    /**
     * jcr:protected
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:propertyDefinition
     */
    public static final String JCR_PROPERTYDEFINITION = "jcr:propertyDefinition";
    /**
     * jcr:protected
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:propertyDefinition
     */
    public static final String JCR_PROPERTYDEFINITION = "jcr:propertyDefinition";
    /**
     * jcr:protected
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:encoding
     */
    public static final String JCR_ENCODING = "jcr:encoding";
    /**
     * jcr:frozenMixinTypes
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:encoding
     */
    public static final String JCR_ENCODING = "jcr:encoding";
    /**
     * jcr:frozenMixinTypes
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:encoding
     */
    public static final String JCR_ENCODING = "jcr:encoding";
    /**
     * jcr:frozenMixinTypes
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:title
     */
    public static final String JCR_TITLE = "jcr:title";
    /**
     * jcr:description
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:title
     */
    public static final String JCR_TITLE = "jcr:title";
    /**
     * jcr:description
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:title
     */
    public static final String JCR_TITLE = "jcr:title";
    /**
     * jcr:description
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:valueConstraints
     */
    public static final String JCR_VALUECONSTRAINTS = "jcr:valueConstraints";
    /**
     * jcr:versionHistory
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:valueConstraints
     */
    public static final String JCR_VALUECONSTRAINTS = "jcr:valueConstraints";
    /**
     * jcr:versionHistory
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:valueConstraints
     */
    public static final String JCR_VALUECONSTRAINTS = "jcr:valueConstraints";
    /**
     * jcr:versionHistory
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:protected
     */
    public static final String JCR_PROTECTED = "jcr:protected";
    /**
     * jcr:requiredPrimaryTypes
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:protected
     */
    public static final String JCR_PROTECTED = "jcr:protected";
    /**
     * jcr:requiredPrimaryTypes
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:protected
     */
    public static final String JCR_PROTECTED = "jcr:protected";
    /**
     * jcr:requiredPrimaryTypes
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:propertyDefinition
     */
    public static final String NT_PROPERTYDEFINITION = "nt:propertyDefinition";
    /**
     * nt:query
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:propertyDefinition
     */
    public static final String NT_PROPERTYDEFINITION = "nt:propertyDefinition";
    /**
     * nt:query
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:propertyDefinition
     */
    public static final String NT_PROPERTYDEFINITION = "nt:propertyDefinition";
    /**
     * nt:query
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenUuid
     */
    public static final String JCR_FROZENUUID = "jcr:frozenUuid";
    /**
     * jcr:hasOrderableChildNodes
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenUuid
     */
    public static final String JCR_FROZENUUID = "jcr:frozenUuid";
    /**
     * jcr:hasOrderableChildNodes
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenUuid
     */
    public static final String JCR_FROZENUUID = "jcr:frozenUuid";
    /**
     * jcr:hasOrderableChildNodes
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:name
     */
    public static final String JCR_NAME = "jcr:name";
    /**
     * jcr:nodeTypeName
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:name
     */
    public static final String JCR_NAME = "jcr:name";
    /**
     * jcr:nodeTypeName
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:name
     */
    public static final String JCR_NAME = "jcr:name";
    /**
     * jcr:nodeTypeName
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mergeFailed
     */
    public static final String JCR_MERGEFAILED = "jcr:mergeFailed";
    /**
     * jcr:mimeType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mergeFailed
     */
    public static final String JCR_MERGEFAILED = "jcr:mergeFailed";
    /**
     * jcr:mimeType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:mergeFailed
     */
    public static final String JCR_MERGEFAILED = "jcr:mergeFailed";
    /**
     * jcr:mimeType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:score used with query results
     */
    public static final String JCR_SCORE = "jcr:score";

    /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:score used with query results
     */
    public static final String JCR_SCORE = "jcr:score";

    /**
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * Pseudo property jcr:score used with query results
     */
    public static final String JCR_SCORE = "jcr:score";

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:data
     */
    public static final String JCR_DATA = "jcr:data";
    /**
     * jcr:defaultPrimaryType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:data
     */
    public static final String JCR_DATA = "jcr:data";
    /**
     * jcr:defaultPrimaryType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:data
     */
    public static final String JCR_DATA = "jcr:data";
    /**
     * jcr:defaultPrimaryType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:uuid
     */
    public static final String JCR_UUID = "jcr:uuid";
    /**
     * jcr:valueConstraints
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:uuid
     */
    public static final String JCR_UUID = "jcr:uuid";
    /**
     * jcr:valueConstraints
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:uuid
     */
    public static final String JCR_UUID = "jcr:uuid";
    /**
     * jcr:valueConstraints
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:nodeTypeName
     */
    public static final String JCR_NODETYPENAME = "jcr:nodeTypeName";
    /**
     * jcr:onParentVersion
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:nodeTypeName
     */
    public static final String JCR_NODETYPENAME = "jcr:nodeTypeName";
    /**
     * jcr:onParentVersion
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:nodeTypeName
     */
    public static final String JCR_NODETYPENAME = "jcr:nodeTypeName";
    /**
     * jcr:onParentVersion
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:language
     */
    public static final String JCR_LANGUAGE = "jcr:language";
    /**
     * jcr:lastModified
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:language
     */
    public static final String JCR_LANGUAGE = "jcr:language";
    /**
     * jcr:lastModified
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:language
     */
    public static final String JCR_LANGUAGE = "jcr:language";
    /**
     * jcr:lastModified
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lockable
     */
    public static final String MIX_LOCKABLE = "mix:lockable";
    /**
     * mix:referenceable
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lockable
     */
    public static final String MIX_LOCKABLE = "mix:lockable";
    /**
     * mix:referenceable
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * mix:lockable
     */
    public static final String MIX_LOCKABLE = "mix:lockable";
    /**
     * mix:referenceable
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionStorage
     */
    public static final String JCR_VERSIONSTORAGE = "jcr:versionStorage";
    /**
     * jcr:versionableUuid
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionStorage
     */
    public static final String JCR_VERSIONSTORAGE = "jcr:versionStorage";
    /**
     * jcr:versionableUuid
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionStorage
     */
    public static final String JCR_VERSIONSTORAGE = "jcr:versionStorage";
    /**
     * jcr:versionableUuid
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:resource
     */
    public static final String NT_RESOURCE = "nt:resource";
    /**
     * nt:unstructured
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:resource
     */
    public static final String NT_RESOURCE = "nt:resource";
    /**
     * nt:unstructured
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:resource
     */
    public static final String NT_RESOURCE = "nt:resource";
    /**
     * nt:unstructured
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isMixin
     */
    public static final String JCR_ISMIXIN = "jcr:isMixin";
    /**
     * jcr:language
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isMixin
     */
    public static final String JCR_ISMIXIN = "jcr:isMixin";
    /**
     * jcr:language
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:isMixin
     */
    public static final String JCR_ISMIXIN = "jcr:isMixin";
    /**
     * jcr:language
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:description
     */
    public static final String JCR_DESCRIPTION = "jcr:description";
    /**
     * jcr:createdBy
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:description
     */
    public static final String JCR_DESCRIPTION = "jcr:description";
    /**
     * jcr:createdBy
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:description
     */
    public static final String JCR_DESCRIPTION = "jcr:description";
    /**
     * jcr:createdBy
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:multiple
     */
    public static final String JCR_MULTIPLE = "jcr:multiple";
    /**
     * jcr:name
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:multiple
     */
    public static final String JCR_MULTIPLE = "jcr:multiple";
    /**
     * jcr:name
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:multiple
     */
    public static final String JCR_MULTIPLE = "jcr:multiple";
    /**
     * jcr:name
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:hierarchyNode
     */
    public static final String NT_HIERARCHYNODE = "nt:hierarchyNode";
    /**
     * nt:linkedFile
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:hierarchyNode
     */
    public static final String NT_HIERARCHYNODE = "nt:hierarchyNode";
    /**
     * nt:linkedFile
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:hierarchyNode
     */
    public static final String NT_HIERARCHYNODE = "nt:hierarchyNode";
    /**
     * nt:linkedFile
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionLabels
     */
    public static final String NT_VERSIONLABELS = "nt:versionLabels";
    /**
     * nt:versionedChild
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionLabels
     */
    public static final String NT_VERSIONLABELS = "nt:versionLabels";
    /**
     * nt:versionedChild
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:versionLabels
     */
    public static final String NT_VERSIONLABELS = "nt:versionLabels";
    /**
     * nt:versionedChild
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:folder
     */
    public static final String NT_FOLDER = "nt:folder";
    /**
     * nt:frozenNode
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:folder
     */
    public static final String NT_FOLDER = "nt:folder";
    /**
     * nt:frozenNode
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:folder
     */
    public static final String NT_FOLDER = "nt:folder";
    /**
     * nt:frozenNode
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:linkedFile
     */
    public static final String NT_LINKEDFILE = "nt:linkedFile";
    /**
     * nt:nodeType
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:linkedFile
     */
    public static final String NT_LINKEDFILE = "nt:linkedFile";
    /**
     * nt:nodeType
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:linkedFile
     */
    public static final String NT_LINKEDFILE = "nt:linkedFile";
    /**
     * nt:nodeType
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:base
     */
    public static final String NT_BASE = "nt:base";
    /**
     * nt:childNodeDefinition
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:base
     */
    public static final String NT_BASE = "nt:base";
    /**
     * nt:childNodeDefinition
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:base
     */
    public static final String NT_BASE = "nt:base";
    /**
     * nt:childNodeDefinition
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionHistory
     */
    public static final String JCR_VERSIONHISTORY = "jcr:versionHistory";
    /**
     * jcr:versionLabels
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionHistory
     */
    public static final String JCR_VERSIONHISTORY = "jcr:versionHistory";
    /**
     * jcr:versionLabels
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:versionHistory
     */
    public static final String JCR_VERSIONHISTORY = "jcr:versionHistory";
    /**
     * jcr:versionLabels
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenMixinTypes
     */
    public static final String JCR_FROZENMIXINTYPES = "jcr:frozenMixinTypes";
    /**
     * jcr:frozenNode
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenMixinTypes
     */
    public static final String JCR_FROZENMIXINTYPES = "jcr:frozenMixinTypes";
    /**
     * jcr:frozenNode
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:frozenMixinTypes
     */
    public static final String JCR_FROZENMIXINTYPES = "jcr:frozenMixinTypes";
    /**
     * jcr:frozenNode
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredType
     */
    public static final String JCR_REQUIREDTYPE = "jcr:requiredType";
    /**
     * jcr:rootVersion
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredType
     */
    public static final String JCR_REQUIREDTYPE = "jcr:requiredType";
    /**
     * jcr:rootVersion
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:requiredType
     */
    public static final String JCR_REQUIREDTYPE = "jcr:requiredType";
    /**
     * jcr:rootVersion
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:unstructured
     */
    public static final String NT_UNSTRUCTURED = "nt:unstructured";
    /**
     * nt:version
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:unstructured
     */
    public static final String NT_UNSTRUCTURED = "nt:unstructured";
    /**
     * nt:version
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * nt:unstructured
     */
    public static final String NT_UNSTRUCTURED = "nt:unstructured";
    /**
     * nt:version
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:baseVersion
     */
    public static final String JCR_BASEVERSION = "jcr:baseVersion";
    /**
     * jcr:child
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:baseVersion
     */
    public static final String JCR_BASEVERSION = "jcr:baseVersion";
    /**
     * jcr:child
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/JcrConstants.java`
#### Snippet
```java
     * jcr:baseVersion
     */
    public static final String JCR_BASEVERSION = "jcr:baseVersion";
    /**
     * jcr:child
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileAction.java`
#### Snippet
```java
    public final String letter;

    private FileAction(String shortName) {
        this.letter = shortName;
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/VltEntry.java`
#### Snippet
```java
        public final String letter;

        private State(String shortName) {
            this.letter = shortName;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/VltEntry.java`
#### Snippet
```java
     * Describes the state of an entry
     */
    public enum State {

        CLEAN(" "),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/VltEntryInfo.java`
#### Snippet
```java
public interface VltEntryInfo {

    public enum Type {
        BASE,
        WORK,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Action.java`
#### Snippet
```java
     * @throws VltException if an error occurs
     */
    public void run(VltDirectory dir, VltFile file, VaultFile remoteFile)
            throws VltException;

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Action.java`
#### Snippet
```java
     * @throws VltException if an error occurs
     */
    public void run(VltContext ctx) throws VltException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Action.java`
#### Snippet
```java
     * @return {@code true} if proceed; {@code false} to abort
     */
    public boolean run(VltDirectory dir, VaultFile remoteDir) throws VltException;
}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
        public final String letter;

        private State(String letter) {
            this.letter = letter;
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/ElementsFactory.java`
#### Snippet
```java
     * @return an array of elements
     */
    public Document.Element[] getElements();
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Document.java`
#### Snippet
```java
     * Elements form a document.
     */
    public static interface Element {

        /**
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Document.java`
#### Snippet
```java
     * to create an annotated document. 
     */
    public static interface AnnotatedElement extends Element {

        /**
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
            if (type.equals("jar")) {
                localPath += "-" + FMT.format(Instant.now()) + ".jar";
            } else {

            }
```

### EmptyStatementBody
`while` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/CompressionUtil.java`
#### Snippet
```java
                for (int i = 0; i < 2; i++) {
                    zipIn.getNextEntry();
                    while (zipIn.read(nullBytes) >= 0) {
                    }
                }
```

### EmptyStatementBody
`while` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
                    // ensure that input stream is pumping in case it didn't read to the end
                    byte[] buffer = new byte[8192];
                    while (in.read(buffer) >= 0);
                } catch (Exception e) {
                    error = e;
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
    public void print() {
        Iterator iter = rows.iterator();
        while (iter.hasNext()) {
            Row r = (Row) iter.next();
            StringBuffer buf = new StringBuffer();
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdEnv.java`
#### Snippet
```java
        Table t = new Table(2);
        Iterator iter = ctx.getPropertyKeys().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            t.addRow(key, ctx.getProperty(key));
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
    protected CliCommand getCommand(String name) {
        Iterator iter = commands.iterator();
        while (iter.hasNext()) {
            CliCommand c = (CliCommand) iter.next();
            if (c.hasName(name)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
                        .withMaximum(1);
                Iterator iter = commands.iterator();
                while (iter.hasNext()) {
                    CliCommand c = (CliCommand) iter.next();
                    gbuilder.withOption(c.getCommand());
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
    public boolean execute(CommandLine cl) {
        Iterator iter = commands.iterator();
        while (iter.hasNext()) {
            CliCommand c = (CliCommand) iter.next();
            try {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdSet.java`
#### Snippet
```java
            Table t = new Table(2);
            Iterator iter = ctx.getPropertyKeys().iterator();
            while (iter.hasNext()) {
                key = (String) iter.next();
                t.addRow(key, ctx.getProperty(key));
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
        }
        Iterator iter = globalEnv.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            if (!props.containsKey(key)) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
                // eg: vlt checkout --help
                Iterator iter = cl.getOptions().iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();                    
                    if (o instanceof Command) {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `p`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java

        for (Artifact a: n.getAggregate().getArtifacts().values()) {
            String p[] = Text.explode(a.getPlatformPath(), '/');
            VaultFileImpl entry = parent;
            for (String cName: p) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `p`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
                    node.getFiles().add(this);
                } else {
                    String p[] = Text.explode(a.getPlatformPath(), '/');
                    VaultFileImpl entry = null;
                    for (String cName: p) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `ch`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
     */
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        // can be ignored in docview
    }
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    }

    public int read(byte b[], int off, int len) throws IOException {
        if (isEof) {
            if (spool == null) {
```

### CStyleArrayDeclaration
C-style array declaration of local variable `nameParts`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/NormalizingSaxFilter.java`
#### Snippet
```java
            String prefix = XMLConstants.DEFAULT_NS_PREFIX;
            final String localPart;
            String nameParts[] = qName.split(":", 2);
            if (nameParts.length > 1) {
                prefix = nameParts[0];
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImport.java`
#### Snippet
```java
        String jcrPath = (String) cl.getValue(argJcrPath);
        boolean verbose = cl.hasOption(OPT_VERBOSE);
        /*
        List excludeList = cl.getValues(optExclude);
        String[] excludes = Constants.EMPTY_STRING_ARRAY;
```

### CommentedOutCode
Commented out code (8 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
            throw new ExecutionException(e);
        }
        /*
        if ((flags & LS_FLAG_DEF) > 0) {
            StringBuffer buf = new StringBuffer();
```

### CommentedOutCode
Commented out code (17 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
            r.addCol("");
        }
        /*
        if ((flags & LS_FLAG_VALUES) > 0) {
            if (def.isMultiple()) {
```

### CommentedOutCode
Commented out code (5 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java

        boolean verbose = cl.hasOption(OPT_VERBOSE);
        /*
        List excludeList = cl.getValues(optExclude);
        String[] excludes = Constants.EMPTY_STRING_ARRAY;
```

### CommentedOutCode
Commented out code (21 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java

    public GroupBuilder addApplicationOptions(GroupBuilder gbuilder) {
        /*
        optURI = new DefaultOptionBuilder()
                .withLongName("uri")
```

### CommentedOutCode
Commented out code (10 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                .withDescription("if present the credentials-to-host list is updated in the ~/.vault/auth.xml")
                .create();
        /*
        optMountpoint = new DefaultOptionBuilder()
                .withLongName("mountpoint")
```

### CommentedOutCode
Commented out code (2 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
            gbuilder.withOption(x.getOption());
        }
        //gbuilder.withOption(optURI);
        //gbuilder.withOption(optWorkspace);
        gbuilder.withOption(optCreds);
```

### CommentedOutCode
Commented out code (2 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
    private VaultFileSystem fs;

    //private Option optURI;
    //private Option optWorkspace;
    private Option optCreds;
```

### CommentedOutCode
Commented out code (9 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
    public void prepare(CommandLine cl) throws ExecutionException {
        super.prepare(cl);
        /*
        if (cl.getValue(optURI) != null) {
            setProperty(KEY_DEFAULT_RMIURI, (String) cl.getValue(optURI));
```

### CommentedOutCode
Commented out code (6 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
    protected void initJLine() {
        History history = new History();
        /*
        try {
            history = new History(new File(".consolehistory"));
```

### CommentedOutCode
Commented out code (5 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java

    public void prepare(CommandLine cl) throws ExecutionException {
        /*
        try {
            loadConfig((String) cl.getValue(optPropertyFile));
```

### CommentedOutCode
Commented out code (9 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
    public void saveConfig(String path) throws IOException {
        File file = new File(path == null ? DEFAULT_CONF_FILENAME : path);
        /*
        Properties props = new Properties();
        Iterator iter = globalEnv.keySet().iterator();
```

### CommentedOutCode
Commented out code (20 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
        final DefaultOptionBuilder obuilder = new DefaultOptionBuilder();
        final ArgumentBuilder abuilder = new ArgumentBuilder();
        /*
        optPropertyFile =
                obuilder
```

### CommentedOutCode
Commented out code (3 lines)
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
                .withOption(optHelp)
                .withMinimum(0);
        /*
        if (getConsole() != null) {
            gbuilder.withOption(optInteractive);
```

### CommentedOutCode
Commented out code (3 lines)
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileOutputImpl.java`
#### Snippet
```java
    }

    /*
    public void setArtfiactType(ArtifactType artfiactType) {
        this.artfiactType = artfiactType;
```

### CommentedOutCode
Commented out code (2 lines)
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
                }
            }
            //node.invalidate();
            //init(node, artifact);
        }
```

### CommentedOutCode
Commented out code (2 lines)
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileNode.java`
#### Snippet
```java
        ctx.println(isLast, "VaultFileNode");
        ctx.indent(isLast);
        //ctx.printf(false, "# pending: %d", pendingChildNodes == null ? -1 : pendingChildNodes.size());
        //ctx.printf(false, "# children: %d", children == null ? -1 : children.size());
        if (aggregate != null) {
```

### CommentedOutCode
Commented out code (12 lines)
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntries.java`
#### Snippet
```java
    }

    /*
    public void save(File file) throws VltException {
        if (file.exists() && !isDirty()) {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
    private static final String OPTION_IMMUTABLE_ROOT_NODE_NAMES = "immutableRootNodeNames";

    static final Pattern DEFAULT_JCR_INSTALLER_NODE_PATH_REGEX = Pattern.compile("/([^/]*/){0,4}?(install|config)[\\./].*");

    static final Pattern DEFAULT_JCR_INSTALLER_ADDITIONAL_FILE_NODE_PATH_REGEX = Pattern.compile(".*\\.(config|cfg|cfg\\.json|jar)");
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `memberships.keySet()` may be replaced with 'entrySet()' iteration
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            track("Applying merged group memberships...", "");
        }
        for (String id: memberships.keySet()) {
            String[] members = memberships.get(id);
            String authPath = userManagement.getAuthorizablePath(session, id);
```

### KeySetIterationMayUseEntrySet
Iteration over `binaries.keySet()` may be replaced with 'entrySet()' iteration
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java

        // process binaries
        for (String parentPath : binaries.keySet()) {
            Map<String, BlobInfo> blobs = binaries.get(parentPath);
            // check for node
```

### KeySetIterationMayUseEntrySet
Iteration over `blobs.keySet()` may be replaced with 'entrySet()' iteration
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
            if (session.nodeExists(parentPath)) {
                Node node = session.getNode(parentPath);
                for (String propName : blobs.keySet()) {
                    BlobInfo info = blobs.get(propName);
                    if (node.hasNode(propName)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `blobs.keySet()` may be replaced with 'entrySet()' iteration
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                // assume below 'this' root.
                Node node = null;
                for (String propName : blobs.keySet()) {
                    BlobInfo info = blobs.get(propName);
                    if (info.isFile()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `fileSystems.keySet()` may be replaced with 'values()' iteration
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java

    public void close() {
        for (RepositoryAddress addr: fileSystems.keySet()) {
            VaultFileSystem fs = fileSystems.get(addr);
            try {
```

### KeySetIterationMayUseEntrySet
Iteration over `props.keySet()` may be replaced with 'entrySet()' iteration
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/PropList.java`
#### Snippet
```java
            dir.getContext().printMessage("  (empty properties)");
        } else {
            for (Object name: props.keySet()) {
                String value = (String) props.get(name);
                dir.getContext().printMessage("  " + name + "=" + value);
```

### KeySetIterationMayUseEntrySet
Iteration over `pendingFsChanges.keySet()` may be replaced with 'entrySet()' iteration
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java

    private void syncToJcr(Session session, SyncResult res) throws RepositoryException, IOException {
        for (String filePath: pendingFsChanges.keySet()) {
            if (res.getByFsPath(filePath) != null) {
                log.debug("ignoring change triggered by previous JCR->FS update. {}", filePath);
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
     * root path of this definition
     */
    @NotNull
    private String root;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
     * root patten to check for inclusion
     */
    @NotNull
    private String rootPattern;

```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `ExecutionPlanBuilderImpl` on 'this' is unnecessary in this context
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    public ExecutionPlanBuilder with(Set<PackageId> externalPackages) {
        this.externalPackages = new HashSet<>(externalPackages);
        return ExecutionPlanBuilderImpl.this;
    }

```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
    }

    private static final Element getFirstElementByTagName(String name, Element element) {
        NodeList nodeList = element.getElementsByTagName(name);
        if (nodeList.getLength() == 0) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
        this.dst = dst;
        this.srcCreds = srcCreds;
        this.id = id == null || id.length() == 0
                ? UUID.randomUUID().toString()
                : id;
```

### SizeReplaceableByIsEmpty
`rcpTask.getExcludes().size() > 0` can be replaced with '!rcpTask.getExcludes().isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
        w.key(RcpServlet.PARAM_RESUME_FROM).value(rcpTask.getRcp().getResumeFrom());
        if (rcpTask.getExcludes() != null) {
            if (rcpTask.getExcludes().size() > 0) {
                w.key(RcpServlet.PARAM_EXCLUDES).array();
                for (String exclude: rcpTask.getExcludes()) {
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
            if (isEdit || "create".equals(cmd)) {
                if (isEdit) {
                    if (id == null || id.length() == 0) {
                        throw new IllegalArgumentException("Need task id.");
                    }
```

### SizeReplaceableByIsEmpty
`src.length() == 0` can be replaced with 'src.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
                }
                String src = data.optString(PARAM_SRC, "");
                if (isEdit && (src == null || src.length() == 0)) {
                    throw new IllegalArgumentException("Need src.");
                }
```

### SizeReplaceableByIsEmpty
`srcCreds.length() > 0` can be replaced with '!srcCreds.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
                    );
                }
                if (srcCreds != null && srcCreds.length() > 0) {
                    creds = createCredentials(srcCreds);
                }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
            // ---------------------------------------------------------------------------------------------< start >---
            } else if ("start".equals(cmd)) {
                if (id == null || id.length() == 0) {
                    throw new IllegalArgumentException("Need task id.");
                }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
            // ----------------------------------------------------------------------------------------------< stop >---
            } else if ("stop".equals(cmd)) {
                if (id == null || id.length() == 0) {
                    throw new IllegalArgumentException("Need task id.");
                }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
            // --------------------------------------------------------------------------------------------< remove >---
            } else if ("remove".equals(cmd)) {
                if (id == null || id.length() == 0) {
                    throw new IllegalArgumentException("Need task id.");
                }
```

### SizeReplaceableByIsEmpty
`id.length() == 0` can be replaced with 'id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
            } else if ("set-credentials".equals(cmd)) {
                // only add the credentials for a certain task id
                if (id == null || id.length() == 0) {
                    throw new IllegalArgumentException("Need task id.");
                }
```

### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    public RcpTask addTask(RepositoryAddress src, ConnectionOptions connectionOptions, Credentials srcCreds, String dst, String id, List<String> excludes, @Nullable Boolean recursive)
            throws ConfigurationException {
        if (id != null && id.length() > 0 && tasks.containsKey(id)) {
            throw new IllegalArgumentException("Task with id " + id + " already exists.");
        }
```

### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    public RcpTask addTask(RepositoryAddress src, ConnectionOptions connectionOptions, Credentials srcCreds, String dst, String id, WorkspaceFilter srcFilter,
            @Nullable Boolean recursive) {
        if (id != null && id.length() > 0 && tasks.containsKey(id)) {
            throw new IllegalArgumentException("Task with id " + id + " already exists.");
        }
```

### SizeReplaceableByIsEmpty
`copyFrom.length() == 0` can be replaced with 'copyFrom.isEmpty()'
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
        Properties props = ctx.getPackage().getMetaInf().getProperties();
        String copyFrom = props.getProperty(PROP_COPY_FROM, "");
        if (copyFrom.length() == 0) {
            throw new PackageException("hook-example needs " + PROP_COPY_FROM + " property set in properties.xml");
        }
```

### SizeReplaceableByIsEmpty
`copyTo.length() == 0` can be replaced with 'copyTo.isEmpty()'
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
        }
        String copyTo = props.getProperty(PROP_COPY_TO, "");
        if (copyTo.length() == 0) {
            throw new PackageException("hook-example needs " + PROP_COPY_TO + " property set in properties.xml");
        }
```

### SizeReplaceableByIsEmpty
`testNodePath.length() == 0` can be replaced with 'testNodePath.isEmpty()'
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
        }
        testNodePath = props.getProperty(PROP_TEST_NODE, "");
        if (testNodePath.length() == 0) {
            throw new PackageException("hook-example needs " + PROP_TEST_NODE + " property set in properties.xml");
        }
```

### SizeReplaceableByIsEmpty
`jcrPath.length() == 0` can be replaced with 'jcrPath.isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
            localPath = Text.getName(jcrPath);
        }
        if (jcrPath.length() == 0 || !jcrPath.startsWith("/")) {
            throw new ExecutionException("JCR path needs to be absolute: " + jcrPath);
        }
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSync.java`
#### Snippet
```java
            .withValidator(new Validator() {
                public void validate(List list) throws InvalidArgumentException {
                    if (list.size() > 0) {
                        String cmd = list.get(0).toString();
                        try {
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                } else {
                    line = line.trim();
                    if (line.length() > 0) {
                        if (line.startsWith("!")) {
                            // re-execute event from history
```

### SizeReplaceableByIsEmpty
`chRoot.length() > 0` can be replaced with '!chRoot.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java

                // if archive is ch-rooted, create intermediate entries
                if (chRoot != null && chRoot.length() > 0) {
                    String[] roots = Text.explode(rootPath, '/');
                    if (roots.length > 0) {
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/MultiPathMapping.java`
#### Snippet
```java
    @NotNull
    public String map(@NotNull String path, boolean reverse) {
        if (path.length() == 0 || "/".equals(path)) {
            return path;
        }
```

### SizeReplaceableByIsEmpty
`mountPath.length() > 0` can be replaced with '!mountPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
                rootPath = "";
            }
            if (mountPath.length() > 0 || rootPath.length() > 0) {
                filter = filter.translate(new SimplePathMapping(mountPath, rootPath));
            }
```

### SizeReplaceableByIsEmpty
`rootPath.length() > 0` can be replaced with '!rootPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
                rootPath = "";
            }
            if (mountPath.length() > 0 || rootPath.length() > 0) {
                filter = filter.translate(new SimplePathMapping(mountPath, rootPath));
            }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
     */
    private static void addManifestAttribute(Manifest manifest, String key, String value) {
        if (value != null && value.length() > 0) {
            Attributes.Name name = new Attributes.Name(key);
            manifest.getMainAttributes().put(name, value);
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
    @NotNull
    public RepositoryAddress resolve(@Nullable String path) {
        if (path == null || path.length() == 0 || ".".equals(path) || "./".equals(path)) {
            return this;
        }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
        String localPath = "/";

        if (path.length() == 0 || "/".equals(path)) {
            workspace = "-";
            localPath = "/";
```

### SizeReplaceableByIsEmpty
`prefix.length() == 0` can be replaced with 'prefix.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
            }
        }
        if (prefix.length() == 0) {
            prefix = "/";
        }
```

### SizeReplaceableByIsEmpty
`nodeTypes.size() > 0` can be replaced with '!nodeTypes.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JcrNodeTypeInstaller.java`
#### Snippet
```java
        NodeTypeDefinitionFactory fac = new NodeTypeDefinitionFactory(session);
        List<NodeTypeDefinition> nodeTypes = fac.create(set.getNodeTypes().values());
        if (nodeTypes.size() > 0) {
            try {
                ntMgr.registerNodeTypes(nodeTypes.toArray(new NodeTypeDefinition[nodeTypes.size()]), true);
```

### SizeReplaceableByIsEmpty
`parentPath.length() > 0` can be replaced with '!parentPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            String rootPath = sets.getRoot();
            // make filter root relative to import root
            if (parentPath.length() > 0 && rootPath.startsWith(parentPath)) {
                rootPath = rootPath.substring(parentPath.length());
            }
```

### SizeReplaceableByIsEmpty
`filter.getFilterSets().size() > 0` can be replaced with '!filter.getFilterSets().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        track("Collecting import information...", "");
        TxInfo root = prepare(archive.getJcrRoot(), parentPath, new SessionNamespaceResolver(session));
        if (filter!=null && filter.getFilterSets() != null && filter.getFilterSets().size() > 0 ) {
            root = postFilter(root);
        }
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java

        private static String emptyPathToRoot(String path) {
            return path == null || path.length() == 0 ? "/" : path;
        }
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
    public String getPath() {
        if (parent == null) {
            return name.length() == 0 ? "/" : name;
        } else {
            return internalGetPath().toString();
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SubPackageFilterArchive.java`
#### Snippet
```java
    @Nullable
    public Entry getEntry(@NotNull String path) throws IOException {
        if (path.length() == 0 || "/".equals(path)) {
            return getRoot();
        }
```

### SizeReplaceableByIsEmpty
`rootPath.length() > 0` can be replaced with '!rootPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
            throw new IOException("Only absolute paths allowed");
        }
        if (rootPath.length() > 0) {
            if (!path.equals(rootPath) && !path.startsWith(rootPattern)) {
                throw new IOException("Path not under mountpoint.");
```

### SizeReplaceableByIsEmpty
`dir.getRelativePath().length() == 0` can be replaced with 'dir.getRelativePath().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
        }
        ImportInfoImpl info = new ImportInfoImpl();
        if (dir.getRelativePath().length() == 0) {
            // special check if artifact addresses itself
            return info;
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AbstractArtifactHandler.java`
#### Snippet
```java
        String name = node.getName();
        return accept(new ImportOptions(), true, file.getManager().getWorkspaceFilter(),
                name.length() == 0 ? node : node.getParent(),
                name, (ArtifactSetImpl) artifacts);
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
            info = new ImportInfoImpl();
            String path = PathUtil.getPath(parent, name);
            if (name.length() == 0 || parent.hasNode(name)) {
                if (wspFilter.getImportMode(path) == ImportMode.MERGE) {
                    // do import the content if node is an authorizable or ACL
```

### SizeReplaceableByIsEmpty
`primary.getRelativePath().length() == 0` can be replaced with 'primary.getRelativePath().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                ImportMode mode = ImportMode.REPLACE;
                String path = PathUtil.getPath(parent, primary.getRelativePath());
                if (primary.getRelativePath().length() == 0 || parent.hasNode(primary.getRelativePath())) {
                    mode = wspFilter.getImportMode(path);
                }
```

### SizeReplaceableByIsEmpty
`relPath.length() > 0` can be replaced with '!relPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                    String newName = Text.getName(file.getRelativePath());
                    Node newParent = parent;
                    if (relPath.length() > 0) {
                        if (parent.hasNode(relPath)) {
                            newParent = parent.getNode(relPath);
```

### SizeReplaceableByIsEmpty
`newName.length() == 0` can be replaced with 'newName.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                    ImportMode mode = ImportMode.REPLACE;
                    String path = PathUtil.getPath(newParent, newName);
                    if (newName.length() == 0 || newParent.hasNode(newName)) {
                        mode = wspFilter.getImportMode(path);
                    }
```

### SizeReplaceableByIsEmpty
`relPath.length() > 0` can be replaced with '!relPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
            this.repoPath = file.getAggregatePath();
            String relPath = file.getRepoRelPath();
            if (relPath != null && relPath.length() > 0) {
                this.repoPath += "/" + relPath;
            }
```

### SizeReplaceableByIsEmpty
`parentPath.length() > 0` can be replaced with '!parentPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                        }
                        while ((parent == null || parent.getAggregate() == null)
                                && parentPath.length() > 0) {
                            String parentName = Text.getName(parentPath);
                            if (parentName.endsWith(".dir")) {
```

### SizeReplaceableByIsEmpty
`parentPath.length() > 0` can be replaced with '!parentPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    // at the end.
                    while ((parent == null || parent.getAggregate() == null)
                            && parentPath.length() > 0) {
                        String parentName = Text.getName(parentPath);
                        if (parentName.endsWith(".dir")) {
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java

    public Node getNode() throws RepositoryException {
        if (path.length() == 0) {
            return mgr.getSession().getRootNode();
        } else {
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
    public boolean hasNode() throws RepositoryException {
        return nodeRef != null && nodeRef.get() != null
                || path.length() == 0 || mgr.getSession().nodeExists(path);
    }

```

### SizeReplaceableByIsEmpty
`clazz.length() > 0` can be replaced with '!clazz.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
                    ItemFilter filter = null;
                    String clazz = child.getAttribute("class");
                    if (clazz != null && clazz.length() > 0) {
                        filter = (ItemFilter) helper.create(child);
                    } else {
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     */
    public static String[] explode(String str, int ch, boolean respectEmpty) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }
```

### SizeReplaceableByIsEmpty
`elems[i].length() > 0` can be replaced with '!elems\[i\].isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
        String[] elems = Text.explode(path, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
                elems[i] = getRepositoryName(elems[i]);
            }
```

### SizeReplaceableByIsEmpty
`elems[i].length() > 0` can be replaced with '!elems\[i\].isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
        String[] elems = Text.explode(path, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
                if (respectDotDir && elems[i].endsWith(".dir")) {
                    elems[i] = getRepositoryName(elems[i].substring(0, elems[i].length() - 4));
```

### SizeReplaceableByIsEmpty
`elems[i].length() > 0` can be replaced with '!elems\[i\].isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
        String[] elems = Text.explode(repoPath, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
                elems[i] = getPlatformName(elems[i]);
            }
```

### SizeReplaceableByIsEmpty
`relPath.length() > 0` can be replaced with '!relPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
    public static String getPath(Node parent, String relPath) throws RepositoryException {
        String path = parent.getPath();
        if (relPath.length() > 0) {
            if (path.endsWith("/")) {
                path += relPath;
```

### SizeReplaceableByIsEmpty
`relPath.length() == 0` can be replaced with 'relPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java

    public static String append(String parent, String relPath) {
        if (relPath == null || relPath.length() == 0) {
            return parent == null ? "" : parent;
        }
```

### SizeReplaceableByIsEmpty
`getName().getPrefix().length() > 0` can be replaced with '!getName().getPrefix().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/NormalizingSaxFilter.java`
#### Snippet
```java
        public void addToAttributes(AttributesImpl attributes) {
            StringBuilder qName = new StringBuilder();
            if (getName().getPrefix().length() > 0) {
                qName.append(getName().getPrefix()).append(":");
            }
```

### SizeReplaceableByIsEmpty
`namespaceUri.length()>0` can be replaced with '!namespaceUri.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
        String encodedLocalName = ISO9075.encode(localName);
       
        if (namespaceUri.length()>0) {
            writer.writeStartElement(nsResolver.getPrefix(namespaceUri), encodedLocalName, namespaceUri);
        } else {
```

### SizeReplaceableByIsEmpty
`attributeNamespaceUri.length()>0` can be replaced with '!attributeNamespaceUri.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
            String attributeLocalName = ISO9075.encode(prop.getName().getLocalName());
            String attributeNamespaceUri = prop.getName().getNamespaceURI();
            if (attributeNamespaceUri.length()>0) {
                writer.writeAttribute(nsResolver.getPrefix(attributeNamespaceUri), attributeNamespaceUri, attributeLocalName, 
                        prop.formatValue());
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
        for (int i=0;i<values.size();i++) {
            String value = values.get(i);
            if (values.size() == 1 && value.length() == 0) {
                // special case for empty string MV value (JCR-3661)
                attrValue.append("\\0");
```

### SizeReplaceableByIsEmpty
`root.length() == 0` can be replaced with 'root.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
    private void readDef(Element elem) throws ConfigurationException {
        String root = elem.getAttribute("root");
        if (root == null || root.length() == 0) {
            root = "/";
        }
```

### SizeReplaceableByIsEmpty
`mode.length() > 0` can be replaced with '!mode.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        // check for import mode
        String mode = elem.getAttribute("mode");
        if (mode != null && mode.length() > 0) {
            try {
                ImportMode importMode = ImportMode.valueOf(mode.toUpperCase());
```

### SizeReplaceableByIsEmpty
`type.length() > 0` can be replaced with '!type.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        String type = elem.getAttribute("type");
        if (type != null && type.length() > 0) {
            nodeFilters.setType(type);
            propFilters.setType(type);
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Version.java`
#### Snippet
```java
    @NotNull
    public static Version create(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return Version.EMPTY;
        }
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        for (int i=0;i<values.length;i++) {
            String value = values[i];
            if (values.length == 1 && value.length() == 0) {
                // special case for empty string MV value (JCR-3661)
                attrValue.append("\\0");
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
    @Nullable
    public static Dependency fromString(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
            name = segs[1];
            boolean isVersion = true;
            if (name.length() > 0) {
                char c = name.charAt(0);
                isVersion = Character.isDigit(c) || c == '[' || c == ')';
```

### SizeReplaceableByIsEmpty
`groupId.length() == 0` can be replaced with 'groupId.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
            // be backward compatible, respect group in name
            int idx = name.lastIndexOf('/');
            if (idx >= 0 && groupId.length() == 0) {
                groupId = name.substring(0, idx);
                name = name.substring(idx + 1);
```

### SizeReplaceableByIsEmpty
`groupId.length() > 0` can be replaced with '!groupId.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
    public String getPath() {
        StringBuilder b = new StringBuilder();
        if (groupId.length() > 0) {
            if (groupId.charAt(0) != '/') {
                b.append(PackageId.ETC_PACKAGES_PREFIX);
```

### SizeReplaceableByIsEmpty
`groupId.length() > 0` can be replaced with '!groupId.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
        this.range = range == null ? VersionRange.INFINITE : range;
        StringBuilder b = new StringBuilder();
        if (groupId.length() > 0 || !VersionRange.INFINITE.equals(this.range)) {
            b.append(groupId);
            b.append(":");
```

### SizeReplaceableByIsEmpty
`low.length() == 0` can be replaced with 'low.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
            String low = str.substring(lm + 1, idx).trim();
            String high = str.substring(idx+1, hm).trim();
            Version vLow = low.length() == 0 ? null : Version.create(low);
            Version vHigh = high.length() == 0 ? null : Version.create(high);
            return new VersionRange(vLow, linc, vHigh, hinc);
```

### SizeReplaceableByIsEmpty
`high.length() == 0` can be replaced with 'high.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
            String high = str.substring(idx+1, hm).trim();
            Version vLow = low.length() == 0 ? null : Version.create(low);
            Version vHigh = high.length() == 0 ? null : Version.create(high);
            return new VersionRange(vLow, linc, vHigh, hinc);
        } else if (str.length() == 0) {
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
            Version vHigh = high.length() == 0 ? null : Version.create(high);
            return new VersionRange(vLow, linc, vHigh, hinc);
        } else if (str.length() == 0) {
            // infinite range
            return new VersionRange(null, false, null, false);
```

### SizeReplaceableByIsEmpty
`deps.length() == 0` can be replaced with 'deps.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackagePropertiesImpl.java`
#### Snippet
```java
    public Map<PackageId, URI> getDependenciesLocations() {
        String deps = getProperty(NAME_DEPENDENCIES_LOCATIONS);
        if (deps == null || deps.length() == 0) {
            return Collections.emptyMap();
        } else {
```

### SizeReplaceableByIsEmpty
`root.length() == 0` can be replaced with 'root.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
                    ? filter.getProperty(JcrPackageDefinitionImpl.PN_ROOT).getString()
                    : "";
            if (root.length() == 0) {
                continue;
            }
```

### SizeReplaceableByIsEmpty
`mode.length() > 0` can be replaced with '!mode.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
            PathFilterSet set = new PathFilterSet(root);
            PathFilterSet propertySet = new PathFilterSet(root);
            if (mode.length() > 0) {
                set.setImportMode(ImportMode.valueOf(mode.toUpperCase()));
                propertySet.setImportMode(ImportMode.valueOf(mode.toUpperCase()));
```

### SizeReplaceableByIsEmpty
`mountPath.length() == 0` can be replaced with 'mountPath.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerImpl.java`
#### Snippet
```java
            try {
                String mountPath = opts.getMountPath();
                if (mountPath == null || mountPath.length() == 0) {
                    mountPath = "/";
                }
```

### SizeReplaceableByIsEmpty
`group.length() > 0` can be replaced with '!group.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    public String getInstallationPath() {
        StringBuilder b = new StringBuilder(ETC_PACKAGES_PREFIX);
        if (group.length() > 0) {
            b.append(group);
            b.append("/");
```

### SizeReplaceableByIsEmpty
`version.toString().length() > 0` can be replaced with '!version.toString().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        }
        b.append(name);
        if (version.toString().length() > 0) {
            b.append("-").append(version);
        }
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
     */
    public static PackageId fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`version.toString().length() > 0` can be replaced with '!version.toString().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    public String getDownloadName() {
        StringBuilder str = new StringBuilder(name);
        if (version.toString().length() > 0) {
            str.append("-").append(version);
        }
```

### SizeReplaceableByIsEmpty
`version.length() > 0` can be replaced with '!version.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        b.append(group).append(':');
        b.append(name);
        if (version.length() > 0) {
            b.append(':').append(version);
        }
```

### SizeReplaceableByIsEmpty
`version.toString().length() == 0` can be replaced with 'version.toString().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        }
        // sanitize version
        if (version == null || version.toString().length() == 0) {
            version = Version.EMPTY;
        }
```

### SizeReplaceableByIsEmpty
`tmp.length() == 0` can be replaced with 'tmp.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
                if (state == STATE_URI_START || state == STATE_URI) {
                    String tmp = jcrName.substring(1, i);
                    if (tmp.length() == 0 || tmp.indexOf(':') != -1) {
                        // The leading "{...}" part is empty or contains
                        // a colon, so we treat it as a valid namespace URI.
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                // check for legacy packages that only contains a 'path' property
                String path = props.getProperty("path");
                if (path == null || path.length() == 0) {
                    path = "/etc/packages/unknown";
                }
```

### SizeReplaceableByIsEmpty
`subPackages.size() > 0` can be replaced with '!subPackages.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
            }
        }
        if (subPackages.size() > 0) {
            // now remove the filters with the sub-package information and create distinct ones for the sub packages
            DefaultWorkspaceFilter newFilter = (DefaultWorkspaceFilter) filter.translate(PathMapping.IDENTITY);
```

### SizeReplaceableByIsEmpty
`id.getGroup().length() > 0` can be replaced with '!id.getGroup().isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
    public static String getRelativeInstallationPath(PackageId id) {
        StringBuilder b = new StringBuilder();
        if (id.getGroup().length() > 0) {
            b.append(id.getGroup());
            b.append("/");
```

### SizeReplaceableByIsEmpty
`v.length() > 0` can be replaced with '!v.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
        b.append(id.getName());
        String v = id.getVersion().toString();
        if (v.length() > 0) {
            b.append("-").append(v);
        }
```

### SizeReplaceableByIsEmpty
`group.length() == 0` can be replaced with 'group.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
     */
    private void listPackages(Node pkgRoot, List<JcrPackage> packages, String group, boolean built) throws RepositoryException {
        if (group == null || group.length() == 0) {
            listPackages(pkgRoot, packages, null, built, false);
        } else {
```

### SizeReplaceableByIsEmpty
`group.length() > 0` can be replaced with '!group.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            }
            Node root = pkgRoot;
            if (group.length() > 0) {
                if (root.hasNode(group)) {
                    root = root.getNode(group);
```

### SizeReplaceableByIsEmpty
`properties.size() > 0` can be replaced with '!properties.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
                }
            }
            if (properties.size() > 0) {
                writer.writeStartElement(TAG_PACKAGEPROPERTIES);
                for (String key : properties.stringPropertyNames()) {
```

### SizeReplaceableByIsEmpty
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        try {
            String path = get("path");
            if (path == null || path.length() == 0) {
                // get grand parent
                path = defNode.getParent().getParent().getPath();
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        String name = get(PN_NAME);
        String version = get(PN_VERSION);
        if (group == null || name == null || name.length() == 0) {
            // backward compatible
            String path = getInstallationPath();
```

### SizeReplaceableByIsEmpty
`fsRoot.length() > 0` can be replaced with '!fsRoot.isEmpty()'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
        try {
            String url = addr.toString();
            if (fsRoot.length() > 0 && url.endsWith(fsRoot)) {
                url = url.substring(0, url.length() - fsRoot.length());
            }
```

### SizeReplaceableByIsEmpty
`unresolved.size() > 0` can be replaced with '!unresolved.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            }
            // if the package is not installed at all, abort for required and strict handling
            if ((opts.getDependencyHandling() == DependencyHandling.STRICT && unresolved.size() > 0)
                    || (opts.getDependencyHandling() == DependencyHandling.REQUIRED && unresolved.size() > uninstalled.size())) {
                String msg = String.format("Refusing to install package %s: required dependencies missing: %s", def.getId(), unresolved);
```

### SizeReplaceableByIsEmpty
`group.length() == 0` can be replaced with 'group.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        PackageId id = getDefinition().getId();
        String group = id.getGroup();
        if (group.length() == 0) {
            group = ".snapshot";
        } else {
```

### SizeReplaceableByIsEmpty
`subPackages.size() > 0` can be replaced with '!subPackages.isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            Session s = getNode().getSession();
            // check for recursive uninstall
            if (!opts.isNonRecursive() && subPackages.size() > 0) {
                JcrPackageManagerImpl packMgr = new JcrPackageManagerImpl(mgr);
                for (PackageId id : subPackages) {
```

### SizeReplaceableByIsEmpty
`sm.length() > 0` can be replaced with '!sm.isEmpty()'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
        String sm = getString(PROP_SYNC_ONCE, "");
        syncOnce = null;
        if (sm.length() > 0) {
            try {
                syncOnce = SyncMode.valueOf(sm.toUpperCase());
```

### SizeReplaceableByIsEmpty
`trimmed.length() == 0` can be replaced with 'trimmed.isEmpty()'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
            if (trimmed.startsWith("#")) {
                name = "comment-" + UUID.randomUUID();
            } else if (trimmed.length() == 0) {
                name = "blank-" + UUID.randomUUID();
            } else {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
    private final String validatorId; // may only be null if message was not bound to a validator

    public static final Collection<ValidationViolation> wrapMessages(String validatorId, Collection<? extends ValidationMessage> messages, Path filePath, Path basePath, String nodePath, int line, int column) {
        Collection<ValidationViolation> violations = new LinkedList<>();
        for (ValidationMessage message : messages) {
```

### FinalStaticMethod
'static' method declared `final`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
    }

    public static final ValidationViolation wrapMessage(String validatorId, ValidationMessage message, Path filePath, Path basePath, String nodePath, int line, int column) {
        if (message instanceof ValidationViolation) {
            ValidationViolation delegate = ValidationViolation.class.cast(message);
```

### FinalStaticMethod
'static' method declared `final`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
    }

    private static final Element getFirstElementByTagName(String name, Element element) {
        NodeList nodeList = element.getElementsByTagName(name);
        if (nodeList.getLength() == 0) {
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/RcpTaskManager.java`
#### Snippet
```java
            throws ConfigurationException;

    void setSourceCredentials(@NotNull String taskId, Credentials srcCreds);

    RcpTask editTask(@NotNull String taskId, @Nullable RepositoryAddress src, @Nullable ConnectionOptions connectionOptions, @Nullable Credentials srcCreds, @Nullable String dst,
```

### NullableProblems
Constructor parameter for @NotNull field might be annotated @NotNull itself
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
            boolean prohibitMutableContent, boolean prohibitImmutableContent, boolean allowComplexFilterRulesInApplicationPackages,
            boolean allowInstallHooksInApplicationPackages, @NotNull PackageType type, @NotNull Pattern jcrInstallerNodePathRegex, 
            Pattern jcrInstallerAdditionalFileNodePathRegex, @NotNull Set<String> immutableRootNodeNames, @Nullable ValidationContext containerValidationContext) {
        this.type = type;
        this.severity = severity;
```

### NullableProblems
Overridden methods are not annotated
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaData.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider, @NotNull ValidationMessageSeverity severity, 
            @NotNull ValidationMessageSeverity severityForDefaultNodeTypeViolations, @NotNull WorkspaceFilter filter) throws NamespaceException;
    @NotNull Name getPrimaryNodeType();
    String getQualifiedPath(NamePathResolver resolver) throws NamespaceException;
    void setNodeTypes(@NotNull NameResolver nameResolver, @NotNull EffectiveNodeTypeProvider effectiveNodeTypeProvider,  boolean isFallbackPrimaryType,
```

### NullableProblems
Nullability annotation is not applicable to wildcard type
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaData.java`
#### Snippet
```java
    
    // navigate
    @NotNull Collection<@NotNull ? extends JcrNodeTypeMetaData> getChildren();
    Optional<JcrNodeTypeMetaData> getNode(NamePathResolver nameResolver, String path)
            throws ItemNotFoundException, RepositoryException;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
        }

        public MavenCoordinates(@NotNull String groupId, @NotNull String artifactId, String version,@NotNull String packaging, String classifier) {
            super();
            this.groupId = groupId;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
        }

        public MavenCoordinates(@NotNull String groupId, @NotNull String artifactId, String version,@NotNull String packaging, String classifier) {
            super();
            this.groupId = groupId;
```

### NullableProblems
Nullability annotation is not applicable to type parameters
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
    }

    static <@NotNull T> @NotNull Map<@NotNull String, @NotNull T> filterValidatorsByClass(@NotNull Map<@NotNull String, @NotNull Validator> allValidators, @NotNull Class<T> type) {
        return allValidators.entrySet().stream()
                .filter(x -> type.isInstance(x.getValue()))
```

### NullableProblems
Nullability annotation is not applicable to wildcard type
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    @Override
    public @NotNull Collection<@NotNull ? extends JcrNodeTypeMetaData> getChildren() {
        return childNodesByName.values();
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    @Override
    public Name getPrimaryNodeType() {
        return primaryNodeType;
    }
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    private JcrNodeTypeMetaDataImpl(boolean isIncremental, @NotNull NodeContext context, @NotNull Name name, @Nullable Name primaryNodeType, @Nullable EffectiveNodeType effectiveNodeType,
            JcrNodeTypeMetaDataImpl parentNode, boolean isAuthenticationOrAuthorizationContext, boolean isImplicit) {
        super();
        this.context = context;
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
         * @return the name
         */
        @NotNull
        String getName();

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
     * @return the meta inf.
     */
    @NotNull
    MetaInf getMetaInf();

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
     * @throws IOException if an error occurs
     */
    @NotNull
    Entry getRoot() throws IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
     */
    @Nullable
    Entry getEntry(@NotNull String path) throws IOException;
    
    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
     */
    @Nullable
    Archive getSubArchive(@NotNull String root, boolean asJcrRoot) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
         */
        @Nullable
        Entry getChild(@NotNull String name);
    }

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Archive.java`
#### Snippet
```java
         * @return a collection of child entries.
         */
        @NotNull
        Collection<? extends Entry> getChildren();

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Serializer.java`
#### Snippet
```java
     * @throws RepositoryException
     */
    void writeContent(@NotNull OutputStream out) throws IOException, RepositoryException;

    @NotNull
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Serializer.java`
#### Snippet
```java
    void writeContent(@NotNull OutputStream out) throws IOException, RepositoryException;

    @NotNull
    SerializationType getType();
}
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewAnalyzerListener.java`
#### Snippet
```java
     * @param nodeType the primary type of the node or {@code null} if empty.
     */
    void onNode(@NotNull String path, boolean intermediate, @Nullable String nodeType);
}

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathMapping.java`
#### Snippet
```java
     * @return the mapped path.
     */
    @NotNull
    String map(@NotNull String path);

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathMapping.java`
#### Snippet
```java
     */
    @NotNull
    String map(@NotNull String path);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathMapping.java`
#### Snippet
```java
     * @return the mapped path.
     */
    @NotNull
    String map(@NotNull String path, boolean reverse);

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathMapping.java`
#### Snippet
```java
     */
    @NotNull
    String map(@NotNull String path, boolean reverse);


```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java
     * @since 2.4.10
     */
    @NotNull
    PathFilter translate(@Nullable PathMapping mapping);
}
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java
     *         {@code false} otherwise.
     */
    boolean matches(@NotNull String path);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    void dumpCoverage(@NotNull Session session, @NotNull ProgressTrackerListener listener, boolean skipJcrContent)
            throws RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    void dumpCoverage(@NotNull Session session, @NotNull ProgressTrackerListener listener, boolean skipJcrContent)
            throws RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return the list of path filter sets.
     */
    @NotNull
    List<PathFilterSet> getFilterSets();

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return {@code true} if the given item is an ancestor
     */
    boolean isAncestor(@NotNull String path);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @since 2.4.10
     */
    @NotNull
    WorkspaceFilter translate(@Nullable PathMapping mapping);

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return the source xml
     */
    @NotNull
    InputStream getSource();

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     *         is not covered by this filter.
     */
    @NotNull
    ImportMode getImportMode(@NotNull String path);

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     */
    @NotNull
    ImportMode getImportMode(@NotNull String path);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return {@code true} if the given path is covered by this filter.
     */
    boolean covers(@NotNull String path);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return the source xml
     */
    @NotNull
    String getSourceAsString();

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    void dumpCoverage(@NotNull Node rootNode, @NotNull ProgressTrackerListener listener)
            throws RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    void dumpCoverage(@NotNull Node rootNode, @NotNull ProgressTrackerListener listener)
            throws RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return the list of path filter sets.
     */
    @NotNull
    List<PathFilterSet> getPropertyFilterSets();

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return {@code true} if the item is globally ignored.
     */
    boolean isGloballyIgnored(@NotNull String path);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * @return {@code true} if the given path is included in this filter.
     */
    boolean contains(@NotNull String path);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     */
    @Nullable
    PathFilterSet getCoveringFilterSet(@NotNull String path);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/Dumpable.java`
#### Snippet
```java
     * @param isLast specifies if this is the last element to dump on this level
     */
    void dump(@NotNull DumpContext ctx, boolean isLast);
}

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/MetaInf.java`
#### Snippet
```java
     * @return the node types
     */
    @NotNull
    Collection<NodeTypeSet> getNodeTypes();

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/MetaInf.java`
#### Snippet
```java
     * @return the package properties
     */
    @NotNull
    PackageProperties getPackageProperties();

```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java

    public DocViewImporter(Node parentNode, String rootNodeName,
            ArtifactSetImpl artifacts, WorkspaceFilter wspFilter, IdConflictPolicy idConflictPolicy, AccessControlHandling aclHandling, AccessControlHandling cugHandling) throws RepositoryException {
        this.filter = artifacts.getCoverage();
        this.wspFilter = wspFilter;
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an error occurs
     */
    @NotNull VaultPackage open(@NotNull File file, boolean strict) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an error occurs
     */
    @NotNull VaultPackage open(@NotNull File file, boolean strict) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    void assemble(@NotNull Session s, @NotNull ExportOptions opts, @NotNull OutputStream out)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    void assemble(@NotNull Session s, @NotNull ExportOptions opts, @NotNull OutputStream out)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    void assemble(@NotNull Session s, @NotNull ExportOptions opts, @NotNull OutputStream out)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage assemble(@NotNull Session s, @NotNull ExportOptions opts, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage assemble(@NotNull Session s, @NotNull ExportOptions opts, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IllegalStateException if the package is not new.
     */
    @NotNull VaultPackage assemble(@NotNull Session s, @NotNull ExportOptions opts, @Nullable File file)
            throws IOException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @NotNull OutputStream out)
            throws IOException;
}
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @NotNull OutputStream out)
            throws IOException;
}
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void rewrap(@NotNull ExportOptions opts, @NotNull VaultPackage src, @NotNull OutputStream out)
            throws IOException;
}
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an error occurs
     */
    @NotNull VaultPackage open(@NotNull File file) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageManager.java`
#### Snippet
```java
     * @throws IOException if an error occurs
     */
    @NotNull VaultPackage open(@NotNull File file) throws IOException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageProperties.java`
#### Snippet
```java
     * @return dependencies locations as map
     */
    @NotNull Map<PackageId, URI> getDependenciesLocations();

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @since 2.3
     */
    @NotNull
    JcrPackage rename(@NotNull JcrPackage pack, @Nullable String groupId, @Nullable String name, @Nullable String version)
            throws PackageException, RepositoryException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage rename(@NotNull JcrPackage pack, @Nullable String groupId, @Nullable String name, @Nullable String version)
            throws PackageException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @Nullable
    JcrPackage open(@NotNull Node node) throws RepositoryException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurrs
     */
    @NotNull
    JcrPackage upload(@NotNull File file, boolean isTmpFile, boolean replace, @Nullable String nameHint)
            throws RepositoryException, IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage upload(@NotNull File file, boolean isTmpFile, boolean replace, @Nullable String nameHint)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    @NotNull
    Node getPackageRoot() throws RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    @NotNull
    List<JcrPackage> listPackages(@Nullable WorkspaceFilter filter) throws RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void assemble(@NotNull JcrPackage pack, @Nullable ProgressTrackerListener listener)
            throws PackageException, RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @Nullable
    JcrPackage open(@NotNull PackageId id) throws RepositoryException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @since 2.2.5
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name)
            throws RepositoryException, IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurrs
     */
    @NotNull
    JcrPackage upload(@NotNull InputStream in, boolean replace) throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage upload(@NotNull InputStream in, boolean replace) throws RepositoryException, IOException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurrs
     */
    @NotNull
    JcrPackage upload(@NotNull File file, boolean isTmpFile, boolean replace, @Nullable String nameHint, boolean strict)
            throws RepositoryException, IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage upload(@NotNull File file, boolean isTmpFile, boolean replace, @Nullable String nameHint, boolean strict)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    PackageId[] usage(@NotNull PackageId id) throws RepositoryException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @Nullable
    PackageId resolve(@NotNull Dependency dependency, boolean onlyInstalled) throws RepositoryException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws PackageException if a package error occurs
     */
    void assemble(@NotNull JcrPackageDefinition definition, @Nullable ProgressTrackerListener listener, @NotNull OutputStream out)
            throws IOException, RepositoryException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws PackageException if a package error occurs
     */
    void assemble(@NotNull JcrPackageDefinition definition, @Nullable ProgressTrackerListener listener, @NotNull OutputStream out)
            throws IOException, RepositoryException, PackageException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @since 2.3
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name, @Nullable String version)
            throws RepositoryException, IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name, @Nullable String version)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage create(@NotNull String group, @NotNull String name, @Nullable String version)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O exception occurs
     */
    @NotNull
    JcrPackage create(@Nullable Node folder, @NotNull String name)
            throws RepositoryException, IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage create(@Nullable Node folder, @NotNull String name)
            throws RepositoryException, IOException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    @NotNull
    List<JcrPackage> listPackages() throws RepositoryException;

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @since 2.0
     */
    @NotNull
    JcrPackage rename(@NotNull JcrPackage pack, @Nullable String groupId, @Nullable String name)
            throws PackageException, RepositoryException;
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage rename(@NotNull JcrPackage pack, @Nullable String groupId, @Nullable String name)
            throws PackageException, RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @since 2.2.7
     */
    void remove(@NotNull JcrPackage pack) throws RepositoryException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void rewrap(@NotNull JcrPackage pack, @Nullable ProgressTrackerListener listener)
            throws PackageException, RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void assemble(@NotNull Node packNode, @NotNull JcrPackageDefinition definition, @Nullable ProgressTrackerListener listener)
            throws PackageException, RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    void assemble(@NotNull Node packNode, @NotNull JcrPackageDefinition definition, @Nullable ProgressTrackerListener listener)
            throws PackageException, RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @Nullable
    JcrPackage open(@NotNull Node node, boolean allowInvalid) throws RepositoryException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurrs
     */
    @NotNull
    JcrPackage upload(@NotNull InputStream in, boolean replace, boolean strict) throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     */
    @NotNull
    JcrPackage upload(@NotNull InputStream in, boolean replace, boolean strict) throws RepositoryException, IOException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageManager.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    @NotNull
    List<JcrPackage> listPackages(@Nullable String group, boolean built) throws RepositoryException;
}
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    @NotNull
    VaultPackage getPackage() throws RepositoryException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     * @since 2.3.14
     */
    void install(@NotNull ImportOptions opts)
            throws RepositoryException, PackageException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     * @since 2.3.14
     */
    void extract(@NotNull ImportOptions opts)
            throws RepositoryException, PackageException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     * @since 2.3.14
     */
    void uninstall(@NotNull ImportOptions opts)
            throws RepositoryException, PackageException, IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     */
    @Nullable
    JcrPackage snapshot(@NotNull ExportOptions opts, boolean replace)
            throws RepositoryException, PackageException, IOException;

```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
    }

    public DocViewNode(@NotNull String name, @NotNull String label, String uuid, Map<String, DocViewProperty> props, String[] mixins, String primary) {
        this.name = name;
        this.label = label;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
    }

    public DocViewNode(@NotNull String name, @NotNull String label, String uuid, Map<String, DocViewProperty> props, String[] mixins, String primary) {
        this.name = name;
        this.label = label;
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageInfo.java`
#### Snippet
```java
     * @return the filter
     */
    @NotNull WorkspaceFilter getFilter();

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageInfo.java`
#### Snippet
```java
     * @return the package type
     */
    @NotNull PackageType getPackageType();
}

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageInfo.java`
#### Snippet
```java
     * @return the package id.
     */
    @NotNull PackageId getId();

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @param autoSave if {@code true} the modifications are saved automatically.
     */
    void set(@NotNull String name, boolean value, boolean autoSave);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @param autoSave if {@code true} the modifications are saved automatically.
     */
    void set(@NotNull String name, @Nullable Calendar value, boolean autoSave);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs.
     */
    @NotNull
    MetaInf getMetaInf() throws RepositoryException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @since 2.2
     */
    void setId(@NotNull PackageId id, boolean autoSave);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @return the property value or {@code null} if it does not exist.
     */
    boolean getBoolean(@NotNull String name);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     */
    @Nullable
    String get(@NotNull String name);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurrs
     */
    void dumpCoverage(@NotNull ProgressTrackerListener listener) throws RepositoryException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     */
    @Nullable
    Calendar getCalendar(@NotNull String name);

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackageDefinition.java`
#### Snippet
```java
     * @param autoSave if {@code true} the modifications are saved automatically.
     */
    void set(@NotNull String name, @Nullable String value, boolean autoSave);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/ExecutionPlan.java`
#### Snippet
```java
     * @return the tasks.
     */
    @NotNull
    List<PackageTask> getTasks();

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/ExecutionPlanBuilder.java`
#### Snippet
```java
     * @return this
     */
    @NotNull
    ExecutionPlanBuilder with(@NotNull Set<PackageId> externalPackages);

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/ExecutionPlanBuilder.java`
#### Snippet
```java
     */
    @NotNull
    ExecutionPlanBuilder with(@NotNull Set<PackageId> externalPackages);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/ExecutionPlanBuilder.java`
#### Snippet
```java
     * @throws PackageException if the plan is not valid.
     */
    @NotNull
    Set<PackageId> preview() throws IOException, PackageException;
    
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageTaskBuilder.java`
#### Snippet
```java
     * @return this.
     */
    @NotNull
    PackageTaskBuilder with(@NotNull PackageId id);

```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/RegisteredPackage.java`
#### Snippet
```java
     * @return {@code WorkspaceFilter} of this package
     */
    @NotNull
    WorkspaceFilter getWorkspaceFilter();
    
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/RegisteredPackage.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs
     */
    @NotNull
    PackageProperties getPackageProperties() throws IOException;
    
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @Nullable
    PackageId resolve(@NotNull Dependency dependency, boolean onlyInstalled) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws NoSuchPackageException if the package does not exist
     */
    void remove(@NotNull PackageId id) throws IOException, NoSuchPackageException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws PackageExistsException if the package exists and {@code replace} is {@code false}.
     */
    @NotNull
    PackageId register(@NotNull InputStream in, boolean replace) throws IOException, PackageExistsException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @NotNull
    PackageId register(@NotNull InputStream in, boolean replace) throws IOException, PackageExistsException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @Nullable
    RegisteredPackage open(@NotNull PackageId id) throws IOException;

    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @NotNull
    PackageId[] usage(@NotNull PackageId id) throws IOException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws PackageExistsException if the package exists and {@code replace} is {@code false}.
     */
    @NotNull
    PackageId registerExternal(@NotNull File file, boolean replace) throws IOException, PackageExistsException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @NotNull
    PackageId registerExternal(@NotNull File file, boolean replace) throws IOException, PackageExistsException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs.
     */
    @NotNull
    Set<PackageId> packages() throws IOException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs.
     */
    boolean contains(@NotNull PackageId id) throws IOException;

    /**
```

### NullableProblems
Overridden methods are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     * @throws PackageExistsException if the package exists and {@code replace} is {@code false}.
     */
    @NotNull
    PackageId register(@NotNull File file, boolean replace) throws IOException, PackageExistsException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/PackageRegistry.java`
#### Snippet
```java
     */
    @NotNull
    PackageId register(@NotNull File file, boolean replace) throws IOException, PackageExistsException;

    /**
```

### NullableProblems
Constructor parameter for @NotNull field might be annotated @NotNull itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
    private final IdConflictPolicy defaultIdConflictPolicy;

    public AbstractPackageRegistry(SecurityConfig securityConfig, boolean isStrictByDefault,
            boolean overwritePrimaryTypesOfFoldersByDefault, IdConflictPolicy defaultIdConflictPolicy) {
        if (securityConfig != null) {
```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
public interface InternalPackageRegistry extends PackageRegistry {

    void installPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts,
            boolean extract) throws IOException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
public interface InternalPackageRegistry extends PackageRegistry {

    void installPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts,
            boolean extract) throws IOException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
public interface InternalPackageRegistry extends PackageRegistry {

    void installPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts,
            boolean extract) throws IOException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
            boolean extract) throws IOException, PackageException;

    void uninstallPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts)
            throws IOException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
            boolean extract) throws IOException, PackageException;

    void uninstallPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts)
            throws IOException, PackageException;

```

### NullableProblems
Overridden method parameters are not annotated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/InternalPackageRegistry.java`
#### Snippet
```java
            boolean extract) throws IOException, PackageException;

    void uninstallPackage(@NotNull Session session, @NotNull RegisteredPackage pkg, @NotNull ImportOptions opts)
            throws IOException, PackageException;

```

### NullableProblems
Getter for @NotNull field might be annotated @NotNull itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    }

    public FSPackageStatus getStatus() {
        return status;
    }
```

### NullableProblems
Getter for @NotNull field might be annotated @NotNull itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    }

    public Path getFilePath() {
        return filePath;
    }
```

### NullableProblems
Getter for @NotNull field might be annotated @NotNull itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    }

    public PackageId getPackageId() {
        return packageId;
    }
```

### NullableProblems
Getter for @Nullable field might be annotated @Nullable itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
     * {@inheritDoc}
     */
    public Node getNode() {
        return node;
    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckout.java`
#### Snippet
```java
        }
        if (!localFile.exists()) {
            localFile.mkdir();
        }

```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdGet.java`
#### Snippet
```java
            long lastMod = remote.lastModified();
            if (lastMod > 0) {
                local.setLastModified(lastMod);
            }
        } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExport.java`
#### Snippet
```java
            if (type.equals("platform")) {
                if (!localFile.exists()) {
                    localFile.mkdirs();
                }
                exporter = new PlatformExporter(localFile);
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
        }
        if (!localFile.exists()) {
            localFile.mkdir();
        }
        VltContext vCtx = app.createVaultContext(localFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
            if (type.equals("platform")) {
                if (!localFile.exists()) {
                    localFile.mkdirs();
                }
                exporter = new PlatformExporter(localFile);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
        long lastMod = remoteFile.lastModified();
        if (lastMod > 0) {
            localFile.setLastModified(lastMod);
        }
        if (digest != null) {
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/PlatformExporter.java`
#### Snippet
```java
        }
        if (a.getLastModified() >= 0) {
            local.setLastModified(a.getLastModified());
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/PlatformExporter.java`
#### Snippet
```java

    private void mkdirs(File dir) throws IOException {
        dir.mkdirs();
        exportInfo.update(ExportInfo.Type.MKDIR, dir.getPath());
    }
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
            // copy value to temp file
            tmpFile = File.createTempFile("jcrfs", "dat");
            tmpFile.setLastModified(getLastModified());
            tmpFile.deleteOnExit();
            try (FileOutputStream out = new FileOutputStream(tmpFile);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
        File configDir = new File(userHome, DIR_NAME);
        if (!configDir.exists()) {
            configDir.mkdirs();
            if (!configDir.exists()) {
                throw new IOException("Error: Unable to create " + configDir.getAbsolutePath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
    public void create() throws IOException {
        if (!jcrRoot.isDirectory()) {
            jcrRoot.mkdirs();
            if (!jcrRoot.isDirectory()) {
                throw new IOException("Unable to create " + jcrRoot.getAbsolutePath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
        }
        if (!metaDir.isDirectory()) {
            metaDir.mkdirs();
            if (!metaDir.isDirectory()) {
                throw new IOException("Unable to create " + metaDir.getAbsolutePath());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/FileInputSource.java`
#### Snippet
```java
     */
    public void discard() {
        file.delete();
        file.deleteOnExit();
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/TempFileInputStream.java`
#### Snippet
```java
        super.close();
        if (file != null) {
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `JcrPackageManagerImpl.getInternalRegistry()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
            // re-add all the packages in /etc/packages
            for (Map.Entry<PackageId, String> pkg : subPackages.entrySet()) {
                mgr.getInternalRegistry();
                String path = DEFAULT_PACKAGE_ROOT_PATH + "/" + AbstractPackageRegistry.getRelativeInstallationPath(pkg.getKey()) + ".zip";
                newFilter.add(new PathFilterSet(path));
```

### IgnoreResultOfCall
Result of `JcrPackageManagerImpl.getInternalRegistry()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
                    continue;
                }
                mgr.getInternalRegistry();
                String etcPath = DEFAULT_PACKAGE_ROOT_PATH + "/" + AbstractPackageRegistry.getRelativeInstallationPath(pkg.getKey()) + ".zip";
                etcPath = Text.getRelativeParent(etcPath, 1);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        // copy and delete files
        FileUtils.copyFile(fileMine, work);
        fileMine.delete();
        new File(dir, theirs.getName()).delete();
        new File(dir, base.getName()).delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        FileUtils.copyFile(fileMine, work);
        fileMine.delete();
        new File(dir, theirs.getName()).delete();
        new File(dir, base.getName()).delete();

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        fileMine.delete();
        new File(dir, theirs.getName()).delete();
        new File(dir, base.getName()).delete();

        // remove infos
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        // delete the .x files
        if (mine != null) {
            new File(fileWork.getParentFile(), mine.getName()).delete();
        }
        if (theirs != null) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        }
        if (theirs != null) {
            new File(fileWork.getParentFile(), theirs.getName()).delete();
        }
        if (base != null && base.getName() != null) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        }
        if (base != null && base.getName() != null) {
            new File(fileWork.getParentFile(), base.getName()).delete();
        }
        fileWork.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
            new File(fileWork.getParentFile(), base.getName()).delete();
        }
        fileWork.delete();
        if (base != null) {
            base.setName(null);
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java

        // delete the .x files
        new File(fileWork.getParentFile(), base.getName()).delete();
        new File(fileWork.getParentFile(), mine.getName()).delete();
        new File(fileWork.getParentFile(), theirs.getName()).delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        // delete the .x files
        new File(fileWork.getParentFile(), base.getName()).delete();
        new File(fileWork.getParentFile(), mine.getName()).delete();
        new File(fileWork.getParentFile(), theirs.getName()).delete();

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        new File(fileWork.getParentFile(), base.getName()).delete();
        new File(fileWork.getParentFile(), mine.getName()).delete();
        new File(fileWork.getParentFile(), theirs.getName()).delete();

        // copy the tmp file to the base
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaFile.java`
#### Snippet
```java
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaFile.java`
#### Snippet
```java
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
        }
        return file;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaDir.java`
#### Snippet
```java
    public void create(String path) throws IOException {
        if (!dir.exists()) {
            dir.mkdirs();
            entries = new XmlEntries(path, true);
            sync();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/ZipMetaFile.java`
#### Snippet
```java
            File parentDir = parent.getZip().getZipFile().getParentFile();
            tmpFile = File.createTempFile(".vlt-", ".tmp", parentDir);
            tmpFile.createNewFile();
            copyToSilent(tmpFile, true);
        }
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/ZipMetaFile.java`
#### Snippet
```java
            if (preserveFileDate) {
                ZipEntry entry = parent.getZip().getEntry(relPath);
                file.setLastModified(entry.getTime());
            }
        } finally {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    public void delete() {
        if (file.exists()) {
            file.delete();
        }
        toDelete.clear();
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
                    entry.put(base.copyAs(VltEntryInfo.Type.WORK));
                }
                file.mkdir();
                file.setLastModified(base.getDate());
                VltDirectory dir = new VltDirectory(parent.getContext(), file);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
                }
                file.mkdir();
                file.setLastModified(base.getDate());
                VltDirectory dir = new VltDirectory(parent.getContext(), file);
                if (!dir.isControlled()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
        }
        if (!keepFile) {
            file.delete();
        }
        entry = null;
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
    private void doRevert() throws VltException {
        if (entry.isDirectory()) {
            file.mkdir();
        } else {
            try {
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java

    private void createDirectory(SyncResult res, Entry e) throws RepositoryException {
        e.file.mkdir();
        syncLog.log("A file://%s/", e.getFsPath());
        res.addEntry(e.getJcrPath(), e.getFsPath(), SyncResult.Operation.UPDATE_FS);
```

### IgnoreResultOfCall
Result of `File.setLastModified()` is ignored
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
            if (preserveFileDate) {
                Calendar lastModified = e.node.getProperty("jcr:content/jcr:lastModified").getDate();
                e.file.setLastModified(lastModified.getTimeInMillis());
            }
            syncLog.log("%s file://%s", action, e.file.getAbsolutePath());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
            }
        }
        directory.delete();
        syncLog.log("D file://%s/", directory.getAbsolutePath());
        res.addEntry(jcrPath, directory.getAbsolutePath(), SyncResult.Operation.DELETE_FS);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
                context.getDataFile(config.homePath());
        if (!homeDir.exists()) {
            homeDir.mkdirs();
        }
        log.info("Jackrabbit Filevault FS Package Registry initialized with home location {}", homeDir.getPath());
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
                    if (messages != null && !messages.isEmpty()) {
                        enrichedMessages.addAll(ValidationViolation.wrapMessages(entry.getKey(), messages, filePath, basePath, nodePathAndLineNumber.getKey(),
                                nodePathAndLineNumber.getValue().intValue(), 0));
                    }
                } catch (RuntimeException e) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                            String oldLine;
                            try {
                                int historyIndex = Integer.valueOf(line.substring(1).trim()).intValue();
                                oldLine = (String) reader.getHistory().getHistoryList().get(historyIndex - 1);
                            } catch (Exception e) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/CliHelpFormatter.java`
#### Snippet
```java

    private static int getDefaultWidth() {
        int w = Integer.getInteger(SYS_PROP_TERM_WIDTH, HelpFormatter.DEFAULT_FULL_WIDTH).intValue();
        return Math.max(w, HelpFormatter.DEFAULT_FULL_WIDTH);
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getPomProperties()` is identical to its super method
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
    }

    public PomProperties getPomProperties() {
        return new PomProperties("org.apache.jackrabbit.vault", "vault-cli");
    }
```

### RedundantMethodOverride
Method `toString()` only delegates to its super method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/ParseException.java`
#### Snippet
```java
     * {@inheritDoc}
     */
    public String toString() {
        return super.toString(); // + " (" + systemId + ", line " + lineNumber +", col " + colNumber +")";
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
config.vault_sync_fscheckinterval() \* 1000: integer multiplication implicitly cast to long
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
        syncHandlers = newSyncSpecs.toArray(new SyncHandler[newSyncSpecs.size()]);
        enabled = config.vault_sync_enabled();
        checkDelay = config.vault_sync_fscheckinterval() * 1000;

        log.info("Vault Sync service is {}", enabled ? "enabled" : "disabled");
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.xml.sax.helpers.AttributesImpl;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultAuthConfig.java`
#### Snippet
```java
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import javax.xml.parsers.ParserConfigurationException;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.jackrabbit.vault.fs.api.Artifact;
```

### UNUSED_IMPORT
Unused import `import org.xml.sax.SAXException;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
```

### UNUSED_IMPORT
Unused import `import javax.jcr.Session;`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryCopierMixin.java`
#### Snippet
```java
import java.util.Map;

import javax.jcr.Session;

import javax.jcr.Session;
```

### UNUSED_IMPORT
Unused import `import com.fasterxml.jackson.databind.exc.InvalidFormatException;`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/WorkspaceFilterDeserializer.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class WorkspaceFilterDeserializer extends StdDeserializer<WorkspaceFilter> {
```

### UNUSED_IMPORT
Unused import `import org.xml.sax.helpers.AttributesImpl;`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntryInfo.java`
#### Snippet
```java
import org.apache.jackrabbit.vault.vlt.meta.VltEntryInfo;
import org.w3c.dom.Element;
import org.xml.sax.helpers.AttributesImpl;

/**
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`path = path + "/"` could be simplified to 'path += "/"'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
        } else {
            if (path.charAt(path.length() -1) != '/') {
                path = path + "/";
            }
            int idx1 = -1;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDelete.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force operation to run")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDelete.java`
#### Snippet
```java
                                .withDescription("force operation to run")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to delete")
                                .withMinimum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropList.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropList.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to list the properties from")
                                .withMinimum(1)
                                .create())
                        .create()
                )
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdUpdate.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force overwrite of local files")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdUpdate.java`
#### Snippet
```java
                                .withDescription("force overwrite of local files")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
                                .withLongName("non-recursive")
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdUpdate.java`
#### Snippet
```java
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to update")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withOption(CliCommand.OPT_VERBOSE)
                        .withOption(optCheckOnly = new DefaultOptionBuilder()
                            .withShortName("c")
                            .withLongName("check-only")
                            .withDescription("Only check the format.")
                            .create()
                        )
                        .withOption(optPatterns = new DefaultOptionBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
                            .create()
                        )
                        .withOption(optPatterns = new DefaultOptionBuilder()
                                .withShortName("p")
                                .withLongName("pattern")
                                .withDescription("pattern for recursive format. defaults to match all xml files.")
                                .withArgument(new ArgumentBuilder()
                                        .withMinimum(0)
                                        .withConsumeRemaining("**dummy**")
                                        .create())
                                .create())
                        .withOption(argPaths = new ArgumentBuilder()
                                .withName("paths")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(argPaths = new ArgumentBuilder()
                                .withName("paths")
                                .withDescription("files or directories to format.")
                                .withMinimum(0)
                                .create()
                        )
                        .create())
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsAggregate.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optType = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withDescription("display the artfiact type")
                                .create())
                        .withOption(argPath)
                        .create())
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMount.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withLongName("force")
                                .withDescription("force remount if already mounted")
                                .create())
                        .withOption(optConfigFile = new DefaultOptionBuilder()
                                .withLongName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMount.java`
#### Snippet
```java
                                .withDescription("force remount if already mounted")
                                .create())
                        .withOption(optConfigFile = new DefaultOptionBuilder()
                                .withLongName("file")
                                .withDescription("config.xml for jcrfs")
                                .withArgument(new ArgumentBuilder()
                                        .withName("file")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optFilterFile = new DefaultOptionBuilder()
                                .withLongName("filter")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMount.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optFilterFile = new DefaultOptionBuilder()
                                .withLongName("filter")
                                .withDescription("filter.xml for jcrfs")
                                .withArgument(new ArgumentBuilder()
                                        .withName("filter")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("root")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMount.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("root")
                                .withDescription("the repository path that forms the mount root")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdVaultDebug.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(argCommand = new ArgumentBuilder()
                                .withName("cmd")
                                .withDescription("command")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckout.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force checkout to overwrite local files if they already exist.")
                                .create())
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
```

### NestedAssignment
Result of assignment expression used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
                                boolean isAnotherValidatorInterested = genericJcrDataValidators.values().stream().filter(t-> !t.equals(validator)).anyMatch(x -> x.shouldValidateJcrData(filePath, basePath));
                                if (isAnotherValidatorInterested) {
                                    currentInput = resettableInputStream = new ResettableInputStream(input);
                                }
                            } else {
```

### NestedAssignment
Result of assignment expression used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
                                boolean isAnotherValidatorInterested = genericMetaInfDataValidators.values().stream().filter(t-> !t.equals(validator)).anyMatch(x -> x.shouldValidateMetaInfData(filePath, basePath));
                                if (isAnotherValidatorInterested) {
                                    currentInput = resettableInputStream = new ResettableInputStream(input);
                                }
                            } else {
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImport.java`
#### Snippet
```java
                                .create())
                        */
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImport.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdGet.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withDescription("force overwrite if local file already exists")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcrl-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdGet.java`
#### Snippet
```java
                                .withDescription("force overwrite if local file already exists")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcrl-path")
                                .withDescription("the jcr path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argLocalPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdGet.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRm.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("r")
                                .withDescription("remove the directory artifacts recursively")
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRm.java`
#### Snippet
```java
                                .withDescription("remove the directory artifacts recursively")
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("path")
                                .withDescription("the jcrfs path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExport.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_VERBOSE)
                        .withOption(optType = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withDescription("specifies the export type. either 'platform' or 'jar'.")
                                .withArgument(new ArgumentBuilder()
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optPrune = new DefaultOptionBuilder()
                                .withShortName("P")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExport.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optPrune = new DefaultOptionBuilder()
                                .withShortName("P")
                                .withLongName("prune-missing")
                                .withDescription("specifies if missing local files should be deleted.")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExport.java`
#### Snippet
```java
                                .withDescription("specifies if missing local files should be deleted.")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argLocalPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExport.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argCommand = new ArgumentBuilder()
                                .withName("cmd")
                                .withDescription("the sub command")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argArgs = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argArgs = new ArgumentBuilder()
                                .withName("args")
                                .withDescription("command arguments")
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force checkout to overwrite local files if they already exist.")
                                .create())
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optFilter = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withLongName("filter")
                                .withDescription("specifies auto filters if none defined.")
                                .withArgument(new ArgumentBuilder()
                                        .withName("file")
                                        .withMaximum(1)
                                        .withMinimum(1)
                                        .create())
                                .create())
                        .withOption(argMountpoint)
                        .withOption(argJcrPath)
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSave.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCat.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdTree.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("r")
                                .withDescription("limit depth")
                                .withArgument(new ArgumentBuilder()
                                        .withName("depth")
                                        .withDescription("limit tree to <depth>")
                                        .withMinimum(1)
                                        .withMaximum(1)
                                        .withValidator(NumberValidator.getIntegerInstance())
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                        .withName("path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdTree.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                        .withName("path")
                                        .withDescription("the path of the tree")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                        .create())
                .create();
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPut.java`
#### Snippet
```java
                                        .create())
                                */
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPut.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcrl-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRefresh.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optKeepChanges = new DefaultOptionBuilder()
                                .withShortName("k")
                                .withDescription("keep changes")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRefresh.java`
#### Snippet
```java
                                .withDescription("keep changes")
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdConnect.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withDescription("force reconnect if already connected")
                                .create())
                        .withOption(argURI = new ArgumentBuilder()
                                .withName("rmiuri")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdConnect.java`
#### Snippet
```java
                                .withDescription("force reconnect if already connected")
                                .create())
                        .withOption(argURI = new ArgumentBuilder()
                                .withName("rmiuri")
                                .withDescription("the rmi uri of the repository")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsJcrFs.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optTime = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withDescription("display the last modification date")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("s")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsJcrFs.java`
#### Snippet
```java
                                .withDescription("display the last modification date")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("s")
                                .withDescription("display the file size")
                                .create())
                        .withOption(optMime = new DefaultOptionBuilder()
                                .withShortName("m")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsJcrFs.java`
#### Snippet
```java
                                .withDescription("display the file size")
                                .create())
                        .withOption(optMime = new DefaultOptionBuilder()
                                .withShortName("m")
                                .withDescription("display the mime type")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsJcrFs.java`
#### Snippet
```java
                                .withDescription("display the mime type")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
                                .withDescription("combines all format flags")
                                .create())
                        .withOption(argPath)
                        .create())
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropGet.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argPropName = new ArgumentBuilder()
                                .withName("propname")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropGet.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argPropName = new ArgumentBuilder()
                                .withName("propname")
                                .withDescription("the property name")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropGet.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to get the property from")
                                .withMinimum(1)
                                .create())
                        .create()
                )
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdInfo.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("operate recursive")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdInfo.java`
#### Snippet
```java
                                .withDescription("operate recursive")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to display info")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdAdd.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
                                .withLongName("non-recursive")
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdAdd.java`
#### Snippet
```java
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force operation to run")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdAdd.java`
#### Snippet
```java
                                .withDescription("force operation to run")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("local file or directory to add")
                                .withMinimum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropSet.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argPropName = new ArgumentBuilder()
                                .withName("propname")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropSet.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argPropName = new ArgumentBuilder()
                                .withName("propname")
                                .withDescription("the property name")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create())
                        .withOption(argPropValue = new ArgumentBuilder()
                                .withName("propval")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropSet.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argPropValue = new ArgumentBuilder()
                                .withName("propval")
                                .withDescription("the property value")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropSet.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to set the property to")
                                .withMinimum(1)
                                .create())
                        .create()
                )
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_VERBOSE)
                        .withOption(optType = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withLongName("type")
                                .withDescription("specifies the export type. either 'platform' or 'jar'.")
                                .withArgument(new ArgumentBuilder()
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optPrune = new DefaultOptionBuilder()
                                .withShortName("p")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optPrune = new DefaultOptionBuilder()
                                .withShortName("p")
                                .withLongName("prune-missing")
                                .withDescription("specifies if missing local files should be deleted.")
                                .create())
                        .withOption(argMountpoint = new ArgumentBuilder()
                                .withName("uri")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
                                .withDescription("specifies if missing local files should be deleted.")
                                .create())
                        .withOption(argMountpoint = new ArgumentBuilder()
                                .withName("uri")
                                .withDescription("mountpoint uri")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create())
                        .create()
                )
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdResolved.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdResolved.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("resolve even if contains conflict markers")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdResolved.java`
#### Snippet
```java
                                .withDescription("resolve even if contains conflict markers")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to resolve")
                                .withMinimum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSync.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_VERBOSE)
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force certain commands to execute.")
                                .create())
                        .withOption(optUri = new DefaultOptionBuilder()
                            .withShortName("u")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSync.java`
#### Snippet
```java
                                .withDescription("force certain commands to execute.")
                                .create())
                        .withOption(optUri = new DefaultOptionBuilder()
                            .withShortName("u")
                            .withLongName("uri")
                            .withDescription("Specifies the URI of the sync host.")
                            .withArgument(new ArgumentBuilder()
                                    .withName("uri")
                                    .withMaximum(1)
                                    .withMinimum(1)
                                    .create())
                            .create())
                        .withOption(argCommand)
                        .withOption(argLocalPath)
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("r")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("b")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("b")
                                .withLongName("batchSize")
                                .withDescription("number of nodes until intermediate save")
                                .withArgument(new ArgumentBuilder()
                                        .withName("size")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optThrottle = new DefaultOptionBuilder()
                                .withShortName("t")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optThrottle = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withLongName("throttle")
                                .withDescription("number of seconds to wait after an intermediate save")
                                .withArgument(new ArgumentBuilder()
                                        .withName("seconds")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optResumeFrom = new DefaultOptionBuilder()
                                .withShortName("R")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optResumeFrom = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("resume")
                                .withDescription("source path to resume operation after a restart")
                                .withArgument(new ArgumentBuilder()
                                        .withName("path")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optUpdate = new DefaultOptionBuilder()
                                .withShortName("u")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optUpdate = new DefaultOptionBuilder()
                                .withShortName("u")
                                .withLongName("update")
                                .withDescription("overwrite/delete existing nodes.")
                                .create())
                        .withOption(optNewer = new DefaultOptionBuilder()
                                .withShortName("n")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                .withDescription("overwrite/delete existing nodes.")
                                .create())
                        .withOption(optNewer = new DefaultOptionBuilder()
                                .withShortName("n")
                                .withLongName("newer")
                                .withDescription("respect lastModified properties for update.")
                                .create())
                        .withOption(optExclude = new DefaultOptionBuilder()
                                .withShortName("e")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                .withDescription("respect lastModified properties for update.")
                                .create())
                        .withOption(optExclude = new DefaultOptionBuilder()
                                .withShortName("e")
                                .withLongName("exclude")
                                .withDescription("regexp of excluded source paths.")
                                .withArgument(new ArgumentBuilder()
                                        .withMinimum(0)
                                        .create())
                                .create())
                        .withOption(optNoOrdering = new DefaultOptionBuilder()
                                .withLongName("no-ordering")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optNoOrdering = new DefaultOptionBuilder()
                                .withLongName("no-ordering")
                                .withDescription("disable node ordering for updated content")
                                .create())
                        .withOption(srcAddr = new ArgumentBuilder()
                                .withName("src")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                .withDescription("disable node ordering for updated content")
                                .create())
                        .withOption(srcAddr = new ArgumentBuilder()
                                .withName("src")
                                .withDescription("the repository address of the source tree")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(dstAddr = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRcp.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(dstAddr = new ArgumentBuilder()
                                .withName("dst")
                                .withDescription("the repository address of the destination node")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optNodeType = new DefaultOptionBuilder()
                                .withShortName("n")
                                .withDescription("display the node type of the nodes")
                                .create())
                        .withOption(optUUID = new DefaultOptionBuilder()
                                .withShortName("u")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
                                .withDescription("display the node type of the nodes")
                                .create())
                        .withOption(optUUID = new DefaultOptionBuilder()
                                .withShortName("u")
                                .withDescription("display the uuid of the referenceable nodes")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
                                .withDescription("display the uuid of the referenceable nodes")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
                                .withDescription("combines the flags 'n' and 'u'")
                                .create())
                        .withOption(argPath)
                        .create())
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdInvalidate.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDiff.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
                                .withLongName("non-recursive")
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDiff.java`
#### Snippet
```java
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to display the diffs from")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdStatus.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_VERBOSE)
                        .withOption(optOnlyControlled = new DefaultOptionBuilder()
                                .withShortName("q")
                                .withLongName("quiet")
                                .withDescription("show only status of controlled files")
                                .create())
                        .withOption(optShowUpdate = new DefaultOptionBuilder()
                                .withShortName("u")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdStatus.java`
#### Snippet
```java
                                .withDescription("show only status of controlled files")
                                .create())
                        .withOption(optShowUpdate = new DefaultOptionBuilder()
                                .withShortName("u")
                                .withLongName("show-update")
                                .withDescription("display update information")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdStatus.java`
#### Snippet
```java
                                .withDescription("display update information")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
                                .withLongName("non-recursive")
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdStatus.java`
#### Snippet
```java
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to display the status")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLogin.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optCreds = new DefaultOptionBuilder()
                                .withShortName("c")
                                .withLongName("credentials")
                                .withDescription("simple connection credentials")
                                .withArgument(new ArgumentBuilder()
                                        .withName("user:pass")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withShortName("f")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLogin.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withLongName("force")
                                .withDescription("force relogin if already logged in")
                                .create())
                        .withOption(argWorkspace = new ArgumentBuilder()
                                        .withName("workspace")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLogin.java`
#### Snippet
```java
                                .withDescription("force relogin if already logged in")
                                .create())
                        .withOption(argWorkspace = new ArgumentBuilder()
                                        .withName("workspace")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                                .create())
                        .create();
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optConfig = new DefaultOptionBuilder()
                                .withShortName("c")
                                .withLongName("config")
                                .withDescription("writes the config to the local file")
                                .create())
                        .withOption(optFilter = new DefaultOptionBuilder()
                                .withShortName("f")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
                                .withDescription("writes the config to the local file")
                                .create())
                        .withOption(optFilter = new DefaultOptionBuilder()
                                .withShortName("f")
                                .withLongName("filter")
                                .withDescription("writes the workspace filter to the local file")
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
                                .withDescription("writes the workspace filter to the local file")
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                .withName("path")
                                .withDescription("the path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create())
                        .create())
                .create();
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCommit.java`
#### Snippet
```java
                        .withOption(OPT_VERBOSE)
                        .withOption(OPT_QUIET)
                        .withOption(optForce = new DefaultOptionBuilder()
                                .withLongName("force")
                                .withDescription("force comitting even if remote is modified")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCommit.java`
#### Snippet
```java
                                .withDescription("force comitting even if remote is modified")
                                .create())
                        .withOption(optNonRecursive = new DefaultOptionBuilder()
                                .withShortName("N")
                                .withLongName("non-recursive")
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCommit.java`
#### Snippet
```java
                                .withDescription("operate on single directory")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to commit")
                                .withMinimum(0)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_VERBOSE)
                        .withOption(optSync = new DefaultOptionBuilder()
                                .withShortName("s")
                                .withLongName("sync")
                                .withDescription("put local files under vault control.")
                                .create())
                        .withOption(optSysView = new DefaultOptionBuilder()
                                .withLongName("sysview")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java
                                .withDescription("put local files under vault control.")
                                .create())
                        .withOption(optSysView = new DefaultOptionBuilder()
                                .withLongName("sysview")
                                .withDescription("specifies that the indicated local file has the sysview format")
                                .create())
                        .withOption(argMountpoint = new ArgumentBuilder()
                                .withName("uri")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java
                                .withDescription("specifies that the indicated local file has the sysview format")
                                .create())
                        .withOption(argMountpoint = new ArgumentBuilder()
                                .withName("uri")
                                .withDescription("mountpoint uri")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java
                                .withMaximum(1)
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("local-path")
                                .withDescription("the local path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdImportCli.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRevert.java`
#### Snippet
```java
                        .withName("Options:")
                        .withOption(OPT_QUIET)
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("R")
                                .withLongName("recursive")
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRevert.java`
#### Snippet
```java
                                .withDescription("descend recursively")
                                .create())
                        .withOption(argLocalPath = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("file or directory to revert")
                                .withMinimum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optAdd = new DefaultOptionBuilder()
                                .withShortName("a")
                                .withLongName("add")
                                .withDescription("adds a mixin")
                                .withArgument(new ArgumentBuilder()
                                        .withName("nodetype")
                                        .withMinimum(1)
                                        .create())
                                .create())
                        .withOption(optRemove = new DefaultOptionBuilder()
                                .withShortName("r")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(optRemove = new DefaultOptionBuilder()
                                .withShortName("r")
                                .withLongName("remove")
                                .withDescription("removes a mixin")
                                .withArgument(new ArgumentBuilder()
                                        .withName("nodetype")
                                        .withMinimum(1)
                                        .create())
                                .create())

                        .withOption(argJcrPath = new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                                .create())

                        .withOption(argJcrPath = new ArgumentBuilder()
                                .withName("jcr-path")
                                .withDescription("the jcr path")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdConsole.java`
#### Snippet
```java
                                .withLongName("console-settings")
                                .withDescription("specifies the console settings file. default is \"" + AbstractApplication.DEFAULT_CONF_FILENAME + "\"")
                                .withArgument(argFile = new ArgumentBuilder()
                                .withName("file")
                                .withMinimum(1)
                                .withMaximum(1)
                                .withValidator(FileValidator.getExistingFileInstance())
                                .create())
                                .create()
                                )
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdHelp.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argCommand = new ArgumentBuilder()
                                .withName("command")
                                .withDescription("prints the help for the given command")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdExec.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argMacro = new ArgumentBuilder()
                                .withName("macro")
                                .withDescription(
                                        "specifies the command stored in the environment property" +
                                        " 'macro.<macro>'.")
                                .withMinimum(1)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdLoad.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argFile = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("specifies the config file. default is \"" + AbstractApplication.DEFAULT_CONF_FILENAME + "\"")
                                .withMinimum(0)
                                .withMaximum(1)
                                .withValidator(FileValidator.getExistingFileInstance())
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdCtx.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argContext = new ArgumentBuilder()
                                .withName("context")
                                .withDescription("change to the given context. if empty display list.")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdStore.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argFile = new ArgumentBuilder()
                                .withName("file")
                                .withDescription("specifies the config file. default is \"" + AbstractApplication.DEFAULT_CONF_FILENAME + "\"")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdSet.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argKey= new ArgumentBuilder()
                                .withName("key")
                                .withDescription("name of the property")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .withOption(argValue= new ArgumentBuilder()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdSet.java`
#### Snippet
```java
                                .create()
                        )
                        .withOption(argValue= new ArgumentBuilder()
                                .withName("value")
                                .withDescription("value of the property. " +
                                        "If empty the property will be deleted")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdCd.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argPath = new ArgumentBuilder()
                                        .withName("path")
                                        .withDescription("destination path. changes to root directory if missing.")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                        .create())
                .create();
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/examples/CmdHello.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(argName = new ArgumentBuilder()
                                .withName("name")
                                .withDescription("print this name. default is 'world'")
                                .withMinimum(0)
                                .withMaximum(1)
                                .create()
                        )
                        .create()
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                .withChildren(new GroupBuilder()
                        .withName("Options:")
                        .withOption(optAll = new DefaultOptionBuilder()
                                .withShortName("a")
                                .withDescription("display hidden files")
                                .create())
                        .withOption(optTime = new DefaultOptionBuilder()
                                .withShortName("t")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                                .withDescription("display hidden files")
                                .create())
                        .withOption(optTime = new DefaultOptionBuilder()
                                .withShortName("t")
                                .withDescription("display the last modification date")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("s")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                                .withDescription("display the last modification date")
                                .create())
                        .withOption(optSize = new DefaultOptionBuilder()
                                .withShortName("s")
                                .withDescription("display the file size")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                                .withDescription("display the file size")
                                .create())
                        .withOption(optLong = new DefaultOptionBuilder()
                                .withShortName("l")
                                .withDescription("combines the flags 't' and 's'")
                                .create())
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("r")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                                .withDescription("combines the flags 't' and 's'")
                                .create())
                        .withOption(optRecursive = new DefaultOptionBuilder()
                                .withShortName("r")
                                .withDescription("do a recursive listing")
                                .withArgument(new ArgumentBuilder()
                                        .withName("depth")
                                        .withDescription("the depth of the recursion.")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .withValidator(NumberValidator.getIntegerInstance())
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                        .withName("path")
```

### NestedAssignment
Result of assignment expression used
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
                                        .create())
                                .create())
                        .withOption(argPath = new ArgumentBuilder()
                                        .withName("path")
                                        .withDescription("the path to list")
                                        .withMinimum(0)
                                        .withMaximum(1)
                                        .create())
                        .create())
                .create();
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
                        byte[] buffer = new byte[8192];
                        int read;
                        while ((read = in.read(buffer)) >= 0) {
                            out.write(buffer, 0, read);
                        }
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
        ZipEntry entry;
        boolean hasRoot = false;
        while ((entry = zin.getNextEntry()) != null) {
            String name = entry.getName();
            boolean isMeta = name.startsWith(Constants.META_DIR + "/");
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        int read;
        int total = 0;
        while ((read = in.read(buffer)) > 0) {
            raf.write(buffer, 0, read);
            total += read;
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        int read;
        int total = 0;
        while ((read = in.read(decompressed, pos, decompressed.length - pos)) > 0) {
            total += read;
            pos += read;
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        try (ZipInputStream zin = new ZipInputStream(in)) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                String name = entry.getName();
                String[] names = Text.explode(name, '/');
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        if (pathMapping != null) {
            filter = filter.translate(pathMapping);
            this.archive = archive = new MappedArchive(archive, pathMapping);
            this.archive.open(true);
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AbstractArtifact.java`
#### Snippet
```java
            byte[] buffer = new byte[8192];
            int read;
            while ((read = in.read(buffer)) >= 0) {
                out.write(buffer, 0, read);
            }
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/NodeStash.java`
#### Snippet
```java
                try {
                    Node root = session.getNode(rootPath);
                    return tmpNode = root.addNode("tmp" + System.currentTimeMillis(), JcrConstants.NT_UNSTRUCTURED);
                } catch (RepositoryException e) {
                    log.debug("unable to create temporary stash location below {}.", rootPath);
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
                    if (ret == 0 && pos == end) {
                        // in this case we didn't get more, so flush
                        pos = end = 0;
                        continue;
                    } else if (ret == -1) {
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/SHA1.java`
#### Snippet
```java
        byte[] buffer = new byte[8192];
        int read;
        while ((read = in.read(buffer)) > 0) {
            md.update(buffer, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MD5.java`
#### Snippet
```java
        byte[] buffer = new byte[8192];
        int read;
        while ((read = in.read(buffer)) > 0) {
            md.update(buffer, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java

        // add snipples
        while ((pos = str.indexOf(ch, lastpos)) >= 0) {
            if (pos - lastpos > 0 || respectEmpty) {
                strings.add(str.substring(lastpos, pos));
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        boolean contained;
        if ((contained = contains(path)) || isAncestor(path)) {
            if (contained) {
                tracker.track("A", path);
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
     */
    public void load(final InputStream in) throws IOException, ConfigurationException {
        byte[] tmpSource = source = IOUtils.toByteArray(in);
        try (InputStream inCopy = getSource()) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
                groupId = name.substring(0, idx);
                name = name.substring(idx + 1);
            } else if ((idx = groupId.lastIndexOf('/')) >=0 && isVersion) {
                groupId = segs[0].substring(0, idx);
                name = segs[0].substring(idx + 1);
```

### NestedAssignment
Result of assignment expression used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
                        throw new CyclicDependencyException();
                    } else if (res == null) {
                        result.put(id, res = false);
                    }
                    resolve(entry.getValue(), list, result);
```

### NestedAssignment
Result of assignment expression used
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntries.java`
#### Snippet
```java
        for (VltEntry e: entries.values()) {
            if (e.isDirty()) {
                return dirty = true;
            }
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        for (VltEntryInfo info: infos.values()) {
            if (((XmlEntryInfo) info).isDirty()) {
                return dirty = true;
            }
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
        byte[] buffer = new byte[8192];
        int read;
        while ((read = in.read(buffer)) >= 0) {
            out.write(buffer, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = in.readLine()) != null) {
                    if (line.startsWith(Hunk3.MARKER_B[0])
                            || line.startsWith(Hunk3.MARKER_L[0])
```

### NestedAssignment
Result of assignment expression used
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
        lines.clear();
        String line;
        while ((line = br.readLine()) != null) {
            Line l = new Line(line, lineNo++);
            lines.put(l.name, l);
```

### NestedAssignment
Result of assignment expression used
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
        String action = "A";
        if (ntFile == null) {
            e.node = ntFile = e.parentNode.addNode(e.jcrName, NodeType.NT_FILE);
            content = ntFile.addNode(Node.JCR_CONTENT, NodeType.NT_RESOURCE);
        } else {
```

### NestedAssignment
Result of assignment expression used
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
        StringBuffer word = new StringBuffer();
        int c;
        while ((c=r.read()) >=0 && lines.size()<MAX_ELEMENTS) {
            if (Character.isLetterOrDigit((char) c)) {
                if (gutter.length() > 0) {
```

### NestedAssignment
Result of assignment expression used
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java

            // add the change to the using set and unchain it
            using[highIdx] = lastUsing[highIdx] = changes[highIdx];
            changes[highIdx] = changes[highIdx].next;
            lastUsing[highIdx].next = null;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `processedInfos` are updated, but never queried
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     * list of processed tx infos since the last auto save.
     */
    private final List<TxInfo> processedInfos = new ArrayList<TxInfo>();

    /**
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `isAtStart` is accessed in both synchronized and unsynchronized contexts
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ResettableInputStream.java`
#### Snippet
```java
    private final OutputStream tmpOutputStream ;
    private InputStream currentInput; // might already point to a buffered one
    private boolean isAtStart;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentInput` is accessed in both synchronized and unsynchronized contexts
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ResettableInputStream.java`
#### Snippet
```java
    private final Path tmpFile;
    private final OutputStream tmpOutputStream ;
    private InputStream currentInput; // might already point to a buffered one
    private boolean isAtStart;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pos` is accessed in both synchronized and unsynchronized contexts
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
    private class RafInputStream extends InputStream {

        private long pos;

        private long end;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `stream` is accessed in both synchronized and unsynchronized contexts
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
    private class PVAInputStream extends InputStream {

        private InputStream stream;

        private boolean closed;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `pathIdMapping` is accessed in both synchronized and unsynchronized contexts
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java
     * Contains a map of all filesystem paths to package IDs
     */
    private Map<Path, PackageId> pathIdMapping = new ConcurrentHashMap<>();

    private final Path homeDir;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `isInitialized` is accessed in both synchronized and unsynchronized contexts
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java

    private final Map<PackageId, FSInstallState> cache = new ConcurrentHashMap<>();
    private boolean isInitialized = false;

    /**
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`v >>> 0` can be replaced with 'v'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MD5.java`
#### Snippet
```java
        b[offs+5] = (byte) ((v >>> 16) & 0xFF);
        b[offs+6] = (byte) ((v >>>  8) & 0xFF);
        b[offs+7] = (byte) ((v >>>  0) & 0xFF);
    }

```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/WorkspaceFilterDeserializer.java`
#### Snippet
```java

    @Override
    public WorkspaceFilter deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (p.nextValue() != JsonToken.VALUE_STRING) {
            throw new JsonParseException("Expected string value", p.getCurrentLocation());
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaData.java`
#### Snippet
```java
    @NotNull Collection<@NotNull ? extends JcrNodeTypeMetaData> getChildren();
    Optional<JcrNodeTypeMetaData> getNode(NamePathResolver nameResolver, String path)
            throws ItemNotFoundException, RepositoryException;
    @NotNull JcrNodeTypeMetaData getOrCreateNode(NamePathResolver nameResolver, @NotNull NodeContext nodeContext, String path) throws RepositoryException;
    
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaData.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider,
            @NotNull NodeContext nodeContext, @NotNull String primaryType, String... mixinTypes)
                    throws RepositoryException, NamespaceExceptionInNodeName;
    @NotNull JcrNodeTypeMetaData addUnknownChildNode(@NotNull NameResolver nameResolver, @NotNull NodeContext nodeContext, @NotNull String name) throws IllegalNameException, NamespaceException;
    
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    }

    private void persistTasks(Dictionary<String, Object> configProperties, File dataFile) throws RepositoryException, JsonGenerationException, JsonMappingException, IOException {
        serializedTasks = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tasks);
        configProperties.put(PROP_TASKS_SERIALIZATION, serializedTasks);
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    }

    private void persistTasks(Dictionary<String, Object> configProperties, File dataFile) throws RepositoryException, JsonGenerationException, JsonMappingException, IOException {
        serializedTasks = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tasks);
        configProperties.put(PROP_TASKS_SERIALIZATION, serializedTasks);
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider,
            @NotNull NodeContext nodeContext, @NotNull String primaryType, String... mixinTypes)
            throws IllegalNameException, RepositoryException, NamespaceExceptionInNodeName {

        List<Name> types = getTypes(nameResolver, primaryType, mixinTypes);
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider,
            @NotNull NodeContext nodeContext, @NotNull String primaryType, String... mixinTypes)
            throws IllegalNameException, RepositoryException, NamespaceExceptionInNodeName {

        List<Name> types = getTypes(nameResolver, primaryType, mixinTypes);
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.NamespaceException', in the throws list already.
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider,
            boolean isImplicit, @NotNull NodeContext context, @NotNull String name, @Nullable Name... nodeTypes)
            throws ConstraintViolationException, NoSuchNodeTypeException, NamespaceExceptionInNodeName, NamespaceException,
            IllegalNameException {

```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java
    }

    public void registerNodeTypes(Reader reader) throws InvalidNodeTypeDefinitionException, NodeTypeExistsException, UnsupportedRepositoryOperationException, ParseException, RepositoryException, IOException {
        CndImporter.registerNodeTypes(reader, null, nodeTypeManager, namespaceRegistry, getJcrValueFactory(), false);
    }
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java
    }

    public void registerNodeTypes(Reader reader) throws InvalidNodeTypeDefinitionException, NodeTypeExistsException, UnsupportedRepositoryOperationException, ParseException, RepositoryException, IOException {
        CndImporter.registerNodeTypes(reader, null, nodeTypeManager, namespaceRegistry, getJcrValueFactory(), false);
    }
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java
    }

    public void registerNodeTypes(Reader reader) throws InvalidNodeTypeDefinitionException, NodeTypeExistsException, UnsupportedRepositoryOperationException, ParseException, RepositoryException, IOException {
        CndImporter.registerNodeTypes(reader, null, nodeTypeManager, namespaceRegistry, getJcrValueFactory(), false);
    }
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
    }

    private boolean applyBinary(@NotNull Node node, @Nullable Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.size());
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
    }

    private boolean applyBinary(@NotNull Node node, @Nullable Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.size());
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
    }

    private boolean applyBinary(@NotNull Node node, @Nullable Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.size());
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
    }

    private boolean applyBinary(@NotNull Node node, @Nullable Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.size());
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
    }

    private boolean applyBinary(Node node, Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.length);
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
    }

    private boolean applyBinary(Node node, Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.length);
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
    }

    private boolean applyBinary(Node node, Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.length);
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
    }

    private boolean applyBinary(Node node, Value... existingValues) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<Value> binaryValues = new ArrayList<>(values.length);
        if (!isReferenceProperty) {
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageProperties.java`
#### Snippet
```java
    }

    protected static Properties getPropertiesMap(InputStream input) throws InvalidPropertiesFormatException, IOException {
        Properties propertyMap = new Properties();
        propertyMap.loadFromXML(new CloseShieldInputStream(input));
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static void saveRules(Node setNode, List<FilterSet.Entry<PathFilter>> entries, String propertyName) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<String> rules = new LinkedList<>();
        for (FilterSet.Entry<PathFilter> e: entries) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static void saveRules(Node setNode, List<FilterSet.Entry<PathFilter>> entries, String propertyName) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<String> rules = new LinkedList<>();
        for (FilterSet.Entry<PathFilter> e: entries) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static void saveRules(Node setNode, List<FilterSet.Entry<PathFilter>> entries, String propertyName) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<String> rules = new LinkedList<>();
        for (FilterSet.Entry<PathFilter> e: entries) {
```

### DuplicateThrows
There is a more general exception, 'javax.jcr.RepositoryException', in the throws list already.
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static void saveRules(Node setNode, List<FilterSet.Entry<PathFilter>> entries, String propertyName) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<String> rules = new LinkedList<>();
        for (FilterSet.Entry<PathFilter> e: entries) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `value` initializer `""` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
                "                                                             "+
                "                                                             ";
        String value="";

        private boolean alignRight;
```

### UnusedAssignment
Variable `lineFeed` initializer `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
    private final MessageDigest digest;

    private byte[] lineFeed = null;

    private MD5 md5 = null;
```

### UnusedAssignment
Variable `cacheMetaOnly` initializer `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
    private final DefaultMetaInf inf;

    private boolean cacheMetaOnly = false;

    /**
```

### UnusedAssignment
The value `true` assigned to `isPropertyFilter` is never used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
            boolean isPropertyFilter = false;
            if (filter.getName().startsWith("p")) {
                isPropertyFilter = true;
            }
            String mode = filter.hasProperty(JcrPackageDefinitionImpl.PN_MODE)
```

### UnusedAssignment
Variable `temp` initializer `null` is redundant
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
                : LineOutputStream.LS_NATIVE;
        VaultFileCopy copy;
        File temp = null;
        try {
            temp = tmpFile.openTempFile();
```

### UnusedAssignment
Variable `type` initializer `SerializationType.UNKOWN` is redundant
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
    public static SerializationType analyze(InputSource source) throws IOException {
        Reader r = source.getCharacterStream();
        SerializationType type = SerializationType.UNKOWN;
        if (r == null) {
            if (source.getEncoding() == null) {
```

### UnusedAssignment
The value `lines1.length` assigned to `end1` is never used
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                    if (c.line0 <= end0) {
                        end0 = lines0.length;
                        end1 = lines1.length;
                        c = c.nextChange;
                    } else {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
        String cmd = data.optString(PARAM_CMD, "");
        RcpTask task;
        final String id = data.optString(PARAM_ID, null);;
        try {
            // --------------------------------------------------------------------------------------------< create >---
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileInputStream.java`
#### Snippet
```java
        base.close();
        if (tmpFile != null) {
            Files.delete(tmpFile);;
            tmpFile = null;
        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @throws IOException
     */
    default void endDocument() throws RepositoryException, IOException {};

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param uri the namespace uri
     */
    default void startPrefixMapping(String prefix, String uri) {};

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param prefix the namespace prefix
     */
    default void endPrefixMapping(String prefix) {};

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param nameResolver the resolver aware of all namespaces and their prefixes defined in the underlying XML document.
     */
    default void setNameResolver(NameResolver nameResolver) {};
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ImportInfo.java`
#### Snippet
```java
    default void onStashed(String path) {
        // by default do nothing
    };

    /**
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerImpl.java`
#### Snippet
```java
            isTmp = true;
        }
        try (OutputStream out = FileUtils.openOutputStream(file);){
            rewrap(opts, src, out);
            success = true;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
        public void print(StringBuffer buf, int maxLength) {
            if (value.length()>maxLength) {
                buf.append(value.substring(0, maxLength));
            } else {
                if (alignRight) {
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
            } else {
                if (alignRight) {
                    buf.append(SPACES.substring(0, maxLength - value.length()));
                }
                buf.append(value);
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
                buf.append(value);
                if (!alignRight) {
                    buf.append(SPACES.substring(0, maxLength - value.length()));
                }
            }
```

### StringOperationCanBeSimplified
Can be replaced with 'String.valueOf()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/Lexer.java`
#### Snippet
```java
                return String.valueOf(st.nval);
            } else {
                return new String(new char[] {(char) tokenType});
            }
        } catch (IOException e) {
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
                    }
                    if (i > 0) {
                        buf.append(text.substring(pos, i));
                    }
                    pos = i + 1;
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
    public static String escapeIllegalXpathSearchChars(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s.substring(0, (s.length() - 1)));
        char c = s.charAt(s.length() - 1);
        // NOTE: keep this in sync with _ESCAPED_CHAR below!
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
        int p = 0, q = value.indexOf("${");                // Find first ${
        while (q != -1) {
            result.append(value.substring(p, q));          // Text before ${
            p = q;
            q = value.indexOf("}", q + 2);                 // Find }
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            }
        }
        result.append(value.substring(p, value.length())); // Trailing text

        return result.toString();
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
        StringBuffer sb = new StringBuffer(text.length());
        while (pos != -1) {
            sb.append(text.substring(lastPos, pos));
            sb.append(newString);
            lastPos = pos + oldString.length();
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `doExecute()` overloads a compatible method of a superclass, when overriding might have been intended
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractJcrFsCommand.java`
#### Snippet
```java
    }

    abstract protected void doExecute(VaultFsConsoleExecutionContext ctx, CommandLine cl)
            throws Exception;

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
                i++;
            }
            return String.valueOf(size) + units[i];
        }
    }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedPropertiesValidator.java`
#### Snippet
```java
public final class AdvancedPropertiesValidator implements GenericMetaInfDataValidator {

    protected static final String MESSAGE_INVALID_PROPERTIES_XML = "Invalid properties.xml";

    static final Path PROPERTIES_XML_PATH = Paths.get(Constants.VAULT_DIR).resolve(Constants.PROPERTIES_XML);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_LEGACY_TYPE = "Package of type '%s' is legacy. Use one of the other types instead!";
    protected static final String MESSAGE_PACKAGE_HOOKS = "Package of type '%s' must not contain package hooks but has '%s'!";
    protected static final String MESSAGE_NO_PACKAGE_TYPE_SET = "No package type set, make sure that property 'packageType' is set in the properties.xml!";
    protected static final String MESSAGE_NO_OSGI_BUNDLE_OR_CONFIG_ALLOWED = "Package of type '%s' is not supposed to contain OSGi bundles or configurations!";
    protected static final String MESSAGE_ONLY_OSGI_BUNDLE_OR_CONFIG_OR_SUBPACKAGE_ALLOWED = "Package of type '%s' is not supposed to contain anything but OSGi bundles/configurations and subpackages!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
	protected static final String MESSAGE_FILTER_HAS_INCLUDE_EXCLUDES = "Package of type '%s' is not supposed to contain includes/excludes below any of its filters!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE_OF_TYPE = "Package of type '%s' must only contain sub packages of type '%s' but found subpackage of type '%s'!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE = "Package of type '%s' is not supposed to contain any subpackages!";
    protected static final String MESSAGE_DEPENDENCY = "Package of type '%s' must not have package dependencies but found dependencies '%s'!";
    protected static final String MESSAGE_LEGACY_TYPE = "Package of type '%s' is legacy. Use one of the other types instead!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_ONLY_OSGI_BUNDLE_OR_CONFIG_OR_SUBPACKAGE_ALLOWED = "Package of type '%s' is not supposed to contain anything but OSGi bundles/configurations and subpackages!";
    protected static final String MESSAGE_APP_CONTENT = "Package of type '%s' is not supposed to contain content below root nodes %s!";
    protected static final String MESSAGE_NO_APP_CONTENT_FOUND = "Package of type '%s' is not supposed to contain content outside root nodes %s!";
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_NO_OSGI_BUNDLE_OR_CONFIG_ALLOWED = "Package of type '%s' is not supposed to contain OSGi bundles or configurations!";
    protected static final String MESSAGE_ONLY_OSGI_BUNDLE_OR_CONFIG_OR_SUBPACKAGE_ALLOWED = "Package of type '%s' is not supposed to contain anything but OSGi bundles/configurations and subpackages!";
    protected static final String MESSAGE_APP_CONTENT = "Package of type '%s' is not supposed to contain content below root nodes %s!";
    protected static final String MESSAGE_NO_APP_CONTENT_FOUND = "Package of type '%s' is not supposed to contain content outside root nodes %s!";
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    private static final String NODETYPE_SLING_OSGI_CONFIG = "sling:OsgiConfig";
	protected static final String MESSAGE_FILTER_HAS_INCLUDE_EXCLUDES = "Package of type '%s' is not supposed to contain includes/excludes below any of its filters!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE_OF_TYPE = "Package of type '%s' must only contain sub packages of type '%s' but found subpackage of type '%s'!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE = "Package of type '%s' is not supposed to contain any subpackages!";
    protected static final String MESSAGE_DEPENDENCY = "Package of type '%s' must not have package dependencies but found dependencies '%s'!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_NO_PACKAGE_TYPE_SET = "No package type set, make sure that property 'packageType' is set in the properties.xml!";
    protected static final String MESSAGE_NO_OSGI_BUNDLE_OR_CONFIG_ALLOWED = "Package of type '%s' is not supposed to contain OSGi bundles or configurations!";
    protected static final String MESSAGE_ONLY_OSGI_BUNDLE_OR_CONFIG_OR_SUBPACKAGE_ALLOWED = "Package of type '%s' is not supposed to contain anything but OSGi bundles/configurations and subpackages!";
    protected static final String MESSAGE_APP_CONTENT = "Package of type '%s' is not supposed to contain content below root nodes %s!";
    protected static final String MESSAGE_NO_APP_CONTENT_FOUND = "Package of type '%s' is not supposed to contain content outside root nodes %s!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java

    private static final String NODETYPE_SLING_OSGI_CONFIG = "sling:OsgiConfig";
	protected static final String MESSAGE_FILTER_HAS_INCLUDE_EXCLUDES = "Package of type '%s' is not supposed to contain includes/excludes below any of its filters!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE_OF_TYPE = "Package of type '%s' must only contain sub packages of type '%s' but found subpackage of type '%s'!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE = "Package of type '%s' is not supposed to contain any subpackages!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
    protected static final String SLING_OSGI_CONFIG = NODETYPE_SLING_OSGI_CONFIG;
    protected static final Path PATH_HOOKS = Paths.get(Constants.VAULT_DIR, Constants.HOOKS_DIR);
    private final @NotNull PackageType type;
    private final @NotNull ValidationMessageSeverity severity;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_NO_APP_CONTENT_FOUND = "Package of type '%s' is not supposed to contain content outside root nodes %s!";
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
    protected static final String SLING_OSGI_CONFIG = NODETYPE_SLING_OSGI_CONFIG;
    protected static final Path PATH_HOOKS = Paths.get(Constants.VAULT_DIR, Constants.HOOKS_DIR);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_APP_CONTENT = "Package of type '%s' is not supposed to contain content below root nodes %s!";
    protected static final String MESSAGE_NO_APP_CONTENT_FOUND = "Package of type '%s' is not supposed to contain content outside root nodes %s!";
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
    protected static final String SLING_OSGI_CONFIG = NODETYPE_SLING_OSGI_CONFIG;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
    protected static final String SLING_OSGI_CONFIG = NODETYPE_SLING_OSGI_CONFIG;
    protected static final Path PATH_HOOKS = Paths.get(Constants.VAULT_DIR, Constants.HOOKS_DIR);
    private final @NotNull PackageType type;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_PACKAGE_HOOKS = "Package of type '%s' must not contain package hooks but has '%s'!";
    protected static final String MESSAGE_NO_PACKAGE_TYPE_SET = "No package type set, make sure that property 'packageType' is set in the properties.xml!";
    protected static final String MESSAGE_NO_OSGI_BUNDLE_OR_CONFIG_ALLOWED = "Package of type '%s' is not supposed to contain OSGi bundles or configurations!";
    protected static final String MESSAGE_ONLY_OSGI_BUNDLE_OR_CONFIG_OR_SUBPACKAGE_ALLOWED = "Package of type '%s' is not supposed to contain anything but OSGi bundles/configurations and subpackages!";
    protected static final String MESSAGE_APP_CONTENT = "Package of type '%s' is not supposed to contain content below root nodes %s!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_DEPENDENCY = "Package of type '%s' must not have package dependencies but found dependencies '%s'!";
    protected static final String MESSAGE_LEGACY_TYPE = "Package of type '%s' is legacy. Use one of the other types instead!";
    protected static final String MESSAGE_PACKAGE_HOOKS = "Package of type '%s' must not contain package hooks but has '%s'!";
    protected static final String MESSAGE_NO_PACKAGE_TYPE_SET = "No package type set, make sure that property 'packageType' is set in the properties.xml!";
    protected static final String MESSAGE_NO_OSGI_BUNDLE_OR_CONFIG_ALLOWED = "Package of type '%s' is not supposed to contain OSGi bundles or configurations!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE = "Package of type '%s' is not supposed to contain any subpackages!";
    protected static final String MESSAGE_DEPENDENCY = "Package of type '%s' must not have package dependencies but found dependencies '%s'!";
    protected static final String MESSAGE_LEGACY_TYPE = "Package of type '%s' is legacy. Use one of the other types instead!";
    protected static final String MESSAGE_PACKAGE_HOOKS = "Package of type '%s' must not contain package hooks but has '%s'!";
    protected static final String MESSAGE_NO_PACKAGE_TYPE_SET = "No package type set, make sure that property 'packageType' is set in the properties.xml!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE_OF_TYPE = "Package of type '%s' must only contain sub packages of type '%s' but found subpackage of type '%s'!";
    protected static final String MESSAGE_UNSUPPORTED_SUB_PACKAGE = "Package of type '%s' is not supposed to contain any subpackages!";
    protected static final String MESSAGE_DEPENDENCY = "Package of type '%s' must not have package dependencies but found dependencies '%s'!";
    protected static final String MESSAGE_LEGACY_TYPE = "Package of type '%s' is legacy. Use one of the other types instead!";
    protected static final String MESSAGE_PACKAGE_HOOKS = "Package of type '%s' must not contain package hooks but has '%s'!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_INVALID_FILTER_XML = "Invalid filter.xml";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_COVERED_BUT_EXCLUDED = "Filter root's ancestor '%s' is defined by dependency '%s' but excluded by its patterns.";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_UNDEFINED = "Filter root's ancestor '%s' is not covered by any of the specified dependencies nor a valid root.";
    protected static final String MESSAGE_NODE_NOT_CONTAINED = "Node '%s' is not contained in any of the filter rules";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED = "Ancestor node '%s' is not covered by any of the filter rules. Preferably depend on a package that provides this node or include it in the filter rules!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_INVALID_PATTERN = "Invalid pattern given ('%s') which will never match for any descendants of the root path '%s'.";
    protected static final String MESSAGE_ROOT_PATH_NOT_ABSOLUTE = "Root path must be absolute, but does not start with a '/': '%s'.";
    protected static final String MESSAGE_INVALID_FILTER_XML = "Invalid filter.xml";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_COVERED_BUT_EXCLUDED = "Filter root's ancestor '%s' is defined by dependency '%s' but excluded by its patterns.";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_UNDEFINED = "Filter root's ancestor '%s' is not covered by any of the specified dependencies nor a valid root.";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
public final class AdvancedFilterValidator implements GenericMetaInfDataValidator, FilterValidator, DocumentViewXmlValidator, JcrPathValidator {

    protected static final String MESSAGE_ORPHANED_FILTER_ENTRIES = "Found orphaned filter entries: %s";
    protected static final String MESSAGE_INVALID_PATTERN = "Invalid pattern given ('%s') which will never match for any descendants of the root path '%s'.";
    protected static final String MESSAGE_ROOT_PATH_NOT_ABSOLUTE = "Root path must be absolute, but does not start with a '/': '%s'.";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_NODE_NOT_CONTAINED = "Node '%s' is not contained in any of the filter rules";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED = "Ancestor node '%s' is not covered by any of the filter rules. Preferably depend on a package that provides this node or include it in the filter rules!";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED_BUT_VALID_ROOT = "Ancestor node '%s' is not covered by any of the filter rules but that node is a given root (either by a dependency or by the known roots). Remove the file(s) representing that node!";
    protected static final String MESSAGE_NODE_BELOW_CLEANUP_FILTER = "Node '%s' is covered by a 'cleanup' filter rule. That filter type is only supposed to be used for removing nodes during import!";
    
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java

    protected static final String MESSAGE_ORPHANED_FILTER_ENTRIES = "Found orphaned filter entries: %s";
    protected static final String MESSAGE_INVALID_PATTERN = "Invalid pattern given ('%s') which will never match for any descendants of the root path '%s'.";
    protected static final String MESSAGE_ROOT_PATH_NOT_ABSOLUTE = "Root path must be absolute, but does not start with a '/': '%s'.";
    protected static final String MESSAGE_INVALID_FILTER_XML = "Invalid filter.xml";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_COVERED_BUT_EXCLUDED = "Filter root's ancestor '%s' is defined by dependency '%s' but excluded by its patterns.";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_UNDEFINED = "Filter root's ancestor '%s' is not covered by any of the specified dependencies nor a valid root.";
    protected static final String MESSAGE_NODE_NOT_CONTAINED = "Node '%s' is not contained in any of the filter rules";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED = "Ancestor node '%s' is not covered by any of the filter rules. Preferably depend on a package that provides this node or include it in the filter rules!";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED_BUT_VALID_ROOT = "Ancestor node '%s' is not covered by any of the filter rules but that node is a given root (either by a dependency or by the known roots). Remove the file(s) representing that node!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_ROOT_PATH_NOT_ABSOLUTE = "Root path must be absolute, but does not start with a '/': '%s'.";
    protected static final String MESSAGE_INVALID_FILTER_XML = "Invalid filter.xml";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_COVERED_BUT_EXCLUDED = "Filter root's ancestor '%s' is defined by dependency '%s' but excluded by its patterns.";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_UNDEFINED = "Filter root's ancestor '%s' is not covered by any of the specified dependencies nor a valid root.";
    protected static final String MESSAGE_NODE_NOT_CONTAINED = "Node '%s' is not contained in any of the filter rules";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED = "Ancestor node '%s' is not covered by any of the filter rules. Preferably depend on a package that provides this node or include it in the filter rules!";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED_BUT_VALID_ROOT = "Ancestor node '%s' is not covered by any of the filter rules but that node is a given root (either by a dependency or by the known roots). Remove the file(s) representing that node!";
    protected static final String MESSAGE_NODE_BELOW_CLEANUP_FILTER = "Node '%s' is covered by a 'cleanup' filter rule. That filter type is only supposed to be used for removing nodes during import!";
    
    static final Path FILTER_XML_PATH = Paths.get(Constants.VAULT_DIR, Constants.FILTER_XML);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_ORPHANED_FILTER_ENTRIES = "Found orphaned filter entries: %s";
    protected static final String MESSAGE_INVALID_PATTERN = "Invalid pattern given ('%s') which will never match for any descendants of the root path '%s'.";
    protected static final String MESSAGE_ROOT_PATH_NOT_ABSOLUTE = "Root path must be absolute, but does not start with a '/': '%s'.";
    protected static final String MESSAGE_INVALID_FILTER_XML = "Invalid filter.xml";
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_COVERED_BUT_EXCLUDED = "Filter root's ancestor '%s' is defined by dependency '%s' but excluded by its patterns.";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    protected static final String MESSAGE_FILTER_ROOT_ANCESTOR_UNDEFINED = "Filter root's ancestor '%s' is not covered by any of the specified dependencies nor a valid root.";
    protected static final String MESSAGE_NODE_NOT_CONTAINED = "Node '%s' is not contained in any of the filter rules";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED = "Ancestor node '%s' is not covered by any of the filter rules. Preferably depend on a package that provides this node or include it in the filter rules!";
    protected static final String MESSAGE_ANCESTOR_NODE_NOT_COVERED_BUT_VALID_ROOT = "Ancestor node '%s' is not covered by any of the filter rules but that node is a given root (either by a dependency or by the known roots). Remove the file(s) representing that node!";
    protected static final String MESSAGE_NODE_BELOW_CLEANUP_FILTER = "Node '%s' is covered by a 'cleanup' filter rule. That filter type is only supposed to be used for removing nodes during import!";
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipNioArchive.java`
#### Snippet
```java
    private static final class EntryImpl implements Entry {

        protected final Path path;

        private Map<String, EntryImpl> children;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `fis` declared in one 'switch' branch and used in another
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            switch (file.getStatus()) {
                case MODIFIED:
                    FileInputSource fis = new FileInputSource(file.getFile());
                    if (file.isBinary()) {
                        fis.setLineSeparator(LineOutputStream.LS_BINARY);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `instance` accessed in synchronized context
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java

    public synchronized static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instance` accessed in synchronized context
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java
    public synchronized static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `instance` accessed in synchronized context
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java
            instance = new Registry();
        }
        return instance;
    }

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
    public List<Entry<E>> getEntries() {
        seal();
        //noinspection ConstantConditions
        return entries;
    }
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
    @SuppressWarnings("ThrowableResultOfMethodCallIgnored")
    @Deprecated
    public Exception getError(String path) {
        Info info = infos.get(path);
        return info == null ? null : info.getError();
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewFormat.java`
#### Snippet
```java
    private byte[] format(File file, Checksum original, Checksum formatted) throws IOException {
        try (InputStream in = new CheckedInputStream(new BufferedInputStream(new FileInputStream(file)), original)) {
            @SuppressWarnings("resource")
            ByteArrayOutputStream buffer = formattingBuffer != null ? formattingBuffer.get() : null;
            if (buffer == null) {
                buffer = new ByteArrayOutputStream();
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                }

                //noinspection resource
                ((JcrPackageImpl) pack.getJcrPackage()).uninstall(processed, opts);
            }
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
                throw new NoSuchPackageException().setId(id);
            }
            //noinspection resource
            for (Dependency dep : pkg.getPackage().getDependencies()) {
                PackageId resolvedId = resolve(dep, onlyInstalled);
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
                    continue;
                }
                // noinspection resource
                for (Dependency dep : pkg.getPackage().getDependencies()) {
                    if (dep.matches(id)) {
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
    public PackageId register(@NotNull InputStream in, boolean replace) throws IOException, PackageExistsException {
        try (JcrPackage pkg = upload(in, replace)){
            //noinspection resource
            return pkg.getPackage().getId();
        } catch (RepositoryException e) {
```

### RedundantSuppression
Redundant suppression
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    public void remove(@NotNull PackageId id) throws IOException, NoSuchPackageException {
        try (JcrRegisteredPackage pkg = (JcrRegisteredPackage) open(id)) {
            if (pkg == null) {
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrExporter.java`
#### Snippet
```java
        } catch (RepositoryException e) {
            IOException io = new IOException("Error while creating item " + relPath);
            io.initCause(e);
            throw io;
        }
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/DefaultCNDReader.java`
#### Snippet
```java
        } catch (ParseException e) {
            IOException ie = new IOException("I/O Error while reading node types.");
            ie.initCause(e);
            throw ie;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentDocViewNode'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ValidatorDocViewParserHandler.java`
#### Snippet
```java
    }

    private void callValidators(boolean isStart, String nodePath, DocViewNode2 docViewNode, Optional<DocViewNode2> parentDocViewNode, int lineNumber,
            int columnNumber) {
        violations.add(new ValidationViolation(ValidationMessageSeverity.DEBUG, "Validate node '" + docViewNode + "' " + (isStart ? "start" : "end")));
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentDocViewNode'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @throws RepositoryException
     */
    void startDocViewNode(@NotNull String nodePath, @NotNull DocViewNode2 docViewNode, @NotNull Optional<DocViewNode2> parentDocViewNode, int line, int column) throws IOException, RepositoryException;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parentDocViewNode'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @throws RepositoryException
     */
    void endDocViewNode(@NotNull String nodePath, @NotNull DocViewNode2 docViewNode, @NotNull Optional<DocViewNode2> parentDocViewNode, int line, int column) throws IOException, RepositoryException;

    /**
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
        }
        w.close();
        return new ByteArrayInputStream(out.getBuffer().toString().getBytes("utf-8"));
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
    private static String escapePath(@NotNull String string) {
        try {
            byte[] bytes = string.getBytes("utf-8");
            StringBuilder out = new StringBuilder(bytes.length);
            for (byte aByte : bytes) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
        // currently we rely on the implementation detail to keep the API dependency to jackrabbit  < 2.3.
        try {
            UUID uuid = UUID.nameUUIDFromBytes(name.toLowerCase().getBytes("UTF-8"));
            return session.getNodeByIdentifier(uuid.toString()).getPath();
        } catch (Exception e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                    if (opts.getCndPattern().matcher(repoPath).matches()) {
                        InputStream in = is.getByteStream();
                        try (Reader r = new InputStreamReader(in, "utf8")) {
                            CNDReader reader = ServiceProviderFactory.getProvider().getCNDReader();
                            // provide session namespaces
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
            NodeTypeInstaller installer = ServiceProviderFactory.getProvider().getDefaultNodeTypeInstaller(session);
            CNDReader types = ServiceProviderFactory.getProvider().getCNDReader();
            types.read(new InputStreamReader(in, "utf8"), DEFAULT_NODETYPES, null);
            installer.install(null, types);
        } catch (Exception e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    public String getSourceAsString() {
        try {
            return new String(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
        for (File file: files) {
            if (file.getName().endsWith(".cnd")) {
                try(Reader r = new InputStreamReader(new FileInputStream(file), "utf8")) {
                    CNDReader reader = ServiceProviderFactory.getProvider().getCNDReader();
                    reader.read(r, file.getName(), null);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
            return true;
        } else if (name.endsWith(".cnd")) {
            Reader r = new InputStreamReader(in, "utf8");
            CNDReader reader = ServiceProviderFactory.getProvider().getCNDReader();
            reader.read(r, systemId, null);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
            Cipher cipher = Cipher.getInstance("DES");
            byte[] keyBytes = key.getEncoded();
            byte[] data = s.getBytes("utf-8");
            ByteArrayOutputStream out = new ByteArrayOutputStream(keyBytes.length + data.length);
            out.write(keyBytes);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
        try {
            BitSet validChars = isPath ? URISaveEx : URISave;
            byte[] bytes = string.getBytes("utf-8");
            StringBuffer out = new StringBuffer(bytes.length);
            for (byte aByte : bytes) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        try {
            return new String(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
            NodeTypeInstaller installer = ServiceProviderFactory.getProvider().getDefaultNodeTypeInstaller(session);
            CNDReader types = ServiceProviderFactory.getProvider().getCNDReader();
            types.read(new InputStreamReader(in, "utf8"), DEFAULT_NODETYPES, null);
            installer.install(null, types);
        } catch (Throwable e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
                Reader r = null;
                try {
                    r = new InputStreamReader(in, "utf-8");
                    load(r);
                } finally {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
        Writer w = null;
        try {
            w = new OutputStreamWriter(FileUtils.openOutputStream(file), "utf-8");
            for (Line l: lines.values()) {
                w.write(l.getLine());
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
        Reader r = null;
        try {
            r = new InputStreamReader(FileUtils.openInputStream(file), "utf-8");
            load(r);
        } finally {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-davex/src/main/java/org/apache/jackrabbit/vault/davex/DAVExRepositoryFactory.java`
#### Snippet
```java
                parameters.putAll(connectionOptions.toServiceFactoryParameters());
            }
            System.out.printf("Connecting via JCR remoting to %s%n", address.getSpecificURI().toString());
            return new RepositoryFactoryImpl().getRepository(parameters);
        } catch (IOException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
            if (file.isDirectory()) {
                if (verbose) {
                    System.out.printf("traversing: %s%n", file);
                    for (Pattern p: parsedPatterns) {
                        System.out.printf("scanning for files matching: %s%n", p);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
                    System.out.printf("traversing: %s%n", file);
                    for (Pattern p: parsedPatterns) {
                        System.out.printf("scanning for files matching: %s%n", p);
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
            } else {
                if (verbose) {
                    System.out.printf("processing: %s%n", file);
                }
                if (format.format(file, checkOnly)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
        }
        if (formattedFiles.isEmpty()) {
            System.out.println("All files already properly formatted.");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
        final Path cwd = Paths.get(new File("").getAbsolutePath());
        if (checkOnly) {
            System.out.println("The following files are not properly formatted:\n");
            for (String path: formattedFiles) {
                System.out.println(cwd.relativize(Paths.get(path)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
            System.out.println("The following files are not properly formatted:\n");
            for (String path: formattedFiles) {
                System.out.println(cwd.relativize(Paths.get(path)));
            }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
            }
        } else {
            System.out.println("reformatted files:\n");
            for (String path: formattedFiles) {
                System.out.println(cwd.relativize(Paths.get(path)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
            System.out.println("reformatted files:\n");
            for (String path: formattedFiles) {
                System.out.println(cwd.relativize(Paths.get(path)));
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdGet.java`
#### Snippet
```java
            FileOutputStream out = new FileOutputStream(local);
            remote.getArtifact().spool(out);
            System.out.println(local.getName() + "  " + local.length() + " bytes.");
            long lastMod = remote.lastModified();
            if (lastMod > 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                Collection<? extends VaultFile> related = file.getRelated();
                if (related == null) {
                    System.out.println("(null)");                    
                } else {
                    for (VaultFile f: related) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                } else {
                    for (VaultFile f: related) {
                        System.out.println(f.getPath());
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                try {
                    r.load(file);
                    DumpContext dCtx = new DumpContext(new PrintWriter(System.out));
                    r.dump(dCtx, false);
                    dCtx.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                    dCtx.flush();
                    
                    IOUtils.copy(r.getSource(), System.out);
                } catch (Exception e) {
                    e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSave.java`
#### Snippet
```java
            try {
                node.getSession().save();
                System.out.println("Modifications persisted.");
            } catch (RepositoryException e) {
                throw new ExecutionException("Error while saving: " + e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCat.java`
#### Snippet
```java
                }
                if (ct.startsWith("text/")) {
                    file.getArtifact().spool(System.out);
                    System.out.flush();
                } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCat.java`
#### Snippet
```java
                if (ct.startsWith("text/")) {
                    file.getArtifact().spool(System.out);
                    System.out.flush();
                } else {
                    System.out.printf("Refusing to print contents of a '%s' file.%n", ct);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCat.java`
#### Snippet
```java
                    System.out.flush();
                } else {
                    System.out.printf("Refusing to print contents of a '%s' file.%n", ct);
                }
            } catch (IOException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdTree.java`
#### Snippet
```java
                for (int i = 0; i < files.length; i++) {
                    String pfx = i == files.length -1 ? "`" : "|";
                    System.out.println(indent + pfx + "-- " + files[i].getName());
                    String ind = i == files.length -1 ? "    " : "|   ";
                    if (depth > 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPut.java`
#### Snippet
```java
            tx.modify(remote, is);
            tx.commit();
            System.out.println(local.getName() + "  " + local.length() + " bytes.");
        } catch (IOException e) {
            throw new ExecutionException("Error while uploading file: " + e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPut.java`
#### Snippet
```java
            tx.add(path, is);
            tx.commit();
            System.out.println(local.getName() + "  " + local.length() + " bytes.");
        } catch (IOException e) {
            throw new ExecutionException("Error while uploading file: " + e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdRefresh.java`
#### Snippet
```java
            try {
                node.getSession().refresh(cl.hasOption(optKeepChanges));
                System.out.println("Modifications refreshed.");
            } catch (RepositoryException e) {
                throw new ExecutionException("Error while refreshing: " + e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
                Object f = ctx.getCurrentFile().getFile(path, false).unwrap();
                if (f instanceof Dumpable) {
                    DumpContext dCtx = new DumpContext(new PrintWriter(System.out));
                    ((Dumpable) f).dump(dCtx, true);
                    dCtx.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
            }
        } else {
            fs.getAggregateManager().dumpConfig(new PrintWriter(System.out));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
            File cwd = getPlatformFile("", true).getCanonicalFile();
            ConnectionOptions options = ConnectionOptions.fromServiceFactoryParameters(getEnv());
            return new VltContext(cwd, localFile, repProvider, credentialsStore, System.out, options);
        } catch (IOException e) {
            throw new ExecutionException(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                    SimpleCredentials simpleCredentials = (SimpleCredentials) creds;
                    if (simpleCredentials.getPassword().length == 0) {
                        System.out.printf("Please enter password for user %s connecting to %s: ",
                                simpleCredentials.getUserID(), mountpoint);
                        String password = new jline.ConsoleReader().readLine('*');
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                String delim = "Mixins: ";
                for (NodeType nt: node.getMixinNodeTypes()) {
                    System.out.print(delim);
                    System.out.print(nt.getName());
                    delim = ", ";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                for (NodeType nt: node.getMixinNodeTypes()) {
                    System.out.print(delim);
                    System.out.print(nt.getName());
                    delim = ", ";
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdMixins.java`
#### Snippet
```java
                    delim = ", ";
                }
                System.out.println();
            } catch (RepositoryException e) {
                throw new ExecutionException("Error while downloading file: " + e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                                oldLine = (String) reader.getHistory().getHistoryList().get(historyIndex - 1);
                            } catch (Exception e) {
                                System.out.println("  " + line + ": event not found");
                                continue;
                            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                            }
                            reader.getHistory().addToHistory(oldLine);
                            System.out.println("Executing '" + oldLine + "'");
                            line = oldLine;
                        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                        currentCtx.execute(line);
                        long time = System.currentTimeMillis() - now;
                        System.out.println("Command completed in " + time + "ms");
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
            StringBuffer buf = new StringBuffer();
            r.print(buf, lengths);
            System.out.println(buf);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdPwd.java`
#### Snippet
```java

    protected void doExecute(ConsoleExecutionContext ctx, CommandLine cl) throws Exception {
        System.out.println(ctx.getCurrentFile().getPath());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/examples/CmdHello.java`
#### Snippet
```java
        String name = (String) cl.getValue(argName);
        if (name == null) {
            System.out.println("Hello, world.");
        } else {
            System.out.println("Hello, " + name + ".");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/examples/CmdHello.java`
#### Snippet
```java
            System.out.println("Hello, world.");
        } else {
            System.out.println("Hello, " + name + ".");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/CmdHistory.java`
#### Snippet
```java
        int i=1;
        while (iter.hasNext()) {
            System.out.println("  " + i + "  " + iter.next());
            i++;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java

    public void printVersion() {
        System.out.println(getVersionString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
            rootLogger.setLevel(Level.toLevel(level));
            getEnv().setProperty(KEY_LOGLEVEL, level);
            System.out.println("Log level set to '" + logLevel + "'");
        } catch (Throwable e) {
            System.err.println("Error while setting log level: " + e);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
            System.out.println("Log level set to '" + logLevel + "'");
        } catch (Throwable e) {
            System.err.println("Error while setting log level: " + e);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DefaultProgressListener.java`
#### Snippet
```java

    public DefaultProgressListener() {
        this(new PrintWriter(System.out));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
            CredentialsStore credsProvider)
                    throws IOException {
        this(cwd, localFile, repProvider, credsProvider, System.out, null);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java
        buf.append(") ").append(prefix);
        buf.append(doc.getElements()[i]);
        System.out.println(buf);
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
    private static Pattern createPatternFromGlob(String glob) {
        // only support * and ?
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
        // only support * and ?
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
        return Pattern.compile(glob);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
        return Pattern.compile(glob);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Sync.java`
#### Snippet
```java
        URL resource = null;
        for (URL url: cl.getURLs()) {
            if (url.getPath().matches(".*/vault-sync-.*\\.jar")) {
                resource = url;
                break;
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.jackrabbit.vault.packaging.PackageId;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageInfo.java`
#### Snippet
```java

import org.apache.jackrabbit.vault.fs.api.WorkspaceFilter;
import org.apache.jackrabbit.vault.packaging.PackageId;
import org.apache.jackrabbit.vault.packaging.PackageType;
import org.jetbrains.annotations.NotNull;
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.jackrabbit.vault.packaging.PackageType;`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageInfo.java`
#### Snippet
```java
import org.apache.jackrabbit.vault.fs.api.WorkspaceFilter;
import org.apache.jackrabbit.vault.packaging.PackageId;
import org.apache.jackrabbit.vault.packaging.PackageType;
import org.jetbrains.annotations.NotNull;

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ConnectionOptionsMixin()` of an abstract class should not be declared 'public'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/ConnectionOptionsMixin.java`
#### Snippet
```java
public abstract class ConnectionOptionsMixin {
    @JsonCreator
    public ConnectionOptionsMixin(
            @JsonProperty("useSystemProperties")boolean isUseSystemPropertes, 
            @JsonProperty("maxConnections")int maxConnections, 
```

### NonProtectedConstructorInAbstractClass
Constructor `SimpleCredentialsMixin()` of an abstract class should not be declared 'public'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/SimpleCredentialsMixin.java`
#### Snippet
```java
public abstract class SimpleCredentialsMixin {
    @JsonCreator
    public SimpleCredentialsMixin(@JsonProperty("userID")String userID, @JsonProperty("password")char[] password) {}
}

```

### NonProtectedConstructorInAbstractClass
Constructor `RepositoryCopierMixin()` of an abstract class should not be declared 'public'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryCopierMixin.java`
#### Snippet
```java
public abstract class RepositoryCopierMixin {
    @JsonCreator
    public RepositoryCopierMixin() {}

    @JsonIgnore
```

### NonProtectedConstructorInAbstractClass
Constructor `RepositoryAddressMixin()` of an abstract class should not be declared 'public'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryAddressMixin.java`
#### Snippet
```java
public abstract class RepositoryAddressMixin {
    @JsonCreator
    public RepositoryAddressMixin(@JsonProperty("uri")@NotNull URI uri) {}
    
    @JsonIgnore
```

### NonProtectedConstructorInAbstractClass
Constructor `VaultFsConsoleExecutionContext()` of an abstract class should not be declared 'public'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsConsoleExecutionContext.java`
#### Snippet
```java
    private final VaultFsApp app;

    public VaultFsConsoleExecutionContext(VaultFsApp app, String name) {
        super(app, name);
        this.app = app;
```

### NonProtectedConstructorInAbstractClass
Constructor `FilterSet()` of an abstract class should not be declared 'public'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
     * Default constructor. initializes the root path to "/"
     */
    public FilterSet() {
        this("");
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FilterSet()` of an abstract class should not be declared 'public'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
     * @param root path
     */
    public FilterSet(String root) {
        setRoot(root);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CredentialsConfig()` of an abstract class should not be declared 'public'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/CredentialsConfig.java`
#### Snippet
```java
    public static final String ELEM_CREDETIALS = "credentials";

    public CredentialsConfig(String type) {
        this.type = type;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPackageRegistry()` of an abstract class should not be declared 'public'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
    private final IdConflictPolicy defaultIdConflictPolicy;

    public AbstractPackageRegistry(SecurityConfig securityConfig, boolean isStrictByDefault,
            boolean overwritePrimaryTypesOfFoldersByDefault, IdConflictPolicy defaultIdConflictPolicy) {
        if (securityConfig != null) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `type`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/DocViewPropertyValueFactory.java`
#### Snippet
```java
        if (type == PropertyType.UNDEFINED) {
            // simulate behaviour of DocViewProperty.apply(...) which leverages setProperty(String name, String value)
            type = PropertyType.STRING;
        }
        return valueFactory.createValue(value, type);
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/EnhancedBufferedInputStream.java`
#### Snippet
```java
    public static InputStream tryUnwrap(InputStream input) {
        while (input instanceof EnhancedBufferedInputStream) {
            input = EnhancedBufferedInputStream.class.cast(input).getDelegate();
        }
        return input;
```

### AssignmentToMethodParameter
Assignment to method parameter `nodeContext`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                    if (currentNodeTypeMetaData.getPrimaryNodeType().equals(NameConstants.NT_FILE)) {
                        // create new node context
                        nodeContext = new NodeContextImpl(nodeContext.getNodePath() + "/" + JcrConstants.JCR_CONTENT,
                                nodeContext.getFilePath(), nodeContext.getBasePath());
                        messages.addAll(
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
        Value value;
        if (type == PropertyType.UNDEFINED) {
            type = PropertyType.STRING;
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
        switch(format) {
        case CFG:
            name = name.substring(0, name.length() - ".cfg".length());
            break;
        case CFG_JSON:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
            break;
        case CFG_JSON:
            name = name.substring(0, name.length() - ".cfg.json".length());
            break;
        case CONFIG:
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
            break;
        case CONFIG:
            name = name.substring(0, name.length() - ".config".length());
            break;
        default:
```

### AssignmentToMethodParameter
Assignment to method parameter `size`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
            int i=0;
            while (size > 1000) {
                size /= 1000;
                i++;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java

        if (root == null) {
            root = getProperty(KEY_DEFAULT_MOUNTPOINT);
        }
        if (config == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        if (config == null) {
            config = getProperty(KEY_DEFAULT_CONFIG_XML);
        }
        if (filter == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `filter`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        if (filter == null) {
            filter = getProperty(KEY_DEFAULT_FILTER_XML);
        }
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `creds`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java

        if (creds == null) {
            creds = getProperty(KEY_DEFAULT_CREDS);
        }
        if (creds == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `creds`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        if (creds == null) {
            creds = DEFAULT_CREDS;
        }
        if (wsp == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `wsp`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        if (wsp == null) {
            wsp = getProperty(KEY_DEFAULT_WORKSPACE);
        }
        if (wsp == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `wsp`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        if (wsp == null) {
            wsp = DEFAULT_WSP;
        }
        Credentials defaultCreds;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
            Table t = new Table(2);
            while (iter.hasNext()) {
                name = (String) iter.next();
                ConsoleExecutionContext c = (ConsoleExecutionContext) contexts.get(name);
                if (c == currentCtx) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                ConsoleExecutionContext c = (ConsoleExecutionContext) contexts.get(name);
                if (c == currentCtx) {
                    name = "*" + name;
                } else {
                    name = " " + name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                    name = "*" + name;
                } else {
                    name = " " + name;
                }
                String path = c.getProperty(AbstractApplication.KEY_PATH);
```

### AssignmentToMethodParameter
Assignment to method parameter `indent`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
    private static void addCause(StringBuffer buf, Throwable e, StringBuffer indent) {
        if (indent == null) {
            indent = new StringBuffer();
        }
        buf.append(e.getClass().getName()).append(": ").append(e.getMessage());
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
                return -1;
            }
            len = Math.min(len, (int) (end-pos));
            raf.seek(pos);
            int read = raf.read(b, off, len);
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
                return -1;
            }
            n = Math.min(n, end - pos);
            pos+= n;
            return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ItemFilterSet.java`
#### Snippet
```java
    public boolean contains(Item item, String path, int depth) throws RepositoryException {
        if (path == null) {
            path = item.getPath();
        }
        if (!covers(path)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
        if (path.charAt(0) != '/') {
            if (this.path.endsWith("/")) {
                path = this.path + path;
            } else {
                path = this.path + "/" + path;
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
                path = this.path + path;
            } else {
                path = this.path + "/" + path;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `archive`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        if (pathMapping != null) {
            filter = filter.translate(pathMapping);
            this.archive = archive = new MappedArchive(archive, pathMapping);
            this.archive.open(true);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `parentPath`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java

        if ("/".equals(parentPath)) {
            parentPath = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `info`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            // remap the child tree in case some of the nodes where moved during import (e.g. authorizable)
            // todo: this could be a problem during error recovery
            info = info.remap(imp.getRemapped());
        }
        log.trace("committed {}", info.path);
```

### AssignmentToMethodParameter
Assignment to method parameter `absPath`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                return null;
            }
            absPath = absPath.substring(path.length());
            TxInfo root = this;
            for (String name: Text.explode(absPath, '/')) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
            String elem = pathElems[i];
            if (elem.equals("/")) {
                parent = getRoot();
            } else if (elem.equals("..")) {
                parent = parent.getParent();
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
                parent = getRoot();
            } else if (elem.equals("..")) {
                parent = parent.getParent();
            } else {
                parent = parent.getChild(elem);
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
                parent = parent.getParent();
            } else {
                parent = parent.getChild(elem);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
                throw new IOException("Path not under mountpoint.");
            }
            path = path.substring(rootPath.length());
        }
        return getFile(root, path);
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
            throws RepositoryException {
        if (config == null) {
            config = getDefaultConfig();
        }
        if (wspFilter == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `wspFilter`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
        }
        if (wspFilter == null) {
            wspFilter = getDefaultWorkspaceFilter();
        }
        Node rootNode = session.getNode(mountpoint.getPath());
```

### AssignmentToMethodParameter
Assignment to method parameter `config`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
    throws RepositoryException {
        if (config == null) {
            config = getDefaultConfig();
        }
        if (wspFilter == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `wspFilter`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
        }
        if (wspFilter == null) {
            wspFilter = getDefaultWorkspaceFilter();
        }
        Node rootNode;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
        if (prop.getDefinition().isMultiple()) {
            if (index < 0) {
                index = 0;
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
        } else {
            if (index >=0) {
                index = -1;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
                }
            }
            name = name.substring(0, idx);
        }
        return new SimpleEntry<>(name, index);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
    public boolean includes(Node root, Node node, String path) throws RepositoryException {
        if (path == null) {
            path = node.getPath();
        }
        return contentFilter.contains(node, path, PathUtil.getDepth(path) - root.getDepth());
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
    public boolean includes(Node root, Node parent, Property property, String path) throws RepositoryException {
        if (path == null) {
            path = property.getPath();
        }
        return contentFilter.contains(property, path, PathUtil.getDepth(path) - root.getDepth());
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/FileAggregator.java`
#### Snippet
```java
    public boolean includes(Node root, Node node, String path) throws RepositoryException {
        if (path == null) {
            path = node.getPath();
        }
        int depth = PathUtil.getDepth(path) - root.getDepth();
```

### AssignmentToMethodParameter
Assignment to method parameter `elem`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
        while (elem != null && elem.getNodeType() != Node.DOCUMENT_NODE) {
            path = " > " + elem.getNodeName() + path;
            elem = elem.getParentNode();
        }
        throw new ConfigurationException(msg + ". Location: " + name + path);
```

### AssignmentToMethodParameter
Assignment to method parameter `nodePath`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
    private void include(Node node, String nodePath) throws RepositoryException {
        if (nodePath == null) {
            nodePath = node.getPath();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            if (a > -1 && b > -1) {
                buffer.append((char) (a * 16 + b));
                name = name.substring(i + 3);
            } else {
                buffer.append('%');
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            } else {
                buffer.append('%');
                name = name.substring(i + 1);
            }
            i = name.indexOf('%');
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
                return "";
            }
            level--;
        }
        return (idx == 0) ? "/" : path.substring(0, idx);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
    public static String getName(String path, boolean ignoreTrailingSlash) {
        if (ignoreTrailingSlash && path != null && path.endsWith("/") && path.length() > 1) {
            path = path.substring(0, path.length()-1);
        }
        return getName(path);
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
                idx = len;
            }
            level--;
        }
        return level >= 0 ? "" : path.substring(0, idx);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
    public static String getRelativeParent(String path, int level, boolean ignoreTrailingSlash) {
        if (ignoreTrailingSlash && path.endsWith("/") && path.length() > 1) {
            path = path.substring(0, path.length()-1);
        }
        return getRelativeParent(path, level);
```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
    private void print(Mode mode, String action, String path, String msg) {
        try {
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
        try {
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
            out.write("<span class=\"");
```

### AssignmentToMethodParameter
Assignment to method parameter `msg`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
            out.write("<span class=\"");
            out.write(action);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MimeTypes.java`
#### Snippet
```java
     */
    public static String getMimeType(String name, String defaultType) {
        name = name.substring(name.lastIndexOf('.') + 1);
        MimeType mt = byExtension.get(name);
        if (mt == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MimeTypes.java`
#### Snippet
```java

    public static boolean matches(String name, String mimeType, String defaultType) {
        name = name.substring(name.lastIndexOf('.') + 1);
        MimeType mt = byExtension.get(name);
        if (mt != null && mt.mimeType.equals(mimeType)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `ni`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                    }
                }
                ni = ni.cloneWithDifferentProperties(preprocessedProperties);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
            if (node.isNodeType(JcrConstants.NT_FILE)) {
                if (node.hasNode(JcrConstants.JCR_CONTENT)) {
                    node = node.getNode(JcrConstants.JCR_CONTENT);
                } else {
                    node = node.addNode(JcrConstants.JCR_CONTENT, JcrConstants.NT_RESOURCE);
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                    node = node.getNode(JcrConstants.JCR_CONTENT);
                } else {
                    node = node.addNode(JcrConstants.JCR_CONTENT, JcrConstants.NT_RESOURCE);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
            }
        } else {
            node = node.addNode(JcrConstants.JCR_CONTENT, JcrConstants.NT_RESOURCE);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
        if (type == PropertyType.UNDEFINED) {
            if (NameConstants.JCR_PRIMARYTYPE.equals(name) || NameConstants.JCR_MIXINTYPES.equals(name)) {
                type = PropertyType.NAME;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `recursive`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
                    } else {
                        overwrite = false;
                        recursive = false;
                        track(dstPath, "%06d -", ++totalNodes);
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        if (type == PropertyType.UNDEFINED) {
            if ("jcr:primaryType".equals(name) || "jcr:mixinTypes".equals(name)) {
                type = PropertyType.NAME;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `groupId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
    public Dependency(@NotNull String groupId, @NotNull String name, @Nullable VersionRange range) {
        if (groupId.startsWith(PackageId.ETC_PACKAGES_PREFIX)) {
            groupId = groupId.substring(PackageId.ETC_PACKAGES_PREFIX.length());
        }
        this.groupId = groupId;
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
    public VersionRange(Version low, boolean lowIncl, Version high, boolean highIncl) {
        if (low == Version.EMPTY) {
            low = null;
        }
        if (high == Version.EMPTY) {
```

### AssignmentToMethodParameter
Assignment to method parameter `high`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
        }
        if (high == Version.EMPTY) {
            high = null;
        }
        // check if range is valid
```

### AssignmentToMethodParameter
Assignment to method parameter `defNode`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
        DefaultWorkspaceFilter wsp = new DefaultWorkspaceFilter();
        if (defNode.hasNode(JcrPackageDefinitionImpl.NN_FILTER)) {
            defNode = defNode.getNode(JcrPackageDefinitionImpl.NN_FILTER);
        }
        for (NodeIterator filters = defNode.getNodes(); filters.hasNext();) {
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerImpl.java`
#### Snippet
```java
        try {
            if (file == null) {
                file = File.createTempFile("filevault", ".zip");
                isTmp = true;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerImpl.java`
#### Snippet
```java
        boolean success = false;
        if (file == null) {
            file = File.createTempFile("filevault", ".zip");
            isTmp = true;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    public PackageId(String path) {
        fromPath = true;
        path = path.trim();
        int idx = path.lastIndexOf('.');
        if (idx > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
            String ext = path.substring(idx);
            if (".zip".equalsIgnoreCase(ext) || ".jar".equalsIgnoreCase(ext)) {
                path = path.substring(0, idx);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    public PackageId(String path, Version version) {
        fromPath = true;
        path = path.trim();
        int idx = path.lastIndexOf('.');
        if (idx > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
            String ext = path.substring(idx);
            if (".zip".equalsIgnoreCase(ext) || ".jar".equalsIgnoreCase(ext)) {
                path = path.substring(0, idx);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        }
        if (version != null && path.endsWith('-'+version.toString())) {
            path = path.substring(0, path.length() - version.toString().length() - 1);
        }
        idx = path.lastIndexOf('/');
```

### AssignmentToMethodParameter
Assignment to method parameter `version`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        // sanitize version
        if (version == null || version.toString().length() == 0) {
            version = Version.EMPTY;
        }
        this.version = version;
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        // validate group
        if (group.equals(ETC_PACKAGES)) {
            group = "";
        } else if (group.startsWith(ETC_PACKAGES_PREFIX)) {
            group = group.substring(ETC_PACKAGES_PREFIX.length());
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
            group = "";
        } else if (group.startsWith(ETC_PACKAGES_PREFIX)) {
            group = group.substring(ETC_PACKAGES_PREFIX.length());
        } else if (group.startsWith("/")) {
            group = group.substring(1);
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
            group = group.substring(ETC_PACKAGES_PREFIX.length());
        } else if (group.startsWith("/")) {
            group = group.substring(1);
        }
        this.group = group;
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
        } else {
            if (group.equals(pkgRoot.getPath())) {
                group = "";
            } else if (group.startsWith(pkgRoot.getPath() + "/")) {
                group = group.substring(pkgRoot.getPath().length() + 1);
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
                group = "";
            } else if (group.startsWith(pkgRoot.getPath() + "/")) {
                group = group.substring(pkgRoot.getPath().length() + 1);
            }
            if (group.startsWith("/")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `archive`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
        if (!options.isNonRecursive()) {
            spfArchive = new SubPackageFilterArchive(archive);
            archive = spfArchive;
        } else {
            archive = new ArchiveWrapper(archive);
```

### AssignmentToMethodParameter
Assignment to method parameter `archive`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            archive = spfArchive;
        } else {
            archive = new ArchiveWrapper(archive);
        }
        Set<PackageId> ids = new HashSet<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `folder`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            throws RepositoryException, IOException {
        if (folder == null) {
            folder = getPackageRoot();
        }
        return registry.createNew(folder, new PackageId(name), null, true);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        String ext = Text.getName(name, '.');
        if ("zip".equals(ext) || "jar".equals(ext)) {
            name = name.substring(0, name.length() - 4);
        }
        if (!PackageId.isValid(group, name, version)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `glob`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
    private static Pattern createPatternFromGlob(String glob) {
        // only support * and ?
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
```

### AssignmentToMethodParameter
Assignment to method parameter `glob`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
        // only support * and ?
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
        return Pattern.compile(glob);
```

### AssignmentToMethodParameter
Assignment to method parameter `glob`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
        glob = glob.replace(".", "\\.");
        glob = glob.replace("*", ".*");
        glob = glob.replace("?", ".+");
        return Pattern.compile(glob);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `now`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        try {
            if (now == null) {
                now = Calendar.getInstance();
            }
            defNode.setProperty(PN_BUILD_COUNT, String.valueOf(getBuildCount() + 1));
```

### AssignmentToMethodParameter
Assignment to method parameter `now`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        try {
            if (now == null) {
                now = Calendar.getInstance();
            }
            defNode.setProperty(PN_BUILD_COUNT, String.valueOf(getBuildCount() + 1));
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java

    public VltException exception(String path, String msg, Throwable cause) {
        path = getCwdRelativePath(path);
        return new VltException(path, false, msg, cause);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    public void printAction(String path, FileAction action, String contentType) {
        if (!quiet && (verbose || action != FileAction.VOID)) {
            path = getCwdRelativePath(path);
            if (action == FileAction.ADDED && contentType != null) {
                stdout.printf("%s %s (%s)%n", action.letter, path, contentType);
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java

    public VltException error(String path, String msg) {
        path = getCwdRelativePath(path);
        return new VltException(path, true, msg, null);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `date`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntryInfo.java`
#### Snippet
```java
    public void setDate(long date) {
        // round to second
        date -= date % 1000;
        if (date != this.date) {
            this.date = date;
```

### AssignmentToMethodParameter
Assignment to method parameter `root`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/Ignored.java`
#### Snippet
```java
            return;
        }
        root = root.replace('\\', '/');
        StringBuffer reg = new StringBuffer("^");
        reg.append(root).append("/");
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Update.java`
#### Snippet
```java
                return;
            } else {
                file = new VltFile(dir, remoteFile.getName(), null);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/VltTree.java`
#### Snippet
```java
            // if recursive, treat directories as such
            dir = file;
            file = null;
        } else {
            // if non recursive, treat directories as files
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            // refetch file
            if (file == null) {
                file = files.getFile(remoteFile.getName());
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/RemoteStatus.java`
#### Snippet
```java
        if (file == null) {
            // would be an addition
            file = new VltFile(dir, remoteFile.getName(), null);
            action = FileAction.ADDED;
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            if (diff.hasConflicts()) {
                entry.conflict(file, baseFile, tmpFile);
                action = FileAction.CONFLICTED;
            } else {
                // make the tmp file the new base
```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
                tmpFile.moveTo(baseFile);
                base.update(baseFile, true);
                action = FileAction.MERGED;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `action`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            work.update(file, true);
            if (oldMd5.equals(work.getMd5())) {
                action = FileAction.VOID;
            }
            // check if remote file provided a last modified
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
        while (!file.equals(fileRoot)) {
            s.insert(0, PlatformNameFormat.getRepositoryName(file.getName())).insert(0, '/');
            file = file.getParentFile();
        }
        return s.toString();
```

### AssignmentToMethodParameter
Assignment to method parameter `showBase`
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Hunk3.java`
#### Snippet
```java
            out.writeNewLine();
        } else {
            showBase = left == null && right == null;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java
                }
            }
            c = c.next;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `df`
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java
                first = c;
            }
            df = df.nextChange;
        }
        return first;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `vault-davex/src/main/java/org/apache/jackrabbit/vault/davex/DAVExRepositoryFactory.java`
#### Snippet
```java
    public Repository createRepository(RepositoryAddress address, ConnectionOptions connectionOptions) throws RepositoryException {
        if (!SCHEMES.contains(address.getSpecificURI().getScheme())) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OakIndexDefinitionValidatorFactory.java`
#### Snippet
```java
                return getPathOfNotAllowedIndexDefinition(containerContext);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DependencyValidator.java`
#### Snippet
```java
    @Override
    public Collection<ValidationMessage> done() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedPropertiesValidator.java`
#### Snippet
```java
    @Override
    public Collection<ValidationMessage> done() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
            break;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
            break;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
        ValidationMessage message = null;
        if (containerPackageType == null) {
            return null;
        }
        switch (containerPackageType) {
```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    public Collection<ValidationMessage> validate(@NotNull WorkspaceFilter filter) {
        if (isSubPackage) {
            return null; // not relevant for sub packages
        }
        Collection<ValidationMessage> messages = new LinkedList<>();
```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
            return Collections.singleton(new ValidationMessage(severityForOrphanedFilterEntries, String.format(MESSAGE_ORPHANED_FILTER_ENTRIES, orphanEntries.toString())));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
                    new ValidationMessage(severityForUncoveredAncestorNode,  String.format(MESSAGE_ANCESTOR_NODE_NOT_COVERED, danglingNodePath)));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/commands/AbstractCommand.java`
#### Snippet
```java

    public String getExample() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/examples/HelloWorldApp.java`
#### Snippet
```java
    public Console getConsole() {
        // we do not have interactive console
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/FileArchive.java`
#### Snippet
```java
        public Entry getChild(String name) {
            File child = new File(file, name);
            return child.exists() ? new OsEntry(child) : null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipArchive.java`
#### Snippet
```java
                    return jar.getInputStream(ze);
                } catch (IOException e1) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java

            public InputStream getByteStream() {
                return ve.data == null ? null : new ByteArrayInputStream(ve.data);
            }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
        @Override
        public Entry getChild(String name) {
            return children == null ? null : children.get(name);
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        @Override
        public Entry getChild(String name) {
            return children == null ? null : children.get(name);
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java
                    } else {
                        log.debug("Skipping node {} with unknown type {}.", child.getPath(), child.getPrimaryNodeType().getName());
                        return null;
                    }
                    return new JcrEntry(child, name, isDir);
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java
                    return new JcrEntry(child, name, isDir);
                }
                return null;
            } catch (RepositoryException e) {
                log.error("Error while retrieving child node of {}", node, e);
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java
                    } catch (RepositoryException e) {
                        log.error("Error while opening input stream of " + content, e);
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/SerializationType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            return s.nodeExists(parentPath)
                    ? s.getNode(parentPath)
                    : null;
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            return s.nodeExists(p)
                    ? s.getNode(p)
                    : null;
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            }
            if (!absPath.startsWith(path + "/")) {
                return null;
            }
            absPath = absPath.substring(path.length());
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java

    public String getContentType() {
        return artifact == null ? null : artifact.getContentType();
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
    public Collection<? extends VaultFile> getRelated() throws RepositoryException {
        if (node == null) {
            return null;
        }
        return node.getFiles();
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
            return parent.getControllingAggregate();
        } else {
            return node == null ? null : node.getAggregate();
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java

    public Aggregate getAggregate() {
        return node == null ? null : node.getAggregate();
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
    public String getRepoRelPath() {
        if (artifact == null) {
            return null;
        } else {
            String relPath = artifact.getRelativePath();
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregatorProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SubPackageFilterArchive.java`
#### Snippet
```java
                return new FilterEntry(e, 2);
            } else if (level == 2 && "packages".equals(e.getName())) {
                return null;
            } else {
                return e;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/ArtifactSetImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
        Artifact dir = artifacts.getDirectory();
        if (dir == null || artifacts.size() != 1) {
            return null;
        }
        ImportInfoImpl info = new ImportInfoImpl();
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
    public Exception getError(String path) {
        Info info = infos.get(path);
        return info == null ? null : info.getError();
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
    public NodeNameList getNameList() {
        return infos.isEmpty()
                ? null
                : infos.firstEntry().getValue().getNameList();
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
        Artifact primary = artifacts.getPrimaryData();
        if (primary == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/Lexer.java`
#### Snippet
```java
        } catch (IOException e) {
            fail("IOException while attempting to read input stream", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
    public static ExportRoot findRoot(File cwd) {
        if (cwd == null) {
            return null;
        }
        // find root
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
        if (jcrRoot == null) {
            log.info("could not find " + Constants.ROOT_DIR + " along the ancestors of {}", cwd.getPath());
            return null;
        }
        return new ExportRoot(jcrRoot.getParentFile());
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
        } catch (Exception e) {
            log.warn("Unable to decrypt data: " + e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
        } catch (Exception e) {
            log.warn("Unable to encrypt string: " + e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
            String elem = pathElems[pos];
            if ("..".equals(elem)) {
                return parent == null ? null : parent.getAggregate(pathElems, pos + 1);
            }
            // find suitable leaf
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
                }
            }
            return null;
        }
        return this;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
                return (T) m.invoke(obj);
            } else {
                return null;
            }
        } catch (NoSuchMethodException e) {
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
        } catch (NoSuchMethodException e) {
            log.trace("{} has no field {} or type " + T, obj, name);
            return null;
        } catch (IllegalAccessException e) {
            throw new ConfigurationException("Unable to get list " + name + " of " + obj);
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/FileInputSource.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
    public static String getName(String path, char delim) {
        return path == null
                ? null
                : path.substring(path.lastIndexOf(delim) + 1);
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    public E get(String path) {
        Node<E> n = get(path, false);
        return n == null ? null : n.elem;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
            Node<E> c = n.get(name, create);
            if (c == null) {
                return null;
            }
            n = c;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
        Node<E> n = get(path, false);
        if (n == null) {
            return null;
        }
        E previous = n.elem;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MimeTypes.java`
#### Snippet
```java
        MimeType mt = byMimeType.get(mimeType);
        if (mt == null) {
            return null;
        } else {
            return mt.defaultExt;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                return adapter;
            }
            return parent == null ? null : parent.getAdapter();
        }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryProvider.java`
#### Snippet
```java
        } catch (Exception e) {
            log.error("Unable to initialize JCR logger: {}", e.toString());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
    public String getValue(String name) {
        DocViewProperty prop = props.get(name);
        return prop == null ? null : prop.values[0];
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
    public String[] getValues(String name) {
        DocViewProperty prop = props.get(name);
        return prop == null ? null : prop.values;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/HollowVaultPackage.java`
#### Snippet
```java
    @Override
    public File getFile() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/HollowVaultPackage.java`
#### Snippet
```java
    @Override
    public Archive getArchive() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/HollowVaultPackage.java`
#### Snippet
```java
    @Override
    public MetaInf getMetaInf() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     */
    public File getFile() {
        return (archive instanceof ZipArchive) ? ((ZipArchive) archive).getFile() : null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
            return getArchive().getMetaInf();
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackagePropertiesImpl.java`
#### Snippet
```java
        try {
            Properties props = getPropertiesMap();
            return props == null ? null : props.getProperty(name);
        } catch (Exception e) {
            return null;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackagePropertiesImpl.java`
#### Snippet
```java
            return props == null ? null : props.getProperty(name);
        } catch (Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerMBeanImpl.java`
#### Snippet
```java
    @Override
    protected MBeanConstructorInfo[] getConstructors(MBeanConstructorInfo[] ctors, Object impl) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    public static PackageId fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] segs = str.split(":");
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
        Element childElement = getFirstElementByTagName(TAG_OPTIONS, element);
        if (childElement == null) {
            return null;
        }
        final PackageTaskOptions options;
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
        NodeList nodeList = element.getElementsByTagName(name);
        if (nodeList.getLength() == 0) {
            return null;
        }
        return (Element)nodeList.item(0);
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/ConfigCredentialsStore.java`
#### Snippet
```java
        VaultAuthConfig.RepositoryConfig cfg = config.getRepoConfig(getLookupId(mountpoint));
        if (cfg == null) {
            return null;
        }
        return cfg.getCredsConfig().getCredentials();
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/ConfigCredentialsStore.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
            } else {
                pack.close();
                return null;
            }
        } catch (RepositoryException e) {
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
     */
    public String getGenerator() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        try {
            return acHandling == null
                    ? null
                    : AccessControlHandling.valueOf(acHandling.toUpperCase());
        } catch (IllegalArgumentException e) {
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        } catch (IllegalArgumentException e) {
            log.warn("invalid access control handling in definition: {} of {}", acHandling, getId());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        } catch (RepositoryException e) {
            log.warn("Error during getInstallationPath()", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
    public SubPackageHandling getSubPackageHandling() {
        // not stored
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java

    public MetaInf getMetaInf() {
        return exportRoot.isValid() ? exportRoot.getMetaInf() : null;
    }

```

### ReturnNull
Return of `null`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            if (subPkg == null) {
                log.error("Package {}: Newly extracted subpackage is gone: {}", containerPackageId, subPid);
                return null;
            } else {
                subPackage = (JcrPackageImpl) subPkg.getJcrPackage();
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/ZipMetaDir.java`
#### Snippet
```java
            return new ZipMetaFile(this, name);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/ZipMetaDir.java`
#### Snippet
```java
        InputStream in = zip.getInputStream(ADDRESS_FILE_NAME);
        if (in == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaDir.java`
#### Snippet
```java
            return new FileMetaFile(this, file);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaDir.java`
#### Snippet
```java
            return new FileMetaFile(this, file);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaDir.java`
#### Snippet
```java
            return new FileMetaFile(this, file);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/file/FileMetaDir.java`
#### Snippet
```java
        File mpFile = new File(dir, ADDRESS_FILE_NAME);
        if (!mpFile.canRead()) {
            return null;
        }
        List lines = FileUtils.readLines(mpFile, Constants.ENCODING);
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    public ZipEntry getEntry(String name) {
        if (!file.exists()) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
        } catch (IOException e) {
            log.error("Error while retrieving zip entry {}: {}", name, e.toString());
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    public InputStream getInputStream(String name) throws IOException {
        if (!file.exists()) {
            return null;
        }
        ZipInputStream zin = null;
```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
        IOUtils.closeQuietly(zin);
        IOUtils.closeQuietly(in);
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
        public String getJcrPath() throws RepositoryException {
            if (parentNode == null && node == null) {
                return null;
            }
            return node == null
```

### ReturnNull
Return of `null`
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
            log.info("Filter file missing: {}", filterFile.getAbsolutePath());
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `childNode` is redundant
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
        List<Name> types = getTypes(nameResolver, primaryType, mixinTypes);
        String nodeName = Text.getName(nodeContext.getNodePath());
        JcrNodeTypeMetaDataImpl childNode = addChildNode(nameResolver, effectiveNodeTypeProvider, nodeTypeDefinitionProvider,
                itemDefinitionProvider, false, nodeContext, nodeName, types.toArray(new Name[0]));
        // defer validation
```

### UnnecessaryLocalVariable
Local variable `childNode` is redundant
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider, @NotNull ItemDefinitionProvider itemDefinitionProvider,
            @NotNull NodeContext nodeContext, @Nullable Name implicitNodeType) throws RepositoryException {
        JcrNodeTypeMetaDataImpl childNode = addChildNode(nameResolver, effectiveNodeTypeProvider, nodeTypeDefinitionProvider,
                itemDefinitionProvider, true, nodeContext, Text.getName(nodeContext.getNodePath()), implicitNodeType);
        return childNode;
```

### UnnecessaryLocalVariable
Local variable `modifierRoot` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java

    private TxInfo postFilter(TxInfo root) {
        TxInfo modifierRoot = root;
        if (filter.contains(modifierRoot.path)){
            return modifierRoot;
```

### UnnecessaryLocalVariable
Local variable `principal` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java

        Principal getPrincipal(final String principalName) {
            Principal principal = new Principal() {
                public String getName() {
                    return principalName;
```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Double.compare'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/ValueComparator.java`
#### Snippet
```java
                    return o1.getDecimal().compareTo(o2.getDecimal());
                case PropertyType.DOUBLE:
                    return ((Double) o1.getDouble()).compareTo(o2.getDouble());
                case PropertyType.LONG:
                    return ((Long) o1.getLong()).compareTo(o2.getLong());
```

### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/ValueComparator.java`
#### Snippet
```java
                    return ((Double) o1.getDouble()).compareTo(o2.getDouble());
                case PropertyType.LONG:
                    return ((Long) o1.getLong()).compareTo(o2.getLong());
                default:
                    return o1.getString().compareTo(o2.getString());
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`false && change.isa.getSerializationType() == SerializationType.XML_DOCVIEW` can be simplified to 'false'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    repoPath += repoName;
                    assertInFilter(repoPath);
                    if (false && change.isa.getSerializationType() == SerializationType.XML_DOCVIEW) {
                        // special case that full coverage is below a intermediate
                        // ignore and wait for next cycle
```

### PointlessBooleanExpression
`modified == false` can be simplified to '!modified'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
                binaryValues.add(binaryValue);
                // compare with existing value
                if (modified == false && existingValues != null && n < existingValues.length && existingValues[n] != null) {
                    Binary existingBinary = existingValues[0].getBinary();
                    if (!existingBinary.equals(binaryValue.getBinary())) {
```

### PointlessBooleanExpression
`result == false` can be simplified to '!result'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        try {
            boolean result = getPackageNode(id) != null;
            if (result == false && baseRegistry != null) {
                result = baseRegistry.contains(id);
            }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        types.add(primaryType);
        if (mixinTypes != null) {
            Arrays.stream(mixinTypes).forEach(types::add);
        }
        return new EffectiveNodeType(types);
```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (a.getPreferredAccess()) { case SPOOL: a.spool(out); ...` statement on enum type 'org.apache.jackrabbit.vault.fs.api.AccessType' misses case 'NONE'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
        }
        try (BinaryCheckOutputStream out = new BinaryCheckOutputStream(base)) {
            switch (a.getPreferredAccess()) {
                case SPOOL:
                    a.spool(out);
                    break;
                case STREAM:
                    try (InputStream in = a.getInputStream()) {
                        byte[] buffer = new byte[8192];
                        int read;
                        while ((read = in.read(buffer)) >= 0) {
                            out.write(buffer, 0, read);
                        }
                    }
                    break;
            }
            binary = out.isBinary();
        }
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
    public static final ValidationViolation wrapMessage(String validatorId, ValidationMessage message, Path filePath, Path basePath, String nodePath, int line, int column) {
        if (message instanceof ValidationViolation) {
            ValidationViolation delegate = ValidationViolation.class.cast(message);
            
            // take parameters from underlying violation and only overwrite if not set in delegate
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/TypedMapWrapper.java`
#### Snippet
```java
        return objects.stream().map( o -> {
            if (o instanceof String) {
                return String.class.cast(o);
            }
            throw new IllegalArgumentException("List does not contain out of strings");
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
                throw new IllegalArgumentException("Only equality check for SimpleCredentials supported!");
            }
            SimpleCredentials simpleCredentials = SimpleCredentials.class.cast(credentials);
            SimpleCredentials simpleOtherCredentials = SimpleCredentials.class.cast(otherCredentials);

```

### RedundantClassCall
Redundant call to `cast()`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
            }
            SimpleCredentials simpleCredentials = SimpleCredentials.class.cast(credentials);
            SimpleCredentials simpleOtherCredentials = SimpleCredentials.class.cast(otherCredentials);

            if (!Arrays.equals(simpleCredentials.getPassword(), simpleOtherCredentials.getPassword())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
                            "Unexpected path filter found: " + pathFilterEntry.getFilter() + ". Must be of type DefaultPathFilter!");
                }
                DefaultPathFilter defaultPathFilter = DefaultPathFilter.class.cast(pathFilterEntry.getFilter());
                defaultPathFilter.getPattern();
                if (!isRegexValidForRootPath(defaultPathFilter.getPattern(), pathFilterSet.getRoot())) {
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/EnhancedBufferedInputStream.java`
#### Snippet
```java
    public static InputStream tryUnwrap(InputStream input) {
        while (input instanceof EnhancedBufferedInputStream) {
            input = EnhancedBufferedInputStream.class.cast(input).getDelegate();
        }
        return input;
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ResettableInputStream.java`
#### Snippet
```java
        InputStream unwrappedInput = EnhancedBufferedInputStream.tryUnwrap(currentInput);
        if (unwrappedInput instanceof FileInputStream) {
            FileInputStream fis = FileInputStream.class.cast(unwrappedInput);
            fis.getChannel().position(0);
            currentInput = new EnhancedBufferedInputStream(unwrappedInput);
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
        for (Validator validator : validatorsById.values()) {
            if (validator instanceof AdvancedFilterValidator) {
                AdvancedFilterValidator.class.cast(validator).setFilterValidators(filterValidators);
            }
            if (validator instanceof AdvancedPropertiesValidator) {
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
            }
            if (validator instanceof AdvancedPropertiesValidator) {
                AdvancedPropertiesValidator.class.cast(validator).setPropertiesValidators(propertiesValidators);
            }
            if (validator instanceof DocumentViewParserValidator) {
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
            }
            if (validator instanceof DocumentViewParserValidator) {
                DocumentViewParserValidator.class.cast(validator).setDocumentViewXmlValidators(documentViewXmlValidators);
            }
            if (validator instanceof OsgiConfigurationParserValidator) {
```

### RedundantClassCall
Redundant call to `cast()`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
            }
            if (validator instanceof OsgiConfigurationParserValidator) {
                OsgiConfigurationParserValidator.class.cast(validator).setOsgiConfigurationValidators(osgiConfigurationValidators);
            }
        }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java

    private void persistTasks() {
        Dictionary<String, Object> configProperties = new Hashtable<>();
        try {
            persistTasks(configProperties, dataFile);
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
    public void run() {
        result = new ResultImpl(Result.State.RUNNING);
        log.info("Starting repository copy task id={}. From {} to {}.", new Object[] {
                id, src.toString(), dst
        });
        try {
            rcp.copy(srcSession, src.getPath(), dstSession, dst, recursive);
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
                        }
                    } catch (RepositoryException e) {
                        log.error("Error while adding authorizable '{}' to group '{}': {}", new Object[]{memberId, id, e});
                    }
                }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
                log.warn("unable to add authorizable '{}' to group '{}'. No such node.", uuid, id);
            } catch (RepositoryException e) {
                log.warn("unable to add authorizable '{}' to group '{}'. Internal Error: {}", new Object[]{uuid, id, e});
            }
        }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncResult.java`
#### Snippet
```java
    public void dump() {
        for (Entry e: byFsPath.values()) {
            log.info("SyncResult: fs={} jcr={} ops={}", new Object[]{e.fsPath, e.jcrPath, e.ops});
        }
    }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    private void onChange(File file, String type) {
        boolean accept = fileFilter.accept(file);
        log.debug("{}({}), accepted={}", new Object[]{type, file.getAbsolutePath(), accept});
        if (!accept) {
            return;
```

## RuleId[id=UnnecessaryEmptyArrayUsage]
### UnnecessaryEmptyArrayUsage
Zero length array can be changed to constant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/CompositePackageRegistry.java`
#### Snippet
```java
            }
        }
        return dependentPackageIds.toArray(new PackageId[0]);
    }

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
                break;
            case PRINCIPAL_SET_POLICY:
                state = importPolicy.append(state, node);
                break;
            case ERROR:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineOutputStream.java`
#### Snippet
```java
                    break;
                case STATE_CRLF:
                    flush(true);
                    state = STATE_LF;
            }
        } else if (b == 0x0d) {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineOutputStream.java`
#### Snippet
```java
                    break;
                case STATE_CRLF:
                    flush(true);
                    state = STATE_CR;
            }
        } else {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            case CONFLICTED:
                // do not probe further
                return FileAction.CONFLICTED;

            case DELETED:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java

            case VOID:
                return FileAction.ADDED;

            default:
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get("/")`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        // validate any outstanding nodes
        try {
            return finalizeValidationForSubtree(getNode("/").orElseThrow(() -> new IllegalStateException("Cannot get root node")), new NodeContextImpl("/", Paths.get("/"), Paths.get("/")));
        } catch (NamespaceException e) {
            throw new IllegalStateException("Can not print qualified path", e);
```

### DuplicateExpressions
Multiple occurrences of `Paths.get("/")`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        // validate any outstanding nodes
        try {
            return finalizeValidationForSubtree(getNode("/").orElseThrow(() -> new IllegalStateException("Cannot get root node")), new NodeContextImpl("/", Paths.get("/"), Paths.get("/")));
        } catch (NamespaceException e) {
            throw new IllegalStateException("Can not print qualified path", e);
```

### DuplicateExpressions
Multiple occurrences of `Paths.get("")`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
    public static @NotNull JcrNodeTypeMetaDataImpl createRoot(boolean isIncremental, @NotNull EffectiveNodeTypeProvider effectiveNodeTypeProvider)
            throws ConstraintViolationException, NoSuchNodeTypeException {
        return new JcrNodeTypeMetaDataImpl(isIncremental, new NodeContextImpl("", Paths.get(""), Paths.get("")),
            NameConstants.ROOT, NameConstants.REP_ROOT, effectiveNodeTypeProvider.getEffectiveNodeType(
                new Name[] {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get("")`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
    public static @NotNull JcrNodeTypeMetaDataImpl createRoot(boolean isIncremental, @NotNull EffectiveNodeTypeProvider effectiveNodeTypeProvider)
            throws ConstraintViolationException, NoSuchNodeTypeException {
        return new JcrNodeTypeMetaDataImpl(isIncremental, new NodeContextImpl("", Paths.get(""), Paths.get("")),
            NameConstants.ROOT, NameConstants.REP_ROOT, effectiveNodeTypeProvider.getEffectiveNodeType(
                new Name[] {
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuffer info` can be replaced with 'String'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                rep = repProvider.getRepository(new RepositoryAddress(uri), options);
                setProperty(KEY_URI, uri);
                StringBuffer info = new StringBuffer();
                info.append(rep.getDescriptor(Repository.REP_NAME_DESC)).append(' ');
                info.append(rep.getDescriptor(Repository.REP_VERSION_DESC));
```

### StringBufferReplaceableByString
`StringBuilder str` can be replaced with 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitPrivilegeInstaller.java`
#### Snippet
```java

    private String getJCRName(Name name) {
        StringBuilder str = new StringBuilder("{");
        str.append(name.getNamespaceURI());
        str.append("}");
```

### StringBufferReplaceableByString
`StringBuffer buf` can be replaced with 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AbstractArtifact.java`
#### Snippet
```java
     */
    public String toString() {
        StringBuffer buf = new StringBuffer(type.toString());
        buf.append('(').append(repoRelPath).append(')');
        return buf.toString();
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
             } else  if (now-lastLogged > 5000 || flush) {
                lastLogged = now;
                String str = new StringBuilder("Aggregation status: ")
                        .append(numPrepared).append(" of ")
                        .append(numCreated).append(" prepared, ")
```

### StringBufferReplaceableByString
`StringBuffer n` can be replaced with 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
            Value[] values = prop.getValues();
            for (int i=0; i<values.length; i++) {
                StringBuffer n = new StringBuffer(relPath);
                n.append('[').append(i).append(']');
                list.add(new PropertyValueArtifact(parent, n.toString(), ext, type, prop, i, lastModified));
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Node");
            sb.append("{name='").append(name).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Entry");
            sb.append("{fsName='").append(file.getName()).append('\'');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SyncSpec");
        sb.append("{fileRoot=").append(fileRoot);
```

### StringBufferReplaceableByString
`StringBuffer buf` can be replaced with 'String'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java
     */
    private void dump(int b, int l, int r, String prefix, int i, Document doc) {
        StringBuffer buf = new StringBuffer();
        buf.append("(").append(b);
        buf.append(", ").append(l);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `modified |= prop.apply(node)`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                // check if property is allowed
                try {
                    modified |= prop.apply(node);
                } catch (RepositoryException e) {
                    try {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `modified |= prop.apply(node)`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                        // try again with checked out node
                        vs.ensureCheckedOut();
                        modified |= prop.apply(node);
                    } catch (RepositoryException e1) {
                        // be lenient in case of mode != replace
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `allTypesMatch &= sibling.isNodeType(requiredPrimaryNodeType.getName())`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                // check type: due to inheritance multiple primary node types need to be checked
                for (NodeType requiredPrimaryNodeType : requiredPrimaryNodeTypes) {
                    allTypesMatch &= sibling.isNodeType(requiredPrimaryNodeType.getName());
                }
                // check name
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasConflicts |= conflict`
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff3.java`
#### Snippet
```java
            // and create new hunk
            hunk = new Hunk3(baseRange, leftRange, rightRange, hunk);
            hasConflicts |= conflict;
            //System.out.println(hunks.getLast().toString());
        } /* while */
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/TypedMapWrapper.java`
#### Snippet
```java
    }

    private <T> Optional<T> getTyped(String key, Class<T> clazz) {
        Object object = get(key);
        if (clazz.isInstance(object)) {
```

### BoundedWildcard
Can generalize to `? extends PathFilterSet`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OakIndexDefinitionValidator.java`
#### Snippet
```java
    }

    public Collection<ValidationMessage> collectIndexPaths(List<PathFilterSet> pathFilters) {
        Collection<ValidationMessage> violations = new LinkedList<>();
        for (PathFilterSet pathFilter : pathFilters) {
```

### BoundedWildcard
Can generalize to `? extends PackageInfo`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DependencyValidator.java`
#### Snippet
```java
    private final ValidationMessageSeverity severityForUnresolvedDependencies;
    
    public DependencyValidator(@NotNull ValidationMessageSeverity severity, ValidationMessageSeverity severityForUnresolvedDependencies, Collection<PackageInfo> dependenciesMetaInfo) {
        this.dependenciesMetaInfo = dependenciesMetaInfo;
        this.severity = severity;
```

### BoundedWildcard
Can generalize to `? extends PropertiesValidator`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedPropertiesValidator.java`
#### Snippet
```java
    }

    public void setPropertiesValidators(Map<String, PropertiesValidator> propertiesValidators) {
        this.propertiesValidators.putAll(propertiesValidators);
    }
```

### BoundedWildcard
Can generalize to `? extends DocumentViewXmlValidator`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DocumentViewParserValidator.java`
#### Snippet
```java
    }

    public void setDocumentViewXmlValidators(Map<String, DocumentViewXmlValidator> documentViewXmlValidators) {
        this.docViewValidators.putAll(documentViewXmlValidators);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DocumentViewParserValidator.java`
#### Snippet
```java

    protected Collection<ValidationMessage> validateDocumentViewXml(InputStream input, @NotNull Path filePath, @NotNull Path basePath, String rootNodePath,
            Map<String, Integer> nodePathsAndLineNumbers) throws IOException {
        List<ValidationMessage> enrichedMessages = new LinkedList<>();
        enrichedMessages.add(new ValidationMessage(ValidationMessageSeverity.DEBUG, "Detected DocView..."));
```

### BoundedWildcard
Can generalize to `? super Integer`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DocumentViewParserValidator.java`
#### Snippet
```java

    protected Collection<ValidationMessage> validateDocumentViewXml(InputStream input, @NotNull Path filePath, @NotNull Path basePath, String rootNodePath,
            Map<String, Integer> nodePathsAndLineNumbers) throws IOException {
        List<ValidationMessage> enrichedMessages = new LinkedList<>();
        enrichedMessages.add(new ValidationMessage(ValidationMessageSeverity.DEBUG, "Detected DocView..."));
```

### BoundedWildcard
Can generalize to `? extends PathFilterSet`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    }

    private Collection<ValidationMessage> validatePathFilterSets(Collection<PathFilterSet> pathFilterSets, boolean checkRoots) {
        Collection<ValidationMessage> messages = new LinkedList<>();
        for (PathFilterSet pathFilterSet : pathFilterSets) {
```

### BoundedWildcard
Can generalize to `? extends PackageInfo`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    private final Map<PathFilterSet, List<Entry<PathFilter>>> orphanedFilterSets;

    public AdvancedFilterValidator(@NotNull DocumentBuilderFactory factory, @NotNull ValidationMessageSeverity defaultSeverity, @NotNull ValidationMessageSeverity severityForUncoveredAncestorNodes, @NotNull ValidationMessageSeverity severityForUndefinedFilterRootAncestors, @NotNull ValidationMessageSeverity severityForOrphanedFilterEntries, boolean isSubPackage, @NotNull Collection<PackageInfo> dependenciesMetaInfo, @NotNull WorkspaceFilter filter, @NotNull Collection<String> validRoots) {
        this.factory = factory;
        this.isSubPackage = isSubPackage;
```

### BoundedWildcard
Can generalize to `? extends FilterValidator`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    }

    public void setFilterValidators(Map<String, FilterValidator> filterValidators) {
        this.filterValidators.putAll(filterValidators);
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    }

    private void persistTasks(Dictionary<String, Object> configProperties, File dataFile) throws RepositoryException, JsonGenerationException, JsonMappingException, IOException {
        serializedTasks = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tasks);
        configProperties.put(PROP_TASKS_SERIALIZATION, serializedTasks);
```

### BoundedWildcard
Can generalize to `? extends RcpTaskImpl`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
    }

    private void loadTasksCredentials(Map<String, RcpTaskImpl> tasks, File dataFile) throws IOException {
        Properties props = new Properties();
        try (FileInputStream inputStream = new FileInputStream(dataFile)) {
```

### BoundedWildcard
Can generalize to `? super Reader`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/util/classloaderurl/URLFactory.java`
#### Snippet
```java
    }

    public static void processUrlStreams(List<String> urls, Consumer<Reader> readerProcessor) {
        for (String url : urls) {
            try (Reader reader = new InputStreamReader(URLFactory.createURL(url).openStream(), StandardCharsets.US_ASCII)) {
```

### BoundedWildcard
Can generalize to `? extends OsgiConfigurationValidator`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
    }

    public void setOsgiConfigurationValidators(Map<String, OsgiConfigurationValidator> osgiConfigurationValidators) {
        this.osgiConfigurationValidators.putAll(osgiConfigurationValidators);
    }
```

### BoundedWildcard
Can generalize to `? extends DocViewProperty2`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ValidatorDocViewParserHandler.java`
#### Snippet
```java
    }

    private void validatePropertyValues(Collection<DocViewProperty2> properties, String nodePath, int lineNumber, int columnNumber) {
        for (DocViewProperty2 property : properties) {
            if (property.getType() != PropertyType.UNDEFINED) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
    }

    static <@NotNull T> @NotNull Map<@NotNull String, @NotNull T> filterValidatorsByClass(@NotNull Map<@NotNull String, @NotNull Validator> allValidators, @NotNull Class<T> type) {
        return allValidators.entrySet().stream()
                .filter(x -> type.isInstance(x.getValue()))
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
    }

    private void writeNodeType(NodeType nt, CNDWriter w, Set<String> written)
            throws IOException, RepositoryException {
        if (nt != null && !written.contains(nt.getName())) {
```

### BoundedWildcard
Can generalize to `? extends QNodeTypeDefinition`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java

    public DefaultNodeTypeSet(String systemId,
                              Collection<QNodeTypeDefinition> nodeTypes,
                              NamespaceMapping nsMapping) {
        this.systemId = systemId;
```

### BoundedWildcard
Can generalize to `? extends QNodeTypeDefinition`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
    }

    public void add(Collection<QNodeTypeDefinition> set, NamespaceMapping nsMapping) {
        for (QNodeTypeDefinition tpl: set) {
            log.trace("adding {}", tpl.getName());
```

### BoundedWildcard
Can generalize to `? extends QNodeTypeDefinition`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/DefaultCNDWriter.java`
#### Snippet
```java
    }

    public void write(Collection<QNodeTypeDefinition> nts) throws IOException {
        w.write(nts);
    }
```

### BoundedWildcard
Can generalize to `? extends TxInfo`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
    }

    private void commit(Session session, TxInfo info, LinkedList<TxInfo> skipList) throws RepositoryException, IOException {
        try {
            ImportInfo imp = null;
```

### BoundedWildcard
Can generalize to `? super Entry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SubPackageFilterArchive.java`
#### Snippet
```java
    }

    private void findSubPackageEntries(@NotNull List<Entry> entries, @NotNull Entry folder) {
        for (Archive.Entry e: folder.getChildren()) {
            final String name = e.getName();
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JcrSysViewTransformer.java`
#### Snippet
```java
    }

    private void addPaths(List<String> paths, Node node) throws RepositoryException {
        paths.add(node.getPath());
        NodeIterator iter = node.getNodes();
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        void convertRestrictions(JackrabbitAccessControlList acl, ValueFactory vf, NameResolver resolver, Map<String, Value> svRestrictions, Map<String, Value[]> mvRestrictions) throws RepositoryException {
            for (String restName : acl.getRestrictionNames()) {
                DocViewProperty2 restriction = restrictions.get(resolver.getQName(restName));
```

### BoundedWildcard
Can generalize to `? super Value`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        void convertRestrictions(JackrabbitAccessControlList acl, ValueFactory vf, NameResolver resolver, Map<String, Value> svRestrictions, Map<String, Value[]> mvRestrictions) throws RepositoryException {
            for (String restName : acl.getRestrictionNames()) {
                DocViewProperty2 restriction = restrictions.get(resolver.getQName(restName));
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        void convertRestrictions(JackrabbitAccessControlList acl, ValueFactory vf, NameResolver resolver, Map<String, Value> svRestrictions, Map<String, Value[]> mvRestrictions) throws RepositoryException {
            for (String restName : acl.getRestrictionNames()) {
                DocViewProperty2 restriction = restrictions.get(resolver.getQName(restName));
```

### BoundedWildcard
Can generalize to `? extends T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        T getApplicablePolicy(Class<T> clz) throws RepositoryException {
            AccessControlPolicyIterator iter = acMgr.getApplicablePolicies(accessControlledPath);
            while (iter.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
    }

    private void addPathIfExists(List<String> paths, String path) throws RepositoryException {
        if (session.nodeExists(path)) {
            paths.add(path);
```

### BoundedWildcard
Can generalize to `? extends T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        T getPolicy(Class<T> clz, Principal principal) throws RepositoryException {
            if (acMgr instanceof JackrabbitAccessControlManager) {
                for (AccessControlPolicy p : ((JackrabbitAccessControlManager) acMgr).getPolicies(principal)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        T getPolicy(Class<T> clz) throws RepositoryException {
            for (AccessControlPolicy p : acMgr.getPolicies(accessControlledPath)) {
                if (clz.isAssignableFrom(p.getClass())) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
        }

        T getApplicablePolicy(Class<T> clz, Principal principal) throws RepositoryException {
            if (acMgr instanceof JackrabbitAccessControlManager) {
                for (AccessControlPolicy p : ((JackrabbitAccessControlManager) acMgr).getApplicablePolicies(principal)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java


    private boolean processChange(Change change, Map<String, TxInfo> modified, boolean ignoreMP)
            throws RepositoryException, IOException {
        switch (change.type) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs.
     */
    private void walk(AggregateWalkListener aggregateWalkListener, String relativePath, Iterable<Node> children, int depth,
            boolean hasOrderableChildNodes) throws RepositoryException {
        for (Node child : children) {
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
    }

    private void addNamespace(Set<String> prefixes, String name) throws RepositoryException {
        int idx = name.indexOf(':');
        if (idx > 0) {
```

### BoundedWildcard
Can generalize to `? super T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
    }

    private static <T extends ItemDefinition> Optional<T> getApplicableItemDefinition(List<T> itemDefinitions, Predicate<T> predicate, @Nullable String name) {
        final Predicate<ItemDefinition> namePredicate;
        if (name != null) {
```

### BoundedWildcard
Can generalize to `? extends NodeType`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
    private final @NotNull List<NodeType> nodeTypes;

    private EffectiveNodeType(@NotNull List<NodeType> nodeTypes) {
        this.nodeTypes = nodeTypes;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    }

    private void fill(Map<String, E> map, Node<E> node, String parentPath) {
        String path;
        if (parentPath.length() != 1) {
```

### BoundedWildcard
Can generalize to `? super E`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    }

    private void fill(Map<String, E> map, Node<E> node, String parentPath) {
        String path;
        if (parentPath.length() != 1) {
```

### BoundedWildcard
Can generalize to `? extends DocViewProperty2`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
    }

    private void logIgnoredProtectedProperties(EffectiveNodeType effectiveNodeType, String nodePath, Collection<DocViewProperty2> properties, Set<Name> importedProtectedProperties) {
        // logging for protected properties which are not considered during import
        properties.stream()
```

### BoundedWildcard
Can generalize to `? extends Property`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
    }

    public static @NotNull DocViewNode2 fromNode(@NotNull Node node, boolean isRoot, @NotNull Iterable<Property> properties, boolean useBinaryReferences) throws RepositoryException {
        NameResolver nameResolver = new ParsingNameResolver(NameFactoryImpl.getInstance(), new SessionNamespaceResolver(node.getSession()));
        final Name nodeName;
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
    }

    private static void resolve(Dependency[] deps, Map<PackageId, Dependency[]> list, Map<PackageId, Boolean> result)
            throws CyclicDependencyException {
        // find the dep in the list
```

### BoundedWildcard
Can generalize to `? extends PackageRegistry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackagingImpl.java`
#### Snippet
```java
    }

    private static boolean setBaseRegistry(JcrPackageRegistry jcrPackageRegistry, List<PackageRegistry> otherRegistries) {
        if (!otherRegistries.isEmpty()) {
            jcrPackageRegistry.setBaseRegistry(otherRegistries.get(0));
```

### BoundedWildcard
Can generalize to `? super String`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     */
    protected void extract(InstallContextImpl ctx,
                           List<String> subPackages)
            throws RepositoryException, PackageException {
        log.debug("Extracting {}", getId());
```

### BoundedWildcard
Can generalize to `? extends PathFilterSet`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static PathFilterSet getSetForRoot(List<PathFilterSet> filterSets, String root) {
        for (PathFilterSet set : filterSets) {
            if (set.getRoot().equals(root)) {
```

### BoundedWildcard
Can generalize to `? extends FilterSet.Entry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
    }

    private static void saveRules(Node setNode, List<FilterSet.Entry<PathFilter>> entries, String propertyName) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
        List<String> rules = new LinkedList<>();
        for (FilterSet.Entry<PathFilter> e: entries) {
```

### BoundedWildcard
Can generalize to `? extends PathFilterSet`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java


    private static void savePathFilterSet(List<PathFilterSet> pathFilterSets, List<PathFilterSet> propertyFilterSets, Node filterNode) throws RepositoryException {
        int no = 0;
        for (PathFilterSet set: pathFilterSets) {
```

### BoundedWildcard
Can generalize to `? super T`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private <T> void readOption(Element element, String tagName, Class<T> type, Consumer<T> consumer) {
        Element childElement = getFirstElementByTagName(tagName, element);
        if (childElement != null) {
```

### BoundedWildcard
Can generalize to `? extends PackageTask`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanImpl.java`
#### Snippet
```java
    private Session session;

    public ExecutionPlanImpl(List<PackageTask> tasks) {
        this.tasks.addAll(tasks);
    }
```

### BoundedWildcard
Can generalize to `? extends PackageRegistry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/CompositePackageRegistry.java`
#### Snippet
```java
    }

    public CompositePackageRegistry(List<PackageRegistry> registries) throws IOException {
        this.registries = registries;
        this.primaryRegistry = registries.get(0);
```

### BoundedWildcard
Can generalize to `? extends PackageRegistry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/CompositePackageRegistry.java`
#### Snippet
```java
    }

    private void enforcePackageIdsUniqueness(List<PackageRegistry> registries) throws IOException {
        for (int n=0; n<registries.size(); n++) {
            for (int i=n+1; i<registries.size(); i++) {
```

### BoundedWildcard
Can generalize to `? super JcrPackage`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    private void listPackages(Node root, List<JcrPackage> packages,
                              WorkspaceFilter filter, boolean built, boolean shallow)
            throws RepositoryException {
```

### BoundedWildcard
Can generalize to `? extends Dependency`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    }

    public FSInstallState withDependencies(Set<Dependency> dependencies) {
        this.dependencies = dependencies == null
                ? Collections.<Dependency>emptySet()
```

### BoundedWildcard
Can generalize to `? extends PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    }

    public FSInstallState withSubPackages(Map<PackageId, SubPackageHandling.Option> subPackages) {
        this.subPackages = subPackages == null
                ? Collections.<PackageId, SubPackageHandling.Option>emptyMap()
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    private void listPackages(Node root, Set<PackageId> packages) throws RepositoryException {
        for (NodeIterator iter = root.getNodes(); iter.hasNext();) {
            Node child = iter.nextNode();
```

### BoundedWildcard
Can generalize to `? extends PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
     * @throws RepositoryException if an error occurs
     */
    void setSubPackages(Collection<PackageId> subPackageIds) throws RepositoryException {
        String[] subIds = new String[subPackageIds.size()];
        int i =0;
```

### BoundedWildcard
Can generalize to `? extends PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java

    @Override
    public ExecutionPlanBuilder with(Set<PackageId> externalPackages) {
        this.externalPackages = new HashSet<>(externalPackages);
        return ExecutionPlanBuilderImpl.this;
```

### BoundedWildcard
Can generalize to `? super PackageTask`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveInstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> installTasks, Set<PackageId> resolved, PackageTask.Type type, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveInstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> installTasks, Set<PackageId> resolved, PackageTask.Type type, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveInstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> installTasks, Set<PackageId> resolved, PackageTask.Type type, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super PackageTask`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveUninstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> uninstallTasks, Set<PackageId> resolved, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveUninstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> uninstallTasks, Set<PackageId> resolved, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
    }

    private void resolveUninstall(PackageId id, List<PackageTask> packageTasks, Map<PackageId, PackageTask> uninstallTasks, Set<PackageId> resolved, @Nullable PackageTaskOptions option) throws IOException, PackageException {
        if (resolved.contains(id)) {
            throw new CyclicDependencyException("Package has cyclic dependencies: " + id);
```

### BoundedWildcard
Can generalize to `? super Archive.Entry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
    }

    private void findSubPackageEntries(@NotNull List<Archive.Entry> entries, @NotNull Archive.Entry folder) {
        for (Archive.Entry e: folder.getChildren()) {
            final String name = e.getName();
```

### BoundedWildcard
Can generalize to `? extends File`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/VltTree.java`
#### Snippet
```java
    }

    public void addAll(Collection<File> localFiles) throws IOException, VltException {
        for (File file: localFiles) {
            add(file);
```

### BoundedWildcard
Can generalize to `? super PackageId`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @throws PackageExistsException
     */
    private void registerSubPackages(VaultPackage vltPkg, Archive.Entry directory, String parentPath, boolean replace, Map<PackageId, SubPackageHandling.Option> subpackages, Dependency autoDependency)
            throws IOException, PackageExistsException {
        Collection<? extends Archive.Entry> files = directory.getChildren();
```

### BoundedWildcard
Can generalize to `? super SubPackageHandling.Option`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @throws PackageExistsException
     */
    private void registerSubPackages(VaultPackage vltPkg, Archive.Entry directory, String parentPath, boolean replace, Map<PackageId, SubPackageHandling.Option> subpackages, Dependency autoDependency)
            throws IOException, PackageExistsException {
        Collection<? extends Archive.Entry> files = directory.getChildren();
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ConnectionOptionsMixin` has no concrete subclass
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/ConnectionOptionsMixin.java`
#### Snippet
```java
        creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class ConnectionOptionsMixin {
    @JsonCreator
    public ConnectionOptionsMixin(
```

### AbstractClassNeverImplemented
Abstract class `SimpleCredentialsMixin` has no concrete subclass
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/SimpleCredentialsMixin.java`
#### Snippet
```java
        creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class SimpleCredentialsMixin {
    @JsonCreator
    public SimpleCredentialsMixin(@JsonProperty("userID")String userID, @JsonProperty("password")char[] password) {}
```

### AbstractClassNeverImplemented
Abstract class `RepositoryCopierMixin` has no concrete subclass
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryCopierMixin.java`
#### Snippet
```java
        creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class RepositoryCopierMixin {
    @JsonCreator
    public RepositoryCopierMixin() {}
```

### AbstractClassNeverImplemented
Abstract class `RepositoryAddressMixin` has no concrete subclass
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryAddressMixin.java`
#### Snippet
```java
        creatorVisibility = JsonAutoDetect.Visibility.NONE,
        fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class RepositoryAddressMixin {
    @JsonCreator
    public RepositoryAddressMixin(@JsonProperty("uri")@NotNull URI uri) {}
```

### AbstractClassNeverImplemented
Abstract class `AbstractDependencyResolver` has no concrete subclass
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
 * This class is not thread-safe.
 */
public abstract class AbstractDependencyResolver implements DependencyResolver {

    /**
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsConsoleExecutionContext.java`
#### Snippet
```java
 *
 */
abstract public class VaultFsConsoleExecutionContext extends ConsoleExecutionContext {

    protected static Logger log = LoggerFactory.getLogger(VaultFsConsoleExecutionContext.class);
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
    }

    abstract protected int getFormatFlags(VaultFsConsoleExecutionContext ctx, CommandLine cl);

    abstract protected void formatFile(ConsoleFile file, Table.Row row, int flags);
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
 *
 */
abstract public class AbstractCmdLs extends AbstractJcrFsCommand {

    protected static final int F_MASK = 0x0f;
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
    abstract protected int getFormatFlags(VaultFsConsoleExecutionContext ctx, CommandLine cl);

    abstract protected void formatFile(ConsoleFile file, Table.Row row, int flags);

    private void ls(ConsoleFile file, int flags, int maxDepth)
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractVaultCommand.java`
#### Snippet
```java
    }

    abstract protected void doExecute(VaultFsApp app, CommandLine cl) throws Exception;
}
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractJcrFsCommand.java`
#### Snippet
```java
    }

    abstract protected void doExecute(VaultFsConsoleExecutionContext ctx, CommandLine cl)
            throws Exception;

```

### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/extended/ExtendedOption.java`
#### Snippet
```java
 * {@code ExtendedOption}...
 */
abstract public class ExtendedOption implements CliCommand {

    abstract public String getSystemPrefix();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/extended/ExtendedOption.java`
#### Snippet
```java
abstract public class ExtendedOption implements CliCommand {

    abstract public String getSystemPrefix();

    private final Option option = new DefaultOptionBuilder()
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
     * the (virtual) jcr root. 
     */
    public final static String JCR_ROOT = "/jcr:root";

    /**
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/Registry.java`
#### Snippet
```java
    private final Map<String, Class<? extends ArtifactHandler>> handlers;

    public synchronized static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
 */
@ProviderType
abstract public class AbstractConfig {

    protected static Logger log = LoggerFactory.getLogger(AbstractConfig.class);
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    }
  
    abstract protected void doWrite(ContentHandler handler) throws SAXException;
    
    protected void write(XMLStreamWriter writer) throws XMLStreamException {
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    }

    abstract protected void doWrite(XMLStreamWriter writer) throws XMLStreamException;
}
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    protected double version = getSupportedVersion();

    abstract protected String getRootElemName();

    abstract protected double getSupportedVersion();
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    }

    abstract protected void doLoad(Element child) throws ConfigurationException;

    public boolean load(File configFile) throws IOException, ConfigurationException {
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    abstract protected String getRootElemName();

    abstract protected double getSupportedVersion();

    public void load(Element doc) throws ConfigurationException {
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
     * key length
     */
    private final static int KEY_LENGTH = 8;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
     * encryption prefix
     */
    private final static String PREFIX = "{DES}";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/SHA1.java`
#### Snippet
```java
public class SHA1 {

    public final static SHA1 NULL = new SHA1(0,0,0,0,0);

    private final int w0;
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
     * Archive root path for packages
     */
    public final static String ARCHIVE_PACKAGE_ROOT_PATH = "/jcr_root" + DEFAULT_PACKAGE_ROOT_PATH;
    
    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
     * root path for packages
     */
    public final static String ARCHIVE_PACKAGE_ROOT_PATH = "/jcr_root/etc/packages";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(PackageTaskImpl.class);

    final static PackageTaskImpl MARKER = new PackageTaskImpl(new PackageId("", "" ,""), Type.INSTALL, null);

    private final PackageId id;
```

### MissortedModifiers
Missorted modifiers `final static`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * suggested folder types
     */
    private final static String[] FOLDER_TYPES = {"sling:Folder", "nt:folder", "nt:unstructured", null};

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/AbstractAction.java`
#### Snippet
```java
 *
 */
abstract public class AbstractAction implements Action {

    private boolean onlyControlled;
```

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `InstallHookProcessorFactory`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
        }
        // try to find any hooks
        InstallHookProcessor hooks = opts instanceof InstallHookProcessorFactory ?
                ((InstallHookProcessorFactory) opts).createInstallHookProcessor()
                : new InstallHookProcessorImpl();
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
        boolean isAtomicCounter = false;
        for (String mixin : ni.getMixinTypes()) {
            if ("mix:atomicCounter".equals(mixin)) {
                isAtomicCounter = true;
            }
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
        waitLock.lock();
        try {
            while (enabled) {
                SyncHandler[] specs = syncHandlers;
                try {
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 1)
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                    loggedUnknownNodeTypeMessages.add(e.getMessage());
                    return Collections.singleton(new ValidationMessage(severityForUnknownNodeTypes,
                            String.format(MESSAGE_UNKNOWN_NODE_TYPE_OR_NAMESPACE, e.getMessage(), nodeContext)));
                }
            } catch (RepositoryException e) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
                // ignore
            }
            super.setContentType(ct);
        }
        return ct;
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
                Object data = property.getStringValue()
                        .map(v -> OsgiConfigurationParserValidator.convertValue(v, property.getType()))
                        .orElse(Optional.empty())
                        .orElse(null);
                if (data != null) {
```

### SimplifyOptionalCallChains
Null check can be eliminated with 'ifPresent'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
                        .map(v -> OsgiConfigurationParserValidator.convertValue(v, property.getType()))
                        .orElse(Optional.empty())
                        .orElse(null);
                if (data != null) {
                    configurationMap.put(property.getName().getLocalName(), data);
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
            String key = (String) iter.next();
            if (!props.containsKey(key)) {
                props.put(key, globalEnv.getProperty(key));
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java

    public void setProperty(String name, Calendar value) {
        properties.put(name, ISO8601.format(value));
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java

    public void setProperty(String name, String value) {
        properties.put(name, value);
    }

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryProvider.java`
#### Snippet
```java
                String name = o.toString();
                if (name.startsWith("jcrlog.")) {
                    props.put(name.substring("jcrlog.".length()), System.getProperty(name));
                }
            }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        for (int i = 0; i < attributes.getLength(); i++) {
            Attr attr = (Attr) attributes.item(i);
            properties.put(attr.getNodeName(), attr.getNodeValue());
        }
        return properties;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
            props.remove(name);
        } else {
            props.put(name, ISO8601.format(value));
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
            props.remove(name);
        } else {
            props.put(name, value);
        }
    }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            String ct = info.getContentType();
            if (ct != null) {
                props.put(PROP_CONTENT_TYPE, ct);
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/PropList.java`
#### Snippet
```java
        } else {
            for (Object name: props.keySet()) {
                String value = (String) props.get(name);
                dir.getContext().printMessage("  " + name + "=" + value);
            }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/ParseException.java`
#### Snippet
```java
     * {@inheritDoc}
     */
    public String toString() {
        return super.toString(); // + " (" + systemId + ", line " + lineNumber +", col " + colNumber +")";
    }
```

### EmptyMethod
The method is empty
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
     */
    @Deprecated
    public void markMissing(@NotNull String path) {
    }

```

### EmptyMethod
The method is empty
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
     */
    @Deprecated
    public void markResolved(@NotNull String path) {
    }

```

### EmptyMethod
The method is empty
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
    }

    private void doPrepareFailed(InstallContext ctx) {
        // this is invoked when any of the hooks (including our self) threw a
        // package exception during prepare
```

### EmptyMethod
The method is empty
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
    }

    private void doEnd(InstallContext ctx) {
        // here we could clean up any allocated resources
    }
```

### EmptyMethod
The method is empty
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
    }

    private void doInstallFailed(InstallContext ctx) {
        // this is called when installation failed
    }
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Variable is not used
in `Jenkinsfile`
#### Snippet
```java
 */
// use the shared library from https://github.com/apache/jackrabbit-filevault-jenkins-lib
@Library('filevault@master') _

vaultPipeline('ubuntu', 11, '3', {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-davex/src/main/java/org/apache/jackrabbit/vault/davex/DAVExRepositoryFactory.java`
#### Snippet
```java
    private final Map<String, Integer> depthMap = new HashMap<String, Integer>();

    private int defaultDepth = 0;

    public int getDepth(Path path, PathResolver resolver) throws NamespaceException {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
     * indicates console is running
     */
    private boolean running = false;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
        private Table.Col[] cols;

        private int pos = 0;
        public Row(int numCols) {
            cols = new Table.Col[numCols];
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/CliHelpFormatter.java`
#### Snippet
```java
    private boolean showUsage = true;

    private boolean skipToplevel = false;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
     * number of modified nodes to wait for a save retry (only set to a value != 0 after failed save).
     */
    private int failedSaveThreshold = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
    private byte[] lineFeed = null;

    private MD5 md5 = null;

    private long length;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
    private final MessageDigest digest;

    private byte[] lineFeed = null;

    private MD5 md5 = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private PathMapping pathMapping = null;

    private DependencyHandling dependencyHandling = null;

    private IdConflictPolicy idConflictPolicy = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private boolean patchKeepInRepo = true;

    private boolean nonRecursive = false;

    private boolean dryRun;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private Pattern cndPattern = Pattern.compile("^/(apps|libs)/([^/]+/){1,2}nodetypes/.+\\.cnd$");

    private WorkspaceFilter filter = null;

    private ClassLoader hookClassLoader;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private AccessControlHandling acHandling = null;

    private AccessControlHandling cugHandling = null;

    private ImportMode importMode;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private int autoSaveThreshold = -1;

    private AccessControlHandling acHandling = null;

    private AccessControlHandling cugHandling = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private IdConflictPolicy idConflictPolicy = null;

    private Boolean overwritePrimaryTypesOfFolders = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private DependencyHandling dependencyHandling = null;

    private IdConflictPolicy idConflictPolicy = null;

    private Boolean overwritePrimaryTypesOfFolders = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
    private ClassLoader hookClassLoader;

    private PathMapping pathMapping = null;

    private DependencyHandling dependencyHandling = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
    private final DefaultMetaInf inf;

    private boolean cacheMetaOnly = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     * general flag that indicates if the import had (recoverable) errors
     */
    private boolean hasErrors = false;

    /** If {@link #hasErrors} = {@code true} this one contains the first exception during package import */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        private Map<String, TxInfo> children;

        private byte isIntermediate = 0;

        private NodeNameList nameList;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java

    /** If {@link #hasErrors} = {@code true} this one contains the first exception during package import */
    private Exception firstException = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SerializerArtifact.java`
#### Snippet
```java

            return new VaultInputSource() {
                private InputStream in = null;
                private long size = -1;
                @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JcrSysViewTransformer.java`
#### Snippet
```java
    private final NamePathResolver resolver;

    private long ignoreLevel = 0;

    public JcrSysViewTransformer(@NotNull Node node, @NotNull ImportMode importMode) throws RepositoryException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AbstractArtifactHandler.java`
#### Snippet
```java
     * todo: would be better to pass via some kind of import context
     */
    protected AccessControlHandling cugHandling = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
    private final TreeMap<String, Info> infos = new TreeMap<String, Info>(new PathComparator());

    private MultiPathMapping mapping = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
     * Indicates if xml should be deserialized
     */
    private boolean explodeXml = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
         * Next NameSpace element on the stack.
         */
        public Namespace next = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
     * the 'default' aggregator flag
     */
    private boolean isDefault = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
     * flag indicating if this aggregator aggregates children
     */
    private boolean fullCoverage = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/DepthItemFilter.java`
#### Snippet
```java
     * The minimal depth
     */
    private int minDepth = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    private int pos = 0;

    private int end = 0;

    private static final char STATE_INIT = ' ';
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    private byte[] lineSpool;

    private int pos = 0;

    private int end = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    private byte[] spool;

    private int spoolPos = 0;

    private final InputStream in;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    private char state = STATE_INIT;

    boolean isEof = false;

    private byte[] spool;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
    private long scrollDelay = 1000;

    private long lastScrolled = 0;

    public HtmlProgressListener(Writer out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineOutputStream.java`
#### Snippet
```java
    private byte[] lineFeed = LS_NATIVE;

    private int pos = 0;

    private static final char STATE_INIT = ' ';
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * the current namespace state
     */
    private DocViewSAXHandler.Namespace nsStack = null;

    private int rootDepth;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/FormattingXmlStreamWriter.java`
#### Snippet
```java
    int numNamespaceDeclarations = 0;
    int numAttributes = 0;
    private int depth = 0;
    private Attribute bufferedAttribute;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/FormattingXmlStreamWriter.java`
#### Snippet
```java

    int numNamespaceDeclarations = 0;
    int numAttributes = 0;
    private int depth = 0;
    private Attribute bufferedAttribute;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/FormattingXmlStreamWriter.java`
#### Snippet
```java
    private final IndentingXMLStreamWriter elementIndentingXmlWriter;

    int numNamespaceDeclarations = 0;
    int numAttributes = 0;
    private int depth = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java

    // this list is only kept as reference for source generation.
    private List<PathFilterSet> referenceFilterSets = null;

    public static final String ATTR_VERSION = "version";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private transient long totalSize = 0;

    private transient long currentSize = 0;

    private transient long start = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private int batchSize = 1024;

    private long throttle = 0;

    private transient String resumeFrom;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    protected ProgressTrackerListener tracker;

    private transient int numNodes = 0;

    private transient int totalNodes = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private transient int totalNodes = 0;

    private transient long totalSize = 0;

    private transient long currentSize = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private transient int numNodes = 0;

    private transient int totalNodes = 0;

    private transient long totalSize = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private transient long currentSize = 0;

    private transient long start = 0;

    private transient String lastKnownGood;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private FSPackageRegistry registry;

    private VaultPackage vltPkg = null;

    private PackageId id;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java

    private final Map<PackageId, FSInstallState> cache = new ConcurrentHashMap<>();
    private boolean isInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    private Map<PackageId, SubPackageHandling.Option> subPackages = Collections.emptyMap();
    private Long installTime;
    private long size = 0;
    private WorkspaceFilter filter;
    private Properties properties = new Properties();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * Fallback Registry can be registered if present in the system to be able to look up presatisfied dependencies
     */
    private PackageRegistry baseRegistry = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Sync.java`
#### Snippet
```java
        private final Session s;

        private boolean enabled = false;

        private Set<String> roots = new LinkedHashSet<String>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Diff.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean heuristic = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Diff.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean no_discards = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
     * the number of changes
     */
    private int numDelta = 0;

    /**
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Map`
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/TypedMapWrapper.java`
#### Snippet
```java
 * The method names are inspired by <a href="https://sling.apache.org/apidocs/sling8/org/apache/sling/commons/json/JSONObject.html">org.apache.sling.commons.json.JSONObject</a>.
 */
public class TypedMapWrapper extends AbstractMap<String,Object> implements Map<String, Object> {

    private final Map<String, Object> wrappedMap;
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java
 *
 */
public interface PathFilter extends Filter, Dumpable {

    /**
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/ArtifactSetImpl.java`
#### Snippet
```java
 *
 */
public class ArtifactSetImpl implements Dumpable, ArtifactSet {

    /**
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/AbstractArtifactHandler.java`
#### Snippet
```java
 *
 */
public abstract class AbstractArtifactHandler implements ArtifactHandler, Dumpable {

    /**
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
/**
 */
public class GenericAggregator implements Aggregator, Dumpable {

    /**
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/FileAggregator.java`
#### Snippet
```java
 * is created.
 */
public class FileAggregator implements Aggregator, Dumpable {

    /**
```

### RedundantImplements
Redundant interface declaration `Dumpable`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
 *
 */
public class DefaultWorkspaceFilter implements Dumpable, WorkspaceFilter {

    /**
```

### RedundantImplements
Redundant interface declaration `PackageRegistry`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
 * Abstraction for shared methods of PackageRegistry &amp; InternalPackageRegistry implementations
 */
public abstract class AbstractPackageRegistry implements PackageRegistry, InternalPackageRegistry {

    public static final class SecurityConfig {
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                    loggedUnknownNodeTypeMessages.add(e.getMessage());
                }
                if (e instanceof NamespaceExceptionInNodeName) {
                    // now register namespace with an arbitrary namespace url
                    NameParser.parse(nodeName, new OnDemandRegisterNamespaceResolverWrapper(ntManagerProvider),
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
                        }
                    } catch (RuntimeException e) {
                        if (!(e instanceof ValidatorException)) {
                            throw new ValidatorException(entry.getKey(), filePath, e);
                        } else {
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
                        }
                    } catch (RuntimeException e) {
                        if (!(e instanceof ValidatorException)) {
                            throw new ValidatorException(entry.getKey(), filePath, e);
                        }
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                }
            } catch (RepositoryException | IOException e) {
                if (e instanceof ConstraintViolationException && wspFilter.getImportMode(nodePath) != ImportMode.REPLACE) {
                    // only warn in case of constraint violations for mode != replace (as best effort is used in that case)
                    log.warn("Error during processing of {}: {}, skip node due to import mode {}", nodePath, e.toString(), wspFilter.getImportMode(nodePath));
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
                ctx.setPhase(InstallContext.Phase.INSTALL_FAILED);
                hooks.execute(ctx);
                if (e instanceof RepositoryException) {
                    throw (RepositoryException)e;
                } else {
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `NamespaceExceptionInNodeName` does not end with 'Exception'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NamespaceExceptionInNodeName.java`
#### Snippet
```java
import javax.jcr.NamespaceException;

public class NamespaceExceptionInNodeName extends NamespaceException {

    /**
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                Dependency[] oldDeps = subPackage.getDefinition().getDependencies();
                Dependency[] newDeps = DependencyUtil.addExact(oldDeps, containerPackageId);
                if (oldDeps != newDeps) {
                    subPackage.getDefinition().setDependencies(newDeps, true);
                }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                    newDeps = DependencyUtil.add(newDeps, d);
                }
                if (oldDeps != newDeps) {
                    subPackage.getDefinition().setDependencies(newDeps, true);
                }
```

### ArrayEquality
Array objects are compared using `!=`, not 'Arrays.equals()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                    Dependency[] oldDeps = def.getDependencies();
                    Dependency[] newDeps = DependencyUtil.addExact(oldDeps, pack.getId());
                    if (oldDeps != newDeps) {
                        def.setDependencies(newDeps, false);
                    }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer uri` may be declared as 'StringBuilder'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
        }
        try {
            StringBuffer uri = new StringBuffer(getProperty(KEY_DEFAULT_URI));
            uri.append("/").append(session.getWorkspace().getName());
            if (root != null && !"/".equals(root)) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer info` may be declared as 'StringBuilder'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                rep = repProvider.getRepository(new RepositoryAddress(uri), options);
                setProperty(KEY_URI, uri);
                StringBuffer info = new StringBuffer();
                info.append(rep.getDescriptor(Repository.REP_NAME_DESC)).append(' ');
                info.append(rep.getDescriptor(Repository.REP_VERSION_DESC));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
    public static String[] parseLine(String line) {
        ArrayList tokens = new ArrayList();
        StringBuffer buf = new StringBuffer();
        int quote = 0;
        for (int i = 0; i < line.length(); i++) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer out` may be declared as 'StringBuilder'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
    private String getPrompt() {
        String p = app.getProperty(AbstractApplication.KEY_PROMPT);
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sep` may be declared as 'StringBuilder'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/AbstractApplication.java`
#### Snippet
```java
    protected HelpFormatter getAppHelpFormatter() {
        CliHelpFormatter hf = CliHelpFormatter.create();
        StringBuffer sep = new StringBuffer(hf.getPageWidth());
        while (sep.length() < hf.getPageWidth()) {
            sep.append("-");
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AbstractArtifact.java`
#### Snippet
```java
     */
    public String toString() {
        StringBuffer buf = new StringBuffer(type.toString());
        buf.append('(').append(repoRelPath).append(')');
        return buf.toString();
```

### StringBufferReplaceableByStringBuilder
`StringBuffer n` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
            Value[] values = prop.getValues();
            for (int i=0; i<values.length; i++) {
                StringBuffer n = new StringBuffer(relPath);
                n.append('[').append(i).append(']');
                list.add(new PropertyValueArtifact(parent, n.toString(), ext, type, prop, i, lastModified));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer b` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/ParseException.java`
#### Snippet
```java
     */
    public String getMessage() {
        StringBuffer b = new StringBuffer(super.getMessage());
        String delim = " (";
        if (systemId != null && !"".equals(systemId)) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     */
    public static String unescapeIllegalJcrChars(String name) {
        StringBuffer buffer = new StringBuffer(name.length());
        int i = name.indexOf('%');
        while (i > -1 && i + 2 < name.length()) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            throw new IllegalArgumentException("null argument");
        }
        StringBuffer buf = null;
        int length = text.length();
        int pos = 0;
```

### StringBufferReplaceableByStringBuilder
`StringBuffer res` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
        MessageDigest md = MessageDigest.getInstance(algorithm);
        byte[] digest = md.digest(data);
        StringBuffer res = new StringBuffer(digest.length * 2);
        for (byte b : digest) {
            res.append(hexTable[(b >> 4) & 15]);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     */
    public static String escapeIllegalXpathSearchChars(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s.substring(0, (s.length() - 1)));
        char c = s.charAt(s.length() - 1);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer out` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            BitSet validChars = isPath ? URISaveEx : URISave;
            byte[] bytes = string.getBytes("utf-8");
            StringBuffer out = new StringBuffer(bytes.length);
            for (byte aByte : bytes) {
                int c = aByte & 0xff;
```

### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
                                          boolean ignoreMissing)
            throws IllegalArgumentException {
        StringBuffer result = new StringBuffer();

        // Value:
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     */
    public static String escapeIllegalJcrChars(String name) {
        StringBuffer buffer = new StringBuffer(name.length() * 2);
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     */
    public static String implode(String[] arr, String delim) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
        }
        int lastPos = 0;
        StringBuffer sb = new StringBuffer(text.length());
        while (pos != -1) {
            sb.append(text.substring(lastPos, pos));
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
            i++;
        }
        StringBuffer buf = new StringBuffer();
        String delim = "";
        // go p1.length - i levels up to the common ancestor
```

### StringBufferReplaceableByStringBuilder
`StringBuffer ret` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
            return parent == null ? "" : parent;
        }
        StringBuffer ret = new StringBuffer();
        if (parent != null) {
            ret.append(parent);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer path` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    public String getRootPath() {
        Node<E> n = root;
        StringBuffer path = new StringBuffer();
        while (n.elem == null && n.children.size() == 1) {
            n = n.children.values().iterator().next();
```

### StringBufferReplaceableByStringBuilder
`StringBuffer msg` may be declared as 'StringBuilder'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryProvider.java`
#### Snippet
```java
            }
        }
        StringBuffer msg = new StringBuffer("URL scheme ");
        msg.append(address.getURI().getScheme());
        msg.append(" not supported. only");
```

### StringBufferReplaceableByStringBuilder
`StringBuffer reg` may be declared as 'StringBuilder'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/Ignored.java`
#### Snippet
```java
        }
        root = root.replace('\\', '/');
        StringBuffer reg = new StringBuffer("^");
        reg.append(root).append("/");
        for (int i=0; i<pattern.length(); i++) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer gutter` may be declared as 'StringBuilder'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
        }
        ArrayList lines = new ArrayList();
        StringBuffer gutter = new StringBuffer();
        StringBuffer word = new StringBuffer();
        int c;
```

### StringBufferReplaceableByStringBuilder
`StringBuffer word` may be declared as 'StringBuilder'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
        ArrayList lines = new ArrayList();
        StringBuffer gutter = new StringBuffer();
        StringBuffer word = new StringBuffer();
        int c;
        while ((c=r.read()) >=0 && lines.size()<MAX_ELEMENTS) {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Hunk3.java`
#### Snippet
```java
     */
    public static String getMarker(String[] fmt, Document doc) {
        StringBuffer buf = new StringBuffer(fmt[0]);
        if (doc != null && doc.getSource() != null && doc.getSource().getLabel() != null) {
            buf.append(doc.getSource().getLabel());
```

### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
        private String getStripped() {
            if (stripped == null) {
                StringBuffer buf = new StringBuffer(string.length());
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `id` of exception class
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageExistsException.java`
#### Snippet
```java
public class PackageExistsException extends PackageException {

    private PackageId id;

    public PackageExistsException() {
```

### NonFinalFieldOfException
Non-final field `id` of exception class
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/NoSuchPackageException.java`
#### Snippet
```java
public class NoSuchPackageException extends PackageException {

    private PackageId id;

    public NoSuchPackageException() {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
        }
        // clone session
        dstSession = session.impersonate(new SimpleCredentials(session.getUserID(), new char[0]));
        ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(classLoader);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpServlet.java`
#### Snippet
```java
        int idx = credentialsAsString.indexOf(':');
        if (idx < 0) {
            creds = new SimpleCredentials(credentialsAsString, new char[0]);
        } else {
            creds = new SimpleCredentials(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        }
        Collection<ValidationMessage> messages = new LinkedList<>();
        messages.addAll(getOrCreateNewNode(nodeContext, false, isImplicit(nodeContext.getNodePath()), false, primaryType.get(), node.getMixinTypes().toArray(new String[0])));

        for (DocViewProperty2 property : node.getProperties()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
        String nodeName = Text.getName(nodeContext.getNodePath());
        JcrNodeTypeMetaDataImpl childNode = addChildNode(nameResolver, effectiveNodeTypeProvider, nodeTypeDefinitionProvider,
                itemDefinitionProvider, false, nodeContext, nodeName, types.toArray(new Name[0]));
        // defer validation
        return childNode;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            throws IllegalNameException, ConstraintViolationException, NoSuchNodeTypeException, NamespaceException {
        List<Name> types = getTypes(nameResolver, primaryType, mixinTypes);
        if (effectiveNodeType == null || (!isFallbackPrimaryType && !effectiveNodeType.includesNodeTypes(types.toArray(new Name[0])))) {
            // only override if not a default node type
            this.primaryNodeType = types.get(0);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            // only override if not a default node type
            this.primaryNodeType = types.get(0);
            this.effectiveNodeType = effectiveNodeTypeProvider.getEffectiveNodeType(types.toArray(new Name[0]));
            if (!isAuthenticationOrAuthorizationContext) {
                isAuthenticationOrAuthorizationContext = isAclOrAuthorizableNodeType(effectiveNodeType);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
            defaultCreds = new SimpleCredentials(creds.substring(0, idx), creds.substring(idx + 1).toCharArray());
        } else {
            defaultCreds = new SimpleCredentials(creds, new char[0]);
        }
        try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        if (decompressed != null) {
            // keep array so isBuffered works after closing
            decompressed = new byte[0];
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
            int idx = userinfo.indexOf(':');
            if (idx < 0) {
                return new SimpleCredentials(userinfo, new char[0]);
            } else {
                return new SimpleCredentials(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java

        Privilege[] getPrivileges(AccessControlManager acMgr) throws RepositoryException {
            return AccessControlUtils.privilegesFromNames(acMgr, privileges.toArray(new String[0]));
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
                            new SimpleCredentials(
                                    name,
                                    pass == null ? new char[0] : pass.toCharArray()));
                }
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
    public static String[] explode(String str, int ch, boolean respectEmpty) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                Optional<DocViewProperty2> prop = docViewNode.getProperty(NAME_REP_MEMBERS);
                if (prop.isPresent()) {
                    importInfo.registerMemberships(id, prop.get().getStringValues().toArray(new String[0]));
                }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
            String qualifiedName = getQualifiedName(node.getSession(), name);
            if (isMultiValue) {
                node.setProperty(qualifiedName, binaryValues.toArray(new Value[0]));
            } else {
                node.setProperty(qualifiedName, binaryValues.get(0));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
            }
            if (type == PropertyType.UNDEFINED) {
                node.setProperty(qualifiedName, values.toArray(new String[0]));
            } else {
                node.setProperty(qualifiedName, values.toArray(new String[0]), type);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
                node.setProperty(qualifiedName, values.toArray(new String[0]));
            } else {
                node.setProperty(qualifiedName, values.toArray(new String[0]), type);
            }
            // assume modified
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackagingService.java`
#### Snippet
```java

        // todo: should somehow pass the package roots
        return new JcrPackageManagerImpl(session, new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
            }
            if (isMulti) {
                node.setProperty(name, binaryValues.toArray(new Value[0]));
            } else {
                node.setProperty(name, binaryValues.get(0));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java

    public static DocViewProperty fromDocViewProperty2(DocViewProperty2 property) {
        return new DocViewProperty(property.getName().toString(), property.getStringValues().toArray(new String[0]), property.isMultiValue(), property.getType(), property.isReferenceProperty());
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
            isBinaryRef = false;
        }
        return new DocViewProperty(name, strValues.toArray(new String[0]), isMulti, type, isBinaryRef);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
            label += "[" + node.getIndex() + "]";
        }
        return new DocViewNode(node.getName().toString(), label, node.getIdentifier().orElse(null), node.getProperties().stream().collect(Collectors.toMap(p -> p.getName().toString(),  DocViewProperty::fromDocViewProperty2)), node.getMixinTypes().toArray(new String[0]), node.getPrimaryType().orElse(null));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
     */
    public static boolean hasAdministrativePermissions(@NotNull Session session, String... additionalAdminAuthorizableIdsOrPrincipalNames) throws RepositoryException {
        List<String> additionalAdminIdsOrPrincipalNames = Arrays.asList(Optional.ofNullable(additionalAdminAuthorizableIdsOrPrincipalNames).orElse(new String[0]));
        final JackrabbitSession jackrabbitSession;
        if (session instanceof JackrabbitSession) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerMBeanImpl.java`
#### Snippet
```java
                session = repository.loginAdministrative(null);
                // todo: find a way to use the sling packaging service instead
                JcrPackageManager pkgMgr = new JcrPackageManagerImpl(session, new String[0]);
                for (JcrPackage pkg: pkgMgr.listPackages()) {
                    try {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/CompositePackageRegistry.java`
#### Snippet
```java
            }
        }
        return dependentPackageIds.toArray(new PackageId[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/ConfigCredentialsStore.java`
#### Snippet
```java
                return new SimpleCredentials(userPass.substring(0, idx), userPass.substring(idx + 1).toCharArray());
            } else {
                return new SimpleCredentials(userPass, new char[0]);
            }
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
    private Session session;

    private SyncHandler[] syncHandlers = new SyncHandler[0];

    private boolean enabled;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
            throws IOException {
        if (r == null) {
            return new Document.Element[0];
        }
        ArrayList lines = new ArrayList();
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
    @Override
    public @NotNull JcrNodeTypeMetaData getOrCreateNode(NamePathResolver nameResolver, @NotNull NodeContext nodeContext, String path) throws RepositoryException {
        return getNode(nameResolver, nodeContext, path, true).get();
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `message == null` is always `false` when reached
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidationMessage.java`
#### Snippet
```java
        result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
        result = prime * result + line;
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((nodePath == null) ? 0 : nodePath.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
```

### ConstantValue
Condition `severity == null` is always `false` when reached
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidationMessage.java`
#### Snippet
```java
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((nodePath == null) ? 0 : nodePath.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
        return result;
    }
```

### ConstantValue
Condition `severity != null` is always `true`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidationMessage.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "ValidationMessage [" + (severity != null ? "severity=" + severity + ", " : "")
                + (message != null ? "message=" + message + ", " : "") + "line=" + line + ", column=" + column + ", "
                + (throwable != null ? "throwable=" + throwable + ", " : "") + (nodePath != null ? "nodePath=" + nodePath + ", " : "")
```

### ConstantValue
Condition `message != null` is always `true`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidationMessage.java`
#### Snippet
```java
    public String toString() {
        return "ValidationMessage [" + (severity != null ? "severity=" + severity + ", " : "")
                + (message != null ? "message=" + message + ", " : "") + "line=" + line + ", column=" + column + ", "
                + (throwable != null ? "throwable=" + throwable + ", " : "") + (nodePath != null ? "nodePath=" + nodePath + ", " : "")
                + (filePath != null ? "filePath=" + filePath + ", " : "") + (basePath != null ? "basePath=" + basePath : "") + "]";
```

### ConstantValue
Value `isFolder` is always 'true'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        boolean isImplicit = isImplicit(nodeContext.getNodePath());
        if (isFolder) {
            messages.addAll(getOrCreateNewNode(nodeContext, isFolder, isImplicit, true, JcrConstants.NT_FOLDER));
            //
            if (!nodeContext.getNodePath().equals("/")) {
```

### ConstantValue
Value `isFolder` is always 'false'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                if (fileName.endsWith(ValidationExecutor.EXTENSION_BINARY)) {
                    // create parent if it does not exist yet
                    messages.addAll(getOrCreateNewNode(nodeContext, isFolder, isImplicit, true, JcrConstants.NT_FOLDER));
                    String propertyName = fileName.substring(0, fileName.length() - ValidationExecutor.EXTENSION_BINARY.length());
                    messages.addAll(addProperty(nodeContext, propertyName, false, DUMMY_BINARY_VALUE));
```

### ConstantValue
Value `isFolder` is always 'false'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                } else {
                    // if binary node is not yet there
                    messages.addAll(getOrCreateNewNode(nodeContext, isFolder, isImplicit, true, JcrConstants.NT_FILE));
                    // if a NT_FILE create a jcr:content sub node of type NT_RESOURCE
                    if (currentNodeTypeMetaData.getPrimaryNodeType().equals(NameConstants.NT_FILE)) {
```

### ConstantValue
Value `isFolder` is always 'false'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                                nodeContext.getFilePath(), nodeContext.getBasePath());
                        messages.addAll(
                                getOrCreateNewNode(nodeContext, isFolder, isImplicit(nodeContext.getNodePath()), true, JcrConstants.NT_RESOURCE));
                    }
                    messages.addAll(addProperty(nodeContext, JcrConstants.JCR_DATA, false, DUMMY_BINARY_VALUE));
```

### ConstantValue
Condition `groupId != null` is always `true`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
        @Override
        public String toString() {
            return "MavenCoordinates [" + (groupId != null ? "groupId=" + groupId + ", " : "")
                    + (artifactId != null ? "artifactId=" + artifactId + ", " : "") + (version != null ? "version=" + version + ", " : "")
                    + (packaging != null ? "packaging=" + packaging + ", " : "") + (classifier != null ? "classifier=" + classifier : "")
```

### ConstantValue
Condition `artifactId != null` is always `true`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
        public String toString() {
            return "MavenCoordinates [" + (groupId != null ? "groupId=" + groupId + ", " : "")
                    + (artifactId != null ? "artifactId=" + artifactId + ", " : "") + (version != null ? "version=" + version + ", " : "")
                    + (packaging != null ? "packaging=" + packaging + ", " : "") + (classifier != null ? "classifier=" + classifier : "")
                    + "]";
```

### ConstantValue
Condition `packaging != null` is always `true`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
            return "MavenCoordinates [" + (groupId != null ? "groupId=" + groupId + ", " : "")
                    + (artifactId != null ? "artifactId=" + artifactId + ", " : "") + (version != null ? "version=" + version + ", " : "")
                    + (packaging != null ? "packaging=" + packaging + ", " : "") + (classifier != null ? "classifier=" + classifier : "")
                    + "]";
        }
```

### ConstantValue
Condition `jcrPath .equals("/")` is always `true`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdExportCli.java`
#### Snippet
```java
        }
        if (localPath == null) {
            if (jcrPath .equals("/")) {
                localPath = Text.getName(addr.toString());
            } else {
```

### ConstantValue
Condition `metaTypes != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            throws IOException, RepositoryException {
        Collection<NodeTypeSet> metaTypes = archive.getMetaInf().getNodeTypes();
        if (metaTypes != null) {
            for (NodeTypeSet cnd: metaTypes) {
                nodeTypes.add(cnd);
```

### ConstantValue
Condition `filter.getFilterSets() != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        track("Collecting import information...", "");
        TxInfo root = prepare(archive.getJcrRoot(), parentPath, new SessionNamespaceResolver(session));
        if (filter!=null && filter.getFilterSets() != null && filter.getFilterSets().size() > 0 ) {
            root = postFilter(root);
        }
```

### ConstantValue
Condition `name != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultSettings.java`
#### Snippet
```java
    private void loadIgnore(Element ignore) {
        String name = ignore.getAttribute(ATTR_IGNORE_NAME);
        if (name != null) {
            ignores.add(name);
        }
```

### ConstantValue
Condition `cfg != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultAuthConfig.java`
#### Snippet
```java
        }
        RepositoryConfig cfg = RepositoryConfig.load(child);
        if (cfg != null) {
            repoConfigs.put(cfg.uri, cfg);
        }
```

### ConstantValue
Condition `uri == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultAuthConfig.java`
#### Snippet
```java

            String uri = elem.getAttribute(ATTR_URI);
            if (uri == null) {
                throw new ConfigurationException("missing attribute: " + ATTR_URI);
            }
```

### ConstantValue
Condition `credentialsConfig != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultAuthConfig.java`
#### Snippet
```java
                    if (child.getNodeName().equals(CredentialsConfig.ELEM_CREDETIALS)) {
                        CredentialsConfig credentialsConfig = CredentialsConfig.load((Element) child);
                        if (credentialsConfig != null) {
                            cfg.creds = credentialsConfig;
                        }
```

### ConstantValue
Condition `v == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || v.equals("")) {
            v = "1.0";
        }
```

### ConstantValue
Condition `v == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || v.equals("")) {
            v = "1.0";
        }
```

### ConstantValue
Condition `type == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/CredentialsConfig.java`
#### Snippet
```java

        String type = elem.getAttribute(ATTR_TYPE);
        if (type == null || type.equals("simple")) {
            return SimpleCredentialsConfig.load(elem);
        }
```

### ConstantValue
Condition `!jcrRoot.isDirectory()` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
        if (!jcrRoot.isDirectory()) {
            jcrRoot.mkdirs();
            if (!jcrRoot.isDirectory()) {
                throw new IOException("Unable to create " + jcrRoot.getAbsolutePath());
            }
```

### ConstantValue
Condition `!metaDir.isDirectory()` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ExportRoot.java`
#### Snippet
```java
        if (!metaDir.isDirectory()) {
            metaDir.mkdirs();
            if (!metaDir.isDirectory()) {
                throw new IOException("Unable to create " + metaDir.getAbsolutePath());
            }
```

### ConstantValue
Condition `txInfo == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    txInfo.out.getArtifacts().add(change.isa);
                }
                if (txInfo == null) {
                    return false;
                }
```

### ConstantValue
Condition `false && change.isa.getSerializationType() == SerializationType.XML_DOCVIEW` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    repoPath += repoName;
                    assertInFilter(repoPath);
                    if (false && change.isa.getSerializationType() == SerializationType.XML_DOCVIEW) {
                        // special case that full coverage is below a intermediate
                        // ignore and wait for next cycle
```

### ConstantValue
Condition `className == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java

        String className = elem.getAttribute("class");
        if (className == null || className.equals("")) {
            className = (String) defaultClasses.get(elem.getNodeName());
        }
```

### ConstantValue
Condition `type == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
    private void processHandler(Element elem) throws ConfigurationException {
        String type = elem.getAttribute("type");
        if (type == null || type.equals("")) {
            type = "generic";
        }
```

### ConstantValue
Condition `clazz != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
                    ItemFilter filter = null;
                    String clazz = child.getAttribute("class");
                    if (clazz != null && clazz.length() > 0) {
                        filter = (ItemFilter) helper.create(child);
                    } else {
```

### ConstantValue
Condition `type == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
    private void processAggregate(Element elem) throws ConfigurationException {
        String type = elem.getAttribute("type");
        if (type == null || type.equals("")) {
            type = "generic";
        }
```

### ConstantValue
Condition `title != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
            GenericAggregator ga = (GenericAggregator) aggregator;
            String title = elem.getAttribute("title");
            if (title != null) {
                ga.setName(title);
            }
```

### ConstantValue
Condition `ch == '\''` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            } else if (ch == '"') {
                buf.append("&quot;");
            } else if (ch == '\'') {
                buf.append("&apos;");
            }
```

### ConstantValue
Value `isMultiple` is always 'true'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        // This replicates the logic from https://github.com/apache/jackrabbit-oak/blob/274f92402a12978040939965e92ee4519f2ce1c3/oak-core/src/main/java/org/apache/jackrabbit/oak/plugins/nodetype/EffectiveNodeTypeImpl.java#L365
        // single values are covered by multivalue property definitions as well (but not vice-versa)
        return getApplicablePropertyDefinition(pd -> ((!isMultiple) || isMultiple == pd.isMultiple()) && (type == pd.getRequiredType() || UNDEFINED == type || UNDEFINED == pd.getRequiredType()), name);
    }

```

### ConstantValue
Condition `prop != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
        for (DocViewProperty2 prop : ni.getProperties()) {
            String name = npResolver.getJCRName(prop.getName());
            if (prop != null && !isPropertyProtected(effectiveNodeType, prop) && (overwriteExistingProperties || !node.hasProperty(name)) && wspFilter.includesProperty(node.getPath() + "/" + npResolver.getJCRName(prop.getName()))) {
                // check if property is allowed
                try {
```

### ConstantValue
Condition `name != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "DocViewNode2 [" + (name != null ? "name=" + name + ", " : "") + "index=" + index + ", "
                + (properties != null ? "properties=" + properties : "") + "]";
    }
```

### ConstantValue
Condition `properties != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
    public String toString() {
        return "DocViewNode2 [" + (name != null ? "name=" + name + ", " : "") + "index=" + index + ", "
                + (properties != null ? "properties=" + properties : "") + "]";
    }

```

### ConstantValue
Condition `root == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
    private void readDef(Element elem) throws ConfigurationException {
        String root = elem.getAttribute("root");
        if (root == null || root.length() == 0) {
            root = "/";
        }
```

### ConstantValue
Condition `mode != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        // check for import mode
        String mode = elem.getAttribute("mode");
        if (mode != null && mode.length() > 0) {
            try {
                ImportMode importMode = ImportMode.valueOf(mode.toUpperCase());
```

### ConstantValue
Condition `type != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        String type = elem.getAttribute("type");
        if (type != null && type.length() > 0) {
            nodeFilters.setType(type);
            propFilters.setType(type);
```

### ConstantValue
Condition `v == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || "".equals(v)) {
            v = "1.0";
        }
```

### ConstantValue
Condition `pattern == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
    protected PathFilter readFilter(Element elem) throws ConfigurationException {
        String pattern = elem.getAttribute("pattern");
        if (pattern == null || "".equals(pattern)) {
            throw new ConfigurationException("Filter pattern must not be empty");
        }
```

### ConstantValue
Condition `str != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Version.java`
#### Snippet
```java
     */
    public boolean isSnapshot() {
        return str != null && (str.endsWith("SNAPSHOT"));
    }
}
```

### ConstantValue
Condition `label == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
            return false;
        DocViewNode other = (DocViewNode) obj;
        if (label == null) {
            if (other.label != null)
                return false;
```

### ConstantValue
Condition `name == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
        if (!Arrays.equals(mixins, other.mixins))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
```

### ConstantValue
Condition `label == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
        final int prime = 31;
        int result = 1;
        result = prime * result + ((label == null) ? 0 : label.hashCode());
        result = prime * result + Arrays.hashCode(mixins);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
```

### ConstantValue
Condition `name == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
        result = prime * result + ((label == null) ? 0 : label.hashCode());
        result = prime * result + Arrays.hashCode(mixins);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((primary == null) ? 0 : primary.hashCode());
        result = prime * result + props.hashCode();
```

### ConstantValue
Condition `dep != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
        StringBuilder b = new StringBuilder();
        for (Dependency dep: deps) {
            if (dep != null) {
                b.append(delim).append(dep);
                delim=",";
```

### ConstantValue
Condition `nameStart == len` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
        }

        if (nameStart == len || state == STATE_NAME_START) {
            throw new IllegalArgumentException("Local name must not be empty");
        }
```

### ConstantValue
Condition `info.getId() != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                    info = readFromInputStream(new File(file.toURI().relativize(directoryFile.toURI()).getPath()), input, info);
                    // bail out as soon as all info was found
                    if (info.getId() != null && info.getFilter() != null) {
                        break;
                    }
```

### ConstantValue
Condition `info.getId() != null && info.getFilter() != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                    info = readFromInputStream(new File(file.toURI().relativize(directoryFile.toURI()).getPath()), input, info);
                    // bail out as soon as all info was found
                    if (info.getId() != null && info.getFilter() != null) {
                        break;
                    }
```

### ConstantValue
Condition `info.getFilter() != null` is always `true` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                    info = readFromInputStream(new File(file.toURI().relativize(directoryFile.toURI()).getPath()), input, info);
                    // bail out as soon as all info was found
                    if (info.getId() != null && info.getFilter() != null) {
                        break;
                    }
```

### ConstantValue
Condition `info.getId() == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java

            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Condition `info.getId() == null || info.getFilter() == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java

            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Condition `info.getFilter() == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java

            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Condition `info.getId() != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                        info = readFromInputStream(new File(e.getName()), input, info);
                        // bail out as soon as all info was found
                        if (info.getId() != null && info.getFilter() != null) {
                            break;
                        }
```

### ConstantValue
Condition `info.getId() != null && info.getFilter() != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                        info = readFromInputStream(new File(e.getName()), input, info);
                        // bail out as soon as all info was found
                        if (info.getId() != null && info.getFilter() != null) {
                            break;
                        }
```

### ConstantValue
Condition `info.getFilter() != null` is always `true` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                        info = readFromInputStream(new File(e.getName()), input, info);
                        // bail out as soon as all info was found
                        if (info.getId() != null && info.getFilter() != null) {
                            break;
                        }
```

### ConstantValue
Condition `info.getId() == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                }
            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Condition `info.getId() == null || info.getFilter() == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                }
            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Condition `info.getFilter() == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                }
            }
            if (info.getId() == null || info.getFilter() == null) {
                return null;
            } else {
```

### ConstantValue
Value `packageId` is always 'null'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/CompositePackageRegistry.java`
#### Snippet
```java
            }
        }
        return packageId;
    }

```

### ConstantValue
Condition `filePath == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        if (external != other.external)
            return false;
        if (filePath == null) {
            if (other.filePath != null)
                return false;
```

### ConstantValue
Condition `packageId == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        } else if (!installTime.equals(other.installTime))
            return false;
        if (packageId == null) {
            if (other.packageId != null)
                return false;
```

### ConstantValue
Condition `filePath == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        result = prime * result + ((dependencies == null) ? 0 : dependencies.hashCode());
        result = prime * result + (external ? 1231 : 1237);
        result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
        result = prime * result + ((filter == null) ? 0 : filter.hashCode());
        result = prime * result + ((installTime == null) ? 0 : installTime.hashCode());
```

### ConstantValue
Condition `packageId == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        result = prime * result + ((filter == null) ? 0 : filter.hashCode());
        result = prime * result + ((installTime == null) ? 0 : installTime.hashCode());
        result = prime * result + ((packageId == null) ? 0 : packageId.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        result = prime * result + (int) (size ^ (size >>> 32));
```

### ConstantValue
Condition `status == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        result = prime * result + (int) (size ^ (size >>> 32));
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((subPackages == null) ? 0 : subPackages.hashCode());
        return result;
```

### ConstantValue
Condition `packageId != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "FSInstallState [" + (packageId != null ? "packageId=" + packageId + ", " : "")
                + (status != null ? "status=" + status + ", " : "") + (filePath != null ? "filePath=" + filePath + ", " : "") + "external="
                + external + ", " + (dependencies != null ? "dependencies=" + dependencies + ", " : "")
```

### ConstantValue
Condition `status != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    public String toString() {
        return "FSInstallState [" + (packageId != null ? "packageId=" + packageId + ", " : "")
                + (status != null ? "status=" + status + ", " : "") + (filePath != null ? "filePath=" + filePath + ", " : "") + "external="
                + external + ", " + (dependencies != null ? "dependencies=" + dependencies + ", " : "")
                + (subPackages != null ? "subPackages=" + subPackages + ", " : "")
```

### ConstantValue
Condition `filePath != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    public String toString() {
        return "FSInstallState [" + (packageId != null ? "packageId=" + packageId + ", " : "")
                + (status != null ? "status=" + status + ", " : "") + (filePath != null ? "filePath=" + filePath + ", " : "") + "external="
                + external + ", " + (dependencies != null ? "dependencies=" + dependencies + ", " : "")
                + (subPackages != null ? "subPackages=" + subPackages + ", " : "")
```

### ConstantValue
Condition `id == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
        int result = 1;
        result = prime * result + ((error == null) ? 0 : error.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((options == null) ? 0 : options.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
```

### ConstantValue
Condition `type == null` is always `false` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
        result = prime * result + ((options == null) ? 0 : options.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
```

### ConstantValue
Condition `id == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
        } else if (!error.equals(other.error))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
```

### ConstantValue
Condition `id != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "PackageTaskImpl [" + (id != null ? "id=" + id + ", " : "") + (type != null ? "type=" + type + ", " : "")
                + (options != null ? "option=" + options + ", " : "") + (state != null ? "state=" + state + ", " : "")
                + (error != null ? "error=" + error : "") + "]";
```

### ConstantValue
Condition `type != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "PackageTaskImpl [" + (id != null ? "id=" + id + ", " : "") + (type != null ? "type=" + type + ", " : "")
                + (options != null ? "option=" + options + ", " : "") + (state != null ? "state=" + state + ", " : "")
                + (error != null ? "error=" + error : "") + "]";
```

### ConstantValue
Condition `path == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        }
        String parentPath = Text.getRelativeParent(path, 1);
        if (path == null || ("/".equals(path) && parentPath.equals(path))) {
            throw new RepositoryException("could not create intermediate nodes");
        }
```

### ConstantValue
Condition `d != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
            final ValueFactory fac = defNode.getSession().getValueFactory();
            for (Dependency d: dependencies) {
                if (d != null) {
                    values.add(fac.createValue(d.toString()));
                }
```

### ConstantValue
Condition `d != null` is always `true`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
                List<String> ds = new ArrayList<>();
                for (Dependency d: Dependency.parse(deps)) {
                    if (d != null) {
                        ds.add(d.toString());
                    }
```

### ConstantValue
Condition `v == null` is always `false`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
            }
            String v = doc.getAttribute(ATTR_VERSION);
            if (v == null || "".equals(v)) {
                v = "1.0";
            }
```

### ConstantValue
Condition `unresolved.size() > 0` is always `true` when reached
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            }
            // if the package is not installed at all, abort for required and strict handling
            if ((opts.getDependencyHandling() == DependencyHandling.STRICT && unresolved.size() > 0)
                    || (opts.getDependencyHandling() == DependencyHandling.REQUIRED && unresolved.size() > uninstalled.size())) {
                String msg = String.format("Refusing to install package %s: required dependencies missing: %s", def.getId(), unresolved);
```

### ConstantValue
Condition `name == null` is always `false`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
        assert elem.getNodeName().equals(EN_ENTRY);
        String name = elem.getAttribute(AN_NAME);
        if (name == null) {
            throw new VltException("entry has no '" + AN_NAME + "' attribute");
        }
```

### ConstantValue
Value `nonRecursive` is always 'false'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
        if (file.canDescend() && !nonRecursive) {
            VltDirectory dir = file.descend();
            dir.apply(action, Collections.<String>emptyList(), nonRecursive);
            dir.close();
        }
```

### ConstantValue
Value `nonRecursive` is always 'false'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
                VaultFile remDir = dir.getRemoteDirectory(ctx);
                for (VltFile child: dir.getFiles()) {
                    dir.prepareCommit(tx, remDir, child, nonRecursive, force);
                }
                dir.saveEntries();
```

### ConstantValue
Value `remoteFile` is always 'null'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
        if (remoteFile == null && file != null && file.canDescend() && !nonRecursive) {
            VltDirectory dir = file.descend();
            dir.applyWithRemote(action, remoteFile, Collections.<String>emptyList(), nonRecursive);
            dir.close();
        }
```

### ConstantValue
Value `nonRecursive` is always 'false'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
        if (remoteFile == null && file != null && file.canDescend() && !nonRecursive) {
            VltDirectory dir = file.descend();
            dir.applyWithRemote(action, remoteFile, Collections.<String>emptyList(), nonRecursive);
            dir.close();
        }
```

### ConstantValue
Value `nonRecursive` is always 'false'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            if (file != null && file.canDescend() && !nonRecursive) {
                VltDirectory dir = file.descend();
                dir.applyWithRemote(action, remoteFile, Collections.<String>emptyList(), nonRecursive);
                dir.close();
            }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `load()` tries to override a static method of a superclass
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/SimpleCredentialsConfig.java`
#### Snippet
```java
    }

    public static SimpleCredentialsConfig load(Element elem) throws ConfigurationException {
        assert elem.getNodeName().equals(ELEM_CREDETIALS);

```

## RuleId[id=IOResource]
### IOResource
'MappedArchive' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
        if (pathMapping != null) {
            filter = filter.translate(pathMapping);
            this.archive = archive = new MappedArchive(archive, pathMapping);
            this.archive.open(true);
        }
```

### IOResource
'SubPackageFilterArchive' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
        SubPackageFilterArchive spfArchive = null;
        if (!options.isNonRecursive()) {
            spfArchive = new SubPackageFilterArchive(archive);
            archive = spfArchive;
        } else {
```

### IOResource
'ArchiveWrapper' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            archive = spfArchive;
        } else {
            archive = new ArchiveWrapper(archive);
        }
        Set<PackageId> ids = new HashSet<>();
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
    }
    private void load(Reader r) throws IOException {
        BufferedReader br = new BufferedReader(r);
        int lineNo=1;
        lines.clear();
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
            r = (BufferedReader) text;
        } else {
            r = new BufferedReader(text);
        }
        ArrayList lines = new ArrayList();
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                // todo: how to deal with multi-node memberships? see JCRVLT-69
                Optional<DocViewProperty2> prop = docViewNode.getProperty(NAME_REP_MEMBERS);
                if (prop.isPresent()) {
                    importInfo.registerMemberships(id, prop.get().getStringValues().toArray(new String[0]));
                }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Text` has only 'static' members, and lacks a 'private' constructor
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
 * {@code Text}...
 */
public class Text {

    public static String[] parseLine(String line) {
```

### UtilityClassWithoutPrivateConstructor
Class `Mounter` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/Mounter.java`
#### Snippet
```java
 * The workspace filter will be matched against the filesystem paths (e.g. /foo).
 */
public final class Mounter {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ServiceProviderFactory` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/ServiceProviderFactory.java`
#### Snippet
```java
 * {@code StaticServiceProvider}...
 */
public class ServiceProviderFactory {


```

### UtilityClassWithoutPrivateConstructor
Class `DefaultNodeTypes` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypes.java`
#### Snippet
```java
 * {@code DefaultNodeTypes}...
 */
public final class DefaultNodeTypes {

    public static final Set<String> JSR170_NODE_TYPES = new HashSet<String>();
```

### UtilityClassWithoutPrivateConstructor
Class `CompressionUtil` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/CompressionUtil.java`
#### Snippet
```java
 * the compressibility of artifacts.
 */
public final class CompressionUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PlatformNameFormat` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
 *
 */
public class PlatformNameFormat {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PathUtil` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
 *
 */
public class PathUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MimeTypes` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MimeTypes.java`
#### Snippet
```java
 *
 */
public class MimeTypes {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PackagingService` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackagingService.java`
#### Snippet
```java
 * @since 2.0
 */
public class PackagingService {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DependencyUtil` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
 * Dependency Utilities
 */
public class DependencyUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `JcrWorkspaceFilter` has only 'static' members, and lacks a 'private' constructor
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
 * filter that is stored in the repository
 */
public class JcrWorkspaceFilter  {

    public static DefaultWorkspaceFilter loadFilter(Node defNode) throws RepositoryException {
```

### UtilityClassWithoutPrivateConstructor
Class `SyncConstants` has only 'static' members, and lacks a 'private' constructor
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConstants.java`
#### Snippet
```java
 * {@code SyncConstants}...
 */
public class SyncConstants {

    public static final String SYNCLOG_FILE_NAME = ".vlt-sync.log";
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
@Nullable method 'createValidator' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/MergeLimitationsValidatorFactory.java`
#### Snippet
```java

    @Override
    public @Nullable Validator createValidator(@NotNull ValidationContext context, @NotNull ValidatorSettings settings) {
        return new MergeLimitationsValidator(settings.getDefaultSeverity(), context.getFilter());
    }
```

### DataFlowIssue
@Nullable method 'createValidator' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/EmptyElementsValidatorFactory.java`
#### Snippet
```java

    @Override
    public @Nullable Validator createValidator(@NotNull ValidationContext context, @NotNull ValidatorSettings settings) {
        return new EmptyElementsValidator(settings.getDefaultSeverity(), context.getFilter());
    }
```

### DataFlowIssue
@Nullable method 'validate' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OakIndexDefinitionValidator.java`
#### Snippet
```java
    }
    @Override
    public @Nullable Collection<ValidationMessage> validate(@NotNull WorkspaceFilter filter) {
        Collection<ValidationMessage> violations = new LinkedList<>();
        violations.addAll(collectIndexPaths(filter.getFilterSets()));
```

### DataFlowIssue
@Nullable method 'createValidator' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java

    @Override
    public @Nullable Validator createValidator(@NotNull ValidationContext context, @NotNull ValidatorSettings settings) {
        // evaluate options
        final Pattern jcrInstallerAdditionalFileNodePathRegex;
```

### DataFlowIssue
@Nullable method 'createValidator' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DuplicateUuidValidatorFactory.java`
#### Snippet
```java

    @Override
    public @Nullable Validator createValidator(@NotNull ValidationContext context, @NotNull ValidatorSettings settings) {
        // TODO: check cross-package duplicates
        return new DuplicateUuidValidator(settings.getDefaultSeverity(), context.getFilter());
```

### DataFlowIssue
@Nullable method 'validate' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    
    @Override
    public @Nullable Collection<ValidationMessage> validate(@NotNull DocViewNode2 node, @NotNull NodeContext nodeContext,
            boolean isRoot) {
        Collection<ValidationMessage> messages = new LinkedList<>();
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidatorFactory.java`
#### Snippet
```java
        // either load map from classloader, from filesystem or from generic url
        if (StringUtils.isBlank(cndUrls)) {
            cndUrls = this.getClass().getClassLoader().getResource("default-nodetypes.cnd").toString();
            LOGGER.warn("Using default nodetypes, consider specifying the nodetypes from the repository you use!");
        }
```

### DataFlowIssue
Method invocation `getProperty` may produce `NullPointerException`
in `vault-hook-example/src/main/java/org/apache/jackrabbit/vault/packaging/hooks/ExampleHook.java`
#### Snippet
```java
        // read the properties from the package
        Properties props = ctx.getPackage().getMetaInf().getProperties();
        String copyFrom = props.getProperty(PROP_COPY_FROM, "");
        if (copyFrom.length() == 0) {
            throw new PackageException("hook-example needs " + PROP_COPY_FROM + " property set in properties.xml");
```

### DataFlowIssue
Argument `finalizeValidationForSiblings(nodeContext)` might be null
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
            //
            if (!nodeContext.getNodePath().equals("/")) {
                messages.addAll(finalizeValidationForSiblings(nodeContext));
            }
        } else {
```

### DataFlowIssue
@Nullable method 'finalizeValidationForSubtree' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
    }

    private @Nullable Collection<ValidationMessage> finalizeValidationForSubtree(JcrNodeTypeMetaData node, NodeContext nodeContext) throws NamespaceException {
        Collection<ValidationMessage> messages = new ArrayList<>();
        messages.add(new ValidationMessage(ValidationMessageSeverity.DEBUG, "Finalize validation for subtree at " + nodeContext));
```

### DataFlowIssue
Argument `finalizeValidationForSubtree(child, nodeContext)` might be null
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        messages.add(new ValidationMessage(ValidationMessageSeverity.DEBUG, "Finalize validation for subtree at " + nodeContext));
        for (JcrNodeTypeMetaData child : node.getChildren()) {
            messages.addAll(finalizeValidationForSubtree(child, nodeContext));
            messages.addAll(child.finalizeValidation(ntManagerProvider.getNamePathResolver(), ntManagerProvider.getNodeTypeDefinitionProvider(),
                    ntManagerProvider.getItemDefinitionProvider(), defaultSeverity, severityForDefaultNodeTypeViolations, filter));
```

### DataFlowIssue
@Nullable method 'finalizeValidationForSiblings' always returns a non-null value
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws IllegalNameException
     * @throws MalformedPathException */
    private @Nullable Collection<ValidationMessage> finalizeValidationForSiblings(NodeContext nodeContext) {
        String parentNodePath = Text.getRelativeParent(nodeContext.getNodePath(), 1);
        String nodeName = Text.getName(nodeContext.getNodePath());
```

### DataFlowIssue
Argument `finalizeValidationForSubtree(siblingChild, nodeContext)` might be null
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
                }
                for (JcrNodeTypeMetaData siblingChild : sibling.getChildren()) {
                    messages.addAll(finalizeValidationForSubtree(siblingChild, nodeContext));
                }
            } catch (NamespaceException e) {
```

### DataFlowIssue
Expression `primaryNodeType` might evaluate to null but is returned by the method declared as @NotNull
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
    @Override
    public Name getPrimaryNodeType() {
        return primaryNodeType;
    }

```

### DataFlowIssue
Argument `effectiveNodeType` might be null
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
                            MESSAGE_PROPERTY_NOT_ALLOWED,
                            namePathResolver.getJCRName(qName), PropertyType.nameFromValue(values[0].getType()),
                            getEffectiveNodeTypeLabel(namePathResolver, effectiveNodeType),
                            constraintViolation.get()),
                    nodeContext));
```

### DataFlowIssue
Dereference of `currentNode` may produce `NullPointerException`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
                break;
            } else {
                currentNode = currentNode.parentNode;
            }
        }
```

### DataFlowIssue
Expression `currentNode.parentNode` might evaluate to null but is assigned to a variable that is annotated with @NotNull
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
                break;
            } else {
                currentNode = currentNode.parentNode;
            }
        }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            }
        }
        qRelativePath = currentNode.getPath().computeRelativePath(qPath);

        // then go down until you match the path
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/PlatformFile.java`
#### Snippet
```java
    public ConsoleFile[] listFiles() throws IOException {
        File[] files = file.listFiles();
        if (files.length == 0) {
            return ConsoleFile.EMPTY_ARRAY;
        } else {
```

### DataFlowIssue
Method invocation `getByteStream` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java
        for (Entry entry: dir.getChildren()) {
            VaultInputSource src = getInputSource(entry);
            try (InputStream input = src.getByteStream()) {
                inf.load(input, src.getSystemId());
            }
```

### DataFlowIssue
Argument `archive.getJcrRoot()` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java

        track("Collecting import information...", "");
        TxInfo root = prepare(archive.getJcrRoot(), parentPath, new SessionNamespaceResolver(session));
        if (filter!=null && filter.getFilterSets() != null && filter.getFilterSets().size() > 0 ) {
            root = postFilter(root);
```

### DataFlowIssue
Method invocation `getByteStream` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
            } else {
                log.debug("Copying patch {} to {}", name, target.getPath());
                try (InputStream in = archive.getInputSource(e).getByteStream();
                     OutputStream out = FileUtils.openOutputStream(target)) {
                    IOUtils.copy(in, out);
```

### DataFlowIssue
Argument `is` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                    // this can either be an generic exported docview or a 'user-xml' that is imported as file
                    // btw: this only works for input sources that can refetch their input stream
                    if (DocViewParser.isDocView(is)) {
                        // in this case, the extension was added by the exporter.
                        repoName = repoBase;
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                    } else {
                        ext = "";
                        serType = SerializationType.GENERIC;
                        type = ArtifactType.FILE;
                    }
```

### DataFlowIssue
Method invocation `getByteStream` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                } else if (".cnd".equals(ext)) {
                    if (opts.getCndPattern().matcher(repoPath).matches()) {
                        InputStream in = is.getByteStream();
                        try (Reader r = new InputStreamReader(in, "utf8")) {
                            CNDReader reader = ServiceProviderFactory.getProvider().getCNDReader();
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                    type = ArtifactType.FILE;
                } else if (".binary".equals(ext)) {
                    serType = SerializationType.GENERIC;
                    type = ArtifactType.BINARY;
                    repoName = repoBase;
```

### DataFlowIssue
Argument `in` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
            NodeTypeInstaller installer = ServiceProviderFactory.getProvider().getDefaultNodeTypeInstaller(session);
            CNDReader types = ServiceProviderFactory.getProvider().getCNDReader();
            types.read(new InputStreamReader(in, "utf8"), DEFAULT_NODETYPES, null);
            installer.install(null, types);
        } catch (Exception e) {
```

### DataFlowIssue
Dereference of `state` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
    public void startNode(DocViewNode2 node) {
        State state = states.peek();
        switch (state) {
            case INITIAL:
                String primaryType = node.getPrimaryType().orElseThrow(() -> new IllegalStateException("Error while reading access control content: Missing 'jcr:primaryType'"));
```

### DataFlowIssue
Method invocation `getArtifacts` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                            }
                        }
                    } else if (info.out.getArtifacts().isEmpty() && info.aggregate != null) {
                        // delete entire node if aggregate is still attached
                        if (info.aggregate.isAttached()) {
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    } else {
                        // force generic
                        serType = SerializationType.GENERIC;
                    }
                } else if (ext.equals(".binary")) {
```

### DataFlowIssue
Dereference of `n` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
        E previous;
        Node<E> n = get(path, true);
        previous = n.elem;
        n.elem = elem;
        return previous;
```

### DataFlowIssue
Argument `this.getClass().getResourceAsStream("/default-nodetypes.cnd")` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java
        if (registerDefaultNodeTypes) {
            try (Reader reader = new InputStreamReader(
                    this.getClass().getResourceAsStream("/default-nodetypes.cnd"),
                    StandardCharsets.US_ASCII)) {
                registerNodeTypes(reader);
```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
            track("", "Intermediate saving %d nodes (%d kB)...", numNodes, currentSize/1000);
            long now = System.currentTimeMillis();
            autoSave.save(dst.getSession(), true);
            long end = System.currentTimeMillis();
            track("", "Done in %d ms. Total time: %d, total nodes %d, %d kB", end-now, end-start, totalNodes, totalSize/1000);
```

### DataFlowIssue
Method invocation `indexOf` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Version.java`
#### Snippet
```java
                segs.add(s);
            } else {
                int dash = s.indexOf('-');
                if (dash < 0) {
                    segs.add(s);
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
        Map<PackageId, JcrPackage> byId = new LinkedHashMap<PackageId, JcrPackage>();
        for (JcrPackage pack: packages) {
            PackageId id = pack.getDefinition().getId();
            list.put(id, pack.getDefinition().getDependencies());
            byId.put(id, pack);
```

### DataFlowIssue
Method invocation `toUri` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/InstallHookProcessorImpl.java`
#### Snippet
```java
                            // 2nd fallback is the thread context classloader
                            urlClassLoader = URLClassLoader.newInstance(
                                    new URL[] { jarFile.toUri().toURL() },
                                    Thread.currentThread().getContextClassLoader());
                            loadMainClass(urlClassLoader);
```

### DataFlowIssue
Argument `archive.getInputSource(entry)` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/InstallHookProcessorImpl.java`
#### Snippet
```java
                    // only respect .jar files
                    if (entry.getName().endsWith(".jar")) {
                        registerHook(archive.getInputSource(entry), classLoader);
                    }
                }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerMBeanImpl.java`
#### Snippet
```java
                    try {
                        Object[] values = {
                                pkg.getDefinition().getId().toString(),
                                pkg.getSize(),
                                pkg.isInstalled(),
```

### DataFlowIssue
@Nullable method 'read' always returns a non-null value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
     * @return the package info if the package is valid, otherwise {@code null}.
     * @throws IOException if an error occurs. */
    public static @Nullable PackageInfo read(@NotNull File file) throws IOException {
        DefaultPackageInfo info = new DefaultPackageInfo(null, null, PackageType.MIXED);
        if (!file.exists()) {
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
        for (JcrPackage pkg: mgr.listPackages(originalFilter)) {
            if (pkg.isValid() && pkg.getSize() > 0) {
                subPackages.put(pkg.getDefinition().getId(), pkg.getNode().getPath());
            }
        }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
        for (JcrPackage pkg: mgr.listPackages(originalFilter)) {
            if (pkg.isValid() && pkg.getSize() > 0) {
                subPackages.put(pkg.getDefinition().getId(), pkg.getNode().getPath());
            }
        }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
        for (JcrPackage pkg: mgr.listPackages(filter)) {
            if (pkg.isValid() && pkg.getSize() > 0) {
                subPackages.put(pkg.getDefinition().getId(), pkg.getNode().getPath());
            }
        }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
        for (JcrPackage pkg: mgr.listPackages(filter)) {
            if (pkg.isValid() && pkg.getSize() > 0) {
                subPackages.put(pkg.getDefinition().getId(), pkg.getNode().getPath());
            }
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
                    // therefore reset the nameStart and change state.
                    state = STATE_NAME;
                    nameStart = 0;
                } else if (state == STATE_NAME_START) {
                    state = STATE_NAME;
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
                        // normal local name.
                        state = STATE_NAME;
                        nameStart = 0;
                    } else {
                        throw new IllegalArgumentException(
```

### DataFlowIssue
Method invocation `getInstallationTime` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
        Long installTime;
        try {
            installTime = registry.getInstallState(getId()).getInstallationTime();
            if (installTime == null) {
                cal = null;
```

### DataFlowIssue
Expression `registry.getPrimaryPackageRoot(true)` might evaluate to null but is returned by the method declared as @NotNull
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
    @Override
    public Node getPackageRoot() throws RepositoryException {
        return registry.getPrimaryPackageRoot(true);
    }

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            for (JcrPackage p : subs) {
                // check if not include itself
                if (p.getDefinition().getId().equals(id)) {
                    throw new PackageException("A package cannot include itself. Check filter definition.");
                }
```

### DataFlowIssue
Argument `in` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
                        for (Archive.Entry e: spfArchive.getSubPackageEntries()) {
                            try (InputStream in = spfArchive.openInputStream(e);
                                    Archive subArchive = new ZipStreamArchive(in)) {
                                PackageId[] subIds = extract(subArchive, options, replace);
                                ids.addAll(Arrays.asList(subIds));
```

### DataFlowIssue
Method invocation `sealForRewrap` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
        pack.verifyId(true, false);
        JcrPackageDefinitionImpl def = (JcrPackageDefinitionImpl) pack.getDefinition();
        def.sealForRewrap(now);

        ExportOptions opts = new ExportOptions();
```

### DataFlowIssue
Method invocation `getNode` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            // update this content
            Node packNode = pack.getNode();
            Node contentNode = packNode.getNode(JcrConstants.JCR_CONTENT);
            try (InputStream in = FileUtils.openInputStream(dst.getFile())) {
                // stay jcr 1.0 compatible
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
    public void remove(JcrPackage pack) throws RepositoryException {
        try {
            registry.remove(pack.getDefinition().getId());
        } catch (IOException e) {
            throw unwrapRepositoryException(e);
```

### DataFlowIssue
Argument `pkg.getDefNode()` might be null
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrRegisteredPackage.java`
#### Snippet
```java
    public WorkspaceFilter getWorkspaceFilter() {
        try {
            return JcrWorkspaceFilter.loadFilter(pkg.getDefNode());
        } catch (RepositoryException e) {
            throw new IllegalStateException(e);
```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
                try (JcrPackage snap = pack.getSnapshot()) {
                    if (snap != null) {
                        snap.getNode().remove();
                    }
                }
```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
                    }
                }
                pack.getNode().remove();
            }
            session.save();
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
                                continue;
                            }
                            PackageId id = pack.getDefinition().getId();
                            if (dependency.matches(id)) {
                                if (bestId == null || id.getVersion().compareTo(bestId.getVersion()) > 0) {
```

### DataFlowIssue
Method invocation `isUnwrapped` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
            throw new PackageException("Package is not valid.");
        }
        if (pack.getSize() > 0 && !pack.getDefinition().isUnwrapped()) {
            throw new PackageException("Package definition not unwrapped.");
        }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java

        JcrPackageDefinition def = pack.getDefinition();
        PackageId id = def.getId();
        PackageId newId = new PackageId(
                group == null ? id.getGroup() : group,
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        );
        String dstPath = getInstallationPath(newId) + ".zip";
        if (id.equals(newId) && pack.getNode().getPath().equals(dstPath)) {
            log.debug("Package id not changed. won't rename.");
            return pack;
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java

        // only move if not already at correct location
        if (!pack.getNode().getPath().equals(dstPath)) {
            if (session.nodeExists(dstPath)) {
                throw new PackageException("Node at " + dstPath + " already exists.");
```

### DataFlowIssue
Method invocation `getIgnoredNames` may produce `NullPointerException`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
        this.entries = entries;
        globalIgnores = new HashSet<String>(
                dir.getContext().getMetaInf().getSettings().getIgnoredNames());
        globalIgnores.add(Ignored.FILE_NAME);
        loadIgnored(dir.getDirectory());
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/Ignored.java`
#### Snippet
```java

    public Ignored scan(File dir) throws VltException, IOException, ConfigurationException {
        for (File file: dir.listFiles()) {
            String name = file.getName();
            if (settings != null && settings.isIgnored(name)) {
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            return;
        }
        PackageId[] usage = mgr.usage(getDefinition().getId());
        if (usage.length > 0 && opts.getDependencyHandling() == DependencyHandling.STRICT) {
            String msg = String.format("Refusing to uninstall package %s. it is still used by: %s", def.getId(), Arrays.toString(usage));
```

### DataFlowIssue
Method invocation `getDependencies` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            if (hasOwnContent) {
                // add dependency to this package
                Dependency[] oldDeps = subPackage.getDefinition().getDependencies();
                Dependency[] newDeps = DependencyUtil.addExact(oldDeps, containerPackageId);
                if (oldDeps != newDeps) {
```

### DataFlowIssue
Method invocation `getDependencies` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            } else {
                // add parent dependencies to this package
                Dependency[] oldDeps = subPackage.getDefinition().getDependencies();
                Dependency[] newDeps = oldDeps;
                for (Dependency d: getDefinition().getDependencies()) {
```

### DataFlowIssue
Method invocation `getDependencies` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                Dependency[] oldDeps = subPackage.getDefinition().getDependencies();
                Dependency[] newDeps = oldDeps;
                for (Dependency d: getDefinition().getDependencies()) {
                    newDeps = DependencyUtil.add(newDeps, d);
                }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        PackageId[] ret = processed.toArray(new PackageId[processed.size()]);
        Arrays.sort(ret);
        mgr.dispatch(PackageEvent.Type.EXTRACT_SUB_PACKAGES, getDefinition().getId(), ret);
        return ret;
    }
```

### DataFlowIssue
Method invocation `getBinary` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            } else {
                File tmpFile = File.createTempFile("vaultpack", ".zip");
                Binary bin = getData().getBinary();
                try (FileOutputStream out = FileUtils.openOutputStream(tmpFile); 
                    InputStream in = bin.getStream()) {
```

### DataFlowIssue
Method invocation `getLength` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        try {
            assertValid();
            return getData().getLength();
        } catch (RepositoryException e) {
            log.error("Error during getSize()", e);
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
     */
    private PackageId getSnapshotId() throws RepositoryException {
        PackageId id = getDefinition().getId();
        String group = id.getGroup();
        if (group.length() == 0) {
```

### DataFlowIssue
Method invocation `getBoolean` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        ImportOptions opts = options.copy();
        // check for disable intermediate saves (GRANITE-1047)
        if (this.getDefinition().getBoolean(JcrPackageDefinition.PN_DISABLE_INTERMEDIATE_SAVE) ) {
            // MAX_VALUE disables saving completely, therefore we have to use a lower value!
            opts.setAutoSaveThreshold(Integer.MAX_VALUE - 1);
```

### DataFlowIssue
Method invocation `prepareExtract` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            opts.setAutoSaveThreshold(Integer.MAX_VALUE - 1);
        }
        InstallContextImpl ctx = pack.prepareExtract(node.getSession(), opts, mgr.getSecurityConfig(), mgr.isStrictByDefault(),
                mgr.overwritePrimaryTypesOfFoldersByDefault(), mgr.getDefaultIdConflictPolicy());
        JcrPackage snap = null;
```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            opts.setAutoSaveThreshold(Integer.MAX_VALUE - 1);
        }
        InstallContextImpl ctx = pack.prepareExtract(node.getSession(), opts, mgr.getSecurityConfig(), mgr.isStrictByDefault(),
                mgr.overwritePrimaryTypesOfFoldersByDefault(), mgr.getDefaultIdConflictPolicy());
        JcrPackage snap = null;
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                if (p.isValid()) {
                    JcrPackageDefinitionImpl def = (JcrPackageDefinitionImpl) p.getDefinition();
                    PackageId pId = def.getId();

                    // check if package is at the correct location
```

### DataFlowIssue
Method invocation `clearLastUnpacked` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java

                    // ensure that sub package is marked as not-installed. it might contain wrong data in vlt:definition (JCRVLT-114)
                    def.clearLastUnpacked(false);

                    // add dependency to the parent package if required
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            for (JcrPackageImpl p: subPacks) {
                boolean skip = false;
                PackageId id = p.getDefinition().getId();
                SubPackageHandling.Option option = sb.getOption(id);
                String msg = null;
```

### DataFlowIssue
Method invocation `setSubPackages` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            // register sub packages in snapshot and on package for uninstall
            if (snap != null) {
                ((JcrPackageDefinitionImpl) snap.getDefinition()).setSubPackages(subIds);
            }
            if (def != null) {
```

### DataFlowIssue
Method invocation `getMetaInf` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        }
        JcrPackageDefinitionImpl myDef = (JcrPackageDefinitionImpl) getDefinition();
        WorkspaceFilter filter = myDef.getMetaInf().getFilter();
        if (filter == null || filter.getFilterSets().isEmpty()) {
            log.info("Refusing to create snapshot {} due to empty filters", id);
```

### DataFlowIssue
Method invocation `setId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        try {
            JcrPackageDefinitionImpl snapDef = (JcrPackageDefinitionImpl) snap.getDefinition();
            snapDef.setId(id, false);
            snapDef.setFilter(filter, false);
            snapDef.set(JcrPackageDefinition.PN_DESCRIPTION, "Snapshot of package " + myDef.getId().toString(), false);
```

### DataFlowIssue
Method invocation `getSubPackages` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        List<PackageId> subPackages = snap == null
                ? def.getSubPackages()
                : ((JcrPackageDefinitionImpl) snap.getDefinition()).getSubPackages();

        if (snap == null) {
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
                throw new PackageException("Unable to uninstall package. No snapshot present.");
            }
            log.warn("Unable to revert package content {}. Snapshot missing.", getDefinition().getId());
            if (opts.getListener() != null) {
                opts.getListener().onMessage(ProgressTrackerListener.Mode.TEXT, "Unable to revert package content. Snapshot missing.", "");
```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java

        } else {
            Session s = getNode().getSession();
            // check for recursive uninstall
            if (!opts.isNonRecursive() && subPackages.size() > 0) {
```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            opts.setImportMode(ImportMode.REPLACE);
            snap.extract(opts);
            snap.getNode().remove();
            s.save();
        }
```

### DataFlowIssue
Method invocation `clearLastUnpacked` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        // revert installed flags on this package
        JcrPackageDefinitionImpl def = (JcrPackageDefinitionImpl) getDefinition();
        def.clearLastUnpacked(true);

        mgr.dispatch(PackageEvent.Type.UNINSTALL, def.getId(), null);
```

### DataFlowIssue
Method invocation `getFilterSets` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        // check if filter has root outside /etc/packages
        boolean hasOwnContent = false;
        for (PathFilterSet root: a.getMetaInf().getFilter().getFilterSets()) {
            // todo: find better way to detect subpackages
            if (!Text.isDescendantOrEqual(DEFAULT_PACKAGE_ROOT_PATH, root.getRoot())) {
```

### DataFlowIssue
Method invocation `getSession` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        // check if package has nodetype no installed in the repository
        if (!hasOwnContent) {
            DefaultNamePathResolver npResolver = new DefaultNamePathResolver(getNode().getSession());
            NodeTypeManager ntMgr = getNode().getSession().getWorkspace().getNodeTypeManager();
            loop0: for (NodeTypeSet cnd: a.getMetaInf().getNodeTypes()) {
```

### DataFlowIssue
Method invocation `getByteStream` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        for (Archive.Entry e: entries) {
            VaultInputSource in = a.getInputSource(e);
            try (InputStream ins = in.getByteStream()) {
                try {
                    PackageId id = extractSubpackage(pId, ins, opts, processed, hasOwnContent);
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            JcrPackageDefinition d1 = getDefinition();
            JcrPackageDefinition d2 = o.getDefinition();
            return d1.getId().compareTo(d2.getId());
        } catch (Exception e) {
            log.error("error during compare: {}", e.toString());
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
            JcrPackageDefinition d1 = getDefinition();
            JcrPackageDefinition d2 = o.getDefinition();
            return d1.getId().compareTo(d2.getId());
        } catch (Exception e) {
            log.error("error during compare: {}", e.toString());
```

### DataFlowIssue
Dereference of `localDir.listFiles()` may produce `NullPointerException`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Sync.java`
#### Snippet
```java
                    mountPoint);
            // check if empty
            if (localDir.listFiles().length > 0) {
                throw new VltException("Aborting initialization since directory is not empty.");
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
                }
            } else {
                state = State.VOID;
            }
        } else {
```

### DataFlowIssue
Method invocation `dump` may produce `NullPointerException`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Checkout.java`
#### Snippet
```java
                DumpContext dc = new DumpContext(new PrintWriter(ctx.getStdout()));
                dc.println("Filter");
                ctx.getMetaInf().getFilter().dump(dc, true);
                dc.outdent();
                dc.flush();
```

### DataFlowIssue
Dereference of `dir.listFiles(fileFilter)` may produce `NullPointerException`
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/TreeSync.java`
#### Snippet
```java
        }
        if (dir.isDirectory()) {
            for (File file: dir.listFiles(fileFilter)) {
                Entry e = fsEntries.get(file.getName());
                if (e == null) {
```

### DataFlowIssue
Method invocation `getDependencies` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
        for (PackageId subId : state.getSubPackages().keySet()) {
            FSInstallState subState = getInstallState(subId);
            allDependencies.addAll(subState.getDependencies());
        }

```

### DataFlowIssue
Method invocation `getFilter` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
        }
        try (VaultPackage vltPkg = pkg.getPackage()) {
            WorkspaceFilter filter = getInstallState(vltPkg.getId()).getFilter();
            switch(scope) {
                case APPLICATION_SCOPED:
```

### DataFlowIssue
Method invocation `getFilterSets` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
            // As for JcrPackageImpl subpackages need to get an implicit autoDependency to the parent in case they have own content
            boolean hasOwnContent = false;
            for (PathFilterSet root : pkg.getArchive().getMetaInf().getFilter().getFilterSets()) {
                // todo: find better way to detect subpackages
                if (!Text.isDescendantOrEqual(DEFAULT_PACKAGE_ROOT_PATH, root.getRoot())) {
```

### DataFlowIssue
Method invocation `isExternal` may produce `NullPointerException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
    
            if (Files.exists(pkgFile)) {
                if (replace && !state.isExternal()) {
                    Files.delete(pkgFile);
                } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                while (c != null) {
                    if (c.line0 <= end0) {
                        end0 = lines0.length;
                        end1 = lines1.length;
                        c = c.nextChange;
```

### DataFlowIssue
Variable is already assigned to this value
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                    if (c.line0 <= end0) {
                        end0 = lines0.length;
                        end1 = lines1.length;
                        c = c.nextChange;
                    } else {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'validateJcrPath' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/JcrPathValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default @Nullable Collection<ValidationMessage> validateJcrPath(@NotNull NodeContext nodeContext, boolean isFolder) { 
        return validateJcrPath(nodeContext.getFilePath()); 
    }
```

### DeprecatedIsStillUsed
Deprecated member 'validateEnd' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default @Nullable Collection<ValidationMessage> validateEnd(@NotNull DocViewNode node, @NotNull NodeContext nodeContext, boolean isRoot) {
        return null;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'shouldValidateMetaInfData' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/GenericMetaInfDataValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default boolean shouldValidateMetaInfData(@NotNull Path filePath) {
        throw new UnsupportedOperationException();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'validateMetaInfData' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/GenericMetaInfDataValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default @Nullable Collection<ValidationMessage> validateMetaInfData(@NotNull InputStream input, @NotNull Path filePath) throws IOException {
        throw new UnsupportedOperationException();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'validateMetaInfPath' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/MetaInfPathValidator.java`
#### Snippet
```java
     */
    @Deprecated 
    default @Nullable Collection<ValidationMessage> validateMetaInfPath(@NotNull Path filePath) { 
        throw new UnsupportedOperationException();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'validateJcrData' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/GenericJcrDataValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default @Nullable Collection<ValidationMessage> validateJcrData(@NotNull InputStream input, @NotNull Path filePath, @NotNull Map<String, Integer> nodePathsAndLineNumbers) throws IOException {
        throw new UnsupportedOperationException();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'shouldValidateJcrData' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/GenericJcrDataValidator.java`
#### Snippet
```java
     */
    @Deprecated
    default boolean shouldValidateJcrData(@NotNull Path filePath) {
        throw new UnsupportedOperationException();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS' is still used
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidatorFactory.java`
#### Snippet
```java
    public static final String OPTION_SEVERITY_FOR_UNCOVERED_ANCESTOR_NODES = "severityForUncoveredAncestorNodes";
    @Deprecated
    private static final Object OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS = "severityForUncoveredFilterRootAncestors"; // TODO: confusing naming
    private static final Object OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS = "severityForUndefinedFilterRootAncestors";
    public static final String OPTION_SEVERITY_FOR_ORPHANED_FILTER_RULES = "severityForOrphanedFilterRules";
```

### DeprecatedIsStillUsed
Deprecated member 'SHA1' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/SHA1.java`
#### Snippet
```java
 */
@Deprecated
public class SHA1 {

    public final static SHA1 NULL = new SHA1(0,0,0,0,0);
```

### DeprecatedIsStillUsed
Deprecated member 'verifyId' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     */
    @Deprecated
    boolean verifyId(boolean autoFix, boolean autoSave) throws RepositoryException;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'addPropertyFilterSet' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
     */
    @Deprecated
    public void addPropertyFilterSet(PathFilterSet set) {
        // minimal backward compatibility: replace the props filter with the same root
        Iterator<PathFilterSet> iter = propsFilterSets.iterator();
```

### DeprecatedIsStillUsed
Deprecated member 'DocViewProperty' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
 */
@Deprecated
public class DocViewProperty {

    public static final String BINARY_REF = "BinaryRef";
```

### DeprecatedIsStillUsed
Deprecated member 'DocViewNode' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
 */
@Deprecated
public class DocViewNode {

    public final @NotNull String name; // always use expanded names here
```

### DeprecatedIsStillUsed
Deprecated member 'getInstallationPath' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
     */
    @Deprecated
    public String getInstallationPath() {
        StringBuilder b = new StringBuilder(ETC_PACKAGES_PREFIX);
        if (group.length() > 0) {
```

### DeprecatedIsStillUsed
Deprecated member 'ETC_PACKAGES' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ETC_PACKAGES = "/etc/packages";

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ETC_PACKAGES_PREFIX' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String ETC_PACKAGES_PREFIX = "/etc/packages/";

    public static final PackageId[] EMPTY = new PackageId[0];
```

### DeprecatedIsStillUsed
Deprecated member 'FSPackageRegistry' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     */
    @Deprecated
    public FSPackageRegistry(@NotNull File homeDir) throws IOException {
        this(homeDir, InstallationScope.UNSCOPED);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'FSPackageRegistry' is still used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     */
    @Deprecated
    public FSPackageRegistry(@NotNull File homeDir, InstallationScope scope) throws IOException {
       this(homeDir, scope, null);
    }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java

            // TODO: correct behavior for MERGE and MERGE_PRESERVE?
            Principal[] principals = principalNames.stream().map(name -> getPrincipal(name)).toArray(Principal[]::new);

            psPolicy.addPrincipals(principals);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'id' in a Serializable class
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageExistsException.java`
#### Snippet
```java
public class PackageExistsException extends PackageException {

    private PackageId id;

    public PackageExistsException() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'id' in a Serializable class
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/NoSuchPackageException.java`
#### Snippet
```java
public class NoSuchPackageException extends PackageException {

    private PackageId id;

    public NoSuchPackageException() {
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
        if (idx > 0) {
            String pfx = name.substring(0, idx);
            if (!prefixes.contains(pfx)) {
                prefixes.add(pfx);
            }
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getSupportedVersion()` during object construction
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    public static final String ATTR_VERSION = "version";

    protected double version = getSupportedVersion();

    abstract protected String getRootElemName();
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
                return properties.getProperty("version", version);
            }
        } catch (IOException ignored) {
            log.warn("failed to read pom properties for " + moduleName, ignored);
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidatorSettings.java`
#### Snippet
```java
     * Returns the additional options.
     * 
     * @return list of options relevant for this validator
     */
    @NotNull Map<String, String> getOptions();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/ImportInfo.java`
#### Snippet
```java
    /**
     * Returns a list of memberships that need to be resolved
     * @return a list of memberships
     */
    Map<String, String[]> getMemberships();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageProperties.java`
#### Snippet
```java
    /**
     * Returns an unmodifiable list of dependencies
     * @return list of dependencies
     */
    Dependency[] getDependencies();
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     *
     * @param opts import options
     * @return the list of subpackages that were extracted
     * @throws RepositoryException if a repository error during installation occurs.
     * @throws PackageException if an error during packaging occurs
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
            char c = p.charAt(i);
            if (c == '$') {
                c = p.charAt(++i);
                if (c == '{') {
                    int j = p.indexOf('}', i);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
                    }
                    out.append(prop);
                    i = j;
                } else {
                    out.append('$');
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            byte b = utf8[k];
            if (b == escape) {
                out.write((decodeDigit(utf8[++k]) << 4) & 0xff + decodeDigit(utf8[++k]) & 0xff);
            }
            else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
            byte b = utf8[k];
            if (b == escape) {
                out.write((decodeDigit(utf8[++k]) << 4) & 0xff + decodeDigit(utf8[++k]) & 0xff);
            }
            else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
            if (c == '%') {
                if (platformName.length() > i+2) {
                    int a = Character.digit(platformName.charAt(++i), 16);
                    int b = Character.digit(platformName.charAt(++i), 16);
                    c = (char) (a * 16 + b);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
                if (platformName.length() > i+2) {
                    int a = Character.digit(platformName.charAt(++i), 16);
                    int b = Character.digit(platformName.charAt(++i), 16);
                    c = (char) (a * 16 + b);
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
                    firstUnderscore = true;
                    if (platformName.length()>1) {
                        c = platformName.charAt(++i);
                        if (c == '_') {
                            buffer.append('_');
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-davex/src/main/java/org/apache/jackrabbit/vault/davex/DAVExRepositoryFactory.java`
#### Snippet
```java
                parameters.putAll(connectionOptions.toServiceFactoryParameters());
            }
            System.out.printf("Connecting via JCR remoting to %s%n", address.getSpecificURI().toString());
            return new RepositoryFactoryImpl().getRepository(parameters);
        } catch (IOException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
            if (packageType != PackageType.CONTENT) {
                message = new ValidationMessage(severity, String.format(MESSAGE_UNSUPPORTED_SUB_PACKAGE_OF_TYPE, containerPackageType,
                        PackageType.CONTENT.toString(), packageType));
            }
            break;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
                        includeEntries.append(", ");
                    }
                    includeEntries.append(pathFilterEntry.getFilter().toString());
                }
                orphanEntries.append(includeEntries).append("] below root '").append(entry.getKey().getRoot()).append("'");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
        }
        if (orphanEntries.length() > 0) {
            return Collections.singleton(new ValidationMessage(severityForOrphanedFilterEntries, String.format(MESSAGE_ORPHANED_FILTER_ENTRIES, orphanEntries.toString())));
        } else {
            return null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/util/classloaderurl/CndUtil.java`
#### Snippet
```java
                    } else {
                        for (String nodetype : slingNodetypes.split(",")) {
                            resolvedUrls.add(jarUrl.toString() + nodetype.trim());
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AggregateCFile.java`
#### Snippet
```java
            return new AggregateCFile(node);
        } catch (RepositoryException e) {
            throw new IOException("Error while retrieving file: " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
            RepositoryAddress mp =
                    new RepositoryAddress(uri.toString());
            log.info("Mounting JcrFs on {}", mp.toString());

            ExportRoot exportRoot = ExportRoot.findRoot(getPlatformFile("", true));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                info.append(rep.getDescriptor(Repository.REP_NAME_DESC)).append(' ');
                info.append(rep.getDescriptor(Repository.REP_VERSION_DESC));
                log.info("Connected to {} ({})", uri, info.toString());
            } catch (Exception e) {
                rep = null;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
                    StringBuffer buf = new StringBuffer();
                    addCause(buf, e.getCause(), null);
                    log.error("{}: {}", c.getName(), buf.toString(), e);

                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java
                StringBuffer buf = new StringBuffer();
                addCause(buf, e, null);
                log.error("{}: {}", c.getName(), buf.toString(), e);
                return true;
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
                    stream = getValue().getBinary().getStream();
                } catch (RepositoryException e) {
                    throw new IOException("Error while opening stream: " + e.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                if (e instanceof ConstraintViolationException && wspFilter.getImportMode(nodePath) != ImportMode.REPLACE) {
                    // only warn in case of constraint violations for mode != replace (as best effort is used in that case)
                    log.warn("Error during processing of {}: {}, skip node due to import mode {}", nodePath, e.toString(), wspFilter.getImportMode(nodePath));
                    importInfo.onNop(nodePath);
                } else {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
     */
    protected static PackageId createRandomPid() {
        return new PackageId("temporary", "pack_" + UUID.randomUUID().toString(), (String) null);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
            return registry.isInstalled(getId());
        } catch (IOException e) {
            log.error("Packagestate couldn't be read for package {}", getId().toString(), e);
            return false;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/Ignored.java`
#### Snippet
```java
        }
        reg.append("$");
        log.info("Adding ignored path: {}", reg.toString());
        ignored.add(new DefaultPathFilter(reg.toString()));
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Info.java`
#### Snippet
```java
            RepositoryAddress addr = root.resolve(e.getAggregatePath());
            addr = addr.resolve(e.getRepoRelPath());
            out.printf("   URL: %s%n", addr.toString());
            print(out, "  Work", e.work());
            print(out, "  Base", e.base());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java
                    save();
                } catch (IOException e) {
                    log.warn("Unable to save initial config: " + e.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
        } catch (IOException e) {
            // ignore
            log.warn("Error while loading config: " + e.toString());
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
                return filter;
            } catch (Exception e) {
                log.error("Error while loading sync filter: " + e.toString());
            }
        } else {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ArchiveNotOpenException` may be 'static'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipNioArchive.java`
#### Snippet
```java
    }

    public final class ArchiveNotOpenException extends IllegalStateException {
        /**
         * 
```

### InnerClassMayBeStatic
Inner class `FilterEntry` may be 'static'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SubPackageFilterArchive.java`
#### Snippet
```java
     * Special entry that filters out /jcr_root/etc/packages
     */
    private final class FilterEntry implements Entry {

        private final Entry base;
```

### InnerClassMayBeStatic
Inner class `AttributeComparator` may be 'static'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/NormalizingSaxFilter.java`
#### Snippet
```java
public class NormalizingSaxFilter extends XMLFilterImpl implements LexicalHandler {

    private final class AttributeComparator implements Comparator<Attribute> {

        private final QNameComparator nameComparator;
```

### InnerClassMayBeStatic
Inner class `Attribute` may be 'static'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/FormattingXmlStreamWriter.java`
#### Snippet
```java
    }

    private final class Attribute {
        private final String prefix;
        private final String namespaceURI;
```

### InnerClassMayBeStatic
Inner class `Hook` may be 'static'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/InstallHookProcessorImpl.java`
#### Snippet
```java
    }

    private class Hook {

        private final String name;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPut.java`
#### Snippet
```java
        if (jcrPath == null) {
            jcrPath = Text.getName(name);
            if (jcrPath.equals("")) {
                jcrPath = name;
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
        mode = Table.Col.SPACES.substring(0, indent * 2) + mode;
        try {
            if (node.getName().equals("")) {
                mode += "/";
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDump.java`
#### Snippet
```java
        if (fs == null) {
            VaultFsApp.log.info("Not mounted.");
        } else if (path != null && !path.equals("")) {
            if (cl.hasOption(optConfig) || cl.hasOption(optFilter)) {
                ConsoleFile f = ctx.getCurrentFile();
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/FilterSet.java`
#### Snippet
```java
    @NotNull
    public String getRoot() {
        return "".equals(root) ? "/" : root;
    }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileImpl.java`
#### Snippet
```java
        this.fs = fs;
        this.node = node;
        if (rootPath.equals("")) {
            this.name = rootPath;
            // bit of a hack since we know how the root artifacts look like
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
    public VaultFile getFile(VaultFile parent, String path)
            throws IOException, RepositoryException {
        if (path == null || path.equals("") || path.equals(".")) {
            return parent;
        } else if (path.equals("/")) {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/legacycnd/ParseException.java`
#### Snippet
```java
        StringBuffer b = new StringBuffer(super.getMessage());
        String delim = " (";
        if (systemId != null && !"".equals(systemId)) {
            b.append(delim);
            b.append(systemId);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || v.equals("")) {
            v = "1.0";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || v.equals("")) {
            v = "1.0";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java

        String className = elem.getAttribute("class");
        if (className == null || className.equals("")) {
            className = (String) defaultClasses.get(elem.getNodeName());
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
            className = (String) defaultClasses.get(elem.getNodeName());
        }
        if (className == null || className.equals("")) {
            // create string object
            return elem.getFirstChild().getNodeValue();
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
    private void processHandler(Element elem) throws ConfigurationException {
        String type = elem.getAttribute("type");
        if (type == null || type.equals("")) {
            type = "generic";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultFsConfig11.java`
#### Snippet
```java
    private void processAggregate(Element elem) throws ConfigurationException {
        String type = elem.getAttribute("type");
        if (type == null || type.equals("")) {
            type = "generic";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
     */
    public static String[] makePath(String[] parent, String path) {
        if (path == null || path.equals("") || path.equals(".")) {
            return parent;
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        }
        String v = doc.getAttribute(ATTR_VERSION);
        if (v == null || "".equals(v)) {
            v = "1.0";
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
    protected PathFilter readFilter(Element elem) throws ConfigurationException {
        String pattern = elem.getAttribute("pattern");
        if (pattern == null || "".equals(pattern)) {
            throw new ConfigurationException("Filter pattern must not be empty");
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltException.java`
#### Snippet
```java
    
    public String getMessage() {
        return path == null || path.equals("") || path.equals(".")
                ? super.getMessage()
                : path + ": " + super.getMessage();
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanBuilderImpl.java`
#### Snippet
```java
            }
            String v = doc.getAttribute(ATTR_VERSION);
            if (v == null || "".equals(v)) {
                v = "1.0";
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageImpl.java`
#### Snippet
```java
        }
        for (PathFilterSet set: filter.getFilterSets()) {
            if (("".equals(set.getRoot()) || "/".equals(set.getRoot())) && set.getEntries().isEmpty()) {
                log.info("Refusing to create snapshot {} due to / only filter", id);
                return null;
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DocumentViewParserValidatorFactory.java`
#### Snippet
```java
        final boolean allowUndeclaredPrefixInFileName;
        if (settings.getOptions().containsKey(OPTION_ALLOW_UNDECLARED_PREFIX_IN_FILE_NAME)) {
            allowUndeclaredPrefixInFileName = Boolean.valueOf(settings.getOptions().get(OPTION_ALLOW_UNDECLARED_PREFIX_IN_FILE_NAME));
        } else {
            allowUndeclaredPrefixInFileName = true;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
        final boolean prohibitMutableContent;
        if (settings.getOptions().containsKey(OPTION_PROHIBIT_MUTABLE_CONTENT)) {
            prohibitMutableContent = Boolean.valueOf(settings.getOptions().get(OPTION_PROHIBIT_MUTABLE_CONTENT));
        } else {
            prohibitMutableContent = false;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
        final boolean prohibitImmutableContent;
        if (settings.getOptions().containsKey(OPTION_PROHIBIT_IMMUTABLE_CONTENT)) {
            prohibitImmutableContent = Boolean.valueOf(settings.getOptions().get(OPTION_PROHIBIT_IMMUTABLE_CONTENT));
        } else {
            prohibitImmutableContent = false;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
        final boolean allowComplexFilterRulesInApplicationPackages;
        if (settings.getOptions().containsKey(OPTION_ALLOW_COMPLEX_FILTER_RULES_IN_APPLICATION_PACKAGES)) {
            allowComplexFilterRulesInApplicationPackages = Boolean.valueOf(settings.getOptions().get(OPTION_ALLOW_COMPLEX_FILTER_RULES_IN_APPLICATION_PACKAGES));
        } else {
            allowComplexFilterRulesInApplicationPackages = false;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
        final boolean allowInstallHooksInApplicationPackages;
        if (settings.getOptions().containsKey(OPTION_ALLOW_INSTALL_HOOKS_IN_APPLICATION_PACKAGES)) {
            allowInstallHooksInApplicationPackages = Boolean.valueOf(settings.getOptions().get(OPTION_ALLOW_INSTALL_HOOKS_IN_APPLICATION_PACKAGES));
        } else {
            allowInstallHooksInApplicationPackages = false;
```

### UnnecessaryBoxing
Unnecessary boxing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ValidationMessageErrorHandler.java`
#### Snippet
```java

    private void print(@NotNull SAXParseException x, @NotNull ValidationMessageSeverity severity) {
        ValidationMessage message = new ValidationMessage(severity, x.getMessage(), Integer.valueOf(x.getLineNumber()),
                Integer.valueOf(x.getColumnNumber()), null);
        messages.add(message);
```

### UnnecessaryBoxing
Unnecessary boxing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ValidationMessageErrorHandler.java`
#### Snippet
```java
    private void print(@NotNull SAXParseException x, @NotNull ValidationMessageSeverity severity) {
        ValidationMessage message = new ValidationMessage(severity, x.getMessage(), Integer.valueOf(x.getLineNumber()),
                Integer.valueOf(x.getColumnNumber()), null);
        messages.add(message);
    }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
            if (idx2 > 0) {
                try {
                    index = Integer.valueOf(name.substring(idx + 1, idx2));
                } catch (NumberFormatException e) {
                    // ignore
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java

    public void setHasFullCoverage(String hasFullCoverage) {
        this.fullCoverage = Boolean.valueOf(hasFullCoverage);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
     */
    public void setFullCoverage(String fullCoverage) {
        this.fullCoverage = Boolean.valueOf(fullCoverage);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/GenericAggregator.java`
#### Snippet
```java
     */
    public void setIsDefault(String aDefault) {
        isDefault = Boolean.valueOf(aDefault);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/NodeTypeItemFilter.java`
#### Snippet
```java
     */
    public void setRespectSupertype(String respectSupertype) {
        this.respectSupertype = Boolean.valueOf(respectSupertype);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/DeclaringTypeItemFilter.java`
#### Snippet
```java
     */
    public void setPropsOnly(String propsOnly) {
        this.propsOnly = Boolean.valueOf(propsOnly);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/IsNodeFilter.java`
#### Snippet
```java
     */
    public void setIsNode(String polarity) {
        isNode = Boolean.valueOf(polarity);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/IsMandatoryFilter.java`
#### Snippet
```java

    public void setCondition(String node) {
        isMandatory = Boolean.valueOf(node);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/filter/IsMandatoryFilter.java`
#### Snippet
```java

    public void setIsMandatory(String node) {
        isMandatory = Boolean.valueOf(node);
    }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
            throw new ConfigurationException("Filter pattern must not be empty");
        }
        boolean matchProperties = Boolean.valueOf(elem.getAttribute("matchProperties"));
        if (matchProperties) {
            return new DefaultPropertyPathFilter(pattern);
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
            long size = 0;
            if (doc.hasAttribute(ATTR_SIZE)) {
                size = Long.valueOf(doc.getAttribute(ATTR_SIZE));
            }
            FSPackageStatus status = FSPackageStatus.valueOf(doc.getAttribute(ATTR_PACKAGE_STATUS).toUpperCase());
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
        try {
            String bc = get(PN_BUILD_COUNT);
            return bc == null ? 0 : Long.valueOf(bc);
        } catch (NumberFormatException e) {
            log.warn("Wrong build count in {}.", getId(), e);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'jcrPath.length() == 0' covered by subsequent condition '!jcrPath.startsWith(...)'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
            localPath = Text.getName(jcrPath);
        }
        if (jcrPath.length() == 0 || !jcrPath.startsWith("/")) {
            throw new ExecutionException("JCR path needs to be absolute: " + jcrPath);
        }
```

### ConditionCoveredByFurtherCondition
Condition 'prev == null' covered by subsequent condition 'prev != Type.CRE'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
    public void onModified(String path) {
        Type prev = getOrCreateInfo(path).type;
        if (prev == null || prev != Type.CRE) {
            addMod(path, Type.MOD, null);
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    public Collection<ValidationMessage> done() {
        StringBuilder orphanEntries = new StringBuilder();
        for (java.util.Map.Entry<PathFilterSet, List<Entry<PathFilter>>> entry : this.orphanedFilterSets.entrySet()) {
            // separator!
            if (orphanEntries.length() > 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    private void removeFromOrphanedFilterEntries(@NotNull String nodePath) {
        // find all filter roots which match
        Iterator<java.util.Map.Entry<PathFilterSet, List<Entry<PathFilter>>>> iter = orphanedFilterSets.entrySet().iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<PathFilterSet, List<Entry<PathFilter>>> orphanedFilterEntry = iter.next();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
        Iterator<java.util.Map.Entry<PathFilterSet, List<Entry<PathFilter>>>> iter = orphanedFilterSets.entrySet().iterator();
        while (iter.hasNext()) {
            java.util.Map.Entry<PathFilterSet, List<Entry<PathFilter>>> orphanedFilterEntry = iter.next();
            if (orphanedFilterEntry.getKey().contains(nodePath)) {
                Iterator<Entry<PathFilter>> includeIterator = orphanedFilterEntry.getValue().iterator();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.felix.cm.file` is unnecessary, and can be replaced with an import
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
            switch(serializationType) {
            case CONFIG:
                return convertToMap(org.apache.felix.cm.file.ConfigurationHandler.read(input));
            case CFG:
                Properties properties = new Properties();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.felix.cm.json` is unnecessary, and can be replaced with an import
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OsgiConfigurationParserValidator.java`
#### Snippet
```java
            case CFG_JSON:
                Reader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
                ConfigurationReader configReader = org.apache.felix.cm.json.Configurations.buildReader().build(reader);
                return convertToMap(configReader.readConfiguration());
            default:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.validation.spi` is unnecessary and can be removed
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationExecutor.java`
#### Snippet
```java
/** 
 * Provides methods to call all registered validators. This instance is bound to the {@link ValidationContext} being given in the 
 * {@link ValidationExecutorFactory#createValidationExecutor(org.apache.jackrabbit.vault.validation.spi.ValidationContext, boolean, boolean, Map)}.
 * This class is thread-safe (i.e. methods can be used from different threads on the same instance). 
 * @see ValidationExecutorFactory
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.spi` is unnecessary and can be removed
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### UnnecessaryFullyQualifiedName
Qualifier `jline` is unnecessary, and can be replaced with an import
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
                        System.out.printf("Please enter password for user %s connecting to %s: ",
                                simpleCredentials.getUserID(), mountpoint);
                        String password = new jline.ConsoleReader().readLine('*');
                        creds = new SimpleCredentials(simpleCredentials.getUserID(), password.toCharArray());
                    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.util` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java

/**
 * Implements an {@link org.apache.jackrabbit.vault.util.InputStreamPump.Pump} that extracts the relevant parts from the input stream into memory.
 * The memory archive is initialized via the {@link #run(InputStream)} being called from {@link InputStreamPump}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.util` is unnecessary, and can be replaced with an import
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
        if (idProp == null || idProp.isMultiValue()) {
            // jackrabbit 2.x or Oak with migrated Jackrabbit 2.x content
            return org.apache.jackrabbit.util.Text.unescapeIllegalJcrChars(node.getName().getLocalName());
        } else {
            // oak 1.x
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.util` is unnecessary, and can be replaced with an import
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
        if (idProp == null || idProp.isMulti) {
            // jackrabbit 2.x or Oak with migrated Jackrabbit 2.x content
            return org.apache.jackrabbit.util.Text.unescapeIllegalJcrChars(node.name);
        } else {
            // oak 1.x
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.config` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     * @param importRoot the root node to import
     *
     * @throws org.apache.jackrabbit.vault.fs.config.ConfigurationException if the importer is not properly configured
     * @throws java.io.IOException if an I/O error occurs
     * @throws javax.jcr.RepositoryException if an repository error occurs
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     *
     * @throws org.apache.jackrabbit.vault.fs.config.ConfigurationException if the importer is not properly configured
     * @throws java.io.IOException if an I/O error occurs
     * @throws javax.jcr.RepositoryException if an repository error occurs
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     * @throws org.apache.jackrabbit.vault.fs.config.ConfigurationException if the importer is not properly configured
     * @throws java.io.IOException if an I/O error occurs
     * @throws javax.jcr.RepositoryException if an repository error occurs
     *
     * @since 2.3.20
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.impl.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewAdapter.java`
#### Snippet
```java

/**
 * {@code DocViewAdapter} is used by the {@link org.apache.jackrabbit.vault.fs.impl.io.DocViewImporter} to handle
 * special content that is not importable using "normal" JCR calls. For example users and other protected content
 * needs to be imported using the {@link javax.jcr.Session#importXML(String, java.io.InputStream, int)} or similar.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
/**
 * Implements a doc view adapter that reads the ACL information of the docview hierarchy and applies it to the
 * underlying repository, based on the {@link org.apache.jackrabbit.vault.fs.io.AccessControlHandling}
 */
public class JackrabbitACLImporter implements DocViewAdapter {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     * @param data      the data to digest with the given algorithm
     * @return The digested plain text String represented as Hex digits.
     * @throws java.security.NoSuchAlgorithmException if the desired algorithm is not supported by
     *                                  the MessageDigest class.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     * @param enc       The character encoding to use
     * @return The digested plain text String represented as Hex digits.
     * @throws java.security.NoSuchAlgorithmException     if the desired algorithm is not supported by
     *                                      the MessageDigest class.
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     * @throws java.security.NoSuchAlgorithmException     if the desired algorithm is not supported by
     *                                      the MessageDigest class.
     * @throws java.io.UnsupportedEncodingException if the encoding is not supported
     */
    public static String digest(String algorithm, String data, String enc)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.util` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
/**
 * Helper class that represents an immutable JCR node abstraction encapsulating multiple
 * {@link org.apache.jackrabbit.vault.util.DocViewProperty2} properties.
 * @see <a href="https://jackrabbit.apache.org/filevault/docview.html">FileVault Document View Format</a>
 * @since 3.6.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageProperties.java`
#### Snippet
```java
    /**
     * Name of the 'acHandling' by meta-inf property.
     * @see org.apache.jackrabbit.vault.fs.io.AccessControlHandling
     */
    String NAME_AC_HANDLING = "acHandling";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/JcrPackage.java`
#### Snippet
```java
     * Checks if this package is installed.
     *
     * Note: the default implementation only checks the {@link org.apache.jackrabbit.vault.packaging.JcrPackageDefinition#getLastUnpacked()}
     * date. If the package is replaced since it was installed. this method will return {@code false}.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.util` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
/**
 * Helper class that represents a JCR node abstraction encapsulating multiple
 * {@link org.apache.jackrabbit.vault.util.DocViewProperty properties}.
 * @deprecated Use {@link DocViewNode2} instead.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Packaging.java`
#### Snippet
```java
     * jcr:content/jcr:data property).
     *
     * This is a shortcut version of {@link org.apache.jackrabbit.vault.packaging.JcrPackageManager#open(javax.jcr.Node, boolean)}
     * which does not create a package manager instance.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Packaging.java`
#### Snippet
```java
     * jcr:content/jcr:data property).
     *
     * This is a shortcut version of {@link org.apache.jackrabbit.vault.packaging.JcrPackageManager#open(javax.jcr.Node, boolean)}
     * which does not create a package manager instance.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Packaging.java`
#### Snippet
```java
     * @return the new package or {@code null} it the package is not
     *         valid unless {@code allowInvalid} is {@code true}.
     * @throws javax.jcr.RepositoryException if an error occurs
     * 
     * @since 2.3.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/SubPackageHandling.java`
#### Snippet
```java
    /**
     * Gets the option from the entries list that matches the package last. If no entry match, it returns
     * {@link org.apache.jackrabbit.vault.packaging.SubPackageHandling.Option#INSTALL}
     * @param id the package id to match
     * @return the option.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/SubPackageHandling.java`
#### Snippet
```java
/**
 * The sub package handling specifies how sub package are handled during recursive package installation. This
 * configuration consists of a list of {@link org.apache.jackrabbit.vault.packaging.SubPackageHandling.Entry}s that
 * match against a given {@link org.apache.jackrabbit.vault.packaging.PackageId}. The version of the package id is
 * ignored.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/SubPackageHandling.java`
#### Snippet
```java
 * The sub package handling specifies how sub package are handled during recursive package installation. This
 * configuration consists of a list of {@link org.apache.jackrabbit.vault.packaging.SubPackageHandling.Entry}s that
 * match against a given {@link org.apache.jackrabbit.vault.packaging.PackageId}. The version of the package id is
 * ignored.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
     * @param <T> Type of the collection.
     * @throws CyclicDependencyException if a cyclic dependency is detected
     * @throws javax.jcr.RepositoryException if an repository error occurs
     */
    public static <T extends JcrPackage> void sortPackages(Collection<T> packages)
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     * @param subPackages receives the list of potential sub packages
     *
     * @throws javax.jcr.RepositoryException if a repository error during installation occurs.
     * @throws org.apache.jackrabbit.vault.packaging.PackageException if an error during packaging occurs
     * @throws IllegalStateException if the package is not valid.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     *
     * @throws javax.jcr.RepositoryException if a repository error during installation occurs.
     * @throws org.apache.jackrabbit.vault.packaging.PackageException if an error during packaging occurs
     * @throws IllegalStateException if the package is not valid.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.jcr` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     * @param defaultIdConflictPolicy the default {@link IdConflictPolicy} to use if no policy is set in {@code opts}. May be {@code null}.
     *
     * @throws javax.jcr.RepositoryException if a repository error during installation occurs.
     * @throws org.apache.jackrabbit.vault.packaging.PackageException if an error during packaging occurs
     * @throws IllegalStateException if the package is not valid.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.packaging` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ZipVaultPackage.java`
#### Snippet
```java
     *
     * @throws javax.jcr.RepositoryException if a repository error during installation occurs.
     * @throws org.apache.jackrabbit.vault.packaging.PackageException if an error during packaging occurs
     * @throws IllegalStateException if the package is not valid.
     * @return installation context
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
    /**
     * Parses the {@code jcrName} (either qualified or expanded) and validates it.
     * @throws java.lang.IllegalArgumentException if the name is not valid
     */
    private static void assertValidJcrName(String jcrName) throws IllegalArgumentException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.osgi.annotation.versioning` is unnecessary, and can be replaced with an import
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/package-info.java`
#### Snippet
```java
 * limitations under the License.
 */
@org.osgi.annotation.versioning.Version("1.4.0")
package org.apache.jackrabbit.vault.packaging.registry;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java
 * Persisted cache of all {@link FSInstallState} objects for all packages in a registry.
 * Populated on demand and written back immediately for every modifying operation.
 * All map operations might throw {@link java.io.UncheckedIOException}.
 * Is thread-safe.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
            }
            if (subPackages != null) {
                for (java.util.Map.Entry<PackageId, Option> entry : subPackages.entrySet()) {
                    writer.writeStartElement(TAG_SUBPACKAGE);
                    writer.writeAttribute(ATTR_PACKAGE_ID, entry.getKey().toString());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.api` is unnecessary and can be removed
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * recognized:
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.api` is unnecessary and can be removed
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jackrabbit.vault.fs.api` is unnecessary and can be removed
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
 * Please note, that the docview serialization is recognized if the first
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
     * @param source the source to analyze
     * @return the serialization type
     * @throws java.io.IOException if an I/O error occurs
     */
    public static SerializationType analyze(InputSource source) throws IOException {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdDebug.java`
#### Snippet
```java
                    IOUtils.copy(r.getSource(), System.out);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new ExecutionException(e);
                }
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidatorFactory.java`
#### Snippet
```java

        final String defaultNodeType;
        if (settings.getOptions().containsKey(OPTION_DEFAULT_NODE_TYPES)) {
            defaultNodeType = settings.getOptions().get(OPTION_DEFAULT_NODE_TYPES);
        } else {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java

    public void sort(final int col) {
        Collections.sort(rows, new Comparator() {
            public int compare(Object o1, Object o2) {
                Row r1 = (Row) o1;
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
        in = new PipedInputStream(out, 8192);

        pumpThread = new Thread(new Runnable() {
            public void run() {
                try {
```

### Convert2Lambda
Anonymous new FileFilter() can be replaced with lambda
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    };

    private FileFilter fileFilter = new FileFilter() {
        public boolean accept(File file) {
            String name = file.getName();
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DependencyValidator.java`
#### Snippet
```java
                String msg = String.format(MESSAGE_UNRESOLVED_DEPENDENCY, dependency);
                messages.add(new ValidationMessage(severityForUnresolvedDependencies, msg));
                continue;
            }
            // TODO: check for overlapping roots with current filter.xml
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `exception()` not thrown
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            ctx.exception(file.getPath(), "Error while preparing commit.", e);
        } catch (RepositoryException e) {
            ctx.exception(file.getPath(), "Error while preparing commit.", e);
```

### ThrowableNotThrown
Result of `exception()` not thrown
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            ctx.exception(file.getPath(), "Error while preparing commit.", e);
        } catch (RepositoryException e) {
            ctx.exception(file.getPath(), "Error while preparing commit.", e);
        }

```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
            }
        });
        pumpThread.start();
    }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return (obj == this);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return (obj == this);
        }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JcrNamespaceHelper.java`
#### Snippet
```java
        if (!pfxToURI.isEmpty()) {
            for (Object o : pfxToURI.keySet()) {
                String prefix = (String) o;
                String uri = pfxToURI.get(prefix);
                try {
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'String'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
        for (Object o : mapping.getPrefixToURIMapping().keySet()) {
            try {
                String pfx = (String) o;
                String uri = mapping.getURI(pfx);
                nsMapping.setMapping(pfx, uri);
```

