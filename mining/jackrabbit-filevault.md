# jackrabbit-filevault 
 
# Bad smells
I found 1176 bad smells with 366 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 280 | true |
| JavadocDeclaration | 129 | false |
| FieldMayBeFinal | 110 | false |
| Deprecation | 58 | false |
| IgnoreResultOfCall | 41 | false |
| ConstantValue | 39 | false |
| ToArrayCallWithZeroLengthArrayArgument | 38 | true |
| JavadocReference | 34 | false |
| DuplicatedCode | 34 | false |
| UNCHECKED_WARNING | 31 | false |
| TrivialIf | 31 | false |
| DataFlowIssue | 28 | false |
| ProtectedMemberInFinalClass | 27 | true |
| DuplicateThrows | 23 | false |
| IOStreamConstructor | 19 | false |
| CommentedOutCode | 18 | false |
| DeprecatedIsStillUsed | 18 | false |
| RedundantTypeArguments | 16 | false |
| CharsetObjectCanBeUsed | 15 | false |
| RedundantClassCall | 11 | false |
| StringOperationCanBeSimplified | 11 | false |
| UnusedAssignment | 10 | false |
| EmptyStatementBody | 9 | false |
| FieldCanBeLocal | 9 | false |
| UnnecessaryToStringCall | 9 | true |
| StringBufferReplaceableByString | 8 | false |
| UnnecessarySemicolon | 8 | false |
| JavadocLinkAsPlainText | 7 | false |
| UNUSED_IMPORT | 7 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 7 | false |
| CStyleArrayDeclaration | 5 | false |
| DuplicateBranchesInSwitch | 5 | false |
| InnerClassMayBeStatic | 5 | true |
| DuplicateExpressions | 4 | false |
| RedundantMethodOverride | 4 | false |
| StringConcatenationInLoops | 4 | false |
| MismatchedJavadocCode | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| FinalStaticMethod | 3 | false |
| TrivialStringConcatenation | 3 | false |
| SwitchStatementWithTooFewBranches | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| PointlessBooleanExpression | 3 | true |
| SortedCollectionWithNonComparableKeys | 2 | false |
| FinalMethodInFinalClass | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| ThrowableNotThrown | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| RegExpRedundantEscape | 1 | false |
| UnnecessaryEmptyArrayUsage | 1 | false |
| FinalPrivateMethod | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| MalformedFormatString | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| OptionalIsPresent | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| DanglingJavadoc | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| UnnecessaryInitCause | 1 | false |
| AutoCloseableResource | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryContinue | 1 | false |
| UseBulkOperation | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UnnecessaryModifier]
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
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleCommand.java`
#### Snippet
```java
public interface ConsoleCommand extends CliCommand {

    public boolean execute(ConsoleExecutionContext ctx, CommandLine cl)
            throws Exception;

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
     * Stops tracking of aggregate lifecycle
     */
    public void stopTracking();


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
    Collection<Info> commit() throws RepositoryException, IOException;

    public enum Type {
        ADDED, ADDED_X, DELETED, MODIFIED, MOVED, MKDIR, ERROR
    }
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
     * @return the relative platform path
     */
    public String getPlatformPath();

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
     * @throws RepositoryException if a repository error occurs.
     */
    public void onProperty(Property prop, int depth) throws RepositoryException;

    /**
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
    public void onWalkBegin(Node root) throws RepositoryException;

    /**
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
    public void onNodeEnd(Node node, boolean included, int depth)
            throws RepositoryException;

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
`else` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                                info.onNop(fileNode.getPath());
                            }
                        } else {
                            // do nothing
                        }
```

### EmptyStatementBody
`else` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/FileAggregator.java`
#### Snippet
```java
                return true;
            }
        } else {
            // no sub nodes.
        }
```

### EmptyStatementBody
`if` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    repoPath += repoName;
                    assertInFilter(repoPath);
                    if (false && change.isa.getSerializationType() == SerializationType.XML_DOCVIEW) {
                        // special case that full coverage is below a intermediate
                        // ignore and wait for next cycle
```

### EmptyStatementBody
`if` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
        for (int i=0; i<composed.length; i++) {
            String element = composed[i];
            if (element.equals(".")) {
                // skip
            } else if (element.equals("..")) {
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

### EmptyStatementBody
`if` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
        this.highIncl = highIncl;
        StringBuilder b = new StringBuilder();
        if (low == null && high == null) {
            // infinite range, empty string
        } else if (high == null) {
```

### EmptyStatementBody
`if` statement has empty body
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackageId.java`
#### Snippet
```java
                    }
                    state = STATE_NAME_START;
                } else if (state == STATE_URI) {
                    // ignore -> validation of uri later on.
                } else {
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

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
     */
    private Map<Name, QNodeTypeDefinition> nodeTypes =
            new TreeMap<Name, QNodeTypeDefinition>();

    /**
```

### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
     */
    private Map<Name, QNodeTypeDefinition> removed =
            new TreeMap<Name, QNodeTypeDefinition>();


```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
    private final String validatorId; // may only be null if message was not bound to a validator

    public static final Collection<ValidationViolation> wrapMessages(String validatorId, Collection<? extends ValidationMessage> messages, Path filePath, Path basePath, String nodePath, int line, int column) {
        Collection<ValidationViolation> violations = new LinkedList<>();
        for (ValidationMessage message : messages) {
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
    }

    public static final ValidationViolation wrapMessage(String validatorId, ValidationMessage message, Path filePath, Path basePath, String nodePath, int line, int column) {
        if (message instanceof ValidationViolation) {
            ValidationViolation delegate = ValidationViolation.class.cast(message);
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

## RuleId[id=Deprecation]
### Deprecation
'setProperty(java.lang.String, java.io.InputStream)' is deprecated
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Debug.java`
#### Snippet
```java
        try {
            Node tmp = s.getNode("/tmp");
            tmp.setProperty("test_binary", new ByteArrayInputStream(buf));
            tmp.setProperty("test_binary", new ByteArrayInputStream(buf));
            s.save();
```

### Deprecation
'setProperty(java.lang.String, java.io.InputStream)' is deprecated
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Debug.java`
#### Snippet
```java
            Node tmp = s.getNode("/tmp");
            tmp.setProperty("test_binary", new ByteArrayInputStream(buf));
            tmp.setProperty("test_binary", new ByteArrayInputStream(buf));
            s.save();
        } catch (RepositoryException e) {
```

### Deprecation
'getUUID()' is deprecated
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsRepo.java`
#### Snippet
```java
        if ((flags & F_FLAG_UUID) > 0) {
            try {
                r.addCol(node.getUUID());
            } catch (RepositoryException e) {
                r.addCol("");
```

### Deprecation
'org.apache.jackrabbit.vault.util.DocViewNode' is deprecated
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     */
    default @Nullable Collection<ValidationMessage> validate(@NotNull DocViewNode2 node, @NotNull NodeContext nodeContext, boolean isRoot) {
        return validate(DocViewNode.fromDocViewNode2(node), nodeContext, isRoot);
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.DocViewNode' is deprecated
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     */
    default @Nullable Collection<ValidationMessage> validateEnd(@NotNull DocViewNode2 node, @NotNull NodeContext nodeContext, boolean isRoot) {
        return validateEnd(DocViewNode.fromDocViewNode2(node), nodeContext, isRoot);
    }
}
```

### Deprecation
'MERGE' is deprecated
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/MergeLimitationsValidator.java`
#### Snippet
```java
        for (PathFilterSet pathFilterSet : filter.getFilterSets()) {
            // find those with mode=merge
            if (pathFilterSet.getImportMode() == ImportMode.MERGE) {
                rootNodePathsOfMergeRules.add(pathFilterSet.getRoot());
            }
```

### Deprecation
Overrides deprecated method in 'org.apache.jackrabbit.vault.validation.spi.GenericMetaInfDataValidator'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedPropertiesValidator.java`
#### Snippet
```java

    @Override
    public Collection<ValidationMessage> validateMetaInfData(@NotNull InputStream input, @NotNull Path filePath) {
        Collection<ValidationMessage> messages = new LinkedList<>();
        try {
```

### Deprecation
Overrides deprecated method in 'org.apache.jackrabbit.vault.validation.spi.GenericMetaInfDataValidator'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedPropertiesValidator.java`
#### Snippet
```java

    @Override
    public boolean shouldValidateMetaInfData(@NotNull Path filePath) {
        return PROPERTIES_XML_PATH.equals(filePath);
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.jackrabbit.vault.validation.spi.GenericMetaInfDataValidator'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java

    @Override
    public boolean shouldValidateMetaInfData(@NotNull Path filePath) {
        return FILTER_XML_PATH.equals(filePath);
    }
```

### Deprecation
'checkin()' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
                        track("V", String.format("%s (---)", path));
                    } else {
                        Version v = node.checkin();
                        track("V", String.format("%s (%s)", path, v.getName()));
                    }
```

### Deprecation
'checkout()' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
            info.registerToVersion(node.getPath());
            try {
                node.checkout();
            } catch (RepositoryException e) {
                ImportInfoImpl.log.warn("error while checkout node (ignored)", e);
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/NodeStash.java`
#### Snippet
```java

            try {
                recoverProperties(importMode == ImportMode.MERGE || importMode == ImportMode.MERGE_PROPERTIES);
            } catch (RepositoryException e) {
                log.warn("Unable to restore properties at {} due to: {}. Properties will remain in temporary location: {}", path,
```

### Deprecation
'checkin()' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java
                if (node.isNodeType(JcrConstants.MIX_VERSIONABLE)) {
                    try {
                        Version v = node.checkin();
                        log.debug("Checked in versionable node {} (v={})", path, v.getName());
                    } catch (RepositoryException e) {
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
            String path = PathUtil.getPath(parent, name);
            if (name.length() == 0 || parent.hasNode(name)) {
                if (wspFilter.getImportMode(path) == ImportMode.MERGE) {
                    // do import the content if node is an authorizable or ACL
                    Node newNode = parent.getNode(name);
```

### Deprecation
'createValue(java.io.InputStream)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
        } else {
            ValueFactory factory = content.getSession().getValueFactory();
            Value value = factory.createValue(artifact.getInputStream());
            if (!content.hasProperty(JcrConstants.JCR_DATA)
                    || !value.equals(content.getProperty(JcrConstants.JCR_DATA).getValue())) {
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                // only update if not MERGE (i.e. is REPLACE or UPDATE)
                // this is for maintaining backwards-compatibility the rest of the import modes are evaluated in DocViewSAXImporter
                if (mode != ImportMode.MERGE) {
                    InputSource source = primary.getInputSource();
                    if (source != null) {
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                            // check import mode, only replace if not MERGE
                            ImportMode mode = wspFilter.getImportMode(fileNode.getPath());
                            if (mode != ImportMode.MERGE && mode != ImportMode.MERGE_PROPERTIES) {
                                if (!fileNode.hasNode(Node.JCR_CONTENT)) {
                                    // apparently no nt:file, recreate file node
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                        mode = wspFilter.getImportMode(path);
                    }
                    if (mode != ImportMode.MERGE) {
                        info.merge(importDocView(file.getInputSource(), newParent, newName, newSet, wspFilter, options.getIdConflictPolicy()));
                    } else {
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                // only update binary if import mode is not MERGE (because binaries have only mandatory properties)
                ImportMode mode = wspFilter.getImportMode(parentNode.getPath());
                if (mode != ImportMode.MERGE && mode != ImportMode.MERGE_PROPERTIES) {
                    Value value = factory.createValue(binary.getInputStream());
                    if (!parentNode.hasProperty(path)
```

### Deprecation
'createValue(java.io.InputStream)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FileArtifactHandler.java`
#### Snippet
```java
                ImportMode mode = wspFilter.getImportMode(parentNode.getPath());
                if (mode != ImportMode.MERGE && mode != ImportMode.MERGE_PROPERTIES) {
                    Value value = factory.createValue(binary.getInputStream());
                    if (!parentNode.hasProperty(path)
                            || !value.equals(parentNode.getProperty(path).getValue())) {
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
    private void print(Mode mode, String action, String path, String msg) {
        try {
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
        try {
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
            out.write("<span class=\"");
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/HtmlProgressListener.java`
#### Snippet
```java
            action = Text.encodeIllegalXMLCharacters(action);
            path = Text.encodeIllegalXMLCharacters(path);
            msg = msg == null ? null : Text.encodeIllegalXMLCharacters(msg);
            out.write("<span class=\"");
            out.write(action);
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
     */
    public static String getRepositoryPath(String path, boolean respectDotDir) {
        String[] elems = Text.explode(path, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
            }
        }
        return Text.implode(elems, "/");
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
     */
    public static String getPlatformPath(String repoPath) {
        String[] elems = Text.explode(repoPath, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
            }
        }
        return Text.implode(elems, "/");
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
     */
    public static String getRepositoryPath(String path) {
        String[] elems = Text.explode(path, '/', true);
        for (int i=0; i<elems.length; i++) {
            if (elems[i].length() > 0) {
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PlatformNameFormat.java`
#### Snippet
```java
            }
        }
        return Text.implode(elems, "/");
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java

    public static String makePath(String parent, String relPath) {
        String[] ret = makePath(Text.explode(parent, '/'), relPath);
        return "/" + Text.implode(ret, "/");
    }
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
    public static String makePath(String parent, String relPath) {
        String[] ret = makePath(Text.explode(parent, '/'), relPath);
        return "/" + Text.implode(ret, "/");
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
        // compose parent and path
        boolean isAbsolute = false;
        String[] composed = Text.explode(path, '/');
        if (path.charAt(0) == '/') {
            isAbsolute = true;
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
            }
        }
        String[] p1 = Text.explode(cwd, separator.charAt(0));
        String[] p2 = Text.explode(path, separator.charAt(0));
        // search common ancestor
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/PathUtil.java`
#### Snippet
```java
        }
        String[] p1 = Text.explode(cwd, separator.charAt(0));
        String[] p2 = Text.explode(path, separator.charAt(0));
        // search common ancestor
        int i=0;
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java

    private Node<E> get(String path, boolean create) {
        String[] segs = Text.explode(path, separator);
        Node<E> n = root;
        for (String name: segs) {
```

### Deprecation
'UPDATE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
            
            // add/modify properties contained in package
            if (setUnprotectedProperties(effectiveNodeType, node, ni, importMode == ImportMode.REPLACE|| importMode == ImportMode.UPDATE || importMode == ImportMode.UPDATE_PROPERTIES, vs)) {
                updatedNode = node;
            }
```

### Deprecation
'checkout()' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                importInfo.registerToVersion(node.getPath());
                try {
                    node.checkout();
                } catch (RepositoryException e) {
                    log.warn("error while checkout node (ignored)", e);
```

### Deprecation
'createValue(java.io.InputStream)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
            Artifact a = artifacts.get(0);
            try (InputStream input = a.getInputStream()) {
                return session.getValueFactory().createValue(input);
            }
        }
```

### Deprecation
'createValue(java.io.InputStream)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                Artifact a = artifacts.get(i);
                try (InputStream input = a.getInputStream()) {
                    values[i] = session.getValueFactory().createValue(input);
                }
            }
```

### Deprecation
'checkout()' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                importInfo.registerToVersion(node.getPath());
                try {
                    node.checkout();
                } catch (RepositoryException e) {
                    log.warn("error while checkout node (ignored)", e);
```

### Deprecation
'createValue(java.io.InputStream)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
        ValueFactory factory = node.getSession().getValueFactory();
        try (InputStream input = a.getInputStream()) {
            Value value = factory.createValue(input);
            if (node.hasProperty(JcrConstants.JCR_DATA)) {
                Property data = node.getProperty(JcrConstants.JCR_DATA);
```

### Deprecation
'MERGE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java

        switch (mode) {
            case MERGE:
            case MERGE_PROPERTIES:
                // remember desired memberships.
```

### Deprecation
'UPDATE' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                break;

            case UPDATE:
            case UPDATE_PROPERTIES:
                log.trace("Authorizable element detected. starting sysview transformation {}", newPath);
```

### Deprecation
Overrides deprecated method in 'org.apache.jackrabbit.vault.fs.config.DefaultWorkspaceFilter'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/ScopedWorkspaceFilter.java`
#### Snippet
```java

    @Override
    public void addPropertyFilterSet(PathFilterSet set) {
        throw new UnsupportedOperationException();
    }
```

### Deprecation
'JcrPackageManagerImpl(javax.jcr.Session, java.lang.String\[\])' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/PackagingService.java`
#### Snippet
```java

        // todo: should somehow pass the package roots
        return new JcrPackageManagerImpl(session, new String[0]);
    }

```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
            } else if ( XMLChar.isInvalid(c)) {
                buf.append("\\u");
                buf.append(Text.hexTable[(c >> 12) & 15]);
                buf.append(Text.hexTable[(c >> 8) & 15]);
                buf.append(Text.hexTable[(c >> 4) & 15]);
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
                buf.append("\\u");
                buf.append(Text.hexTable[(c >> 12) & 15]);
                buf.append(Text.hexTable[(c >> 8) & 15]);
                buf.append(Text.hexTable[(c >> 4) & 15]);
                buf.append(Text.hexTable[c & 15]);
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
                buf.append(Text.hexTable[(c >> 12) & 15]);
                buf.append(Text.hexTable[(c >> 8) & 15]);
                buf.append(Text.hexTable[(c >> 4) & 15]);
                buf.append(Text.hexTable[c & 15]);
            } else {
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
                buf.append(Text.hexTable[(c >> 8) & 15]);
                buf.append(Text.hexTable[(c >> 4) & 15]);
                buf.append(Text.hexTable[c & 15]);
            } else {
                buf.append(c);
```

### Deprecation
'ETC_PACKAGES_PREFIX' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
     */
    public Dependency(@NotNull String groupId, @NotNull String name, @Nullable VersionRange range) {
        if (groupId.startsWith(PackageId.ETC_PACKAGES_PREFIX)) {
            groupId = groupId.substring(PackageId.ETC_PACKAGES_PREFIX.length());
        }
```

### Deprecation
'ETC_PACKAGES_PREFIX' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Dependency.java`
#### Snippet
```java
    public Dependency(@NotNull String groupId, @NotNull String name, @Nullable VersionRange range) {
        if (groupId.startsWith(PackageId.ETC_PACKAGES_PREFIX)) {
            groupId = groupId.substring(PackageId.ETC_PACKAGES_PREFIX.length());
        }
        this.groupId = groupId;
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java

        // get root nodes
        String dstParent = Text.getRelativeParent(dstPath, 1);
        String dstName = checkNameSpace(Text.getName(dstPath), srcSession, dstSession);
        Node srcRoot;
```

### Deprecation
'org.apache.jackrabbit.vault.util.Text' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
        // get root nodes
        String dstParent = Text.getRelativeParent(dstPath, 1);
        String dstName = checkNameSpace(Text.getName(dstPath), srcSession, dstSession);
        Node srcRoot;
        try {
```

### Deprecation
'PackageId(java.lang.String, java.lang.String)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
                    path = "/etc/packages/unknown";
                }
                id = new PackageId(path, version);
            }
        } else if (FILTER_FILE.equals(file)) {
```

### Deprecation
'JcrPackageManagerImpl(javax.jcr.Session, java.lang.String\[\])' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/PackageManagerMBeanImpl.java`
#### Snippet
```java
                session = repository.loginAdministrative(null);
                // todo: find a way to use the sling packaging service instead
                JcrPackageManager pkgMgr = new JcrPackageManagerImpl(session, new String[0]);
                for (JcrPackage pkg: pkgMgr.listPackages()) {
                    try {
```

### Deprecation
'verifyId(boolean, boolean)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java

        Calendar now = Calendar.getInstance();
        pack.verifyId(true, false);
        JcrPackageDefinitionImpl def = (JcrPackageDefinitionImpl) pack.getDefinition();
        def.sealForRewrap(now);
```

### Deprecation
'verifyId(boolean, boolean)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
    public void assemble(JcrPackage pack, ProgressTrackerListener listener)
            throws PackageException, RepositoryException, IOException {
        pack.verifyId(true, true);
        assemble(pack.getNode(), pack.getDefinition(), listener);
    }
```

### Deprecation
'PackageId(java.lang.String)' is deprecated
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
            folder = getPackageRoot();
        }
        return registry.createNew(folder, new PackageId(name), null, true);
    }

```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdFormatCli.java`
#### Snippet
```java
                "Examples:\n" +
                "  vlt format -c -p '\\.content\\.xml' content/jcr_root\n\n" +
                "" +
                "  vlt format -p \\.content\\.xml -p _jcr_content\\.xml -- apps/";
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
     * the name of the (internal) default workspace filter
     */
    private static final String DEFAULT_WSP_FILTER = "" +
            "org/apache/jackrabbit/vault/fs/config/defaultFilter-1.0.xml";

```

### TrivialStringConcatenation
Empty string used in concatenation
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
     * name of node types resource
     */
    private static final String DEFAULT_NODETYPES = "" +
            "org/apache/jackrabbit/vault/fs/config/nodetypes.cnd";

```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`disabled == null ? false : disabled` can be simplified to 'disabled!=null \&\& disabled'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncConfig.java`
#### Snippet
```java

    public boolean isDisabled() {
        return disabled == null ? false : disabled;
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
        if (file.canDescend() && !nonRecursive) {
            VltDirectory dir = file.descend();
            dir.apply(action, Collections.<String>emptyList(), nonRecursive);
            dir.close();
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
        if (remoteFile == null && file != null && file.canDescend() && !nonRecursive) {
            VltDirectory dir = file.descend();
            dir.applyWithRemote(action, remoteFile, Collections.<String>emptyList(), nonRecursive);
            dir.close();
        }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
            if (file != null && file.canDescend() && !nonRecursive) {
                VltDirectory dir = file.descend();
                dir.applyWithRemote(action, remoteFile, Collections.<String>emptyList(), nonRecursive);
                dir.close();
            }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Commit.java`
#### Snippet
```java
        upd.setOnlyControlled(true);
        for (VltTree.Info i: infos.infos()) {
            i.dir.applyWithRemote(upd, Collections.<String>emptyList(), nonRecursive);
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Checkout.java`
#### Snippet
```java
            up.setOnlyControlled(true);
            up.setForce(force);
            dir.applyWithRemote(up, Collections.<String>emptyList(), false);
            ctx.printMessage("Checkout done.");
        } catch (IOException e) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
            for (PathFilterSet pathFilter : filter.getFilterSets()) {
                if (!PathFilterSet.TYPE_CLEANUP.equals(pathFilter.getType())) {
                    List<Entry<PathFilter>> entries = pathFilter.getEntries().stream().filter(Entry<PathFilter>::isInclude).collect(Collectors.toList());
                    // add all includes to a new list
                    this.orphanedFilterSets.put(pathFilter, entries);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
        @Override
        public Collection<? extends Entry> getChildren() {
            return children == null ? Collections.<Entry>emptyList() : children.values();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MappedArchive.java`
#### Snippet
```java
        @NotNull
        public Collection<? extends Entry> getChildren() {
            return children == null ? Collections.<Entry>emptyList() : children.values();
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/ImportInfoImpl.java`
#### Snippet
```java

    public Map<String, String[]> getMemberships() {
        return memberships == null ? Collections.<String, String[]>emptyMap() : memberships;
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        List<PropertyDefinition> propertyDefinitions = nodeTypes.stream().flatMap(nt -> Arrays.stream(nt.getPropertyDefinitions())).collect(Collectors.toList());
        // first named then unnamed
        Optional<PropertyDefinition> namedPropertyDef = EffectiveNodeType.<PropertyDefinition>getApplicableItemDefinition(propertyDefinitions, predicate, name);
        if (!namedPropertyDef.isPresent()) {
            // then unnamed
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        if (!namedPropertyDef.isPresent()) {
            // then unnamed
            return EffectiveNodeType.<PropertyDefinition>getApplicableItemDefinition(propertyDefinitions, predicate, null);
        } else {
            return namedPropertyDef;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        List<NodeDefinition> nodeDefinitions = nodeTypes.stream().flatMap(nt -> Arrays.stream(nt.getChildNodeDefinitions())).collect(Collectors.toList());
        // first named then unnamed
        Optional<NodeDefinition> namedNodeDef = EffectiveNodeType.<NodeDefinition>getApplicableItemDefinition(nodeDefinitions, predicate, name);
        if (!namedNodeDef.isPresent()) {
            // then unnamed
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
        if (!namedNodeDef.isPresent()) {
            // then unnamed
            return EffectiveNodeType.<NodeDefinition>getApplicableItemDefinition(nodeDefinitions, predicate, null);
        } else {
            return namedNodeDef;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/SubPackageHandling.java`
#### Snippet
```java
     * The default handling
     */
    public static final SubPackageHandling DEFAULT = new SubPackageHandling(Collections.<Entry>emptyList());

    private final List<Entry> entries;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    public FSInstallState withSubPackages(Map<PackageId, SubPackageHandling.Option> subPackages) {
        this.subPackages = subPackages == null
                ? Collections.<PackageId, SubPackageHandling.Option>emptyMap()
                : Collections.unmodifiableMap(subPackages);
        return this;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
    public FSInstallState withDependencies(Set<Dependency> dependencies) {
        this.dependencies = dependencies == null
                ? Collections.<Dependency>emptySet()
                : Collections.unmodifiableSet(dependencies);
        return this;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/Mounter.java`
#### Snippet
```java
 * Utility method to mount a JCR FS.
 * The filesystem is mounted relative to the given {@code mountpoint} and rooted at {@code rootPath}.
 * For example if the mountpoint is http://.../test/export and the rootPath is /foo, then the filesystem's root node
 * has a internal repository path "/foo" that corresponds to the "real" repository node at "/test/export".
 * The workspace filter will be matched against the filesystem paths (e.g. /foo).
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/MemoryArchive.java`
#### Snippet
```java
    /**
     * Safely returns the modification time of the zip entry or 0, if reading the time would
     * result in an error. for example due to http://bugs.java.com/view_bug.do?bug_id=JDK-8184940
     *
     * @param e the zip entry
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
    /**
     * Safely returns the modification time of the zip entry or 0, if reading the time would
     * result in an error. for example due to http://bugs.java.com/view_bug.do?bug_id=JDK-8184940
     *
     * @param e the zip entry
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/CompressionUtil.java`
#### Snippet
```java
     * <p/>
     * for more information see:
     * https://issues.apache.org/jira/browse/JCRVLT-257
     * https://github.com/madler/zlib/issues/305
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/CompressionUtil.java`
#### Snippet
```java
     * for more information see:
     * https://issues.apache.org/jira/browse/JCRVLT-257
     * https://github.com/madler/zlib/issues/305
     *
     * @return {@code true} if the environment supports switching compression levels
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
     * <p>Example:<br>
     * A search string like 'test?' will run into a ParseException
     * documented in http://issues.apache.org/jira/browse/JCR-1248
     *
     * @param s the string to encode
```

### JavadocLinkAsPlainText
Link specified as plain text
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java

    public final @NotNull String name; // always use expanded names here
    /** usually equal to {@link #name} except when this node has a same name sibling, in that case label has format {@code <name>[index]}, https://docs.adobe.com/content/docs/en/spec/jcr/2.0/22_Same-Name_Siblings.html#22.2%20Addressing%20Same-Name%20Siblings%20by%20Path */
    public final @NotNull String label;
    public final @NotNull Map<String, DocViewProperty> props = new HashMap<>();
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    private boolean quiet;

    private boolean swallowErrors = true;

    private final PrintStream stdout;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/PomProperties.java`
#### Snippet
```java
    public static String PROPS_SUFFIX = "/pom.properties";

    private final String groupId;

    private final String artifactId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/PomProperties.java`
#### Snippet
```java
    private final String groupId;

    private final String artifactId;

    private String pomPropsPath;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/ShellApp.java`
#### Snippet
```java
    private ExecutionContext ctx;

    private ConsoleExecutionContext iCtx;

    private Console console;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/PlatformFile.java`
#### Snippet
```java
public class PlatformFile implements ConsoleFile {

    private final URI uri;

    private final File file;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
    private static int F_FLAG_TIME = 0x01;
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
    private static int F_MASK      = 0x0f;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
    private static int F_MASK      = 0x0f;

    // list switches
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
        private final Change change;

        private final boolean intermediate;

        private DotXmlInfo(Change change, boolean intermediate) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java

    // node type related helpers
    private final @NotNull NodeTypeStorage nodeTypeStorage;
    private final @NotNull NodeTypeRegistryImpl nodeTypeRegistry;
    private final @NotNull NodeTypeManagerImpl nodeTypeManager;
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

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Condition.await()` is ignored
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/VaultSyncServiceImpl.java`
#### Snippet
```java
                }
                try {
                    waitCondition.await(checkDelay, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    log.warn("interrupted while waiting.");
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
                    continue;
                }
                mgr.getInternalRegistry();
                String etcPath = DEFAULT_PACKAGE_ROOT_PATH + "/" + AbstractPackageRegistry.getRelativeInstallationPath(pkg.getKey()) + ".zip";
                etcPath = Text.getRelativeParent(etcPath, 1);
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
Method `equals()` is identical to its super method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return (obj == this);
        }
```

### RedundantMethodOverride
Method `equals()` is identical to its super method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/PathFilter.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return (obj == this);
        }
```

### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java

    @Override
    public boolean markSupported() {
        return false;
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                                parentName = parentName.substring(0, parentName.length() - 4);
                            }
                            repoName = PlatformNameFormat.getRepositoryName(parentName) + "/" + repoName;
                            parentPath = Text.getRelativeParent(parentPath, 1);
                            parent = fs.getFile(parentPath);
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                            parentName = parentName.substring(0, parentName.length() - 4);
                        }
                        repoName = PlatformNameFormat.getRepositoryName(parentName) + "/" + repoName;
                        parentPath = Text.getRelativeParent(parentPath, 1);
                        parent = fs.getFile(parentPath);
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
        String path = "";
        while (elem != null && elem.getNodeType() != Node.DOCUMENT_NODE) {
            path = " > " + elem.getNodeName() + path;
            elem = elem.getParentNode();
        }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/ActivityLog.java`
#### Snippet
```java
            for (int i=1; i<stackTrace.length; i++) {
                StackTraceElement s = stackTrace[i];
                msg += String.format("\n\tat %s.%s(%s:%d)", s.getClassName(), s.getMethodName(), s.getFileName(), s.getLineNumber());
            }
        }
```

## RuleId[id=UnusedAssignment]
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
Variable `newNamespaceUri` initializer `UNDECLARED_NAMESPACE_URI_PREFIX + prefix` is redundant
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/OnDemandRegisterNamespaceResolverWrapper.java`
#### Snippet
```java
                return nsStorage.getURI(prefix);
            } catch (NamespaceException e) {
                String newNamespaceUri = UNDECLARED_NAMESPACE_URI_PREFIX + prefix;
                nsStorage.registerNamespace(prefix, newNamespaceUri);
                return newNamespaceUri;
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
Variable `priv` initializer `null` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitPrivilegeInstaller.java`
#### Snippet
```java
        for (PrivilegeDefinition def: defs.getDefinitions()) {
            String name = getJCRName(def.getName());
            Privilege priv = null;
            try {
                priv = mgr.getPrivilege(name);
```

### UnusedAssignment
Variable `msg` initializer `"internal error: failed to resolve namespace mappings"` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/ItemNameComparator2.java`
#### Snippet
```java
        } catch (NameException e) {
            // should never get here...
            String msg = "internal error: failed to resolve namespace mappings";
            throw new RepositoryException(msg, e);
        }
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
Condition `type == NameType.NODE_NAME` is always `false`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
            return qName;
        } catch (NamespaceException e) {
            if (type == NameType.NODE_NAME) {
                throw new NamespaceExceptionInNodeName(
                        String.format(EXCEPTION_MESSAGE_INVALID_NAME, type.getLabel(), name, e.getLocalizedMessage()), e);
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
    private void processHandler(Element elem) throws ConfigurationException {
        String type = elem.getAttribute("type");
        if (type == null || type.equals("")) {
            type = "generic";
        }
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
            if (Character.isLetterOrDigit((char) c)) {
                if (gutter.length() > 0) {
                    lines.add(new WordElement(source, word.toString(), gutter.toString()));
                    gutter.setLength(0);
                    word.setLength(0);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
        }
        if (word.length() > 0) {
            lines.add(new WordElement(source, word.toString(), gutter.toString()));
        }
        return (WordElement[]) lines.toArray(new WordElement[lines.size()]);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/WordsElementsFactory.java`
#### Snippet
```java
            lines.add(new WordElement(source, word.toString(), gutter.toString()));
        }
        return (WordElement[]) lines.toArray(new WordElement[lines.size()]);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
                String line = new String(buffer, start, pos - start);
                if (ignoreWS) {
                    lines.add(new LineElementsFactory.IStringElement(source, line));
                } else {
                    lines.add(new LineElementsFactory.StringElement(source, line));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
                    lines.add(new LineElementsFactory.IStringElement(source, line));
                } else {
                    lines.add(new LineElementsFactory.StringElement(source, line));
                }
                start = pos;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
            String line = new String(buffer, start, end - start);
            if (ignoreWS) {
                lines.add(new LineElementsFactory.IStringElement(source, line));
            } else {
                lines.add(new LineElementsFactory.StringElement(source, line));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
                lines.add(new LineElementsFactory.IStringElement(source, line));
            } else {
                lines.add(new LineElementsFactory.StringElement(source, line));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
        }
        if (ignoreWS) {
            return (LineElementsFactory.IStringElement[]) lines.toArray(new LineElementsFactory.IStringElement[lines.size()]);
        } else {
            return (LineElementsFactory.StringElement[]) lines.toArray(new LineElementsFactory.StringElement[lines.size()]);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
            return (LineElementsFactory.IStringElement[]) lines.toArray(new LineElementsFactory.IStringElement[lines.size()]);
        } else {
            return (LineElementsFactory.StringElement[]) lines.toArray(new LineElementsFactory.StringElement[lines.size()]);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                while (first != c) {
                    while (start0 < first.line0) {
                        elems.add(lines0[start0]);
                        start0++;
                        start1++;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                    for (int i = 0; i < first.deleted; i++) {
                        if (reverse) {
                            elems.add(lines0[start0]);
                        }
                        start0++;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                    for (int i = 0; i < first.inserted; i++) {
                        if (!reverse) {
                            elems.add(lines1[start1]);
                        }
                        start1++;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                }
                while (start0 < lines0.length) {
                    elems.add(lines0[start0]);
                    start0++;
                    start1++;
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
                }
            }
            return (Document.Element[]) elems.toArray(new Document.Element[elems.size()]);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdSync.java`
#### Snippet
```java
                        String cmd = list.get(0).toString();
                        try {
                            list.set(0, Sync.Command.valueOf(cmd.toUpperCase()));
                        } catch (IllegalArgumentException e) {
                            throw new InvalidArgumentException("Invalid command: " + cmd);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
                if (quote == 0) {
                    if (buf.length() > 0) {
                        tokens.add(buf.toString());
                        buf = new StringBuffer();
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
        }
        if (buf.length() > 0) {
            tokens.add(buf.toString());
        }
        return (String[]) tokens.toArray(new String[tokens.size()]);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.ArrayList'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Text.java`
#### Snippet
```java
            tokens.add(buf.toString());
        }
        return (String[]) tokens.toArray(new String[tokens.size()]);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.Set'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleExecutionContext.java`
#### Snippet
```java
    public Set getPropertyKeys() {
        Set ret = new HashSet();
        ret.addAll(getApplication().getEnv().keySet());
        ret.addAll(runtimeEnv.keySet());
        return ret;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.Set'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleExecutionContext.java`
#### Snippet
```java
        Set ret = new HashSet();
        ret.addAll(getApplication().getEnv().keySet());
        ret.addAll(runtimeEnv.keySet());
        return ret;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ExecutionContext.java`
#### Snippet
```java

    public void installCommand(CliCommand c) {
        commands.add(c);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.LinkedList'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java

    public void addRow(Row row) {
        rows.add(row);
        for (int i=0; i<row.cols.length; i++) {
            if (row.cols[i] != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java

    public void sort(final int col) {
        Collections.sort(rows, new Comparator() {
            public int compare(Object o1, Object o2) {
                Row r1 = (Row) o1;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedList' to 'java.util.List'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java

    public void sort(final int col) {
        Collections.sort(rows, new Comparator() {
            public int compare(Object o1, Object o2) {
                Row r1 = (Row) o1;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
            throw new IllegalArgumentException("Context with name '" + ctx.getName() + "' already registered.");
        }
        contexts.put(ctx.getName(), ctx);
        ctx.attach(this);
        currentCtx = ctx;
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Set'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/Console.java`
#### Snippet
```java
        }
        Set triggers = currentCtx.getCommandsGroup().getTriggers();
        reader.addCompletor(new SimpleCompletor((String[]) triggers.toArray(new String[triggers.size()])));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
                if (pt.length == params.length) {
                    for (int j = 0; j < params.length; j++) {
                        if (!params[j].isAssignableFrom(pt[j])) {
                            m = null;
                            break;
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryProvider.java`
#### Snippet
```java
                }
            }
            Constructor c = clazz.getConstructor(Repository.class, Properties.class, String.class);
            return (Repository) c.newInstance(base, props, address.toString());
        } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.jackrabbit.vault.packaging.JcrPackage' to 'T'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
        packages.clear();
        for (PackageId id: resolve(list)) {
            packages.add((T) byId.remove(id));
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.jackrabbit.vault.packaging.VaultPackage' to 'T'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/DependencyUtil.java`
#### Snippet
```java
        packages.clear();
        for (PackageId id: resolve(list)) {
            packages.add((T) byId.remove(id));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
    
    static boolean hasAdministrativePermissionsWithPrincipals(@NotNull Session session, List<String> additionalAdminPrincipalNames) {
        Set<Principal> boundPrincipals = (Set<Principal>)session.getAttribute("oak.bound-principals");
        if (boundPrincipals != null) {
            for (Principal principal : boundPrincipals) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `org.apache.jackrabbit.vault.fs.api.SerializationType` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * recognized:
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
```

### JavadocReference
Symbol `GENERIC` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * recognized:
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
```

### JavadocReference
Symbol `org.apache.jackrabbit.vault.fs.api.SerializationType` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
```

### JavadocReference
Symbol `XML_GENERIC` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <ul>
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
```

### JavadocReference
Symbol `org.apache.jackrabbit.vault.fs.api.SerializationType` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
 * Please note, that the docview serialization is recognized if the first
```

### JavadocReference
Symbol `XML_DOCVIEW` is inaccessible from here
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/XmlAnalyzer.java`
#### Snippet
```java
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#GENERIC} if the source is not a valid XML
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_GENERIC} if the XML type is not known. eg. a user-xml
 * <li> {@link org.apache.jackrabbit.vault.fs.api.SerializationType#XML_DOCVIEW} if the XML is a docview serialization
 * </ul>
 * Please note, that the docview serialization is recognized if the first
```

### JavadocReference
Cannot resolve symbol `ConnectionOptions`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param credsProvider
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `ConnectionOptions`
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param out
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
     */
    @Deprecated
```

### JavadocReference
Cannot resolve symbol `Name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * Called for the beginning of each new JCR document view node.
     * Deserialization of the node information was already done when this method is called!
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
```

### JavadocReference
Cannot resolve symbol `NameConstants`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
     * 
     * The node's label refers to the XML element name specifying the node. There shouldn't be any checks derived from it, but only from the expanded name.
```

### JavadocReference
Cannot resolve symbol `Name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * Called for the end of each new JCR document view node.
     * Deserialization of the node information was already done when this method is called as well as all child nodes within the same docview file have been processed.
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
```

### JavadocReference
Cannot resolve symbol `NameConstants`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
     * 
     * The node's label refers to the XML element name specifying the node. There shouldn't be any checks derived from it, but only from the expanded name.
```

### JavadocReference
Cannot resolve symbol `Name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * Called for the beginning of each new JCR document view node.
     * Deserialization of the node information was already done when this method is called!
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
```

### JavadocReference
Cannot resolve symbol `NameConstants`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/DocumentViewXmlValidator.java`
#### Snippet
```java
     * The node and attribute names have the string representation outlined in {@link Name} (i.e. including the namespace uri in the format <code>{namespaceURI}localPart</code>).
     * This is also referred to as <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">JCR name expanded form</a>.
     * To construct such names either use {@link NameUtil} or use the constants from {@link NameConstants}.
     * 
     * The node's label refers to the XML element name specifying the node. There shouldn't be any checks derived from it, but only from the expanded name.
```

### JavadocReference
Cannot resolve symbol `Name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/util/NameUtil.java`
#### Snippet
```java
/**
 * Utility methods to generate JCR names in the <a href="https://docs.adobe.com/docs/en/spec/jcr/2.0/3_Repository_Model.html#3.2.5.1%20Expanded%20Form">Expanded Form</a>.
 * @see Name
 */
public class NameUtil {
```

### JavadocReference
Cannot resolve symbol `nodePath`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
    /** Called whenever some subtree was fully visited
     * 
     * @param nodePath
     * @return
     * @throws RepositoryException
```

### JavadocReference
Cannot resolve symbol `IllegalNameException`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws IllegalArgumentException
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
    private @Nullable Collection<ValidationMessage> finalizeValidationForSiblings(NodeContext nodeContext) {
```

### JavadocReference
Cannot resolve symbol `MalformedPathException`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
    private @Nullable Collection<ValidationMessage> finalizeValidationForSiblings(NodeContext nodeContext) {
        String parentNodePath = Text.getRelativeParent(nodeContext.getNodePath(), 1);
```

### JavadocReference
Cannot resolve symbol `EffectiveNodeType`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### JavadocReference
Cannot resolve symbol `checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### JavadocReference
Cannot resolve symbol `Name`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### JavadocReference
Cannot resolve symbol `org.apache.jackrabbit.spi.QNodeTypeDefinition`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### JavadocReference
Cannot resolve symbol `ItemDefinitionProvider`
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java

    /** Similar to
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
```

### JavadocReference
Cannot resolve symbol `NameResolver`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
    /**
     * Called when a namespace mapping is defined in the docview xml.
     * Rather use {@link #setNameResolver(NameResolver)} instead if you just need to resolve JCR names.
     * @param prefix the namespace prefix
     * @param uri the namespace uri
```

### JavadocReference
Cannot resolve symbol `NameResolver`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
    /**
     * Called when a namespace mapping end in the docview xml.
     * Rather use {@link #setNameResolver(NameResolver)} instead if you just need to resolve JCR names.
     * @param prefix the namespace prefix
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.jackrabbit.util.Text`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Text.java`
#### Snippet
```java
/**
 * This Class provides some text related utilities
 * @deprecated Use {@link org.apache.jackrabbit.util.Text} instead
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ManagerProvider`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/StandaloneManagerProvider.java`
#### Snippet
```java

/**
 * A {@link ManagerProvider} which works without an underlying JCR repository.
 * Useful for dealing with namespaces and node types outside the repository context.
 */
```

### JavadocReference
Cannot resolve symbol `IllegalNameException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
    public static @NotNull DocViewProperty2 parse(Name name, String value) throws IllegalNameException, NamespaceException {
```

### JavadocReference
Cannot resolve symbol `IllegalNameException`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
    public static @NotNull DocViewProperty2 parse(String name, String value, NameResolver nameResolver) throws IllegalNameException, NamespaceException {
```

### JavadocReference
Cannot resolve symbol `BundleContext`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/OsgiAwarePropertiesUtil.java`
#### Snippet
```java
/**
 * Provides access to either system properties or bundle context properties (if running inside an OSGi container)
 * @see BundleContext#getProperty(String)
 * @see System#getProperty(String)
 */
```

### JavadocReference
Cannot resolve symbol `getProperty(String)`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/OsgiAwarePropertiesUtil.java`
#### Snippet
```java
/**
 * Provides access to either system properties or bundle context properties (if running inside an OSGi container)
 * @see BundleContext#getProperty(String)
 * @see System#getProperty(String)
 */
```

### JavadocReference
Cannot resolve symbol `session`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
    /**
     * Checks if the repository is Oak 1.40 or newer. Compare with <a href="https://issues.apache.org/jira/browse/OAK-9415">OAK-9415</a>.
     * @param session
     * @return {@code true} if Oak repository >= 1.40.0 is used, otherwise {@code false}
     */
```

### JavadocReference
Cannot resolve symbol `props`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
    /**
     * Load the given properties from the content
     * @param props the properties to load
     */
    private Properties loadLegacyProperties() {
```

### JavadocReference
Cannot resolve symbol `bin`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @param parent the parent node
     * @param pid the package id of the new package.
     * @param bin the binary containing the zip
     * @param archive the archive with the meta data (may be {@code null})
     * @return the created jcr vault package.
```

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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
Condition `wsp instanceof JackrabbitWorkspace` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitPrivilegeInstaller.java`
#### Snippet
```java

        Workspace wsp = session.getWorkspace();
        if (!(wsp instanceof JackrabbitWorkspace)) {
            throw new RepositoryException("Unable to register privileges. No JackrabbitWorkspace.");
        }
```

### DataFlowIssue
Condition `session instanceof JackrabbitSession` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/JackrabbitUserManagement.java`
#### Snippet
```java
     */
    public void addMembers(Session session, String id, String[] membersUUID) {
        if (!(session instanceof JackrabbitSession)) {
            log.warn("Unable to update membership. no jackrabbit session.");
            return;
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
Condition `firstValue.getBinary() instanceof ReferenceBinary` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateImpl.java`
#### Snippet
```java
                        firstValue = prop.getValue();
                    }
                    if (firstValue != null && firstValue.getBinary() instanceof ReferenceBinary) {
                        String binaryReference = ((ReferenceBinary) firstValue.getBinary()).getReference();

```

### DataFlowIssue
Condition `acMgr instanceof JackrabbitAccessControlManager` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java

        T getPolicy(Class<T> clz, Principal principal) throws RepositoryException {
            if (acMgr instanceof JackrabbitAccessControlManager) {
                for (AccessControlPolicy p : ((JackrabbitAccessControlManager) acMgr).getPolicies(principal)) {
                    if (clz.isAssignableFrom(p.getClass())) {
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
Condition `acMgr instanceof JackrabbitAccessControlManager` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java

        T getApplicablePolicy(Class<T> clz, Principal principal) throws RepositoryException {
            if (acMgr instanceof JackrabbitAccessControlManager) {
                for (AccessControlPolicy p : ((JackrabbitAccessControlManager) acMgr).getApplicablePolicies(principal)) {
                    if (clz.isAssignableFrom(p.getClass())) {
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
Condition `bin instanceof ReferenceBinary` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
            if (useBinaryReferences) {
                Binary bin = value.getBinary();
                if (bin instanceof ReferenceBinary) {
                    strValue = ((ReferenceBinary) bin).getReference();
                }
```

### DataFlowIssue
Condition `bin instanceof ReferenceBinary` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
            if (useBinaryReferences) {
                Binary bin = value.getBinary();
                if (bin instanceof ReferenceBinary) {
                    strValue = ((ReferenceBinary) bin).getReference();
                }
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
Condition `session instanceof JackrabbitSession` is redundant and can be replaced with a null check
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
        List<String> additionalAdminIdsOrPrincipalNames = Arrays.asList(Optional.ofNullable(additionalAdminAuthorizableIdsOrPrincipalNames).orElse(new String[0]));
        final JackrabbitSession jackrabbitSession;
        if (session instanceof JackrabbitSession) {
            jackrabbitSession = (JackrabbitSession) session;
            if (isOakVersionExposingBoundPrincipals(session.getRepository())) {
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
`toString()` call can be replaced with 'contentEquals()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
                case 't':
                    if (c == '}') {
                        if (BINARY_REF.equals(tmp.toString())) {
                            type = PropertyType.BINARY;
                            isBinaryRef = true;
```

### StringOperationCanBeSimplified
`toString()` call can be replaced with 'contentEquals()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
                case 't':
                    if (c == '}') {
                        if (BINARY_REF.equals(tmp.toString())) {
                            type = PropertyType.BINARY;
                            isBinaryRef = true;
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    @Override
    public Collection<ValidationMessage> validateMetaInfPath(@NotNull Path filePath, @NotNull Path basePath, boolean isFolder) {
        switch (type) {
        case APPLICATION:
            if (filePath.startsWith(PATH_HOOKS) && !allowInstallHooksInApplicationPackages)
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
        }
        final PackageTaskOptions options;
        switch (Type.valueOf(childElement.getAttribute(ATTR_TYPE))) {
            case ImportOptions:
                options = loadImportOptions(childElement);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskOptionsSerializer.java`
#### Snippet
```java
        Type type = Type.fromClass(options);
        writer.writeAttribute(ATTR_TYPE, type.name());
        switch (type) {
            case ImportOptions:
                saveImportOptions(writer, (ImportOptionsPackageTaskOption) options);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/AbstractCmdLs.java`
#### Snippet
```java
        int numCols = 1;
        int f = flags & F_MASK;
        while (f != 0) {
            if ((f & 1) == 1) {
                numCols++;
            }
            f >>= 1;
        }
        Table t = new Table(numCols);
```

### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdAdd.java`
#### Snippet
```java
        List<String> localPaths = cl.getValues(argLocalPath);
        List<File> localFiles = app.getPlatformFiles(localPaths, false);
        File localDir = app.getPlatformFile("", true);

        VltContext vCtx = app.createVaultContext(localDir);
        vCtx.setVerbose(cl.hasOption(OPT_VERBOSE));
```

### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdCheckoutCli.java`
#### Snippet
```java
        String jcrPath = (String) cl.getValue(argJcrPath);
        String localPath = (String) cl.getValue(argLocalPath);
        String root = (String) cl.getValue(argMountpoint);
        RepositoryAddress addr = new RepositoryAddress(root);

        // shift arguments
        if (localPath == null) {
            localPath = jcrPath;
            jcrPath = null;
        } 
```

### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdLsJcrFs.java`
#### Snippet
```java
        int fmtFlag = 0;
        fmtFlag |= cl.hasOption(optTime) ? F_FLAG_TIME : 0;
        fmtFlag |= cl.hasOption(optSize) ? F_FLAG_SIZE : 0;
        fmtFlag |= cl.hasOption(optMime) ? F_FLAG_MIME : 0;
        fmtFlag |= cl.hasOption(optLong) ? F_FLAG_LONG : 0;
```

### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/CmdPropGet.java`
#### Snippet
```java
        List<String> localPaths = cl.getValues(argLocalPath);
        List<File> localFiles = app.getPlatformFiles(localPaths, false);
        File localDir = app.getPlatformFile("", true);

        VltContext vCtx = app.createVaultContext(localDir);
        vCtx.setQuiet(cl.hasOption(OPT_QUIET));
```

### DuplicatedCode
Duplicated code
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/CliHelpFormatter.java`
#### Snippet
```java
            for (final Iterator i = wrap(description, getPageWidth() - 2).iterator(); i.hasNext();) {
                printGutterLeft();
                getPrintWriter().print("  ");
                pad((String) i.next(), getPageWidth()-2, getPrintWriter());
                printGutterRight();
                getPrintWriter().println();
            }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
        try (InputStream in = AggregateManagerImpl.class.getClassLoader()
                    .getResourceAsStream(DEFAULT_CONFIG)) {
            if (in == null) {
                throw new InternalError("Default config not in classpath: " + DEFAULT_CONFIG);
            }
            return AbstractVaultFsConfig.load(in, DEFAULT_CONFIG);
        } catch (ConfigurationException e) {
            throw new IllegalArgumentException("Internal error while parsing config.", e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Internal error while parsing config.", e);
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/SubPackageFilterArchive.java`
#### Snippet
```java
        for (Archive.Entry e: folder.getChildren()) {
            final String name = e.getName();
            if (e.isDirectory()) {
                if (!".snapshot".equals(name)) {
                    findSubPackageEntries(entries, e);
                }
            } else {
                // only process files with .zip extension
                if (name.endsWith(".zip")) {
                    entries.add(e);
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                        while ((parent == null || parent.getAggregate() == null)
                                && parentPath.length() > 0) {
                            String parentName = Text.getName(parentPath);
                            if (parentName.endsWith(".dir")) {
                                parentName = parentName.substring(0, parentName.length() - 4);
                            }
                            repoName = PlatformNameFormat.getRepositoryName(parentName) + "/" + repoName;
                            parentPath = Text.getRelativeParent(parentPath, 1);
                            parent = fs.getFile(parentPath);
                        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                        if (txInfo == null) {
                            txInfo = new TxInfo(parent.getAggregate());
                            modified.put(parent.getAggregate().getPath(), txInfo);
                        }
                        txInfo.out.getArtifacts().add(new InputSourceArtifact(null,
                                repoRelPath, change.isa.getExtension(),
                                ArtifactType.FILE,
                                change.isa.getInputSource(), change.isa.getSerializationType()
                        ));
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    String repoPath = parent.getAggregate().getPath();

                    if (!repoPath.endsWith("/")) {
                        repoPath += "/";
                    }
                    repoPath += repoName;
                    assertInFilter(repoPath);
                    TxInfo txInfo = modified.get(repoPath);
                    if (txInfo == null) {
                        txInfo = new TxInfo(repoPath, ((AggregateImpl) parent.getAggregate()).create(repoName));
                        txInfo.setParentFile(parent);
                        modified.put(repoPath, txInfo);
                    }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/TransactionImpl.java`
#### Snippet
```java
                    TxInfo txInfo = modified.get(an.getPath());
                    if (txInfo == null) {
                        txInfo = new TxInfo(an);
                        VaultFile dir = null;
                        for (VaultFile rel : change.file.getRelated()) {
                            txInfo.original.put(rel.getPath(), rel);
                            if (rel.isDirectory()) {
                                dir = rel;
                            }
                        }
                        modified.put(txInfo.artifactsPath, txInfo);
                        // set parent file
                        if (dir == null) {
                            txInfo.parentFile = change.file.getParent();
                        } else {
                            txInfo.parentFile = dir.getParent();
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/FileAggregator.java`
#### Snippet
```java
        if (!needsDir) {
            // suppress mix:lockable (todo: make configurable)
            if (node.hasProperty(JcrConstants.JCR_MIXINTYPES)) {
                for (Value v: node.getProperty(JcrConstants.JCR_MIXINTYPES).getValues()) {
                    if (!v.getString().equals(JcrConstants.MIX_LOCKABLE)) {
                        needsDir = true;
                        break;
                    }
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
        if (!node.hasProperty(JcrConstants.JCR_LASTMODIFIED) || modified) {
            Calendar lastModified = Calendar.getInstance();
            node.setProperty(JcrConstants.JCR_LASTMODIFIED, lastModified);
            modified = true;
        }
        // do not overwrite mimetype
        if (!node.hasProperty(JcrConstants.JCR_MIMETYPE)) {
            String mimeType = a.getContentType();
            if (mimeType == null) {
                mimeType = Text.getName(a.getRelativePath(), '.');
                mimeType = MimeTypes.getMimeType(mimeType, MimeTypes.APPLICATION_OCTET_STREAM);
            }
            node.setProperty(JcrConstants.JCR_MIMETYPE, mimeType);
            modified = true;
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
                    handler.startElement(Name.NS_SV_URI, "property", "sv:property", attrs);
                    for (String v : p.getStringValues()) {
                        handler.startElement(Name.NS_SV_URI, "value", "sv:value", DocViewSAXHandler.EMPTY_ATTRIBUTES);
                        handler.characters(v.toCharArray(), 0, v.length());
                        handler.endElement(Name.NS_SV_URI, "value", "sv:value");
                    }
                    handler.endElement(Name.NS_SV_URI, "property", "sv:property");
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParser.java`
#### Snippet
```java
        int pos = 0;
        while (pos<buffer.length) {
            int read = reader.read(buffer, pos, buffer.length - pos);
            if (read < 0) {
                break;
            }
            pos+=read;
        }
        String str = new String(buffer, 0, pos);
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageDefinitionImpl.java`
#### Snippet
```java
            defNode.setProperty(PN_LAST_WRAPPED, now);
            defNode.setProperty(PN_LAST_WRAPPED_BY, getUserId());
            defNode.setProperty(PN_LAST_UNWRAPPED, now);
            defNode.setProperty(PN_LAST_UNWRAPPED_BY, getUserId());
            defNode.setProperty("unwrapped", (Value) null);
            touch(now, false);
            defNode.getSession().save();
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrPackageManagerImpl.java`
#### Snippet
```java
        Node contentNode = packNode.getNode(JcrConstants.JCR_CONTENT);
        
        try (InputStream in = FileUtils.openInputStream(pack.getFile())){
            // stay jcr 1.0 compatible
            //noinspection deprecation
            contentNode.setProperty(JcrConstants.JCR_DATA, in);
            contentNode.setProperty(JcrConstants.JCR_LASTMODIFIED, now);
            contentNode.setProperty(JcrConstants.JCR_MIMETYPE, JcrPackage.MIME_TYPE);
            packNode.getSession().save();
        } catch (IOException e) {
            throw new PackageException(e);
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        for (Value value : values) {
            strValues.add(serializeValue(value, useBinaryReferences));
        }
        
        Boolean isBinaryRef = null;
        if (type == PropertyType.BINARY) {
            // either only binary references or regular binaries
            for (String strValue : strValues) {
                boolean isCurrentValueBinaryRef = !strValue.isEmpty();
                if (isBinaryRef == null) {
                    isBinaryRef = isCurrentValueBinaryRef;
                } else {
                    if (isBinaryRef != isCurrentValueBinaryRef) {
                        throw new ValueFormatException("Mixed binary references and regular binary values in the same multi-value property is not supported");
                    }
                }
            }
        }
        if (isBinaryRef == null) {
            isBinaryRef = false;
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        String strValue = null;
        if (value.getType() == PropertyType.BINARY) {
            if (useBinaryReferences) {
                Binary bin = value.getBinary();
                if (bin instanceof ReferenceBinary) {
                    strValue = ((ReferenceBinary) bin).getReference();
                }
            }
            if (strValue == null) {
                // leave value empty for non reference binaries or where reference is null
                strValue = "";
            }
        } else {
            strValue = ValueHelper.serialize(value, false);
        }
        return strValue;
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        boolean isMulti = false;
        boolean isBinaryRef = false;
        int type = PropertyType.UNDEFINED;
        int pos = 0;
        char state = 'b';
        List<String> vals = null;
        StringBuilder tmp = new StringBuilder();
        int unicode = 0;
        int unicodePos = 0;
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
                    if (c == '{') {
                        state = 't';
                    } else if (c == '[') {
                        isMulti = true;
                        state = 'v';
                    } else if (c == '\\') {
                        state = 'e';
                    } else {
                        tmp.append(c);
                        state = 'v';
                    }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
                    if (c == '}') {
                        if (BINARY_REF.equals(tmp.toString())) {
                            type = PropertyType.BINARY;
                            isBinaryRef = true;
                        } else {
                            type = PropertyType.valueFromName(tmp.toString());
                        }
                        tmp.setLength(0);
                        state = 'a';
                    } else {
                        tmp.append(c);
                    }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        StringBuilder attrValue = new StringBuilder();
        
        if (isAmbiguous(type, name)) {
            final String strType;
            if (isReferenceProperty) {
                strType = BINARY_REF;
            } else {
                strType = PropertyType.nameFromValue(type);
            }
            attrValue.append('{').append(strType).append('}');
        }
        if (isMulti) {
            attrValue.append('[');
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder();
        for (int i=0; i<value.length(); i++) {
            char c = value.charAt(i);
            if (c == '\\') {
                buf.append("\\\\");
            } else if (c == ',' && isMulti) {
                buf.append("\\,");
            } else if (i == 0 && !isMulti && (c == '[' || c == '{')) {
                buf.append('\\').append(c);
            } else if ( XMLChar.isInvalid(c)) {
                buf.append("\\u");
                buf.append(Text.hexTable[(c >> 12) & 15]);
                buf.append(Text.hexTable[(c >> 8) & 15]);
                buf.append(Text.hexTable[(c >> 4) & 15]);
                buf.append(Text.hexTable[c & 15]);
            } else {
                buf.append(c);
            }
        }
        return buf.toString();
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        Property prop = node.hasProperty(name) ? node.getProperty(name) : null;
        // check if multiple flags are equal
        if (prop != null && isMulti != prop.getDefinition().isMultiple()) {
            prop.remove();
            prop = null;
        }
        if (prop != null) {
            int propType = prop.getType();
            if (propType != type && (propType != PropertyType.STRING || type != PropertyType.UNDEFINED)) {
                // never compare if types differ
                prop = null;
            }
        }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
                    switch (state) {
                        case STATE_INIT:
                            state = STATE_LF;
                            break;
                        case STATE_CR:
                            state = STATE_CRLF;
                            break;
                        case STATE_LF:
                            spool = lineFeed;
                            break;
                        case STATE_CRLF:
                            spool = lineFeed;
                            state = STATE_LF;
                    }
```

### DuplicatedCode
Duplicated code
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineOutputStream.java`
#### Snippet
```java
            switch (state) {
                case STATE_INIT:
                    state = STATE_LF;
                    break;
                case STATE_CR:
                    state = STATE_CRLF;
                    break;
                case STATE_LF:
                    flush(true);
                    state = STATE_LF;
                    break;
                case STATE_CRLF:
                    flush(true);
                    state = STATE_LF;
            }
```

### DuplicatedCode
Duplicated code
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/InlineChangeListener.java`
#### Snippet
```java
        String author = null;
        if (text instanceof Document.AnnotatedElement) {
            Document.AnnotatedElement t = (Document.AnnotatedElement) text;
            if (t.getDocumentSource() instanceof DefaultDocumentSource) {
                DefaultDocumentSource src = (DefaultDocumentSource) t.getDocumentSource();
                author = src.getAuthor();
            }
        }
```

### DuplicatedCode
Duplicated code
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskManagerImpl.java`
#### Snippet
```java
        if (id != null && id.length() > 0 && tasks.containsKey(id)) {
            throw new IllegalArgumentException("Task with id " + id + " already exists.");
        }
        RcpTaskImpl task = new RcpTaskImpl(getClassLoaderForRepositoryFactory(), src, connectionOptions, srcCreds, dst, id, excludes, recursive);
        tasks.put(task.getId(), task);
        persistTasks();
        return task;
```

### DuplicatedCode
Duplicated code
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
            Node node;
            Node parentNode;
            if (session.nodeExists(path)) {
                node = session.getNode(path);
                parentNode = node.getParent();
            } else {
                node = null;
                String parentPath = Text.getRelativeParent(path, 1);
                parentNode = session.nodeExists(parentPath)
                        ? session.getNode(parentPath)
                        : null;
            }
```

### DuplicatedCode
Duplicated code
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
                    messages.add(new ValidationMessage(ValidationMessageSeverity.DEBUG,
                            "Validating with validator " + entry.getKey() + "..."));
                    Collection<ValidationMessage> filterValidatorMessages = entry.getValue().validate(filter);
                    if (filterValidatorMessages != null) {
                        messages.addAll(ValidationViolation.wrapMessages(entry.getKey(), filterValidatorMessages, null, null, null, 0, 0));
                    }
```

### DuplicatedCode
Duplicated code
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidatorFactory.java`
#### Snippet
```java
        final boolean prohibitMutableContent;
        if (settings.getOptions().containsKey(OPTION_PROHIBIT_MUTABLE_CONTENT)) {
            prohibitMutableContent = Boolean.valueOf(settings.getOptions().get(OPTION_PROHIBIT_MUTABLE_CONTENT));
        } else {
            prohibitMutableContent = false;
        }
        final boolean prohibitImmutableContent;
        if (settings.getOptions().containsKey(OPTION_PROHIBIT_IMMUTABLE_CONTENT)) {
            prohibitImmutableContent = Boolean.valueOf(settings.getOptions().get(OPTION_PROHIBIT_IMMUTABLE_CONTENT));
        } else {
            prohibitImmutableContent = false;
        }
```

### DuplicatedCode
Duplicated code
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltFile.java`
#### Snippet
```java
            Reader r0 = baseFile.getReader();
            Reader r1 = tmpFile.getReader();
            Document baseDoc = new Document(null, LineElementsFactory.create(new MetaFileDocSource(baseFile), r0, false));
            Document leftDoc = new Document(null, LineElementsFactory.create(new FileDocumentSource(file), false, Constants.ENCODING));
            Document rightDoc = new Document(null, LineElementsFactory.create(new MetaFileDocSource(tmpFile), r1, false));

            DocumentDiff3 diff;
            try {
                diff = baseDoc.diff3(leftDoc, rightDoc);
            } finally {
                IOUtils.closeQuietly(r0);
                IOUtils.closeQuietly(r1);
            }
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/LineElementsFactory.java`
#### Snippet
```java
        Reader text = charset == null
                ? new FileReader(source.getFile())
                : new InputStreamReader(new FileInputStream(source.getFile()), charset);
        try {
            return create(source, text, ignoreWs);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
        File newZip = File.createTempFile(file.getName(), ".tmp", file.getParentFile());
        try (ZipOutputStream out = new ZipOutputStream(
                new BufferedOutputStream(new FileOutputStream(newZip)))) {
            out.setLevel(Deflater.NO_COMPRESSION);
    
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/ZipMetaFile.java`
#### Snippet
```java
        } else {
            if (!discard) {
                InputStream in = new FileInputStream(tmpFile);
                try {
                    parent.getZip().update(relPath, in);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
        OutputStream base;
        if (digest == null) {
            base = new FileOutputStream(localFile);
        } else {
            base = new DigestOutputStream(
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/VaultFileCopy.java`
#### Snippet
```java
        } else {
            base = new DigestOutputStream(
                    new FileOutputStream(localFile), digest);
        }
        if (lineFeed != null) {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/PlatformExporter.java`
#### Snippet
```java
            case STREAM:
                try (InputStream in = a.getInputStream();
                     OutputStream out = new FileOutputStream(local)) {
                    IOUtils.copy(in, out);
                }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JarExporter.java`
#### Snippet
```java
        if (jOut == null) {
            if (jarFile != null) {
                jOut = new JarOutputStream(new FileOutputStream(jarFile));
                jOut.setLevel(level);
            } else if (out != null) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewFormat.java`
#### Snippet
```java
     * @throws IOException if an error occurs */
    private byte[] format(File file, Checksum original, Checksum formatted) throws IOException {
        try (InputStream in = new CheckedInputStream(new BufferedInputStream(new FileInputStream(file)), original)) {
            @SuppressWarnings("resource")
            ByteArrayOutputStream buffer = formattingBuffer != null ? formattingBuffer.get() : null;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewFormat.java`
#### Snippet
```java
        final boolean changed = originalCrc32.getValue() != formattedCrc32.getValue();
        if (changed && !dryRun) {
            try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
                IOUtils.copy(new ByteArrayInputStream(formatted), out);
            }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileOutputImpl.java`
#### Snippet
```java
        tmpFile = File.createTempFile("vltfs", ".tmp");
        tmpFile.deleteOnExit();
        out = new FileOutputStream(tmpFile);
        return out;
    }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/PropertyValueArtifact.java`
#### Snippet
```java
     */
    public InputStream getInputStream() throws IOException, RepositoryException {
        return tmpFile == null ?  new PVAInputStream() : new FileInputStream(tmpFile);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    public static VaultFsConfig load(File file)
            throws ConfigurationException, IOException {
        try (InputStream input = new FileInputStream(file)) {
            return load(input, file.getName());
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
        for (File file: files) {
            if (file.getName().endsWith(".cnd")) {
                try(Reader r = new InputStreamReader(new FileInputStream(file), "utf8")) {
                    CNDReader reader = ServiceProviderFactory.getProvider().getCNDReader();
                    reader.read(r, file.getName(), null);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/FileInputSource.java`
#### Snippet
```java
        try {
            if (lineSeparator != null) {
                return new LineInputStream(new FileInputStream(file), lineSeparator);
            } else {
                return FileUtils.openInputStream(file);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/MD5.java`
#### Snippet
```java

    public static MD5 digest(File file) throws IOException {
        try (InputStream input = new FileInputStream(file)) {
            return digest(input);
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageInfo.java`
#### Snippet
```java
            for (File directoryFile : FileUtils.listFiles(file, new NameFileFilter(new String[] { "MANIFEST.MF", Constants.PROPERTIES_XML, Constants.FILTER_XML}),
                    new SuffixFileFilter(new String[] { Constants.META_INF, Constants.VAULT_DIR }))) {
                try (InputStream input = new BufferedInputStream(new FileInputStream(directoryFile))) {
                    info = readFromInputStream(new File(file.toURI().relativize(directoryFile.toURI()).getPath()), input, info);
                    // bail out as soon as all info was found
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
     */
    public void load(File file) throws IOException, ConfigurationException {
        try (InputStream input = new FileInputStream(file)) {
            load(input);
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        File file = (pack!=null)?pack.getFile():null;
        if (file != null) {
            try (InputStream input = new FileInputStream(file)) {
                binary = parent.getSession().getValueFactory().createBinary(input);
            }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
        File file = pkg.getFile();
        if (file != null) {
            try (InputStream input = new FileInputStream(file)) {
                binary = session.getValueFactory().createBinary(input);
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
    protected static final String MESSAGE_PROHIBITED_MUTABLE_PACKAGE_TYPE = "All mutable package types are prohibited and this package is of mutable type '%s'";
    protected static final String MESSAGE_PROHIBITED_IMMUTABLE_PACKAGE_TYPE = "All immutable package types are prohibited and this package is of immutable type '%s'";
    protected static final String SLING_OSGI_CONFIG = NODETYPE_SLING_OSGI_CONFIG;
    protected static final Path PATH_HOOKS = Paths.get(Constants.VAULT_DIR, Constants.HOOKS_DIR);
    private final @NotNull PackageType type;
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/VltTree.java`
#### Snippet
```java
        }
        LinkedList<Info> dirs = new LinkedList<Info>();
        dirs.addAll(infos.map().values());
        return dirs;
    }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/OakIndexDefinitionValidator.java`
#### Snippet
```java
    public @Nullable Collection<ValidationMessage> validate(@NotNull WorkspaceFilter filter) {
        Collection<ValidationMessage> violations = new LinkedList<>();
        violations.addAll(collectIndexPaths(filter.getFilterSets()));
        return violations;
    }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
            Document document = parser.parse(input, "");

            messages.addAll(errorHandler.getValidationMessages());
            DefaultWorkspaceFilter filter = new DefaultWorkspaceFilter();
            try {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
        }
        Collection<ValidationMessage> messages = new LinkedList<>();
        messages.addAll(getOrCreateNewNode(nodeContext, false, isImplicit(nodeContext.getNodePath()), false, primaryType.get(), node.getMixinTypes().toArray(new String[0])));

        for (DocViewProperty2 property : node.getProperties()) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
        // init with repository predefined node types
        Set<String> written = new HashSet<String>();
        written.addAll(ServiceProviderFactory.getProvider().getBuiltInNodeTypeNames());
        StringWriter out = new StringWriter();
        CNDWriter w = ServiceProviderFactory.getProvider().getCNDWriter(out, s, true);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
        // Make sure that also dependencies of contained packages are considered as packages will be installed in a joined sequence.
        Set<Dependency> allDependencies = new HashSet<>();
        allDependencies.addAll(state.getDependencies());
        for (PackageId subId : state.getSubPackages().keySet()) {
            FSInstallState subState = getInstallState(subId);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
        Path pkgFile = getPackageFile(pkg.getId());
        HashSet<Dependency> dependencies = new HashSet<>();
        dependencies.addAll(Arrays.asList(pkg.getDependencies()));
        if (autoDependency != null) {
            dependencies.add(autoDependency);
```

## RuleId[id=UnnecessaryToStringCall]
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
                return filter;
            } catch (Exception e) {
                log.error("Error while loading sync filter: " + e.toString());
            }
        } else {
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
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/AbstractPackageRegistry.java`
#### Snippet
```java
     */
    protected static PackageId createRandomPid() {
        return new PackageId("temporary", "pack_" + UUID.randomUUID().toString(), (String) null);
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/xml/serialize/NormalizingSaxFilter.java`
#### Snippet
```java
        }
    }
    /********* End Lexical Handler *********/
}

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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidatorFactory.java`
#### Snippet
```java
        // severity for ancestor of filter rules
        final ValidationMessageSeverity severityForUndefinedFilterRootAncestors;
        if (settings.getOptions().containsKey(OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS)) {
            String optionValue = settings.getOptions().get(OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS);
            severityForUndefinedFilterRootAncestors = ValidationMessageSeverity.valueOf(optionValue.toUpperCase());
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidatorFactory.java`
#### Snippet
```java
        final ValidationMessageSeverity severityForUndefinedFilterRootAncestors;
        if (settings.getOptions().containsKey(OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS)) {
            String optionValue = settings.getOptions().get(OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS);
            severityForUndefinedFilterRootAncestors = ValidationMessageSeverity.valueOf(optionValue.toUpperCase());
        } else {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidatorFactory.java`
#### Snippet
```java
                log.info("Due to package type 'application' emit error for every undefined filter root ancestor"); 
                severityForUndefinedFilterRootAncestors = ValidationMessageSeverity.ERROR;
            } else if(settings.getOptions().containsKey(OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS)) {
                log.warn("Using deprecated option " + OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS + ". Please switch to " + OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS + " instead!");
                String optionValue = settings.getOptions().get(OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidatorFactory.java`
#### Snippet
```java
            } else if(settings.getOptions().containsKey(OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS)) {
                log.warn("Using deprecated option " + OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS + ". Please switch to " + OPTION_SEVERITY_FOR_UNDEFINED_FILTER_ROOT_ANCESTORS + " instead!");
                String optionValue = settings.getOptions().get(OPTION_SEVERITY_FOR_UNCOVERED_FILTER_ROOT_ANCESTORS);
                severityForUndefinedFilterRootAncestors = ValidationMessageSeverity.valueOf(optionValue.toUpperCase());
            } else {
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
        ValidationViolation other = (ValidationViolation) obj;
        if (validatorId == null) {
            if (other.validatorId != null)
                return false;
        } else if (!validatorId.equals(other.validatorId))
```

### TrivialIf
`if` statement can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/ValidationViolation.java`
#### Snippet
```java
            if (other.validatorId != null)
                return false;
        } else if (!validatorId.equals(other.validatorId))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/ValidationMessage.java`
#### Snippet
```java
        } else if (!nodePath.equals(other.nodePath))
            return false;
        if (severity != other.severity)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
            info = resolvePackageInfo(new MavenCoordinates(groupId, artifactId, Artifact.LATEST_VERSION));
        }
        if (info == null) {
            return null;
        }
```

### TrivialIf
`if` statement can be simplified
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
    @Override
    public boolean shouldValidateMetaInfData(@NotNull Path filePath, @NotNull Path basePath) {
        if (filePath.getFileName().toString().endsWith(".cnd")) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java

    boolean isPotentiallyTransientException(RepositoryException e) {
        if (e instanceof ConstraintViolationException) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
    static boolean areFiltersEqual(WorkspaceFilter filter, WorkspaceFilter otherFilter) {
        if (filter == null || otherFilter == null) {
            if (otherFilter != null || filter != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
            }
        } else {
            if (!filter.getSourceAsString().equals(otherFilter.getSourceAsString())) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
    static boolean areCredentialsEqual(Credentials credentials, Credentials otherCredentials) {
        if (credentials == null || otherCredentials == null) {
            if (otherCredentials != null || credentials != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
    static boolean areRepositoryCopiersEqual(RepositoryCopier rcp, RepositoryCopier otherRcp) {
        if (rcp == null || otherRcp == null) {
            if (otherRcp != null || rcp != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
                return false;
            }
            if (rcp.isNoOrdering() != otherRcp.isNoOrdering()) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
        }
        // equals for RCP
        if (!areRepositoryCopiersEqual(rcp, other.rcp)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
            return false;
        if (idConflictPolicy == null) {
            if (other.idConflictPolicy != null)
                return false;
        } else if (!idConflictPolicy.equals(other.idConflictPolicy))
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ImportOptions.java`
#### Snippet
```java
            if (other.idConflictPolicy != null)
                return false;
        } else if (!idConflictPolicy.equals(other.idConflictPolicy))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/aggregator/FileAggregator.java`
#### Snippet
```java
            if (name.equals(JcrConstants.JCR_DATA)) {
                return false;
            } else if (name.equals(JcrConstants.JCR_LASTMODIFIED)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
        if (type != other.type)
            return false;
        if (!Arrays.equals(values, other.values))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/VersionRange.java`
#### Snippet
```java
        if (high != null) {
            int comp = v.compareTo(high);
            if (comp > 0 || comp == 0 && !highIncl) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
        } else if (!tracker.equals(other.tracker))
            return false;
        if (update != other.update)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageProperties.java`
#### Snippet
```java
        DefaultPackageProperties other = (DefaultPackageProperties) obj;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/DefaultPackageProperties.java`
#### Snippet
```java
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/JcrWorkspaceFilter.java`
#### Snippet
```java
            }
            boolean isPropertyFilter = false;
            if (filter.getName().startsWith("p")) {
                isPropertyFilter = true;
            }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
            return false;
        if (uuid == null) {
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode.java`
#### Snippet
```java
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
            return true;
        }
        if (additionalAdminIds.contains(authorizableId)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/events/impl/PackageEventDispatcherImpl.java`
#### Snippet
```java
            if (!Arrays.equals(related, other.related))
                return false;
            if (type != other.type)
                return false;
            return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/taskoption/ImportOptionsPackageTaskOption.java`
#### Snippet
```java
        ImportOptionsPackageTaskOption other = (ImportOptionsPackageTaskOption) obj;
        if (importOptions == null) {
            if (other.importOptions != null)
                return false;
        } else if (!importOptions.equals(other.importOptions))
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/taskoption/ImportOptionsPackageTaskOption.java`
#### Snippet
```java
            if (other.importOptions != null)
                return false;
        } else if (!importOptions.equals(other.importOptions))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/PackageTaskImpl.java`
#### Snippet
```java
        if (state != other.state)
            return false;
        if (type != other.type)
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultWorkspaceFilter.java`
#### Snippet
```java
        } else if (!referenceFilterSets.equals(other.referenceFilterSets))
            return false;
        if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
            return false;
        return true;
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
            return false;
        if (subPackages == null) {
            if (other.subPackages != null)
                return false;
        } else if (!subPackages.equals(other.subPackages))
```

### TrivialIf
`if` statement can be simplified
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallState.java`
#### Snippet
```java
            if (other.subPackages != null)
                return false;
        } else if (!subPackages.equals(other.subPackages))
            return false;
        return true;
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
    void endDocViewNode(@NotNull String nodePath, @NotNull DocViewNode2 docViewNode, @NotNull Optional<DocViewNode2> parentDocViewNode, int line, int column) throws IOException, RepositoryException;

    /**
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileChannel' used without 'try'-with-resources statement
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/impl/util/ResettableInputStream.java`
#### Snippet
```java
        if (unwrappedInput instanceof FileInputStream) {
            FileInputStream fis = FileInputStream.class.cast(unwrappedInput);
            fis.getChannel().position(0);
            currentInput = new EnhancedBufferedInputStream(unwrappedInput);
        } else {
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `ClassLoader` is redundant
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipNioArchive.java`
#### Snippet
```java
        }
        try {
            zipFileSystem = FileSystems.newFileSystem(path, (ClassLoader)null);
        } catch (ProviderNotFoundException e) {
            throw new IOException("Can not open zip file '" + path + "'", e);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param cwd` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    /**
     * 
     * @param cwd
     * @param localFile
     * @param repProvider
```

### JavadocDeclaration
`@param localFile` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * 
     * @param cwd
     * @param localFile
     * @param repProvider
     * @param credsProvider
```

### JavadocDeclaration
`@param repProvider` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param cwd
     * @param localFile
     * @param repProvider
     * @param credsProvider
     * @throws IOException
```

### JavadocDeclaration
`@param credsProvider` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param localFile
     * @param repProvider
     * @param credsProvider
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param repProvider
     * @param credsProvider
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
     */
```

### JavadocDeclaration
`@param cwd` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    /**
     * 
     * @param cwd
     * @param localFile
     * @param repProvider
```

### JavadocDeclaration
`@param localFile` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * 
     * @param cwd
     * @param localFile
     * @param repProvider
     * @param credsProvider
```

### JavadocDeclaration
`@param repProvider` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param cwd
     * @param localFile
     * @param repProvider
     * @param credsProvider
     * @param out
```

### JavadocDeclaration
`@param credsProvider` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param localFile
     * @param repProvider
     * @param credsProvider
     * @param out
     * @throws IOException
```

### JavadocDeclaration
`@param out` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param repProvider
     * @param credsProvider
     * @param out
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
     * @param credsProvider
     * @param out
     * @throws IOException
     * @deprecated Rather use {@link #VltContext(File, File, RepositoryProvider, CredentialsStore, PrintStream, ConnectionOptions)}
     */
```

### JavadocDeclaration
`@param regex` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    /** Checks if the regex would at least have the chance to match if the matching path starts with root path.
     * 
     * @param regex
     * @param rootPath
     * @return */
```

### JavadocDeclaration
`@param rootPath` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
     * 
     * @param regex
     * @param rootPath
     * @return */
    static boolean isRegexValidForRootPath(String regex, String rootPath) {
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
     * @param regex
     * @param rootPath
     * @return */
    static boolean isRegexValidForRootPath(String regex, String rootPath) {
        Pattern pattern = Pattern.compile(regex);
```

### JavadocDeclaration
`@param nodePath` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    /**
     * Only called for node's which are not only defined by folders
     * @param nodePath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
     * Only called for node's which are not only defined by folders
     * @param nodePath
     * @return
     */
    private Collection<ValidationMessage> validateNodePath(@NotNull String nodePath) {
```

### JavadocDeclaration
`@param nodePath` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    /**
     * 
     * @param nodePath
     * @return the path the ancestor node not contained in the filter or {@code null}
     */
```

### JavadocDeclaration
`@param urls` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/util/classloaderurl/CndUtil.java`
#### Snippet
```java
    /**
     * Resolve URLs pointing to JARs with META-INF/MANIFEST carrying a {@code Sling-Nodetypes} header
     * @param urls
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/util/classloaderurl/CndUtil.java`
#### Snippet
```java
     * Resolve URLs pointing to JARs with META-INF/MANIFEST carrying a {@code Sling-Nodetypes} header
     * @param urls
     * @return
     */
    public static List<String> resolveJarUrls(List<String> urls) {
```

### JavadocDeclaration
`@param dependency` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
    /**
     * Use some heuristics to map the package dependency to Maven coordinates and try to resolve them then via {@link #resolvePackageInfo(MavenCoordinates)}.
     * @param dependency
     * @return the resolved package info or {@code null}
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/context/AbstractDependencyResolver.java`
#### Snippet
```java
     * @param dependency
     * @return the resolved package info or {@code null}
     * @throws IOException
     */
    private @Nullable PackageInfo resolvePackageInfo(@NotNull Dependency dependency) throws IOException {
```

### JavadocDeclaration
`@param nodePath` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
    /** Called whenever some subtree was fully visited
     * 
     * @param nodePath
     * @return
     * @throws RepositoryException
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * 
     * @param nodePath
     * @return
     * @throws RepositoryException
     * @throws PathNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @param nodePath
     * @return
     * @throws RepositoryException
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
```

### JavadocDeclaration
RepositoryException is not declared to be thrown by method finalizeValidationForSiblings
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @param nodePath
     * @return
     * @throws RepositoryException
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @return
     * @throws RepositoryException
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
     * @throws NamespaceException
```

### JavadocDeclaration
PathNotFoundException is not declared to be thrown by method finalizeValidationForSiblings
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @return
     * @throws RepositoryException
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
     * @throws NamespaceException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws RepositoryException
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
     * @throws NamespaceException
     * @throws IllegalNameException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
```

### JavadocDeclaration
NamespaceException is not declared to be thrown by method finalizeValidationForSiblings
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws PathNotFoundException
     * @throws IllegalArgumentException
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws IllegalArgumentException
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
    private @Nullable Collection<ValidationMessage> finalizeValidationForSiblings(NodeContext nodeContext) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/NodeTypeValidator.java`
#### Snippet
```java
     * @throws NamespaceException
     * @throws IllegalNameException
     * @throws MalformedPathException */
    private @Nullable Collection<ValidationMessage> finalizeValidationForSiblings(NodeContext nodeContext) {
        String parentNodePath = Text.getRelativeParent(nodeContext.getNodePath(), 1);
```

### JavadocDeclaration
`@param parentEffectiveNodeType` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
     * {@link EffectiveNodeType#checkAddNodeConstraints(Name, org.apache.jackrabbit.spi.QNodeTypeDefinition, ItemDefinitionProvider)}
     * 
     * @param parentEffectiveNodeType
     * @return constraints violation message
     * @throws RepositoryException */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/nodetype/JcrNodeTypeMetaDataImpl.java`
#### Snippet
```java
     * @param parentEffectiveNodeType
     * @return constraints violation message
     * @throws RepositoryException */
    private Optional<String> validateAgainstParentNodeType(@NotNull EffectiveNodeType parentEffectiveNodeType,
            @NotNull NodeTypeDefinitionProvider nodeTypeDefinitionProvider,
```

### JavadocDeclaration
`@param path` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
    /**
     * As not working reliably it is simply ignored.
     * @param path
     */
    @Deprecated
```

### JavadocDeclaration
`@param session` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
    /**
     * Same as {@link #save(Session, boolean)} with the second argument being {@code true}.
     * @param session
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
     * Same as {@link #save(Session, boolean)} with the second argument being {@code true}.
     * @param session
     * @throws RepositoryException
     */
    public void save(@Nullable Session session) throws RepositoryException {
```

### JavadocDeclaration
`@param path` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
    /**
     * As not working reliably it is simply ignored.
     * @param path
     */
    @Deprecated
```

### JavadocDeclaration
`@param session` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AutoSave.java`
#### Snippet
```java
    /**
     * 
     * @param session
     * @return {@code true} in case was successful or {@code false} in case it failed with a potentially recoverable {@link RepositoryException}
     * @throws RepositoryException in case of unrecoverable exceptions
```

### JavadocDeclaration
`@param credentials` tag description is missing
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java
    }

    /** @param credentials
     * @return */
    static boolean areCredentialsEqual(Credentials credentials, Credentials otherCredentials) {
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RcpTaskImpl.java`
#### Snippet
```java

    /** @param credentials
     * @return */
    static boolean areCredentialsEqual(Credentials credentials, Credentials otherCredentials) {
        if (credentials == null || otherCredentials == null) {
```

### JavadocDeclaration
`@param out` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Serializer.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param out
     * @throws IOException
     * @throws RepositoryException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Serializer.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param out
     * @throws IOException
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Serializer.java`
#### Snippet
```java
     * @param out
     * @throws IOException
     * @throws RepositoryException
     */
    void writeContent(@NotNull OutputStream out) throws IOException, RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param line the current line number in the docview xml
     * @param column the current column number in the docview xml
     * @throws IOException
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param column the current column number in the docview xml
     * @throws IOException
     * @throws RepositoryException
     */
    void endDocViewNode(@NotNull String nodePath, @NotNull DocViewNode2 docViewNode, @NotNull Optional<DocViewNode2> parentDocViewNode, int line, int column) throws IOException, RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param line the current line number in the docview xml
     * @param column the current column number in the docview xml
     * @throws IOException
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * @param column the current column number in the docview xml
     * @throws IOException
     * @throws RepositoryException
     */
    void startDocViewNode(@NotNull String nodePath, @NotNull DocViewNode2 docViewNode, @NotNull Optional<DocViewNode2> parentDocViewNode, int line, int column) throws IOException, RepositoryException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
    /**
     * Called once when the end of a docview file has been reached.
     * @throws RepositoryException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParserHandler.java`
#### Snippet
```java
     * Called once when the end of a docview file has been reached.
     * @throws RepositoryException
     * @throws IOException
     */
    default void endDocument() throws RepositoryException, IOException {};
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParser.java`
#### Snippet
```java
     * @param reader the reader from which to read the XML
     * @return {@code true} in case the given source is Document View XML format
     * @throws IOException
     */
    private static boolean isDocView(Reader reader) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParser.java`
#### Snippet
```java
     * @param filePath the file path of the file containing the potential docview xml, must be relative to the jcr_root directory
     * @return either the absolute repository path of the root node of the given docview xml or {@code null} if no docview xml given
     * @throws IOException */
    public static @Nullable String getDocumentViewXmlRootNodePath(InputStream input, Path filePath) throws IOException {
        if (filePath.isAbsolute()) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParser.java`
#### Snippet
```java
     * @param inputSource the source of the docview xml
     * @param handler the callback handler which gets the deserialized node information
     * @throws IOException 
     * @throws XmlParseException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/DocViewParser.java`
#### Snippet
```java
     * @param handler the callback handler which gets the deserialized node information
     * @throws IOException 
     * @throws XmlParseException 
     */
    public void parse(String rootNodePath, InputSource inputSource, DocViewParserHandler handler) throws IOException, XmlParseException {
```

### JavadocDeclaration
Javadoc pointing to itself
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/WorkspaceFilter.java`
#### Snippet
```java
     * and it's not globally ignored.
     * <p>
     * If {@link #contains(String)} returns {@code true} for one path, 
     * also {@link #covers(String)} would return {@code true} for the same path, 
     * but not vice-versa.
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
    /**
     * <p>The specified stream is automatically closed after this method returns or throws an exception.
     * @param in
     * @param relPath
     * @throws IOException
```

### JavadocDeclaration
`@param relPath` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
     * <p>The specified stream is automatically closed after this method returns or throws an exception.
     * @param in
     * @param relPath
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
     * @param in
     * @param relPath
     * @throws IOException
     */
    public abstract void writeFile(InputStream in, String relPath)
```

### JavadocDeclaration
`@param opts` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
    /**
     * Constructor which is not setting default options.
     * @param opts
     * @see #Importer(ImportOptions, boolean, boolean, IdConflictPolicy)
     */
```

### JavadocDeclaration
`@param node` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
    /**
     * This is potentially a destructive operation as it will remove all (non-protected) properties before doing the conversion
     * @param node
     * @param info
     * @throws RepositoryException
```

### JavadocDeclaration
`@param info` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
     * This is potentially a destructive operation as it will remove all (non-protected) properties before doing the conversion
     * @param node
     * @param info
     * @throws RepositoryException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/FolderArtifactHandler.java`
#### Snippet
```java
     * @param node
     * @param info
     * @throws RepositoryException
     */
    private void modifyPrimaryType(Node node, ImportInfoImpl info) throws RepositoryException {
```

### JavadocDeclaration
`@param name` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
    /** 
     * Extracts the index and the original item name from a name according to <a href="https://s.apache.org/jcr-2.0-spec/22_Same-Name_Siblings.html#22.2%20Addressing%20Same-Name%20Siblings%20by%20Path">JCR 2.0 22.2</a>.
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewSAXHandler.java`
#### Snippet
```java
     * Extracts the index and the original item name from a name according to <a href="https://s.apache.org/jcr-2.0-spec/22_Same-Name_Siblings.html#22.2%20Addressing%20Same-Name%20Siblings%20by%20Path">JCR 2.0 22.2</a>.
     * @param name
     * @return
     */
    private Map.Entry<String, Integer> getNameAndIndex(String name) {
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @return
     * @throws IOException
     * @throws ConfigurationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
     * @param in
     * @return
     * @throws IOException
     * @throws ConfigurationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractConfig.java`
#### Snippet
```java
     * @return
     * @throws IOException
     * @throws ConfigurationException
     */
    public boolean load(InputStream in) throws IOException, ConfigurationException {
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param name
     * @return
```

### JavadocDeclaration
`@param name` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param name
     * @return
     * @throws ConfigurationException
```

### JavadocDeclaration
`@return` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
     * @param in
     * @param name
     * @return
     * @throws ConfigurationException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
     * @param name
     * @return
     * @throws ConfigurationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
     * @return
     * @throws ConfigurationException
     * @throws IOException
     */
    public static VaultFsConfig load(InputStream in, String name)
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws ConfigurationException
```

### JavadocDeclaration
`@param systemId` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param in
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
     */
    public void loadConfig(@NotNull InputStream in, @NotNull String systemId)
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws IOException
```

### JavadocDeclaration
`@param systemId` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param in
     * @param systemId
     * @throws IOException
     */
    public void loadProperties(@NotNull InputStream in, @NotNull String systemId)
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * 
     * @param in
     * @param systemId
     * @throws ConfigurationException
```

### JavadocDeclaration
`@param systemId` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * 
     * @param in
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param in
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param systemId
     * @throws ConfigurationException
     * @throws IOException
     */
    public void loadFilter(@NotNull InputStream in, @NotNull String systemId)
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
    /**
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws IOException
```

### JavadocDeclaration
`@param systemId` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * <p>The specified stream remains open after this method returns.
     * @param in
     * @param systemId
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
     * @param in
     * @param systemId
     * @throws IOException
     */
    public void loadPrivileges(@NotNull InputStream in, @NotNull String systemId)
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/EffectiveNodeType.java`
#### Snippet
```java
     * @param nodeName the name of the to be created node
     * @return the qualified name of the default primary type for the given intermediate node below parent
     * @throws RepositoryException
     */
    public Optional<String> getDefaultPrimaryChildNodeTypeName(@NotNull Node parent, @NotNull String nodeName) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
     * @param namespacePrefixes the namespace prefixes for which to emit namespace declarations in this node
     * @throws NamespaceException in case no prefix is defined for the namespace URI of a name (either node's or property's)
     * @throws XMLStreamException
     * @since 3.6.2
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewNode2.java`
#### Snippet
```java
     * {@code FormattingXmlStreamWriter.create(out, new DocViewFormat().getXmlOutputFormat())}.
     * @param writer the XMLStreamWriter to write to
     * @throws XMLStreamException
     * @since 3.6.2
     */
```

### JavadocDeclaration
`@param in` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
        /**
         * <p>The specified stream remains open after this method returns.
         * @param in
         * @throws Exception
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
         * <p>The specified stream remains open after this method returns.
         * @param in
         * @throws Exception
         */
        void run(InputStream in) throws Exception;
```

### JavadocDeclaration
Wrong tag `return{@code`
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * @param effectiveNodeType the effective node type
     * @param docViewProperty the property
     * @return{@code true} in case the property is protected, {@code false} otherwise
     * @throws RepositoryException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * @param docViewProperty the property
     * @return{@code true} in case the property is protected, {@code false} otherwise
     * @throws RepositoryException 
     */
    private boolean isPropertyProtected(@NotNull EffectiveNodeType effectiveNodeType, @NotNull DocViewProperty2 docViewProperty) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * @param ni the information about the new node to be created
     * @return the newly created node
     * @throws RepositoryException
     */
    private @NotNull Node createNewNode(Node parentNode, DocViewNode2 ni)
```

### JavadocDeclaration
SAXException is not declared to be thrown by method handleAuthorizable
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * @param docViewNode   doc view node of the authorizable
     * @throws RepositoryException if an error accessing the repository occurrs.
     * @throws SAXException        if an XML parsing error occurrs.
     */
    private void handleAuthorizable(Node node, DocViewNode2 docViewNode) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty.java`
#### Snippet
```java
     * @param useBinaryReferences to use the binary reference as value (if available)
     * @return the new property
     * @throws RepositoryException
     */
    public static DocViewProperty fromValues(@NotNull String name, @NotNull Value[] values, int type, boolean isMulti, boolean sort, boolean useBinaryReferences) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @throws IllegalArgumentException in case the given value does not follow the doc view property grammar
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
    public static @NotNull DocViewProperty2 parse(Name name, String value) throws IllegalNameException, NamespaceException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @throws IllegalArgumentException in case the given value does not follow the doc view property grammar
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @return a property
     * @throws NamespaceException 
     * @throws IllegalNameException 
     */
    public static @NotNull DocViewProperty2 parse(String name, String value, NameResolver nameResolver) throws IllegalNameException, NamespaceException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/DocViewProperty2.java`
#### Snippet
```java
     * @param useBinaryReferences to use the binary reference as value (if available)
     * @return the new property
     * @throws RepositoryException
     */
    public static @NotNull DocViewProperty2 fromValues(@NotNull Name name, @NotNull Value[] values, int type, boolean isMulti, boolean sort, boolean useBinaryReferences) throws RepositoryException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/Packaging.java`
#### Snippet
```java
     * registry, otherwise the first registered package registry is used and the JCR-based registry will be inserted as last registry. 
     * @return the composite package registry
     * @throws IOException 
     */
    PackageRegistry getCompositePackageRegistry(Session session, boolean useJcrRegistryAsPrimaryRegistry) throws IOException;
```

### JavadocDeclaration
`@param session` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/AdminPermissionChecker.java`
#### Snippet
```java
    /**
     * Checks if the repository is Oak 1.40 or newer. Compare with <a href="https://issues.apache.org/jira/browse/OAK-9415">OAK-9415</a>.
     * @param session
     * @return {@code true} if Oak repository >= 1.40.0 is used, otherwise {@code false}
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java
    /**
     * Loads all state from files persisted in configured homeDir, adds to cache and returns all cached {@code PackageId}s.
     * @throws IOException 
     */
    private synchronized void load() throws IOException {
```

### JavadocDeclaration
`@param baseRegisry` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
    /**
     * Sets fallback PackageRegistry for dependency lookup
     * @param baseRegisry
     */
    public void setBaseRegistry(@Nullable PackageRegistry baseRegisry) {
```

### JavadocDeclaration
`@param replace` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * Uploads the given package to the JCR package manager,
     * @param pkg the package
     * @param replace
     * @return the uploaded package
     * @throws RepositoryException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @param replace
     * @return the uploaded package
     * @throws RepositoryException
     * @throws IOException
     * @throws PackageExistsException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @return the uploaded package
     * @throws RepositoryException
     * @throws IOException
     * @throws PackageExistsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @throws RepositoryException
     * @throws IOException
     * @throws PackageExistsException
     */
    public JcrPackage upload(@NotNull ZipVaultPackage pkg, boolean replace) throws RepositoryException, IOException, PackageExistsException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @param replace whether to replace an existing package with the same id
     * @return the newly uploaded package
     * @throws IOException 
     * @throws RepositoryException 
     * @throws PackageExistsException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @return the newly uploaded package
     * @throws IOException 
     * @throws RepositoryException 
     * @throws PackageExistsException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageRegistry.java`
#### Snippet
```java
     * @throws IOException 
     * @throws RepositoryException 
     * @throws PackageExistsException 
     */
    private JcrPackage upload(@NotNull Archive archive, Binary binary, boolean replace) throws RepositoryException, IOException, PackageExistsException {
```

### JavadocDeclaration
`@param vltPkg` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * Parses given {@link Archive.Entry} for .jar & .zip binaries and tries to register given subpackage.
     *
     * @param vltPkg
     * @param directory
     * @param parentPath
```

### JavadocDeclaration
`@param directory` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     *
     * @param vltPkg
     * @param directory
     * @param parentPath
     * @param replace
```

### JavadocDeclaration
`@param parentPath` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param vltPkg
     * @param directory
     * @param parentPath
     * @param replace
     * @param subpackages
```

### JavadocDeclaration
`@param replace` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param directory
     * @param parentPath
     * @param replace
     * @param subpackages
     * @throws IOException
```

### JavadocDeclaration
`@param subpackages` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param parentPath
     * @param replace
     * @param subpackages
     * @throws IOException
     * @throws PackageExistsException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param replace
     * @param subpackages
     * @throws IOException
     * @throws PackageExistsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param subpackages
     * @throws IOException
     * @throws PackageExistsException
     */
    private void registerSubPackages(VaultPackage vltPkg, Archive.Entry directory, String parentPath, boolean replace, Map<PackageId, SubPackageHandling.Option> subpackages, Dependency autoDependency)
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
    /**
     * Default constructor for OSGi initialization (homeDir defined via activator)
     * @throws IOException 
     */
    public FSPackageRegistry() throws IOException {
```

### JavadocDeclaration
`@param id` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
    /**
     * 
     * @param id
     * @return the file pointing to an existing or new package with the given id
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param id
     * @return the file pointing to an existing or new package with the given id
     * @throws IOException
     */
    @NotNull
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @return {@code Map} of {@code PackageId}s along with the corresponding {@code SubPackageHandling.Option} registered from a given {@code VaultPackage}
     *
     * @throws IOException
     * @throws PackageExistsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws PackageExistsException
     */
    private Map<PackageId, SubPackageHandling.Option> registerSubPackages(VaultPackage pkg, boolean replace)
```

### JavadocDeclaration
`@param homeDir` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
    /**
     * 
     * @param homeDir
     * @param scope
     * @param securityConfig
```

### JavadocDeclaration
`@param scope` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * 
     * @param homeDir
     * @param scope
     * @param securityConfig
     * @throws IOException
```

### JavadocDeclaration
`@param securityConfig` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param homeDir
     * @param scope
     * @param securityConfig
     * @throws IOException
     * @deprecated Use {@link #FSPackageRegistry(File, InstallationScope, SecurityConfig, boolean, boolean, IdConflictPolicy)} instead
```

### JavadocDeclaration
`@throws` tag description is missing
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSPackageRegistry.java`
#### Snippet
```java
     * @param scope
     * @param securityConfig
     * @throws IOException
     * @deprecated Use {@link #FSPackageRegistry(File, InstallationScope, SecurityConfig, boolean, boolean, IdConflictPolicy)} instead
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `prev` may be 'final'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/Hunk.java`
#### Snippet
```java
     * the previous hunk
     */
    private Hunk prev;

    /**
```

### FieldMayBeFinal
Field `left` may be 'final'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
     * the left document
     */
    private Document left;

    /**
```

### FieldMayBeFinal
Field `right` may be 'final'
in `vault-diff/src/main/java/org/apache/jackrabbit/vault/util/diff/DocumentDiff.java`
#### Snippet
```java
     * the right document
     */
    private Document right;

    /**
```

### FieldMayBeFinal
Field `config` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/ConfigCredentialsStore.java`
#### Snippet
```java
    protected static Logger log = LoggerFactory.getLogger(ConfigCredentialsStore.class);

    private VaultAuthConfig config;

    private Credentials defaultCreds;
```

### FieldMayBeFinal
Field `ignored` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/FileList.java`
#### Snippet
```java
    private final Set<String> globalIgnores;

    private List<Pattern> ignored = new LinkedList<Pattern>();

    public FileList(VltDirectory dir, VltEntries entries) throws VltException {
```

### FieldMayBeFinal
Field `vltExportRoot` may be 'final'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    private final SyncConfig cfg;

    private ExportRoot vltExportRoot;

    private WorkspaceFilter filter;
```

### FieldMayBeFinal
Field `fileFilter` may be 'final'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    };

    private FileFilter fileFilter = new FileFilter() {
        public boolean accept(File file) {
            String name = file.getName();
```

### FieldMayBeFinal
Field `filterStat` may be 'final'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java
    private WorkspaceFilter filter;

    private FStat filterStat;

    private FStat configStat;
```

### FieldMayBeFinal
Field `excluded` may be 'final'
in `vault-sync/src/main/java/org/apache/jackrabbit/vault/sync/impl/SyncHandler.java`
#### Snippet
```java

    // default to exclude all hidden files and directories
    private Pattern[] excluded = new Pattern[]{
            Pattern.compile("\\..*")
    };
```

### FieldMayBeFinal
Field `entries` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntries.java`
#### Snippet
```java
    private final String path;

    private Map<String, VltEntry> entries = new HashMap<String, VltEntry>();

    private boolean dirty;
```

### FieldMayBeFinal
Field `fileSystems` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    private final ConnectionOptions connectionOptions;

    private Map<RepositoryAddress, VaultFileSystem> fileSystems
            = new HashMap<>();

```

### FieldMayBeFinal
Field `swallowErrors` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltContext.java`
#### Snippet
```java
    private boolean quiet;

    private boolean swallowErrors = true;

    private final PrintStream stdout;
```

### FieldMayBeFinal
Field `infos` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/XmlEntry.java`
#### Snippet
```java
    private boolean dirty;

    private Map<VltEntryInfo.Type, VltEntryInfo> infos =
            new EnumMap<VltEntryInfo.Type, VltEntryInfo>(VltEntryInfo.Type.class);

```

### FieldMayBeFinal
Field `toUpdate` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    private Set<String> toDelete = new HashSet<String>();

    private Map<String, InputStream> toUpdate = new HashMap<String, InputStream>();

    private Map<String, String> toMove = new HashMap<String, String>();
```

### FieldMayBeFinal
Field `toDelete` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    private final File file;

    private Set<String> toDelete = new HashSet<String>();

    private Map<String, InputStream> toUpdate = new HashMap<String, InputStream>();
```

### FieldMayBeFinal
Field `toMove` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/meta/xml/zip/UpdateableZipFile.java`
#### Snippet
```java
    private Map<String, InputStream> toUpdate = new HashMap<String, InputStream>();

    private Map<String, String> toMove = new HashMap<String, String>();

    public UpdateableZipFile(File file) throws IOException {
```

### FieldMayBeFinal
Field `propName` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/PropGet.java`
#### Snippet
```java
public class PropGet extends BaseAction {

    private String propName;

    public PropGet(File localDir, List<File> localFiles, boolean nonRecursive,
```

### FieldMayBeFinal
Field `force` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Delete.java`
#### Snippet
```java
public class Delete extends BaseAction {

    private boolean force;

    public Delete(File localDir, List<File> localFiles, boolean nonRecursive,
```

### FieldMayBeFinal
Field `force` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Add.java`
#### Snippet
```java
public class Add extends BaseAction {

    private boolean force;

    public Add(File localDir, List<File> localFiles, boolean nonRecursive, boolean force) {
```

### FieldMayBeFinal
Field `propValue` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/PropSet.java`
#### Snippet
```java
    private String propName;

    private String propValue;

    public PropSet(File localDir, List<File> localFiles, boolean nonRecursive,
```

### FieldMayBeFinal
Field `propName` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/PropSet.java`
#### Snippet
```java
public class PropSet extends BaseAction {

    private String propName;

    private String propValue;
```

### FieldMayBeFinal
Field `forced` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Resolved.java`
#### Snippet
```java
public class Resolved extends BaseAction {

    private boolean forced;

    public Resolved(File localDir, List<File> localFiles, boolean nonRecursive,
```

### FieldMayBeFinal
Field `localFiles` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Commit.java`
#### Snippet
```java
    private File localDir;

    private List<File> localFiles;

    private boolean nonRecursive;
```

### FieldMayBeFinal
Field `nonRecursive` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Commit.java`
#### Snippet
```java
    private List<File> localFiles;

    private boolean nonRecursive;

    private boolean force;
```

### FieldMayBeFinal
Field `localDir` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Commit.java`
#### Snippet
```java
public class Commit extends AbstractAction {

    private File localDir;

    private List<File> localFiles;
```

### FieldMayBeFinal
Field `force` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Commit.java`
#### Snippet
```java
    private boolean nonRecursive;

    private boolean force;

    public Commit(File localDir, List<File> localFiles, boolean nonRecursive, boolean force) {
```

### FieldMayBeFinal
Field `mountPoint` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Checkout.java`
#### Snippet
```java
public class Checkout extends AbstractAction {

    private RepositoryAddress mountPoint;

    private String remoteDir;
```

### FieldMayBeFinal
Field `roots` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Sync.java`
#### Snippet
```java
        private boolean enabled = false;

        private Set<String> roots = new LinkedHashSet<String>();

        private Config(Session s) {
```

### FieldMayBeFinal
Field `localDir` may be 'final'
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/actions/Sync.java`
#### Snippet
```java
    private RepositoryAddress mountPoint;

    private File localDir;

    private final Command cmd;
```

### FieldMayBeFinal
Field `pomPropsPath` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/PomProperties.java`
#### Snippet
```java
    private final String artifactId;

    private String pomPropsPath;

    private Properties props;
```

### FieldMayBeFinal
Field `xOpts` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
    private Option optProxyPassword;

    private ExtendedOption[] xOpts = new ExtendedOption[]{
            new XJcrLog(),
            new XDavEx()
```

### FieldMayBeFinal
Field `base` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/cli/VaultFsApp.java`
#### Snippet
```java
    private static class PasswordPromptingCredentialsStore implements CredentialsStore {

        private CredentialsStore base;

        private PasswordPromptingCredentialsStore(CredentialsStore base) {
```

### FieldMayBeFinal
Field `runtimeEnv` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/ConsoleExecutionContext.java`
#### Snippet
```java
     * holds 'runtime' properties.
     */
    private Properties runtimeEnv = new Properties();

    private Console console;
```

### FieldMayBeFinal
Field `rows` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
    private int numCols;
    private int[] lengths;
    private LinkedList rows = new LinkedList();

    public Table(int numCols) {
```

### FieldMayBeFinal
Field `lengths` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
public class Table {
    private int numCols;
    private int[] lengths;
    private LinkedList rows = new LinkedList();

```

### FieldMayBeFinal
Field `numCols` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java
 */
public class Table {
    private int numCols;
    private int[] lengths;
    private LinkedList rows = new LinkedList();
```

### FieldMayBeFinal
Field `cols` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/util/Table.java`
#### Snippet
```java

    public static class Row {
        private Table.Col[] cols;

        private int pos = 0;
```

### FieldMayBeFinal
Field `F_FLAG_SIZE` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
    // format flags
    private static int F_FLAG_TIME = 0x01;
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
    private static int F_MASK      = 0x0f;
```

### FieldMayBeFinal
Field `F_FLAG_LONG` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
    private static int F_FLAG_TIME = 0x01;
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
    private static int F_MASK      = 0x0f;

```

### FieldMayBeFinal
Field `L_FLAG_ALL` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java

    // list switches
    private static int L_FLAG_ALL = 0x10;

    private Option optLong;
```

### FieldMayBeFinal
Field `F_MASK` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
    private static int F_MASK      = 0x0f;

    // list switches
```

### FieldMayBeFinal
Field `F_FLAG_TIME` may be 'final'
in `vault-cli/src/main/java/org/apache/jackrabbit/vault/util/console/platform/CmdLs.java`
#### Snippet
```java

    // format flags
    private static int F_FLAG_TIME = 0x01;
    private static int F_FLAG_SIZE = 0x02;
    private static int F_FLAG_LONG = 0x03;
```

### FieldMayBeFinal
Field `uuidsAndPaths` may be 'final'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/DuplicateUuidValidator.java`
#### Snippet
```java
    
    
    private Map<String, String> uuidsAndPaths;
    
    public DuplicateUuidValidator(ValidationMessageSeverity severity, WorkspaceFilter filter) {
```

### FieldMayBeFinal
Field `affectedFilterRoots` may be 'final'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/EmptyElementsValidator.java`
#### Snippet
```java
    private final WorkspaceFilter filter;
    
    private Collection<String> affectedFilterRoots;
    
    
```

### FieldMayBeFinal
Field `potentiallyDisallowedContainerNodes` may be 'final'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    private final Set<String> immutableRootNodeNames;
    private List<String> validContainerNodePaths;
    private List<NodeContext> potentiallyDisallowedContainerNodes;

    public PackageTypeValidator(@NotNull WorkspaceFilter workspaceFilter, @NotNull ValidationMessageSeverity severity,
```

### FieldMayBeFinal
Field `validContainerNodePaths` may be 'final'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/PackageTypeValidator.java`
#### Snippet
```java
    private final @NotNull WorkspaceFilter filter;
    private final Set<String> immutableRootNodeNames;
    private List<String> validContainerNodePaths;
    private List<NodeContext> potentiallyDisallowedContainerNodes;

```

### FieldMayBeFinal
Field `filterValidators` may be 'final'
in `vault-validation/src/main/java/org/apache/jackrabbit/vault/validation/spi/impl/AdvancedFilterValidator.java`
#### Snippet
```java
    private final Collection<PackageInfo> dependenciesMetaInfo;
    private final WorkspaceFilter filter;
    private Map<String, FilterValidator> filterValidators;
    private final Collection<String> danglingNodePaths;
    private final Map<PathFilterSet, List<Entry<PathFilter>>> orphanedFilterSets;
```

### FieldMayBeFinal
Field `prefixMapping` may be 'final'
in `vault-rcp/src/main/java/org/apache/jackrabbit/vault/rcp/impl/RepositoryCopierMixin.java`
#### Snippet
```java

    @JsonIgnore
    private Map<String, String> prefixMapping = new HashMap<>();

    @JsonIgnore
```

### FieldMayBeFinal
Field `inf` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/SubArchive.java`
#### Snippet
```java
    private final boolean isJcrRoot;

    private DefaultMetaInf inf = new DefaultMetaInf();

    public SubArchive(Archive base, Entry root, boolean isJcrRoot) {
```

### FieldMayBeFinal
Field `root` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/SubArchive.java`
#### Snippet
```java
    private Archive base;

    private Entry root;

    private final boolean isJcrRoot;
```

### FieldMayBeFinal
Field `in` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
     * the input stream that is consumed in this archive
     */
    private InputStream in;

    /**
```

### FieldMayBeFinal
Field `end` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/ZipStreamArchive.java`
#### Snippet
```java
        private long pos;

        private long end;

        private long mark;
```

### FieldMayBeFinal
Field `children` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/JcrArchive.java`
#### Snippet
```java
        private final String name;

        private Map<String, Entry> children = new LinkedHashMap<String, Entry>();

        private VirtualEntry(String name) {
```

### FieldMayBeFinal
Field `path` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/VaultFsTransaction.java`
#### Snippet
```java
        private final Type type;

        private String path;

        public Info(Type type, String path) {
```

### FieldMayBeFinal
Field `stack` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/DumpContext.java`
#### Snippet
```java
    private final PrintWriter out;

    private LinkedList<String> stack = new LinkedList<String>();

    public DumpContext(PrintWriter out) {
```

### FieldMayBeFinal
Field `DEFAULT_GENERATOR` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
    protected ExportInfo exportInfo = new ExportInfo();

    private static String DEFAULT_GENERATOR = "org.apache.jackrabbit.vault" + ":"
            + getVersion("org.apache.jackrabbit.vault", AbstractExporter.class);

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/AbstractExporter.java`
#### Snippet
```java
    private String rootPath = Constants.ROOT_DIR;

    private Properties properties = new Properties();

    private boolean noMetaInf;
```

### FieldMayBeFinal
Field `mapping` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/PrivilegeDefinitions.java`
#### Snippet
```java
    private Collection<PrivilegeDefinition> defs = new LinkedList<PrivilegeDefinition>();

    private NamespaceMapping mapping = new NamespaceMapping();

    public Collection<PrivilegeDefinition> getDefinitions() {
```

### FieldMayBeFinal
Field `defs` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/PrivilegeDefinitions.java`
#### Snippet
```java
public class PrivilegeDefinitions {

    private Collection<PrivilegeDefinition> defs = new LinkedList<PrivilegeDefinition>();

    private NamespaceMapping mapping = new NamespaceMapping();
```

### FieldMayBeFinal
Field `nodeTypes` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
     * the list of nodetype templates
     */
    private Map<Name, QNodeTypeDefinition> nodeTypes =
            new TreeMap<Name, QNodeTypeDefinition>();

```

### FieldMayBeFinal
Field `removed` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/DefaultNodeTypeSet.java`
#### Snippet
```java
     * the list of removed nodetype templates
     */
    private Map<Name, QNodeTypeDefinition> removed =
            new TreeMap<Name, QNodeTypeDefinition>();

```

### FieldMayBeFinal
Field `w` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/spi/impl/jcr20/DefaultCNDWriter.java`
#### Snippet
```java
public class DefaultCNDWriter implements CNDWriter {

    private CompactNodeTypeDefWriter w;

    public DefaultCNDWriter(Writer out, Session s, boolean includeNs) {
```

### FieldMayBeFinal
Field `URISaveEx` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/api/RepositoryAddress.java`
#### Snippet
```java
    }

    private static BitSet URISaveEx;

    static {
```

### FieldMayBeFinal
Field `intermediates` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
    private final List<Archive.Entry> patches = new LinkedList<Archive.Entry>();

    private Map<String, TxInfo> intermediates = new LinkedHashMap<String, TxInfo>();

    private Archive archive;
```

### FieldMayBeFinal
Field `removedIntermediates` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/io/Importer.java`
#### Snippet
```java
     * list of intermediate infos that were removed since the last auto save
     */
    private Map<String, TxInfo> removedIntermediates = new LinkedHashMap<>();

    private final boolean isStrict;
```

### FieldMayBeFinal
Field `isOwnManager` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
     * Indicates if this is our own manager and we need to release it
     */
    private boolean isOwnManager;

    /**
```

### FieldMayBeFinal
Field `log` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileSystemImpl.java`
#### Snippet
```java
     * default log
     */
    private static Logger log = LoggerFactory.getLogger(VaultFileSystemImpl.class);

    /**
```

### FieldMayBeFinal
Field `files` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/VaultFileNode.java`
#### Snippet
```java
     * the files of this node
     */
    private List<VaultFileImpl> files = new LinkedList<VaultFileImpl>();

    private Collection<VaultFileNode> children;
```

### FieldMayBeFinal
Field `tracker` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/AggregateManagerImpl.java`
#### Snippet
```java
        private static final Logger log = LoggerFactory.getLogger(AggregatorTracker.class);

        private ProgressTrackerListener tracker;

        int numCreated;
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JcrSysViewTransformer.java`
#### Snippet
```java
    private Name rootName;

    private Node parent;

    private final String existingPath;
```

### FieldMayBeFinal
Field `handler` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JcrSysViewTransformer.java`
#### Snippet
```java
     * sysview handler for special content
     */
    private ContentHandler handler;

    /**
```

### FieldMayBeFinal
Field `userManagement` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(GenericArtifactHandler.class);

    private UserManagement userManagement = ServiceProviderFactory.getProvider().getUserManagement();

    private ACLManagement aclManagement = ServiceProviderFactory.getProvider().getACLManagement();
```

### FieldMayBeFinal
Field `aclManagement` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/GenericArtifactHandler.java`
#### Snippet
```java
    private UserManagement userManagement = ServiceProviderFactory.getProvider().getUserManagement();

    private ACLManagement aclManagement = ServiceProviderFactory.getProvider().getACLManagement();

    @Override
```

### FieldMayBeFinal
Field `aceList` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/JackrabbitACLImporter.java`
#### Snippet
```java
    private final class ImportedAcList extends ImportedPolicy<JackrabbitAccessControlList> {

        private List<ACE> aceList = new ArrayList<>();
        private ACE currentACE;

```

### FieldMayBeFinal
Field `ignores` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/VaultSettings.java`
#### Snippet
```java
    public static final String ATTR_IGNORE_NAME = "name";

    private Set<String> ignores = new HashSet<String>();

    public Set<String> getIgnoredNames() {
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    private List<ArtifactHandler> handlers = new ArrayList<ArtifactHandler>();

    private Map<String, String> properties = new HashMap<String, String>();

    private byte[] source;
```

### FieldMayBeFinal
Field `aggregators` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    public static final String ATTR_VERSION = "version";

    private List<Aggregator> aggregators = new ArrayList<Aggregator>();

    private List<ArtifactHandler> handlers = new ArrayList<ArtifactHandler>();
```

### FieldMayBeFinal
Field `handlers` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/AbstractVaultFsConfig.java`
#### Snippet
```java
    private List<Aggregator> aggregators = new ArrayList<Aggregator>();

    private List<ArtifactHandler> handlers = new ArrayList<ArtifactHandler>();

    private Map<String, String> properties = new HashMap<String, String>();
```

### FieldMayBeFinal
Field `privileges` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
    private Collection<NodeTypeSet> cnds = new LinkedList<>();

    private PrivilegeDefinitions privileges = new PrivilegeDefinitions();

    private boolean hasDefinition;
```

### FieldMayBeFinal
Field `log` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/DefaultMetaInf.java`
#### Snippet
```java
public class DefaultMetaInf implements MetaInf {

    private static Logger log = LoggerFactory.getLogger(DefaultMetaInf.class);

    private VaultSettings settings;
```

### FieldMayBeFinal
Field `mappings` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
    private Map defaultClasses = new HashMap();

    private Map<String, String> mappings = new HashMap<String, String>();

    public Map getDefaultPackages() {
```

### FieldMayBeFinal
Field `defaultClasses` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
    private Map defaultPackages = new HashMap();

    private Map defaultClasses = new HashMap();

    private Map<String, String> mappings = new HashMap<String, String>();
```

### FieldMayBeFinal
Field `defaultPackages` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/config/ConfigHelper.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ConfigHelper.class);

    private Map defaultPackages = new HashMap();

    private Map defaultClasses = new HashMap();
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    public static final byte[] LS_NATIVE = System.getProperty("line.separator").getBytes();

    private byte[] buffer = new byte[8192];

    private byte[] lineFeed = LS_NATIVE;
```

### FieldMayBeFinal
Field `lineSpool` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineInputStream.java`
#### Snippet
```java
    private byte[] lineFeed = LS_NATIVE;

    private byte[] lineSpool;

    private int pos = 0;
```

### FieldMayBeFinal
Field `pumpThread` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/InputStreamPump.java`
#### Snippet
```java
    private final PipedInputStream in;

    private Thread pumpThread;

    @SuppressWarnings("java:S3077") // error is only written from one thread and used as immutable class
```

### FieldMayBeFinal
Field `buffer` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/LineOutputStream.java`
#### Snippet
```java
    public static final byte[] LS_NATIVE = System.getProperty("line.separator").getBytes();

    private byte[] buffer = new byte[8192];

    private byte[] lineFeed = LS_NATIVE;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    public static class Node<E> {

        private String name;

        private E elem;
```

### FieldMayBeFinal
Field `root` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/Tree.java`
#### Snippet
```java
    private final char separator;

    private Node<E> root = new Node<E>(null, "");

    public Tree() {
```

### FieldMayBeFinal
Field `repos` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryProvider.java`
#### Snippet
```java
    protected static Logger log = LoggerFactory.getLogger(RepositoryProvider.class);

    private Map<RepositoryAddress, Repository> repos = new HashMap<RepositoryAddress, Repository>();

    public Repository getRepository(RepositoryAddress address) throws RepositoryException {
```

### FieldMayBeFinal
Field `rootDepth` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
    private DocViewSAXHandler.Namespace nsStack = null;

    private int rootDepth;

    private final NamePathResolver npResolver;
```

### FieldMayBeFinal
Field `importInfo` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * import information for the nodes touched through this DocView (initially empty)
     */
    private ImportInfoImpl importInfo = new ImportInfoImpl();

    /**
```

### FieldMayBeFinal
Field `hints` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * map of hint nodes in the same artifact set
     */
    private Set<String> hints = new HashSet<>();

    /**
```

### FieldMayBeFinal
Field `binaries` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * a map of binaries (attachments)
     */
    private Map<String, Map<String, BlobInfo>> binaries
            = new HashMap<>();

```

### FieldMayBeFinal
Field `isNew` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
        private boolean isCheckedOut;

        private boolean isNew;

        /**
```

### FieldMayBeFinal
Field `preserveProperties` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/DocViewImporter.java`
#### Snippet
```java
     * properties that should not be deleted on existing nodes in the repository
     */
    private Set<String> preserveProperties = new HashSet<>();

    /**
```

### FieldMayBeFinal
Field `prefixMapping` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/util/RepositoryCopier.java`
#### Snippet
```java
    private WorkspaceFilter srcFilter;

    private Map<String, String> prefixMapping = new HashMap<>();

    private boolean onlyNewer;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/HollowVaultPackage.java`
#### Snippet
```java
public class HollowVaultPackage extends PackagePropertiesImpl implements VaultPackage {

    private Properties properties;

    public HollowVaultPackage(Properties properties) {
```

### FieldMayBeFinal
Field `processors` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/CompositeExportProcessor.java`
#### Snippet
```java
public class CompositeExportProcessor implements ExportPostProcessor {

    private List<ExportPostProcessor> processors = new LinkedList<>();

    public void addProcessor(ExportPostProcessor p) {
```

### FieldMayBeFinal
Field `mgr` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/impl/SubPackageExportProcessor.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(SubPackageExportProcessor.class);

    private JcrPackageManagerImpl mgr;

    private final Session session;
```

### FieldMayBeFinal
Field `listeners` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/events/impl/PackageEventDispatcherImpl.java`
#### Snippet
```java
     * the registered listener
     */
    private ConcurrentHashMap<Object, PackageEventListener> listeners = new ConcurrentHashMap<Object, PackageEventListener>();

    /**
```

### FieldMayBeFinal
Field `pkg` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/JcrPackageProperties.java`
#### Snippet
```java
public class JcrPackageProperties extends PackagePropertiesImpl {
    
    private JcrPackage pkg;

    public JcrPackageProperties(JcrPackage pkg) {
```

### FieldMayBeFinal
Field `pathIdMapping` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSInstallStateCache.java`
#### Snippet
```java
     * Contains a map of all filesystem paths to package IDs
     */
    private Map<Path, PackageId> pathIdMapping = new ConcurrentHashMap<>();

    private final Path homeDir;
```

### FieldMayBeFinal
Field `dependencies` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private PackageId id;
    private PackageProperties packageProperties;
    private Dependency[] dependencies;
    private WorkspaceFilter filter;
    private long size;
```

### FieldMayBeFinal
Field `size` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private Dependency[] dependencies;
    private WorkspaceFilter filter;
    private long size;

    public FSRegisteredPackage(FSPackageRegistry registry, FSInstallState installState) throws IOException {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private VaultPackage vltPkg = null;

    private PackageId id;
    private PackageProperties packageProperties;
    private Dependency[] dependencies;
```

### FieldMayBeFinal
Field `registry` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(FSRegisteredPackage.class);

    private FSPackageRegistry registry;

    private VaultPackage vltPkg = null;
```

### FieldMayBeFinal
Field `packageProperties` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java

    private PackageId id;
    private PackageProperties packageProperties;
    private Dependency[] dependencies;
    private WorkspaceFilter filter;
```

### FieldMayBeFinal
Field `filter` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/FSRegisteredPackage.java`
#### Snippet
```java
    private PackageProperties packageProperties;
    private Dependency[] dependencies;
    private WorkspaceFilter filter;
    private long size;

```

### FieldMayBeFinal
Field `tasks` may be 'final'
in `vault-core/src/main/java/org/apache/jackrabbit/vault/packaging/registry/impl/ExecutionPlanImpl.java`
#### Snippet
```java
    private static final Logger log = LoggerFactory.getLogger(ExecutionPlanImpl.class);

    private List<PackageTask> tasks = new ArrayList<PackageTask>();

    private String id;
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
    public void applyWithRemote(Action action, String name, boolean nonRecursive)
            throws VltException {
        applyWithRemote(action, getRemoteDirectory(ctx), Arrays.asList(name), nonRecursive);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-vlt/src/main/java/org/apache/jackrabbit/vault/vlt/VltDirectory.java`
#### Snippet
```java
    public void apply(Action action, String name, boolean nonRecursive)
            throws VltException {
        apply(action, Arrays.asList(name), nonRecursive);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `vault-core/src/main/java/org/apache/jackrabbit/vault/fs/impl/io/NodeStash.java`
#### Snippet
```java

    /** The property names of those protected properties which should be stashed (and later restored) */
    private static final List<String> PROTECTED_PROPERTIES_TO_STASH = Arrays.asList(JcrConstants.JCR_MIXINTYPES);

    private static final String PROTECTED_PROPERTIES_SUFFIX = "-stashed";
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

