# azure-devops-intellij 
 
# Bad smells
I found 1499 bad smells with 160 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| KotlinAnnotator | 365 | false |
| ReturnNull | 111 | false |
| UnstableApiUsage | 105 | false |
| Convert2Lambda | 84 | false |
| UnnecessarySuperQualifier | 71 | false |
| MissortedModifiers | 69 | false |
| BoundedWildcard | 68 | false |
| RedundantFieldInitialization | 67 | false |
| SizeReplaceableByIsEmpty | 44 | true |
| UtilityClassWithoutPrivateConstructor | 44 | true |
| DataFlowIssue | 32 | false |
| CommentedOutCode | 27 | false |
| UnnecessaryLocalVariable | 26 | true |
| ConstantValue | 25 | false |
| NonFinalFieldOfException | 24 | false |
| CallToStringConcatCanBeReplacedByOperator | 22 | false |
| NonSerializableFieldInSerializableClass | 18 | false |
| UnusedSymbol | 17 | false |
| UnnecessaryFullyQualifiedName | 16 | false |
| UnusedReceiverParameter | 13 | false |
| DynamicRegexReplaceableByCompiledPattern | 13 | false |
| NonProtectedConstructorInAbstractClass | 13 | true |
| EmptyMethod | 12 | false |
| InnerClassMayBeStatic | 12 | true |
| Anonymous2MethodRef | 12 | false |
| UnnecessaryToStringCall | 10 | true |
| AssignmentToMethodParameter | 10 | false |
| NullableProblems | 9 | false |
| RedundantMethodOverride | 9 | false |
| UnstableTypeUsedInSignature | 8 | false |
| FieldMayBeStatic | 8 | false |
| FinalStaticMethod | 7 | false |
| NestedAssignment | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| UnusedAssignment | 6 | false |
| AssignmentToStaticFieldFromInstanceMethod | 5 | false |
| IgnoreResultOfCall | 5 | false |
| CharsetObjectCanBeUsed | 5 | false |
| OverrideOnly | 4 | false |
| StaticCallOnSubclass | 4 | false |
| NotNullFieldNotInitialized | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| PointlessBooleanExpression | 4 | true |
| RegExpSimplifiable | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| InstanceofCatchParameter | 3 | false |
| SuspiciousNameCombination | 3 | false |
| MissingDeprecatedAnnotation | 3 | false |
| ReplaceNullCheck | 3 | false |
| EnumSwitchStatementWhichMissesCases | 2 | false |
| MagicConstant | 2 | false |
| ObsoleteCollection | 2 | false |
| RedundantArrayCreation | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| SynchronizeOnThis | 2 | false |
| IndexOfReplaceableByContains | 2 | false |
| UnnecessarySemicolon | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
| RedundantSuppression | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryModifier | 1 | true |
| PointlessArithmeticExpression | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| FinalPrivateMethod | 1 | false |
| ReadWriteStringCanBeUsed | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| MemberVisibilityCanBePrivate | 1 | false |
| RedundantImplements | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DoubleBraceInitialization | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| RedundantCollectionOperation | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| UnnecessaryBoxing | 1 | false |
| SystemOutErr | 1 | false |
| RedundantNullableReturnType | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ServerEventListener\[this.listeners.size()\]'
in `plugin/src/com/microsoft/alm/plugin/events/ServerEventManager.java`
#### Snippet
```java
        synchronized (this.listeners) {
            // Copy the list of listeners in case someone tries to add or remove a listener while we are looping
            localListeners = this.listeners.toArray(new ServerEventListener[this.listeners.size()]);
        }
        for (int i = localListeners.length - 1; i >= 0; i--) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ServerContextState\[contextStates.size()\]'
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
                    contextStates.add(new ServerContextState(context));
                }
                return contextStates.toArray(new ServerContextState[contextStates.size()]);
            }
        } catch (Throwable t) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new SimpleNode\[result.size()\]'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java
            result.add(new TfsTreeNode(this, childItem.getPath(), childItem.isFolder(), false));
        }
        return result.toArray(new SimpleNode[result.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[list0.size()\]'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
                        while (event0 != XMLStreamConstants.END_ELEMENT);

                        this.nodeReferencePaths = list0.toArray(new String[list0.size()]);
                    } else {
                        // Read the unknown child element until its end
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[lines.size()\]'
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
            }
        }
        return lines.toArray(new String[lines.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ColumnInfo\[columnsInfos.size()\]'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CustomTreeTable.java`
#### Snippet
```java
            root = null;
        }
        return new ListTreeTableModelOnColumns(root, columnsInfos.toArray(new ColumnInfo[columnsInfos.size()]));
    }

```

## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (cachedStatus) { case IS_MAPPING_ROOT: return true; c...` statement on enum type 'com.microsoft.alm.plugin.idea.tfvc.extensions.TfvcRootCache.CachedStatus' misses case 'UNKNOWN'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/extensions/TfvcRootChecker.java`
#### Snippet
```java

        TfvcRootCache.CachedStatus cachedStatus = myCache.get(Paths.get(path));
        switch (cachedStatus) {
            case IS_MAPPING_ROOT:
                return true;
            case NO_ROOT:
            case UNDER_MAPPING_ROOT:
                return false;
        }

        // Will get here only if cachedStatus == UNKNOWN.
```

### EnumSwitchStatementWhichMissesCases
`switch (level) { case CHECKIN: return TfPluginBundle.mes...` statement on enum type 'com.microsoft.alm.plugin.external.commands.LockCommand.LockLevel' misses case 'NONE'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsTableModel.java`
#### Snippet
```java
            public String getValue(final ExtendedItemInfoWithSelection item) {
                final LockCommand.LockLevel level = LockCommand.LockLevel.fromString(item.info.getLock());
                switch (level) {
                    case CHECKIN:
                        return TfPluginBundle.message(TfPluginBundle.KEY_TFVC_LOCK_DIALOG_LOCK_LEVEL_CHECKIN);
                    case CHECKOUT:
                        return TfPluginBundle.message(TfPluginBundle.KEY_TFVC_LOCK_DIALOG_LOCK_LEVEL_CHECKOUT);
                }
                // "None" is just the empty string
                return StringUtils.EMPTY;
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `plugin/src/com/microsoft/alm/plugin/context/rest/VersionControlRecursionTypeCaseSensitive.java`
#### Snippet
```java
    private int value;

    private VersionControlRecursionTypeCaseSensitive(final int value) {
        this.value = value;
    }
```

## RuleId[ruleID=MagicConstant]
### MagicConstant
Should be one of: SwingConstants.LEFT, SwingConstants.CENTER, SwingConstants.RIGHT, SwingConstants.LEADING, ...
in `plugin/src/com/microsoft/alm/plugin/idea/common/extensions/VcsWorkItemContentProvider.java`
#### Snippet
```java
        } else {
            return new JLabel(TfPluginBundle.message(TfPluginBundle.KEY_VCS_WIT_UNEXPECTED_ERRORS, t != null ? t.getMessage() : StringUtils.EMPTY),
                    AllIcons.General.Warning, 0);
        }
    }
```

### MagicConstant
Should be one of: SwingConstants.LEFT, SwingConstants.CENTER, SwingConstants.RIGHT, SwingConstants.LEADING, ...
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/VcsPullRequestContentProvider.java`
#### Snippet
```java
        } else {
            return new JLabel(TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_UNEXPECTED_ERRORS, t.getMessage()),
                    AllIcons.General.Warning, 0);
        }
    }
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`0 - d.height` can be replaced with '- d.height'
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
                // Place the popup above and to the left of the status bar icon
                final Dimension d = popup.getPreferredSize();
                popup.show(c, c.getWidth() - d.width, 0 - d.height);
            }
        }
```

## RuleId[ruleID=OverrideOnly]
### OverrideOnly
Method 'getMergeWindowTitle(com.intellij.openapi.vfs.VirtualFile)' can only be overridden
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/DialogContentMerger.java`
#### Snippet
```java
                        StreamUtil.convertSeparators(contentTriplet.serverContent)
                    ),
                    c.getMergeWindowTitle(localFile),
                    Arrays.asList(
                            c.getLeftPanelTitle(localFile),
```

### OverrideOnly
Method 'getLeftPanelTitle(com.intellij.openapi.vfs.VirtualFile)' can only be overridden
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/DialogContentMerger.java`
#### Snippet
```java
                    c.getMergeWindowTitle(localFile),
                    Arrays.asList(
                            c.getLeftPanelTitle(localFile),
                            c.getCenterPanelTitle(localFile),
                            c.getRightPanelTitle(localFile, serverVersion)
```

### OverrideOnly
Method 'getCenterPanelTitle(com.intellij.openapi.vfs.VirtualFile)' can only be overridden
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/DialogContentMerger.java`
#### Snippet
```java
                    Arrays.asList(
                            c.getLeftPanelTitle(localFile),
                            c.getCenterPanelTitle(localFile),
                            c.getRightPanelTitle(localFile, serverVersion)
                    ), result::set);
```

### OverrideOnly
Method 'getRightPanelTitle(com.intellij.openapi.vfs.VirtualFile, com.intellij.openapi.vcs.history.VcsRevisionNumber)' can only be overridden
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/DialogContentMerger.java`
#### Snippet
```java
                            c.getLeftPanelTitle(localFile),
                            c.getCenterPanelTitle(localFile),
                            c.getRightPanelTitle(localFile, serverVersion)
                    ), result::set);
        } catch (InvalidDiffRequestException e) {
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `loadText()` declared in class 'com.intellij.openapi.vfs.VfsUtilCore' but referenced via subclass 'com.intellij.openapi.vfs.VfsUtil'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
        VirtualFile virtualFile = Objects.requireNonNull(VfsUtil.findFileByIoFile(contentStore.getTmpFile(), true));
        try {
            return VfsUtil.loadText(virtualFile);
        } catch (IOException e) {
            throw new VcsException(e);
```

### StaticCallOnSubclass
Static method `getInstance()` declared in class 'com.intellij.openapi.progress.ProgressManager' but referenced via subclass 'com.intellij.openapi.progress.impl.ProgressManagerImpl'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java
        boolean success;
        try {
            success = ProgressManagerImpl.getInstance().run(new Task.WithResult<Boolean, Exception>(
                    myProject,
                    TfPluginBundle.message(TfPluginBundle.KEY_TFVC_IMPORT_WORKSPACE_TITLE),
```

### StaticCallOnSubclass
Static method `toVirtualFileArray()` declared in class 'com.intellij.openapi.vfs.VfsUtilCore' but referenced via subclass 'com.intellij.openapi.vfs.VfsUtil'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

    public static void refreshAndMarkDirty(final Project project, final Collection<VirtualFile> roots, boolean async) {
        refreshAndMarkDirty(project, VfsUtil.toVirtualFileArray(roots), async);
    }

```

### StaticCallOnSubclass
Static method `isAncestor()` declared in class 'com.intellij.openapi.vfs.VfsUtilCore' but referenced via subclass 'com.intellij.openapi.vfs.VfsUtil'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/RootsCollection.java`
#### Snippet
```java
        @Override
        protected boolean isAncestor(@NotNull VirtualFile parent, @NotNull VirtualFile child) {
            return VfsUtil.isAncestor(parent, child, false);
        }

```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isDialogOnScreen` from instance context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
    protected void dispose() {
        ApplicationManager.getApplication().assertIsDispatchThread();
        isDialogOnScreen = false;
        super.dispose();
    }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `isDialogOnScreen` from instance context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
            }

            isDialogOnScreen = true;
            super.show();
        }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `hasVersionBeenVerified` from instance context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
        }

        hasVersionBeenVerified = true;

        // We want to start a background thread to check the version, but that can only be done
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `repositoryChanging` from instance context
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java
                    } else {
                        try {
                            repositoryChanging = true;
                            logger.info("repository changed");
                            ProjectRepoEventManager.getInstance().triggerServerEvents(EventContextHelper.SENDER_REPO_CHANGED, project, repository);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `repositoryChanging` from instance context
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java
                            ProjectRepoEventManager.getInstance().triggerServerEvents(EventContextHelper.SENDER_REPO_CHANGED, project, repository);
                        } finally {
                            repositoryChanging = false;
                        }
                    }
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (9 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchDialog.java`
#### Snippet
```java
    }

//  @Nullable
//  public VersionSpecBase getFromVersion() {
//    return mergeBranchForm.getFromVersion();
```

### CommentedOutCode
Commented out code (24 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
    }

//  @Nullable
//  public VersionSpecBase getFromVersion() {
//    ChangesType changesType = (ChangesType)changesTypeCombo.getSelectedItem();
```

### CommentedOutCode
Commented out code (9 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        sourceBranchLabel.setLabelFor(sourceText.getChildComponent());

        //myChangesetsTableModel = new ChangesetsTableModel();
        //myChangesetsTable = new JBTable(myChangesetsTableModel);
        //myChangesetsTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
```

### CommentedOutCode
Commented out code (7 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        });

        //myChangesetsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        //  public void valueChanged(final ListSelectionEvent e) {
        //    fireStateChanged();
```

### CommentedOutCode
Commented out code (10 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java

    private boolean canFinish() {
//        ChangesType changesType = (ChangesType) changesTypeCombo.getSelectedItem();
//        if (changesType == ChangesType.SELECTED) {
//            if (myChangesetsTable.getSelectedRowCount() == 0) {
```

### CommentedOutCode
Commented out code (15 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java

    private void updateChangesetsTable() {
//    List<Changeset> changesets = new ArrayList<Changeset>();
//    if (targetCombo.getSelectedIndex() != -1) {
//      try {
```

### CommentedOutCode
Commented out code (3 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
    private final Project project;
    private final ServerContext serverContext;
    //private final SelectRevisionForm mySelectRevisionForm;
    //private final JTable myChangesetsTable;
    //private final ChangesetsTableModel myChangesetsTableModel;
```

### CommentedOutCode
Commented out code (5 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelDialog.java`
#### Snippet
```java
        setOkEnabled(false);

//    getWindow().addComponentListener(new ComponentAdapter() {
//      public void componentShown(final ComponentEvent e) {
//        form.addItems();
```

### CommentedOutCode
Commented out code (14 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/MergeNameForm.java`
#### Snippet
```java
        myCustomPathTextField.setVisible(false);
        myUseCustomRadioButton.setVisible(false);
//    myCustomPathTextField.setText(myYoursPath);
//    myUseCustomRadioButton.addActionListener(new ActionListener() {
//      public void actionPerformed(ActionEvent ae) {
```

### CommentedOutCode
Commented out code (15 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelForm.java`
#### Snippet
```java
        });

//        itemsTable.getColumnModel().getColumn(LabelItemsTableModel.Column.Item.ordinal()).setCellRenderer(new DefaultTableCellRenderer() {
//            @Override
//            public Component getTableCellRendererComponent(final JTable table,
```

### CommentedOutCode
Commented out code (22 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelForm.java`
#### Snippet
```java
    }

//    private void removeItems() {
//        final List<LabelItemSpecWithItems> removalSpecs = new ArrayList<LabelItemSpecWithItems>(itemsTable.getSelectedRows().length);
//        for (int selectedRow : itemsTable.getSelectedRows()) {
```

### CommentedOutCode
Commented out code (5 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java

            // For now we are just branching from the Latest
            //VersionSpecBase version = d.getVersionSpec();
            //if (version == null) {
            //    Messages.showErrorDialog(project, "Incorrect version specified", "Create Branch");
```

### CommentedOutCode
Commented out code (60 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSUpdateEnvironment.java`
#### Snippet
```java
    @Nullable
    public Configurable createConfigurable(final Collection<FilePath> files) {
//    final Map<WorkspaceInfo, UpdateSettingsForm.WorkspaceSettings> workspacesSettings =
//      new HashMap<WorkspaceInfo, UpdateSettingsForm.WorkspaceSettings>();
//    final Ref<TfsException> error = new Ref<TfsException>();
```

### CommentedOutCode
Commented out code (4 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/CreateBranchDialog.java`
#### Snippet
```java
    }

    //@Nullable
    //public VersionSpecBase getVersionSpec() {
    //    return form.getVersionSpec();
```

### CommentedOutCode
Commented out code (25 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSRollbackEnvironment.java`
#### Snippet
```java
                                                RollbackProgressListener listener) {
//TODO: implement once we have server workspace where you can checkout files for edit
//    try {
//      WorkstationHelper.processByWorkspaces(TfsFileUtil.getFilePaths(files), false, project, new WorkstationHelper.VoidProcessDelegate() {
//        public void executeRequest(final WorkspaceInfo workspace, final List<ItemPath> paths) throws TfsException {
```

### CommentedOutCode
Commented out code (21 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    }

//    public static void updateMessage(TFSVcs.CheckinData checkinData) {
//        if (checkinData.parameters == null) {
//            return;
```

### CommentedOutCode
Commented out code (53 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    }

//    // TODO refactor this class
//    private class TFSAdditionalOptionsPanel implements CheckinChangeListSpecificComponent {
//        private final JComponent myPanel;
```

### CommentedOutCode
Commented out code (46 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    public RefreshableOnComponent createAdditionalOptionsPanel(final CheckinProjectPanel checkinProjectPanel,
                                                               PairConsumer<Object, Object> additionalDataConsumer) {
//        boolean isAffected = false;
//        for (File file : checkinProjectPanel.getFiles()) {
//            if (TFSVcs.isUnderTFS(VcsUtil.getFilePath(file), checkinProjectPanel.getProject())) {
```

### CommentedOutCode
Commented out code (4 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSProjectConfigurable.java`
#### Snippet
```java
        form.apply();
        // TODO: move this all to the component apply() method once needed
//    TFSConfigurationManager.getInstance().setUseIdeaHttpProxy(myComponent.useProxy());
//    TFSConfigurationManager.getInstance().setSupportTfsCheckinPolicies(myComponent.supportTfsCheckinPolicies());
//    TFSConfigurationManager.getInstance().setSupportStatefulCheckinPolicies(myComponent.supportStatefulCheckinPolicies());
```

### CommentedOutCode
Commented out code (5 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSProjectConfigurable.java`
#### Snippet
```java
        return form.isModified();
        // TODO: move this all to the component isModified() method once needed
//    if (TFSConfigurationManager.getInstance().useIdeaHttpProxy() != myComponent.useProxy()) return true;
//    TfsCheckinPoliciesCompatibility c = TFSConfigurationManager.getInstance().getCheckinPoliciesCompatibility();
//    if (c.teamExplorer != myComponent.supportTfsCheckinPolicies()) return true;
```

### CommentedOutCode
Commented out code (5 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSProjectConfigurable.java`
#### Snippet
```java
        form.reset();
        // TODO: move this all to the component reset() method once needed
//    myComponent.setUserProxy(TFSConfigurationManager.getInstance().useIdeaHttpProxy());
//    TfsCheckinPoliciesCompatibility c = TFSConfigurationManager.getInstance().getCheckinPoliciesCompatibility();
//    myComponent.setSupportTfsCheckinPolicies(c.teamExplorer);
```

### CommentedOutCode
Commented out code (7 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/MergeNameDialog.java`
#### Snippet
```java

        // TODO comment back in when allowing user input
//        myMergeNameForm.addListener(new MergeNameForm.Listener() {
//            public void selectedPathChanged() {
//                String errorMessage = validate(myMergeNameForm.getSelectedPath());
```

### CommentedOutCode
Commented out code (7 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/MergeNameDialog.java`
#### Snippet
```java

    // TODO comment back in when using user input
//    @Nullable
//    private String validate(String path) {
//        if (path == null || path.length() == 0) {
```

### CommentedOutCode
Commented out code (4 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/CreateBranchForm.java`
#### Snippet
```java
    }

    //@Nullable
    //public VersionSpecBase getVersionSpec() {
    //  return myRevisionForm.getVersionSpec();
```

### CommentedOutCode
Commented out code (26 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java

        // TODO: comment back in when ready to use
//    myManageButton.addActionListener(new ActionListener() {
//      public void actionPerformed(final ActionEvent e) {
//        ManageWorkspacesDialog d = new ManageWorkspacesDialog(myProject);
```

### CommentedOutCode
Commented out code (8 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java
    }

//    private void updateNonInstalledCheckbox() {
//        if (!myStatefulCheckBox.isSelected() && !myTFSCheckBox.isSelected()) {
//            myReportNotInstalledPoliciesCheckBox.setSelected(false);
```

### CommentedOutCode
Commented out code (33 lines)
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java
    }

//    public boolean useProxy() {
//        return myUseIdeaHttpProxyCheckBox.isSelected();
//    }
```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
    private void populateContextTable() {
        final List<ServerContext> serverContexts = new ArrayList<ServerContext>(ServerContextManager.getInstance().getAllServerContexts());
        final Hashtable contextTable = new Hashtable<String, ServerContext>(serverContexts.size());
        for (final ServerContext context : serverContexts) {
            final String repoName;
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
    private void populateContextTable() {
        final List<ServerContext> serverContexts = new ArrayList<ServerContext>(ServerContextManager.getInstance().getAllServerContexts());
        final Hashtable contextTable = new Hashtable<String, ServerContext>(serverContexts.size());
        for (final ServerContext context : serverContexts) {
            final String repoName;
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `locationEntries.keySet()` may be replaced with 'entrySet()' iteration
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
                // rewrite file with new entry
                bufferedWriter = new BufferedWriter(new FileWriter(locationsFile.getPath()));
                for (String key : locationEntries.keySet()) {
                    bufferedWriter.write(key + CSV_COMMA + locationEntries.get(key) + "\n");
                }
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java
    private void UpdateVersionControlSystem(final Project project, String parentDirectory, String directoryName, final VirtualFile destinationParent, CheckoutProvider.Listener listener) {
        // Add our new directory to IntelliJ's project
        DvcsUtil.addMappingIfSubRoot(project, FileUtil.join(new String[]{parentDirectory, directoryName}), TFSVcs.TFVC_NAME);

        // Check the folder for any dirty files
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                        final File projectDirectory = new File(parentDirectory, directoryName);

                        DvcsUtil.addMappingIfSubRoot(project, FileUtil.join(new String[]{parentDirectory, directoryName}), "Git");
                        destinationParent.refresh(true, true, new Runnable() {
                            public void run() {
```

## RuleId[ruleID=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ContentTriplet.java`
#### Snippet
```java
    @NotNull
    public String serverContent;
    @NotNull
    public String localContent;
}
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ContentTriplet.java`
#### Snippet
```java
    @NotNull
    public String baseContent;
    @NotNull
    public String serverContent;
    @NotNull
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ContentTriplet.java`
#### Snippet
```java

public class ContentTriplet {
    @NotNull
    public String baseContent;
    @NotNull
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    private int previousChangeSetId;
    private String previousChangeSetDate;
    private @NotNull
    String comment;
    private String workspaceName;
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
                return TfPluginBundle.message(TfPluginBundle.KEY_SERVER_CONTEXT_TABLE_ACCOUNT_COLUMN);
            case GENERAL_REPOSITORY:
                return TfPluginBundle.message(TfPluginBundle.KEY_SERVER_CONTEXT_TABLE_REPO_COLUMN);
            case USER_NAME:
                return TfPluginBundle.message(TfPluginBundle.KEY_SETTINGS_PASSWORD_MGT_USER_NAME);
```

## RuleId[ruleID=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @return Stripped {@link StringBuilder} (may be empty)
     */
    private final static StringBuilder cleanupComponent(final StringBuilder s) {
        while (s.length() > 0
                && (s.charAt(s.length() - 1) == '.' || Character.isWhitespace(s.charAt(s.length() - 1)))) {
```

## RuleId[ruleID=KotlinAnnotator]
### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun undoLocalChangesAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.undoLocalChanges.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun undoLocalChangesAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.undoLocalChanges.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun undoLocalChangesAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.undoLocalChanges.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsModel
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    )

    lateinit var model: TfsModel

    val port
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun getBasicWorkspaceInfoAsync(workspacePath: TfsLocalPath): CompletionStage<TfsWorkspaceInfo?> =
        queueFutureAsync { lt ->
            model.getBasicWorkspaceInfo.start(workspacePath).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsWorkspaceInfo
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun getBasicWorkspaceInfoAsync(workspacePath: TfsLocalPath): CompletionStage<TfsWorkspaceInfo?> =
        queueFutureAsync { lt ->
            model.getBasicWorkspaceInfo.start(workspacePath).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: model
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
import com.jetbrains.rd.util.reactive.adviseOnce
import com.jetbrains.rd.util.reactive.whenTrue
import com.microsoft.tfs.model.connector.*
import java.util.concurrent.CancellationException
import java.util.concurrent.CompletableFuture
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun invalidatePathsAsync(collection: TfsCollection, paths: List<TfsLocalPath>): CompletionStage<Void> =
        queueFutureAsync { lt ->
            collection.invalidatePaths.start(paths).pipeToVoid(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun invalidatePathsAsync(collection: TfsCollection, paths: List<TfsLocalPath>): CompletionStage<Void> =
        queueFutureAsync { lt ->
            collection.invalidatePaths.start(paths).pipeToVoid(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun renameFileAsync(
        collection: TfsCollection,
        oldPath: TfsLocalPath,
        newPath: TfsLocalPath
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun renameFileAsync(
        collection: TfsCollection,
        oldPath: TfsLocalPath,
        newPath: TfsLocalPath
    ): CompletionStage<Boolean> =
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        collection: TfsCollection,
        oldPath: TfsLocalPath,
        newPath: TfsLocalPath
    ): CompletionStage<Boolean> =
        queueFutureAsync { lt ->
```

### KotlinAnnotator
Unresolved reference: TfvcRenameRequest
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    ): CompletionStage<Boolean> =
        queueFutureAsync { lt ->
            collection.renameFile.start(TfvcRenameRequest(oldPath, newPath)).pipeTo(lt, this)
        }

```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun deleteFilesRecursivelyAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<TfsDeleteResult> =
        queueFutureAsync { lt ->
            collection.deleteFilesRecursively.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun deleteFilesRecursivelyAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<TfsDeleteResult> =
        queueFutureAsync { lt ->
            collection.deleteFilesRecursively.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsDeleteResult
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun deleteFilesRecursivelyAsync(collection: TfsCollection, paths: List<TfsPath>): CompletionStage<TfsDeleteResult> =
        queueFutureAsync { lt ->
            collection.deleteFilesRecursively.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun getExtendedItemsInfoAsync(
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsExtendedItemInfo>> =
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getExtendedItemsInfoAsync(
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsExtendedItemInfo>> =
        queueFutureAsync { lt ->
```

### KotlinAnnotator
Unresolved reference: TfsExtendedItemInfo
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsExtendedItemInfo>> =
        queueFutureAsync { lt ->
            collection.getExtendedLocalItemsInfo.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun addFilesAsync(collection: TfsCollection, files: List<TfsLocalPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.addFiles.start(files).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun addFilesAsync(collection: TfsCollection, files: List<TfsLocalPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.addFiles.start(files).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun addFilesAsync(collection: TfsCollection, files: List<TfsLocalPath>): CompletionStage<List<TfsLocalPath>> =
        queueFutureAsync { lt ->
            collection.addFiles.start(files).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsCollectionDefinition
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun getOrCreateCollectionAsync(definition: TfsCollectionDefinition): CompletionStage<TfsCollection> =
        queueFutureAsync {
            complete(model.collections[definition] ?: TfsCollection().apply { model.collections[definition] = this })
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun getOrCreateCollectionAsync(definition: TfsCollectionDefinition): CompletionStage<TfsCollection> =
        queueFutureAsync {
            complete(model.collections[definition] ?: TfsCollection().apply { model.collections[definition] = this })
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getOrCreateCollectionAsync(definition: TfsCollectionDefinition): CompletionStage<TfsCollection> =
        queueFutureAsync {
            complete(model.collections[definition] ?: TfsCollection().apply { model.collections[definition] = this })
        }

```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun checkoutFilesForEditAsync(
        collection: TfsCollection,
        filePaths: List<TfsLocalPath>,
        recursive: Boolean
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun checkoutFilesForEditAsync(
        collection: TfsCollection,
        filePaths: List<TfsLocalPath>,
        recursive: Boolean
    ): CompletionStage<TfvcCheckoutResult> =
```

### KotlinAnnotator
Unresolved reference: TfvcCheckoutResult
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        filePaths: List<TfsLocalPath>,
        recursive: Boolean
    ): CompletionStage<TfvcCheckoutResult> =
        queueFutureAsync { lt ->
            collection.checkoutFilesForEdit.start(TfvcCheckoutParameters(filePaths, recursive)).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfvcCheckoutParameters
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    ): CompletionStage<TfvcCheckoutResult> =
        queueFutureAsync { lt ->
            collection.checkoutFilesForEdit.start(TfvcCheckoutParameters(filePaths, recursive)).pipeTo(lt, this)
        }

```

### KotlinAnnotator
Unresolved reference: TfsCredentials
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun getDetailedWorkspaceInfoAsync(
        credentials: TfsCredentials,
        workspacePath: TfsLocalPath
    ): CompletionStage<TfsDetailedWorkspaceInfo?> =
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getDetailedWorkspaceInfoAsync(
        credentials: TfsCredentials,
        workspacePath: TfsLocalPath
    ): CompletionStage<TfsDetailedWorkspaceInfo?> =
        queueFutureAsync { lt ->
```

### KotlinAnnotator
Unresolved reference: TfsDetailedWorkspaceInfo
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        credentials: TfsCredentials,
        workspacePath: TfsLocalPath
    ): CompletionStage<TfsDetailedWorkspaceInfo?> =
        queueFutureAsync { lt ->
            model.getDetailedWorkspaceInfo.start(TfsDetailedWorkspaceRequest(credentials, workspacePath))
```

### KotlinAnnotator
Unresolved reference: TfsDetailedWorkspaceRequest
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    ): CompletionStage<TfsDetailedWorkspaceInfo?> =
        queueFutureAsync { lt ->
            model.getDetailedWorkspaceInfo.start(TfsDetailedWorkspaceRequest(credentials, workspacePath))
                .pipeTo(lt, this)
        }
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun getPendingChangesAsync(
        collection: TfsCollection,
        paths: List<TfsPath>): CompletionStage<List<TfsPendingChange>> =
        queueFutureAsync { lt ->
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getPendingChangesAsync(
        collection: TfsCollection,
        paths: List<TfsPath>): CompletionStage<List<TfsPendingChange>> =
        queueFutureAsync { lt ->
            collection.getPendingChanges.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsPendingChange
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getPendingChangesAsync(
        collection: TfsCollection,
        paths: List<TfsPath>): CompletionStage<List<TfsPendingChange>> =
        queueFutureAsync { lt ->
            collection.getPendingChanges.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: TfsModel
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun startAsync(): CompletionStage<Void> =
        queueFutureAsync { lt ->
            model = TfsModel.create(lifetime, protocol).apply {
                connected.whenTrue(lt) {
                    complete(null)
```

### KotlinAnnotator
Unresolved reference: connected
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        queueFutureAsync { lt ->
            model = TfsModel.create(lifetime, protocol).apply {
                connected.whenTrue(lt) {
                    complete(null)
                }
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        }

    fun waitForReadyAsync(collection: TfsCollection): CompletionStage<Void> =
        queueFutureAsync {
            collection.isReady.whenTrue(lifetime) { complete(null) }
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java

    fun getLocalItemsInfoAsync(
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsItemInfo>> =
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    fun getLocalItemsInfoAsync(
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsItemInfo>> =
        queueFutureAsync { lt ->
```

### KotlinAnnotator
Unresolved reference: TfsItemInfo
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
        collection: TfsCollection,
        paths: List<TfsLocalPath>
    ): CompletionStage<List<TfsItemInfo>> =
        queueFutureAsync { lt ->
            collection.getLocalItemsInfo.start(paths).pipeTo(lt, this)
```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
    else -> throw Exception("Unknown path type: $path")
```

### KotlinAnnotator
Unresolved reference: TfsServerPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
    else -> throw Exception("Unknown path type: $path")
}
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
package com.microsoft.tfs.sdk

import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java

import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath

```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
import com.jetbrains.rd.util.lifetime.Lifetime
import com.jetbrains.rd.util.reactive.Signal
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherFactory
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
import com.jetbrains.rd.util.reactive.Signal
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherFactory
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
import java.nio.file.Path
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherFactory
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
import java.nio.file.Path
import java.nio.file.Paths
```

### KotlinAnnotator
'newPathWatcher' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
class ExternallyControlledPathWatcherFactory(private val lifetime: Lifetime) : PathWatcherFactory {
    val pathsInvalidated = Signal<List<Path>>()
    override fun newPathWatcher(path: String, watcher: WorkspaceWatcher): PathWatcher =
        ExternallyControlledPathWatcher(lifetime, pathsInvalidated, watcher, Paths.get(path))
}
```

### KotlinAnnotator
Unresolved reference: WorkspaceWatcher
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
class ExternallyControlledPathWatcherFactory(private val lifetime: Lifetime) : PathWatcherFactory {
    val pathsInvalidated = Signal<List<Path>>()
    override fun newPathWatcher(path: String, watcher: WorkspaceWatcher): PathWatcher =
        ExternallyControlledPathWatcher(lifetime, pathsInvalidated, watcher, Paths.get(path))
}
```

### KotlinAnnotator
Unresolved reference: PathWatcher
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
class ExternallyControlledPathWatcherFactory(private val lifetime: Lifetime) : PathWatcherFactory {
    val pathsInvalidated = Signal<List<Path>>()
    override fun newPathWatcher(path: String, watcher: WorkspaceWatcher): PathWatcher =
        ExternallyControlledPathWatcher(lifetime, pathsInvalidated, watcher, Paths.get(path))
}
```

### KotlinAnnotator
Unresolved reference: PathWatcherFactory
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcherFactory.kt`
#### Snippet
```java
import java.nio.file.Paths

class ExternallyControlledPathWatcherFactory(private val lifetime: Lifetime) : PathWatcherFactory {
    val pathsInvalidated = Signal<List<Path>>()
    override fun newPathWatcher(path: String, watcher: WorkspaceWatcher): PathWatcher =
```

### KotlinAnnotator
Unresolved reference: TfsModel
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    val protocol = Protocol(Serializers(), Identities(IdKind.Client), scheduler, socket, appLifetime)
    scheduler.queue {
        val model = TfsModel.create(appLifetime, protocol)
        model.shutdown.advise(appLifetime) {
            logger.info { "Shutting down per request" }
```

### KotlinAnnotator
Unresolved reference: TfsCollectionDefinition
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
}

private fun initializeCollection(lifetime: Lifetime, definition: TfsCollectionDefinition, collection: TfsCollection) {
    val logger = Logging.getLogger("Collection")
    logger.info { "Initializing collection for ${definition.serverUri}" }
```

### KotlinAnnotator
Unresolved reference: TfsCollection
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
}

private fun initializeCollection(lifetime: Lifetime, definition: TfsCollectionDefinition, collection: TfsCollection) {
    val logger = Logging.getLogger("Collection")
    logger.info { "Initializing collection for ${definition.serverUri}" }
```

### KotlinAnnotator
Unresolved reference: UsernamePasswordCredentials
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    logger.info { "Initializing collection for ${definition.serverUri}" }

    val credentials = definition.credentials.run { UsernamePasswordCredentials(login, password.contents) }
    val client = TfsClient(lifetime, definition.serverUri, credentials)

```

### KotlinAnnotator
Unresolved reference: login
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    logger.info { "Initializing collection for ${definition.serverUri}" }

    val credentials = definition.credentials.run { UsernamePasswordCredentials(login, password.contents) }
    val client = TfsClient(lifetime, definition.serverUri, credentials)

```

### KotlinAnnotator
Unresolved reference: password
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    logger.info { "Initializing collection for ${definition.serverUri}" }

    val credentials = definition.credentials.run { UsernamePasswordCredentials(login, password.contents) }
    val client = TfsClient(lifetime, definition.serverUri, credentials)

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    val client = TfsClient(lifetime, definition.serverUri, credentials)

    collection.getPendingChanges.set { paths ->
        logger.info { "Calculating pending changes for ${paths.size} paths" }
        val result = client.status(paths).flatMap(::toPendingChanges).toList()
```

### KotlinAnnotator
None of the following functions can be called with the arguments supplied: public inline fun Iterable.flatMap(transform: (TypeVariable(T)) -\> Iterable): List defined in kotlin.collections public inline fun Iterable.flatMap(transform: (TypeVariable(T)) -\> Sequence): List defined in kotlin.collections
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    collection.getPendingChanges.set { paths ->
        logger.info { "Calculating pending changes for ${paths.size} paths" }
        val result = client.status(paths).flatMap(::toPendingChanges).toList()
        logger.info { "${result.size} changes detected" }
        logger.info { "First 10 changes: " + result.take(10).joinToString { it.serverItem } }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
        val result = client.status(paths).flatMap(::toPendingChanges).toList()
        logger.info { "${result.size} changes detected" }
        logger.info { "First 10 changes: " + result.take(10).joinToString { it.serverItem } }
        result
    }
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    fun logPaths(title: String, paths: List<TfsPath>) {
        logger.info { "Performing $title operation on ${paths.size} paths, first 10: ${paths.take(10).joinToString()}" }
    }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.getLocalItemsInfo.set { paths ->
        if (paths.isEmpty()) return@set emptyList()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.getExtendedLocalItemsInfo.set { paths ->
        if (paths.isEmpty()) return@set emptyList()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.invalidatePaths.set { paths ->
        if (paths.isEmpty()) return@set

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.addFiles.set { paths ->
        if (paths.isEmpty()) return@set emptyList()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.deleteFilesRecursively.set { paths ->
        if (paths.isEmpty()) return@set TfsDeleteResult(emptyList(), emptyList(), emptyList())

```

### KotlinAnnotator
Unresolved reference: TfsDeleteResult
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java

    collection.deleteFilesRecursively.set { paths ->
        if (paths.isEmpty()) return@set TfsDeleteResult(emptyList(), emptyList(), emptyList())

        logPaths("Recursive Delete", paths)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.undoLocalChanges.set { paths ->
        if (paths.isEmpty()) return@set emptyList()

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.checkoutFilesForEdit.set { parameters ->
        logPaths("Checkout (recursive: ${parameters.recursive})", parameters.filePaths)
        client.checkoutFilesForEdit(parameters.filePaths, parameters.recursive)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    collection.renameFile.set { (oldPath, newPath) ->
        logger.info { "Performing Rename operation on \"${oldPath.path}\" to \"${newPath.path}\"" }
        client.renameFile(oldPath, newPath)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    }

    client.workspaces.advise(lifetime) { workspaces ->
        val paths = workspaces.flatMap { it.mappedPaths.map(::TfsLocalPath) }
        collection.mappedPaths.set(paths)
```

### KotlinAnnotator
None of the following functions can be called with the arguments supplied: public inline fun Iterable.flatMap(transform: (TypeVariable(T)) -\> Iterable): List defined in kotlin.collections public inline fun Iterable.flatMap(transform: (TypeVariable(T)) -\> Sequence): List defined in kotlin.collections
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java

    client.workspaces.advise(lifetime) { workspaces ->
        val paths = workspaces.flatMap { it.mappedPaths.map(::TfsLocalPath) }
        collection.mappedPaths.set(paths)
    }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java

    client.workspaces.advise(lifetime) { workspaces ->
        val paths = workspaces.flatMap { it.mappedPaths.map(::TfsLocalPath) }
        collection.mappedPaths.set(paths)
    }
```

### KotlinAnnotator
Unresolved reference: Level
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    Locale.setDefault(Locale.US)
    val logDirectory = if (args.size > 1) Paths.get(args[1]) else null
    val logLevel = if (args.size > 2) Level.toLevel(args[2]) else Level.INFO
    Logging.initialize(logDirectory, logLevel)
}
```

### KotlinAnnotator
Unresolved reference: Level
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
    Locale.setDefault(Locale.US)
    val logDirectory = if (args.size > 1) Paths.get(args[1]) else null
    val logLevel = if (args.size > 2) Level.toLevel(args[2]) else Level.INFO
    Logging.initialize(logDirectory, logLevel)
}
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
import com.jetbrains.rd.util.lifetime.isAlive
import com.jetbrains.rd.util.threading.SingleThreadScheduler
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
import org.apache.log4j.Level
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
import com.jetbrains.rd.util.threading.SingleThreadScheduler
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
import org.apache.log4j.Level
import java.nio.file.Paths
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
import org.apache.log4j.Level
import java.nio.file.Paths
import java.util.*
```

### KotlinAnnotator
Unresolved reference: TfsModel
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
}

private fun initializeModel(lifetime: Lifetime, model: TfsModel) {
    val logger = Logging.getLogger("Workspace")

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java

    model.collections.view(lifetime, ::initializeCollection)
    model.getBasicWorkspaceInfo.set { workspacePath ->
        logger.info { "Searching basic workspace info for path \"$workspacePath\"." }
        val result = TfsClient.getBasicWorkspaceInfo(workspacePath)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/Main.kt`
#### Snippet
```java
        result
    }
    model.getDetailedWorkspaceInfo.set { request ->
        logger.info { "Searching detailed workspace info for path \"${request.workspacePath}\"." }
        val result = TfsClient.getDetailedWorkspaceInfo(request.workspacePath, request.credentials)
```

### KotlinAnnotator
Unresolved reference: VersionControlEventEngine
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
}

fun VersionControlEventEngine.withNewPendingChangeListener(
    listener: NewPendingChangeListener,
    action: () -> Unit) {
```

### KotlinAnnotator
Unresolved reference: NewPendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java

fun VersionControlEventEngine.withNewPendingChangeListener(
    listener: NewPendingChangeListener,
    action: () -> Unit) {
    addNewPendingChangeListener(listener)
```

### KotlinAnnotator
Unresolved reference: VersionControlEventEngine
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java


fun VersionControlEventEngine.withNonFatalErrorListener(
    listener: NonFatalErrorListener,
    action: () -> Unit) {
```

### KotlinAnnotator
Unresolved reference: NonFatalErrorListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java

fun VersionControlEventEngine.withNonFatalErrorListener(
    listener: NonFatalErrorListener,
    action: () -> Unit) {
    addNonFatalErrorListener(listener)
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
package com.microsoft.tfs.sdk

import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java

import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine

```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine

fun VersionControlEventEngine.withUndonePendingChangeListener(
```

### KotlinAnnotator
Unresolved reference: VersionControlEventEngine
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine

fun VersionControlEventEngine.withUndonePendingChangeListener(
    listener: UndonePendingChangeListener,
    action: () -> Unit) {
```

### KotlinAnnotator
Unresolved reference: UndonePendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java

fun VersionControlEventEngine.withUndonePendingChangeListener(
    listener: UndonePendingChangeListener,
    action: () -> Unit) {
    addUndonePendingChangeListener(listener)
```

### KotlinAnnotator
'hasChanged' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    override fun getPath(): String = pathToWatch.toString()

    override fun hasChanged(): Boolean = synchronized(lock) {
        changedPaths.size > 0
    }
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
import com.jetbrains.rd.util.trace
import com.microsoft.tfs.Logging
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherReport
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
import com.microsoft.tfs.Logging
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherReport
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
import java.nio.file.Path
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcher
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.PathWatcherReport
import com.microsoft.tfs.core.clients.versioncontrol.localworkspace.WorkspaceWatcher
import java.nio.file.Path

```

### KotlinAnnotator
'getPath' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    private var currentSessionLifetime = LifetimeDefinition.Terminated

    override fun getPath(): String = pathToWatch.toString()

    override fun hasChanged(): Boolean = synchronized(lock) {
```

### KotlinAnnotator
Unresolved reference: WorkspaceWatcher
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    parentLifetime: Lifetime,
    private val pathsInvalidated: Signal<List<Path>>,
    private val workspaceWatcher: WorkspaceWatcher,
    private val pathToWatch: Path
) : PathWatcher {
```

### KotlinAnnotator
'startWatching' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    }

    override fun startWatching() {
        currentSessionLifetime = sessionLifetimes.next()
        pathsInvalidated.advise(currentSessionLifetime, ::invalidatePaths)
```

### KotlinAnnotator
'setClean' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    }

    override fun setClean() {
        synchronized(lock) {
            isFullyInvalidated = false
```

### KotlinAnnotator
'isWatching' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    }

    override fun isWatching(): Boolean = currentSessionLifetime.isAlive

    override fun poll(): PathWatcherReport {
```

### KotlinAnnotator
'stopWatching' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    }

    override fun stopWatching() {
        currentSessionLifetime.terminate()
    }
```

### KotlinAnnotator
'poll' overrides nothing
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    override fun isWatching(): Boolean = currentSessionLifetime.isAlive

    override fun poll(): PathWatcherReport {
        val fullyInvalidated: Boolean
        val changes: List<Path>
```

### KotlinAnnotator
Unresolved reference: PathWatcherReport
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    override fun isWatching(): Boolean = currentSessionLifetime.isAlive

    override fun poll(): PathWatcherReport {
        val fullyInvalidated: Boolean
        val changes: List<Path>
```

### KotlinAnnotator
Unresolved reference: PathWatcherReport
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
        }

        return PathWatcherReport(false).apply {
            if (fullyInvalidated) {
                fullyInvalidate()
```

### KotlinAnnotator
Unresolved reference: fullyInvalidate
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
        return PathWatcherReport(false).apply {
            if (fullyInvalidated) {
                fullyInvalidate()
            } else {
                for (changedPath in changes) {
```

### KotlinAnnotator
Unresolved reference: addChangedPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
            } else {
                for (changedPath in changes) {
                    addChangedPath(changedPath.toString())
                }
            }
```

### KotlinAnnotator
Unresolved reference: fullyInvalidated
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java

            logger.trace {
                "Returning PathWatcherReport (fullyInvalidated = ${this.fullyInvalidated}, nothingChanged = $isNothingChanged) with paths:\n" +
                        changedPaths.joinToString("\n")
            }
```

### KotlinAnnotator
Unresolved reference: isNothingChanged
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java

            logger.trace {
                "Returning PathWatcherReport (fullyInvalidated = ${this.fullyInvalidated}, nothingChanged = $isNothingChanged) with paths:\n" +
                        changedPaths.joinToString("\n")
            }
```

### KotlinAnnotator
Unresolved reference: PathWatcher
in `client/backend/src/main/kotlin/com/microsoft/tfs/watcher/ExternallyControlledPathWatcher.kt`
#### Snippet
```java
    private val workspaceWatcher: WorkspaceWatcher,
    private val pathToWatch: Path
) : PathWatcher {

    companion object {
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = if (itemType == ItemType.FILE) encodingName else null

private val ExtendedItem.lockStatus
    get() = lockLevel.toUIString()

```

### KotlinAnnotator
Not enough information to infer type variable K
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
private val isoDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

private val pendingChangeTypeMap = mapOf(
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

private val pendingChangeTypeMap = mapOf(
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

private val pendingChangeTypeMap = mapOf(
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
private val pendingChangeTypeMap = mapOf(
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
private val pendingChangeTypeMap = mapOf(
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ADD to TfsServerStatusType.ADD,
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.EDIT to TfsServerStatusType.EDIT,
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ENCODING to TfsServerStatusType.UNKNOWN,
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.RENAME to TfsServerStatusType.RENAME,
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.DELETE to TfsServerStatusType.DELETE,
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.UNDELETE to TfsServerStatusType.UNDELETE,
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.BRANCH to TfsServerStatusType.BRANCH,
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.MERGE to TfsServerStatusType.MERGE,
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.LOCK to TfsServerStatusType.LOCK,
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
)
```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.ROLLBACK to TfsServerStatusType.UNKNOWN,
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
)
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
)

```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ChangeType.SOURCE_RENAME to TfsServerStatusType.RENAME,
    ChangeType.TARGET_RENAME to TfsServerStatusType.UNKNOWN,
    ChangeType.PROPERTY to TfsServerStatusType.EDIT
)

```

### KotlinAnnotator
Unresolved reference: PendingSet
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
)

fun toPendingChanges(pendingSet: PendingSet): Iterable<TfsPendingChange> =
    (pendingSet.pendingChanges.asSequence().map { toPendingChange(pendingSet, it) }
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()
```

### KotlinAnnotator
Unresolved reference: TfsPendingChange
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
)

fun toPendingChanges(pendingSet: PendingSet): Iterable<TfsPendingChange> =
    (pendingSet.pendingChanges.asSequence().map { toPendingChange(pendingSet, it) }
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

fun toPendingChanges(pendingSet: PendingSet): Iterable<TfsPendingChange> =
    (pendingSet.pendingChanges.asSequence().map { toPendingChange(pendingSet, it) }
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()

```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
fun toPendingChanges(pendingSet: PendingSet): Iterable<TfsPendingChange> =
    (pendingSet.pendingChanges.asSequence().map { toPendingChange(pendingSet, it) }
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()

fun TfsPath.toCanonicalPathString(): String = when (this) {
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    )

fun ExtendedItem.toExtendedItemInfo(): TfsExtendedItemInfo =
    TfsExtendedItemInfo(
        lockStatus,
```

### KotlinAnnotator
Unresolved reference: TfsExtendedItemInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    )

fun ExtendedItem.toExtendedItemInfo(): TfsExtendedItemInfo =
    TfsExtendedItemInfo(
        lockStatus,
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else encoding?.name

private val ExtendedItem.fileEncodingName
    get() = if (itemType == ItemType.FILE) encodingName else null

```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else pendingChange.toUIString(false, this)

private val ExtendedItem.itemTypeName
    get() = itemType.toUIString()

```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
package com.microsoft.tfs

import com.microsoft.tfs.core.clients.versioncontrol.VersionControlConstants
import com.microsoft.tfs.core.clients.versioncontrol.path.LocalPath
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

import com.microsoft.tfs.core.clients.versioncontrol.VersionControlConstants
import com.microsoft.tfs.core.clients.versioncontrol.path.LocalPath
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.VersionControlConstants
import com.microsoft.tfs.core.clients.versioncontrol.path.LocalPath
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.util.FileEncoding
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.path.LocalPath
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.util.FileEncoding
import com.microsoft.tfs.model.host.*
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.util.FileEncoding
import com.microsoft.tfs.model.host.*
import java.text.SimpleDateFormat
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.util.FileEncoding
import com.microsoft.tfs.model.host.*
import java.text.SimpleDateFormat

```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = checkinDate?.time?.let(isoDateFormat::format)

private val ExtendedItem.encodingName
    get() =
        if (encoding == FileEncoding(VersionControlConstants.ENCODING_UNCHANGED)) null
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
)

private fun toChangeTypes(changeType: ChangeType): List<TfsServerStatusType> =
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

```

### KotlinAnnotator
Unresolved reference: TfsServerStatusType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
)

private fun toChangeTypes(changeType: ChangeType): List<TfsServerStatusType> =
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

private fun toChangeTypes(changeType: ChangeType): List<TfsServerStatusType> =
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

private fun toPendingChange(pendingSet: PendingSet, pc: PendingChange) = TfsPendingChange(
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = itemType.toUIString()

private val ExtendedItem.checkinDateString
    get() = checkinDate?.time?.let(isoDateFormat::format)

```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()

fun TfsPath.toCanonicalPathString(): String = when (this) {
    is TfsLocalPath -> LocalPath.canonicalize(path)
    is TfsServerPath -> path
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java

fun TfsPath.toCanonicalPathString(): String = when (this) {
    is TfsLocalPath -> LocalPath.canonicalize(path)
    is TfsServerPath -> path
    else -> throw Exception("Unknown path type: $this")
```

### KotlinAnnotator
Unresolved reference: TfsServerPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
fun TfsPath.toCanonicalPathString(): String = when (this) {
    is TfsLocalPath -> LocalPath.canonicalize(path)
    is TfsServerPath -> path
    else -> throw Exception("Unknown path type: $this")
}
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = lockLevel.toUIString()

fun ExtendedItem.toLocalItemInfo(): TfsLocalItemInfo =
    TfsLocalItemInfo(
        targetServerItem,
```

### KotlinAnnotator
Unresolved reference: TfsLocalItemInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = lockLevel.toUIString()

fun ExtendedItem.toLocalItemInfo(): TfsLocalItemInfo =
    TfsLocalItemInfo(
        targetServerItem,
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

```

### KotlinAnnotator
Unresolved reference: ItemSpec
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ItemSpec(toCanonicalPathString(), recursionType)

private val ExtendedItem.changeTypeName
    get() =
        if (pendingChange == ChangeType.NONE) "none"
```

### KotlinAnnotator
Unresolved reference: PendingSet
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

private fun toPendingChange(pendingSet: PendingSet, pc: PendingChange) = TfsPendingChange(
    pc.serverItem,
    pc.localItem,
```

### KotlinAnnotator
Unresolved reference: PendingChange
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

private fun toPendingChange(pendingSet: PendingSet, pc: PendingChange) = TfsPendingChange(
    pc.serverItem,
    pc.localItem,
```

### KotlinAnnotator
Unresolved reference: TfsPendingChange
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    pendingChangeTypeMap.entries.mapNotNull { (k, v) -> if (changeType.contains(k)) v else null }

private fun toPendingChange(pendingSet: PendingSet, pc: PendingChange) = TfsPendingChange(
    pc.serverItem,
    pc.localItem,
```

### KotlinAnnotator
Unresolved reference: TFSTeamProjectCollection
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    private val pathWatcherFactory = ExternallyControlledPathWatcherFactory(lifetime)
    init {
        val collection = TFSTeamProjectCollection(serverUri, credentials)
        lifetime.onTermination { collection.close() }

```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        client = collection.versionControlClient.also {
            it.pathWatcherFactory = pathWatcherFactory
            it.eventEngine.addNonFatalErrorListener { event ->
                logger.warn { event.message }
```

### KotlinAnnotator
Variable expected
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        client = collection.versionControlClient.also {
            it.pathWatcherFactory = pathWatcherFactory
            it.eventEngine.addNonFatalErrorListener { event ->
                logger.warn { event.message }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        client = collection.versionControlClient.also {
            it.pathWatcherFactory = pathWatcherFactory
            it.eventEngine.addNonFatalErrorListener { event ->
                logger.warn { event.message }
            }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        client = collection.versionControlClient.also {
            it.pathWatcherFactory = pathWatcherFactory
            it.eventEngine.addNonFatalErrorListener { event ->
                logger.warn { event.message }
            }
```

### KotlinAnnotator
Unresolved reference: VersionControlClient
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    val client: VersionControlClient
    private val pathWatcherFactory = ExternallyControlledPathWatcherFactory(lifetime)
    init {
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        fun getDetailedWorkspaceInfo(path: TfsLocalPath, credentials: TfsCredentials): TfsDetailedWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val mappings = loadMappings(
```

### KotlinAnnotator
Unresolved reference: TfsCredentials
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        fun getDetailedWorkspaceInfo(path: TfsLocalPath, credentials: TfsCredentials): TfsDetailedWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val mappings = loadMappings(
```

### KotlinAnnotator
Unresolved reference: TfsDetailedWorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        fun getDetailedWorkspaceInfo(path: TfsLocalPath, credentials: TfsCredentials): TfsDetailedWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val mappings = loadMappings(
```

### KotlinAnnotator
Unresolved reference: UsernamePasswordCredentials
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val mappings = loadMappings(
                workspaceInfo,
                UsernamePasswordCredentials(credentials.login, credentials.password.contents))

            return TfsDetailedWorkspaceInfo(
```

### KotlinAnnotator
Unresolved reference: TfsDetailedWorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                UsernamePasswordCredentials(credentials.login, credentials.password.contents))

            return TfsDetailedWorkspaceInfo(
                mappings,
                workspaceInfo.serverURI?.toString().orEmpty(),
```

### KotlinAnnotator
Unresolved reference: serverURI
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            return TfsDetailedWorkspaceInfo(
                mappings,
                workspaceInfo.serverURI?.toString().orEmpty(),
                workspaceInfo.name.orEmpty())
        }
```

### KotlinAnnotator
Unresolved reference: name
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                mappings,
                workspaceInfo.serverURI?.toString().orEmpty(),
                workspaceInfo.name.orEmpty())
        }
    }
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun status(paths: List<TfsPath>): List<PendingSet> {
        val results = mutableListOf<PendingSet>()
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
```

### KotlinAnnotator
Unresolved reference: PendingSet
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun status(paths: List<TfsPath>): List<PendingSet> {
        val results = mutableListOf<PendingSet>()
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
```

### KotlinAnnotator
Unresolved reference: PendingSet
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun status(paths: List<TfsPath>): List<PendingSet> {
        val results = mutableListOf<PendingSet>()
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            val workspaceName = workspace.name
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun status(paths: List<TfsPath>): List<PendingSet> {
        val results = mutableListOf<PendingSet>()
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            val workspaceName = workspace.name
            val workspaceOwner = workspace.ownerName
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun status(paths: List<TfsPath>): List<PendingSet> {
        val results = mutableListOf<PendingSet>()
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            val workspaceName = workspace.name
            val workspaceOwner = workspace.ownerName
```

### KotlinAnnotator
Unresolved reference: ItemSpec
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val workspaceOwner = workspace.ownerName

            val itemSpecs = ItemSpec.fromStrings(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
                RecursionType.FULL
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val itemSpecs = ItemSpec.fromStrings(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
                RecursionType.FULL
            )
            val pendingSets = client.queryPendingSets(itemSpecs, false, workspaceName, workspaceOwner, true)
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun getExtendedLocalItemsInfo(paths: List<TfsLocalPath>): List<TfsExtendedItemInfo> =
        getLocalItemsInfo(paths, true) {
            it.toExtendedItemInfo()
```

### KotlinAnnotator
Unresolved reference: TfsExtendedItemInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun getExtendedLocalItemsInfo(paths: List<TfsLocalPath>): List<TfsExtendedItemInfo> =
        getLocalItemsInfo(paths, true) {
            it.toExtendedItemInfo()
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.jetbrains.rd.util.reactive.Property
import com.jetbrains.rd.util.warn
import com.microsoft.tfs.core.TFSTeamProjectCollection
import com.microsoft.tfs.core.clients.versioncontrol.*
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.jetbrains.rd.util.warn
import com.microsoft.tfs.core.TFSTeamProjectCollection
import com.microsoft.tfs.core.clients.versioncontrol.*
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.TFSTeamProjectCollection
import com.microsoft.tfs.core.clients.versioncontrol.*
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.PendingChangeEvent
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.*
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.PendingChangeEvent
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.NewPendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.PendingChangeEvent
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.NonFatalErrorListener
import com.microsoft.tfs.core.clients.versioncontrol.events.PendingChangeEvent
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.PendingChangeEvent
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.clients.versioncontrol.workspacecache.WorkspaceInfo
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.UndonePendingChangeListener
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.clients.versioncontrol.workspacecache.WorkspaceInfo
import com.microsoft.tfs.core.config.persistence.DefaultPersistenceStoreProvider
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.*
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.clients.versioncontrol.workspacecache.WorkspaceInfo
import com.microsoft.tfs.core.config.persistence.DefaultPersistenceStoreProvider
import com.microsoft.tfs.core.httpclient.Credentials
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.specs.ItemSpec
import com.microsoft.tfs.core.clients.versioncontrol.workspacecache.WorkspaceInfo
import com.microsoft.tfs.core.config.persistence.DefaultPersistenceStoreProvider
import com.microsoft.tfs.core.httpclient.Credentials
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.workspacecache.WorkspaceInfo
import com.microsoft.tfs.core.config.persistence.DefaultPersistenceStoreProvider
import com.microsoft.tfs.core.httpclient.Credentials
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.config.persistence.DefaultPersistenceStoreProvider
import com.microsoft.tfs.core.httpclient.Credentials
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
import com.microsoft.tfs.sdk.*
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import com.microsoft.tfs.core.httpclient.Credentials
import com.microsoft.tfs.core.httpclient.UsernamePasswordCredentials
import com.microsoft.tfs.model.host.*
import com.microsoft.tfs.sdk.*
import com.microsoft.tfs.watcher.ExternallyControlledPathWatcherFactory
```

### KotlinAnnotator
Unresolved reference: WorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        private fun loadMappings(workspaceInfo: WorkspaceInfo, credentials: Credentials?): List<TfsWorkspaceMapping> {
            val serverUri = workspaceInfo.serverURI
            val workspaceName = workspaceInfo.name.orEmpty()
```

### KotlinAnnotator
Unresolved reference: Credentials
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        private fun loadMappings(workspaceInfo: WorkspaceInfo, credentials: Credentials?): List<TfsWorkspaceMapping> {
            val serverUri = workspaceInfo.serverURI
            val workspaceName = workspaceInfo.name.orEmpty()
```

### KotlinAnnotator
Unresolved reference: TfsWorkspaceMapping
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        private fun loadMappings(workspaceInfo: WorkspaceInfo, credentials: Credentials?): List<TfsWorkspaceMapping> {
            val serverUri = workspaceInfo.serverURI
            val workspaceName = workspaceInfo.name.orEmpty()
```

### KotlinAnnotator
Unresolved reference: TFSTeamProjectCollection
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                return emptyList()
            } else {
                val collection = TFSTeamProjectCollection(serverUri, credentials)
                try {
                    val workspace = workspaceInfo.getWorkspace(collection)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                try {
                    val workspace = workspaceInfo.getWorkspace(collection)
                    return workspace.folders?.map { workingFolder ->
                        TfsWorkspaceMapping(
                            TfsLocalPath(workingFolder.localItem),
```

### KotlinAnnotator
Unresolved reference: TfsWorkspaceMapping
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                    val workspace = workspaceInfo.getWorkspace(collection)
                    return workspace.folders?.map { workingFolder ->
                        TfsWorkspaceMapping(
                            TfsLocalPath(workingFolder.localItem),
                            TfsServerPath(workspaceName, workingFolder.displayServerItem),
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                    return workspace.folders?.map { workingFolder ->
                        TfsWorkspaceMapping(
                            TfsLocalPath(workingFolder.localItem),
                            TfsServerPath(workspaceName, workingFolder.displayServerItem),
                            workingFolder.type == WorkingFolderType.CLOAK
```

### KotlinAnnotator
Unresolved reference: TfsServerPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                        TfsWorkspaceMapping(
                            TfsLocalPath(workingFolder.localItem),
                            TfsServerPath(workspaceName, workingFolder.displayServerItem),
                            workingFolder.type == WorkingFolderType.CLOAK
                        )
```

### KotlinAnnotator
Unresolved reference: WorkingFolderType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                            TfsLocalPath(workingFolder.localItem),
                            TfsServerPath(workspaceName, workingFolder.displayServerItem),
                            workingFolder.type == WorkingFolderType.CLOAK
                        )
                    }.orEmpty()
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun checkoutFilesForEdit(paths: List<TfsLocalPath>, recursive: Boolean): TfvcCheckoutResult {
        val editedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: TfvcCheckoutResult
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun checkoutFilesForEdit(paths: List<TfsLocalPath>, recursive: Boolean): TfvcCheckoutResult {
        val editedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: PendingChangeEvent
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun checkoutFilesForEdit(paths: List<TfsLocalPath>, recursive: Boolean): TfvcCheckoutResult {
        val editedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: Failure
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun checkoutFilesForEdit(paths: List<TfsLocalPath>, recursive: Boolean): TfvcCheckoutResult {
        val editedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()

```

### KotlinAnnotator
Unresolved reference: Failure
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val editedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
```

### KotlinAnnotator
Unresolved reference: NewPendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.EDIT)) {
                editedEvents.add(event)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.EDIT)) {
                editedEvents.add(event)
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.EDIT)) {
                editedEvents.add(event)
            }
```

### KotlinAnnotator
Unresolved reference: NonFatalErrorListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val errorListener = NonFatalErrorListener { event ->
            event.failure?.let {
                when (event.failure.code) {
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val errorListener = NonFatalErrorListener { event ->
            event.failure?.let {
                when (event.failure.code) {
```

### KotlinAnnotator
Unresolved reference: FailureCodes
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            event.failure?.let {
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            event.failure?.let {
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
            }
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val recursionType = if (recursive) RecursionType.FULL else RecursionType.NONE
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendEdit(
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val recursionType = if (recursive) RecursionType.FULL else RecursionType.NONE
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendEdit(
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val recursionType = if (recursive) RecursionType.FULL else RecursionType.NONE
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendEdit(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val recursionType = if (recursive) RecursionType.FULL else RecursionType.NONE
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendEdit(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Unresolved reference: LockLevel
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                workspacePaths.mapToArray { it.toCanonicalPathString() },
                recursionType,
                LockLevel.NONE,
                null,
                GetOptions.NONE,
```

### KotlinAnnotator
Unresolved reference: GetOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                LockLevel.NONE,
                null,
                GetOptions.NONE,
                PendChangesOptions.NONE
            )
```

### KotlinAnnotator
Unresolved reference: PendChangesOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                null,
                GetOptions.NONE,
                PendChangesOptions.NONE
            )
        }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val editedPaths = editedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val editedPaths = editedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val editedPaths = editedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val editedPaths = editedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfvcCheckoutResult(editedPaths, notFoundPaths, errorMessages)
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val editedPaths = editedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfvcCheckoutResult(editedPaths, notFoundPaths, errorMessages)
```

### KotlinAnnotator
Unresolved reference: TfvcCheckoutResult
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfvcCheckoutResult(editedPaths, notFoundPaths, errorMessages)
    }

```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    val workspaces = Property<List<Workspace>>(listOf())
    private fun getWorkspaceFor(path: TfsPath): Workspace? {
        for (workspace in workspaces.value) {
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    private fun enumeratePathsWithWorkspace(paths: Iterable<TfsPath>, action: (Workspace, List<TfsPath>) -> Unit) {
        for ((workspace, workspacePathList) in paths.groupBy(::getWorkspaceFor)) {
            if (workspace == null) {
```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    private fun enumeratePathsWithWorkspace(paths: Iterable<TfsPath>, action: (Workspace, List<TfsPath>) -> Unit) {
        for ((workspace, workspacePathList) in paths.groupBy(::getWorkspaceFor)) {
            if (workspace == null) {
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    private fun enumeratePathsWithWorkspace(paths: Iterable<TfsPath>, action: (Workspace, List<TfsPath>) -> Unit) {
        for ((workspace, workspacePathList) in paths.groupBy(::getWorkspaceFor)) {
            if (workspace == null) {
```

### KotlinAnnotator
Not enough information to infer type variable K
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    private fun enumeratePathsWithWorkspace(paths: Iterable<TfsPath>, action: (Workspace, List<TfsPath>) -> Unit) {
        for ((workspace, workspacePathList) in paths.groupBy(::getWorkspaceFor)) {
            if (workspace == null) {
                logger.warn { "Could not determine workspace for paths: " + paths.joinToString() }
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
```

### KotlinAnnotator
Unresolved reference: UndonePendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun undoLocalChanges(paths: List<TfsPath>): List<TfsLocalPath> {
        val undonePaths = mutableListOf<TfsLocalPath>()
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
                val count = workspace.undo(workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) })
                logger.info { "Undo result = $count" }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val listener = UndonePendingChangeListener { undonePaths.add(TfsLocalPath(it.pendingChange.localItem)) }
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
                val count = workspace.undo(workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) })
                logger.info { "Undo result = $count" }
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        client.eventEngine.withUndonePendingChangeListener(listener) {
            enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
                val count = workspace.undo(workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) })
                logger.info { "Undo result = $count" }
            }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        fun getBasicWorkspaceInfo(path: TfsLocalPath): TfsWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val workspaceName = workspaceInfo.name.orEmpty()
```

### KotlinAnnotator
Unresolved reference: TfsWorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        fun getBasicWorkspaceInfo(path: TfsLocalPath): TfsWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val workspaceName = workspaceInfo.name.orEmpty()
```

### KotlinAnnotator
Unresolved reference: name
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        fun getBasicWorkspaceInfo(path: TfsLocalPath): TfsWorkspaceInfo? {
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val workspaceName = workspaceInfo.name.orEmpty()
            val serverUri = workspaceInfo.serverURI.toString()
            val mappings =
```

### KotlinAnnotator
Unresolved reference: serverURI
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val workspaceInfo = tryLoadWorkspaceInfo(path) ?: return null
            val workspaceName = workspaceInfo.name.orEmpty()
            val serverUri = workspaceInfo.serverURI.toString()
            val mappings =
                try {
```

### KotlinAnnotator
Unresolved reference: TfsBasicWorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                } catch (e: Throwable) {
                    logger.error("Cannot determine workspace mappings for workspace \"$path\".", e)
                    return TfsBasicWorkspaceInfo(serverUri, workspaceName)
                }

```

### KotlinAnnotator
Unresolved reference: TfsDetailedWorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                }

            return TfsDetailedWorkspaceInfo(mappings, serverUri, workspaceName)
        }

```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        private val logger = Logging.getLogger<TfsClient>()

        private fun tryLoadWorkspaceInfo(path: TfsLocalPath): WorkspaceInfo? {
            val workstation = Workstation.getCurrent(DefaultPersistenceStoreProvider.INSTANCE)
            val canonicalPathString = path.toCanonicalPathString()
```

### KotlinAnnotator
Unresolved reference: WorkspaceInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        private val logger = Logging.getLogger<TfsClient>()

        private fun tryLoadWorkspaceInfo(path: TfsLocalPath): WorkspaceInfo? {
            val workstation = Workstation.getCurrent(DefaultPersistenceStoreProvider.INSTANCE)
            val canonicalPathString = path.toCanonicalPathString()
```

### KotlinAnnotator
Unresolved reference: Workstation
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        private fun tryLoadWorkspaceInfo(path: TfsLocalPath): WorkspaceInfo? {
            val workstation = Workstation.getCurrent(DefaultPersistenceStoreProvider.INSTANCE)
            val canonicalPathString = path.toCanonicalPathString()
            if (!workstation.isMapped(canonicalPathString)) {
```

### KotlinAnnotator
Unresolved reference: DefaultPersistenceStoreProvider
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        private fun tryLoadWorkspaceInfo(path: TfsLocalPath): WorkspaceInfo? {
            val workstation = Workstation.getCurrent(DefaultPersistenceStoreProvider.INSTANCE)
            val canonicalPathString = path.toCanonicalPathString()
            if (!workstation.isMapped(canonicalPathString)) {
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

    fun invalidatePaths(paths: List<TfsLocalPath>) {
        pathWatcherFactory.pathsInvalidated.fire(paths.map { Paths.get(it.path) })
    }
```

### KotlinAnnotator
Type mismatch: inferred type is Unit but Path was expected
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun invalidatePaths(paths: List<TfsLocalPath>) {
        pathWatcherFactory.pathsInvalidated.fire(paths.map { Paths.get(it.path) })
    }

```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    val workspaces = Property<List<Workspace>>(listOf())
    private fun getWorkspaceFor(path: TfsPath): Workspace? {
        for (workspace in workspaces.value) {
            if (workspace.isPathMapped(path)) {
```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    val workspaces = Property<List<Workspace>>(listOf())
    private fun getWorkspaceFor(path: TfsPath): Workspace? {
        for (workspace in workspaces.value) {
            if (workspace.isPathMapped(path)) {
```

### KotlinAnnotator
None of the following functions can be called with the arguments supplied: public operator fun Collection.plus(element: TypeVariable(T)): List defined in kotlin.collections public operator fun Collection.plus(elements: Array): List defined in kotlin.collections public operator fun Collection.plus(elements: Iterable): List defined in kotlin.collections public operator fun Collection.plus(elements: Sequence): List defined in kotlin.collections public operator fun Iterable.plus(element: TypeVariable(T)): List defined in kotlin.collections public operator fun Iterable.plus(elements: Array): List defined in kotlin.collections public operator fun Iterable.plus(elements: Iterable): List defined in kotlin.collections public operator fun Iterable.plus(elements: Sequence): List defined in kotlin.collections
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        return client.tryGetWorkspace(path)?.also {
            workspaces.value += it
        }
    }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        return client.tryGetWorkspace(path)?.also {
            workspaces.value += it
        }
    }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    private fun <TInfo>getLocalItemsInfo(
        paths: List<TfsLocalPath>,
        extended: Boolean,
        converter: (ExtendedItem) -> TInfo
```

### KotlinAnnotator
Unresolved reference: ExtendedItem
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        paths: List<TfsLocalPath>,
        extended: Boolean,
        converter: (ExtendedItem) -> TInfo
    ): List<TInfo> {
        val infos = ArrayList<TInfo>(paths.size)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    ): List<TInfo> {
        val infos = ArrayList<TInfo>(paths.size)
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    ): List<TInfo> {
        val infos = ArrayList<TInfo>(paths.size)
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
```

### KotlinAnnotator
Unresolved reference: GetItemsOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
```

### KotlinAnnotator
Unresolved reference: GetItemsOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
```

### KotlinAnnotator
Not enough information to infer type variable R
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
                .asSequence()
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            // Pass NONE to get lock info in extended mode.
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
                .asSequence()
```

### KotlinAnnotator
Unresolved reference: DeletedState
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
                .asSequence()
                .flatMap { it.asSequence() }
```

### KotlinAnnotator
Unresolved reference: ItemType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val downloadType = if (extended) GetItemsOptions.NONE else GetItemsOptions.LOCAL_ONLY
            val itemSpecs = workspacePaths.mapToArray { it.toCanonicalPathItemSpec(RecursionType.NONE) }
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
                .asSequence()
                .flatMap { it.asSequence() }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val extendedItems = workspace.getExtendedItems(itemSpecs, DeletedState.ANY, ItemType.ANY, downloadType)
                .asSequence()
                .flatMap { it.asSequence() }

            for (extendedItem in extendedItems) {
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun renameFile(oldPath: TfsLocalPath, newPath: TfsLocalPath): Boolean {
        val workspace = getWorkspaceFor(oldPath)
        if (workspace == null) {
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun renameFile(oldPath: TfsLocalPath, newPath: TfsLocalPath): Boolean {
        val workspace = getWorkspaceFor(oldPath)
        if (workspace == null) {
```

### KotlinAnnotator
Unresolved reference: LockLevel
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            oldPath.path,
            newPath.path,
            LockLevel.NONE,
            GetOptions.NONE,
            true,
```

### KotlinAnnotator
Unresolved reference: GetOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            newPath.path,
            LockLevel.NONE,
            GetOptions.NONE,
            true,
            PendChangesOptions.NONE
```

### KotlinAnnotator
Unresolved reference: PendChangesOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            GetOptions.NONE,
            true,
            PendChangesOptions.NONE
        )
        logger.info { "pendRename result: $changedItems" }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun getLocalItemsInfo(paths: List<TfsLocalPath>): List<TfsLocalItemInfo> = getLocalItemsInfo(paths, false) {
        it.toLocalItemInfo()
    }
```

### KotlinAnnotator
Unresolved reference: TfsLocalItemInfo
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun getLocalItemsInfo(paths: List<TfsLocalPath>): List<TfsLocalItemInfo> = getLocalItemsInfo(paths, false) {
        it.toLocalItemInfo()
    }
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    private fun performLocalChanges(
        paths: List<TfsPath>,
        changeListener: NewPendingChangeListener,
        errorListener: NonFatalErrorListener,
```

### KotlinAnnotator
Unresolved reference: NewPendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    private fun performLocalChanges(
        paths: List<TfsPath>,
        changeListener: NewPendingChangeListener,
        errorListener: NonFatalErrorListener,
        action: (Workspace, List<TfsPath>) -> Unit) {
```

### KotlinAnnotator
Unresolved reference: NonFatalErrorListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        paths: List<TfsPath>,
        changeListener: NewPendingChangeListener,
        errorListener: NonFatalErrorListener,
        action: (Workspace, List<TfsPath>) -> Unit) {
        val eventEngine = client.eventEngine
```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        changeListener: NewPendingChangeListener,
        errorListener: NonFatalErrorListener,
        action: (Workspace, List<TfsPath>) -> Unit) {
        val eventEngine = client.eventEngine

```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        changeListener: NewPendingChangeListener,
        errorListener: NonFatalErrorListener,
        action: (Workspace, List<TfsPath>) -> Unit) {
        val eventEngine = client.eventEngine

```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        eventEngine.withNewPendingChangeListener(changeListener) {
            eventEngine.withNonFatalErrorListener(errorListener) {
                enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
                    action(workspace, workspacePaths)
                }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        eventEngine.withNewPendingChangeListener(changeListener) {
            eventEngine.withNonFatalErrorListener(errorListener) {
                enumeratePathsWithWorkspace(paths) { workspace, workspacePaths ->
                    action(workspace, workspacePaths)
                }
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun deletePathsRecursively(paths: List<TfsPath>): TfsDeleteResult {
        val deletedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: TfsDeleteResult
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun deletePathsRecursively(paths: List<TfsPath>): TfsDeleteResult {
        val deletedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: PendingChangeEvent
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun deletePathsRecursively(paths: List<TfsPath>): TfsDeleteResult {
        val deletedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()
```

### KotlinAnnotator
Unresolved reference: Failure
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun deletePathsRecursively(paths: List<TfsPath>): TfsDeleteResult {
        val deletedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()

```

### KotlinAnnotator
Unresolved reference: Failure
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val deletedEvents = mutableListOf<PendingChangeEvent>()
        val itemNotExistsFailures = mutableListOf<Failure>()
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
```

### KotlinAnnotator
Unresolved reference: NewPendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.DELETE)) {
                deletedEvents.add(event)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val otherFailures = mutableListOf<Failure>()

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.DELETE)) {
                deletedEvents.add(event)
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.DELETE)) {
                deletedEvents.add(event)
            }
```

### KotlinAnnotator
Unresolved reference: NonFatalErrorListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val errorListener = NonFatalErrorListener { event ->
            event.failure?.let {
                when (event.failure.code) {
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val errorListener = NonFatalErrorListener { event ->
            event.failure?.let {
                when (event.failure.code) {
```

### KotlinAnnotator
Unresolved reference: FailureCodes
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            event.failure?.let {
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            event.failure?.let {
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                when (event.failure.code) {
                    FailureCodes.ITEM_NOT_FOUND_EXCEPTION -> itemNotExistsFailures.add(it)
                    else -> otherFailures.add(it)
                }
            }
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendDelete(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendDelete(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Unresolved reference: RecursionType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            workspace.pendDelete(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
                RecursionType.FULL,
                LockLevel.UNCHANGED,
                GetOptions.NONE,
```

### KotlinAnnotator
Unresolved reference: LockLevel
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                workspacePaths.mapToArray { it.toCanonicalPathString() },
                RecursionType.FULL,
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.NONE
```

### KotlinAnnotator
Unresolved reference: GetOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                RecursionType.FULL,
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.NONE
            )
```

### KotlinAnnotator
Unresolved reference: PendChangesOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.NONE
            )
        }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val deletedPaths = deletedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val deletedPaths = deletedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val deletedPaths = deletedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val deletedPaths = deletedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfsDeleteResult(deletedPaths, notFoundPaths, errorMessages)
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val deletedPaths = deletedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
        val errorMessages = otherFailures.map { it.toString() }
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfsDeleteResult(deletedPaths, notFoundPaths, errorMessages)
```

### KotlinAnnotator
Unresolved reference: TfsDeleteResult
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val notFoundPaths = itemNotExistsFailures.map { TfsLocalPath(it.localItem) }

        return TfsDeleteResult(deletedPaths, notFoundPaths, errorMessages)
    }

```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun addFiles(paths: List<TfsLocalPath>): List<TfsLocalPath> {
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    }

    fun addFiles(paths: List<TfsLocalPath>): List<TfsLocalPath> {
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
```

### KotlinAnnotator
Unresolved reference: PendingChangeEvent
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    fun addFiles(paths: List<TfsLocalPath>): List<TfsLocalPath> {
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.ADD)) {
```

### KotlinAnnotator
Unresolved reference: NewPendingChangeListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun addFiles(paths: List<TfsLocalPath>): List<TfsLocalPath> {
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.ADD)) {
                addedEvents.add(event)
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    fun addFiles(paths: List<TfsLocalPath>): List<TfsLocalPath> {
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.ADD)) {
                addedEvents.add(event)
```

### KotlinAnnotator
Unresolved reference: ChangeType
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        val addedEvents = mutableListOf<PendingChangeEvent>()
        val changeListener = NewPendingChangeListener { event ->
            if (event.pendingChange.changeType.contains(ChangeType.ADD)) {
                addedEvents.add(event)
            }
```

### KotlinAnnotator
Unresolved reference: NonFatalErrorListener
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        val errorListener = NonFatalErrorListener {
            logger.warn { "Non-fatal error detected: ${it.message}" }
        }
```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

        val errorListener = NonFatalErrorListener {
            logger.warn { "Non-fatal error detected: ${it.message}" }
        }
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            logger.warn { "Non-fatal error detected: ${it.message}" }
        }
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendAdd(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Cannot infer a type for this parameter. Please specify it explicitly.
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            logger.warn { "Non-fatal error detected: ${it.message}" }
        }
        performLocalChanges(paths, changeListener, errorListener) { workspace, workspacePaths ->
            workspace.pendAdd(
                workspacePaths.mapToArray { it.toCanonicalPathString() },
```

### KotlinAnnotator
Unresolved reference: LockLevel
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                false,
                null,
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.APPLY_LOCAL_ITEM_EXCLUSIONS
```

### KotlinAnnotator
Unresolved reference: GetOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                null,
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.APPLY_LOCAL_ITEM_EXCLUSIONS
            )
```

### KotlinAnnotator
Unresolved reference: PendChangesOptions
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
                LockLevel.UNCHANGED,
                GetOptions.NONE,
                PendChangesOptions.APPLY_LOCAL_ITEM_EXCLUSIONS
            )
        }
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        return addedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
    }

```

### KotlinAnnotator
Unresolved reference: it
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        }

        return addedEvents.map { TfsLocalPath(it.pendingChange.localItem) }
    }

```

### KotlinAnnotator
Unresolved reference: Credentials
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
import java.nio.file.Paths

class TfsClient(lifetime: Lifetime, serverUri: URI, credentials: Credentials) {
    companion object {
        private val logger = Logging.getLogger<TfsClient>()
```

### KotlinAnnotator
Unresolved reference: VersionControlClient
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
```

### KotlinAnnotator
Unresolved reference: TfsPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
```

### KotlinAnnotator
Unresolved reference: Workspace
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
```

### KotlinAnnotator
Unresolved reference: TfsLocalPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
        try {
```

### KotlinAnnotator
Unresolved reference: TfsServerPath
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
        try {
            getWorkspace(path.workspace, ".")
```

### KotlinAnnotator
Unresolved reference: WorkspaceNotFoundException
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
        try {
            getWorkspace(path.workspace, ".")
        } catch (ex: WorkspaceNotFoundException) {
            null
        }
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
package com.microsoft.tfs.sdk

import com.microsoft.tfs.core.clients.versioncontrol.VersionControlClient
import com.microsoft.tfs.core.clients.versioncontrol.exceptions.WorkspaceNotFoundException
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java

import com.microsoft.tfs.core.clients.versioncontrol.VersionControlClient
import com.microsoft.tfs.core.clients.versioncontrol.exceptions.WorkspaceNotFoundException
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
```

### KotlinAnnotator
Unresolved reference: core
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.VersionControlClient
import com.microsoft.tfs.core.clients.versioncontrol.exceptions.WorkspaceNotFoundException
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.exceptions.WorkspaceNotFoundException
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath
```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.soapextensions.Workspace
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath

```

### KotlinAnnotator
Unresolved reference: model
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsLocalPath
import com.microsoft.tfs.model.host.TfsPath
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
```

### KotlinAnnotator
Unresolved reference: PatternLayout
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
object Logging {
    val factory = CommonsLoggingLoggerFactory
    val layout = PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n")

    fun initialize(logDirectory: Path?, level: Level) {
```

### KotlinAnnotator
Unresolved reference: Level
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
    val layout = PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n")

    fun initialize(logDirectory: Path?, level: Level) {
        org.apache.log4j.Logger.getRootLogger().apply {
            removeAllAppenders()
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java

    fun initialize(logDirectory: Path?, level: Level) {
        org.apache.log4j.Logger.getRootLogger().apply {
            removeAllAppenders()

```

### KotlinAnnotator
Unresolved reference: removeAllAppenders
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
    fun initialize(logDirectory: Path?, level: Level) {
        org.apache.log4j.Logger.getRootLogger().apply {
            removeAllAppenders()

            addAppender(ConsoleAppender(layout))
```

### KotlinAnnotator
Unresolved reference: addAppender
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
            removeAllAppenders()

            addAppender(ConsoleAppender(layout))
            logDirectory?.let { directory ->
                val startDate = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").format(LocalDateTime.now())
```

### KotlinAnnotator
Unresolved reference: ConsoleAppender
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
            removeAllAppenders()

            addAppender(ConsoleAppender(layout))
            logDirectory?.let { directory ->
                val startDate = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").format(LocalDateTime.now())
```

### KotlinAnnotator
Unresolved reference: addAppender
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
                val currentProcessId = ManagementFactory.getRuntimeMXBean().name
                val logFilePath = directory.resolve("$startDate.$currentProcessId.log")
                addAppender(FileAppender(layout, logFilePath.toString(), true))
                println("Logs are saved to $logFilePath")
            }
```

### KotlinAnnotator
Unresolved reference: FileAppender
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
                val currentProcessId = ManagementFactory.getRuntimeMXBean().name
                val logFilePath = directory.resolve("$startDate.$currentProcessId.log")
                addAppender(FileAppender(layout, logFilePath.toString(), true))
                println("Logs are saved to $logFilePath")
            }
```

### KotlinAnnotator
Unresolved reference: level
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
            }

            this.level = level
            println("Log level enabled: $level")
        }
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
import com.jetbrains.rd.util.ILoggerFactory
import com.jetbrains.rd.util.Statics
import org.apache.log4j.ConsoleAppender
import org.apache.log4j.FileAppender
import org.apache.log4j.Level
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
import com.jetbrains.rd.util.Statics
import org.apache.log4j.ConsoleAppender
import org.apache.log4j.FileAppender
import org.apache.log4j.Level
import org.apache.log4j.PatternLayout
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
import org.apache.log4j.ConsoleAppender
import org.apache.log4j.FileAppender
import org.apache.log4j.Level
import org.apache.log4j.PatternLayout
import java.lang.management.ManagementFactory
```

### KotlinAnnotator
Unresolved reference: apache
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
import org.apache.log4j.FileAppender
import org.apache.log4j.Level
import org.apache.log4j.PatternLayout
import java.lang.management.ManagementFactory
import java.nio.file.Path
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`[\\\\]` can be simplified to '\\\\'
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        // If the username has a backslash, then the domain is the first part and the username is the second part
        if (userName.contains("\\")) {
            String[] parts = userName.split("[\\\\]");
            if (parts.length == 2) {
                domain = parts[0];
```

### RegExpSimplifiable
`[/]` can be simplified to '/'
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        } else if (userName.contains("/")) {
            // If the username has a slash, then the domain is the first part and the username is the second part
            String[] parts = userName.split("[/]");
            if (parts.length == 2) {
                domain = parts[0];
```

### RegExpSimplifiable
`[@]` can be simplified to '@'
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        } else if (userName.contains("@")) {
            // If the username has an asterisk, then the domain is the second part and the username is the first part
            String[] parts = userName.split("[@]");
            if (parts.length == 2) {
                user = parts[0];
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`labelName.length() > 0` can be replaced with '!labelName.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelDialog.java`
#### Snippet
```java
        form.addListener(new ApplyLabelForm.Listener() {
            public void dataChanged(final String labelName, final int visibleItemsCount) {
                setOkEnabled(visibleItemsCount > 0 && labelName.length() > 0);
            }
        });
```

### SizeReplaceableByIsEmpty
`relativeTo.length() > 0` can be replaced with '!relativeTo.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
             * path to express.
             */
            if (relativeTo.length() > 0 && ServerPath.isSeparator(relativeTo.charAt(relativeTo.length() - 1))) {
                return serverPath.substring(relativeTo.length());
            }
```

### SizeReplaceableByIsEmpty
`cleaned.length() == 0` can be replaced with 'cleaned.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
                     * contain nothing but spaces and dots.
                     */
                    if (cleaned.length() == 0) {
                        // Ignore
                    } else if (cleaned.length() > MAXIMUM_COMPONENT_LENGTH) {
```

### SizeReplaceableByIsEmpty
`relativeTo.length() > 0` can be replaced with '!relativeTo.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
             * path to express.
             */
            if (relativeTo.length() > 0 && relativeTo.charAt(relativeTo.length() - 1) == File.separatorChar) {
                return localPath.substring(relativeTo.length());
            }
```

### SizeReplaceableByIsEmpty
`builds.size() > 0` can be replaced with '!builds.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
                    null, //TODO: EnumSet.of(BuildResult.FAILED, BuildResult.PARTIALLY_SUCCEEDED, BuildResult.SUCCEEDED),
                    null, null, null, 100, null, null, null, BuildQueryOrder.FINISH_TIME_DESCENDING);
            if (builds.size() > 0) {
                for (final Build b : builds) {
                    if (b.getResult() == BuildResult.CANCELED) {
```

### SizeReplaceableByIsEmpty
`builds.size() > 0` can be replaced with '!builds.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java

        public boolean isBuildFound() {
            return builds != null && builds.size() > 0;
        }

```

### SizeReplaceableByIsEmpty
`builds.size() > 0` can be replaced with '!builds.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
        final BuildHttpClient buildClient = context.getBuildHttpClient();
        final List<Build> builds = buildClient.getBuilds(context.getTeamProjectReference().getId(), null, null, null, null, null, null, null, BuildStatus.COMPLETED, null, null, null, null, 100, null, null, null, BuildQueryOrder.FINISH_TIME_DESCENDING);
        if (builds.size() > 0) {
            for (final Build b : builds) {
                if (b.getResult() == BuildResult.CANCELED) {
```

### SizeReplaceableByIsEmpty
`builds.size() > 0` can be replaced with '!builds.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
        public BuildStatusRecord getBuildForDisplay() {
            // The last build in the list should be the one to return
            if (builds.size() > 0) {
                return builds.get(builds.size() - 1);
            }
```

### SizeReplaceableByIsEmpty
`builds.size() > 0` can be replaced with '!builds.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
        public BuildStatusRecord getRepositoryStatus() {
            // The first build in the list should be the one to return
            if (builds.size() > 0) {
                return builds.get(0);
            }
```

### SizeReplaceableByIsEmpty
`operationExceptions.size() > 0` can be replaced with '!operationExceptions.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
            OperationExecutor.getInstance().wait(tasks);

            if (operationExceptions.size() > 0) {
                terminate(new TeamServicesException(TeamServicesException.KEY_OPERATION_ERRORS));
            }
```

### SizeReplaceableByIsEmpty
`items.size() > 0` can be replaced with '!items.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
        final List<Row> items = getItems();
        // make the new row a copy of the last row
        if (items != null && items.size() > 0) {
            return new Row(items.get(items.size() - 1));
        } else {
```

### SizeReplaceableByIsEmpty
`input.trim().length() == 0` can be replaced with 'input.trim().isEmpty()'
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java

    private static boolean isNullOrEmpty(final String input) {
        return input == null || input.trim().length() == 0;
    }

```

### SizeReplaceableByIsEmpty
`organizationsFromRemotes.size() == 0` can be replaced with 'organizationsFromRemotes.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
                    .distinct()
                    .collect(Collectors.toList());
            if (organizationsFromRemotes.size() == 0) {
                logger.info("tryDetectApiUriFromGitRemotes: no Azure DevOps organizations detected");
                return null; // we cannot authenticate without knowing the organization
```

### SizeReplaceableByIsEmpty
`syncResults.getExceptions().size() > 0` can be replaced with '!syncResults.getExceptions().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
                        final SyncResults syncResults = CommandUtils.syncWorkspace(serverContext, localPath);
                        ProgressManager.getInstance().getProgressIndicator().setFraction(.8);
                        if (syncResults.getExceptions().size() > 0) {
                            for (final SyncException se : syncResults.getExceptions()) {
                                errors.add(TFSVcs.convertToVcsException(se));
```

### SizeReplaceableByIsEmpty
`getMappings().size() == 0` can be replaced with 'getMappings().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                    TfPluginBundle.KEY_WORKSPACE_DIALOG_ERRORS_NAME_EMPTY);
        }
        if (getMappings().size() == 0) {
            return ModelValidationInfo.createWithResource(PROP_MAPPINGS,
                    TfPluginBundle.KEY_WORKSPACE_DIALOG_ERRORS_MAPPINGS_EMPTY);
```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/PageModelImpl.java`
#### Snippet
```java
    @Override
    public boolean hasErrors() {
        return errors.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`locale.getVariant().length() > 0` can be replaced with '!locale.getVariant().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
        String result = locale.getLanguage();

        if (locale.getVariant().length() > 0) {
            result = result + "-" + locale.getVariant(); //$NON-NLS-1$
        }
```

### SizeReplaceableByIsEmpty
`locale.getCountry().length() > 0` can be replaced with '!locale.getCountry().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
        }

        if (locale.getCountry().length() > 0) {
            result = result + "-" + locale.getCountry(); //$NON-NLS-1$
        }
```

### SizeReplaceableByIsEmpty
`items.size() > 0` can be replaced with '!items.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
        InfoCommand infoCommand = new InfoCommand(context, workingFolder, Collections.singletonList(itemPath));
        List<ExtendedItemInfo> items = infoCommand.runSynchronously();
        if (items != null && items.size() > 0) {
            return items.get(0);
        }
```

### SizeReplaceableByIsEmpty
`authorField.getText().length() > 0` can be replaced with '!authorField.getText().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/TFSVersionFilterComponent.java`
#### Snippet
```java
    @Nullable
    public String getAuthorFilter() {
        if (useAuthorFilter.isSelected() && authorField.getText().length() > 0) {
            return authorField.getText();
        } else {
```

### SizeReplaceableByIsEmpty
`detailedWorkspace.getMappings().size() > 0` can be replaced with '!detailedWorkspace.getMappings().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
            if (detailedWorkspace != null) {
                final String projectName = VcsHelper.getTeamProjectFromTfvcServerPath(
                        detailedWorkspace.getMappings().size() > 0 ? detailedWorkspace.getMappings().get(0).getServerPath() : null);
                final ServerContext context = ServerContextManager.getInstance().createContextFromTfvcServerUrl(serverUri, projectName, true);
                // use info from the 2 incomplete workspace objects to create a complete one
```

### SizeReplaceableByIsEmpty
`workspace.getMappings().size() > 0` can be replaced with '!workspace.getMappings().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
            if (workspace != null) {
                final String projectName = VcsHelper.getTeamProjectFromTfvcServerPath(
                        workspace.getMappings().size() > 0 ? workspace.getMappings().get(0).getServerPath() : null);

                final ServerContext context = ServerContextManager.getInstance().createContextFromTfvcServerUrl(workspace.getServerUri(), projectName, true);
```

### SizeReplaceableByIsEmpty
`listeners.size() == 0` can be replaced with 'listeners.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java

    private void notifyActionListeners() {
        if (listeners == null || listeners.size() == 0 || !super.isEnabled()) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`listeners.size() == 0` can be replaced with 'listeners.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java

    public void removeActionListener(final ActionListener listener) {
        if (listeners == null || listeners.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`workItemsToAssociate.size() > 0` can be replaced with '!workItemsToAssociate.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/commands/CheckinCommand.java`
#### Snippet
```java
            builder.addSwitch("comment", getComment());
        }
        if (workItemsToAssociate != null && workItemsToAssociate.size() > 0) {
            builder.addSwitch("associate", getAssociatedWorkItems());
        }
```

### SizeReplaceableByIsEmpty
`component.getText().length() == 0` can be replaced with 'component.getText().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HintTextFieldUI.java`
#### Snippet
```java
        super.paintSafely(g);
        JTextComponent component = getComponent();
        if (hintText != null && component.getText().length() == 0 && !component.hasFocus()) {
            g.setColor(JBColor.GRAY);
            final int fontSize = component.getFont().getSize();
```

### SizeReplaceableByIsEmpty
`remoteParams.size() == 0` can be replaced with 'remoteParams.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                        }
                    }, true, indicator.getModalityState());
                    if (remoteParams.size() == 0) {
                        //user chose to cancel import
                        logger.warn("setupRemoteOnLocalRepo: User chose to cancel import for project: {}, local repo: {}",
```

### SizeReplaceableByIsEmpty
`proceed.size() == 0` can be replaced with 'proceed.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        }, true, indicator.getModalityState());

        if (proceed.size() == 0) {
            //user chose to cancel import
            logger.warn("projectSupportsGitRepos: User chose to cancel import into team project: {}",
```

### SizeReplaceableByIsEmpty
`filesToCommit.size() > 0` can be replaced with '!filesToCommit.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                GitFileUtils.addFiles(project, rootVirtualFile, filesToCommit);
                if (filesToCommit.size() > 0) {
                    final GitSimpleHandler hCommit = new GitSimpleHandler(project, rootVirtualFile, GitCommand.COMMIT);
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
```

### SizeReplaceableByIsEmpty
`results.size() > 0` can be replaced with '!results.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            // check returned results
            if (results.size() < 1 || !results.get(0).getSuccess()) {
                errorMessage = results.size() > 0 ? results.get(0).getCustomMessage() : TfPluginBundle.KEY_CREATE_BRANCH_ERRORS_UNEXPECTED_SERVER_ERROR;
            } else {
                // Get the repository object for this project
```

### SizeReplaceableByIsEmpty
`resolved.size() > 0` can be replaced with '!resolved.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java

                // check if error is a rename so the correct file name is displayed in the Update Info tab
                if (resolved != null && resolved.size() > 0) {
                    if (conflict instanceof RenameConflict && ResolveConflictsCommand.AutoResolveType.TakeTheirs.equals(type)) {
                        acceptChanges(((RenameConflict) conflict).getServerPath(), type);
```

### SizeReplaceableByIsEmpty
`pendingChange.size() > 0` can be replaced with '!pendingChange.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                            pendingChange.size());
                }
                PendingChange originalChange = pendingChange.size() > 0 ? pendingChange.get(0) : null;
                if (isMergeConflict(conflict, null)) {
                    final String workingFolder = localPath.isDirectory() ?
```

### SizeReplaceableByIsEmpty
`pullRequests.size() > 0` can be replaced with '!pullRequests.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestHelper.java`
#### Snippet
```java
                List<GitPullRequest> pullRequests = gitClient.getPullRequests(repoId, searchCriteria, null, 0, 1);

                if (pullRequests != null && pullRequests.size() > 0) {
                    final String repositoryRemoteUrl = context.getGitRepository().getRemoteUrl();
                    final String notifyMsgInHtml = getHtmlMsg(repositoryRemoteUrl, pullRequests.get(0).getPullRequestId());
```

### SizeReplaceableByIsEmpty
`lines.size() > 0` can be replaced with '!lines.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
        final List<String> lines = new ArrayList<String>(Arrays.asList(buffer.replace("\r\n", "\n").split("\n")));
        if (skipWarnings) {
            while (lines.size() > 0 && StringUtils.startsWithIgnoreCase(lines.get(0), WARNING_PREFIX)) {
                lines.remove(0);
            }
```

### SizeReplaceableByIsEmpty
`workspace.getMappings().size() > 0` can be replaced with '!workspace.getMappings().isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
                if (workspace != null) {
                    final String projectName = getTeamProjectFromTfvcServerPath(
                            workspace.getMappings().size() > 0 ? workspace.getMappings().get(0).getServerPath() : null);
                    context = RepositoryContext.createTfvcContext(projectRootFolder, workspace.getName(), projectName, workspace.getServerUri());
                }
```

### SizeReplaceableByIsEmpty
`repos.size() > 0` can be replaced with '!repos.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
            if (repository == null) {
                final List<GitRepository> repos = manager.getRepositories();
                if (repos.size() > 0) {
                    repository = repos.get(0);
                    if (repos.size() > 1) {
```

### SizeReplaceableByIsEmpty
`context.itemInfos.size() > 0` can be replaced with '!context.itemInfos.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java

                // Set the default path and additional parameters
                if (context.itemInfos.size() > 0) {
                    logger.info("Setting the defaultLocalPath and workingFolder");
                    context.defaultLocalPath = context.itemInfos.get(0).getLocalItem();
```

### SizeReplaceableByIsEmpty
`commits.size() == 0` can be replaced with 'commits.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/OpenCommitInBrowserAction.java`
#### Snippet
```java

        final List<VcsFullCommitDetails> commits = log.getSelectedDetails();
        if (commits.size() == 0) {
            presentation.setEnabledAndVisible(false);
            return;
```

### SizeReplaceableByIsEmpty
`mappings.size() == 0` can be replaced with 'mappings.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public boolean noChangesToMerge() {
        return mappings.size() == 0 && errors.size() == 0 && warnings.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`errors.size() == 0` can be replaced with 'errors.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public boolean noChangesToMerge() {
        return mappings.size() == 0 && errors.size() == 0 && warnings.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`warnings.size() == 0` can be replaced with 'warnings.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public boolean noChangesToMerge() {
        return mappings.size() == 0 && errors.size() == 0 && warnings.size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`errors.size() > 0` can be replaced with '!errors.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public boolean errorsExist() {
        return errors.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`warnings.size() > 0` can be replaced with '!warnings.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public boolean warningsExist() {
        return warnings.size() > 0;
    }
}
```

### SizeReplaceableByIsEmpty
`items.size() > 0` can be replaced with '!items.isEmpty()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsTableModel.java`
#### Snippet
```java
     */
    private void setInitialSelection() {
        if (items != null && items.size() > 0) {
            final LockCommand.LockLevel firstItemLevel = LockCommand.LockLevel.fromString(items.get(0).info.getLock());
            final boolean selectIfNone = firstItemLevel == LockCommand.LockLevel.NONE;
```

## RuleId[ruleID=ReadWriteStringCanBeUsed]
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
        java.nio.file.Path licensePath = ReactiveTfvcClientHolder.getClientBackendPath().resolve("license.html");
        try {
            return new String(Files.readAllBytes(licensePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            logger.error("Can't read EULA text from " + licensePath, e);
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder stringBuilder` can be replaced with 'String'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java

    private static StringEntity generateSoapQuery(final String pathSpecs, final int queryOptions) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version='1.0' encoding='UTF-8'?>"); //$NON-NLS-1$
        stringBuilder.append("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">");//$NON-NLS-1$
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @return Stripped {@link StringBuilder} (may be empty)
     */
    private final static StringBuilder cleanupComponent(final StringBuilder s) {
        while (s.length() > 0
                && (s.charAt(s.length() - 1) == '.' || Character.isWhitespace(s.charAt(s.length() - 1)))) {
```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @return true if possibleChild is a child of parentPath.
     */
    public final static boolean isChild(String parentPath, String possibleChild, boolean checkForIllegalDollar) throws ServerPathFormatException {
        ArgumentHelper.checkNotNull(parentPath, "parentPath");
        ArgumentHelper.checkNotNull(possibleChild, "possibleChild");
```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * (file/folder), false if not.
     */
    public final static boolean isValidPathCharacter(final char c) {
        final char[] invalidCharacters = {
                '"',
```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * otherwise.
     */
    public final static boolean isSeparator(final char c) {
        for (int i = 0; i < ServerPath.SEPARATOR_CHARACTERS.length; i++) {
            if (ServerPath.SEPARATOR_CHARACTERS[i] == c) {
```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @throws ServerPathFormatException when the path cannot be cleaned up.
     */
    public final static String canonicalize(String serverPath, boolean checkForIllegalDollar) throws ServerPathFormatException {
        ArgumentHelper.checkNotNull(serverPath, "serverPath");

```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
     *                 <code>null</code>)
     */
    public final static String combine(final String parent, final String relative) {
        ArgumentHelper.checkNotNull(parent, "parent");
        ArgumentHelper.checkNotNull(relative, "relative");
```

### FinalStaticMethod
'static' method declared `final`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
     * (including I/O errors accessing either path).
     */
    public final static boolean isChild(final String parentPath, final String possibleChild) {
        ArgumentHelper.checkNotNull(parentPath, "parentPath");
        ArgumentHelper.checkNotNull(possibleChild, "possibleChild");
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `ServerPath` has no concrete subclass
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
 * Taken from team-explorer-everywhere: source/com.microsoft.tfs.core/src/com/microsoft/tfs/core/clients/versioncontrol/path/ServerPath.java
 */
public abstract class ServerPath {
    private static final Logger logger = LoggerFactory.getLogger(ServerPath.class);

```

### AbstractClassNeverImplemented
Abstract class `LocalPath` has no concrete subclass
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
 * Taken from team-explorer-everywhere: source/com.microsoft.tfs.core/src/com/microsoft/tfs/core/clients/versioncontrol/path/LocalPath.java
 */
public abstract class LocalPath {
    public final static char TFS_PREFERRED_LOCAL_PATH_SEPARATOR = '\\';

```

### AbstractClassNeverImplemented
Abstract class `RootsCollection` has no concrete subclass
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/RootsCollection.java`
#### Snippet
```java
import java.util.Collection;

public abstract class RootsCollection<T> {

    public static class FilePathRootsCollection extends DistinctRootsCollection<FilePath> {
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Future`
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java
    }

    public void wait(List<Future> futures) {
        //TODO: can we call get on the futures in parallel. If there are multiple ones that timeout, overall timeout might be long
        Throwable t = null;
```

### BoundedWildcard
Can generalize to `? extends ItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LabelItemsTableModel.java`
#### Snippet
```java
    }

    public void setItems(final @NotNull List<ItemInfo> items) {
        this.items = items;
        fireTableDataChanged();
```

### BoundedWildcard
Can generalize to `? extends WorkItem`
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
        private final ServerContext context;

        public WitResults(final ServerContext context, final List<WorkItem> workItems) {
            assert workItems != null;
            this.workItems = workItems;
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ConflictsTableModel.java`
#### Snippet
```java
    }

    public void setConflicts(final List<Conflict> conflicts) {
        myConflicts.clear();
        myConflicts.addAll(conflicts);
```

### BoundedWildcard
Can generalize to `? extends ExtendedItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java
    }

    private static boolean canAllBeUnlocked(List<ExtendedItemInfo> items) {
        for (ExtendedItemInfo item : items) {
            final LockCommand.LockLevel level = LockCommand.LockLevel.fromString(item.getLock());
```

### BoundedWildcard
Can generalize to `? extends ExtendedItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java
    }

    private static boolean canAllBeLocked(List<ExtendedItemInfo> items) {
        for (ExtendedItemInfo item : items) {
            final LockCommand.LockLevel level = LockCommand.LockLevel.fromString(item.getLock());
```

### BoundedWildcard
Can generalize to `? extends BuildStatusRecord`
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
        private final List<BuildStatusRecord> builds;

        public BuildStatusResults(final ServerContext context, final List<BuildStatusRecord> builds) {
            logger.info("Creating build status results.");
            logger.info("   builds = " + builds);
```

### BoundedWildcard
Can generalize to `? extends TeamProjectReference`
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
    }

    protected void addTeamProjectResults(final List<TeamProjectReference> projects, final ServerContext context, final TeamProjectCollectionReference teamProjectCollectionReference) {
        final List<ServerContext> serverContexts = new ArrayList<ServerContext>(projects.size());

```

### BoundedWildcard
Can generalize to `? extends GitRepository`
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
    }

    protected void addRepositoryResults(final List<GitRepository> gitRepositories, final ServerContext context, final TeamProjectCollectionReference teamProjectCollectionReference) {
        final List<ServerContext> serverContexts = new ArrayList<ServerContext>(gitRepositories.size());
        for (final GitRepository gitRepository : gitRepositories) {
```

### BoundedWildcard
Can generalize to `? extends TeamProjectCollectionReference`
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
    }

    protected void doLookup(final ServerContext context, final List<TeamProjectCollectionReference> collections) {
        for (final TeamProjectCollectionReference teamProjectCollectionReference : collections) {
            if (isCancelled()) {
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
    }

    public void setMappings(final List<Workspace.Mapping> mappings) {
        if (mappings != null) {
            final List<Row> rows = new ArrayList<Row>(mappings.size());
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
        private final SettableFuture<Boolean> flushed;

        public StreamProcessor(final InputStream stream, final boolean isStandardError, final Listener listener, final SettableFuture<Boolean> flushed) {
            ArgumentHelper.checkNotNull(stream, "stream");
            ArgumentHelper.checkNotNull(listener, "listener");
```

### BoundedWildcard
Can generalize to `? super String`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeContext.java`
#### Snippet
```java
    private final Condition<String> filter;

    public TfsTreeContext(final ServerContext serverContext, final boolean foldersOnly, final Condition<String> filter) {
        this.serverContext = serverContext;
        this.foldersOnly = foldersOnly;
```

### BoundedWildcard
Can generalize to `? extends TfsFileRevision`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSHistoryProvider.java`
#### Snippet
```java

    private static VcsAbstractHistorySession createSession(final VcsRevisionNumber currentRevisionNumber,
                                                           final List<TfsFileRevision> revisions,
                                                           final boolean isFile) {
        return new VcsAbstractHistorySession(revisions) {
```

### BoundedWildcard
Can generalize to `? super Couple`>
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcCommands.java`
#### Snippet
```java
            @Nullable Path workingDirectory,
            @NotNull List<String> arguments,
            @NotNull Function<Couple<List<String>>, T> action) {
        CompletableFuture<T> result = new CompletableFuture<>();
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcCommands.java`
#### Snippet
```java
            @Nullable Path workingDirectory,
            @NotNull List<String> arguments,
            @NotNull Function<Couple<List<String>>, T> action) {
        CompletableFuture<T> result = new CompletableFuture<>();
        try {
```

### BoundedWildcard
Can generalize to `? extends WorkItem`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
    }

    public void addWorkItems(final List<WorkItem> workItems) {
        // TODO Remember selection
        //final List<WorkItem> selectedItems = getSelectedWorkItems();
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
    }

    public static List<Conflict> resolveConflictsByConflict(final ServerContext context, final List<Conflict> conflicts, final ResolveConflictsCommand.AutoResolveType type) {
        final List<String> conflictFiles = new ArrayList<String>();
        for (final Conflict conflict : conflicts) {
```

### BoundedWildcard
Can generalize to `? extends ChangeSet`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @return
     */
    private static boolean doesChangeSetHaveChanges(final List<ChangeSet> changeSets, final int index) {
        if (changeSets == null
                || index >= changeSets.size()
```

### BoundedWildcard
Can generalize to `? super java.nio.file.Path`
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteCommand.java`
#### Snippet
```java
    }

    private void parseStdOut(String stdout, List<java.nio.file.Path> deletedPaths) {
        final String[] lines = getLines(stdout);
        String path = StringUtils.EMPTY;
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfIgnoreUtil.java`
#### Snippet
```java
     */
    @Nullable
    public static File findNearestOrRootTfIgnore(@NotNull Collection<Workspace.Mapping> mappings, @NotNull File file) {
        List<LocalFilePath> localRoots = mappings.stream()
                .map(m -> new LocalFilePath(m.getLocalPath(), Files.isDirectory(Paths.get(m.getLocalPath()))))
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static void markDirty(final Project project, final Collection<FilePath> roots, final Collection<FilePath> files) {
        if (roots.isEmpty() && files.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static void markDirty(final Project project, final Collection<FilePath> roots, final Collection<FilePath> files) {
        if (roots.isEmpty() && files.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static List<FilePath> getFilePaths(@NotNull final Collection<VirtualFile> files) {
        List<FilePath> paths = new ArrayList<FilePath>(files.size());
        for (VirtualFile f : files) {
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static List<String> getFilePathStrings(@NotNull final Collection<VirtualFile> files) {
        List<String> paths = new ArrayList<String>(files.size());
        for (VirtualFile f : files) {
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static void markDirtyRecursively(final Project project, final Collection<FilePath> roots) {
        if (roots.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     * working folder mapping was found
     */
    public static String translateServerItemToLocalItem(final List<Workspace.Mapping> mappings, final String serverPath, boolean checkForIllegalDollar) {
        ArgumentHelper.checkNotEmptyString(serverPath, "serverPath");
        ArgumentHelper.checkNotNull(mappings, "mappings");
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static void refreshAndMarkDirty(final Project project, final Collection<VirtualFile> roots, boolean async) {
        refreshAndMarkDirty(project, VfsUtil.toVirtualFileArray(roots), async);
    }
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    public static String translateLocalItemToServerItem(
            final String localPath,
            final List<Workspace.Mapping> mappings) {
        ArgumentHelper.checkNotEmptyString(localPath, "localPath");
        ArgumentHelper.checkNotNull(mappings, "mappings");
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    }

    public static void setReadOnly(final Collection<VirtualFile> files, final boolean status) throws IOException {
        final Ref<IOException> exception = new Ref<IOException>();
        try {
```

### BoundedWildcard
Can generalize to `? extends HelpPopupCommand`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java

    private class HelpToolTip extends JPanel {
        public HelpToolTip(final String wrappingText, final List<HelpPopupCommand> popupCommands, final int preferredWidth) {
            IdeTooltipManager.setColors(this);
            this.setLayout(new GridBagLayout());
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
    }

    private void removeInvalidTFVCAddedFiles(List<VirtualFile> addedFiles) {
        Map<VirtualFile, FilePath> addedFilePaths = addedFiles.stream()
                .collect(Collectors.toMap(vf -> vf, vf -> new LocalFilePath(vf.getPath(), vf.isDirectory())));
```

### BoundedWildcard
Can generalize to `? super ItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            @NotNull ServerContext serverContext,
            @NotNull List<String> pathsToProcess,
            @NotNull Consumer<ItemInfo> onItemReceived) {
        return getExtendedItemsInfoAsync(project, serverContext, pathsToProcess, onItemReceived::accept);
    }
```

### BoundedWildcard
Can generalize to `? extends Path`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            @Nullable Project project,
            @NotNull ServerContext serverContext,
            @NotNull List<Path> files) {
        List<String> pathStrings = files.stream().map(Path::toString).collect(Collectors.toList());
        return CommandUtils.addFiles(serverContext, pathStrings).stream().map(Paths::get).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super ExtendedItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            @NotNull ServerContext serverContext,
            @NotNull List<String> pathsToProcess,
            @NotNull Consumer<ExtendedItemInfo> onItemReceived) {
        List<ExtendedItemInfo> itemInfos = CommandUtils.getItemInfos(serverContext, pathsToProcess);
        itemInfos.forEach(onItemReceived);
```

### BoundedWildcard
Can generalize to `? super ItemInfo`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            @NotNull ServerContext serverContext,
            @NotNull List<String> pathsToProcess,
            @NotNull Consumer<ItemInfo> onItemReceived) {
        getExtendedItemsInfo(project, serverContext, pathsToProcess, onItemReceived::accept);
    }
```

### BoundedWildcard
Can generalize to `? extends ItemPath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/RootsCollection.java`
#### Snippet
```java
        }

        public ItemPathRootsCollection(final Collection<ItemPath> items) {
            super(items);
        }
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/RootsCollection.java`
#### Snippet
```java
        }

        public VirtualFileRootsCollection(final Collection<VirtualFile> items) {
            super(items);
        }
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/RootsCollection.java`
#### Snippet
```java
        }

        public FilePathRootsCollection(final Collection<FilePath> items) {
            super(items);
        }
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TFVCUtil.java`
#### Snippet
```java
     */
    @NotNull
    public static List<String> filterValidTFVCPaths(@NotNull Project project, @NotNull Collection<FilePath> paths) {
        List<FilePath> mappingPaths = getMappingsFromWorkspace(project);
        List<String> filteredPaths = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    }

    private List<FilePath> getFilePaths(final List<VirtualFile> virtualFiles) {
        assert virtualFiles != null;
        final List<FilePath> filePaths = new ArrayList<FilePath>(virtualFiles.size());
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    }

    public TFSChangeList(final List<FilePath> addedFiles, final List<FilePath> deletedFiles, final List<FilePath> renamedFiles,
                         final List<FilePath> editedFiles, final int changeSetId, final String author, final String comment,
                         final String changeSetDate, final int previousChangeSetId, final String previousChangeSetDate,
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    }

    public TFSChangeList(final List<FilePath> addedFiles, final List<FilePath> deletedFiles, final List<FilePath> renamedFiles,
                         final List<FilePath> editedFiles, final int changeSetId, final String author, final String comment,
                         final String changeSetDate, final int previousChangeSetId, final String previousChangeSetDate,
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    }

    public TFSChangeList(final List<FilePath> addedFiles, final List<FilePath> deletedFiles, final List<FilePath> renamedFiles,
                         final List<FilePath> editedFiles, final int changeSetId, final String author, final String comment,
                         final String changeSetDate, final int previousChangeSetId, final String previousChangeSetDate,
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java

    public TFSChangeList(final List<FilePath> addedFiles, final List<FilePath> deletedFiles, final List<FilePath> renamedFiles,
                         final List<FilePath> editedFiles, final int changeSetId, final String author, final String comment,
                         final String changeSetDate, final int previousChangeSetId, final String previousChangeSetDate,
                         final TFSVcs vcs, final String workspaceName) {
```

### BoundedWildcard
Can generalize to `? extends FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    }

    private static void writePaths(final DataOutput stream, final Collection<FilePath> paths) throws IOException {
        stream.writeInt(paths.size());
        for (FilePath path : paths) {
```

### BoundedWildcard
Can generalize to `? super FilePath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    }

    private static void readPaths(final DataInput stream, final Collection<FilePath> paths) throws IOException {
        int count = stream.readInt();
        for (int i = 0; i < count; i++) {
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java

    @VisibleForTesting
    protected void acceptChange(final List<Conflict> conflicts, final ProgressIndicator progressIndicator, final Project project, final ResolveConflictsCommand.AutoResolveType type, final ResolveConflictsModel model) {
        for (final Conflict conflict : conflicts) {
            try {
```

### BoundedWildcard
Can generalize to `? extends Conflict`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
    }

    public void skip(final @NotNull List<Conflict> conflicts) {
        for (final Conflict conflict : conflicts) {
            // JetBrains used null for version number in this case
```

### BoundedWildcard
Can generalize to `? extends CompletionStage`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ReactiveTfvcClient.java`
#### Snippet
```java
    private static <T> CompletionStage<T> traceTime(
            @NotNull String title,
            @NotNull Supplier<CompletionStage<T>> action) {
        long startTime = System.nanoTime();
        return action.get().whenComplete((result, ex) -> {
```

### BoundedWildcard
Can generalize to `? extends ServerContext`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java

    @VisibleForTesting
    protected void setDeleteContexts(final List<ServerContext> deleteContexts) {
        this.deleteContexts.clear();
        this.deleteContexts.addAll(deleteContexts);
```

### BoundedWildcard
Can generalize to `? super T`
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * @param listener
     */
    public void run(final Listener<T> listener) {
        final StringBuilder stdout = new StringBuilder();
        final StringBuilder stderr = new StringBuilder();
```

### BoundedWildcard
Can generalize to `? extends GitRemoteBranch`
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
     */
    @Nullable
    public static GitRemoteBranch getDefaultBranch(@NotNull final List<GitRemoteBranch> remoteBranches, @NotNull final Collection<GitRemote> tfGitRemotes) {
        if (remoteBranches.isEmpty() || tfGitRemotes.isEmpty()) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * This method converts the mappings into a map of server path to mapping.
     */
    public static Map<String, Workspace.Mapping> getMappingsByServerPath(final List<Workspace.Mapping> mappings) {
        ArgumentHelper.checkNotNull(mappings, "mappings");
        final Map<String, Workspace.Mapping> map = new HashMap<String, Workspace.Mapping>(mappings.size());
```

### BoundedWildcard
Can generalize to `? extends Workspace.Mapping`
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * @return
     */
    public static boolean areMappingsDifferent(final List<Workspace.Mapping> mappings1, final List<Workspace.Mapping> mappings2) {
        if (mappings1 == mappings2) {
            // They are the same list (or both null)
```

### BoundedWildcard
Can generalize to `? super String`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/EventContextHelper.java`
#### Snippet
```java
    }

    public static void setRepository(final Map<String,Object> eventContext, final GitRepository repository) {
        ArgumentHelper.checkNotNull(eventContext, "eventContext");
        if (repository == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/EventContextHelper.java`
#### Snippet
```java
    }

    public static void setSender(final Map<String,Object> eventContext, final String sender) {
        ArgumentHelper.checkNotNull(eventContext, "eventContext");
        if (sender == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/EventContextHelper.java`
#### Snippet
```java
    }

    public static void setProject(final Map<String,Object> eventContext, final Project project) {
        ArgumentHelper.checkNotNull(eventContext, "eventContext");
        if (project == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/DeviceFlowResponsePromptImpl.java`
#### Snippet
```java
     */
    @Override
    public Action<DeviceFlowResponse> getCallback(final Action<String> cancellationCallback) {

        return new Action<DeviceFlowResponse>() {
```

### BoundedWildcard
Can generalize to `? super T`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CellRenderer.java`
#### Snippet
```java

public class CellRenderer<T> {
    protected void render(final CustomTreeTable<T> treeTable, final TreeTableColumn<T> column, final T value, final JLabel cell) {
        cell.setText(column.getPresentableString(value));
    }
```

### BoundedWildcard
Can generalize to `? extends Path`
in `plugin/src/com/microsoft/alm/plugin/external/commands/CheckoutCommand.java`
#### Snippet
```java
    public CheckoutCommand(
            @NotNull ServerContext context,
            @NotNull List<Path> filePaths,
            boolean recursive) {
        super("checkout", context);
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/IdeaFileSelector.java`
#### Snippet
```java
    public Collection<VirtualFile> selectFiles(
            Project project,
            List<VirtualFile> originalFiles,
            @Nls String prompt,
            VcsShowConfirmationOption confirmationOption,
```

### BoundedWildcard
Can generalize to `? extends ServerContext`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    }

    public void addServerContexts(final List<ServerContext> contexts) {
        // Remember selection
        final ServerContext selectedContext = getSelectedContext();
```

### BoundedWildcard
Can generalize to `? extends GitPullRequest`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTreeModel.java`
#### Snippet
```java
    }

    public void appendPullRequests(final List<GitPullRequest> pullRequests, final PullRequestLookupOperation.PullRequestScope scope) {
        final PRTreeNode rootNode;

```

### BoundedWildcard
Can generalize to `? extends T`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CustomTreeTable.java`
#### Snippet
```java

    private static <T> TreeTableModel createModel(final Collection<? extends TreeTableColumn<T>> columns,
                                                  final ContentProvider<T> contentProvider) {
        final Collection<ColumnInfo> columnsInfos = new ArrayList<ColumnInfo>(columns.size());
        boolean first = true;
```

### BoundedWildcard
Can generalize to `? extends QueryHierarchyItem`
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemQueriesLookupOperation.java`
#### Snippet
```java
        private final QueryInputs inputs;

        public QueryResults(final List<QueryHierarchyItem> queries, final QueryInputs inputs) {
            this.queries = queries;
            this.inputs = inputs;
```

### BoundedWildcard
Can generalize to `? extends ServerContext`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * @return
     */
    public void updateServerContextsAuthInfo(final List<ServerContext> contexts) {
        logger.info("updateServerContextsAuthInfo: starting with context count: " + contexts.size() + ", contextMap size: " + contextMap.size());
        final HashMap<AuthenticationInfo, AuthenticationInfo> authInfoMap = new HashMap<AuthenticationInfo, AuthenticationInfo>(contexts.size());
```

### BoundedWildcard
Can generalize to `? extends AuthenticationInfo`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * @param authInfoMap: keys are old auth infos and the values are the new auth infos
     */
    private void refreshAuthInfo(final HashMap<AuthenticationInfo, AuthenticationInfo> authInfoMap) {
        logger.info("refreshAuthInfo: refreshing auth info");
        for (final ServerContext context : getAllServerContexts()) {
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeContext.java`
#### Snippet
```java
    private final Condition<String> filter;

    public TfsTreeContext(final ServerContext serverContext, final boolean foldersOnly, final Condition<String> filter) {
        this.serverContext = serverContext;
        this.foldersOnly = foldersOnly;
```

### NullableProblems
Primitive type members cannot be annotated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
    }

    @Nullable
    public byte[] doGetContent() throws VcsException {
        if (myContent == null) {
```

### NullableProblems
Primitive type members cannot be annotated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
    private final Project project;

    @Nullable
    private byte[] myContent;

```

### NullableProblems
Primitive type members cannot be annotated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
    }

    @Nullable
    private byte[] loadContent() throws TfsException, IOException {
        ArgumentHelper.checkNotNull(getFile(), "localPath");
```

### NullableProblems
Constructor parameter for @NotNull field might be annotated @NotNull itself
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
    public ResolveConflictHelper(@NotNull final Project project,
                                 @Nullable final UpdatedFiles updatedFiles,
                                 final List<String> updateRoots,
                                 final MergeResults mergeResults) {
        this.project = project;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                                 @Nullable final UpdatedFiles updatedFiles,
                                 final List<String> updateRoots,
                                 final MergeResults mergeResults) {
        this.project = project;
        this.updatedFiles = updatedFiles;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
    protected ServerStatus(final int localVer,
                           final boolean isDirectory,
                           final String sourceItem,
                           final String targetItem,
                           final String modicationDate) {
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
                           final boolean isDirectory,
                           final String sourceItem,
                           final String targetItem,
                           final String modicationDate) {
        this.localVer = localVer;
```

### NullableProblems
Primitive type members cannot be annotated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TfsFileRevision.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public byte[] getContent() throws IOException, VcsException {
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java

    private static class Holder {
        private final static TfsAuthenticationProvider INSTANCE = new TfsAuthenticationProvider();
    }

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java

    private final static String USER_NAME = "user.name";
    public final static String TFS_LAST_USED_URL = "http://_TFS_LAST_USED_URL_";

    private static class Holder {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(TfsAuthenticationProvider.class);

    private final static String USER_NAME = "user.name";
    public final static String TFS_LAST_USED_URL = "http://_TFS_LAST_USED_URL_";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
 */
public class AuthHelper {
    private final static Logger logger = LoggerFactory.getLogger(AuthHelper.class);

    private static String DEVICE_FLOW_PROPERTY = "userAgentProvider";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java

    private static class Holder {
        public final static OperationExecutor INSTANCE = new OperationExecutor();
    }

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ModelValidationInfo.java`
#### Snippet
```java

public class ModelValidationInfo {
    public final static ModelValidationInfo NO_ERRORS = null;

    final boolean lookupResource;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextBuilder.java`
#### Snippet
```java

public class ServerContextBuilder {
    private final static Logger logger = LoggerFactory.getLogger(ServerContextBuilder.class);

    private ServerContext.Type type;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/extensions/VcsWorkItemContentProvider.java`
#### Snippet
```java
 */
public class VcsWorkItemContentProvider implements ChangesViewContentProvider {
    private final static Logger logger = LoggerFactory.getLogger(VcsWorkItemContentProvider.class);

    private VcsWorkItemsController controller;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/VsoAuthInfoProvider.java`
#### Snippet
```java

public class VsoAuthInfoProvider implements AuthenticationInfoProvider {
    private final static Logger logger = LoggerFactory.getLogger(VsoAuthInfoProvider.class);

    private static final String CLIENT_ID = "97877f11-0fc6-4aee-b1ff-febb0519dd00";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @return Stripped {@link StringBuilder} (may be empty)
     */
    private final static StringBuilder cleanupComponent(final StringBuilder s) {
        while (s.length() > 0
                && (s.charAt(s.length() - 1) == '.' || Character.isWhitespace(s.charAt(s.length() - 1)))) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @return true if possibleChild is a child of parentPath.
     */
    public final static boolean isChild(String parentPath, String possibleChild, boolean checkForIllegalDollar) throws ServerPathFormatException {
        ArgumentHelper.checkNotNull(parentPath, "parentPath");
        ArgumentHelper.checkNotNull(possibleChild, "possibleChild");
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * (file/folder), false if not.
     */
    public final static boolean isValidPathCharacter(final char c) {
        final char[] invalidCharacters = {
                '"',
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * Includes $/ at beginning.
     */
    public final static int MAX_SERVER_PATH_SIZE = 399;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * otherwise.
     */
    public final static boolean isSeparator(final char c) {
        for (int i = 0; i < ServerPath.SEPARATOR_CHARACTERS.length; i++) {
            if (ServerPath.SEPARATOR_CHARACTERS[i] == c) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
     * @throws ServerPathFormatException when the path cannot be cleaned up.
     */
    public final static String canonicalize(String serverPath, boolean checkForIllegalDollar) throws ServerPathFormatException {
        ArgumentHelper.checkNotNull(serverPath, "serverPath");

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
    public final static char TFS_PREFERRED_LOCAL_PATH_SEPARATOR = '\\';

    public final static String GENERAL_LOCAL_PATH_SEPARATOR = "/";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
     *                 <code>null</code>)
     */
    public final static String combine(final String parent, final String relative) {
        ArgumentHelper.checkNotNull(parent, "parent");
        ArgumentHelper.checkNotNull(relative, "relative");
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
 */
public abstract class LocalPath {
    public final static char TFS_PREFERRED_LOCAL_PATH_SEPARATOR = '\\';

    public final static String GENERAL_LOCAL_PATH_SEPARATOR = "/";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
     * (including I/O errors accessing either path).
     */
    public final static boolean isChild(final String parentPath, final String possibleChild) {
        ArgumentHelper.checkNotNull(parentPath, "parentPath");
        ArgumentHelper.checkNotNull(possibleChild, "possibleChild");
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/DateHelper.java`
#### Snippet
```java
 */
public class DateHelper {
    private final static Logger logger = LoggerFactory.getLogger(DateHelper.class);

    public static String getFriendlyDateTimeString(final Date date) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
public class SystemHelper {
    private static Logger logger = LoggerFactory.getLogger(SystemHelper.class);
    private final static String COMPUTER_NAME = "computername";

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/common/utils/FileHelper.java`
#### Snippet
```java
     * you will likely need to modify IsReservedName
     */
    private final static String[] RESERVED_NAMES_LENGTH3 = {
            "CON",
            "PRN",
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/common/utils/FileHelper.java`
#### Snippet
```java
     */
    // @formatter:off
    public final static boolean[] VALID_NTFS_FILE_NAME_CHAR_TABLE = {
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
    private final URI endpointUri;

    private final static String SOAP = "http://www.w3.org/2003/05/soap-envelope"; //$NON-NLS-1$

    private static final String ENDPOINT_PATH = "/TeamFoundation/Administration/v3.0/CatalogService.asmx"; //$NON-NLS-1$
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
     * The default converter simply returns the index given.
     */
    private final static TableModelSelectionConverter DEFAULT_CONVERTER = new TableModelSelectionConverter() {
        @Override
        public int convertRowIndexToModel(int viewRowIndex) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
public class EULADialog extends DialogWrapper {
    private static boolean isDialogOnScreen = false;
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(EULADialog.class);
    private static boolean myWasShow = false;
    private final JBScrollPane myScrollPane;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
 */
public abstract class Operation {
    public final static Inputs EMPTY_INPUTS = null;

    public enum State {NOT_STARTED, STARTED, CANCELLED, COMPLETED}
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/TfsImportPageModel.java`
#### Snippet
```java
public class TfsImportPageModel extends ImportPageModelImpl {
    private AuthenticationProvider authenticationProvider;
    private final static Logger logger = LoggerFactory.getLogger(TfsImportPageModel.class);


```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java

    public final static String PROP_VSO_SELECTED = "vsoSelected";
    public final static String PROP_IMPORT_ENABLED = "importEnabled";

    public ImportModel(final Project project) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java
    private final Project project;

    public final static String PROP_VSO_SELECTED = "vsoSelected";
    public final static String PROP_IMPORT_ENABLED = "importEnabled";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private final static String REMOTE_ORIGIN = "origin";
    private final static String PROJECT_CAPABILITY_VC = "versioncontrol";
    private final static String PROJECT_CAPABILITY_VC_TYPE = "sourceControlType";
    private final static String PROJECT_CAPABILITY_VC_GIT = "Git";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private final ServerContextLookupListener teamProjectProvider;

    private final static String ACTION_NAME = "import";
    private final static String REMOTE_ORIGIN = "origin";
    private final static String PROJECT_CAPABILITY_VC = "versioncontrol";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private final static String PROJECT_CAPABILITY_VC = "versioncontrol";
    private final static String PROJECT_CAPABILITY_VC_TYPE = "sourceControlType";
    private final static String PROJECT_CAPABILITY_VC_GIT = "Git";

    public ImportPageModelImpl(final ImportModel importModel, final ServerContextTableModel.Column[] columns) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private final static String ACTION_NAME = "import";
    private final static String REMOTE_ORIGIN = "origin";
    private final static String PROJECT_CAPABILITY_VC = "versioncontrol";
    private final static String PROJECT_CAPABILITY_VC_TYPE = "sourceControlType";
    private final static String PROJECT_CAPABILITY_VC_GIT = "Git";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

    private final static String ACTION_NAME = "import";
    private final static String REMOTE_ORIGIN = "origin";
    private final static String PROJECT_CAPABILITY_VC = "versioncontrol";
    private final static String PROJECT_CAPABILITY_VC_TYPE = "sourceControlType";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    private final static short REVIEWER_VOTE_NO_RESPONSE = 0;
    private final static short REVIEWER_VOTE_APPROVED_WITH_SUGGESTIONS = 5;
    private final static short REVIEWER_VOTE_APPROVED = 10;
    private final static short REVIEWER_VOTE_WAITING_FOR_AUTHOR = -5;
    private final static short REVIEWER_VOTE_REJECTED = -10;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    private final static short REVIEWER_VOTE_APPROVED_WITH_SUGGESTIONS = 5;
    private final static short REVIEWER_VOTE_APPROVED = 10;
    private final static short REVIEWER_VOTE_WAITING_FOR_AUTHOR = -5;
    private final static short REVIEWER_VOTE_REJECTED = -10;

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    private final static short REVIEWER_VOTE_APPROVED = 10;
    private final static short REVIEWER_VOTE_WAITING_FOR_AUTHOR = -5;
    private final static short REVIEWER_VOTE_REJECTED = -10;

    private PRTreeNodeForm prViewForm;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    public final static String GIT_REFS_HEADS = "refs/heads/";
    private final static short REVIEWER_VOTE_NO_RESPONSE = 0;
    private final static short REVIEWER_VOTE_APPROVED_WITH_SUGGESTIONS = 5;
    private final static short REVIEWER_VOTE_APPROVED = 10;
    private final static short REVIEWER_VOTE_WAITING_FOR_AUTHOR = -5;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
public class PRTreeCellRenderer extends DefaultTreeCellRenderer {
    public final static String GIT_REFS_HEADS = "refs/heads/";
    private final static short REVIEWER_VOTE_NO_RESPONSE = 0;
    private final static short REVIEWER_VOTE_APPROVED_WITH_SUGGESTIONS = 5;
    private final static short REVIEWER_VOTE_APPROVED = 10;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
 */
public class PRTreeCellRenderer extends DefaultTreeCellRenderer {
    public final static String GIT_REFS_HEADS = "refs/heads/";
    private final static short REVIEWER_VOTE_NO_RESPONSE = 0;
    private final static short REVIEWER_VOTE_APPROVED_WITH_SUGGESTIONS = 5;
```

### MissortedModifiers
Missorted modifiers `synchronized static`
in `plugin/src/com/microsoft/alm/plugin/external/reactive/RdIdeaLoggerFactory.java`
#### Snippet
```java
    private static final RdIdeaLoggerFactory INSTANCE = new RdIdeaLoggerFactory();

    public synchronized static void initialize() {
        if (!initialized) {
            Statics.Companion.of(JvmClassMappingKt.getKotlinClass(ILoggerFactory.class)).push(INSTANCE);
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java
    private final CheckoutPageController tfsController;
    public final static int TAB_VSO = 0;
    public final static int TAB_TFS = 1;

    public CheckoutController(final Project project, final CheckoutProvider.Listener listener, final VcsSpecificCheckoutModel specificCheckoutModel) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java
    private final CheckoutPageController vsoController;
    private final CheckoutPageController tfsController;
    public final static int TAB_VSO = 0;
    public final static int TAB_TFS = 1;

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
    public final static String DEFAULT_SOURCE_PATH = System.getProperty("user.home");
    public final static String PROP_DIRECTORY_NAME = "directoryName";
    public final static String PROP_PARENT_DIR = "parentDirectory";
    public final static String COMMANDLINE_CLONE_ACTION = "commandline-clone";
    public final static Pattern GIT_URL_PATTERN = Pattern.compile("/_git/(.*)");
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

    public final static String DEFAULT_SOURCE_PATH = System.getProperty("user.home");
    public final static String PROP_DIRECTORY_NAME = "directoryName";
    public final static String PROP_PARENT_DIR = "parentDirectory";
    public final static String COMMANDLINE_CLONE_ACTION = "commandline-clone";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(SimpleCheckoutModel.class);

    public final static String DEFAULT_SOURCE_PATH = System.getProperty("user.home");
    public final static String PROP_DIRECTORY_NAME = "directoryName";
    public final static String PROP_PARENT_DIR = "parentDirectory";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
    public final static String PROP_DIRECTORY_NAME = "directoryName";
    public final static String PROP_PARENT_DIR = "parentDirectory";
    public final static String COMMANDLINE_CLONE_ACTION = "commandline-clone";
    public final static Pattern GIT_URL_PATTERN = Pattern.compile("/_git/(.*)");
    private final static String MASTER_BRANCH = "master";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
    public final static String PROP_PARENT_DIR = "parentDirectory";
    public final static String COMMANDLINE_CLONE_ACTION = "commandline-clone";
    public final static Pattern GIT_URL_PATTERN = Pattern.compile("/_git/(.*)");
    private final static String MASTER_BRANCH = "master";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
    public final static String COMMANDLINE_CLONE_ACTION = "commandline-clone";
    public final static Pattern GIT_URL_PATTERN = Pattern.compile("/_git/(.*)");
    private final static String MASTER_BRANCH = "master";

    private final Project project;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/forms/FeedbackForm.java`
#### Snippet
```java

public class FeedbackForm {
    public final static String CMD_GOTO_PRIVACY = "gotoPrivacy";

    private JTextArea comment;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
    public final static String PROP_LOADING = "loading";
    public final static String PROP_FILTER = "filter";
    public final static String PROP_SERVER_NAME = "serverName";

    private final WorkItemsTableModel tableModel;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(SelectWorkItemsModel.class);

    public final static String PROP_LOADING = "loading";
    public final static String PROP_FILTER = "filter";
    public final static String PROP_SERVER_NAME = "serverName";
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java

    public final static String PROP_LOADING = "loading";
    public final static String PROP_FILTER = "filter";
    public final static String PROP_SERVER_NAME = "serverName";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
    private final VcsSpecificCheckoutModel specificCheckoutModel;

    public final static String PROP_VSO_SELECTED = "vsoSelected";
    public final static String PROP_CLONE_ENABLED = "cloneEnabled";

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java

    public final static String PROP_VSO_SELECTED = "vsoSelected";
    public final static String PROP_CLONE_ENABLED = "cloneEnabled";

    public CheckoutModel(final Project project, final CheckoutProvider.Listener listener, final VcsSpecificCheckoutModel specificCheckoutModel) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public final static Column[] TFS_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.COLLECTION};
    public final static Column[] GENERAL_COLUMNS = new Column[]{Column.GENERAL_REPOSITORY, Column.ACCOUNT_URL, Column.USER_NAME};

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
     * The default converter simply returns the index given.
     */
    private final static TableModelSelectionConverter DEFAULT_CONVERTER = new TableModelSelectionConverter() {
        @Override
        public int convertRowIndexToModel(int viewRowIndex) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public enum Column {GIT_REPOSITORY, TFVC_REPOSITORY, PROJECT, COLLECTION, ACCOUNT, GENERAL_REPOSITORY, USER_NAME, ACCOUNT_URL}

    public final static Column[] VSO_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java

    public final static Column[] VSO_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.COLLECTION};
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public final static Column[] VSO_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.COLLECTION};
    public final static Column[] GENERAL_COLUMNS = new Column[]{Column.GENERAL_REPOSITORY, Column.ACCOUNT_URL, Column.USER_NAME};

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public final static Column[] TFS_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.COLLECTION};
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public final static Column[] VSO_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.COLLECTION};
    public final static Column[] GENERAL_COLUMNS = new Column[]{Column.GENERAL_REPOSITORY, Column.ACCOUNT_URL, Column.USER_NAME};
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    public final static Column[] VSO_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_GIT_REPO_COLUMNS = new Column[]{Column.GIT_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.ACCOUNT};
    public final static Column[] TFS_TFVC_REPO_COLUMNS = new Column[]{Column.TFVC_REPOSITORY, Column.PROJECT, Column.COLLECTION};
    public final static Column[] VSO_PROJECT_COLUMNS = new Column[]{Column.PROJECT, Column.ACCOUNT};
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/VcsPullRequestContentProvider.java`
#### Snippet
```java
 */
public class VcsPullRequestContentProvider implements ChangesViewContentProvider {
    private final static Logger logger = LoggerFactory.getLogger(VcsPullRequestContentProvider.class);

    private VcsPullRequestsController controller;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportController.java`
#### Snippet
```java

    public final static int TAB_VSO = 0;
    public final static int TAB_TFS = 1;

    public ImportController(final Project project) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportController.java`
#### Snippet
```java
    private final ImportPageController tfsPageController;

    public final static int TAB_VSO = 0;
    public final static int TAB_TFS = 1;

```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    protected static class Validator implements UrlHelper.ParseResultValidator {
        private final static String TFVC_BRANCHES_URL_PATH = "/_apis/tfvc/branches";
        private final static String REPO_INFO_URL_PATH = "/vsts/info";
        private String serverUrl;
        private final ServerContext context;
```

### MissortedModifiers
Missorted modifiers `final static`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java

    protected static class Validator implements UrlHelper.ParseResultValidator {
        private final static String TFVC_BRANCHES_URL_PATH = "/_apis/tfvc/branches";
        private final static String REPO_INFO_URL_PATH = "/vsts/info";
        private String serverUrl;
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.setExecutable()` is ignored
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
        // set the executable to execute for all users
        if (!executable.canExecute()) {
            executable.setExecutable(true, false);
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSTmpFileStore.java`
#### Snippet
```java
        if (myTfsTmpDir == null) {
            File tmpDir = FileUtil.createTempFile(TMP_FILE_NAME, "");
            tmpDir.delete();
            tmpDir.mkdir();
            tmpDir.deleteOnExit();
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSTmpFileStore.java`
#### Snippet
```java
            File tmpDir = FileUtil.createTempFile(TMP_FILE_NAME, "");
            tmpDir.delete();
            tmpDir.mkdir();
            tmpDir.deleteOnExit();
            myTfsTmpDir = tmpDir.getAbsolutePath();
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
        final File vstsDirectory = new File(parent, VSTS_DIR);
        if (!vstsDirectory.exists()) {
            vstsDirectory.mkdir();
        }
        return vstsDirectory;
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
            // if file doesn't exist create it else read the entries in it
            if (!locationsFile.exists()) {
                locationsFile.createNewFile();
            } else {
                String line;
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `setOkEnabled()` only delegates to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java

    @Override
    public void setOkEnabled(final boolean enabled) {
        super.setOkEnabled(enabled);
    }
```

### RedundantMethodOverride
Method `displayError()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java

    @Override
    public void displayError(final String message) {
        setErrorText(message);
    }
```

### RedundantMethodOverride
Method `checkedOutForEdit()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
        for (final PendingChange pendingChange : pendingChanges) {
            StatusProvider.visitByStatus(new StatusProvider.StatusAdapter() {
                public void checkedOutForEdit(final @NotNull FilePath localPath,
                                              final boolean localItemExists,
                                              final @NotNull ServerStatus serverStatus) {
```

### RedundantMethodOverride
Method `scheduledForDeletion()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void scheduledForDeletion(final @NotNull FilePath localPath,
                                                 final boolean localItemExists,
                                                 final @NotNull ServerStatus serverStatus) {
```

### RedundantMethodOverride
Method `renamed()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void renamed(final @NotNull FilePath localPath, final boolean localItemExists, final @NotNull ServerStatus serverStatus) {
                    // TODO (JetBrains): add local conflict
                }
```

### RedundantMethodOverride
Method `undeleted()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void undeleted(final @NotNull FilePath localPath,
                                      final boolean localItemExists,
                                      final @NotNull ServerStatus serverStatus) {
```

### RedundantMethodOverride
Method `renamedCheckedOut()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void renamedCheckedOut(final @NotNull FilePath localPath,
                                              final boolean localItemExists,
                                              final @NotNull ServerStatus serverStatus) {
```

### RedundantMethodOverride
Method `setOkEnabled()` only delegates to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java

    @Override
    public void setOkEnabled(final boolean enabled) {
        super.setOkEnabled(enabled);
    }
```

### RedundantMethodOverride
Method `displayError()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java

    @Override
    public void displayError(final String message) {
        setErrorText(message);
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                locationId,
                routeValues,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TfvcItem>>() {
        });
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
            logger.debug("doLookup: Found {} pull requests {} on repo {}", pullRequests.size(), scope.toString(), context.getGitRepository().getRemoteUrl());
            results.pullRequests.addAll(pullRequests);
            super.onLookupResults(results);

        } catch (Throwable t) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
        });

        super.onLookupResults(new WitResults(context, items));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java
    public SimpleCheckoutDialog(final Project project, final String title, final String okButtonText, final String feedbackContext) {
        super(project, title, okButtonText, feedbackContext);
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java
        super(project, title, okButtonText, feedbackContext);
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (WorkspaceHelper.areMappingsDifferent(this.mappings, mappings)) {
            this.mappings = mappings;
            super.setChangedAndNotify(PROP_MAPPINGS);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (this.location != location) {
            this.location = location;
            super.setChangedAndNotify(PROP_LOCATION);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (!StringUtils.equals(this.server, server)) {
            this.server = server;
            super.setChangedAndNotify(PROP_SERVER);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (!StringUtils.equals(this.name, name)) {
            this.name = name;
            super.setChangedAndNotify(PROP_NAME);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (!StringUtils.equals(this.owner, owner)) {
            this.owner = owner;
            super.setChangedAndNotify(PROP_OWNER);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (!StringUtils.equals(this.computer, computer)) {
            this.computer = computer;
            super.setChangedAndNotify(PROP_COMPUTER);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        if (!StringUtils.equals(this.comment, comment)) {
            this.comment = comment;
            super.setChangedAndNotify(PROP_COMMENT);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetLocalPathCommand.java`
#### Snippet
```java
    @Override
    public String parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);
        return stdout.trim();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/PageModelImpl.java`
#### Snippet
```java
    public void addError(final ModelValidationInfo error) {
        errors.add(error);
        super.setChangedAndNotify(PROP_ERRORS);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/PageModelImpl.java`
#### Snippet
```java
        if (hasErrors()) {
            errors.clear();
            super.setChangedAndNotify(PROP_ERRORS);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/AbstractModel.java`
#### Snippet
```java

    protected void setChangedAndNotify(final String propertyName) {
        super.setChanged();
        super.notifyObservers(propertyName);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/AbstractModel.java`
#### Snippet
```java
    protected void setChangedAndNotify(final String propertyName) {
        super.setChanged();
        super.notifyObservers(propertyName);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
            filteredRows = Lists.newArrayList(Collections2.filter(rows, this::rowContains));
        }
        super.fireTableDataChanged();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
        filteredRows = null;
        rows.clear();
        super.fireTableDataChanged();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
        } else {
            // Fire an event letting callers know
            super.fireTableDataChanged();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetLabelsCommand.java`
#### Snippet
```java
        }

        final NodeList nodes = super.evaluateXPath(stdout, "/labels/label");

        // Convert all the xpath nodes to label models
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageController.java`
#### Snippet
```java
            // Asynchronously query for repositories, will prompt for login if needed
            model.loadRepositories();
            super.requestFocus(page);
        } else if (CheckoutForm.CMD_REFRESH.equals(e.getActionCommand())) {
            // Reload the table (the refresh button shouldn't be visible if the query is currently running)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageController.java`
#### Snippet
```java
            model.setConnected(false);
            model.signOut();
            super.requestFocus(page);
        } else if (CheckoutForm.CMD_REPO_FILTER_CHANGED.equals(e.getActionCommand())) {
            // No action needed here. We updated the model above which should filter the list automatically.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java
    @Override
    public Workspace parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);

        final NodeList workspaceNodeList = super.evaluateXPath(stdout, "/workspaces/workspace");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java
        super.throwIfError(stderr);

        final NodeList workspaceNodeList = super.evaluateXPath(stdout, "/workspaces/workspace");
        if (workspaceNodeList != null && workspaceNodeList.getLength() == 1) {
            final NamedNodeMap workspaceAttributes = workspaceNodeList.item(0).getAttributes();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java
            final NamedNodeMap workspaceAttributes = workspaceNodeList.item(0).getAttributes();
            // Get all the mappings for the workspace
            final NodeList mappingsNodeList = super.evaluateXPath(stdout, "/workspaces/workspace/working-folder");
            final List<Workspace.Mapping> mappings = new ArrayList<Workspace.Mapping>(mappingsNodeList.getLength());
            for (int i = 0; i < mappingsNodeList.getLength(); i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java
        if (importEnabledForTfs != value) {
            importEnabledForTfs = value;
            super.setChangedAndNotify(PROP_IMPORT_ENABLED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java
        if (vsoSelected != value) {
            vsoSelected = value;
            super.setChangedAndNotify(PROP_VSO_SELECTED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java
        if (importEnabledForVso != value) {
            importEnabledForVso = value;
            super.setChangedAndNotify(PROP_IMPORT_ENABLED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageController.java`
#### Snippet
```java
            // Asynchronously query for projects, will prompt for login if needed
            pageModel.loadTeamProjects();
            super.requestFocus(page);
        } else if (ImportForm.CMD_REFRESH.equals(e.getActionCommand())) {
            // Reload the table (the refresh button shouldn't be visible if the query is currently running)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageController.java`
#### Snippet
```java
            // Go back to a disconnected state
            pageModel.signOut();
            super.requestFocus(page);
        } else if (ImportForm.CMD_PROJECT_FILTER_CHANGED.equals(e.getActionCommand())) {
            // No action needed here. We updated the pageModel above which should filter the list automatically.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java

    protected void initializeUI() {
        super.initializeUI(TfPluginBundle.message(TfPluginBundle.KEY_VCS_WIT_QUERY_TITLE), new JLabel() {
            @Override
            public String getText() {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java
    protected void processFocusEvent(final FocusEvent e) {
        super.processFocusEvent(e);
        super.repaint();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java

    private void notifyActionListeners() {
        if (listeners == null || listeners.size() == 0 || !super.isEnabled()) {
            return;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java
        super("Hyperlink", null);

        super.setListener(new LinkListener<Object>() {
            @Override
            public void linkSelected(final LinkLabel aSource, final Object aLinkData) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/Hyperlink.java`
#### Snippet
```java

        // Make our link focusable via the keyboard (Tab key)
        super.setFocusable(true);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java

            // The base LoginPageModel manages the context for us
            super.completeSignIn(context);

            final VirtualFile destinationParent = LocalFileSystem.getInstance().findFileByIoFile(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteWorkspaceCommand.java`
#### Snippet
```java
        }
        // Throw if there was any other error
        super.throwIfError(stderr);

        // There is no useful output on success
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/DownloadCommand.java`
#### Snippet
```java
            fileContents.append(StringUtils.EMPTY);
        } else {
            super.throwIfError(stderr);
            for (final String line : getLines(stdout, true)) {
                fileContents.append(line);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/UpdateWorkspaceCommand.java`
#### Snippet
```java
    @Override
    public String parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);
        // There is no useful output on success
        return StringUtils.EMPTY;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java
    public CreateBranchDialog(final Project project, final String title, final String okButtonText, final String feedbackContext) {
        super(project, title, okButtonText, feedbackContext);
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java
        super(project, title, okButtonText, feedbackContext);
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java
        super.setTitle(title);
        super.setOKButtonText(okButtonText);
        super.init();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/HistoryCommand.java`
#### Snippet
```java
    @Override
    public List<ChangeSet> parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);
        final List<ChangeSet> changeSets = new ArrayList<ChangeSet>(100);
        final NodeList nodes = super.evaluateXPath(stdout, "/history/changeset");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/HistoryCommand.java`
#### Snippet
```java
        super.throwIfError(stderr);
        final List<ChangeSet> changeSets = new ArrayList<ChangeSet>(100);
        final NodeList nodes = super.evaluateXPath(stdout, "/history/changeset");

        // Convert all the xpath nodes to changeset models
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
    @Override
    public Workspace parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);

        // if for some reason no output is given return null
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
    @Override
    public List<Server> parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);

        final String[] output = getLines(stdout);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

            //login panel handles the context
            final ServerContext context = super.completeSignIn(selectedContext);

            //prepare for import
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/AddCommand.java`
#### Snippet
```java
    @Override
    public List<String> parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);
        final List<String> filesAdded = new ArrayList<String>();
        final String[] output = getLines(stdout);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
    @Override
    public boolean showModalDialog() {
        return super.showAndGet();
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
        super.setTitle(title);
        if (okButtonText != null)
            super.setOKButtonText(okButtonText);
        super.init();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
        if (okButtonText != null)
            super.setOKButtonText(okButtonText);
        super.init();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
    @Override
    public void setOkEnabled(final boolean enabled) {
        super.setOKActionEnabled(enabled);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
            final URI teamProjectURI = latestServerContext.getTeamProjectURI();
            if (teamProjectURI != null) {
                super.gotoLink(UrlHelper.getCreateWorkItemURI(teamProjectURI).toString());
            } else {
                logger.warn("Can't goto 'create work item' link: Unable to get team project URI from server context.");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
            final URI teamProjectURI = latestServerContext.getTeamProjectURI();
            if (teamProjectURI != null) {
                super.gotoLink(UrlHelper.getCreateWorkItemURI(teamProjectURI).toString());
            } else {
                logger.warn("Can't goto 'create work item' link: Unable to get team project URI from server context.");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
        queryParameters.addIfNotNull("linkCommitWorkitems", linkCommitWorkitems);

        final Object httpRequest = super.createRequest(AlmHttpClientBase.HttpMethod.POST,
                locationId,
                routeValues,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
                    final List<WorkItem> workItems = viewForModel.getSelectedWorkItems();
                    for (WorkItem item : workItems) {
                        super.gotoLink(UrlHelper.getSpecificWorkItemURI(teamProjectURI, item.getId()).toString());
                    }
                } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
                final URI teamProjectURI = context.getTeamProjectURI();
                if (teamProjectURI != null) {
                    super.gotoLink(UrlHelper.getCreateWorkItemURI(teamProjectURI).toString());
                } else {
                    logger.warn("Can't goto 'create work item' link: Unable to get team project URI from server context.");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/StatusCommand.java`
#### Snippet
```java
        throwIfError(stderr);
        final List<PendingChange> changes = new ArrayList<PendingChange>(100);
        final NodeList nodes = super.evaluateXPath(stdout, "/status/*/pending-change");

        // Convert all the xpath nodes to pending change models
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
        if (cloneEnabledForVso != value) {
            cloneEnabledForVso = value;
            super.setChangedAndNotify(PROP_CLONE_ENABLED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
        if (cloneEnabledForTfs != value) {
            cloneEnabledForTfs = value;
            super.setChangedAndNotify(PROP_CLONE_ENABLED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
        if (vsoSelected != value) {
            vsoSelected = value;
            super.setChangedAndNotify(PROP_VSO_SELECTED);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
        } else {
            // Fire an event letting callers know
            super.fireTableDataChanged();
        }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
            filteredRows = Lists.newArrayList(Collections2.filter(rows, this::rowContains));
        }
        super.fireTableDataChanged();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
        filteredRows = null;
        rows.clear();
        super.fireTableDataChanged();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemQueriesLookupOperation.java`
#### Snippet
```java
            }

            super.onLookupResults(new QueryResults(queries, inputs));
        } catch (Throwable t) {
            logger.warn("doLookup: failed with an exception", t);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/UpdateWorkspaceMappingCommand.java`
#### Snippet
```java
    @Override
    public String parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);
        // There is no output on success
        return StringUtils.EMPTY;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `plugin/src/com/microsoft/alm/plugin/external/commands/InfoCommand.java`
#### Snippet
```java
    @Override
    public List<ExtendedItemInfo> parseOutput(final String stdout, final String stderr) {
        super.throwIfError(stderr);

        final List<ExtendedItemInfo> itemInfos = new ArrayList<>(itemPaths.size());
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`count = count + 2` could be simplified to 'count += 2'
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
                location = StringUtils.removeStart(output[count], LOCATION_PREFIX).trim();
            } else if (StringUtils.startsWith(output[count], MAPPING_PREFIX)) {
                count = count + 2;
                while (count < output.length && StringUtils.isNotEmpty(output[count])) {
                    Workspace.Mapping mapping = getMapping(output[count]);
```

### ReplaceAssignmentWithOperatorAssignment
`count = count + 2` could be simplified to 'count += 2'
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java

                // move past collection name and column headers
                count = count + 2;

                // double check we aren't out of bounds for the array
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
                bufferedReader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    // Call the appropriate event with the line that was read
                    if (isStandardError) {
```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            byte[] buffer = new byte[8192];
            int read;
            while ((read = is.read(buffer)) > 0) {
                digest.update(buffer, 0, read);
            }
```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
        settings.USE_CHANGE_AFTER_FILTER = true;
        settings.USE_CHANGE_BEFORE_FILTER = true;
        settings.CHANGE_BEFORE = settings.CHANGE_AFTER = String.valueOf(((TfsRevisionNumber) number).getValue());
        final FilePath filePath = VcsContextFactory.SERVICE.getInstance().createFilePathOn(file);
        final List<TFSChangeList> list = getCommittedChanges(settings, getLocationFor(filePath), 1);
```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
                String line;
                bufferedReader = new BufferedReader(new FileReader(locationsFile));
                while ((line = bufferedReader.readLine()) != null) {
                    final String[] entry = line.split(CSV_COMMA);
                    if (entry.length == 2) {
```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcClient.java`
#### Snippet
```java
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ourLogger.info("VS client " + label + ": " + line);
                output.add(line);
```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TfsFileRevision.java`
#### Snippet
```java
    @Override
    public byte[] loadContent() throws IOException, VcsException {
        return content = createContentRevision().doGetContent();
    }

```

### NestedAssignment
Result of assignment expression used
in `plugin/src/com/microsoft/alm/plugin/external/reactive/ReactiveTfvcClientHolder.java`
#### Snippet
```java
            if (myClient == null || myClient.isCompletedExceptionally() || myClient.isCancelled()) {
                try {
                    return myClient = createNewClientAsync();
                } catch (Throwable t) {
                    CompletableFuture<ReactiveTfvcClientHost> result = new CompletableFuture<>();
```

## RuleId[ruleID=UnusedReceiverParameter]
### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
}

fun VersionControlEventEngine.withNewPendingChangeListener(
    listener: NewPendingChangeListener,
    action: () -> Unit) {
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java


fun VersionControlEventEngine.withNonFatalErrorListener(
    listener: NonFatalErrorListener,
    action: () -> Unit) {
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine

fun VersionControlEventEngine.withUndonePendingChangeListener(
    listener: UndonePendingChangeListener,
    action: () -> Unit) {
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else pendingChange.toUIString(false, this)

private val ExtendedItem.itemTypeName
    get() = itemType.toUIString()

```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = if (itemType == ItemType.FILE) encodingName else null

private val ExtendedItem.lockStatus
    get() = lockLevel.toUIString()

```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = checkinDate?.time?.let(isoDateFormat::format)

private val ExtendedItem.encodingName
    get() =
        if (encoding == FileEncoding(VersionControlConstants.ENCODING_UNCHANGED)) null
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = itemType.toUIString()

private val ExtendedItem.checkinDateString
    get() = checkinDate?.time?.let(isoDateFormat::format)

```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = lockLevel.toUIString()

fun ExtendedItem.toLocalItemInfo(): TfsLocalItemInfo =
    TfsLocalItemInfo(
        targetServerItem,
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    )

fun ExtendedItem.toExtendedItemInfo(): TfsExtendedItemInfo =
    TfsExtendedItemInfo(
        lockStatus,
```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else encoding?.name

private val ExtendedItem.fileEncodingName
    get() = if (itemType == ItemType.FILE) encodingName else null

```

### UnusedReceiverParameter
Receiver parameter is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
```

## RuleId[ruleID=MemberVisibilityCanBePrivate]
### MemberVisibilityCanBePrivate
Property 'layout' could be private
in `client/backend/src/main/kotlin/com/microsoft/tfs/Logging.kt`
#### Snippet
```java
object Logging {
    val factory = CommonsLoggingLoggerFactory
    val layout = PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n")

    fun initialize(logDirectory: Path?, level: Level) {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `quickDiffPane` is accessed in both synchronized and unsynchronized contexts
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    private JLabel sourceBranchLabel;
    private JPanel contentPanel;
    private JTabbedPane quickDiffPane;
    private JLabel titleLabel;
    private JTextField titleTextField;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sourceBranch` is accessed in both synchronized and unsynchronized contexts
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java

    private JComboBox targetBranchDropdown;
    private JLabel sourceBranch;
    private JLabel sourceBranchLabel;
    private JPanel contentPanel;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `forcedContext` is accessed in both synchronized and unsynchronized contexts
in `plugin/test-utils/src/com/microsoft/alm/plugin/context/MockRepositoryContextManager.java`
#### Snippet
```java

public class MockRepositoryContextManager extends RepositoryContextManager {
    private RepositoryContext forcedContext;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `contextMap` is accessed in both synchronized and unsynchronized contexts
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    private final String TFS2015_NEW_SERVICE = "distributedtask";

    private Map<String, ServerContext> contextMap = new HashMap<String, ServerContext>();

    private static class Holder {
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         * @param percentComplete
         */
        void progress(final String output, final int outputType, final int percentComplete);

        /**
```

### EmptyMethod
All implementations of this method are empty
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPage.java`
#### Snippet
```java
public interface CheckoutPage extends FocusableTabPage {

    void addActionListener(ActionListener listener);

    void setLoginShowing(boolean showLogin);
```

### EmptyMethod
All implementations of this method are empty
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPage.java`
#### Snippet
```java
    void addActionListener(ActionListener listener);

    void setLoginShowing(boolean showLogin);

    void setLoading(boolean loading);
```

### EmptyMethod
All implementations of this method are empty
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPage.java`
#### Snippet
```java
    void setLoading(boolean loading);

    void setAuthenticating(boolean authenticating);

    void setAdvanced(boolean advanced);
```

### EmptyMethod
All implementations of this method are empty
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPage.java`
#### Snippet
```java
    void setLoading(final boolean loading);

    void setAuthenticating(final boolean authenticating);

    void setTeamProjectFilter(final String filter);
```

### EmptyMethod
Empty method overrides empty method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
        for (final PendingChange pendingChange : pendingChanges) {
            StatusProvider.visitByStatus(new StatusProvider.StatusAdapter() {
                public void checkedOutForEdit(final @NotNull FilePath localPath,
                                              final boolean localItemExists,
                                              final @NotNull ServerStatus serverStatus) {
```

### EmptyMethod
Empty method overrides empty method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void scheduledForDeletion(final @NotNull FilePath localPath,
                                                 final boolean localItemExists,
                                                 final @NotNull ServerStatus serverStatus) {
```

### EmptyMethod
Empty method overrides empty method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void renamed(final @NotNull FilePath localPath, final boolean localItemExists, final @NotNull ServerStatus serverStatus) {
                    // TODO (JetBrains): add local conflict
                }
```

### EmptyMethod
Empty method overrides empty method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void renamedCheckedOut(final @NotNull FilePath localPath,
                                              final boolean localItemExists,
                                              final @NotNull ServerStatus serverStatus) {
```

### EmptyMethod
Empty method overrides empty method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java
                }

                public void undeleted(final @NotNull FilePath localPath,
                                      final boolean localItemExists,
                                      final @NotNull ServerStatus serverStatus) {
```

### EmptyMethod
The method is empty
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelForm.java`
#### Snippet
```java
//    }

    private void updateButtons() {
        //removeButton.setEnabled(itemsTable.getSelectedRowCount() > 0);
    }
```

### EmptyMethod
The method is empty
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
    }

    private void updateChangesetsTable() {
//    List<Changeset> changesets = new ArrayList<Changeset>();
//    if (targetCombo.getSelectedIndex() != -1) {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/events/ServerPollingManager.java`
#### Snippet
```java
    private final ServerEventManager eventManager;
    private final Timer timer;
    private boolean polling = false;

    private static class Holder {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
    private final GitRepository gitRepository;

    private boolean disposed = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsForm.java`
#### Snippet
```java
    protected JButton myMergeButton;
    private boolean initialized = false;
    private boolean isLoading = false;

    @NonNls
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsForm.java`
#### Snippet
```java
    @VisibleForTesting
    protected JButton myMergeButton;
    private boolean initialized = false;
    private boolean isLoading = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
public class TeamServicesSettingsService implements PersistentStateComponent<SettingsState> {
    private static final Logger logger = LoggerFactory.getLogger(TeamServicesSettingsService.class);
    private SettingsState state = null;
    private boolean serverContextsRestored = false;
    private boolean propertiesRestored = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(TeamServicesSettingsService.class);
    private SettingsState state = null;
    private boolean serverContextsRestored = false;
    private boolean propertiesRestored = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
    private SettingsState state = null;
    private boolean serverContextsRestored = false;
    private boolean propertiesRestored = false;

    // This default instance is only returned in the case of tests or we are somehow running outside of IntelliJ
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MergeBranchAction.java`
#### Snippet
```java
        // This class has an internal cache to make successive calls to the getBranches method fast
        // This is not meant to be a reliable or extensive cache.
        private String lastSourceUsed = null;
        private List<String> lastBranchesRetrieved = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MergeBranchAction.java`
#### Snippet
```java
        // This is not meant to be a reliable or extensive cache.
        private String lastSourceUsed = null;
        private List<String> lastBranchesRetrieved = null;

        public InternalBranchListProvider(final ServerContext serverContext, final String workingFolder) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
    private static final String[] TF_WINDOWS_PROGRAMS = {"tf.exe", "tf.bat", "tf.cmd"};
    private static final String[] TF_OTHER_PROGRAMS = {"tf", "tf.sh"};
    private static ToolVersion cachedVersion = null;
    public static final ToolVersion TF_MIN_VERSION = new ToolVersion("14.0.3");
    public static final String TF_DIRECTORY_PREFIX = "TEE-CLC";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
    protected ToolbarToggleButton autoRefreshToggleButton;

    private boolean initialized = false;
    protected Timer timer;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/authentication/DeviceFlowResponsePromptForm.java`
#### Snippet
```java
    private DeviceFlowResponse response;

    private boolean initialized = false;

    public DeviceFlowResponsePromptForm() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/services/PluginServiceProvider.java`
#### Snippet
```java

    private boolean initialized = false;
    private boolean insideIDE = false;
    private ServerContextStore contextStore;
    private CredentialsPrompt credentialsPrompt;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/services/PluginServiceProvider.java`
#### Snippet
```java
public class PluginServiceProvider {

    private boolean initialized = false;
    private boolean insideIDE = false;
    private ServerContextStore contextStore;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
    private final WorkspaceDialog dialog;
    private final WorkspaceModel model;
    private boolean suspendEvents = false;
    private final Project project;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    private JSplitPane splitPane;

    private boolean initialized = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<WorkItem> rows = new ArrayList<WorkItem>(100);
    private List<WorkItem> filteredRows = null;
    private String filter;
    private final Column[] columns;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java

public class EULADialog extends DialogWrapper {
    private static boolean isDialogOnScreen = false;
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(EULADialog.class);
    private static boolean myWasShow = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
    private static boolean isDialogOnScreen = false;
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(EULADialog.class);
    private static boolean myWasShow = false;
    private final JBScrollPane myScrollPane;
    private final Boolean myEulaTextFound;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java
public abstract class LoginPageModelImpl extends AbstractModel implements LoginPageModel {
    private boolean connected = false;
    private boolean authenticating = false;
    //default values for Strings should be "" rather than null.
    private String userName = "";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java

public abstract class LoginPageModelImpl extends AbstractModel implements LoginPageModel {
    private boolean connected = false;
    private boolean authenticating = false;
    //default values for Strings should be "" rather than null.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutForm.java`
#### Snippet
```java
    private TextFieldWithBrowseButton parentDirectory;
    private JTextField repoUrl;
    private boolean initialized = false;

    public SimpleCheckoutForm() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java

    public static class ResultsImpl implements Results {
        protected boolean isCancelled = false;
        protected Throwable error = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
    public static class ResultsImpl implements Results {
        protected boolean isCancelled = false;
        protected Throwable error = null;

        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportForm.java`
#### Snippet
```java
    private HelpPanel helpPanel;

    private boolean initialized = false;
    private Timer timer;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java
    private boolean vsoSelected = true;
    private boolean importEnabledForVso = false;
    private boolean importEnabledForTfs = false;
    private final ImportPageModel vsoImportPageModel;
    private final ImportPageModel tfsImportPageModel;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportModel.java`
#### Snippet
```java

    private boolean vsoSelected = true;
    private boolean importEnabledForVso = false;
    private boolean importEnabledForTfs = false;
    private final ImportPageModel vsoImportPageModel;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/BusySpinnerPanel.java`
#### Snippet
```java
 */
public class BusySpinnerPanel extends JPanel implements Disposable {
    private int rotationAngle = 0;
    private Timer timer;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
public abstract class CheckoutPageModelImpl extends LoginPageModelImpl implements CheckoutPageModel, ServerContextLookupPageModel {
    private CheckoutModel parentModel;
    private boolean loading = false;
    private boolean cloneEnabled = false;
    private boolean advanced = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
    private boolean loading = false;
    private boolean cloneEnabled = false;
    private boolean advanced = false;
    private boolean isTfvcServerCheckout = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
    private boolean cloneEnabled = false;
    private boolean advanced = false;
    private boolean isTfvcServerCheckout = false;

    //default values for Strings should be "" rather than null.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
    private CheckoutModel parentModel;
    private boolean loading = false;
    private boolean cloneEnabled = false;
    private boolean advanced = false;
    private boolean isTfvcServerCheckout = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
    private JCheckBox advancedCheckBox;
    private JCheckBox serverWorkspaceCheckBox;
    private boolean initialized = false;
    private RepositoryContext.Type repositoryType;
    private Timer timer;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java

    private class HelpIdeTooltip extends IdeTooltip {
        private boolean showing = false;

        public HelpIdeTooltip(final Component component, final Point point, final JComponent tipComponent) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java

    private class MouseEventListener implements MouseListener {
        private boolean ignoreNextClick = false;

        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
    protected ActionListener listener;
    protected boolean isLoading = false;
    private boolean isEnabled = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
    protected JLabel pickerLabel;
    protected ActionListener listener;
    protected boolean isLoading = false;
    private boolean isEnabled = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    /* UI properties */
    private boolean loading = false;
    private GitChangesContainer localBranchChanges;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private ImportModel parentDialogModel;
    private boolean loading = false;
    private boolean importEnabled = false;
    //default values for Strings should be "" rather than null.
    private String teamProjectFilter = "";
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

    private ImportModel parentDialogModel;
    private boolean loading = false;
    private boolean importEnabled = false;
    //default values for Strings should be "" rather than null.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
    private SortedComboBoxModel<GitRemoteBranch> remoteBranchComboModel;
    private boolean checkoutBranch = true;
    private boolean branchWasCreated = false;

    protected CreateBranchModel(final Project project, final String defaultBranchName, final GitRepository gitRepository) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/forms/TfsLoginForm.java`
#### Snippet
```java
    private BusySpinnerPanel busySpinner;
    private JLabel loginProgressLabel;
    private boolean initialized = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
public class TFSVcs extends AbstractVcs {
    public static final Logger logger = LoggerFactory.getLogger(TFSVcs.class);
    private static boolean hasVersionBeenVerified = false;

    @NonNls
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/reactive/RdIdeaLoggerFactory.java`
#### Snippet
```java
public class RdIdeaLoggerFactory implements ILoggerFactory {

    private static boolean initialized = false;
    private static final RdIdeaLoggerFactory INSTANCE = new RdIdeaLoggerFactory();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchForm.java`
#### Snippet
```java
    private JLabel basedOn;
    private JCheckBox checkoutBranch;
    private boolean initialized = false;

    public CreateBranchForm() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FormattedTable.java`
#### Snippet
```java

    private final String defaultLongColumn;
    private boolean isFormatted = false;
    private final TableModelListener formattedListener = new TableModelListener() {
        @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ProjectRepoEventManager.class);

    private static boolean repositoryChanging = false;

    private ProjectEventListener projectEventListener;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
    private static final String UNKNOWN = "Unknown";

    private static Pattern pattern = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
        protected boolean isFolder;
        protected String workingFolder;
        protected boolean cancelled = false;
        protected final List<VcsException> errors = new ArrayList<VcsException>();
        protected final List<TItemInfo> itemInfos = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/forms/FeedbackForm.java`
#### Snippet
```java
    private JScrollPane commentScrollPane;
    private WrappingLabel thankYouLabel;
    private boolean initialized = false;

    public FeedbackForm() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsForm.java`
#### Snippet
```java
    private JScrollPane scrollPane;
    private HelpPanel helpPanel;
    private boolean initialized = false;
    private Timer timer;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
    private ServerContext latestServerContext;

    private boolean maxItemsReached = false;

    public SelectWorkItemsModel(final Project project, final RepositoryContext repositoryContext) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
    private final Project project;
    private final RepositoryContext repositoryContext;
    private boolean loading = false;
    private String filter;
    private ServerContext latestServerContext;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
    public static final String ASSOCIATE_WORK_ITEM_ACTION = "associate-work-item";
    public static final String CONTEXT_FOUND = "context";
    private boolean isContextFound = false;

    public VcsWorkItemsModel(final @NotNull Project project) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    public String serverUri = null;
    public String userId = null;
    public String teamProjectCollectionReference = null;
    public String teamProjectReference = null;
    public String gitRepository = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    public String teamProjectCollectionReference = null;
    public String teamProjectReference = null;
    public String gitRepository = null;

    // This method exists to make sure we can deserialize the collection reference.
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    public String userId = null;
    public String teamProjectCollectionReference = null;
    public String teamProjectReference = null;
    public String gitRepository = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    //fields have to be public, so IntelliJ can write them to the persistent store
    public ServerContext.Type type = null;
    public String uri = null;
    public String serverUri = null;
    public String userId = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    public String uri = null;
    public String serverUri = null;
    public String userId = null;
    public String teamProjectCollectionReference = null;
    public String teamProjectReference = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java
    public ServerContext.Type type = null;
    public String uri = null;
    public String serverUri = null;
    public String userId = null;
    public String teamProjectCollectionReference = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/ServerContextState.java`
#### Snippet
```java

    //fields have to be public, so IntelliJ can write them to the persistent store
    public ServerContext.Type type = null;
    public String uri = null;
    public String serverUri = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
public class CheckoutModel extends PageModelImpl implements VcsSpecificCheckoutModel{
    private boolean vsoSelected = true;
    private boolean cloneEnabledForVso = false;
    private boolean cloneEnabledForTfs = false;
    private final CheckoutPageModel vsoModel;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutModel.java`
#### Snippet
```java
    private boolean vsoSelected = true;
    private boolean cloneEnabledForVso = false;
    private boolean cloneEnabledForTfs = false;
    private final CheckoutPageModel vsoModel;
    private final CheckoutPageModel tfsModel;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/forms/VsoLoginForm.java`
#### Snippet
```java
    private Hyperlink learnMoreLink;
    private JLabel moreInfoLabel;
    private boolean initialized = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<ServerContext> rows = new ArrayList<ServerContext>(1000);
    private List<ServerContext> filteredRows = null;
    private String filter;
    private final Column[] columns;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthenticationInfo.java`
#### Snippet
```java
    // If we all use this constant, it provides future type safely if we ever decided to change NONE to a
    // typed variable instead of 'null'
    public static AuthenticationInfo NONE = null;

    private final String userName;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/PropertyServiceImpl.java`
#### Snippet
```java

public class PropertyServiceImpl implements PropertyService {
    private boolean restored = false;
    private Map<String, String> map;

```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `DumbAware`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MergeBranchAction.java`
#### Snippet
```java
import java.util.List;

public class MergeBranchAction extends SingleItemAction implements DumbAware {

    protected MergeBranchAction() {
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `ex`
in `plugin/src/com/microsoft/alm/plugin/operations/AccountLookupOperation.java`
#### Snippet
```java
            onLookupCompleted();
        } catch (Throwable ex) {
            if (ex instanceof WebApplicationException) {
                WebApplicationException webEx = (WebApplicationException)ex;
                Response response = webEx.getResponse();
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
                                    // check if error is due to the server URI not being found after a valid authentication
                                    // this is an indication that the server URI contains more than just the base URI
                                    if (t instanceof VssResourceNotFoundException) {
                                        logger.warn(String.format("User authenticated but 404 on server so URI (%s) is malformed", context.getServerUri().toString()));
                                        terminate(new TeamServicesException(TeamServicesException.KEY_TFS_MALFORMED_SERVER_URI, t));
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
            // no notification needs to be done by us for errors, IntelliJ handles that
            logger.warn("Error during checkin", e);
            if (e instanceof TeamServicesException) {
                // get localized message in the case of TeamServicesException otherwise the key will print out instead of the error
                errors.add(new VcsException(LocalizationServiceImpl.getInstance().getExceptionMessage(e)));
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ServerPathCellEditor.java`
#### Snippet
```java
        // if there is no entry in the cell to find the root server path with then find it from the server context
        if (StringUtils.isEmpty(serverPath) && serverContext != null && serverContext.getTeamProjectReference() != null) {
            serverPath = VcsHelper.TFVC_ROOT.concat(serverContext.getTeamProjectReference().getName());
        }
        return serverPath;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
            final ServerContext serverContext = TFSVcs.getInstance(project).getServerContext(false);
            if (serverContext != null && serverContext.getTeamProjectReference() != null && StringUtils.isNotEmpty(serverContext.getTeamProjectReference().getName())) {
                return new Row(ROOT_FOLDER.concat(serverContext.getTeamProjectReference().getName()), defaultLocalPath, MappingType.MAPPED);
            }
            // not great if we get here but browse will still work except the root name won't populate
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java

    private String getPullRequestWebLink(final String gitRemoteUrl, final int pullRequestId) {
        return gitRemoteUrl.concat(UrlHelper.URL_SEPARATOR)
                .concat("pullrequest").concat(UrlHelper.URL_SEPARATOR + pullRequestId);
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
    private String getPullRequestWebLink(final String gitRemoteUrl, final int pullRequestId) {
        return gitRemoteUrl.concat(UrlHelper.URL_SEPARATOR)
                .concat("pullrequest").concat(UrlHelper.URL_SEPARATOR + pullRequestId);
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
    private String getPullRequestWebLink(final String gitRemoteUrl, final int pullRequestId) {
        return gitRemoteUrl.concat(UrlHelper.URL_SEPARATOR)
                .concat("pullrequest").concat(UrlHelper.URL_SEPARATOR + pullRequestId);
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                if (StringUtils.isNotEmpty(context.getGitRepository().getRemoteUrl())) {
                    BrowserUtil.browse(context.getGitRepository().getRemoteUrl()
                            .concat(UrlHelper.URL_SEPARATOR).concat("pullrequests"));
                }
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                if (StringUtils.isNotEmpty(context.getGitRepository().getRemoteUrl())) {
                    BrowserUtil.browse(context.getGitRepository().getRemoteUrl()
                            .concat(UrlHelper.URL_SEPARATOR).concat("pullrequests"));
                }
            }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
            }

            final String key = repoName.concat(accountUrl).toLowerCase();
            if (!contextTable.containsKey(key) && !deleteContexts.contains(context)) {
                contextTable.put(key, context);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java

        final ConnectionData data = VstsHttpClient.sendRequest(context.getClient(),
                context.getServerUri().toString().concat(CONNECTION_DATA_REST_API_PATH),
                ConnectionData.class);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
            try {
                //Try to query the server endpoint gitRemoteUrl/vsts/info
                final VstsInfo vstsInfo = VstsHttpClient.sendRequest(context.getClient(), gitRemoteUrl.concat(REPO_INFO_URL_PATH), VstsInfo.class);
                if (vstsInfo == null || vstsInfo.getCollectionReference() == null ||
                        vstsInfo.getRepository() == null || vstsInfo.getRepository().getProjectReference() == null) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
            }
            final ConnectionData data = VstsHttpClient.sendRequest(context.getClient(),
                    urlForConnectionData.concat(CONNECTION_DATA_REST_API_PATH),
                    ConnectionData.class);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
        return UrlHelper.createUri(
                combine(serverUri.toString(), String.format(URL_BUILD_ASPX_SEGMENT, collectionId))
                        .concat(String.format(URL_BUILD_TEAM_PROJECT_SEGMENT, encode(projectName)))
                        .concat(String.format(URL_BUILD_DEFINITION_ID_SEGMENT, buildDefinitionId))
                        .concat(URL_BUILD_QUEUE_ACTION));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
                combine(serverUri.toString(), String.format(URL_BUILD_ASPX_SEGMENT, collectionId))
                        .concat(String.format(URL_BUILD_TEAM_PROJECT_SEGMENT, encode(projectName)))
                        .concat(String.format(URL_BUILD_DEFINITION_ID_SEGMENT, buildDefinitionId))
                        .concat(URL_BUILD_QUEUE_ACTION));
    }
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
                        .concat(String.format(URL_BUILD_TEAM_PROJECT_SEGMENT, encode(projectName)))
                        .concat(String.format(URL_BUILD_DEFINITION_ID_SEGMENT, buildDefinitionId))
                        .concat(URL_BUILD_QUEUE_ACTION));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getBranchURI(final URI repoUri, final String branchName) {
        return UrlHelper.createUri(repoUri.toString().concat(URL_BRANCH_SEGMENT).concat(encode(branchName)));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getBranchURI(final URI repoUri, final String branchName) {
        return UrlHelper.createUri(repoUri.toString().concat(URL_BRANCH_SEGMENT).concat(encode(branchName)));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getFileURI(final String remoteUrl, final String filePath, final String gitRemoteBranchName) {
        String uri = getHttpsGitUrlFromSshUrl(remoteUrl).concat(URL_PATH_SEGMENT).concat(filePath);

        if (uri == null) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getFileURI(final String remoteUrl, final String filePath, final String gitRemoteBranchName) {
        String uri = getHttpsGitUrlFromSshUrl(remoteUrl).concat(URL_PATH_SEGMENT).concat(filePath);

        if (uri == null) {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

        if (StringUtils.isNotEmpty(gitRemoteBranchName)) {
            uri = uri.concat(URL_GIT_VERSION_SEGMENT).concat(gitRemoteBranchName);
        }
        return UrlHelper.createUri(uri);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

        if (StringUtils.isNotEmpty(gitRemoteBranchName)) {
            uri = uri.concat(URL_GIT_VERSION_SEGMENT).concat(gitRemoteBranchName);
        }
        return UrlHelper.createUri(uri);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static URI getSpecificWorkItemURI(final URI projectUri, final int workItemId) {
        return UrlHelper.createUri(combine(projectUri.toString(), URL_WIT_PATH_SEGMENT)
                .concat(String.format(URL_WIT_SPECIFIC_ITEM_PATH_SEGMENT, workItemId)));
    }

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static URI getBuildURI(final URI projectUri, final int buildId) {
        return UrlHelper.createUri(combine(projectUri.toString(), URL_BUILD_PATH_SEGMENT)
                .concat(String.format(URL_BUILD_SPECIFIC_ITEM_PATH_SEGMENT, buildId)));
    }

```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer uri` may be declared as 'StringBuilder'
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
        }

        final StringBuffer uri = new StringBuffer();

        try {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    public void setDescription(final String description) {
        synchronized (this) {
            this.description = StringUtils.trim(description);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    public void setTitle(final String title) {
        synchronized (this) {
            this.title = StringUtils.trim(title);
        }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `KEY_TF_LOCK_FAILED` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_EXE_NOT_FOUND = "KEY_TF_EXE_NOT_FOUND";
    public static String KEY_TF_BAD_EXIT_CODE = "KEY_TF_BAD_EXIT_CODE";
    public static String KEY_TF_LOCK_FAILED = "KEY_TF_LOCK_FAILED";
    public static String KEY_TF_PARSE_FAILURE = "KEY_TF_PARSE_FAILURE";
    public static String KEY_TF_MIN_VERSION_WARNING = "KEY_TF_MIN_VERSION_WARNING";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_OOM` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_WORKSPACE_EXISTS = "KEY_TF_WORKSPACE_EXISTS";
    public static String KEY_TF_BRANCH_EXISTS = "KEY_TF_BRANCH_EXISTS";
    public static String KEY_TF_OOM = "KEY_TF_OOM";
    public static String KEY_TF_AUTH_FAIL = "KEY_TF_AUTH_FAIL";
    public static String KEY_TF_VS_MIN_VERSION_WARNING = "KEY_TF_VS_MIN_VERSION_WARNING";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_WORKSPACE_EXISTS` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_MIN_VERSION_WARNING = "KEY_TF_MIN_VERSION_WARNING";
    public static String KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED = "KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED";
    public static String KEY_TF_WORKSPACE_EXISTS = "KEY_TF_WORKSPACE_EXISTS";
    public static String KEY_TF_BRANCH_EXISTS = "KEY_TF_BRANCH_EXISTS";
    public static String KEY_TF_OOM = "KEY_TF_OOM";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_VS_MIN_VERSION_WARNING` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_OOM = "KEY_TF_OOM";
    public static String KEY_TF_AUTH_FAIL = "KEY_TF_AUTH_FAIL";
    public static String KEY_TF_VS_MIN_VERSION_WARNING = "KEY_TF_VS_MIN_VERSION_WARNING";
}

```

### NonFinalFieldOfException
Non-final field `KEY_TF_AUTH_FAIL` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_BRANCH_EXISTS = "KEY_TF_BRANCH_EXISTS";
    public static String KEY_TF_OOM = "KEY_TF_OOM";
    public static String KEY_TF_AUTH_FAIL = "KEY_TF_AUTH_FAIL";
    public static String KEY_TF_VS_MIN_VERSION_WARNING = "KEY_TF_VS_MIN_VERSION_WARNING";
}
```

### NonFinalFieldOfException
Non-final field `KEY_TF_EXE_NOT_FOUND` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_DOLLAR_IN_PATH = "KEY_TF_DOLLAR_IN_PATH";
    public static String KEY_TF_HOME_NOT_SET = "KEY_TF_HOME_NOT_SET";
    public static String KEY_TF_EXE_NOT_FOUND = "KEY_TF_EXE_NOT_FOUND";
    public static String KEY_TF_BAD_EXIT_CODE = "KEY_TF_BAD_EXIT_CODE";
    public static String KEY_TF_LOCK_FAILED = "KEY_TF_LOCK_FAILED";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_BRANCH_EXISTS` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED = "KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED";
    public static String KEY_TF_WORKSPACE_EXISTS = "KEY_TF_WORKSPACE_EXISTS";
    public static String KEY_TF_BRANCH_EXISTS = "KEY_TF_BRANCH_EXISTS";
    public static String KEY_TF_OOM = "KEY_TF_OOM";
    public static String KEY_TF_AUTH_FAIL = "KEY_TF_AUTH_FAIL";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_HOME_NOT_SET` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    // Keys for tool exception messages
    public static String KEY_TF_DOLLAR_IN_PATH = "KEY_TF_DOLLAR_IN_PATH";
    public static String KEY_TF_HOME_NOT_SET = "KEY_TF_HOME_NOT_SET";
    public static String KEY_TF_EXE_NOT_FOUND = "KEY_TF_EXE_NOT_FOUND";
    public static String KEY_TF_BAD_EXIT_CODE = "KEY_TF_BAD_EXIT_CODE";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_MIN_VERSION_WARNING` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_LOCK_FAILED = "KEY_TF_LOCK_FAILED";
    public static String KEY_TF_PARSE_FAILURE = "KEY_TF_PARSE_FAILURE";
    public static String KEY_TF_MIN_VERSION_WARNING = "KEY_TF_MIN_VERSION_WARNING";
    public static String KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED = "KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED";
    public static String KEY_TF_WORKSPACE_EXISTS = "KEY_TF_WORKSPACE_EXISTS";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_DOLLAR_IN_PATH` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java

    // Keys for tool exception messages
    public static String KEY_TF_DOLLAR_IN_PATH = "KEY_TF_DOLLAR_IN_PATH";
    public static String KEY_TF_HOME_NOT_SET = "KEY_TF_HOME_NOT_SET";
    public static String KEY_TF_EXE_NOT_FOUND = "KEY_TF_EXE_NOT_FOUND";
```

### NonFinalFieldOfException
Non-final field `messageKey` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
public class ToolException extends RuntimeException implements LocalizedException {

    private String messageKey;

    @Override
```

### NonFinalFieldOfException
Non-final field `KEY_TF_BAD_EXIT_CODE` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_HOME_NOT_SET = "KEY_TF_HOME_NOT_SET";
    public static String KEY_TF_EXE_NOT_FOUND = "KEY_TF_EXE_NOT_FOUND";
    public static String KEY_TF_BAD_EXIT_CODE = "KEY_TF_BAD_EXIT_CODE";
    public static String KEY_TF_LOCK_FAILED = "KEY_TF_LOCK_FAILED";
    public static String KEY_TF_PARSE_FAILURE = "KEY_TF_PARSE_FAILURE";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_PARSE_FAILURE = "KEY_TF_PARSE_FAILURE";
    public static String KEY_TF_MIN_VERSION_WARNING = "KEY_TF_MIN_VERSION_WARNING";
    public static String KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED = "KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED";
    public static String KEY_TF_WORKSPACE_EXISTS = "KEY_TF_WORKSPACE_EXISTS";
    public static String KEY_TF_BRANCH_EXISTS = "KEY_TF_BRANCH_EXISTS";
```

### NonFinalFieldOfException
Non-final field `KEY_TF_PARSE_FAILURE` of exception class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    public static String KEY_TF_BAD_EXIT_CODE = "KEY_TF_BAD_EXIT_CODE";
    public static String KEY_TF_LOCK_FAILED = "KEY_TF_LOCK_FAILED";
    public static String KEY_TF_PARSE_FAILURE = "KEY_TF_PARSE_FAILURE";
    public static String KEY_TF_MIN_VERSION_WARNING = "KEY_TF_MIN_VERSION_WARNING";
    public static String KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED = "KEY_TF_WORKSPACE_COULD_NOT_BE_DETERMINED";
```

### NonFinalFieldOfException
Non-final field `KEY_VSO_AUTH_FAILED` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_TFS_UNSUPPORTED_VERSION = "KEY_TFS_UNSUPPORTED_VERSION";
    public static String KEY_VSO_AUTH_SESSION_EXPIRED = "KEY_VSO_AUTH_SESSION_EXPIRED";
    public static String KEY_VSO_AUTH_FAILED = "KEY_VSO_AUTH_FAILED";
    public static String KEY_TFS_AUTH_FAILED = "KEY_TFS_AUTH_FAILED";
    public static String KEY_OPERATION_ERRORS = "KEY_OPERATION_ERRORS";
```

### NonFinalFieldOfException
Non-final field `KEY_ERROR_UNKNOWN` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_VSO_NO_PROFILE_ERROR = "KEY_VSO_NO_PROFILE_ERROR";
    public static String KEY_TFS_MALFORMED_SERVER_URI = "KEY_TFS_MALFORMED_SERVER_URI";
    public static String KEY_ERROR_UNKNOWN = "KEY_ERROR_UNKNOWN";
    public static String KEY_TFS_SERVER_PATH_INVALID = "KEY_TFS_SERVER_PATH_INVALID";
}
```

### NonFinalFieldOfException
Non-final field `KEY_VSO_AUTH_SESSION_EXPIRED` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    //Keys for exception messages
    public static String KEY_TFS_UNSUPPORTED_VERSION = "KEY_TFS_UNSUPPORTED_VERSION";
    public static String KEY_VSO_AUTH_SESSION_EXPIRED = "KEY_VSO_AUTH_SESSION_EXPIRED";
    public static String KEY_VSO_AUTH_FAILED = "KEY_VSO_AUTH_FAILED";
    public static String KEY_TFS_AUTH_FAILED = "KEY_TFS_AUTH_FAILED";
```

### NonFinalFieldOfException
Non-final field `messageKey` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
public class TeamServicesException extends RuntimeException implements LocalizedException {

    private String messageKey;

    @Override
```

### NonFinalFieldOfException
Non-final field `KEY_TFS_MALFORMED_SERVER_URI` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_OPERATION_ERRORS = "KEY_OPERATION_ERRORS";
    public static String KEY_VSO_NO_PROFILE_ERROR = "KEY_VSO_NO_PROFILE_ERROR";
    public static String KEY_TFS_MALFORMED_SERVER_URI = "KEY_TFS_MALFORMED_SERVER_URI";
    public static String KEY_ERROR_UNKNOWN = "KEY_ERROR_UNKNOWN";
    public static String KEY_TFS_SERVER_PATH_INVALID = "KEY_TFS_SERVER_PATH_INVALID";
```

### NonFinalFieldOfException
Non-final field `KEY_TFS_AUTH_FAILED` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_VSO_AUTH_SESSION_EXPIRED = "KEY_VSO_AUTH_SESSION_EXPIRED";
    public static String KEY_VSO_AUTH_FAILED = "KEY_VSO_AUTH_FAILED";
    public static String KEY_TFS_AUTH_FAILED = "KEY_TFS_AUTH_FAILED";
    public static String KEY_OPERATION_ERRORS = "KEY_OPERATION_ERRORS";
    public static String KEY_VSO_NO_PROFILE_ERROR = "KEY_VSO_NO_PROFILE_ERROR";
```

### NonFinalFieldOfException
Non-final field `KEY_TFS_UNSUPPORTED_VERSION` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java

    //Keys for exception messages
    public static String KEY_TFS_UNSUPPORTED_VERSION = "KEY_TFS_UNSUPPORTED_VERSION";
    public static String KEY_VSO_AUTH_SESSION_EXPIRED = "KEY_VSO_AUTH_SESSION_EXPIRED";
    public static String KEY_VSO_AUTH_FAILED = "KEY_VSO_AUTH_FAILED";
```

### NonFinalFieldOfException
Non-final field `KEY_OPERATION_ERRORS` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_VSO_AUTH_FAILED = "KEY_VSO_AUTH_FAILED";
    public static String KEY_TFS_AUTH_FAILED = "KEY_TFS_AUTH_FAILED";
    public static String KEY_OPERATION_ERRORS = "KEY_OPERATION_ERRORS";
    public static String KEY_VSO_NO_PROFILE_ERROR = "KEY_VSO_NO_PROFILE_ERROR";
    public static String KEY_TFS_MALFORMED_SERVER_URI = "KEY_TFS_MALFORMED_SERVER_URI";
```

### NonFinalFieldOfException
Non-final field `KEY_TFS_SERVER_PATH_INVALID` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_TFS_MALFORMED_SERVER_URI = "KEY_TFS_MALFORMED_SERVER_URI";
    public static String KEY_ERROR_UNKNOWN = "KEY_ERROR_UNKNOWN";
    public static String KEY_TFS_SERVER_PATH_INVALID = "KEY_TFS_SERVER_PATH_INVALID";
}

```

### NonFinalFieldOfException
Non-final field `KEY_VSO_NO_PROFILE_ERROR` of exception class
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    public static String KEY_TFS_AUTH_FAILED = "KEY_TFS_AUTH_FAILED";
    public static String KEY_OPERATION_ERRORS = "KEY_OPERATION_ERRORS";
    public static String KEY_VSO_NO_PROFILE_ERROR = "KEY_VSO_NO_PROFILE_ERROR";
    public static String KEY_TFS_MALFORMED_SERVER_URI = "KEY_TFS_MALFORMED_SERVER_URI";
    public static String KEY_ERROR_UNKNOWN = "KEY_ERROR_UNKNOWN";
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `plugin/src/com/microsoft/alm/plugin/exceptions/ProfileDoesNotExistException.java`
#### Snippet
```java
    @Override
    public String[] getMessageParameters() {
        return new String[0];
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
    @Override
    public String[] getMessageParameters() {
        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSHistoryProvider.java`
#### Snippet
```java

    public AnAction[] getAdditionalActions(final Runnable refresher) {
        return new AnAction[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
    @Override
    public String[] getMessageParameters() {
        return new String[0];
    }

```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/LocalizationServiceImpl.java`
#### Snippet
```java
    }

    private static final Map<String, String> keysMap = new HashMap<String, String>() {
        {
            // Exception messages
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/BackCompatibleUtils.java`
#### Snippet
```java
            // try to get login name using method existing in IDEA release 163.1188 and above
            final Method proxyLoginMethod = HttpConfigurable.getInstance().getClass().getDeclaredMethod(PROXY_LOGIN_METHOD);
            return (String) proxyLoginMethod.invoke(HttpConfigurable.getInstance(), null);
        } catch (Exception newImplementationException) {
            try {
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'com.intellij.openapi.wm.StatusBarWidget.PlatformType'
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull final PlatformType type) {
        // This class implements the WidgetPresentation needed here
        return this;
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
     * just in case
     */
    public synchronized void populateDiffPane(@NotNull final Project project,
                                              @NotNull final GitRepository gitRepository,
                                              @NotNull final String sourceBranchBeingCompared,
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getBranchCompareInfo(final Project project, final GitRepository gitRepository,
                                                     final String source, final String target)
            throws VcsException {
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     * @return compare info which contains empty commits and diff lists
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
```

### UnstableTypeUsedInSignature
Field must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its type references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    private String sourceBranchHash;
    private String targetBranchHash;
    private GitCommitCompareInfo gitCommitCompareInfo;
    private GitRepository gitRepository;

```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    private GitRepository gitRepository;

    public static GitChangesContainer createChangesContainer(final String sourceBranchName, final String targetBranchName,
                                                             final String sourceBranchHash, final String targetBranchHash,
                                                             final GitCommitCompareInfo gitCommitCompareInfo,
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getGitCommitCompareInfo() {
        return gitCommitCompareInfo;
    }
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.jetbrains.annotations.ApiStatus.ScheduledForRemoval' annotation because its signature references unstable type 'git4idea.util.GitCommitCompareInfo'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public void setGitCommitCompareInfo(final GitCommitCompareInfo gitCommitCompareInfo) {
        this.gitCommitCompareInfo = gitCommitCompareInfo;
    }
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `LocalizedException` ends with 'Exception'
in `plugin/src/com/microsoft/alm/plugin/exceptions/LocalizedException.java`
#### Snippet
```java
package com.microsoft.alm.plugin.exceptions;

public interface LocalizedException {
    String getMessageKey();
    String[] getMessageParameters();
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `rootNode` initializer `null` is redundant
in `plugin/src/com/microsoft/alm/plugin/operations/AccountLookupOperation.java`
#### Snippet
```java
        // Parse result tree
        final ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = objectMapper.readTree(response);
```

### UnusedAssignment
Variable `tool` initializer `null` is redundant
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
        }

        String tool = null;
        String artifactType = null;
        String toolSpecificId = null;
```

### UnusedAssignment
Variable `artifactType` initializer `null` is redundant
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java

        String tool = null;
        String artifactType = null;
        String toolSpecificId = null;

```

### UnusedAssignment
Variable `toolSpecificId` initializer `null` is redundant
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
        String tool = null;
        String artifactType = null;
        String toolSpecificId = null;

        try {
```

### UnusedAssignment
Variable `parentDirectory` initializer `""` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java

    //default values for Strings should be "" rather than null.
    private String parentDirectory = "";
    private String directoryName = "";
    private String repositoryFilter = "";
```

### UnusedAssignment
Variable `wasWorkItemAssociated` initializer `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java

                        // check if branch creation succeeded before associating the work item to it
                        boolean wasWorkItemAssociated = false;
                        if (wasBranchCreated) {
                            wasWorkItemAssociated = createWorkItemBranchAssociation(context, branchName, workItem.getId());
```

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`tool.indexOf(URI_SEPARATOR) != -1` can be replaced with 'tool.contains(URI_SEPARATOR)'
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         * must be non-zero length
         */
        if ((tool.indexOf('\\') != -1) || (tool.indexOf(URI_SEPARATOR) != -1) || (tool.indexOf('.') != -1)) {
            return false;
        }
```

### IndexOfReplaceableByContains
`artifactType.indexOf(URI_SEPARATOR) != -1` can be replaced with 'artifactType.contains(URI_SEPARATOR)'
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         * artifact type cannot contain forward slashes
         */
        if (artifactType.indexOf(URI_SEPARATOR) != -1) {
            return false;
        }
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `authenticatedContexts == null` is always `false`
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
            }

            if (authenticatedContexts == null || authenticatedContexts.size() != 1) {
                //no context was found, user might have cancelled
                terminate(new NotAuthorizedException(gitRemoteUrl));
```

### ConstantValue
Condition `serverItem.length() > 2` is always `true`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java

        // The path is not legal if it ends with a separator character.
        if (serverItem.length() > 2 && serverItem.charAt(serverItem.length() - 1) == PREFERRED_SEPARATOR_CHARACTER) {
            return false;
        }
```

### ConstantValue
Condition `gitRepository.getRoot() == null` is always `false` when reached
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/OpenFileInBrowserAction.java`
#### Snippet
```java

        // guard for null so findbugs doesn't complain
        if (gitRemote == null || gitRepository.getRoot() == null) {
            return;
        }
```

### ConstantValue
Condition `catalogDataOrganizationRoot == null` is always `false`
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java

        //If auth fails, you can get here and catalogDataOrganizationRoot is null
        if (catalogDataOrganizationRoot == null) {
            logger.warn("getProjectCollections catalogDataOrganizationRoot is null");
            throw new TeamServicesException(TeamServicesException.KEY_TFS_AUTH_FAILED);
```

### ConstantValue
Value `needRecursion` is always 'false'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSUpdateEnvironment.java`
#### Snippet
```java
            for (final FilePath file : contentRoots) {
                // checks for directories so we know if to perform a recursive update
                needRecursion = file.isDirectory() ? true : needRecursion;
                if (needRecursion)
                    break;
```

### ConstantValue
Condition `authenticatedContexts == null` is always `false`
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
                }

                if (authenticatedContexts == null || authenticatedContexts.size() != 1) {
                    logger.warn("getServerContext: Context not found");
                    //no context was found, user might have cancelled
```

### ConstantValue
Value `allowPrompt` is always 'false'
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
                }
            } else {
                serverContext = ServerContextManager.getInstance().createContextFromGitRemoteUrl(repositoryContext.getUrl(), allowPrompt);
            }
        } else {
```

### ConstantValue
Value `path` is always 'null'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        if (path instanceof TfsLocalPath)
            return ((TfsLocalPath) path).getPath();
        else if (path instanceof TfsServerPath)
            return ((TfsServerPath) path).getPath();
        else
```

### ConstantValue
Value `path` is always 'null'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            return ((TfsServerPath) path).getPath();
        else
            throw new RuntimeException("Unknown path type: " + path);
    }

```

### ConstantValue
Value `path` is always 'null'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
        if (path instanceof TfsLocalPath)
            return Optional.empty();
        else if (path instanceof TfsServerPath)
            return Optional.of(((TfsServerPath) path).getWorkspace());
        else
```

### ConstantValue
Value `path` is always 'null'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            return Optional.of(((TfsServerPath) path).getWorkspace());
        else
            throw new RuntimeException("Unknown path type: " + path);
    }

```

### ConstantValue
Condition `getInfo() != null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    @Nullable
    public GitLocalBranch getSourceBranch() {
        return getInfo() != null ? getInfo().getCurrentBranch() : null;
    }

```

### ConstantValue
Condition `commits != null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                    final GitRemoteBranch targetBranch = getTargetBranch();

                                    if (StringUtils.isEmpty(getTitle()) && commits != null && sourceBranch.getName() != null
                                            && targetBranch.getNameForRemoteOperations() != null) {
                                        final String defaultTitle = pullRequestHelper.createDefaultTitle(commits,
```

### ConstantValue
Condition `sourceBranch.getName() != null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                    final GitRemoteBranch targetBranch = getTargetBranch();

                                    if (StringUtils.isEmpty(getTitle()) && commits != null && sourceBranch.getName() != null
                                            && targetBranch.getNameForRemoteOperations() != null) {
                                        final String defaultTitle = pullRequestHelper.createDefaultTitle(commits,
```

### ConstantValue
Condition `targetBranch.getNameForRemoteOperations() != null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

                                    if (StringUtils.isEmpty(getTitle()) && commits != null && sourceBranch.getName() != null
                                            && targetBranch.getNameForRemoteOperations() != null) {
                                        final String defaultTitle = pullRequestHelper.createDefaultTitle(commits,
                                                sourceBranch.getName(),
```

### ConstantValue
Condition `formattedDate == null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
        } catch (final ParseException e) {
            logger.warn("Exception hit while parsing changeset date", e);
            if (formattedDate == null) {
                // need date to be set to something because null is not handled by IntelliJ
                logger.warn("Date could not be established so defaulting to now");
```

### ConstantValue
Value `hasNotifiedUser` is always 'true'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            hasNotifiedUser = true;
        }
        return hasNotifiedUser;
    }

```

### ConstantValue
Condition `gitRepository != null` is always `true`
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java

    public static Collection<GitRemote> getTfGitRemotes(@NotNull final GitRepository gitRepository) {
        assert gitRepository != null;
        Collection<GitRemote> gitRemotes = gitRepository.getRemotes();

```

### ConstantValue
Condition `gitRepository == null` is always `false`
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java

    public static GitRemote getTfGitRemote(@NotNull final GitRepository gitRepository) {
        if (gitRepository == null) {
            throw new IllegalArgumentException();
        }
```

### ConstantValue
Value `isFound` is always 'true'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
        if (isContextFound != isFound && isFound) {
            logger.info("Context found for work items tab for first time");
            isContextFound = isFound;
            setChangedAndNotify(CONTEXT_FOUND);
        } else if (isContextFound != isFound) {
```

### ConstantValue
Value `isFound` is always 'false'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
        } else if (isContextFound != isFound) {
            logger.warn("Context became invalid and isn't known anymore");
            isContextFound = isFound;
        }
    }
```

### ConstantValue
Condition `context != null` is always `false` when reached
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
                !StringUtils.equalsIgnoreCase(context.getTeamProjectReference().getName(), teamProjectName)) {
            context = null;
            logger.info("createContextFromTfvcServerUrl context fully populated: " + (context != null));
        }

```

### ConstantValue
Value `prompt` is always 'true'
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
                        logger.info("createContextFromTfvcServerUrl: refreshing creds");
                        updateAuthenticationInfo(tfvcServerUrlString);
                        final AuthenticationInfo authenticationInfoRefreshed = getAuthenticationInfo(tfvcServerUrl, prompt);
                        final ServerContext contextToValidateRefreshed = new ServerContextBuilder()
                                .type(type).uri(tfvcServerUrl).authentication(authenticationInfoRefreshed)
```

### ConstantValue
Condition `uri == null` is always `false`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
        String uri = getHttpsGitUrlFromSshUrl(remoteUrl).concat(URL_PATH_SEGMENT).concat(filePath);

        if (uri == null) {
            //could not determine uri so open default link
            return UrlHelper.createUri(DEFAULT_TEAM_SERVICES_LINK);
```

### ConstantValue
Condition `uri != null` is always `true`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
        final URI uri = createUri(httpUrl);
        String httpsUrl = httpUrl;
        if (uri != null && StringUtils.equalsIgnoreCase(uri.getScheme(), "http")) {
            final URI httpsUri = createUri("https://" + uri.getAuthority() + uri.getPath());
            httpsUrl = httpsUri.toString();
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
        stringBuilder.append("<QueryNodes>");//$NON-NLS-1$
        stringBuilder.append("<pathSpecs>");//$NON-NLS-1$
        stringBuilder.append("<string>" + pathSpecs + "</string>");//$NON-NLS-1$ //$NON-NLS-2$
        stringBuilder.append("</pathSpecs>");//$NON-NLS-1$
        stringBuilder.append("<queryOptions>" + queryOptions + "</queryOptions>");//$NON-NLS-1$
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
        stringBuilder.append("<string>" + pathSpecs + "</string>");//$NON-NLS-1$ //$NON-NLS-2$
        stringBuilder.append("</pathSpecs>");//$NON-NLS-1$
        stringBuilder.append("<queryOptions>" + queryOptions + "</queryOptions>");//$NON-NLS-1$
        stringBuilder.append("</QueryNodes>");//$NON-NLS-1$
        stringBuilder.append("</soap:Body>");//$NON-NLS-1$
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
                    public void processStandardError(final String line) {
                        logger.info("ERROR: " + line);
                        stderr.append(line + "\n");
                        listener.progress(line, OUTPUT_TYPE_ERROR, 50);
                    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
                        }

                        stdout.append(line + "\n");
                        listener.progress(line, OUTPUT_TYPE_INFO, 50);
                    }
```

## RuleId[ruleID=SuspiciousNameCombination]
### SuspiciousNameCombination
'refreshButtonHeight' should probably not be passed as parameter 'width'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportForm.java`
#### Snippet
```java
            // Also change the refresh button width so that the button is a perfect square
            final int refreshButtonHeight = (int) refreshButton.getMinimumSize().getHeight();
            final Dimension size = new Dimension(refreshButtonHeight, refreshButtonHeight);
            refreshButton.setMinimumSize(size);
            refreshButton.setPreferredSize(size);
```

### SuspiciousNameCombination
'refreshButtonHeight' should probably not be passed as parameter 'width'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
            // Also change the refresh button width so that the button is a perfect square
            final int refreshButtonHeight = (int) refreshButton.getMinimumSize().getHeight();
            final Dimension size = new Dimension(refreshButtonHeight, refreshButtonHeight);
            refreshButton.setMinimumSize(size);
            refreshButton.setPreferredSize(size);
```

### SuspiciousNameCombination
'refreshButtonHeight' should probably not be passed as parameter 'width'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsForm.java`
#### Snippet
```java
            // Also change the refresh button width so that the button is a perfect square
            final int refreshButtonHeight = (int) refreshButton.getMinimumSize().getHeight();
            final Dimension size = new Dimension(refreshButtonHeight, refreshButtonHeight);
            refreshButton.setMinimumSize(size);
            refreshButton.setPreferredSize(size);
```

## RuleId[ruleID=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
        short highestVote = 0;

        if (pullRequest.getReviewers() != null && pullRequest.getReviewers().length > 0) {
            for (final IdentityRefWithVote reviewer : pullRequest.getReviewers()) {
                final short vote = reviewer.getVote();
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `MAX_THREADS` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java
    final int THREAD_RECOVERY_TIMEOUT_SECONDS = 5;
    // For now we are limiting ourselves to 5 threads (single threaded is way too slow)
    final int MAX_THREADS = 5;
    // No need for Core threads and Max threads to be different
    final int CORE_THREADS = MAX_THREADS;
```

### FieldMayBeStatic
Field `TASK_TIMEOUT_SECONDS` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java
    final int CORE_THREADS = MAX_THREADS;
    //timeout for each task
    final long TASK_TIMEOUT_SECONDS = 120L;

    // The number of items that can be in the Queue needs to be bigger than the number of threads (10x is somewhat arbitrary)
```

### FieldMayBeStatic
Field `THREAD_RECOVERY_TIMEOUT_SECONDS` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java
public class OperationExecutor {
    private static final Logger logger = LoggerFactory.getLogger(OperationExecutor.class);
    final int THREAD_RECOVERY_TIMEOUT_SECONDS = 5;
    // For now we are limiting ourselves to 5 threads (single threaded is way too slow)
    final int MAX_THREADS = 5;
```

### FieldMayBeStatic
Field `LOGIN_FORM` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageImpl.java`
#### Snippet
```java
public class LoginPageImpl extends JPanel implements LoginPage {
    private final String DATA_FORM = "dataForm";
    private final String LOGIN_FORM = "loginForm";
    private final BasicForm dataForm;
    private final LoginForm loginForm;
```

### FieldMayBeStatic
Field `DATA_FORM` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageImpl.java`
#### Snippet
```java

public class LoginPageImpl extends JPanel implements LoginPage {
    private final String DATA_FORM = "dataForm";
    private final String LOGIN_FORM = "loginForm";
    private final BasicForm dataForm;
```

### FieldMayBeStatic
Field `URI_PREFIX` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
    private final Logger logger = LoggerFactory.getLogger(ApplicationStarterBase.class);
    public static final String VSTS_COMMAND = "vsts";
    public final String URI_PREFIX = "vsoi://";
    private static final String ACTION_NAME = "ProtocolHandler";

```

### FieldMayBeStatic
Field `TFS2015_NEW_SERVICE` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java

    private final String CONNECTION_DATA_REST_API_PATH = "/_apis/connectionData?connectOptions=IncludeServices&lastChangeId=-1&lastChangeId64=-1&api-version=1.0";
    private final String TFS2015_NEW_SERVICE = "distributedtask";

    private Map<String, ServerContext> contextMap = new HashMap<String, ServerContext>();
```

### FieldMayBeStatic
Field `CONNECTION_DATA_REST_API_PATH` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ServerContextManager.class);

    private final String CONNECTION_DATA_REST_API_PATH = "/_apis/connectionData?connectOptions=IncludeServices&lastChangeId=-1&lastChangeId64=-1&api-version=1.0";
    private final String TFS2015_NEW_SERVICE = "distributedtask";

```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthenticationListener.java`
#### Snippet
```java
public interface AuthenticationListener {

    class Helper {
        static void authenticating(final AuthenticationListener listener) {
            if (listener != null) {
```

### UtilityClassWithoutPrivateConstructor
Class `AuthHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
 * Static helpers for Authentication
 */
public class AuthHelper {
    private final static Logger logger = LoggerFactory.getLogger(AuthHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RestClientHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/context/RestClientHelper.java`
#### Snippet
```java
 * JAXRS Rest Client helper
 */
public class RestClientHelper {

    private static Client createNewClient(ClientConfig clientConfig) {
```

### UtilityClassWithoutPrivateConstructor
Class `StatusBarManager` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
import java.util.Map;

public class StatusBarManager {
    private static final Logger logger = LoggerFactory.getLogger(StatusBarManager.class);
    private static ServerEventListener serverEventListener;
```

### UtilityClassWithoutPrivateConstructor
Class `SwingHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/SwingHelper.java`
#### Snippet
```java
 * This class is a place for static methods that help with Java Swing components.
 */
public class SwingHelper {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `VstsHttpClient` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/context/rest/VstsHttpClient.java`
#### Snippet
```java
 * Class to handle REST calls that are not part of the VSTS Java REST SDK yet, can be removed once these methods are part of the REST SDK.
 */
public class VstsHttpClient {
    public static final Logger logger = LoggerFactory.getLogger(VstsHttpClient.class);

```

### UtilityClassWithoutPrivateConstructor
Class `LookupHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
import java.util.List;

public class LookupHelper {
    private static final Logger logger = LoggerFactory.getLogger(LookupHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `DateHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/DateHelper.java`
#### Snippet
```java
 * Helps with converting dates to friendly formats
 */
public class DateHelper {
    private final static Logger logger = LoggerFactory.getLogger(DateHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ProcessHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/utils/ProcessHelper.java`
#### Snippet
```java
import java.util.List;

public class ProcessHelper {
    public static Process startProcess(final String workingDirectory, final List<String> arguments) throws IOException {
        final ProcessBuilder pb = new ProcessBuilder(arguments);
```

### UtilityClassWithoutPrivateConstructor
Class `TfTool` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
 * This is a static class that provides helper methods for running the TF command line.
 */
public class TfTool {
    private static final Logger logger = LoggerFactory.getLogger(TfTool.class);

```

### UtilityClassWithoutPrivateConstructor
Class `SystemHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
import java.net.UnknownHostException;

public class SystemHelper {
    private static Logger logger = LoggerFactory.getLogger(SystemHelper.class);
    private final static String COMPUTER_NAME = "computername";
```

### UtilityClassWithoutPrivateConstructor
Class `FileHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/common/utils/FileHelper.java`
#### Snippet
```java
 * Taken from team-explorer-everywhere: source/com.microsoft.tfs.util/src/com/microsoft/tfs/util/FileHelpers.java
 */
public final class FileHelper {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ToolRunnerCache` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunnerCache.java`
#### Snippet
```java
import java.util.concurrent.ConcurrentMap;

public class ToolRunnerCache {
    private static final Logger logger = LoggerFactory.getLogger(ToolRunnerCache.class);

```

### UtilityClassWithoutPrivateConstructor
Class `VisualStudioTfvcCommands` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcCommands.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class VisualStudioTfvcCommands {

    private static final Logger ourLogger = Logger.getInstance(VisualStudioTfvcCommands.class);
```

### UtilityClassWithoutPrivateConstructor
Class `BackCompatibleUtils` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/BackCompatibleUtils.java`
#### Snippet
```java
 * All backwards compatible logic is contained in this class to keep it in a central place to track
 */
public class BackCompatibleUtils {
    private static final Logger logger = LoggerFactory.getLogger(BackCompatibleUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `IdeaHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
import static com.intellij.openapi.ui.Messages.getWarningIcon;

public class IdeaHelper {
    private static final Logger logger = LoggerFactory.getLogger(IdeaHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `CommandUtils` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
 * Helper for running commands
 */
public class CommandUtils {
    protected static final Logger logger = LoggerFactory.getLogger(CommandUtils.class);

```

### UtilityClassWithoutPrivateConstructor
Class `OperationFactory` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/operations/OperationFactory.java`
#### Snippet
```java
 * encapsulated within other classes.
 */
public class OperationFactory {
    //TODO add other operation types
    public static BuildStatusLookupOperation createBuildStatusLookupOperation(
```

### UtilityClassWithoutPrivateConstructor
Class `TfPluginBundle` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/resources/TfPluginBundle.java`
#### Snippet
```java
 * This class allows static access to the plugins string resources.
 */
public class TfPluginBundle {
    private static final Logger logger = LoggerFactory.getLogger(TfPluginBundle.class);

```

### UtilityClassWithoutPrivateConstructor
Class `ConflictsEnvironment` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ConflictsEnvironment.java`
#### Snippet
```java
package com.microsoft.alm.plugin.idea.tfvc.core.tfs.conflicts;

public class ConflictsEnvironment {

    private static ConflictsHandler conflictsHandler = new DialogConflictsHandler();
```

### UtilityClassWithoutPrivateConstructor
Class `TfIgnoreUtil` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfIgnoreUtil.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class TfIgnoreUtil {
    public static final String TFIGNORE_FILE_NAME = ".tfignore";

```

### UtilityClassWithoutPrivateConstructor
Class `TfsFileUtil` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
// TODO review usage of getFilePath(), getVirtualFile()

public class TfsFileUtil {
    public static final Logger logger = LoggerFactory.getLogger(TfsFileUtil.class);

```

### UtilityClassWithoutPrivateConstructor
Class `TfvcWorkspaceLocator` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcWorkspaceLocator.java`
#### Snippet
```java
import java.util.Objects;

public class TfvcWorkspaceLocator {
    private static final Logger logger = LoggerFactory.getLogger(TfvcWorkspaceLocator.class);

```

### UtilityClassWithoutPrivateConstructor
Class `StatusProvider` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
 * Determines a file's state and provides it to the local changes menu
 */
public class StatusProvider {
    public static final Logger logger = LoggerFactory.getLogger(StatusProvider.class);

```

### UtilityClassWithoutPrivateConstructor
Class `TFVCUtil` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TFVCUtil.java`
#### Snippet
```java
import java.util.stream.Stream;

public class TFVCUtil {

    public static boolean isFileUnderTFVCMapping(@NotNull Project project, FilePath filePath) {
```

### UtilityClassWithoutPrivateConstructor
Class `ScheduleForDeletion` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/operations/ScheduleForDeletion.java`
#### Snippet
```java
 * Deletes a list of files through TFVC
 */
public class ScheduleForDeletion {
    public static final Logger logger = LoggerFactory.getLogger(ScheduleForDeletion.class);

```

### UtilityClassWithoutPrivateConstructor
Class `RenameFileDirectory` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/operations/RenameFileDirectory.java`
#### Snippet
```java
 * Rename a file or a directory using the tf command line
 */
public class RenameFileDirectory {
    public static final Logger logger = LoggerFactory.getLogger(RenameFileDirectory.class);

```

### UtilityClassWithoutPrivateConstructor
Class `GeneralGitHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
 * General helper class for Git functionality using Git4idea
 */
public class GeneralGitHelper {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TfvcCheckoutResultUtils` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/utils/TfvcCheckoutResultUtils.java`
#### Snippet
```java
import java.util.stream.Collectors;

public final class TfvcCheckoutResultUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `TfGitHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class TfGitHelper {
    private static final String MASTER_BRANCH_PATTERN = "%s/master";

```

### UtilityClassWithoutPrivateConstructor
Class `VcsHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class VcsHelper {
    private static final Logger logger = LoggerFactory.getLogger(VcsHelper.class);

```

### UtilityClassWithoutPrivateConstructor
Class `Lifetimes` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/reactive/Lifetimes.java`
#### Snippet
```java
import com.jetbrains.rd.util.lifetime.LifetimeStatus;

public class Lifetimes {
    public static LifetimeDefinition defineNestedLifetime(Disposable disposable) {
        LifetimeDefinition lifetimeDefinition = new LifetimeDefinition();
```

### UtilityClassWithoutPrivateConstructor
Class `WorkspaceHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
 * This is a static helper class to do various things with Workspaces and Workspace.Mappings.
 */
public class WorkspaceHelper {
    public static final String ONE_LEVEL_MAPPING_SUFFIX = "/*";

```

### UtilityClassWithoutPrivateConstructor
Class `TFSProgressUtil` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSProgressUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class TFSProgressUtil {

    public static void checkCanceled(final @Nullable ProgressIndicator progressIndicator) throws ProcessCanceledException {
```

### UtilityClassWithoutPrivateConstructor
Class `TFSContentStoreFactory` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentStoreFactory.java`
#### Snippet
```java
import java.io.IOException;

public class TFSContentStoreFactory {
    private static final Logger logger = LoggerFactory.getLogger(TFSContentStoreFactory.class);

```

### UtilityClassWithoutPrivateConstructor
Class `EventContextHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/EventContextHelper.java`
#### Snippet
```java
 * the ProjectRepoEventManager in response to IntelliJ changes like project opening/closing or repository changes.
 */
public class EventContextHelper {
    public static final String SENDER_POLLING_MANAGER = "pollingManager";
    public static final String SENDER_PROJECT_OPENED = "projectOpened";
```

### UtilityClassWithoutPrivateConstructor
Class `VisualStudioTfvcClient` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcClient.java`
#### Snippet
```java
import java.util.concurrent.CompletionStage;

public class VisualStudioTfvcClient {

    private static final Logger ourLogger = Logger.getInstance(VisualStudioTfvcClient.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ArgumentHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/common/utils/ArgumentHelper.java`
#### Snippet
```java
 * Checks for illegal arguments and throws IllegalArgumentException if found
 */
public class ArgumentHelper {
    private static final String EMPTY_ARG_MSG = "%s is empty";
    private static final String NOT_FILE_MSG = "%s expected to be a file";
```

### UtilityClassWithoutPrivateConstructor
Class `JsonHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/JsonHelper.java`
#### Snippet
```java
import java.io.IOException;

public class JsonHelper {
    private static final Logger logger = LoggerFactory.getLogger(JsonHelper.class);
    private static final ObjectMapper mapper = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `TFVCNotifications` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFVCNotifications.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class TFVCNotifications {
    private static final NotificationGroup TFS_NOTIFICATIONS = new NotificationGroup(
            TfPluginBundle.message(TfPluginBundle.KEY_TFVC_NOTIFICATIONS),
```

### UtilityClassWithoutPrivateConstructor
Class `WorkItemHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemHelper.java`
#### Snippet
```java
import java.util.Map;

public class WorkItemHelper {
    public static final String FIELD_ASSIGNED_TO = "System.AssignedTo";
    public static final String FIELD_ID = "System.Id";
```

### UtilityClassWithoutPrivateConstructor
Class `Icons` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/resources/Icons.java`
#### Snippet
```java
import javax.swing.Icon;

public class Icons {

    private static Icon load(String path) {
```

### UtilityClassWithoutPrivateConstructor
Class `VersionControlPath` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java
import java.util.Arrays;

public class VersionControlPath {
    public static final String SERVER_PATH_SEPARATOR = "/";
    public static final String ROOT_FOLDER = "$" + SERVER_PATH_SEPARATOR;
```

### UtilityClassWithoutPrivateConstructor
Class `UrlHelper` has only 'static' members, and lacks a 'private' constructor
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
import java.net.URLEncoder;

public class UrlHelper {
    private static final Logger logger = LoggerFactory.getLogger(UrlHelper.class);

```

## RuleId[ruleID=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java

        // Add in the lines from stdout
        for (final String line : getLines(stdout)) {
            lines.add(line);
        }
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/DeviceFlowResponsePromptImpl.java`
#### Snippet
```java
                    @Override
                    public void run() {
                        final DeviceFlowResponsePromptDialog promptDialog = new DeviceFlowResponsePromptDialog();;

                        promptDialog.addActionListener(new ActionListener() {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java
    public boolean isModified() {
        PropertyService propertyService = PropertyService.getInstance();
        boolean isReactiveClientEnabled = propertyService.useReactiveClient();;
        return !(propertyService.getProperty(PropertyService.PROP_TF_HOME).equals(getCurrentExecutablePath())
                && isReactiveClientEnabled == useReactiveClientCheckBox.isSelected()
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java
                if (credentials == null) {
                    // The user canceled the login prompt, so break out of the loop
                    result = false;
                    break;
                }
```

### DataFlowIssue
Variable is already assigned to this value
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java

                    error = ex;
                    result = false;
                    break;
                }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
                    updateChangesetsTable();
                }
                ((CardLayout) changesetsPanel.getLayout()).show(changesetsPanel, changesTypeCombo.getSelectedItem().toString());
                fireStateChanged();
            }
```

### DataFlowIssue
Argument `latestServerContext` might be null
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java

            // Get the actual work items
            doLookup(latestServerContext, (WitInputs) inputs);

            // let listeners know that we are done
```

### DataFlowIssue
Argument `context` might be null
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
            if (repositoryContext.getType() == RepositoryContext.Type.GIT) {
                logger.info("Getting Git build results.");
                results = getGitResults(context);
            } else {
                logger.info("Getting TFVC build results.");
```

### DataFlowIssue
Argument `context` might be null
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
            } else {
                logger.info("Getting TFVC build results.");
                results = getTfvcResults(context);
            }

```

### DataFlowIssue
Method invocation `getMappings` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddFileToTfIgnoreAction.java`
#### Snippet
```java
        Workspace partialWorkspace = TfvcWorkspaceLocator.getPartialWorkspace(myProject, true);
        String filePath = ObjectUtils.assertNotNull(
                TfsFileUtil.translateServerItemToLocalItem(partialWorkspace.getMappings(), myServerFilePath, false));
        File localFile = new File(filePath);
        ourLogger.info("Local file path: " + localFile.getAbsolutePath());
```

### DataFlowIssue
Dereference of `path.listFiles()` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
        for (final File path : paths) {
            if (path.exists()) {
                for (final File subDirectory : path.listFiles()) {
                    if (StringUtils.startsWith(subDirectory.getName(), TF_DIRECTORY_PREFIX) && subDirectory.isDirectory()) {
                        final String verifiedPath = checkTfPath(subDirectory.getPath(), exeNames);
```

### DataFlowIssue
Method invocation `isWritable` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    public static boolean isFileWritable(FilePath localPath) {
        VirtualFile file = localPath.getVirtualFile();
        return file.isWritable() && !file.isDirectory();
    }

```

### DataFlowIssue
Method invocation `getUrl` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
                        isContextFound.set(false);
                        //401 or 403 - token is not valid, prompt user for credentials and retry
                        newContext = ServerContextManager.getInstance().createContextFromGitRemoteUrl(repositoryContext.getUrl(), false);
                    } else {
                        newContext = null;
```

### DataFlowIssue
Method invocation `isCandidate` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
     */
    private static ServerStatus determineServerStatus(final @Nullable PendingChange pendingChange) {
        if (pendingChange.isCandidate()) {
            return ServerStatus.Unversioned.INSTANCE;
        }
```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSRollbackEnvironment.java`
#### Snippet
```java
        for (final Change change : changes) {
            final ContentRevision revision = change.getType() == Change.Type.DELETED ? change.getBeforeRevision() : change.getAfterRevision();
            localPaths.add(revision.getFile());
        }

```

### DataFlowIssue
Expression `EULADialog.executeWithGuard( project, () -> CommandUtils.getStatusFo...` might evaluate to null but is returned by the method declared as @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java
            @NotNull ServerContext serverContext,
            @NotNull List<String> pathsToProcess) {
        return EULADialog.executeWithGuard(
                project,
                () -> CommandUtils.getStatusForFiles(project, serverContext, pathsToProcess));
    }

```

### DataFlowIssue
Argument `gitRemoteUrl` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

                            if (context == null) {
                                notifyCreateFailedError(project, TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitRemoteUrl));
                                return;
                            }
```

### DataFlowIssue
Variable is already assigned to this value
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        try {
            remoteRepository = gitClient.createRepository(gitRepoToCreate, context.getTeamProjectReference().getId());
            t = null;
        } catch (VssServiceException vssEx) {
            t = vssEx;
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            @Override
            public ModalityState getModalityState() {
                return null;
            }

```

### DataFlowIssue
Argument `gitRemoteUrl` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(
                                        TfPluginBundle.KEY_CREATE_BRANCH_ERRORS_AUTHENTICATION_FAILED_TITLE),
                                TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitRemoteUrl));
                        return;
                    }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                    final String workingFolder = localPath.isDirectory() ?
                            localPath.getPath() :
                            localPath.getParentPath().getPath();
                    final MergeConflict mergeConflict = (MergeConflict) conflict;
                    final String sourcePath = mergeConflict.getMapping().getFromServerItem();
```

### DataFlowIssue
Method invocation `getDate` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java

                    original = TFSContentRevision.createRenameRevision(project, localPath,
                            SystemHelper.toInt(baseVersion.getValue(), 1), originalChange.getDate(), sourcePath).getContent();
                    serverChanges = TFSContentRevision.createRenameRevision(project, localPath,
                            getMergeFromVersion(mergeConflict), originalChange.getDate(), sourcePath).getContent();
```

### DataFlowIssue
Method invocation `getIdAsInt` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                        final ChangeSet serverChange = CommandUtils.getLastHistoryEntryForAnyUser(context, ((RenameConflict) conflict).getServerPath());
                        final FilePath renamePath = VersionControlPath.getFilePath(conflictLocalPath, conflictPath.isDirectory());
                        serverChanges = TFSContentRevision.createRenameRevision(project, renamePath, serverChange.getIdAsInt(), serverChange.getDate(), ((RenameConflict) conflict).getServerPath()).getContent();
                    } else {
                        final ChangeSet serverChange = CommandUtils.getLastHistoryEntryForAnyUser(context, conflictLocalPath);
```

### DataFlowIssue
Method invocation `getIdAsInt` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                    } else {
                        final ChangeSet serverChange = CommandUtils.getLastHistoryEntryForAnyUser(context, conflictLocalPath);
                        serverChanges = TFSContentRevision.create(project, localPath, serverChange.getIdAsInt(), serverChange.getDate()).getContent();
                    }
                }
```

### DataFlowIssue
Method invocation `getContentPane` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/CreateVirtualFolderAction.java`
#### Snippet
```java
    public void actionPerformed(final AnActionEvent e) {
        final TfsTreeForm form = TfsTreeForm.KEY.getData(e.getDataContext());
        final String folderName = Messages.showInputDialog(form.getContentPane(),
                TfPluginBundle.message(TfPluginBundle.KEY_ACTIONS_TFVC_SERVER_TREE_CREATE_FOLDER_MSG),
                TfPluginBundle.message(TfPluginBundle.KEY_ACTIONS_TFVC_SERVER_TREE_CREATE_FOLDER_TITLE), null);
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
     */
    protected String getIdeLocation() {
        final String resourcePath = Main.class.getResource(Main.class.getSimpleName() + CLASS_EXTENSION).getPath();
        final Pattern pattern = Pattern.compile("file:(.*?)lib/bootstrap.jar!/" + Main.class.getName() + CLASS_EXTENSION);
        final Matcher matcher = pattern.matcher(resourcePath);
```

### DataFlowIssue
Method invocation `refresh` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

                        DvcsUtil.addMappingIfSubRoot(project, FileUtil.join(new String[]{parentDirectory, directoryName}), "Git");
                        destinationParent.refresh(true, true, new Runnable() {
                            public void run() {
                                if (project.isOpen() && !project.isDisposed() && !project.isDefault()) {
```

### DataFlowIssue
Argument `project` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddAction.java`
#### Snippet
```java

        if (!errors.isEmpty()) {
            AbstractVcsHelper.getInstance(project).showErrors(errors, TFSVcs.TFVC_NAME);
        }
    }
```

### DataFlowIssue
Argument `TFSVcs.getInstance(project).getCheckinEnvironment().scheduleUnversionedFilesForAddition(Arrays.asLis...` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddAction.java`
#### Snippet
```java
            public void run() {
                ProgressManager.getInstance().getProgressIndicator().setIndeterminate(true);
                errors.addAll(TFSVcs.getInstance(project).getCheckinEnvironment().scheduleUnversionedFilesForAddition(Arrays.asList(files)));
            }
        }, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_ADD_SCHEDULING), false, project);
```

### DataFlowIssue
Method invocation `scheduleUnversionedFilesForAddition` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddAction.java`
#### Snippet
```java
            public void run() {
                ProgressManager.getInstance().getProgressIndicator().setIndeterminate(true);
                errors.addAll(TFSVcs.getInstance(project).getCheckinEnvironment().scheduleUnversionedFilesForAddition(Arrays.asList(files)));
            }
        }, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_ADD_SCHEDULING), false, project);
```

### DataFlowIssue
Expression `myMergeNameForm.getSelectedPath()` might evaluate to null but is returned by the method declared as @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/MergeNameDialog.java`
#### Snippet
```java
    @NotNull
    public String getSelectedPath() {
        return myMergeNameForm.getSelectedPath();
    }

```

### DataFlowIssue
Argument `localPathFromTfsRepresentation(localPath)` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java
    @Nullable
    public static VirtualFile getVirtualFile(@NotNull String localPath) {
        return VcsUtil.getVirtualFile(localPathFromTfsRepresentation(localPath));
    }

```

### DataFlowIssue
Argument `localPathFromTfsRepresentation(localPath)` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java
    @Nullable
    public static FilePath getFilePath(@Nullable String localPath, boolean isDirectory) {
        return localPath != null ? VcsUtil.getFilePath(localPathFromTfsRepresentation(localPath), isDirectory) : null;
    }

```

### DataFlowIssue
Argument `localPathFromTfsRepresentation(localPath)` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java

    public static File getFile(String localPath) {
        return new File(localPathFromTfsRepresentation(localPath));
    }

```

### DataFlowIssue
Method invocation `concat` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getFileURI(final String remoteUrl, final String filePath, final String gitRemoteBranchName) {
        String uri = getHttpsGitUrlFromSshUrl(remoteUrl).concat(URL_PATH_SEGMENT).concat(filePath);

        if (uri == null) {
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ProxySettingsForm.java`
#### Snippet
```java
        } else {
            useProxyRadio.setSelected(true);
            addressText.setText(initialProxyUri.toString());
        }

```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FormattedTable.java`
#### Snippet
```java

            // if column is the defaultLongColumn allow it to fill in the extra table space
            if (defaultLongColumn != null && defaultLongColumn.toLowerCase().equals(column.getHeaderValue().toString().toLowerCase())) {
                column.setPreferredWidth(Short.MAX_VALUE);
            } else {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getBestAuthenticationInfo' is still used
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * @deprecated Use {@link #getBestAuthenticationInfo(URI, boolean)} instead.
     */
    public AuthenticationInfo getBestAuthenticationInfo(final String url, final boolean prompt) {
        return getAuthenticationInfo(URI.create(url), prompt);
    }
```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsRevisionNumber.java`
#### Snippet
```java
    @Override
    public String asString() {
        return String.valueOf(getValue()) + SEPARATOR + fileName + SEPARATOR + modificationDate;
    }

```

## RuleId[ruleID=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'paintFocusRing'
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/BackCompatibleUtils.java`
#### Snippet
```java
        try {
            // trying to paint focus using the IDEA 2017 method
            final Method paintFocusRingMethodNew = DarculaUIUtil.class.getDeclaredMethod("paintFocusRing", Graphics.class, Rectangle.class);
            paintFocusRingMethodNew.invoke(null, g, new Rectangle(x, y, width, height));
        } catch (Exception newImplementationException) {
```

### JavaReflectionMemberAccess
Cannot resolve method 'paintFocusRing'
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/BackCompatibleUtils.java`
#### Snippet
```java
            try {
                logger.warn("Failed to get DarculaUIUtil.paintFocusRing() new implementation so attempting old way", newImplementationException);
                final Method paintFocusRingMethodOld = DarculaUIUtil.class.getDeclaredMethod("paintFocusRing", Graphics.class,
                        Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                paintFocusRingMethodOld.invoke(null, g, x, y, width, height);
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `createDataProvider()` during object construction
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabModelImpl.java`
#### Snippet
```java

        // need to create data provider after calling parent class since it passes the class to the provider
        createDataProvider();
    }

```

## RuleId[ruleID=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/VstsStarter.java`
#### Snippet
```java
     */
    protected Map<String, String> parseUri(final String uri) {
        final List<String> args = Arrays.asList(uri.split("&"));
        Map<String, String> attributes = new HashMap<String, String>();

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'serverContext' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ServerPathCellEditor.java`
#### Snippet
```java
    private final String title;
    private final Project project;
    private final ServerContext serverContext;

    private CellEditorComponentWithBrowseButton<JTextField> component;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'model' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildPopup.java`
#### Snippet
```java

public class BuildPopup extends JBPopupMenu {
    private final BuildStatusModel model;

    public BuildPopup(final BuildStatusModel model) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'versionFound' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolVersionException.java`
#### Snippet
```java

public class ToolVersionException extends ToolException {
    final ToolVersion versionFound;
    final ToolVersion minimumVersion;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'minimumVersion' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolVersionException.java`
#### Snippet
```java
public class ToolVersionException extends ToolException {
    final ToolVersion versionFound;
    final ToolVersion minimumVersion;

    public ToolVersionException(final ToolVersion versionFound, final ToolVersion minimumVersion) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'importForm' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageImpl.java`
#### Snippet
```java
 */
public class ImportPageImpl extends LoginPageImpl implements ImportPage {
    private final ImportForm importForm;

    public ImportPageImpl(LoginForm loginForm, ImportForm importForm) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'queryOperationInput' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
    private final Project project;
    private final LoadingAction loadingAction;
    private final WorkItemQueriesLookupOperation.QueryInputs queryOperationInput;

    private QueryAction selectedQuery;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'defaultQuery' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
    public static final String CMD_QUERY_COMBO_BOX_CHANGED = "cmdQueryComboBoxChanged";

    private final QueryAction defaultQuery;
    private final Project project;
    private final LoadingAction loadingAction;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'selectedQuery' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
    private final WorkItemQueriesLookupOperation.QueryInputs queryOperationInput;

    private QueryAction selectedQuery;

    public WorkItemQueryDropDown(final Project project) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'loadingAction' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
    private final QueryAction defaultQuery;
    private final Project project;
    private final LoadingAction loadingAction;
    private final WorkItemQueriesLookupOperation.QueryInputs queryOperationInput;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tip' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
    private final Timer hideTooltipTimer;
    private String popupText;
    private HelpIdeTooltip tip;

    public HelpPanel() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'group' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
 */
public abstract class FilterDropDown extends JPanel {
    protected final DefaultActionGroup group;
    private final ClickListener clickListener;
    private final KeyAdapter keyAdapter;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'gitPullRequest' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNode.java`
#### Snippet
```java
public class PRTreeNode extends DefaultMutableTreeNode {
    private final String name;
    private final GitPullRequest gitPullRequest;

    public PRTreeNode(final GitPullRequest gitPullRequest) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'prViewForm' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    private final static short REVIEWER_VOTE_REJECTED = -10;

    private PRTreeNodeForm prViewForm;

    public PRTreeCellRenderer() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'checkoutForm' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageImpl.java`
#### Snippet
```java
 */
class CheckoutPageImpl extends LoginPageImpl implements CheckoutPage {
    private final CheckoutForm checkoutForm;

    public CheckoutPageImpl(LoginForm loginForm, CheckoutForm checkoutForm) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'minimumVersion' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/VisualStudioClientVersionException.java`
#### Snippet
```java
public class VisualStudioClientVersionException extends ToolException {
    @NotNull final ToolVersion versionFound;
    @NotNull final ToolVersion minimumVersion;
    @NotNull final String minimalVersionNickname;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'versionFound' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/VisualStudioClientVersionException.java`
#### Snippet
```java

public class VisualStudioClientVersionException extends ToolException {
    @NotNull final ToolVersion versionFound;
    @NotNull final ToolVersion minimumVersion;
    @NotNull final String minimalVersionNickname;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'cellRenderer' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CustomTreeTable.java`
#### Snippet
```java
    private List<? extends TreeTableColumn<T>> columns;
    private ContentProvider<T> contentProvider;
    private final CellRenderer<T> cellRenderer;
    private final boolean showCellFocus;
    private final boolean showSelection;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myEventDispatcher' in a Serializable class
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsTableModel.java`
#### Snippet
```java

    private final List<ExtendedItemInfoWithSelection> items;
    private final EventDispatcher<Listener> myEventDispatcher = EventDispatcher.create(Listener.class);

    public LockItemsTableModel(@NotNull List<ExtendedItemInfo> items) {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
    public static String getTokenDescription(final String emailAddress) {
        final String tokenDescription = String.format(TOKEN_DESCRIPTION_FORMATTER,
                emailAddress, SystemHelper.getComputerName(), new Date().toString());

        return tokenDescription;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
         */
        if (illegalDollarInPath && checkForIllegalDollar) {
            logger.warn(String.format("TF10122: The path %s contains a $ at the beginning of a path component.", newPath.toString()));
            throw new ServerPathFormatException(newPath.toString());
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/LocalPath.java`
#### Snippet
```java
        // Checks for illegal dollar
        return ServerPath.canonicalize(
                serverRoot + ServerPath.PREFERRED_SEPARATOR_CHARACTER + relativeBuffer.toString(), true);
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/DateHelper.java`
#### Snippet
```java

        } catch (Throwable t) {
            logger.warn("getFriendlyDateTimeString unexpected error with input date {}", date.toString(), t);
            return date.toString();
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
        ArgumentHelper.checkNotNull(toolProcess, "toolProcess");
        ArgumentHelper.checkNotNull(argumentBuilder, "argumentBuilder");
        logger.info("sendArgsViaStandardInput: proceedWithArgs: " + argumentBuilder.toString());
        final OutputStream stdin = toolProcess.getOutputStream();
        final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin, StandardCharsets.UTF_8));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
        logger.info("ToolRunner.start: workingDirectory = " + workingDirectory);
        ArgumentHelper.checkNotNull(argumentBuilder, "argumentBuilder");
        logger.info("arguments: " + argumentBuilder.toString());

        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/VstsStarter.java`
#### Snippet
```java
        attributes.remove(IDE_EXE_ATTRIBUTE);

        logger.debug("The URI attributes found are: " + attributes.entrySet().toString());
        return attributes;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/external/reactive/RdIdeaLoggerFactory.java`
#### Snippet
```java
        return message == null
                ? throwable.toString()
                : String.format("%s: %s", message.toString(), throwable.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/plugin/external/reactive/RdIdeaLoggerFactory.java`
#### Snippet
```java
        return message == null
                ? throwable.toString()
                : String.format("%s: %s", message.toString(), throwable.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static URI resolveEndpointUri(URI baseUri, String endpointPath) {
        if (!baseUri.getPath().endsWith("/")) {
            baseUri = createUri(baseUri.toString() + "/");
        }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `PullRequestLookupResults` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
    private final PullRequestLookupResults assignedToMeResults = new PullRequestLookupResults(PullRequestScope.ASSIGNED_TO_ME);

    public class PullRequestLookupResults extends ResultsImpl {
        private final List<GitPullRequest> pullRequests = new ArrayList<GitPullRequest>();
        private final PullRequestScope scope;
```

### InnerClassMayBeStatic
Inner class `WitResults` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
    }

    public class WitResults extends ResultsImpl {
        private final List<WorkItem> workItems;
        private final ServerContext context;
```

### InnerClassMayBeStatic
Inner class `MyHttpClient` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/VsoAuthInfoProvider.java`
#### Snippet
```java
    // We are subclassing the AccountHttpClient here in order to add mapped exceptions
    // TODO: add handling in the TFS Java REST SDK for these exceptions
    private class MyHttpClient extends AccountHttpClient {

        public MyHttpClient(final Client jaxrsClient, final URI baseUrl) {
```

### InnerClassMayBeStatic
Inner class `ServerContextLookupResults` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
    private final ContextScope resultScope;

    public class ServerContextLookupResults extends ResultsImpl {
        private final List<ServerContext> serverContexts = new ArrayList<ServerContext>();

```

### InnerClassMayBeStatic
Inner class `Row` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
    }

    public class Row {
        public Row(final Row otherRow) {
            this.serverPath = otherRow.serverPath;
```

### InnerClassMayBeStatic
Inner class `QueryData` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
    }

    private class QueryData {
        final String pathSpecs;
        final int queryOptions;
```

### InnerClassMayBeStatic
Inner class `KeyValueOfStringString` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
    }

    private class KeyValueOfStringString implements ElementDeserializable {
        String key;
        String value;
```

### InnerClassMayBeStatic
Inner class `ServerWorkspaceContentProvider` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * The tree content provider that populates the tree's servers and workspaces
     */
    protected class ServerWorkspaceContentProvider implements ContentProvider {
        public Collection<?> getRoots() {
            // pass no context so that all servers saved in the cache are found
```

### InnerClassMayBeStatic
Inner class `HelpIdeTooltip` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
    }

    private class HelpIdeTooltip extends IdeTooltip {
        private boolean showing = false;

```

### InnerClassMayBeStatic
Inner class `HelpPopupCommand` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
    }

    private class HelpPopupCommand {
        private final String text;
        private final String command;
```

### InnerClassMayBeStatic
Inner class `LoadingAction` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
     * Always disabled and is just there to inform the users what is happening
     */
    protected class LoadingAction extends DumbAwareAction {

        public LoadingAction() {
```

### InnerClassMayBeStatic
Inner class `QueryResults` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemQueriesLookupOperation.java`
#### Snippet
```java
     * Constructor for QueryResults that shows the output of the server call along with what inputs were used to obtain the results
     */
    public class QueryResults extends ResultsImpl {
        private final List<QueryHierarchyItem> queries;
        private final QueryInputs inputs;
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final MessageDigest digest;
        try {
            //noinspection HardCodedStringLiteral
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
```

### RedundantSuppression
Redundant suppression
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java
    protected void update(final PresentationData presentation) {
        if (isRoot()) {
            //noinspection ConstantConditions
            presentation.addText(treeContext.serverContext.getUri().getPath(), getPlainAttributes());
            presentation.setIcon(Icons.VSLogoSmall);
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `IdeaHelper` has only 'static' members, and a 'public' constructor
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
import static com.intellij.openapi.ui.Messages.getWarningIcon;

public class IdeaHelper {
    private static final Logger logger = LoggerFactory.getLogger(IdeaHelper.class);

```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
                    this.resourceTypeIdentifier = attributeValue;
                } else if (localName.equalsIgnoreCase("MatchedQuery")) { //$NON-NLS-1$
                    this.matchedQuery = Boolean.valueOf(attributeValue);
                }
                // Ignore unknown attributes.
```

## RuleId[ruleID=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/OpenFileInBrowserAction.java`
#### Snippet
```java
        final String path = FileUtil.toSystemIndependentName(virtualFilePath);
        try {
            return URLEncoder.encode(path, UTF_8);
        } catch (UnsupportedEncodingException e) {
            // eat it; UTF-8 is a required charset and is always present
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
        // find location of the resource
        String resourcePath = resourceUrl.getPath();
        resourcePath = URLDecoder.decode(resourcePath, CHARSET_UTF8);
        resourcePath = StringUtils.chomp(resourcePath, "/");

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
            // decode URI since CLC does not expect encoded collection urls
            try {
                builder.addSwitch("collection", URLDecoder.decode(collectionURI, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.warn("Error while decoding collection url. Using encoded url instead", e);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static String decode(String urlParameter) {
        try {
            return URLDecoder.decode(urlParameter, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            /*
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static String encode(String urlParameter) {
        try {
            return URLEncoder.encode(urlParameter, "UTF-8");
        } catch (final UnsupportedEncodingException ex) {
            /*
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
    public void premain(String[] args) {
        if (!checkArguments(args)) {
            System.err.println(getUsageMessage());
            // exit code IntelliJ uses checkArgs failure
            System.exit(1);
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthenticationInfo.java`
#### Snippet
```java
     * @deprecated
     */
    public AuthenticationInfo() {
        this(null, null, null, null, null, null);
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * @deprecated Use {@link #getBestAuthenticationInfo(URI, boolean)} instead.
     */
    public AuthenticationInfo getBestAuthenticationInfo(final String url, final boolean prompt) {
        return getAuthenticationInfo(URI.create(url), prompt);
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * @deprecated Use {@link #getAuthenticationInfo(URI, boolean)} instead.
     */
    public AuthenticationInfo getAuthenticationInfo(String gitRemoteUrl, boolean prompt) {
        return getAuthenticationInfo(UrlHelper.createUri(gitRemoteUrl), prompt);
    }
```

## RuleId[ruleID=RedundantNullableReturnType]
### RedundantNullableReturnType
'getWorkspaceFor' always returns non-null type
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java

    val workspaces = Property<List<Workspace>>(listOf())
    private fun getWorkspaceFor(path: TfsPath): Workspace? {
        for (workspace in workspaces.value) {
            if (workspace.isPathMapped(path)) {
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'object == null' covered by subsequent condition '!(object instanceof Workspace)'
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
    @Override
    public boolean equals(final Object object) {
        if (object == null || !(object instanceof Workspace)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'result != null' covered by subsequent condition 'result instanceof NodeList'
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
        try {
            final Object result = xpath.evaluate(xpathQuery, xmlInput, XPathConstants.NODESET);
            if (result != null && result instanceof NodeList) {
                return (NodeList) result;
            }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        // If the username has a backslash, then the domain is the first part and the username is the second part
        if (userName.contains("\\")) {
            String[] parts = userName.split("[\\\\]");
            if (parts.length == 2) {
                domain = parts[0];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        } else if (userName.contains("/")) {
            // If the username has a slash, then the domain is the first part and the username is the second part
            String[] parts = userName.split("[/]");
            if (parts.length == 2) {
                domain = parts[0];
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        } else if (userName.contains("@")) {
            // If the username has an asterisk, then the domain is the second part and the username is the first part
            String[] parts = userName.split("[@]");
            if (parts.length == 2) {
                user = parts[0];
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
            if (StringUtils.startsWithIgnoreCase(args[1], URI_PREFIX)) {
                // pass the uri but after removing it's prefix since it isn't needed anymore
                processUri(args[1].replaceFirst(URI_PREFIX, StringUtils.EMPTY));
            } else {
                List<String> argsList = new ArrayList<String>(Arrays.asList(args));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteCommand.java`
#### Snippet
```java

    private static void parseStdErr(String stderr, List<TfsPath> notFoundFiles, List<String> errorMessages) {
        String[] lines = stderr.split("\r\n|\n");
        for (String line : lines) {
            if (StringUtils.isEmpty(line))
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/VstsStarter.java`
#### Snippet
```java
    @Override
    protected void processUri(final String uri) throws RuntimeException, UnsupportedEncodingException {
        final String[] args = uri.split("/\\?");

        if (args.length != 2) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
                    path = getFilePath(line, StringUtils.EMPTY, StringUtils.EMPTY);
                } else if (StringUtils.startsWith(line, NEW_FILE_PREFIX)) {
                    newFiles.add((new File(path, line.replaceFirst(NEW_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
                } else if (StringUtils.startsWith(line, UPDATED_FILE_PREFIX)) {
                    updatedFiles.add((new File(path, line.replaceFirst(UPDATED_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
                    newFiles.add((new File(path, line.replaceFirst(NEW_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
                } else if (StringUtils.startsWith(line, UPDATED_FILE_PREFIX)) {
                    updatedFiles.add((new File(path, line.replaceFirst(UPDATED_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
                } else if (StringUtils.startsWith(line, DELETED_FILE_PREFIX)) {
                    deletedFiles.add((new File(path, line.replaceFirst(DELETED_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
                    updatedFiles.add((new File(path, line.replaceFirst(UPDATED_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
                } else if (StringUtils.startsWith(line, DELETED_FILE_PREFIX)) {
                    deletedFiles.add((new File(path, line.replaceFirst(DELETED_FILE_PREFIX, StringUtils.EMPTY)).getPath()));
                } else {
                    // TODO: check for other cases to cover here but no need to hinder user if case not covered
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            // ref update will create a new ref when no existing ref is found (we check for existing)
            final GitRefUpdate gitRefUpdate = new GitRefUpdate();
            gitRefUpdate.setName(REFS_PREFIX + getBranchName().replaceFirst(ORIGIN_PREFIX, StringUtils.EMPTY));
            gitRefUpdate.setOldObjectId(BASE_HASH); // since branch is new the last commit hash is all 0's
            gitRefUpdate.setNewObjectId(GeneralGitHelper.getLastCommitHash(project, gitRepository, selectedRemoteBranch)); // TODO: get the latest commit from server b/c the latest local commit could be incorrect
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/plugin/external/commands/CheckoutCommand.java`
#### Snippet
```java

    private static void parseStdErr(String stderr, List<TfsLocalPath> notFoundFiles, List<String> errorMessages) {
        String[] lines = stderr.split("\r\n|\n");
        for (String line : lines) {
            if (StringUtils.isEmpty(line))
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            //strip leading and trailing slashes
            final String gitUrlPath = gitUri.normalize().getPath()
                    .replaceAll("/$", "")
                    .replaceAll("^/", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            final String gitUrlPath = gitUri.normalize().getPath()
                    .replaceAll("/$", "")
                    .replaceAll("^/", "");

            return gitUrlPath.split("/");
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.http.auth` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        }

        return new org.apache.http.auth.NTCredentials(user, password, workstation, domain);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ActionListenerContainer.java`
#### Snippet
```java

public class ActionListenerContainer {
    private java.util.List<ActionListener> actionListeners = new ArrayList<ActionListener>();

    public void triggerEvent(final ActionEvent event) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
    public static String getComputerName() {
        try {
            java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
            return localMachine.getHostName();
        } catch (UnknownHostException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
    public static String getComputerName() {
        try {
            java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
            return localMachine.getHostName();
        } catch (UnknownHostException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteCommand.java`
#### Snippet
```java
    }

    private void parseStdOut(String stdout, List<java.nio.file.Path> deletedPaths) {
        final String[] lines = getLines(stdout);
        String path = StringUtils.EMPTY;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteCommand.java`
#### Snippet
```java
     */
    public TfvcDeleteResult parseOutput(String stdout, String stderr) {
        List<java.nio.file.Path> deletedPaths = Lists.newArrayList();
        List<TfsPath> notFoundFiles = Lists.newArrayList();
        List<String> errorMessages = Lists.newArrayList();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.slf4j` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
public class EULADialog extends DialogWrapper {
    private static boolean isDialogOnScreen = false;
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(EULADialog.class);
    private static boolean myWasShow = false;
    private final JBScrollPane myScrollPane;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.reference` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/idea/common/resources/TfPluginBundle.java`
#### Snippet
```java

    private static ResourceBundle getBundle() {
        ResourceBundle bundle = com.intellij.reference.SoftReference.dereference(thisBundle);
        if (bundle == null) {
            try {
```

### UnnecessaryFullyQualifiedName
Qualifier `git4idea.checkout` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/checkout/GitCheckoutModel.java`
#### Snippet
```java
        final String gitRepositoryStr = context.getUsableGitUrl();
        final Git git = ServiceManager.getService(Git.class);
        git4idea.checkout.GitCheckoutProvider.clone(project, git, listener,
                destinationParent,
                gitRepositoryStr,
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.alm.plugin.external.models` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     *
     * @param serverPath the server path to translate into a local path (must not be <code>null</code> or empty)
     * @param mappings  the {@link com.microsoft.alm.plugin.external.models.Workspace.Mapping} mappings to translate
     *                  with; can be arranged in any order (must not be <code>null</code>)
     * @return the {@link String} with the translation information ({@link String} is <code>null</code> for cloaked
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.alm.plugin.external.models` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     * @param serverPath the server path to translate into a local path (must not be
     *                   <code>null</code> or empty)
     * @param mappings   the {@link com.microsoft.alm.plugin.external.models.Workspace.Mapping} mappings to translate with; can be
     *                   arranged in any order (must not be <code>null</code>)
     * @param checkForIllegalDollar whether to check for an illegal '$' character in path
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.alm.plugin.external.models` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     * @param localPath the local path to translate into a server path (must not be
     *                  <code>null</code> or empty)
     * @param mappings  the {@link com.microsoft.alm.plugin.external.models.Workspace.Mapping} mappings to translate with; can be
     *                  arranged in any order (must not be <code>null</code>)
     * @return the working folder mapping that most precisely matches the given
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.visualstudio.services.webapi.patch` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        // create the operation that will add the link to the work item
        final JsonPatchOperation operation = new JsonPatchOperation();
        operation.setOp(com.microsoft.visualstudio.services.webapi.patch.Operation.ADD);
        operation.setPath(RELATIONS_PATH);
        operation.setValue(link);
```

### UnnecessaryFullyQualifiedName
Qualifier `git4idea.checkout` is unnecessary, and can be replaced with an import
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                    final Git git = ServiceManager.getService(Git.class);
                    logger.info("Cloning repo " + gitRepositoryStr);
                    cloneResult.set(git4idea.checkout.GitCheckoutProvider.doClone(project, git, getDirectoryName(), getParentDirectory(), gitRepositoryStr));
                }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
            if (AuthHelper.isNotAuthorizedError(results.getError())) {
                newContext = ServerContextManager.getInstance().updateAuthenticationInfo(repositoryContext.getUrl()); //call this on a background thread, will hang UI thread if not
            } else if (results.getError() instanceof java.lang.AssertionError &&
                    StringUtils.containsIgnoreCase(results.getError().getMessage(), "Microsoft.TeamFoundation.Git.Server.GitRepositoryNotFoundException")) {
                //repo was probably deleted on the server
```

### UnnecessaryFullyQualifiedName
Qualifier `com.microsoft.alm.plugin.context.rest` is unnecessary and can be removed
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
                throw new TeamServicesException(TeamServicesException.KEY_TFS_UNSUPPORTED_VERSION);
            }
        } catch (com.microsoft.alm.plugin.context.rest.VstsHttpClient.VstsHttpClientException e) {
            if (e.getStatusCode() == 404) {
                //HTTP not found, so server does not have this endpoint (TFS 2012 or older) or the URL is incorrect
```

## RuleId[ruleID=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java

    public TableModelSelectionConverter getSelectionConverter() {
        if (converter == null) {
            return DEFAULT_CONVERTER;
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    private void notifyError(final Project project, final String title, final String message) {
        if (message != null) {
            VcsNotifier.getInstance(project).notifyError(title, message);
        } else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java

    public TableModelSelectionConverter getSelectionConverter() {
        if (converter == null) {
            return DEFAULT_CONVERTER;
        } else {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TabFormImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
    protected Timer timer;

    public TabFormImpl(final String tabTitle, final String createDialogTitle, final String refreshTooltip, final String toolbarLocation) {
        this.tabTitle = tabTitle;
        this.createDialogTitle = createDialogTitle;
```

### NonProtectedConstructorInAbstractClass
Constructor `TreeTableColumn()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/TreeTableColumn.java`
#### Snippet
```java
    private final int width;

    public TreeTableColumn(final String caption, final int width) {
        this.caption = caption;
        this.width = width;
```

### NonProtectedConstructorInAbstractClass
Constructor `LoginPageModelImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java
    private PageModel pageModel;

    public LoginPageModelImpl(final PageModel pageModel) {
        this.pageModel = pageModel;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CheckoutPageModelImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
    private final ServerContextLookupListener repositoryProvider;

    public CheckoutPageModelImpl(final CheckoutModel checkoutModel, final ServerContextTableModel.Column[] columns) {
        super(checkoutModel);
        parentModel = checkoutModel;
```

### NonProtectedConstructorInAbstractClass
Constructor `FilterDropDown()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java


    public FilterDropDown() {
        this.group = new DefaultActionGroup();

```

### NonProtectedConstructorInAbstractClass
Constructor `ImportPageModelImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
    private final static String PROJECT_CAPABILITY_VC_GIT = "Git";

    public ImportPageModelImpl(final ImportModel importModel, final ServerContextTableModel.Column[] columns) {
        super(importModel);
        parentDialogModel = importModel;
```

### NonProtectedConstructorInAbstractClass
Constructor `TabControllerImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java
    protected T model;

    public TabControllerImpl(@NotNull final Tab tab, @NotNull T model, final ServerEvent[] eventFilters) {
        this.tab = tab;
        this.model = model;
```

### NonProtectedConstructorInAbstractClass
Constructor `Command()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
    }

    public Command(final String name, final ServerContext context, final boolean useProxyIfAvailable, final boolean logStdOut) {
        this.name = name;
        this.context = context;
```

### NonProtectedConstructorInAbstractClass
Constructor `Command()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
    }

    public Command(final String name, final ServerContext context) {
        this(name, context, true, true);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TabModelImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabModelImpl.java`
#### Snippet
```java
    protected Operation.CredInputsImpl operationInputs;

    public TabModelImpl(@NotNull final Project project, @NotNull T viewModel, String propertyStoragePrefix) {
        this.project = project;
        this.viewForModel = viewModel;
```

### NonProtectedConstructorInAbstractClass
Constructor `MultipleItemAction()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
    public static final Logger logger = LoggerFactory.getLogger(MultipleItemAction.class);

    public MultipleItemAction(final String title, final String message) {
        super(title, message, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SimpleMultipleItemAction()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/SimpleMultipleItemAction.java`
#### Snippet
```java
abstract class SimpleMultipleItemAction extends MultipleItemAction<ItemInfo> {

    public SimpleMultipleItemAction(String title, String message) {
        super(title, message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TabLookupListenerImpl()` of an abstract class should not be declared 'public'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
    protected RepositoryContext repositoryContext;

    public TabLookupListenerImpl(@NotNull final TabModel model) {
        this.model = model;
    }
```

## RuleId[ruleID=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new MergeBranchForm.Listener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchDialog.java`
#### Snippet
```java
                (String) getProperty(PROP_SOURCE_PATH), (Boolean) getProperty(PROP_SOURCE_IS_DIR), getTitle(),
                (BranchListProvider) getProperty(PROP_BRANCH_LIST_PROVIDER));
        mergeBranchForm.addListener(new MergeBranchForm.Listener() {
            public void stateChanged(final boolean canFinish) {
                setOkEnabled(canFinish);
```

### Anonymous2MethodRef
Anonymous new ProxySettingsForm.Listener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ProxySettingsDialog.java`
#### Snippet
```java
        } else {
            updateButtons();
            form.addListener(new ProxySettingsForm.Listener() {
                public void stateChanged() {
                    updateButtons();
```

### Anonymous2MethodRef
Anonymous new ActionListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/FeedbackAction.java`
#### Snippet
```java
        final JBMenuItem menuItem = new JBMenuItem(text, icon);
        menuItem.setActionCommand(actionCommand);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java

                // TODO (JETBRAINS) don't do it on focus out, rather provide a 'Refresh' button
                ApplicationManager.getApplication().invokeLater(new Runnable() {
                    @Override
                    public void run() {
```

### Anonymous2MethodRef
Anonymous new LockItemsTableModel.Listener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java
    protected JComponent createCenterPanel() {
        form = new LockItemsForm((List<ExtendedItemInfo>) getProperty(PROP_ITEMS));
        form.addListener(new LockItemsTableModel.Listener() {
            public void selectionChanged() {
                updateControls();
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutController.java`
#### Snippet
```java
    private void setupDialog() {
        dialog.setRepoUrl(model.getRepoUrl());
        dialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java

    private void setupDialog() {
        dialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

### Anonymous2MethodRef
Anonymous new Callable() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    public void loadDiff() {
        if (this.getSourceBranch() != null && this.getTargetBranch() != null) {
            ListenableFuture<GitChangesContainer> diffFuture = this.executorService.submit(new Callable<GitChangesContainer>() {
                @Override
                public GitChangesContainer call() throws Exception {
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestController.java`
#### Snippet
```java

    private void setupDialog() {
        this.createDialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java
        });

        dialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportController.java`
#### Snippet
```java
        });

        dialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

### Anonymous2MethodRef
Anonymous new ValidationListener() can be replaced with method reference
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchController.java`
#### Snippet
```java

    private void setupDialog() {
        dialog.addValidationListener(new ValidationListener() {
            @Override
            public ValidationInfo doValidate() {
```

## RuleId[ruleID=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/OperationExecutor.java`
#### Snippet
```java

    private synchronized void execute(final Operation operation, final Operation.Inputs inputs) {
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java

                // TODO (JETBRAINS) don't do it on focus out, rather provide a 'Refresh' button
                ApplicationManager.getApplication().invokeLater(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
                    // When we receive an event that builds have changed, update the status bar (ON UI THREAD)
                    if (event == ServerEvent.BUILDS_CHANGED) {
                        IdeaHelper.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
        // Tell the UI to update and restart the timer
        // (This should be done on the UI thread)
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
            //TODO: get rid of the calls that create more background tasks unless they run in parallel
            try {
                authTasks.add(OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
        final List<Future> lookupTasks = new ArrayList<Future>();
        try {
            lookupTasks.add(OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
                }
            }));
            lookupTasks.add(OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
        // always returns them in id order. We need to use the map we created above to put
        // them back into the correct order based on the query.
        Collections.sort(items, new Comparator<WorkItem>() {
            @Override
            public int compare(final WorkItem wi1, final WorkItem wi2) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/CredentialsPromptImpl.java`
#### Snippet
```java
    public boolean prompt(final String serverUrl, final String defaultUserName) {
        promptSuccess = false;
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java
                        if (controller.showModalDialog(false)) {
                            // Save and Sync the workspace (this will be backgrounded)
                            controller.saveWorkspace(localPath, true, new Runnable() {
                                @Override
                                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java
                    logger.warn("Error creating workspace: " + LocalizationServiceImpl.getInstance().getExceptionMessage(e));
                    // TODO: allow user to change name in the flow instead of starting over
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java
                } catch (final RuntimeException e) {
                    logger.warn("Error while mapping workspace during creation", e);
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java

        // Check the folder for any dirty files
        destinationParent.refresh(true, true, new Runnable() {
            public void run() {
                if (project.isOpen() && !project.isDisposed() && !project.isDefault()) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/ServerContextLookupOperation.java`
#### Snippet
```java
            for (final ServerContext context : contextList) {
                // submit each account as a separate piece of work to the executor
                tasks.add(OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
                public void authenticated(final AuthenticationInfo authenticationInfo, final Throwable throwable) {
                    // Push this event back onto the UI thread
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
                public void authenticating() {
                    // Push this event back onto the UI thread
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
                @Override
                public void authenticating() {
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
                    if (validationInfo != ModelValidationInfo.NO_ERRORS) {
                        // Push this event back onto the UI thread
                        IdeaHelper.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LookupHelper.java`
#### Snippet
```java
                public void authenticated(final AuthenticationInfo authenticationInfo, final Throwable throwable) {
                    // Push this event back onto the UI thread
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/LabelAction.java`
#### Snippet
```java
        // Check to see if the label name already exists
        final List<TfvcLabel> labels = new ArrayList<TfvcLabel>();
        runWithProgress(actionContext, new Runnable() {
            public void run() {
                logger.info("Getting labels that match: " + d.getLabelName());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/LabelAction.java`
#### Snippet
```java

        final StringBuilder successMessage = new StringBuilder();
        runWithProgress(actionContext, new Runnable() {
            public void run() {
                logger.info("Creating/Updating the label on the server");
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java
    private static final Logger LOG = Logger.getInstance(TfsTreeBuilder.class.getName());

    private static final Comparator<NodeDescriptor> COMPARATOR = new Comparator<NodeDescriptor>() {
        public int compare(NodeDescriptor o1, NodeDescriptor o2) {
            if (o1 instanceof TfsErrorTreeNode) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesController.java`
#### Snippet
```java
        } else if (ManageWorkspacesForm.CMD_EDIT_WORKSPACE.equals(e.getActionCommand())) {
            // need to pass update so it can run once update is complete in the background or else we won't pick up changes
            model.editWorkspaceWithProgress(dialog.getSelectedWorkspace(), new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
        final Ref<VirtualFile> selectedFile = Ref.create();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
                    } catch (final BranchAlreadyExistsException e) {
                        logger.warn("Branch already exists");
                        IdeaHelper.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java

                    final String message = TfPluginBundle.message(TfPluginBundle.KEY_ACTIONS_TFVC_BRANCH_MESSAGE_SUCCESS, sourceServerPath, targetServerPath);
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
            //}

            ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
                public void run() {
                    ProgressManager.getInstance().getProgressIndicator().setFraction(.1);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
    private void loadWorkspaceComplete() {
        // Make sure to fire events only on the UI thread
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        setLoading(true);
        // Load
        OperationExecutor.getInstance().submitOperationTask(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
        }

        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
                //TODO: get rid of the calls that create more background tasks unless they run in parallel
                try {
                    authTasks.add(OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
            // pass no context so that all servers saved in the cache are found
            final List<Server> servers = new ArrayList<Server>(CommandUtils.getAllWorkspaces(null));
            Collections.sort(servers, new Comparator<Server>() {
                public int compare(final Server s1, final Server s2) {
                    return s1.getName().compareTo(s2.getName());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
                }

                IdeaHelper.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
                final List<Workspace> workspaces = new ArrayList<Workspace>(((Server) parent).getWorkspaces());

                Collections.sort(workspaces, new Comparator<Workspace>() {
                    public int compare(final Workspace w1, final Workspace w2) {
                        return w1.getName().compareTo(w2.getName());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextLookupListener.java`
#### Snippet
```java
        logger.info("ServerContext lookup completed");
        operationDone();
        IdeaHelper.runOnUIThread(new Runnable() {
            public void run() {
                pageModel.setLoading(false);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextLookupListener.java`
#### Snippet
```java
    public void notifyLookupStarted() {
        logger.info("ServerContext lookup started");
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextLookupListener.java`
#### Snippet
```java
        if (lookupResults.isCancelled()) {
            operationDone();
            IdeaHelper.runOnUIThread(new Runnable() {
                public void run() {
                    pageModel.addError(ModelValidationInfo.createWithResource(TfPluginBundle.KEY_OPERATION_LOOKUP_CANCELED));
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextLookupListener.java`
#### Snippet
```java
            });
        } else {
            IdeaHelper.runOnUIThread(new Runnable() {
                public void run() {
                    pageModel.appendContexts(lookupResults.getServerContexts());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

    public static void markFileDirty(final Project project, final @NotNull VirtualFile file) {
        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                VcsDirtyScopeManager.getInstance(project).fileDirty(file);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
                        public void run() {
                            VirtualFileManager.getInstance().refreshAndFindFileByUrl(path.getPath());
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        }

        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                for (FilePath root : roots) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    try {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

    public static void markDirtyRecursively(final Project project, final FilePath rootDir) {
        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                VcsDirtyScopeManager.getInstance(project).dirDirtyRecursively(rootDir);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

    public static void refreshAndMarkDirty(final Project project, final VirtualFile[] roots, boolean async) {
        RefreshQueue.getInstance().refresh(async, true, new Runnable() {
            public void run() {
                for (VirtualFile root : roots) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        }

        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                for (FilePath root : roots) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
                        public void run() {
                            try {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

    public static void markFileDirty(final Project project, final @NotNull FilePath file) {
        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                VcsDirtyScopeManager.getInstance(project).fileDirty(file);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    public static void refreshAndFindFile(final FilePath path) {
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
                // only remove loading when we have actually gotten a context and made a successful call to get the queries
                if (isContextFound.get()) {
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java
                    }
                    // Update table model on UI thread
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
            @Override
            public void actionPerformed(final ActionEvent e) {
                IdeaHelper.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
            @Override
            public void actionPerformed(final ActionEvent e) {
                IdeaHelper.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java

        // update color on UI thread
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                    logger.warn("onFailure in loadDiff", thrown);

                    applicationProvider.invokeAndWaitWithAnyModality(new Runnable() {
                        public void run() {
                            final GitLocalBranch sourceBranch = getSourceBranch();
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    public void loadDiff() {
        if (this.getSourceBranch() != null && this.getTargetBranch() != null) {
            ListenableFuture<GitChangesContainer> diffFuture = this.executorService.submit(new Callable<GitChangesContainer>() {
                @Override
                public GitChangesContainer call() throws Exception {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
            Futures.addCallback(diffFuture, new FutureCallback<GitChangesContainer>() {
                public void onSuccess(final GitChangesContainer changesContainer) {
                    applicationProvider.invokeAndWaitWithAnyModality(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                // if we missed the cache, then show the loading spinner, otherwise
                                // just switch to the diff we have to avoid flickering the screen
                                applicationProvider.invokeAndWaitWithAnyModality(new Runnable() {
                                    @Override
                                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                if (StringUtils.equalsIgnoreCase(remote.getName(), REMOTE_ORIGIN)) {
                    //remote named origin exits, ask user if they want to overwrite it and proceed or cancel
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        // warn user to verify their project is a hybrid project
        final List<String> proceed = new ArrayList<String>();
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                        logger.info("Checking out new branch: " + branchName);
                        // Creating a branch using the brancher has to start on the UI thread (it will background the work itself)
                        IdeaHelper.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java

        // sort results based on path
        Collections.sort(conflicts, new Comparator<Conflict>() {
            @Override
            public int compare(Conflict conflict1, Conflict conflict2) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
        });

        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java

                        //prompt user for confirmation
                        IdeaHelper.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java

        // Push back onto the UI thread and refresh the model
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/DialogConflictsHandler.java`
#### Snippet
```java
public class DialogConflictsHandler implements ConflictsHandler {
    public void resolveConflicts(final Project project, final ResolveConflictHelper conflictHelper) {
        WaitForProgressToShow.runOrInvokeAndWaitAboveProgress(new Runnable() {
            public void run() {
                final ResolveConflictsController controller = new ResolveConflictsController(project, conflictHelper);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java

        logger.info("Finding the list of selected files and getting itemInfos for each one");
        runWithProgress(context, new Runnable() {
            public void run() {
                ProgressManager.getInstance().getProgressIndicator().setIndeterminate(true);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     */
    protected boolean runWithProgress(final MultipleItemActionContext context, final Runnable runnable, final String progressMessage) {
        ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
            public void run() {
                try {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                    // TODO: refactor to use existing call instead of calling twice. Current call happens too late currently
                    // TODO: so that's why we need to call this beforehand so we can checkout the branch
                    manager.addInitializationRequest(VcsInitObject.MAPPINGS, new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new DumbAwareRunnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

                    // step to checkout the desired branch
                    manager.addInitializationRequest(VcsInitObject.AFTER_COMMON, new DumbAwareRunnable() {
                        public void run() {
                            final GitRepositoryManager gitRepositoryManager = ServiceManager.getService(lastOpenedProject, GitRepositoryManager.class);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                                final String remoteRef = fullRefName;
                                // Checking out a branch using the brancher has to start on the UI thread but moves to the background
                                IdeaHelper.runOnUIThread(new Runnable() {
                                    @Override
                                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

                        DvcsUtil.addMappingIfSubRoot(project, FileUtil.join(new String[]{parentDirectory, directoryName}), "Git");
                        destinationParent.refresh(true, true, new Runnable() {
                            public void run() {
                                if (project.isOpen() && !project.isDisposed() && !project.isDefault()) {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
        final TfsTreeNode treeNode = (TfsTreeNode) o;
        final TfsTreeNode child = treeNode.createVirtualSubfolder(folderName);
        treeBuider.queueUpdateFrom(treeNode, true).doWhenDone(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddAction.java`
#### Snippet
```java

        final List<VcsException> errors = new ArrayList<VcsException>();
        ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
            public void run() {
                ProgressManager.getInstance().getProgressIndicator().setIndeterminate(true);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
    public void notifyLookupCompleted() {
        operationDone();
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
        if (results.isCancelled()) {
            operationDone();
            IdeaHelper.runOnUIThread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
                newContext = null;
            }
            IdeaHelper.runOnUIThread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
        } else {
            isContextFound = true;
            IdeaHelper.runOnUIThread(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
    @Override
    public void notifyLookupStarted() {
        IdeaHelper.runOnUIThread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/DeviceFlowResponsePromptImpl.java`
#### Snippet
```java
            @Override
            public void call(final DeviceFlowResponse deviceFlowResponse) {
                IdeaHelper.runOnUIThread(new Runnable() {

                    @Override
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java

                // Set loading to false to stop the spinner
                IdeaHelper.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
                    }
                    // Update table model on UI thread
                    IdeaHelper.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
            try {
                //TODO should this be an IntelliJ background task so we can provide progress information? (if so we should pass the progress indicator to createBranch and create association)
                OperationExecutor.getInstance().submitOperationTask(new Runnable() {
                    @Override
                    public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
        rows.addAll(contexts);
        // Sort the rows by the first column
        Collections.sort(rows, new Comparator<ServerContext>() {
            @Override
            public int compare(ServerContext c1, ServerContext c2) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `parentPath`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java

        // Canonicalize the paths for easy comparison.
        parentPath = ServerPath.canonicalize(parentPath, checkForIllegalDollar);
        possibleChild = ServerPath.canonicalize(possibleChild, checkForIllegalDollar);

```

### AssignmentToMethodParameter
Assignment to method parameter `possibleChild`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
        // Canonicalize the paths for easy comparison.
        parentPath = ServerPath.canonicalize(parentPath, checkForIllegalDollar);
        possibleChild = ServerPath.canonicalize(possibleChild, checkForIllegalDollar);

        // Ignoring case, if the parent matches all the way up to the length of
```

### AssignmentToMethodParameter
Assignment to method parameter `serverPath`
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
        // A simple conversion for $ to $/
        if (serverPath.equals(ServerPath.ROOT_NAME_ONLY)) {
            serverPath = ServerPath.ROOT;
            serverPathLength = 2;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
        URI apiBaseFromRemote = tryDetectApiUriFromGitRemotes(project, URI.create(url));
        if (apiBaseFromRemote != null) {
            url = apiBaseFromRemote.toString();
            logger.info("forgetPassword: URI override: {}", url);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `url`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
        URI apiBaseFromRemote = tryDetectApiUriFromGitRemotes(project, remoteUri);
        if (apiBaseFromRemote != null) {
            url = apiBaseFromRemote.toString();
            logger.info("getAuthData: URI override: {}", url);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfIgnoreUtil.java`
#### Snippet
```java
            }

            file = file.getParentFile();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java

    public static boolean isUnder(String parent, String child) {
        parent = parent.toLowerCase();
        return parent.equals(getCommonAncestor(parent, child.toLowerCase()));
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `localPath`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java
            return null;
        }
        localPath = localPath.replace("/", WINDOWS_PATH_SEPARATOR);
        return SystemInfo.isWindows ? localPath : FAKE_DRIVE_PREFIX + localPath;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `baseUri`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static URI resolveEndpointUri(URI baseUri, String endpointPath) {
        if (!baseUri.getPath().endsWith("/")) {
            baseUri = createUri(baseUri.toString() + "/");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `endpointPath`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

        if (endpointPath.startsWith("/")) {
            endpointPath = endpointPath.substring(1);
        }

```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/RepositoryContextManager.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        // We don't have enough context to create a BuildHttpClient
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        //We don't have enough context to create collection URL
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        // We don't have enough context to create a WorkItemTrackingHttpClient
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        // We don't have enough context to create a GitHttpClient
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        //We don't have enough context to create project URL
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java

        // We don't have enough context to create a TfvcHttpClient
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageImpl.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildStatusModel.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildStatusModel.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildStatusModel.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ValidationListenerContainer.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/VsoAuthInfoProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/HttpProxyServiceImpl.java`
#### Snippet
```java
            return HttpConfigurable.getInstance().getPlainProxyPassword();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
            forget(key);
            logger.warn("getServerContextSecrets: info was null for key: ", key);
            return null;
        }
        return info;
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/operations/BuildStatusLookupOperation.java`
#### Snippet
```java
            }

            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
            logger.warn("getPropertyStates: Unexpected exception", t);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
            logger.warn("getServerContextStates: Unexpected exception", t);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         */
        if (uri == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         */
        if (!trimmedInput.startsWith(VSTFS_PREFIX)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         */
        if (parts.length != 3) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
                || !isArtifactTypeWellFormed(artifactType)
                || !isToolSpecificIDWellFormed(toolSpecificId)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutController.java`
#### Snippet
```java
                    dialog.getComponent(validationInfo.getValidationSource()));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java

        logger.warn("No tf command was detected");
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
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
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
            if (organizationsFromRemotes.size() == 0) {
                logger.info("tryDetectApiUriFromGitRemotes: no Azure DevOps organizations detected");
                return null; // we cannot authenticate without knowing the organization
            }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
                        "tryDetectApiUriFromGitRemotes: more than one Azure DevOps organizations detected: {}",
                        organizationsFromRemotes);
                return null;
            }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
        } catch (InvocationTargetException e) {
            logger.error("Error when calling FileChooser", e);
            return null;
        } catch (InterruptedException e) {
            return null;
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
            return null;
        } catch (InterruptedException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutDialog.java`
#### Snippet
```java
    public JComponent getComponent(final String componentPropName) {
        if (StringUtils.isEmpty(componentPropName)) {
            return null;
        }
        return simpleCheckoutForm.getComponent(componentPropName);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcCommands.java`
#### Snippet
```java
            return workspaceDataAvailable
                    ? new Workspace(collectionUrl, workspaceName, null, workspaceUser, null, mappings)
                    : null;
        });
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcCommands.java`
#### Snippet
```java
                    }

                    return null;
                });
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/rest/VersionControlRecursionTypeCaseSensitive.java`
#### Snippet
```java
            return "Full";
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
    public static ChangeSet getLastHistoryEntryForAnyUser(final ServerContext context, final String localPath) {
        final List<ChangeSet> results = getHistoryCommand(context, localPath, null, 1, false, StringUtils.EMPTY);
        return results.isEmpty() ? null : results.get(0);
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
            final String result = getLocalPathCommand.runSynchronously();
            if (StringUtils.startsWithIgnoreCase(result, "ERROR [main] Application - Unexpected exception:")) {
                return null;
            }
            return result;
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
        } catch (Throwable t) {
            logger.warn("Failed to find local path for server path " + serverPath, t);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
        final ItemInfo conflictInfo = getItemInfo(context, workingFolder, originalConflict.getLocalPath());
        if (mergeResults == null || conflictInfo == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java
                    if (error instanceof ToolAuthenticationException) {
                        showVsAuthenticationErrorDialog(path);
                        return null;
                    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java

                    ourLogger.error(error);
                    return null;
                });
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageController.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutForm.java`
#### Snippet
```java
            return directoryName;
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
                } catch (Throwable t) {
                    logger.warn("getServerContext: failed to get authenticated server context", t);
                    return null;
                }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
                    logger.warn("getServerContext: Context not found");
                    //no context was found, user might have cancelled
                    return null;
                } else {
                    serverContext = authenticatedContexts.get(0);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ChangelistBuilderStatusVisitor.java`
#### Snippet
```java
                    serverPath);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageController.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            }

            return isCloaked ? null : serverPath;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetBaseVersionCommand.java`
#### Snippet
```java
        }

        return changeset >= 0 ? VersionSpec.create(changeset) : null;
    }
}
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
        } else {
            logger.error("Unhandled status type: " + Arrays.toString(pendingChange.getChangeTypes().toArray()));
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsRevisionNumber.java`
#### Snippet
```java
            final String[] sections = StringUtils.split(s, SEPARATOR);
            if (sections == null || sections.length != 3) {
                return null;
            }
            return new TfsRevisionNumber(Integer.parseInt(sections[0]), sections[1], sections[2]);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsRevisionNumber.java`
#### Snippet
```java
        } catch (NumberFormatException e) {
            logger.error("Could not parse revision number: " + s, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java

    protected String getSingleFileDeleteTitle() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java

    protected String getSingleFileDeletePromptTemplate() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchDialog.java`
#### Snippet
```java
    public JComponent getComponent(final String componentPropName) {
        if (StringUtils.isEmpty(componentPropName)) {
            return null;
        }
        return createBranchForm.getComponent(componentPropName);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestDialog.java`
#### Snippet
```java
    public JComponent getComponent(final String componentPropName) {
        if (StringUtils.isEmpty(componentPropName)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindWorkspaceCommand.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
        // if for some reason no output is given return null
        if (StringUtils.isEmpty(stdout)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
            notifyImportError(project,
                    TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT_ERROR, project.getName(), error));
            return null;
        }
        GitInit.refreshAndConfigureVcsMappings(project, rootVirtualFile, rootVirtualFile.getPath());
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestController.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            @Override
            public String getText() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            @Override
            public String getText2() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            @Override
            public ModalityState getModalityState() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            // user cancelled
            logger.warn("User canceled rename merge");
            return null;
        }
        logger.info("User chose: " + mergedServerPath);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
    @Override
    public CheckoutProvider getCheckoutProvider() {
        return null; ///TODO: new TFSCheckoutProvider();
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
    protected NodeList evaluateXPath(final String stdout, final String xpathQuery) {
        if (StringUtils.isEmpty(stdout)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
            return gitRemote.getFirstUrl();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java

        logger.info("getRepositoryContext: We couldn't determine the VCS provider, so returning null.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
            return repository;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
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
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
    public static String getProxyServer(final String serverURI) {
        if (StringUtils.isEmpty(serverURI)) {
            return null;
        }
        final String propertyName = getProxyPropertyName(serverURI);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
        final String currentProxy = PluginServiceProvider.getInstance().getPropertyService().getProperty(propertyName);
        if (StringUtils.isEmpty(currentProxy)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/ConfigureProxyAction.java`
#### Snippet
```java
    private String getProxy(final RepositoryContext context) {
        if (context == null) {
            return null;
        }
        return WorkspaceHelper.getProxyServer(context.getUrl());
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceDialog.java`
#### Snippet
```java
                        public ValidationInfo doValidate() {
                            validate();
                            return null;
                        }
                    });
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceDialog.java`
#### Snippet
```java
    public JComponent getComponent(final String componentPropName) {
        if (StringUtils.isEmpty(componentPropName) || workspaceForm == null) {
            return null;
        }
        return workspaceForm.getComponent(componentPropName);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceForm.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/forms/VsoLoginForm.java`
#### Snippet
```java
    public JComponent getServerNameComponent() {
        //Server name cannot be changed for VSO, we don't allow user to set it via the UI, so return null
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchController.java`
#### Snippet
```java
                    dialog.getComponent(validationInfo.getValidationSource()));
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTreeModel.java`
#### Snippet
```java
    public GitPullRequest getSelectedPullRequest() {
        final TreePath treeModel = selectionModel.getLeadSelectionPath();
        return treeModel == null ? null : ((PRTreeNode) treeModel.getLastPathComponent()).getGitPullRequest();
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/PropertyServiceImpl.java`
#### Snippet
```java
    public synchronized Map<String, String> getProperties() {
        if (map == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java
    public static String toTfsRepresentation(@Nullable String localPath) {
        if (localPath == null) {
            return null;
        }
        localPath = localPath.replace("/", WINDOWS_PATH_SEPARATOR);
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
            logger.warn("getAuthenticatedContext unexpected exception", t);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            // unsure what this url is
            logger.warn("getHttpsGitUrlFromSshUrl: can't determine https url from " + sshGitRemoteUrl);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            logger.debug(url, ex);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            logger.debug("getAccountFromOrganizationUri: expected path for organization account = " + uri);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static String removeUserInfo(final String url) {
        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            return httpsUrl;
        } else {
            return null;
        }
    }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `context` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/RepositoryContextManager.java`
#### Snippet
```java
    public synchronized RepositoryContext get(final String localRootFolder) {
        if (!StringUtils.isEmpty(localRootFolder)) {
            final RepositoryContext context = contextMap.get(localRootFolder);
            return context;
        }
```

### UnnecessaryLocalVariable
Local variable `tokenDescription` is redundant
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java

    public static String getTokenDescription(final String emailAddress) {
        final String tokenDescription = String.format(TOKEN_DESCRIPTION_FORMATTER,
                emailAddress, SystemHelper.getComputerName(), new Date().toString());

```

### UnnecessaryLocalVariable
Local variable `buildClient` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
        final URI collectionUri = getCollectionURI();
        if (collectionUri != null) {
            final BuildHttpClient buildClient = new BuildHttpClient(getClient(), collectionUri);
            return buildClient;
        }
```

### UnnecessaryLocalVariable
Local variable `collectionURI` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
    public URI getCollectionURI() {
        if (teamProjectCollectionReference != null) {
            final URI collectionURI = UrlHelper.getCollectionURI(serverUri, teamProjectCollectionReference.getName());
            return collectionURI;
        }
```

### UnnecessaryLocalVariable
Local variable `witClient` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
        final URI collectionUri = getCollectionURI();
        if (collectionUri != null) {
            final WorkItemTrackingHttpClient witClient = new WorkItemTrackingHttpClient(getClient(), collectionUri);
            return witClient;
        }
```

### UnnecessaryLocalVariable
Local variable `gitClient` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
        final URI collectionUri = getCollectionURI();
        if (collectionUri != null) {
            final GitHttpClientEx gitClient = new GitHttpClientEx(getClient(), collectionUri);
            return gitClient;
        }
```

### UnnecessaryLocalVariable
Local variable `teamProjectURI` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
    public URI getTeamProjectURI() {
        if (teamProjectCollectionReference != null && teamProjectReference != null) {
            final URI teamProjectURI = UrlHelper.getTeamProjectURI(serverUri, teamProjectCollectionReference.getName(), teamProjectReference.getName());
            return teamProjectURI;
        }
```

### UnnecessaryLocalVariable
Local variable `tfvcHttpClient` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContext.java`
#### Snippet
```java
        final URI collectionUri = getCollectionURI();
        if (collectionUri != null) {
            final TfvcHttpClientEx tfvcHttpClient = new TfvcHttpClientEx(getClient(), collectionUri);
            return tfvcHttpClient;
        }
```

### UnnecessaryLocalVariable
Local variable `targetBranch` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java

    public String getTargetPath() {
        final String targetBranch = (String) targetCombo.getSelectedItem();
        return targetBranch;
    }
```

### UnnecessaryLocalVariable
Local variable `serverContext` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextBuilder.java`
#### Snippet
```java

    protected ServerContext buildWithClient(Client client) {
        final ServerContext serverContext = new ServerContext(type, authenticationInfo, userId, uri, serverUri, client,
                teamProjectCollectionReference, teamProjectReference, gitRepository);

```

### UnnecessaryLocalVariable
Local variable `r` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java

    private static void updateBuildWidget(final Project project, final StatusBar statusBar, final BuildWidget widget, final BuildStatusLookupOperation.BuildStatusResults results) {
        final BuildStatusLookupOperation.BuildStatusResults r = results;
        final BuildStatusModel model = BuildStatusModel.create(project, results);
        widget.update(model);
```

### UnnecessaryLocalVariable
Local variable `authenticationInfo` is redundant
in `plugin/src/com/microsoft/alm/plugin/authentication/VsoAuthenticationProvider.java`
#### Snippet
```java
    @Override
    public AuthenticationInfo getAuthenticationInfo(final String serverUri) {
        final AuthenticationInfo authenticationInfo =
                ServerContextManager.getInstance().getBestAuthenticationInfo(serverUri, false);

```

### UnnecessaryLocalVariable
Local variable `localPath` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
                    if (d.isCreateWorkingCopies()) {
                        logger.info("Get the latest for the branched folder...");
                        final String localPath = targetLocalPath;
                        final List<VcsException> errors = new ArrayList<VcsException>();

```

### UnnecessaryLocalVariable
Local variable `stringEntity` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/soap/CatalogServiceImpl.java`
#### Snippet
```java
        stringBuilder.append("</soap:Envelope>");//$NON-NLS-1$

        final StringEntity stringEntity = new StringEntity(stringBuilder.toString(), ContentType.create("application/soap+xml", "utf-8"));//$NON-NLS-1$ //$NON-NLS-2$
        return stringEntity;
    }
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java
    @Override
    public ToolRunner.ArgumentBuilder getArgumentBuilder() {
        final ToolRunner.ArgumentBuilder builder = super.getArgumentBuilder()
                .add(workspaceName)
                .addSwitch("format", "xml");
```

### UnnecessaryLocalVariable
Local variable `workspace` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetWorkspaceCommand.java`
#### Snippet
```java

            // defaults location to LOCAL with this constructor
            final Workspace workspace = new Workspace(
                    getXPathAttributeValue(workspaceAttributes, "server"),
                    getXPathAttributeValue(workspaceAttributes, "name"),
```

### UnnecessaryLocalVariable
Local variable `localPath` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java

        if (foundMapping != null) {
            final String localPath = foundMapping.isCloaked() ? null :
                    ServerPath.makeLocal(serverPath, foundMapping.getServerPath(), foundMapping.getLocalPath(), checkForIllegalDollar);
            return localPath;
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/commands/DeleteWorkspaceCommand.java`
#### Snippet
```java
    @Override
    public ToolRunner.ArgumentBuilder getArgumentBuilder() {
        final ToolRunner.ArgumentBuilder builder = super.getArgumentBuilder()
                .addSwitch("delete")
                .add(workspaceName);
```

### UnnecessaryLocalVariable
Local variable `component` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
            setStatus(prViewForm, pullRequest);

            final Component component = prViewForm.getPanel();
            return component;
        } else if (value instanceof PRTreeNode && ((PRTreeNode) value).getGitPullRequest() == null) {
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `plugin/src/com/microsoft/alm/plugin/external/commands/TfVersionCommand.java`
#### Snippet
```java
    @Override
    public ToolRunner.ArgumentBuilder getArgumentBuilder() {
        final ToolRunner.ArgumentBuilder builder = super.getArgumentBuilder()
                .addSwitch("?");
        return builder;
```

### UnnecessaryLocalVariable
Local variable `context` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
    public static ServerContext getSavedServerContext(@NotNull final GitRepository gitRepository) {
        //get saved server context, we don't want to prompt for credentials or handle expired credentials on the UI thread
        final ServerContext context = ServerContextManager.getInstance().get(getTfGitRemoteUrl(gitRepository));
        return context;
    }
```

### UnnecessaryLocalVariable
Local variable `selectedContext` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java

    public ServerContext getSelectedContext() {
        final ServerContext selectedContext = getServerContext(getSelectedIndex());
        return selectedContext;
    }
```

### UnnecessaryLocalVariable
Local variable `selectedIndex` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
            viewSelectedIndex = selectionModel.getMaxSelectionIndex();
        }
        final int selectedIndex = getSelectionConverter().convertRowIndexToModel(viewSelectedIndex);
        return selectedIndex;
    }
```

### UnnecessaryLocalVariable
Local variable `context` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    public synchronized ServerContext get(final String uri) {
        if (!StringUtils.isEmpty(uri)) {
            final ServerContext context = contextMap.get(ServerContext.getKey(uri));
            return context;
        }
```

### UnnecessaryLocalVariable
Local variable `context` is redundant
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java

    public synchronized ServerContext getLastUsedContext() {
        final ServerContext context = get(getLastUsedContextKey());
        return context;
    }
```

### UnnecessaryLocalVariable
Local variable `accountName` is redundant
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static String getVSOAccountName(final URI vsoUri) {
        final String[] hostParts = vsoUri.getHost().split("\\.");
        final String accountName = hostParts.length > 0 ? hostParts[0] : "";
        return accountName;
    }
```

## RuleId[ruleID=PointlessBooleanExpression]
### PointlessBooleanExpression
`((CredInputsImpl) inputs).getPromptForCreds() == true` can be simplified to '((CredInputsImpl) inputs).getPromptForCreds()'
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
        final ServerContext context;

        if (((CredInputsImpl) inputs).getPromptForCreds() == true) {
            final List<ServerContext> authenticatedContexts = new ArrayList<ServerContext>();
            final List<Future> authTasks = new ArrayList<Future>();
```

### PointlessBooleanExpression
`ServerPath.isSeparator(serverPath.charAt(position)) == false` can be simplified to '!ServerPath.isSeparator(serverPath.charAt(position))'
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java

        // the path must begin with one of: /, $/, \, $\
        if (position >= serverPathLength || ServerPath.isSeparator(serverPath.charAt(position)) == false) {
            logger.warn("The server path is not absolute: " + serverPath);
            throw new ServerPathFormatException(serverPath);
```

### PointlessBooleanExpression
`ServerPath.isValidPathCharacter(serverPath.charAt(position)) == true` can be simplified to 'ServerPath.isValidPathCharacter(serverPath.charAt(position))'
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
            }
            // a non-directory separator, non-dot, but valid in NTFS filenames
            else if (ServerPath.isValidPathCharacter(serverPath.charAt(position)) == true) {
                currentComponent.append(serverPath.charAt(position));
            }
```

### PointlessBooleanExpression
`wf.isCloaked() == false` can be simplified to '!wf.isCloaked()'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
            final int mappingServerPathLength = mappingServerItem.length();
            for (final Workspace.Mapping wf : mappings) {
                if (wf == null || wf.isCloaked() == false) {
                    continue;
                }
```

## RuleId[ruleID=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
        // Add in the lines from stdout
        for (final String line : getLines(stdout)) {
            lines.add(line);
        }

```

## RuleId[ruleID=UnusedSymbol]
### UnusedSymbol
Function "pipeTo" is never used
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    }

    private fun <T> IRdTask<T>.pipeTo(lt: Lifetime, future: CompletableFuture<T>) {
        result.adviseOnce(lt) {
            try {
```

### UnusedSymbol
Function "pipeToVoid" is never used
in `client/connector/src/main/kotlin/com/microsoft/tfs/connector/ReactiveClientConnection.kt`
#### Snippet
```java
    }

    private fun <T> IRdTask<T>.pipeToVoid(lt: Lifetime, future: CompletableFuture<Void>) {
        result.adviseOnce(lt) {
            try {
```

### UnusedSymbol
Function "isPathMapped" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
```

### UnusedSymbol
Function "withNewPendingChangeListener" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
}

fun VersionControlEventEngine.withNewPendingChangeListener(
    listener: NewPendingChangeListener,
    action: () -> Unit) {
```

### UnusedSymbol
Function "withNonFatalErrorListener" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java


fun VersionControlEventEngine.withNonFatalErrorListener(
    listener: NonFatalErrorListener,
    action: () -> Unit) {
```

### UnusedSymbol
Function "withUndonePendingChangeListener" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/VersionControlEventEngineEx.kt`
#### Snippet
```java
import com.microsoft.tfs.core.clients.versioncontrol.events.VersionControlEventEngine

fun VersionControlEventEngine.withUndonePendingChangeListener(
    listener: UndonePendingChangeListener,
    action: () -> Unit) {
```

### UnusedSymbol
Property "itemTypeName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else pendingChange.toUIString(false, this)

private val ExtendedItem.itemTypeName
    get() = itemType.toUIString()

```

### UnusedSymbol
Property "lockStatus" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = if (itemType == ItemType.FILE) encodingName else null

private val ExtendedItem.lockStatus
    get() = lockLevel.toUIString()

```

### UnusedSymbol
Property "encodingName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = checkinDate?.time?.let(isoDateFormat::format)

private val ExtendedItem.encodingName
    get() =
        if (encoding == FileEncoding(VersionControlConstants.ENCODING_UNCHANGED)) null
```

### UnusedSymbol
Property "checkinDateString" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = itemType.toUIString()

private val ExtendedItem.checkinDateString
    get() = checkinDate?.time?.let(isoDateFormat::format)

```

### UnusedSymbol
Function "toCanonicalPathString" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
            + pendingSet.candidatePendingChanges.orEmpty().map { toPendingChange(pendingSet, it) }).asIterable()

fun TfsPath.toCanonicalPathString(): String = when (this) {
    is TfsLocalPath -> LocalPath.canonicalize(path)
    is TfsServerPath -> path
```

### UnusedSymbol
Function "toLocalItemInfo" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = lockLevel.toUIString()

fun ExtendedItem.toLocalItemInfo(): TfsLocalItemInfo =
    TfsLocalItemInfo(
        targetServerItem,
```

### UnusedSymbol
Function "toCanonicalPathItemSpec" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

```

### UnusedSymbol
Function "toExtendedItemInfo" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    )

fun ExtendedItem.toExtendedItemInfo(): TfsExtendedItemInfo =
    TfsExtendedItemInfo(
        lockStatus,
```

### UnusedSymbol
Property "changeTypeName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    ItemSpec(toCanonicalPathString(), recursionType)

private val ExtendedItem.changeTypeName
    get() =
        if (pendingChange == ChangeType.NONE) "none"
```

### UnusedSymbol
Property "fileEncodingName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else encoding?.name

private val ExtendedItem.fileEncodingName
    get() = if (itemType == ItemType.FILE) encodingName else null

```

### UnusedSymbol
Function "tryGetWorkspace" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
Overridden method 'getPresentation(com.intellij.openapi.wm.StatusBarWidget.@org.jetbrains.annotations.NotNull PlatformType)' is scheduled for removal in version 2020.2
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull final PlatformType type) {
        // This class implements the WidgetPresentation needed here
        return this;
```

### UnstableApiUsage
'com.intellij.openapi.wm.StatusBarWidget.PlatformType' is scheduled for removal in version 2020.2
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull final PlatformType type) {
        // This class implements the WidgetPresentation needed here
        return this;
```

### UnstableApiUsage
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/FeedbackAction.java`
#### Snippet
```java

        if (dialog.showAndGet()) {
            VcsNotifier.getInstance(project).notifySuccess(
                    TfPluginBundle.message(TfPluginBundle.KEY_FEEDBACK_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_FEEDBACK_NOTIFICATION));
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
                }
            };
            VcsUtil.runVcsProcessWithProgress(resolveRunnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_LOADING_PROGRESS_BAR), false, project);
        } catch (VcsException e) {
            logger.error("Error while loading conflicts: " + e.getMessage());
```

### UnstableApiUsage
'getButton()' is scheduled for removal in version 2022.2
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        mySourceIsDirectory = initialSourcePathIsDirectory;

        sourceText.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                final ServerBrowserDialog dialog =
```

### UnstableApiUsage
'removeWidget(java.lang.@org.jetbrains.annotations.NonNls @org.jetbrains.annotations.NotNull String)' is marked unstable with @ApiStatus.Internal
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
            // Remove build widget
            if (statusBar.getWidget(BuildWidget.getID()) != null) {
                statusBar.removeWidget(BuildWidget.getID());
            }
        }
```

### UnstableApiUsage
'addWidget(com.intellij.openapi.wm.@org.jetbrains.annotations.NotNull StatusBarWidget, com.intellij.openapi.@org.jetbrains.annotations.NotNull Disposable)' is marked unstable with @ApiStatus.Internal
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
        if (buildWidget == null) {
            buildWidget = new BuildWidget();
            statusBar.addWidget(buildWidget, project);
        }
        // Attempt to get the current repository context (if none, then the status stays as it was)
```

### UnstableApiUsage
'ApplicationStarterEx()' is declared in class 'com.intellij.openapi.application.ApplicationStarterEx' scheduled for removal in version 2021.2
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
 * the needed arguments to start a VSTS specific workflow.
 */
public abstract class ApplicationStarterBase extends ApplicationStarterEx {
    private final Logger logger = LoggerFactory.getLogger(ApplicationStarterBase.class);
    public static final String VSTS_COMMAND = "vsts";
```

### UnstableApiUsage
'com.intellij.openapi.application.ApplicationStarterEx' is scheduled for removal in version 2021.2
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
 * the needed arguments to start a VSTS specific workflow.
 */
public abstract class ApplicationStarterBase extends ApplicationStarterEx {
    private final Logger logger = LoggerFactory.getLogger(ApplicationStarterBase.class);
    public static final String VSTS_COMMAND = "vsts";
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MergeBranchAction.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                @Override
                public void run() throws VcsException {
```

### UnstableApiUsage
'getCommitMessage()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/SelectWorkItemsAction.java`
#### Snippet
```java
            // Attempt to append the message instead of overwriting it
            if (commitMessageI instanceof CommitChangeListDialog) {
                commitMessage = ((CommitChangeListDialog) commitMessageI).getCommitMessage();
            }

```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/actions/ImportAction.java`
#### Snippet
```java
            //unexpected error
            logger.warn("ImportAction doActionPerformed failed unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_ACTIONS_IMPORT),
                    TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### UnstableApiUsage
Overridden method 'isAlwaysShowPlus(com.intellij.ide.util.treeView.NodeDescriptor)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java

    @Override
    protected boolean isAlwaysShowPlus(final NodeDescriptor descriptor) {
        if (descriptor instanceof TfsTreeNode) {
            return ((TfsTreeNode) descriptor).isDirectory();
```

### UnstableApiUsage
'com.intellij.ide.util.treeView.AbstractTreeBuilder' is scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java
import java.util.Comparator;

public class TfsTreeBuilder extends AbstractTreeBuilder {
    private static final Logger LOG = Logger.getInstance(TfsTreeBuilder.class.getName());

```

### UnstableApiUsage
Overridden method 'isAutoExpandNode(com.intellij.ide.util.treeView.NodeDescriptor)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java

    @Override
    protected boolean isAutoExpandNode(final NodeDescriptor nodeDescriptor) {
        if (nodeDescriptor instanceof TfsErrorTreeNode) {
            return true;
```

### UnstableApiUsage
Overridden method 'runBackgroundLoading(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java

    @Override
    protected void runBackgroundLoading(@NotNull final Runnable runnable) {
        if (isDisposed()) return;
        runnable.run();
```

### UnstableApiUsage
'isDisposed()' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java
    @Override
    protected void runBackgroundLoading(@NotNull final Runnable runnable) {
        if (isDisposed()) return;
        runnable.run();
    }
```

### UnstableApiUsage
'AbstractTreeBuilder(javax.swing.@org.jetbrains.annotations.NotNull JTree, javax.swing.tree.@org.jetbrains.annotations.NotNull DefaultTreeModel, com.intellij.ide.util.treeView.AbstractTreeStructure, java.util.@org.jetbrains.annotations.Nullable Comparator\>)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java

    public TfsTreeBuilder(final JTree tree, final DefaultTreeModel treeModel, final AbstractTreeStructure treeStructure) {
        super(tree, treeModel, treeStructure, COMPARATOR);
    }

```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
            //unexpected error occurred while doing simple checkout
            logger.warn("Azure DevOps commandline checkout failed due to an unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### UnstableApiUsage
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
        final Ref<VirtualFile> selectedFile = Ref.create();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                @Override
                public void run() {
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                // Notify the user of success and provide a link to sync the workspace
                // (It doesn't make sense to tell the user we are done here if there is another thread still doing work)
                VcsNotifier.getInstance(project).notifyImportantInfo(
                        TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_TITLE),
                        TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_MESSAGE),
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        } catch (final Throwable t) {
            //TODO on failure we could provide a link that reopened the dialog with the values they tried to save
            VcsNotifier.getInstance(project).notifyError(
                    TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_FAILURE_TITLE),
                    LocalizationServiceImpl.getInstance().getExceptionMessage(t));
```

### UnstableApiUsage
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java

                    // Notify the user of a successful sync
                    VcsNotifier.getInstance(project).notifySuccess(
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_TITLE),
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_SYNC_MESSAGE));
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_SYNC_MESSAGE));
                } catch (final Throwable t) {
                    VcsNotifier.getInstance(project).notifyError(
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_FAILURE_TITLE),
                            LocalizationServiceImpl.getInstance().getExceptionMessage(t));
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java

    private JComponent createCommitsListPane(final Project project, final GitRepository gitRepository,
                                             final GitCommitCompareInfo compareInfo) {
        return new GitCommitListWithDiffPanel(project, compareInfo.getBranchToHeadCommits(gitRepository));
    }
```

### UnstableApiUsage
'getBranchToHeadCommits(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    private JComponent createCommitsListPane(final Project project, final GitRepository gitRepository,
                                             final GitCommitCompareInfo compareInfo) {
        return new GitCommitListWithDiffPanel(project, compareInfo.getBranchToHeadCommits(gitRepository));
    }

```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    }

    private JComponent createDiffPaneBrowser(final Project project, final GitCommitCompareInfo compareInfo) {
        List<Change> diff = compareInfo.getTotalDiff();
        final SimpleChangesBrowser changesBrowser = new  SimpleChangesBrowser(project,diff);
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
                                              @NotNull final String sourceBranchBeingCompared,
                                              @NotNull final String targetBranchBeingCompared,
                                              @NotNull final GitCommitCompareInfo myCompareInfo) {
        final GitRemoteBranch gitRemoteBranch = this.getSelectedRemoteBranch();
        final String currBranch = this.sourceBranch.getText();
```

### UnstableApiUsage
'git4idea.config.GitExecutableValidator' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     */
    public static boolean isGitExeConfigured(@NotNull final Project project) {
        final GitExecutableValidator validator = GitVcs.getInstance(project).getExecutableValidator();
        if (!validator.checkExecutableAndNotifyIfNeeded()) {
            //Git.exe is not configured, show warning message in addition to notification from Git plugin
```

### UnstableApiUsage
'getExecutableValidator()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     */
    public static boolean isGitExeConfigured(@NotNull final Project project) {
        final GitExecutableValidator validator = GitVcs.getInstance(project).getExecutableValidator();
        if (!validator.checkExecutableAndNotifyIfNeeded()) {
            //Git.exe is not configured, show warning message in addition to notification from Git plugin
```

### UnstableApiUsage
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java

            if (success) {
                vcsNotifier.notifySuccess(
                        TfPluginBundle.message(
                                TfPluginBundle.KEY_TFVC_REPOSITORY_IMPORT_SUCCESS,
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java
        } catch (Throwable error) {
            ourLogger.error(error);
            vcsNotifier.notifyError(
                    TfPluginBundle.message(
                            TfPluginBundle.KEY_TFVC_REPOSITORY_IMPORT_ERROR,
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getBranchCompareInfo(final Project project, final GitRepository gitRepository,
                                                     final String source, final String target)
            throws VcsException {
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     * @return compare info which contains empty commits and diff lists
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'GitCommitCompareInfo(git4idea.util.GitCommitCompareInfo.@org.jetbrains.annotations.NotNull InfoType)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo.InfoType' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'BRANCH_TO_HEAD' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### UnstableApiUsage
'put(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository, com.intellij.openapi.util.@org.jetbrains.annotations.NotNull Pair,java.util.List\>)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
        emptyCompareInfo.put(gitRepository, Collections.<Change>emptyList());
```

### UnstableApiUsage
'put(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository, java.util.@org.jetbrains.annotations.NotNull Collection)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
        emptyCompareInfo.put(gitRepository, Collections.<Change>emptyList());

        return emptyCompareInfo;
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    }

    private GitCommitCompareInfo getCompareInfo(final Project project, final GitRepository gitRepository,
                                                final String source, final String target)
            throws VcsException {
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'GitCommitCompareInfo(git4idea.util.GitCommitCompareInfo.@org.jetbrains.annotations.NotNull InfoType)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo.InfoType' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'BRANCH_TO_HEAD' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### UnstableApiUsage
'put(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository, java.util.@org.jetbrains.annotations.NotNull Collection)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
        info.put(gitRepository, new Pair<List<GitCommit>, List<GitCommit>>(commits1, commits2));

```

### UnstableApiUsage
'put(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository, com.intellij.openapi.util.@org.jetbrains.annotations.NotNull Pair,java.util.List\>)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        info.put(gitRepository, diff);
        info.put(gitRepository, new Pair<List<GitCommit>, List<GitCommit>>(commits1, commits2));

        return info;
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    deleteWorkspace(selectedWorkspace);
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    reloadWorkspaces(selectedServer);
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    editWorkspace(selectedWorkspace, update);
```

### UnstableApiUsage
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    try {
```

### UnstableApiUsage
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    public static void refreshAndFindFile(final FilePath path) {
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### UnstableApiUsage
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### UnstableApiUsage
'VcsVFSListener(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, com.intellij.openapi.vcs.@org.jetbrains.annotations.NotNull AbstractVcs)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java

    public TFSFileListener(Project project, TFSVcs vcs) {
        super(project, vcs);
    }

```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        this.diffCache = CacheBuilder.newBuilder().maximumSize(20)
                .build(
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

        try {
            GitCommitCompareInfo changes
                    = this.diffCache.get(new Pair<String, String>(currBranchHash, remoteBranchHash));

```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
                                // if we missed the cache, then show the loading spinner, otherwise
                                // just switch to the diff we have to avoid flickering the screen
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    private void notifyError(final Project project, final String title, final String message) {
        if (message != null) {
            VcsNotifier.getInstance(project).notifyError(title, message);
        } else {
            VcsNotifier.getInstance(project).notifyError(title, "");
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
            VcsNotifier.getInstance(project).notifyError(title, message);
        } else {
            VcsNotifier.getInstance(project).notifyError(title, "");
        }
    }
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    private void notifySuccess(final Project project, final String title, final String message) {
        VcsNotifier.getInstance(project).notifyImportantInfo(title, message, new NotificationListener() {
            @Override
            public void hyperlinkUpdate(@NotNull final Notification n, @NotNull final HyperlinkEvent e) {
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                setLoading(false);

                                final GitCommitCompareInfo compareInfo = changesContainer.getGitCommitCompareInfo();
                                if (compareInfo != null) {
                                    List<GitCommit> commits
```

### UnstableApiUsage
'getBranchToHeadCommits(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository)' is declared in class 'git4idea.util.GitCommitCompareInfo' scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                if (compareInfo != null) {
                                    List<GitCommit> commits
                                            = compareInfo.getBranchToHeadCommits(changesContainer.getGitRepository());

                                    final GitLocalBranch sourceBranch = getSourceBranch();
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    private GitChangesContainer localBranchChanges;

    private final LoadingCache<Pair<String, String>, GitCommitCompareInfo> diffCache;

    /* Executor service for running diff calculating Futures */
```

### UnstableApiUsage
'getGitDir()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                        //user chose to cancel import
                        logger.warn("setupRemoteOnLocalRepo: User chose to cancel import for project: {}, local repo: {}",
                                project.getName(), localRepository.getGitDir().getUrl());
                        notifyImportError(project, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_CANCELED));
                        return false;
```

### UnstableApiUsage
'getExitCode()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

        GitHandlerUtil.runInCurrentThread(hRemote, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_REMOTE));
        if (hRemote.getExitCode() != 0) {
            logger.error("setupRemoteOnLocalRepo: git remote failed for project: {}, local repo: {}, error: {}, output: {}",
                    project.getName(), localRepository.getRoot().getUrl(), hRemote.getStderr(), hRemote.getStdout());
```

### UnstableApiUsage
'errors()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        final GitLineHandler hInit = new GitLineHandler(project, rootVirtualFile, GitCommand.INIT);
        GitHandlerUtil.runInCurrentThread(hInit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        if (!hInit.errors().isEmpty()) {
            //git init failed
            final String error = hInit.errors().get(0).getMessage();
```

### UnstableApiUsage
'errors()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        if (!hInit.errors().isEmpty()) {
            //git init failed
            final String error = hInit.errors().get(0).getMessage();
            logger.error("setupGitRepositoryForProject: git init failed on project: {} at root: {} with error: {}",
                    project.getName(), rootVirtualFile.getUrl(), error);
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    if (StringUtils.isNotEmpty(remoteUrlForDisplay)) {
                        // Notify the user that we are done and provide a link to the repo
                        VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_SUCCEEDED),
                                TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_SUCCEEDED_MESSAGE, project.getName(), remoteUrlForDisplay, repositoryName),
                                NotificationListener.URL_OPENING_LISTENER);
```

### UnstableApiUsage
'retrieveUntrackedFiles()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                final ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager.getInstance(project);
                final List<VirtualFile> trackedFiles = changeListManager.getAffectedFiles();
                final Collection<VirtualFile> untrackedFiles = ContainerUtil.filter(localRepository.getUntrackedFilesHolder().retrieveUntrackedFiles(),
                        new Condition<VirtualFile>() {
                            @Override
```

### UnstableApiUsage
'getExitCode()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    if (hCommit.getExitCode() != 0) {
                        //unable to commit
                        logger.error("doFirstCommitIfRequired: git commit failed for project: {}, repoRoot: {} with error: {}",
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

    private void notifyImportError(final Project project, final String message) {
        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_FAILED), message, NotificationListener.URL_OPENING_LISTENER);
    }

```

### UnstableApiUsage
'fetch(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                    logger.info("Fetching latest from server so that the new branch is available to checkout");
                    final GitFetcher fetcher = new GitFetcher(project, getProgressIndicator(progressIndicator), true);
                    final GitFetchResult fetchResult = fetcher.fetch(gitRepository);
                    if (fetchResult.isSuccess() && this.checkoutBranch) {
                        logger.info("Checking out new branch: " + branchName);
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                final String branchLink = String.format(UrlHelper.SHORT_HTTP_LINK_FORMATTER, UrlHelper.getBranchURI(context.getUri(), getBranchName()), getBranchName());
                if (!ApplicationManager.getApplication().isUnitTestMode()) {
                    VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_SUCCESSFUL_TITLE),
                            TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_SUCCESSFUL_DESCRIPTION, branchLink), new NotificationListener() {
                                @Override
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                logger.warn("Create branch failed: {}", errorMessage);
                if (!ApplicationManager.getApplication().isUnitTestMode()) {
                    VcsNotifier.getInstance(project).notifyError(
                            TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_FAILED_TITLE),
                            TfPluginBundle.message(
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java

                    if (context == null) {
                        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(
                                        TfPluginBundle.KEY_CREATE_BRANCH_ERRORS_AUTHENTICATION_FAILED_TITLE),
                                TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitRemoteUrl));
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            }
        };
        VcsUtil.runVcsProcessWithProgress(runnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_MERGE_LOADING), false, project);
        return contentTriplet;
    }
```

### UnstableApiUsage
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            }
        };
        VcsUtil.runVcsProcessWithProgress(resolveRunnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_RESOLVING_PROGRESS_BAR), false, project);

        // The following code is in this method instead of resolveConflict so that it will be called from tests
```

### UnstableApiUsage
'notifyImportantWarning(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
                            logger.info("Notifying the user of the min version problem.");
                            // Notify the user that they should upgrade their version of the TF command line
                            VcsNotifier.getInstance(getProject()).notifyImportantWarning(
                                    TfPluginBundle.message(TfPluginBundle.KEY_TFVC_TF_VERSION_WARNING_TITLE),
                                    error, new NotificationListener.Adapter() {
```

### UnstableApiUsage
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
    private void notifyOperationStatus(final boolean success, final String message) {
        if (success) {
            VcsNotifier.getInstance(project).notifySuccess(
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        } else {
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        } else {
            VcsNotifier.getInstance(project).notifyError(
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        }
```

### UnstableApiUsage
'YES_BUTTON' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_ABANDON_CONFIRMATION, prId),
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE),
                                        Icons.VSLogo, Messages.YES_BUTTON, Messages.NO_BUTTON);
                            }
                        }, true, indicator.getModalityState());
```

### UnstableApiUsage
'NO_BUTTON' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_ABANDON_CONFIRMATION, prId),
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE),
                                        Icons.VSLogo, Messages.YES_BUTTON, Messages.NO_BUTTON);
                            }
                        }, true, indicator.getModalityState());
```

### UnstableApiUsage
'processEvents(java.util.@org.jetbrains.annotations.NotNull List)' is marked unstable with @ApiStatus.Internal
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/operations/RenameFileDirectory.java`
#### Snippet
```java
                // this alerts that a rename has taken place so any additional processing can take place
                final VFileEvent event = new VFilePropertyChangeEvent(element.getManager(), virtualFile, VirtualFile.PROP_NAME, currentPath, newName, false);
                PersistentFS.getInstance().processEvents(Collections.singletonList(event));
            }
        } catch (Throwable t) {
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                    if (context == null) {
                        logger.warn("No context could be found");
                        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_AUTHENTICATION_FAILED_TITLE), TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitUrl));
                        return;
                    }
```

### UnstableApiUsage
'select(java.lang.Object)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
        final TfsTreeNode selection = root.createForSelection(initialSelection);
        if (selection != null) {
            treeBuider.select(selection);
        }
    }
```

### UnstableApiUsage
'getSelectedElements()' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java

    public void createVirtualFolder(final String folderName) {
        final Set<Object> selection = treeBuider.getSelectedElements();
        if (selection.isEmpty()) {
            return;
```

### UnstableApiUsage
'queueUpdateFrom(java.lang.Object, boolean)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
        final TfsTreeNode treeNode = (TfsTreeNode) o;
        final TfsTreeNode child = treeNode.createVirtualSubfolder(folderName);
        treeBuider.queueUpdateFrom(treeNode, true).doWhenDone(new Runnable() {
            @Override
            public void run() {
```

### UnstableApiUsage
'installPopupHandler(javax.swing.@org.jetbrains.annotations.NotNull JComponent, java.lang.@org.jetbrains.annotations.NotNull String, java.lang.@org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2022.1
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
            }
        });
        PopupHandler.installPopupHandler(tree, POPUP_ACTION_GROUP, ActionPlaces.REMOTE_HOST_DIALOG_POPUP);
        setMessage(null, false);
    }
```

### UnstableApiUsage
'getSelectedElements()' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
    @Nullable
    private SelectedItem doGetSelectedItem() {
        final Set<Object> selection = treeBuider.getSelectedElements();
        if (selection.isEmpty()) {
            return null;
```

### UnstableApiUsage
'select(java.lang.Object)' is declared in class 'com.intellij.ide.util.treeView.AbstractTreeBuilder' scheduled for removal in version 2020.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
            @Override
            public void run() {
                treeBuider.select(child);
            }
        });
```

### UnstableApiUsage
'getTreeTextForeground()' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java
                : UIUtil.getTreeBackground());

        titleLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : UIUtil.getTreeTextForeground());
        summaryLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : SimpleTextAttributes.GRAY_ATTRIBUTES.getFgColor());
    }
```

### UnstableApiUsage
'is32Bit' is scheduled for removal in version 2022.1
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcClient.java`
#### Snippet
```java
    public static Path detectClientPath() {
        if (!SystemInfo.isWindows) return null;
        String programFilesPath = SystemInfo.is32Bit ? System.getenv("ProgramFiles") : System.getenv("ProgramFiles(x86)");
        if (StringUtils.isEmpty(programFilesPath))
            programFilesPath = "C:\\Program Files (x86)";
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/GitCheckoutProvider.java`
#### Snippet
```java
            //unexpected error
            logger.warn("doCheckout failed unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
                    TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_LINK_TEXT, changesetNumber));
            if (!ApplicationManager.getApplication().isUnitTestMode()) {
                VcsNotifier.getInstance(myVcs.getProject()).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_SUCCESSFUL_TITLE),
                        TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_SUCCESSFUL_MSG, changesetLink), (notification, hyperlinkEvent) -> BrowserUtil.browse(hyperlinkEvent.getURL()));
            }
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    private String sourceBranchHash;
    private String targetBranchHash;
    private GitCommitCompareInfo gitCommitCompareInfo;
    private GitRepository gitRepository;

```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    public static GitChangesContainer createChangesContainer(final String sourceBranchName, final String targetBranchName,
                                                             final String sourceBranchHash, final String targetBranchHash,
                                                             final GitCommitCompareInfo gitCommitCompareInfo,
                                                             final GitRepository gitRepository) {
        final GitChangesContainer container = new GitChangesContainer();
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getGitCommitCompareInfo() {
        return gitCommitCompareInfo;
    }
```

### UnstableApiUsage
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public void setGitCommitCompareInfo(final GitCommitCompareInfo gitCommitCompareInfo) {
        this.gitCommitCompareInfo = gitCommitCompareInfo;
    }
```

### UnstableApiUsage
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/extensions/TfvcCheckoutProvider.java`
#### Snippet
```java
        } catch (Throwable t) {
            logger.warn("doCheckout failed unexpectedly", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### UnstableApiUsage
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
                                    UrlHelper.getSpecificWorkItemURI(context.getTeamProjectURI(), workItem.getId()), String.valueOf(workItem.getId()), UrlHelper.getBranchURI(context.getUri(), branchName), branchName);

                            VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(wasWorkItemAssociated ? TfPluginBundle.KEY_WIT_ASSOCIATION_SUCCESSFUL_TITLE : TfPluginBundle.KEY_WIT_ASSOCIATION_FAILED_TITLE),
                                    notificationMsg, new NotificationListener() {
                                        @Override
```

### UnstableApiUsage
'NotificationGroup(java.lang.String, com.intellij.notification.NotificationDisplayType, boolean)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFVCNotifications.java`
#### Snippet
```java

public class TFVCNotifications {
    private static final NotificationGroup TFS_NOTIFICATIONS = new NotificationGroup(
            TfPluginBundle.message(TfPluginBundle.KEY_TFVC_NOTIFICATIONS),
            NotificationDisplayType.BALLOON,
```

