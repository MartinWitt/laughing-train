# azure-devops-intellij 
 
# Bad smells
I found 1221 bad smells with 61 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 398 | false |
| Deprecation | 207 | false |
| UnstableApiUsage | 105 | false |
| NullableProblems | 88 | false |
| FieldMayBeFinal | 39 | false |
| DataFlowIssue | 32 | false |
| CommentedOutCode | 27 | false |
| UnnecessaryLocalVariable | 26 | true |
| ConstantValue | 25 | false |
| TrivialIf | 25 | false |
| UNCHECKED_WARNING | 24 | false |
| UnusedSymbol | 17 | false |
| DuplicatedCode | 16 | false |
| RedundantTypeArguments | 14 | false |
| FieldCanBeLocal | 14 | false |
| UnusedReceiverParameter | 13 | false |
| EmptyStatementBody | 12 | false |
| InnerClassMayBeStatic | 12 | true |
| JavadocLinkAsPlainText | 10 | false |
| RedundantMethodOverride | 10 | false |
| UnnecessaryToStringCall | 10 | true |
| FinalStaticMethod | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| SimplifiableConditionalExpression | 6 | false |
| UnusedAssignment | 6 | false |
| KotlinConstantConditions | 6 | false |
| IgnoreResultOfCall | 5 | false |
| CharsetObjectCanBeUsed | 5 | false |
| ArraysAsListWithZeroOrOneArgument | 5 | false |
| OverrideOnly | 4 | false |
| NotNullFieldNotInitialized | 4 | false |
| StringConcatenationInsideStringBufferAppend | 4 | false |
| PointlessBooleanExpression | 4 | true |
| RegExpSimplifiable | 3 | false |
| SuspiciousNameCombination | 3 | false |
| MagicConstant | 2 | false |
| RedundantArrayCreation | 2 | true |
| UnnecessarySemicolon | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryModifier | 1 | true |
| PointlessArithmeticExpression | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| FinalPrivateMethod | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| MemberVisibilityCanBePrivate | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| StringConcatenationInLoops | 1 | false |
| RedundantLengthCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| PlaceholderCountMatchesArgumentCount | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| AutoCloseableResource | 1 | false |
| RedundantNullableReturnType | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=PointlessArithmeticExpression]
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

## RuleId[id=MagicConstant]
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

## RuleId[id=OverrideOnly]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/checkout/TfvcCheckoutModel.java`
#### Snippet
```java
                // Ensure that the local folder exists
                final File file = new File(localPath);
                if (!file.mkdirs()) {
                    //TODO should we throw here?
                }
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
            // get context from builder, create PersonalAccessToken if needed, and store in active context
            final ServerContext context = createContextFromGitRemoteUrl(gitRemoteUrl);
            if (context != null && setAsActiveContext) {
                //nothing to do
                //context is already added to the manager if it is valid
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageController.java`
#### Snippet
```java
            model.signOut();
            super.requestFocus(page);
        } else if (CheckoutForm.CMD_REPO_FILTER_CHANGED.equals(e.getActionCommand())) {
            // No action needed here. We updated the model above which should filter the list automatically.
        } else if (LoginForm.CMD_CREATE_ACCOUNT.equals(e.getActionCommand())) {
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsController.java`
#### Snippet
```java
            // Reload the table (the refresh button shouldn't be visible if the query is currently running)
            model.loadWorkItems();
        } else if (SelectWorkItemsForm.CMD_FILTER_CHANGED.equals(e.getActionCommand())) {
            // No action needed here. We updated the model above which should filter the list automatically.
        } else if (SelectWorkItemsForm.CMD_NEW_WORK_ITEM.equals(e.getActionCommand())) {
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
            if (position == serverPathLength || ServerPath.isSeparator(serverPath.charAt(position))) {
                // squash multiple concurrent separators
                if (currentComponent.length() == 0) {
                    // Ignore
                }
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
                }
                // single dot components are thrown away
                else if (currentComponent.toString().equals(".")) {
                    // Ignore
                }
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
                     * contain nothing but spaces and dots.
                     */
                    if (cleaned.length() == 0) {
                        // Ignore
                    } else if (cleaned.length() > MAXIMUM_COMPONENT_LENGTH) {
```

### EmptyStatementBody
`else` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/StatusBarManager.java`
#### Snippet
```java
            op.doWorkAsync(null);

        } else {
            // The repository hasn't been opened yet, we should get an event when it is opened
        }
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
                maxItemsReached = wiResults.maxItemsReached();

                if (wiResults.isCancelled()) {
                    // Do nothing
                } else {
```

### EmptyStatementBody
`else` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsModel.java`
#### Snippet
```java
                                        //retry loading workitems with new context and authentication info
                                        loadWorkItems();
                                    } else {
                                        //user cancelled login, don't retry
                                    }
```

### EmptyStatementBody
`if` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageController.java`
#### Snippet
```java
            pageModel.signOut();
            super.requestFocus(page);
        } else if (ImportForm.CMD_PROJECT_FILTER_CHANGED.equals(e.getActionCommand())) {
            // No action needed here. We updated the pageModel above which should filter the list automatically.
        } else if (ImportForm.CMD_GOTO_TFS.equals(e.getActionCommand())) {
```

### EmptyStatementBody
`else` statement has empty body
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                    //retry creating the pull request with new context and authentication info
                    doCreatePullRequest(project, newContext, title, description, branchNameOnRemoteServer, targetBranch);
                } else {
                    //user cancelled login, don't retry
                }
```

## RuleId[id=CommentedOutCode]
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
        form.reset();
        // TODO: move this all to the component reset() method once needed
//    myComponent.setUserProxy(TFSConfigurationManager.getInstance().useIdeaHttpProxy());
//    TfsCheckinPoliciesCompatibility c = TFSConfigurationManager.getInstance().getCheckinPoliciesCompatibility();
//    myComponent.setSupportTfsCheckinPolicies(c.teamExplorer);
```

## RuleId[id=RedundantArrayCreation]
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

## RuleId[id=NotNullFieldNotInitialized]
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
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ContentTriplet.java`
#### Snippet
```java
    @NotNull
    public String serverContent;
    @NotNull
    public String localContent;
}
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=FinalPrivateMethod]
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

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `value` in enum 'VersionControlRecursionTypeCaseSensitive'
in `plugin/src/com/microsoft/alm/plugin/context/rest/VersionControlRecursionTypeCaseSensitive.java`
#### Snippet
```java
    FULL(120),;

    private int value;

    private VersionControlRecursionTypeCaseSensitive(final int value) {
```

## RuleId[id=RegExpSimplifiable]
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

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabController.java`
#### Snippet
```java
    JComponent getPanel();

    void update(final Observable observable, final Object arg);

    void dispose();
```

### Deprecation
'com.intellij.util.containers.HashMap' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesDialog.java`
#### Snippet
```java

    private static Map<String, Object> createProperties(final ContentProvider<Object> contentProvider) {
        final Map<String, Object> properties = new HashMap<String, Object>(1);
        properties.put(PROP_CONTEXT_PROVIDER, contentProvider);
        return properties;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java

    @Override
    public void update(final Observable observable, final Object arg) {
        if (arg == null || TabModel.PROP_TAB_STATUS.equals(arg)) {
            tab.setStatus(model.getTabStatus());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java
 * Generic controller for the VC tab
 */
public abstract class TabControllerImpl<T extends TabModel> implements TabController, Observer, ActionListener {
    protected Tab tab;
    protected T model;
```

### Deprecation
'com.intellij.ide.util.treeView.AbstractTreeBuilder' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java
import java.util.Comparator;

public class TfsTreeBuilder extends AbstractTreeBuilder {
    private static final Logger LOG = Logger.getInstance(TfsTreeBuilder.class.getName());

```

### Deprecation
'processUnversionedFile(com.intellij.openapi.vfs.VirtualFile)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ChangelistBuilderStatusVisitor.java`
#### Snippet
```java
                changelistBuilder.processLocallyDeletedFile(localPath);
            } else {
                changelistBuilder.processUnversionedFile(filePath);
            }
        }
```

### Deprecation
'EmptyIcon(int, int)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
    public static final DataKey<TfsTreeForm> KEY = DataKey.create("TfsTreeForm");
    public static final String POPUP_ACTION_GROUP = "TfvcTreePopupMenu";
    public static final Icon EMPTY_ICON = new EmptyIcon(0, UIUtil.getBalloonWarningIcon().getIconHeight());

    private JComponent contentPane;
```

### Deprecation
'installPopupHandler(javax.swing.@org.jetbrains.annotations.NotNull JComponent, java.lang.@org.jetbrains.annotations.NotNull String, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
            }
        });
        PopupHandler.installPopupHandler(tree, POPUP_ACTION_GROUP, ActionPlaces.REMOTE_HOST_DIALOG_POPUP);
        setMessage(null, false);
    }
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (ManageWorkspacesModel.REFRESH_SERVER.equals(arg)) {
            dialog.updateControls(dialog.getSelectedServer());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesController.java`
#### Snippet
```java
 * Controller for the ManageWorkspaces dialog
 */
public class ManageWorkspacesController implements Observer, ActionListener {
    private final ManageWorkspacesDialog dialog;
    private final ManageWorkspacesModel model;
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ReactiveTfvcClient.java`
#### Snippet
```java

    public static ReactiveTfvcClient getInstance() {
        return ServiceManager.getService(ReactiveTfvcClient.class);
    }

```

### Deprecation
'com.intellij.util.containers.HashMap' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceDialog.java`
#### Snippet
```java

    private static Map<String, Object> createProperties(final ServerContext serverContext) {
        final Map<String, Object> properties = new HashMap<String, Object>(4);
        properties.put(PROP_SERVER_CONTEXT, serverContext);
        return properties;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (CheckoutModel.PROP_CLONE_ENABLED.equals(arg)) {
            dialog.setOkEnabled(model.isCloneEnabled());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java
 * in sync.
 */
public class CheckoutController implements Observer {
    private final BaseDialog dialog;
    private final CheckoutModel model;
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.actionSystem.ex.CustomComponentAction'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public JComponent createCustomComponent(Presentation presentation) {
        final JComponent customComponent = super.createCustomComponent(presentation);
        customComponent.setFocusable(false);
```

### Deprecation
'createCustomComponent(com.intellij.openapi.actionSystem.@org.jetbrains.annotations.NotNull Presentation)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java
    @Override
    public JComponent createCustomComponent(Presentation presentation) {
        final JComponent customComponent = super.createCustomComponent(presentation);
        customComponent.setFocusable(false);
        customComponent.setOpaque(false);
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
 * The controller for the WorkspaceDialog
 */
public class WorkspaceController implements Observer, ActionListener {
    private final WorkspaceDialog dialog;
    private final WorkspaceModel model;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (suspendEvents) {
            return;
```

### Deprecation
'NotificationGroup(java.lang.String, com.intellij.notification.NotificationDisplayType, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFVCNotifications.java`
#### Snippet
```java

public class TFVCNotifications {
    private static final NotificationGroup TFS_NOTIFICATIONS = new NotificationGroup(
            TfPluginBundle.message(TfPluginBundle.KEY_TFVC_NOTIFICATIONS),
            NotificationDisplayType.BALLOON,
```

### Deprecation
'newArrayList()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
    public Map<VirtualFile, VcsRevisionNumber> getCurrentRevisions(Iterable<VirtualFile> files) {
        final ServerContext context = TFSVcs.getInstance(project).getServerContext(true);
        final List<String> filePaths = ContainerUtil.newArrayList();
        for (VirtualFile file : files) {
            String filePath = file.getPath();
```

### Deprecation
'newHashMap()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
        TfvcClient client = TfvcClient.getInstance();
        final LocalFileSystem fs = LocalFileSystem.getInstance();
        final Map<VirtualFile, VcsRevisionNumber> revisionMap = ContainerUtil.newHashMap();
        client.getLocalItemsInfo(project, context, filePaths, info -> {
            final String itemPath = info.getLocalItem();
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/AbstractModel.java`
#### Snippet
```java
 * It provides one additional method on to of Observable that combines setChanged and Notify.
 */
public class AbstractModel extends Observable {

    protected void setChangedAndNotify(final String propertyName) {
```

### Deprecation
'notifyImportantWarning(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
                            logger.info("Notifying the user of the min version problem.");
                            // Notify the user that they should upgrade their version of the TF command line
                            VcsNotifier.getInstance(getProject()).notifyImportantWarning(
                                    TfPluginBundle.message(TfPluginBundle.KEY_TFVC_TF_VERSION_WARNING_TITLE),
                                    error, new NotificationListener.Adapter() {
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
    public void enableIntegration() {
        BackgroundTaskUtil.executeOnPooledThread(myProject, () -> {
            Collection<VcsRoot> roots = ServiceManager.getService(myProject, VcsRootDetector.class).detect();
            new TfvcIntegrationEnabler(this).enable(roots);
        });
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.vcs.AbstractVcs'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java
    }

    public boolean fileIsUnderVcs(final FilePath filePath) {
        return isVersionedDirectory(filePath.getVirtualFile());
    }
```

### Deprecation
'isVersionedDirectory(com.intellij.openapi.vfs.VirtualFile)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSVcs.java`
#### Snippet
```java

    public boolean fileIsUnderVcs(final FilePath filePath) {
        return isVersionedDirectory(filePath.getVirtualFile());
    }

```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null) {
            form.setContextTable(model.getTableModel(), model.getTableSelectionModel());
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.vcs.checkin.CheckinEnvironment'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public RefreshableOnComponent createAdditionalOptionsPanel(final CheckinProjectPanel checkinProjectPanel,
                                                               PairConsumer<Object, Object> additionalDataConsumer) {
//        boolean isAffected = false;
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.vcs.checkin.CheckinEnvironment'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public List<VcsException> commit(List<? extends Change> changes,
                                     String preparedComment,
                                     @NotNull NullableFunction<Object, Object> parametersHolder,
```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
                    TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_LINK_TEXT, changesetNumber));
            if (!ApplicationManager.getApplication().isUnitTestMode()) {
                VcsNotifier.getInstance(myVcs.getProject()).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_SUCCESSFUL_TITLE),
                        TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CHECKIN_SUCCESSFUL_MSG, changesetLink), (notification, hyperlinkEvent) -> BrowserUtil.browse(hyperlinkEvent.getURL()));
            }
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModel.java`
#### Snippet
```java
    String DEFAULT_VSTS_ACCOUNT_FORMAT = "https://%s";

    void addObserver(Observer o);

    boolean isConnected();
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (ImportModel.PROP_IMPORT_ENABLED.equals(arg)) {
            dialog.setOkEnabled(model.isImportEnabled());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportController.java`
#### Snippet
```java
 * in sync.
 */
public class ImportController implements Observer {

    private final BaseDialog dialog;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/AbstractController.java`
#### Snippet
```java
public abstract class AbstractController implements Observer, ActionListener {
    @Override
    public abstract void update(final Observable o, final Object arg);

    @Override
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/AbstractController.java`
#### Snippet
```java
import java.util.Observer;

public abstract class AbstractController implements Observer, ActionListener {
    @Override
    public abstract void update(final Observable o, final Object arg);
```

### Deprecation
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/FeedbackAction.java`
#### Snippet
```java

        if (dialog.showAndGet()) {
            VcsNotifier.getInstance(project).notifySuccess(
                    TfPluginBundle.message(TfPluginBundle.KEY_FEEDBACK_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_FEEDBACK_NOTIFICATION));
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/checkout/GitCheckoutModel.java`
#### Snippet
```java
            boolean isTfvcServerCheckout) {
        final String gitRepositoryStr = context.getUsableGitUrl();
        final Git git = ServiceManager.getService(Git.class);
        git4idea.checkout.GitCheckoutProvider.clone(project, git, listener,
                destinationParent,
```

### Deprecation
'getBestAuthenticationInfo(java.lang.String, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/authentication/TfsAuthenticationProvider.java`
#### Snippet
```java
         * state to avoid user type in the server url again.
         */
        return ServerContextManager.getInstance().getBestAuthenticationInfo(TFS_LAST_USED_URL, false);
    }

```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestController.java`
#### Snippet
```java
 * Controller for CreatePullRequestDialog
 */
public class CreatePullRequestController implements Observer, ActionListener {

    private CreatePullRequestDialog createDialog;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestController.java`
#### Snippet
```java

    @Override
    public void update(final Observable observable, final Object arg) {
        if (arg == null || CreatePullRequestModel.PROP_SOURCE_BRANCH.equals(arg)) {
            this.createDialog.setSourceBranch(this.createModel.getSourceBranch());
```

### Deprecation
'getModifiers()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'BUTTON3_MASK' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'BUTTON3_MASK' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'getModifiers()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'BUTTON3_MASK' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'BUTTON3_MASK' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsForm.java`
#### Snippet
```java
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
```

### Deprecation
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
    public static void refreshAndFindFile(final FilePath path) {
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### Deprecation
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    ApplicationManager.getApplication().runWriteAction(new Runnable() {
```

### Deprecation
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
        final Ref<IOException> exception = new Ref<IOException>();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                public void run() {
                    try {
```

### Deprecation
'getButton()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        mySourceIsDirectory = initialSourcePathIsDirectory;

        sourceText.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                final ServerBrowserDialog dialog =
```

### Deprecation
'loadFromStream(java.io.@org.jetbrains.annotations.NotNull InputStream)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSTmpFileStore.java`
#### Snippet
```java
        try {
            fileStream = new FileInputStream(myTmpFile);
            return StreamUtil.loadFromStream(fileStream);
        } finally {
            if (fileStream != null) {
```

### Deprecation
'assertNotNull(@org.jetbrains.annotations.Nullable T)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfIgnoreUtil.java`
#### Snippet
```java
    private static void addLineToFile(VirtualFile file, String line) {
        FileDocumentManager fileDocumentManager = FileDocumentManager.getInstance();
        Document document = ObjectUtils.assertNotNull(fileDocumentManager.getDocument(file));
        CharSequence contents = document.getCharsSequence();
        if (!StringUtil.isEmpty(contents) && !StringUtil.endsWith(contents, "\n")) {
```

### Deprecation
'assertNotNull(@org.jetbrains.annotations.Nullable T)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfIgnoreUtil.java`
#### Snippet
```java
        VirtualFile virtualTfIgnoreFile = LocalFileSystem.getInstance().findFileByIoFile(tfIgnore);
        if (virtualTfIgnoreFile == null) {
            VirtualFile parentDir = ObjectUtils.assertNotNull( // should never be null because of the way we work with .tfignore
                    LocalFileSystem.getInstance().findFileByIoFile(tfIgnore.getParentFile()));
            virtualTfIgnoreFile = parentDir.createChildData(requestor, TFIGNORE_FILE_NAME);
```

### Deprecation
'getTreeSelectionBackground()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java
        SwingHelper.setMargin(panel, JBUI.scale(5));
        panel.setBackground(selected ?
                (hasFocus ? UIUtil.getTreeSelectionBackground() : UIUtil.getTreeUnfocusedSelectionBackground())
                : UIUtil.getTreeBackground());

```

### Deprecation
'getTreeUnfocusedSelectionBackground()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java
        SwingHelper.setMargin(panel, JBUI.scale(5));
        panel.setBackground(selected ?
                (hasFocus ? UIUtil.getTreeSelectionBackground() : UIUtil.getTreeUnfocusedSelectionBackground())
                : UIUtil.getTreeBackground());

```

### Deprecation
'getTreeSelectionForeground()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java
                : UIUtil.getTreeBackground());

        titleLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : UIUtil.getTreeTextForeground());
        summaryLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : SimpleTextAttributes.GRAY_ATTRIBUTES.getFgColor());
    }
```

### Deprecation
'getTreeTextForeground()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java
                : UIUtil.getTreeBackground());

        titleLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : UIUtil.getTreeTextForeground());
        summaryLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : SimpleTextAttributes.GRAY_ATTRIBUTES.getFgColor());
    }
```

### Deprecation
'getTreeSelectionForeground()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeNodeForm.java`
#### Snippet
```java

        titleLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : UIUtil.getTreeTextForeground());
        summaryLabel.setForeground(selected && hasFocus ? UIUtil.getTreeSelectionForeground() : SimpleTextAttributes.GRAY_ATTRIBUTES.getFgColor());
    }

```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null || arg.equals(LoginPageModel.PROP_CONNECTED)) {
            page.setLoginShowing(!model.isConnected());
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null || CreateBranchModel.PROP_BRANCH_NAME.equals(arg)) {
            dialog.setBranchName(model.getBranchName());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchController.java`
#### Snippet
```java
 * Controller for creating a new branch from an existing remote branch
 */
public class CreateBranchController implements Observer, ActionListener {
    private static final Logger logger = LoggerFactory.getLogger(CreateBranchController.class);

```

### Deprecation
'com.intellij.openapi.application.ApplicationStarterEx' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
 * the needed arguments to start a VSTS specific workflow.
 */
public abstract class ApplicationStarterBase extends ApplicationStarterEx {
    private final Logger logger = LoggerFactory.getLogger(ApplicationStarterBase.class);
    public static final String VSTS_COMMAND = "vsts";
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.application.ApplicationStarter'
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java

    @Override
    public void main(String[] args) {
        logger.debug("Args passed to Azure DevOps to process: {}", Arrays.toString(args));
        try {
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.application.ApplicationStarter'
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java

    @Override
    public void premain(String[] args) {
        if (!checkArguments(args)) {
            System.err.println(getUsageMessage());
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null || arg.equals(SelectWorkItemsModel.PROP_LOADING)) {
            form.setLoading(model.isLoading());
```

### Deprecation
'getAuthenticationInfo(java.lang.String, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
            // if auth error occurs it most likely is because the workspace is a server workspace so pass credentials with the call
            logger.warn("Authentication failed while trying to get the partial workspace. Trying again with credentials");
            final AuthenticationInfo authInfo = ServerContextManager.getInstance().getAuthenticationInfo(serverName, true);
            return CommandUtils.getPartialWorkspace(serverName, workspaceName, authInfo);
        }
```

### Deprecation
'getAuthenticationInfo(java.lang.String, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
        try {
            // get auth info for the server
            final AuthenticationInfo authInfo = ServerContextManager.getInstance().getAuthenticationInfo(selectedServer.getName(), true);
            if (authInfo != null) {
                // will refresh the cache which populates the menu
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    editWorkspace(selectedWorkspace, update);
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    reloadWorkspaces(selectedServer);
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    deleteWorkspace(selectedWorkspace);
```

### Deprecation
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java

                    // Notify the user of a successful sync
                    VcsNotifier.getInstance(project).notifySuccess(
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_TITLE),
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_SYNC_MESSAGE));
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_SYNC_MESSAGE));
                } catch (final Throwable t) {
                    VcsNotifier.getInstance(project).notifyError(
                            TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_FAILURE_TITLE),
                            LocalizationServiceImpl.getInstance().getExceptionMessage(t));
```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                // Notify the user of success and provide a link to sync the workspace
                // (It doesn't make sense to tell the user we are done here if there is another thread still doing work)
                VcsNotifier.getInstance(project).notifyImportantInfo(
                        TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_TITLE),
                        TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_SUCCESS_MESSAGE),
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
        } catch (final Throwable t) {
            //TODO on failure we could provide a link that reopened the dialog with the values they tried to save
            VcsNotifier.getInstance(project).notifyError(
                    TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_NOTIFY_FAILURE_TITLE),
                    LocalizationServiceImpl.getInstance().getExceptionMessage(t));
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabModel.java`
#### Snippet
```java
    void dispose();

    void addObserver(final Observer observer);

    boolean isTeamServicesRepository();
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    public static GitChangesContainer createChangesContainer(final String sourceBranchName, final String targetBranchName,
                                                             final String sourceBranchHash, final String targetBranchHash,
                                                             final GitCommitCompareInfo gitCommitCompareInfo,
                                                             final GitRepository gitRepository) {
        final GitChangesContainer container = new GitChangesContainer();
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public void setGitCommitCompareInfo(final GitCommitCompareInfo gitCommitCompareInfo) {
        this.gitCommitCompareInfo = gitCommitCompareInfo;
    }
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getGitCommitCompareInfo() {
        return gitCommitCompareInfo;
    }
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/GitChangesContainer.java`
#### Snippet
```java
    private String sourceBranchHash;
    private String targetBranchHash;
    private GitCommitCompareInfo gitCommitCompareInfo;
    private GitRepository gitRepository;

```

### Deprecation
'DIRECTORY_CLOSED_ICON' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java
        } else {
            if (isDirectory()) {
                presentation.setIcon(PlatformIcons.DIRECTORY_CLOSED_ICON);
            } else {
                presentation.setIcon(FileTypeManager.getInstance().getFileTypeByFileName(getFileName()).getIcon());
```

### Deprecation
'VcsVFSListener(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, com.intellij.openapi.vcs.@org.jetbrains.annotations.NotNull AbstractVcs)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileListener.java`
#### Snippet
```java

    public TFSFileListener(Project project, TFSVcs vcs) {
        super(project, vcs);
    }

```

### Deprecation
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java

            if (success) {
                vcsNotifier.notifySuccess(
                        TfPluginBundle.message(
                                TfPluginBundle.KEY_TFVC_REPOSITORY_IMPORT_SUCCESS,
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java
        } catch (Throwable error) {
            ourLogger.error(error);
            vcsNotifier.notifyError(
                    TfPluginBundle.message(
                            TfPluginBundle.KEY_TFVC_REPOSITORY_IMPORT_ERROR,
```

### Deprecation
'notNull(@org.jetbrains.annotations.Nullable T)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcIntegrationEnabler.java`
#### Snippet
```java
            public void run(@NotNull ProgressIndicator indicator) {
                Path workspacePath = determineWorkspaceDirectory(Paths.get(basePath), indicator);
                workspaceFile.set(ObjectUtils.notNull(
                        LocalFileSystem.getInstance().findFileByIoFile(workspacePath.toFile())));
                indicator.checkCanceled();
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            }
        };
        VcsUtil.runVcsProcessWithProgress(runnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_MERGE_LOADING), false, project);
        return contentTriplet;
    }
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            }
        };
        VcsUtil.runVcsProcessWithProgress(resolveRunnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_RESOLVING_PROGRESS_BAR), false, project);

        // The following code is in this method instead of resolveConflict so that it will be called from tests
```

### Deprecation
'git4idea.config.GitExecutableValidator' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     */
    public static boolean isGitExeConfigured(@NotNull final Project project) {
        final GitExecutableValidator validator = GitVcs.getInstance(project).getExecutableValidator();
        if (!validator.checkExecutableAndNotifyIfNeeded()) {
            //Git.exe is not configured, show warning message in addition to notification from Git plugin
```

### Deprecation
'getExecutableValidator()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     */
    public static boolean isGitExeConfigured(@NotNull final Project project) {
        final GitExecutableValidator validator = GitVcs.getInstance(project).getExecutableValidator();
        if (!validator.checkExecutableAndNotifyIfNeeded()) {
            //Git.exe is not configured, show warning message in addition to notification from Git plugin
```

### Deprecation
'is32Bit' is deprecated
in `plugin/src/com/microsoft/alm/plugin/external/visualstudio/VisualStudioTfvcClient.java`
#### Snippet
```java
    public static Path detectClientPath() {
        if (!SystemInfo.isWindows) return null;
        String programFilesPath = SystemInfo.is32Bit ? System.getenv("ProgramFiles") : System.getenv("ProgramFiles(x86)");
        if (StringUtils.isEmpty(programFilesPath))
            programFilesPath = "C:\\Program Files (x86)";
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ClassicTfvcClient.java`
#### Snippet
```java

    public static ClassicTfvcClient getInstance() {
        return ServiceManager.getService(ClassicTfvcClient.class);
    }

```

### Deprecation
'com.intellij.openapi.fileTypes.FileTypeFactory' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/tfignore/TfIgnoreFileTypeFactory.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class TfIgnoreFileTypeFactory extends FileTypeFactory {

    @Override
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MergeBranchAction.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                @Override
                public void run() throws VcsException {
```

### Deprecation
'git4idea.actions.BasicAction' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/GitCheckoutProvider.java`
#### Snippet
```java
    @Override
    public void doCheckout(@NotNull final Project project, final Listener listener) {
        BasicAction.saveAll();

        if(!IdeaHelper.isGitExeConfigured(project)) {
```

### Deprecation
'saveAll()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/GitCheckoutProvider.java`
#### Snippet
```java
    @Override
    public void doCheckout(@NotNull final Project project, final Listener listener) {
        BasicAction.saveAll();

        if(!IdeaHelper.isGitExeConfigured(project)) {
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/GitCheckoutProvider.java`
#### Snippet
```java
            //unexpected error
            logger.warn("doCheckout failed unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### Deprecation
'git4idea.actions.BasicAction' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/actions/ImportAction.java`
#### Snippet
```java
        }

        BasicAction.saveAll();

        try {
```

### Deprecation
'saveAll()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/actions/ImportAction.java`
#### Snippet
```java
        }

        BasicAction.saveAll();

        try {
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/actions/ImportAction.java`
#### Snippet
```java
            //unexpected error
            logger.warn("ImportAction doActionPerformed failed unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_ACTIONS_IMPORT),
                    TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                                    public void run() {
                                        logger.info("Checking out branch " + remoteRef);
                                        final GitBrancher brancher = ServiceManager.getService(lastOpenedProject, GitBrancher.class);
                                        brancher.checkoutNewBranchStartingFrom(ref, remoteRef,
                                                Collections.singletonList(gitRepository), null);
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                    if (context == null) {
                        logger.warn("No context could be found");
                        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_AUTHENTICATION_FAILED_TITLE), TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitUrl));
                        return;
                    }
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

                    final String gitRepositoryStr = context.getUsableGitUrl();
                    final Git git = ServiceManager.getService(Git.class);
                    logger.info("Cloning repo " + gitRepositoryStr);
                    cloneResult.set(git4idea.checkout.GitCheckoutProvider.doClone(project, git, getDirectoryName(), getParentDirectory(), gitRepositoryStr));
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java
                    manager.addInitializationRequest(VcsInitObject.AFTER_COMMON, new DumbAwareRunnable() {
                        public void run() {
                            final GitRepositoryManager gitRepositoryManager = ServiceManager.getService(lastOpenedProject, GitRepositoryManager.class);
                            ArgumentHelper.checkNotNull(gitRepositoryManager, "GitRepositoryManager");
                            ArgumentHelper.checkNotNullOrEmpty(gitRepositoryManager.getRepositories(), "gitRepositoryManager.getRepositories()");
```

### Deprecation
'getRemoteBranches()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutModel.java`
#### Snippet
```java

                            // find remote red name from given name
                            for (final GitRemoteBranch remoteBranch : gitRepository.getInfo().getRemoteBranches()) {
                                final String remoteBranchName = remoteBranch.getName().replaceFirst(remoteBranch.getRemote().getName() + "/", StringUtils.EMPTY);
                                if (ref.equals(remoteBranchName)) {
```

### Deprecation
'getBaseDir()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
        AbstractVcs vcs = null;
        try {
            vcs = projectLevelVcsManager.getVcsFor(project.getBaseDir());
        } catch (Throwable t) {
            // This has been seen in PyCharm as a bug where it tries to open the site-packages as a source root
```

### Deprecation
'getBaseDir()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
        if (isGitVcs(project)) {
            final GitRepositoryManager manager = GitUtil.getRepositoryManager(project);
            GitRepository repository = manager.getRepositoryForRootQuick(project.getBaseDir());

            // in the case where the base dir of the Git repo and the base dir of IDEA project don't match this can be null
```

### Deprecation
'assertNotNull(@org.jetbrains.annotations.Nullable T)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddFileToTfIgnoreAction.java`
#### Snippet
```java

        Workspace partialWorkspace = TfvcWorkspaceLocator.getPartialWorkspace(myProject, true);
        String filePath = ObjectUtils.assertNotNull(
                TfsFileUtil.translateServerItemToLocalItem(partialWorkspace.getMappings(), myServerFilePath, false));
        File localFile = new File(filePath);
```

### Deprecation
'addProjectManagerListener(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull ProjectManagerListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java
        if (projectEventListener == null) {
            projectEventListener = new ProjectEventListener();
            ProjectManager.getInstance().addProjectManagerListener(projectEventListener);
        }
    }
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.project.ProjectManagerListener'
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java

        @Override
        public boolean canCloseProject(final Project project) {
            return true;
        }
```

### Deprecation
'getBestAuthenticationInfo(java.lang.String, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/TfGitHttpAuthDataProvider.java`
#### Snippet
```java

        //try to find authentication info from saved server contexts
        final AuthenticationInfo authenticationInfo = ServerContextManager.getInstance().getBestAuthenticationInfo(url, false);
        if (authenticationInfo != null) {
            return new AuthData(authenticationInfo.getUserName(), authenticationInfo.getPassword());
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java
        TeamServicesSettingsService service = null;
        if (ApplicationManager.getApplication() != null) {
            service = ServiceManager.getService(TeamServicesSettingsService.class);
        }

```

### Deprecation
'getCommitMessage()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/SelectWorkItemsAction.java`
#### Snippet
```java
            // Attempt to append the message instead of overwriting it
            if (commitMessageI instanceof CommitChangeListDialog) {
                commitMessage = ((CommitChangeListDialog) commitMessageI).getCommitMessage();
            }

```

### Deprecation
'notifySuccess(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
    private void notifyOperationStatus(final boolean success, final String message) {
        if (success) {
            VcsNotifier.getInstance(project).notifySuccess(
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        } else {
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        } else {
            VcsNotifier.getInstance(project).notifyError(
                    TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE), message, NotificationListener.URL_OPENING_LISTENER);
        }
```

### Deprecation
'YES_BUTTON' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_ABANDON_CONFIRMATION, prId),
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE),
                                        Icons.VSLogo, Messages.YES_BUTTON, Messages.NO_BUTTON);
                            }
                        }, true, indicator.getModalityState());
```

### Deprecation
'NO_BUTTON' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_ABANDON_CONFIRMATION, prId),
                                        TfPluginBundle.message(TfPluginBundle.KEY_VCS_PR_TITLE),
                                        Icons.VSLogo, Messages.YES_BUTTON, Messages.NO_BUTTON);
                            }
                        }, true, indicator.getModalityState());
```

### Deprecation
'getPlugin(com.intellij.openapi.extensions.@org.jetbrains.annotations.Nullable PluginId)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/external/reactive/ReactiveTfvcClientHolder.java`
#### Snippet
```java
    public static Path getClientBackendPath() {
        return Paths.get(
                Objects.requireNonNull(PluginManager.getPlugin(IdeaHelper.PLUGIN_ID)).getPath().getAbsolutePath(),
                "backend");
    }
```

### Deprecation
'getPath()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/external/reactive/ReactiveTfvcClientHolder.java`
#### Snippet
```java
    public static Path getClientBackendPath() {
        return Paths.get(
                Objects.requireNonNull(PluginManager.getPlugin(IdeaHelper.PLUGIN_ID)).getPath().getAbsolutePath(),
                "backend");
    }
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/external/reactive/ReactiveTfvcClientHolder.java`
#### Snippet
```java

    public static ReactiveTfvcClientHolder getInstance() {
        return ServiceManager.getService(ReactiveTfvcClientHolder.class);
    }

```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutController.java`
#### Snippet
```java
 * The controller for the SimpleCheckoutDialog
 */
public class SimpleCheckoutController implements Observer, ActionListener {
    private final SimpleCheckoutDialog dialog;
    private final SimpleCheckoutModel model;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/simplecheckout/SimpleCheckoutController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null || arg.equals(SimpleCheckoutModel.PROP_DIRECTORY_NAME)) {
            dialog.setDirectoryName(model.getDirectoryName());
```

### Deprecation
'getPassword(com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project, java.lang.@org.jetbrains.annotations.NotNull Class, java.lang.@org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
    private static String readPasswordOldWay(final String key) {
        try {
            return PasswordSafe.getInstance().getPassword(null, TeamServicesSecrets.class, key);
        } catch (final PasswordSafeException e) {
            logger.warn("Failed to read password", e);
```

### Deprecation
'com.intellij.ide.passwordSafe.PasswordSafeException' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
        try {
            return PasswordSafe.getInstance().getPassword(null, TeamServicesSecrets.class, key);
        } catch (final PasswordSafeException e) {
            logger.warn("Failed to read password", e);
        } catch (Throwable t) {
```

### Deprecation
'storePassword(com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project, java.lang.@org.jetbrains.annotations.NotNull Class, java.lang.@org.jetbrains.annotations.NotNull String, java.lang.@org.jetbrains.annotations.Nullable String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
    private static void writePasswordOldWay(final String key, final String value) {
        try {
            PasswordSafe.getInstance().storePassword(null, TeamServicesSecrets.class, key, value);
        } catch (PasswordSafeException e) {
            logger.warn("Failed to write password", e);
```

### Deprecation
'com.intellij.ide.passwordSafe.PasswordSafeException' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
        try {
            PasswordSafe.getInstance().storePassword(null, TeamServicesSecrets.class, key, value);
        } catch (PasswordSafeException e) {
            logger.warn("Failed to write password", e);
        } catch (Throwable t) {
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java

    public static TeamServicesSecrets getInstance() {
        return ServiceManager.getService(TeamServicesSecrets.class);
    }

```

### Deprecation
'runOrInvokeAndWait(java.lang.@org.jetbrains.annotations.NotNull Runnable)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
        final Ref<VirtualFile> selectedFile = Ref.create();
        try {
            GuiUtils.runOrInvokeAndWait(new Runnable() {
                @Override
                public void run() {
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsController.java`
#### Snippet
```java

    @Override
    public void update(final Observable observable, final Object arg) {
        if (VcsWorkItemsModel.CONTEXT_FOUND.equals(arg)) {
            tab.refresh(model.isTeamServicesRepository());
```

### Deprecation
'runVcsProcessWithProgress(com.intellij.vcsUtil.@org.jetbrains.annotations.NotNull VcsRunnable, java.lang.@org.jetbrains.annotations.NotNull @com.intellij.openapi.util.NlsContexts.ProgressTitle String, boolean, com.intellij.openapi.project.@org.jetbrains.annotations.Nullable Project)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
                }
            };
            VcsUtil.runVcsProcessWithProgress(resolveRunnable, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_LOADING_PROGRESS_BAR), false, project);
        } catch (VcsException e) {
            logger.error("Error while loading conflicts: " + e.getMessage());
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/authentication/VsoAuthenticationProvider.java`
#### Snippet
```java

    public static VsoAuthenticationProvider getInstance() {
        return ServiceManager.getService(VsoAuthenticationProvider.class);
    }

```

### Deprecation
'getBestAuthenticationInfo(java.lang.String, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/authentication/VsoAuthenticationProvider.java`
#### Snippet
```java
    public AuthenticationInfo getAuthenticationInfo(final String serverUri) {
        final AuthenticationInfo authenticationInfo =
                ServerContextManager.getInstance().getBestAuthenticationInfo(serverUri, false);

        return authenticationInfo;
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null) {
            dialog.setConflictsTableModel(model.getConflictsTableModel());
```

### Deprecation
'java.util.Observer' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsController.java`
#### Snippet
```java
 * Controller for resolving conflicts interactively with users
 */
public class ResolveConflictsController implements Observer, ActionListener {
    private final ResolveConflictsDialog dialog;
    private final ResolveConflictsModel model;
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/IdeaFileSelector.java`
#### Snippet
```java
public class IdeaFileSelector {
    public static IdeaFileSelector getInstance() {
        return ServiceManager.getService(IdeaFileSelector.class);
    }

```

### Deprecation
'init(com.intellij.openapi.project.Project, java.util.@org.jetbrains.annotations.NotNull List, java.lang.@org.jetbrains.annotations.Nullable @com.intellij.openapi.util.NlsContexts.Label String, com.intellij.openapi.vcs.@org.jetbrains.annotations.Nullable VcsShowConfirmationOption, boolean, boolean, boolean)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/IdeaFileSelector.java`
#### Snippet
```java
        ApplicationManager.getApplication().assertIsDispatchThread();

        SelectFilesDialog dialog = SelectFilesDialog.init(
                project,
                originalFiles,
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/context/RepositoryContextManager.java`
#### Snippet
```java

    public static RepositoryContextManager getInstance() {
        return ServiceManager.getService(RepositoryContextManager.class);
    }

```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
                                    UrlHelper.getSpecificWorkItemURI(context.getTeamProjectURI(), workItem.getId()), String.valueOf(workItem.getId()), UrlHelper.getBranchURI(context.getUri(), branchName), branchName);

                            VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(wasWorkItemAssociated ? TfPluginBundle.KEY_WIT_ASSOCIATION_SUCCESSFUL_TITLE : TfPluginBundle.KEY_WIT_ASSOCIATION_FAILED_TITLE),
                                    notificationMsg, new NotificationListener() {
                                        @Override
```

### Deprecation
'java.util.Observable' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageController.java`
#### Snippet
```java

    @Override
    public void update(final Observable o, final Object arg) {
        if (arg == null || arg.equals(LoginPageModel.PROP_CONNECTED)) {
            page.setLoginShowing(!pageModel.isConnected());
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        //push all branches in local Git repo to remote
        indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_PUSH));
        final Git git = ServiceManager.getService(Git.class);
        final GitCommandResult result = git.push(localRepository, REMOTE_ORIGIN, remoteGitUrl, "*", true);
        if (!result.success()) {
```

### Deprecation
'getGitDir()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                        //user chose to cancel import
                        logger.warn("setupRemoteOnLocalRepo: User chose to cancel import for project: {}, local repo: {}",
                                project.getName(), localRepository.getGitDir().getUrl());
                        notifyImportError(project, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_CANCELED));
                        return false;
```

### Deprecation
'git4idea.commands.GitSimpleHandler' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        final String remoteGitUrl = UrlHelper.getCmdLineFriendlyUrl(remoteRepository.getRemoteUrl());
        //update remotes on local repository
        final GitSimpleHandler hRemote = new GitSimpleHandler(project, localRepository.getRoot(), GitCommand.REMOTE);
        hRemote.setSilent(true);
        if (remoteParams.size() == 1) {
```

### Deprecation
'git4idea.commands.GitSimpleHandler' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        final String remoteGitUrl = UrlHelper.getCmdLineFriendlyUrl(remoteRepository.getRemoteUrl());
        //update remotes on local repository
        final GitSimpleHandler hRemote = new GitSimpleHandler(project, localRepository.getRoot(), GitCommand.REMOTE);
        hRemote.setSilent(true);
        if (remoteParams.size() == 1) {
```

### Deprecation
'git4idea.commands.GitHandlerUtil' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        }

        GitHandlerUtil.runInCurrentThread(hRemote, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_REMOTE));
        if (hRemote.getExitCode() != 0) {
            logger.error("setupRemoteOnLocalRepo: git remote failed for project: {}, local repo: {}, error: {}, output: {}",
```

### Deprecation
'runInCurrentThread(git4idea.commands.@org.jetbrains.annotations.NotNull GitHandler, com.intellij.openapi.progress.@org.jetbrains.annotations.Nullable ProgressIndicator, boolean, java.lang.@org.jetbrains.annotations.Nullable @org.jetbrains.annotations.Nls String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        }

        GitHandlerUtil.runInCurrentThread(hRemote, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_REMOTE));
        if (hRemote.getExitCode() != 0) {
            logger.error("setupRemoteOnLocalRepo: git remote failed for project: {}, local repo: {}, error: {}, output: {}",
```

### Deprecation
'getExitCode()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

        GitHandlerUtil.runInCurrentThread(hRemote, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_REMOTE));
        if (hRemote.getExitCode() != 0) {
            logger.error("setupRemoteOnLocalRepo: git remote failed for project: {}, local repo: {}, error: {}, output: {}",
                    project.getName(), localRepository.getRoot().getUrl(), hRemote.getStderr(), hRemote.getStdout());
```

### Deprecation
'retrieveUntrackedFiles()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                final ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager.getInstance(project);
                final List<VirtualFile> trackedFiles = changeListManager.getAffectedFiles();
                final Collection<VirtualFile> untrackedFiles = ContainerUtil.filter(localRepository.getUntrackedFilesHolder().retrieveUntrackedFiles(),
                        new Condition<VirtualFile>() {
                            @Override
```

### Deprecation
'git4idea.commands.GitSimpleHandler' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                GitFileUtils.addFiles(project, rootVirtualFile, filesToCommit);
                if (filesToCommit.size() > 0) {
                    final GitSimpleHandler hCommit = new GitSimpleHandler(project, rootVirtualFile, GitCommand.COMMIT);
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
```

### Deprecation
'git4idea.commands.GitSimpleHandler' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                GitFileUtils.addFiles(project, rootVirtualFile, filesToCommit);
                if (filesToCommit.size() > 0) {
                    final GitSimpleHandler hCommit = new GitSimpleHandler(project, rootVirtualFile, GitCommand.COMMIT);
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
```

### Deprecation
'git4idea.commands.GitHandlerUtil' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    final GitSimpleHandler hCommit = new GitSimpleHandler(project, rootVirtualFile, GitCommand.COMMIT);
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    if (hCommit.getExitCode() != 0) {
                        //unable to commit
```

### Deprecation
'runInCurrentThread(git4idea.commands.@org.jetbrains.annotations.NotNull GitHandler, com.intellij.openapi.progress.@org.jetbrains.annotations.Nullable ProgressIndicator, boolean, java.lang.@org.jetbrains.annotations.Nullable @org.jetbrains.annotations.Nls String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    final GitSimpleHandler hCommit = new GitSimpleHandler(project, rootVirtualFile, GitCommand.COMMIT);
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    if (hCommit.getExitCode() != 0) {
                        //unable to commit
```

### Deprecation
'getExitCode()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    hCommit.addParameters("-m", TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    GitHandlerUtil.runInCurrentThread(hCommit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_ADDING_FILES, project.getName()));
                    if (hCommit.getExitCode() != 0) {
                        //unable to commit
                        logger.error("doFirstCommitIfRequired: git commit failed for project: {}, repoRoot: {} with error: {}",
```

### Deprecation
'git4idea.commands.GitHandlerUtil' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        final GitLineHandler hInit = new GitLineHandler(project, rootVirtualFile, GitCommand.INIT);
        GitHandlerUtil.runInCurrentThread(hInit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        if (!hInit.errors().isEmpty()) {
            //git init failed
```

### Deprecation
'runInCurrentThread(git4idea.commands.@org.jetbrains.annotations.NotNull GitHandler, com.intellij.openapi.progress.@org.jetbrains.annotations.Nullable ProgressIndicator, boolean, java.lang.@org.jetbrains.annotations.Nullable @org.jetbrains.annotations.Nls String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        final GitLineHandler hInit = new GitLineHandler(project, rootVirtualFile, GitCommand.INIT);
        GitHandlerUtil.runInCurrentThread(hInit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        if (!hInit.errors().isEmpty()) {
            //git init failed
```

### Deprecation
'errors()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        final GitLineHandler hInit = new GitLineHandler(project, rootVirtualFile, GitCommand.INIT);
        GitHandlerUtil.runInCurrentThread(hInit, null, true, TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_GIT_INIT, project.getName()));
        if (!hInit.errors().isEmpty()) {
            //git init failed
            final String error = hInit.errors().get(0).getMessage();
```

### Deprecation
'errors()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
        if (!hInit.errors().isEmpty()) {
            //git init failed
            final String error = hInit.errors().get(0).getMessage();
            logger.error("setupGitRepositoryForProject: git init failed on project: {} at root: {} with error: {}",
                    project.getName(), rootVirtualFile.getUrl(), error);
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

    private void notifyImportError(final Project project, final String message) {
        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_FAILED), message, NotificationListener.URL_OPENING_LISTENER);
    }

```

### Deprecation
'getBaseDir()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

                    final GitRepository repo = getRepositoryForProject(project);
                    final VirtualFile rootVirtualFile = repo != null ? repo.getRoot() : project.getBaseDir();

                    final GitRepository localRepository = repo != null ? repo :
```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
                    if (StringUtils.isNotEmpty(remoteUrlForDisplay)) {
                        // Notify the user that we are done and provide a link to the repo
                        VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_SUCCEEDED),
                                TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_SUCCEEDED_MESSAGE, project.getName(), remoteUrlForDisplay, repositoryName),
                                NotificationListener.URL_OPENING_LISTENER);
```

### Deprecation
'getBaseDir()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java
            // either none or multiple repositories were found
            // try to find repository for project root
            repo = repositoryManager.getRepositoryForFile(project.getBaseDir());
        }
        return repo;
```

### Deprecation
'getRemoteBranches()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

        // only show valid remote branches
        sortedRemoteBranches.addAll(Collections2.filter(getInfo().getRemoteBranches(),
                remoteBranch -> {
                    /* two conditions:
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    private GitChangesContainer localBranchChanges;

    private final LoadingCache<Pair<String, String>, GitCommitCompareInfo> diffCache;

    /* Executor service for running diff calculating Futures */
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    private void notifyError(final Project project, final String title, final String message) {
        if (message != null) {
            VcsNotifier.getInstance(project).notifyError(title, message);
        } else {
            VcsNotifier.getInstance(project).notifyError(title, "");
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
            VcsNotifier.getInstance(project).notifyError(title, message);
        } else {
            VcsNotifier.getInstance(project).notifyError(title, "");
        }
    }
```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

        indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_CREATE_PR_PUSH_TITLE));
        final Git git = ServiceManager.getService(Git.class);

        final GitRemoteBranch trackingBranch = localBranch.findTrackedBranch(gitRepository);
```

### Deprecation
'git4idea.GitExecutionException' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        } else {
            final String errMsg = result.getErrorOutputAsJoinedString();
            pushResult.setException(new GitExecutionException(errMsg, null));
        }

```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                                setLoading(false);

                                final GitCommitCompareInfo compareInfo = changesContainer.getGitCommitCompareInfo();
                                if (compareInfo != null) {
                                    List<GitCommit> commits
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

        try {
            GitCommitCompareInfo changes
                    = this.diffCache.get(new Pair<String, String>(currBranchHash, remoteBranchHash));

```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    private void notifySuccess(final Project project, final String title, final String message) {
        VcsNotifier.getInstance(project).notifyImportantInfo(title, message, new NotificationListener() {
            @Override
            public void hyperlinkUpdate(@NotNull final Notification n, @NotNull final HyperlinkEvent e) {
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
                                // if we missed the cache, then show the loading spinner, otherwise
                                // just switch to the diff we have to avoid flickering the screen
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        this.diffCache = CacheBuilder.newBuilder().maximumSize(20)
                .build(
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java

                    if (context == null) {
                        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(
                                        TfPluginBundle.KEY_CREATE_BRANCH_ERRORS_AUTHENTICATION_FAILED_TITLE),
                                TfPluginBundle.message(TfPluginBundle.KEY_ERRORS_AUTH_NOT_SUCCESSFUL, gitRemoteUrl));
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.progress.ProgressIndicator'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java

            @Override
            public void finishNonCancelableSection() {
            }

```

### Deprecation
'git4idea.update.GitFetcher' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                    // Fetch server changes so we can checkout here if we want to
                    logger.info("Fetching latest from server so that the new branch is available to checkout");
                    final GitFetcher fetcher = new GitFetcher(project, getProgressIndicator(progressIndicator), true);
                    final GitFetchResult fetchResult = fetcher.fetch(gitRepository);
                    if (fetchResult.isSuccess() && this.checkoutBranch) {
```

### Deprecation
'git4idea.update.GitFetcher' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                    // Fetch server changes so we can checkout here if we want to
                    logger.info("Fetching latest from server so that the new branch is available to checkout");
                    final GitFetcher fetcher = new GitFetcher(project, getProgressIndicator(progressIndicator), true);
                    final GitFetchResult fetchResult = fetcher.fetch(gitRepository);
                    if (fetchResult.isSuccess() && this.checkoutBranch) {
```

### Deprecation
'git4idea.update.GitFetchResult' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                    logger.info("Fetching latest from server so that the new branch is available to checkout");
                    final GitFetcher fetcher = new GitFetcher(project, getProgressIndicator(progressIndicator), true);
                    final GitFetchResult fetchResult = fetcher.fetch(gitRepository);
                    if (fetchResult.isSuccess() && this.checkoutBranch) {
                        logger.info("Checking out new branch: " + branchName);
```

### Deprecation
'fetch(git4idea.repo.@org.jetbrains.annotations.NotNull GitRepository)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                    logger.info("Fetching latest from server so that the new branch is available to checkout");
                    final GitFetcher fetcher = new GitFetcher(project, getProgressIndicator(progressIndicator), true);
                    final GitFetchResult fetchResult = fetcher.fetch(gitRepository);
                    if (fetchResult.isSuccess() && this.checkoutBranch) {
                        logger.info("Checking out new branch: " + branchName);
```

### Deprecation
'notifyImportantInfo(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                final String branchLink = String.format(UrlHelper.SHORT_HTTP_LINK_FORMATTER, UrlHelper.getBranchURI(context.getUri(), getBranchName()), getBranchName());
                if (!ApplicationManager.getApplication().isUnitTestMode()) {
                    VcsNotifier.getInstance(project).notifyImportantInfo(TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_SUCCESSFUL_TITLE),
                            TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_SUCCESSFUL_DESCRIPTION, branchLink), new NotificationListener() {
                                @Override
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                logger.warn("Create branch failed: {}", errorMessage);
                if (!ApplicationManager.getApplication().isUnitTestMode()) {
                    VcsNotifier.getInstance(project).notifyError(
                            TfPluginBundle.message(TfPluginBundle.KEY_CREATE_BRANCH_DIALOG_FAILED_TITLE),
                            TfPluginBundle.message(
```

### Deprecation
'getService(com.intellij.openapi.project.@org.jetbrains.annotations.NotNull Project, java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
                                logger.info("Finishing: Checking out new branch: " + branchName);
                                final String remoteBranchName = TfGitHelper.getRemoteBranchName(selectedRemoteBranch.getRemote(), branchName);
                                final GitBrancher brancher = ServiceManager.getService(project, GitBrancher.class);
                                // Checkout a new branch from the remote branch that was created on the server and fetched above
                                brancher.checkoutNewBranchStartingFrom(branchName,remoteBranchName,
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.progress.ProgressIndicator'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java

            @Override
            public void startNonCancelableSection() {
            }

```

### Deprecation
'getRemoteBranches()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
        // TODO: add option to retrieve more branches in case the branch they are looking for is missing local
        // only show valid remote branches
        sortedRemoteBranches.addAll(Collections2.filter(gitRepository.getInfo().getRemoteBranches(), remoteBranch -> {
            //  condition: remote must be a vso/tfs remote
            return tfGitRemotes.contains(remoteBranch.getRemote());
```

### Deprecation
'setHyperlinkText(java.lang.@com.intellij.openapi.util.NlsContexts.LinkLabel String, java.lang.@com.intellij.openapi.util.NlsContexts.LinkLabel String, java.lang.@com.intellij.openapi.util.NlsContexts.LinkLabel String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java
        noteLabel.setVisible(false);
        downloadLinkPane.setVisible(false);
        downloadLink.setHyperlinkText(
                TfPluginBundle.message(TfPluginBundle.KEY_TFVC_SETTINGS_LINK_LABEL),
                TfPluginBundle.message(TfPluginBundle.KEY_TFVC_SETTINGS_LINK_TEXT), "");
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java

    private JComponent createCommitsListPane(final Project project, final GitRepository gitRepository,
                                             final GitCommitCompareInfo compareInfo) {
        return new GitCommitListWithDiffPanel(project, compareInfo.getBranchToHeadCommits(gitRepository));
    }
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    }

    private JComponent createDiffPaneBrowser(final Project project, final GitCommitCompareInfo compareInfo) {
        List<Change> diff = compareInfo.getTotalDiff();
        final SimpleChangesBrowser changesBrowser = new  SimpleChangesBrowser(project,diff);
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
                                              @NotNull final String sourceBranchBeingCompared,
                                              @NotNull final String targetBranchBeingCompared,
                                              @NotNull final GitCommitCompareInfo myCompareInfo) {
        final GitRemoteBranch gitRemoteBranch = this.getSelectedRemoteBranch();
        final String currBranch = this.sourceBranch.getText();
```

### Deprecation
'getIcon(java.lang.@org.jetbrains.annotations.NonNls @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/resources/Icons.java`
#### Snippet
```java

    private static Icon load(String path) {
        return IconLoader.getIcon(path);
    }

```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.wm.StatusBarWidget'
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull final PlatformType type) {
        // This class implements the WidgetPresentation needed here
        return this;
```

### Deprecation
'com.intellij.openapi.wm.StatusBarWidget.PlatformType' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/statusBar/BuildWidget.java`
#### Snippet
```java
    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull final PlatformType type) {
        // This class implements the WidgetPresentation needed here
        return this;
```

### Deprecation
'message(java.util.@org.jetbrains.annotations.NotNull ResourceBundle, java.lang.@org.jetbrains.annotations.NotNull String, java.lang.Object @org.jetbrains.annotations.NotNull ...)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/resources/TfPluginBundle.java`
#### Snippet
```java
    public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE_NAME) String key,
                                 @NotNull Object... params) {
        return CommonBundle.message(getBundle(), key, params);
    }

```

### Deprecation
'git4idea.actions.BasicAction' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/extensions/TfvcCheckoutProvider.java`
#### Snippet
```java
    @Override
    public void doCheckout(@NotNull final Project project, final Listener listener) {
        BasicAction.saveAll();

        if (!IdeaHelper.isTFConfigured(project)) {
```

### Deprecation
'saveAll()' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/extensions/TfvcCheckoutProvider.java`
#### Snippet
```java
    @Override
    public void doCheckout(@NotNull final Project project, final Listener listener) {
        BasicAction.saveAll();

        if (!IdeaHelper.isTFConfigured(project)) {
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/extensions/TfvcCheckoutProvider.java`
#### Snippet
```java
        } catch (Throwable t) {
            logger.warn("doCheckout failed unexpectedly", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

### Deprecation
'com.intellij.util.containers.HashMap' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/ServerBrowserDialog.java`
#### Snippet
```java

    private static Map<String, Object> createProperties(final ServerContext serverContext, final String initialPath, final boolean foldersOnly, final boolean canCreateVirtualFolders) {
        final Map<String, Object> properties = new HashMap<String, Object>(4);
        properties.put(PROP_SERVER_CONTEXT, serverContext);
        properties.put(PROP_INITIAL_PATH, initialPath);
```

### Deprecation
'com.intellij.util.containers.HashMap' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
     */
    protected void cacheIdeLocation(final File vstsDirectory, final String currentLocation) {
        final Map<String, String> locationEntries = new HashMap<String, String>();
        final File locationsFile = new File(vstsDirectory, LOCATION_FILE);
        final String ideName = ApplicationNamesInfo.getInstance().getProductName().toLowerCase();
```

### Deprecation
'com.intellij.openapi.components.ApplicationComponent' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
 * Initializes and configures plugin at startup
 */
public class ApplicationStartup implements ApplicationComponent {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);
    private static final String CLASS_EXTENSION = ".class";
```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.components.BaseComponent'
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
    }

    public void disposeComponent() {
    }

```

### Deprecation
Overrides deprecated method in 'com.intellij.openapi.components.BaseComponent'
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
    }

    public void initComponent() {
        // Setup the services that the core plugin components need
        PluginServiceProvider.getInstance().initialize(
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    }

    private GitCommitCompareInfo getCompareInfo(final Project project, final GitRepository gitRepository,
                                                final String source, final String target)
            throws VcsException {
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java

        final Collection<Change> diff = getUtilWrapper().getDiff(project, root, target, source);
        final GitCommitCompareInfo info = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);

        info.put(gitRepository, diff);
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     * @return compare info which contains empty commits and diff lists
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     */
    public GitCommitCompareInfo getEmptyDiff(final GitRepository gitRepository) {
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
```

### Deprecation
'git4idea.util.GitCommitCompareInfo' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
    }

    public GitCommitCompareInfo getBranchCompareInfo(final Project project, final GitRepository gitRepository,
                                                     final String source, final String target)
            throws VcsException {
```

### Deprecation
'readText(java.io.@org.jetbrains.annotations.NotNull InputStream, java.nio.charset.@org.jetbrains.annotations.NotNull Charset)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/EULADialog.java`
#### Snippet
```java
            eulaStream = jarFile.getInputStream(jarFile.getEntry("eula.txt"));

            return StreamUtil.readText(eulaStream, Charsets.UTF_8);
        } catch (IOException e) {
            logger.error("Cannot read EULA text from: " + jarName, e);
```

### Deprecation
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String)' is deprecated
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
            //unexpected error occurred while doing simple checkout
            logger.warn("Azure DevOps commandline checkout failed due to an unexpected error", t);
            VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_TITLE),
                    TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_ERRORS_UNEXPECTED, t.getMessage()));
        }
```

## RuleId[id=FinalStaticMethod]
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
     * @throws ServerPathFormatException when the path cannot be cleaned up.
     */
    public final static String canonicalize(String serverPath, boolean checkForIllegalDollar) throws ServerPathFormatException {
        ArgumentHelper.checkNotNull(serverPath, "serverPath");

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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`StringUtils.isEmpty(autoRefreshText) ? true : Boolean.parseBoolean(autoRefreshText)` can be simplified to 'StringUtils.isEmpty(autoRefreshText) \|\| Boolean.parseBoolean(autoRefreshText)'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabModelImpl.java`
#### Snippet
```java
        // If the value is found, use it. Otherwise default to true;
        String autoRefreshText = PropertyServiceImpl.getInstance().getProperty(propertyStoragePrefix + PROP_AUTO_REFRESH);
        autoRefresh = StringUtils.isEmpty(autoRefreshText) ? true : Boolean.parseBoolean(autoRefreshText);

        // need to create data provider after calling parent class since it passes the class to the provider
```

### SimplifiableConditionalExpression
`file.isDirectory() ? true : needRecursion` can be simplified to 'file.isDirectory() \|\| needRecursion'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSUpdateEnvironment.java`
#### Snippet
```java
            for (final FilePath file : contentRoots) {
                // checks for directories so we know if to perform a recursive update
                needRecursion = file.isDirectory() ? true : needRecursion;
                if (needRecursion)
                    break;
```

### SimplifiableConditionalExpression
`IdeaHelper.isRider() ? VcsHelper.isVstsRepo(project) : true` can be simplified to '!IdeaHelper.isRider() \|\| VcsHelper.isVstsRepo(project)'
in `plugin/src/com/microsoft/alm/plugin/idea/common/extensions/VcsWorkItemContentProvider.java`
#### Snippet
```java
            }

            return IdeaHelper.isRider() ? VcsHelper.isVstsRepo(project) : true;
        }
    }
```

### SimplifiableConditionalExpression
`result == 0 ? true : false` can be simplified to 'result == 0'
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java

        final int result = Messages.showYesNoDialog(project, message, title, okActionMessage, cancelActionMessage, logo);
        return result == 0 ? true : false;
    }

```

### SimplifiableConditionalExpression
`IdeaHelper.isRider() ? VcsHelper.isVstsRepo(project) : true` can be simplified to '!IdeaHelper.isRider() \|\| VcsHelper.isVstsRepo(project)'
in `plugin/src/com/microsoft/alm/plugin/idea/git/extensions/VcsPullRequestContentProvider.java`
#### Snippet
```java
                return false;
            }
            return IdeaHelper.isRider() ? VcsHelper.isVstsRepo(project) : true;
        }
    }
```

### SimplifiableConditionalExpression
`PathFileComparator.PATH_SYSTEM_COMPARATOR.compare(new File(path1), new File(path2)) == 0 ? true : false` can be simplified to 'PathFileComparator.PATH_SYSTEM_COMPARATOR.compare(new File(path1), new File(path2)) == 0'
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     */
    public static boolean areFilePathsSame(final String path1, final String path2) {
        return PathFileComparator.PATH_SYSTEM_COMPARATOR.compare(new File(path1), new File(path2)) == 0 ? true : false;
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public MergeResults() {
        this(Collections.<MergeMapping>emptyList(), Collections.<String>emptyList(), Collections.<String>emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public MergeResults() {
        this(Collections.<MergeMapping>emptyList(), Collections.<String>emptyList(), Collections.<String>emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/external/models/MergeResults.java`
#### Snippet
```java

    public MergeResults() {
        this(Collections.<MergeMapping>emptyList(), Collections.<String>emptyList(), Collections.<String>emptyList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/FeedbackDialog.java`
#### Snippet
```java
                TfPluginBundle.KEY_FEEDBACK_DIALOG_TITLE,
                /* showFeedback */ false,
                Collections.<String, Object>singletonMap(PROP_SMILE, smile));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelDialog.java`
#### Snippet
```java
                TfPluginBundle.message(TfPluginBundle.KEY_TFVC_LABEL_DIALOG_APPLY_LABEL),
                TfPluginBundle.KEY_TFVC_LABEL_DIALOG_TITLE, true,
                Collections.<String, Object>singletonMap(PROP_ITEMS, itemInfos));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
                            StringUtils.substring(output[count], lastIndexName, lastIndexOwner).trim(),
                            StringUtils.substring(output[count], lastIndexComputer).trim(),
                            Collections.<Workspace.Mapping>emptyList());
                    workspaces.add(workspace);
                    count++;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java
        super(project, TfPluginBundle.message(TfPluginBundle.KEY_TFVC_LOCK_DIALOG_TITLE), null,
                TfPluginBundle.KEY_TFVC_LOCK_DIALOG_TITLE, true,
                Collections.<String, Object>singletonMap(PROP_ITEMS, items));


```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/authentication/DeviceFlowResponsePromptDialog.java`
#### Snippet
```java
                TfPluginBundle.message(TfPluginBundle.KEY_DEVICE_FLOW_PROMPT_CONTINUE_BUTTON),
                DEVICE_FLOW_PROMPT_DIALOG_CONTEXT, //feedback context
                false, Collections.<String, Object>emptyMap());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/VsoAuthInfoProvider.java`
#### Snippet
```java
    @Override
    public void getAuthenticationInfoAsync(String serverUri, final AuthenticationInfoCallback callback) {
        final SettableFuture<AuthenticationInfo> authenticationInfoFuture = SettableFuture.<AuthenticationInfo>create();

        // Callback for the Device Flow dialog to cancel the current authenticating process.
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ProxySettingsDialog.java`
#### Snippet
```java
                TfPluginBundle.message(TfPluginBundle.KEY_TFVC_PROXY_DIALOG_OK_BUTTON),
                TfPluginBundle.KEY_TFVC_PROXY_DIALOG_TITLE, true,
                Collections.<String, Object>singletonMap(PROP_PROXY_URI, proxyUri));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        // just set the result without going off to another thread, we should already be in a background task
        SettableFuture<Pair<String, GitCommandResult>> pushResult
                = SettableFuture.<Pair<String, GitCommandResult>>create();

        indicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_CREATE_PR_PUSH_TITLE));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
        emptyCompareInfo.put(gitRepository, Collections.<Change>emptyList());

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
        final GitCommitCompareInfo emptyCompareInfo = new GitCommitCompareInfo(GitCommitCompareInfo.InfoType.BRANCH_TO_HEAD);
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
        emptyCompareInfo.put(gitRepository, Collections.<Change>emptyList());

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
        emptyCompareInfo.put(gitRepository,
                new Pair<List<GitCommit>, List<GitCommit>>(Collections.<GitCommit>emptyList(), Collections.<GitCommit>emptyList()));
        emptyCompareInfo.put(gitRepository, Collections.<Change>emptyList());

        return emptyCompareInfo;
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsErrorTreeNode.java`
#### Snippet
```java

    @Override
    protected void update(final PresentationData presentation) {
        super.update(presentation);
        presentation.addText(message, getErrorAttributes());
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsErrorTreeNode.java`
#### Snippet
```java

    @Override
    public SimpleNode[] getChildren() {
        return NO_CHILDREN;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/CreateVirtualFolderAction.java`
#### Snippet
```java

    @Override
    public void update(final AnActionEvent e) {
        boolean isEnabled = isEnabled(e);
        if (ActionPlaces.isPopupPlace(e.getPlace())) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSUpdateEnvironment.java`
#### Snippet
```java
    @Override
    @NotNull
    public UpdateSession updateDirectories(@NotNull final FilePath[] contentRoots,
                                           final UpdatedFiles updatedFiles,
                                           final ProgressIndicator progressIndicator,
```

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
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesDialog.java`
#### Snippet
```java

    @NotNull
    protected Action[] createActions() {
        return new Action[]{getOKAction(), getHelpAction()};
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java
        return new TfsTreeBuilder(tree, treeModel, new SimpleTreeStructure.Impl(root) {
            @Override
            public boolean isToBuildChildrenInBackground(Object element) {
                return true;
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeBuilder.java`
#### Snippet
```java

            @Override
            public boolean isAlwaysLeaf(Object element) {
                if (element instanceof TfsTreeNode) {
                    return !((TfsTreeNode) element).isDirectory();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java

    @Override
    public Object getData(@NonNls final String dataId) {
        if (KEY.is(dataId)) {
            return this;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeProvider.java`
#### Snippet
```java
    }

    public void doCleanup(final List<VirtualFile> files) {
    }

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
                TfPluginBundle.message(refreshTooltip), AllIcons.Actions.Refresh) {
            @Override
            public void actionPerformed(AnActionEvent anActionEvent) {
                listenerContainer.triggerEvent(this, CMD_REFRESH);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
                AllIcons.General.Add) {
            @Override
            public void actionPerformed(AnActionEvent anActionEvent) {
                listenerContainer.triggerEvent(this, CMD_CREATE_NEW_ITEM);
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public void setSelected(final AnActionEvent e, final boolean state) {
        if (checked != state) {
            checked = state;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public JComponent createCustomComponent(Presentation presentation) {
        final JComponent customComponent = super.createCustomComponent(presentation);
        customComponent.setFocusable(false);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public JComponent createCustomComponent(Presentation presentation) {
        final JComponent customComponent = super.createCustomComponent(presentation);
        customComponent.setFocusable(false);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public void update(AnActionEvent e) {
        super.update(e);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ToolbarToggleButton.java`
#### Snippet
```java

    @Override
    public boolean isSelected(final AnActionEvent e) {
        return checked;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsDialog.java`
#### Snippet
```java
     */
    @Override
    protected Action[] createActions() {
        return new Action[]{getOKAction()};
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
    @NotNull
    @Override
    protected Action[] createLeftSideActions() {
        if (showFeedback) {
            final Action[] actions = new Action[1];
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public List<VcsException> scheduleMissingFileForDeletion(List<? extends FilePath> files) {
        final List<VcsException> errors = new ArrayList<>();

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public List<VcsException> scheduleUnversionedFilesForAddition(final List<? extends VirtualFile> files) {
        final List<VcsException> exceptions = new ArrayList<>();
        try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    }

    public List<VcsException> commit(List<? extends Change> changes, String preparedComment) {
        return commit(changes, preparedComment, FunctionUtil.nullConstant(), null);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    }

    public List<VcsException> commit(List<? extends Change> changes, String preparedComment) {
        return commit(changes, preparedComment, FunctionUtil.nullConstant(), null);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public RefreshableOnComponent createAdditionalOptionsPanel(final CheckinProjectPanel checkinProjectPanel,
                                                               PairConsumer<Object, Object> additionalDataConsumer) {
//        boolean isAffected = false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    @Nullable
    public RefreshableOnComponent createAdditionalOptionsPanel(final CheckinProjectPanel checkinProjectPanel,
                                                               PairConsumer<Object, Object> additionalDataConsumer) {
//        boolean isAffected = false;
//        for (File file : checkinProjectPanel.getFiles()) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
    @Nullable
    public List<VcsException> commit(List<? extends Change> changes,
                                     String preparedComment,
                                     @NotNull NullableFunction<Object, Object> parametersHolder,
                                     Set<? super String> feedback) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java
                                     String preparedComment,
                                     @NotNull NullableFunction<Object, Object> parametersHolder,
                                     Set<? super String> feedback) {
        final List<VcsException> errors = new ArrayList<>();

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCheckinEnvironment.java`
#### Snippet
```java

    @Nullable
    public String getDefaultMessageFor(final FilePath[] filesToCheckin) {
        return null;
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/AuthenticationInfoCallback.java`
#### Snippet
```java
    void onSuccess(final AuthenticationInfo info);

    void onFailure(final Throwable t);
}

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
                final Task.Backgroundable updateAuthTask = new Task.Backgroundable(project, TfPluginBundle.message(TfPluginBundle.KEY_SETTINGS_PASSWORD_MGT_UPDATING)) {
                    @Override
                    public void run(final ProgressIndicator indicator) {
                        logger.info("Updating passwords for user. Selected: " + contexts.size());
                        ServerContextManager.getInstance().updateServerContextsAuthInfo(contexts);
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
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileSystemListener.java`
#### Snippet
```java

    @Override
    public boolean rename(final VirtualFile virtualFile, final String s) throws IOException {
        ourLogger.info(String.format("Renaming file %s to %s", virtualFile.getName(), s));
        return renameOrMove(virtualFile, Path.combine(virtualFile.getParent().getPath(), s));
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileSystemListener.java`
#### Snippet
```java

    @Override
    public void afterDone(final ThrowableConsumer<LocalFileOperationsHandler, IOException> throwableConsumer) {
        // nothing to do
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileSystemListener.java`
#### Snippet
```java
    @Nullable
    @Override
    public File copy(final VirtualFile virtualFile, final VirtualFile virtualFile1, final String s) {
        return null;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileSystemListener.java`
#### Snippet
```java
    @Nullable
    @Override
    public File copy(final VirtualFile virtualFile, final VirtualFile virtualFile1, final String s) {
        return null;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSFileSystemListener.java`
#### Snippet
```java
    @Nullable
    @Override
    public File copy(final VirtualFile virtualFile, final VirtualFile virtualFile1, final String s) {
        return null;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java

    @Override
    public void main(String[] args) {
        logger.debug("Args passed to Azure DevOps to process: {}", Arrays.toString(args));
        try {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java

    @Override
    public void premain(String[] args) {
        if (!checkArguments(args)) {
            System.err.println(getUsageMessage());
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java

    @Override
    public SimpleNode[] getChildren() {
        if (!isDirectory) {
            return NO_CHILDREN;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java

    @Override
    protected void update(final PresentationData presentation) {
        if (isRoot()) {
            //noinspection ConstantConditions
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeNode.java`
#### Snippet
```java
    @NotNull
    @Override
    public Object[] getEqualityObjects() {
        return new Object[]{path};
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/WorkItemQueryDropDown.java`
#### Snippet
```java

        @Override
        public void actionPerformed(final AnActionEvent anActionEvent) {
            if (!this.equals(selectedQuery)) {
                // when new query is selected, the label needs to be updated and the listener has to be made aware of the action
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
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/AddFileToTfIgnoreAction.java`
#### Snippet
```java

    @Override
    public void actionPerformed(AnActionEvent e) {
        ourLogger.info("Performing AddFileToTfIgnoreAction for " + myServerFilePath);

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java

        @Override
        public void projectClosed(final Project project) {
            // nothing to do here
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java

        @Override
        public boolean canCloseProject(final Project project) {
            return true;
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java

        @Override
        public void projectClosing(final Project project) {
            ProjectRepoEventManager.getInstance().triggerServerEvents(EventContextHelper.SENDER_PROJECT_CLOSING, project, null);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ProjectRepoEventManager.java`
#### Snippet
```java
    private static class ProjectEventListener implements ProjectManagerListener {
        @Override
        public void projectOpened(final Project project) {
            ProjectRepoEventManager.getInstance().triggerServerEvents(EventContextHelper.SENDER_PROJECT_OPENED, project, null);
            subscribeToRepoChangeEvents(project);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/CreateBranchForm.java`
#### Snippet
```java
        targetText.getChildComponent().getDocument().addDocumentListener(new DocumentAdapter() {
            @Override
            protected void textChanged(DocumentEvent e) {
                myEventDispatcher.getMulticaster().stateChanged(new ChangeEvent(e));
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java

    @Override
    public void loadState(SettingsState state) {
        this.state = state;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java

    @NotNull
    protected Action[] createActions() {
        lockAction = new LockAction();
        unlockAction = new UnlockAction();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/VcsPullRequestsModel.java`
#### Snippet
```java

                @Override
                public void run(final ProgressIndicator indicator) {
                    final GitPullRequest pullRequest = getSelectedPullRequest();
                    if (pullRequest != null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ProxySettingsForm.java`
#### Snippet
```java
        useProxyRadio.addActionListener(radioButtonListener);
        addressText.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(final DocumentEvent e) {
                myEventDispatcher.getMulticaster().stateChanged();
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelForm.java`
#### Snippet
```java

        nameText.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(final DocumentEvent e) {
                eventDispatcher.getMulticaster().dataChanged(getLabelName(), itemsTableModel.getRowCount());
            }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java

        @Override
        public void actionPerformed(final AnActionEvent anActionEvent) {
            // do nothing if clicked on
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
        this.clickListener = new ClickListener() {
            @Override
            public boolean onClick(MouseEvent event, int clickCount) {
                showDropDownMenu();
                return true;
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsRevisionNumber.java`
#### Snippet
```java

    @Override
    public String asString() {
        return String.valueOf(getValue()) + SEPARATOR + fileName + SEPARATOR + modificationDate;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FormattedTable.java`
#### Snippet
```java

    @Override
    public void setModel(final TableModel model) {
        super.setModel(model);

```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

                    @Override
                    public void onFailure(Throwable t) {
                        notifyPushFailedError(createModel.getProject(), t.getLocalizedMessage());
                    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                }

                public void onFailure(final Throwable thrown) {
                    logger.warn("onFailure in loadDiff", thrown);

```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
                                // if we missed the cache, then show the loading spinner, otherwise
                                // just switch to the diff we have to avoid flickering the screen
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
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TfsFileRevision.java`
#### Snippet
```java

    @Override
    public VcsRevisionNumber getRevisionNumber() {
        return new VcsRevisionNumber.Int(changeset);
    }
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

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public Collection<FilePath> getIncomingFiles(final RepositoryLocation location) {
        return null;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public ChangesBrowserSettingsEditor<ChangeBrowserSettings> createFilterUI(final boolean showDateFilter) {
        return new TFSVersionFilterComponent(showDateFilter);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public boolean isChangeLocallyAvailable(final FilePath filePath,
                                            @Nullable final VcsRevisionNumber localRevision,
                                            final VcsRevisionNumber changeRevision,
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    public boolean isChangeLocallyAvailable(final FilePath filePath,
                                            @Nullable final VcsRevisionNumber localRevision,
                                            final VcsRevisionNumber changeRevision,
                                            final TFSChangeList changeList) {
        return localRevision != null && localRevision.compareTo(changeRevision) >= 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
                                            @Nullable final VcsRevisionNumber localRevision,
                                            final VcsRevisionNumber changeRevision,
                                            final TFSChangeList changeList) {
        return localRevision != null && localRevision.compareTo(changeRevision) >= 0;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java

    @Override
    public List<TFSChangeList> getCommittedChanges(final ChangeBrowserSettings settings,
                                                   final RepositoryLocation location,
                                                   final int maxCount) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java

    @Override
    public RepositoryLocation getForNonLocal(VirtualFile file) {
        return null;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public TFSChangeList readChangeList(final RepositoryLocation location, final DataInput stream) {
        return new TFSChangeList(vcs, stream);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public TFSChangeList readChangeList(final RepositoryLocation location, final DataInput stream) {
        return new TFSChangeList(vcs, stream);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public TFSChangeList readChangeList(final RepositoryLocation location, final DataInput stream) {
        return new TFSChangeList(vcs, stream);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    @Override
    public void loadCommittedChanges(final ChangeBrowserSettings settings,
                                     final RepositoryLocation location,
                                     final int maxCount,
                                     final AsynchConsumer<? super CommittedChangeList> consumer) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
                                     final RepositoryLocation location,
                                     final int maxCount,
                                     final AsynchConsumer<? super CommittedChangeList> consumer) {
        // TODO: (JetBrains) if revision and date filters are both set, which one should have priority?
        VersionSpec versionFrom = VersionSpec.create(1);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public ChangeListColumn<?>[] getColumns() {
        return new ChangeListColumn<?>[]{new ChangeListColumn.ChangeListNumberColumn(
                TfPluginBundle.message(TfPluginBundle.KEY_TFVC_REPOSITORY_VIEW_COLUMN_REVISION)), ChangeListColumn.NAME,
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public void writeChangeList(final DataOutput stream, final TFSChangeList list) throws IOException {
        list.writeToStream(stream);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java

    @Nullable
    public VcsCommittedViewAuxiliary createActions(final DecoratorManager manager, final RepositoryLocation location) {
        return null;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    @Override
    @Nullable
    public RepositoryLocation getLocationFor(final FilePath root) {
        if (!TFVCUtil.isFileUnderTFVCMapping(project, root)) {
            return null;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/TFSVersionFilterComponent.java`
#### Snippet
```java
    }

    protected void initValues(final ChangeBrowserSettings settings) {
        super.initValues(settings);
        useAuthorFilter.setSelected(settings.USE_USER_FILTER);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/TFSVersionFilterComponent.java`
#### Snippet
```java
    }

    public void saveValues(final ChangeBrowserSettings settings) {
        super.saveValues(settings);
        settings.USER = authorField.getText();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/TFSVersionFilterComponent.java`
#### Snippet
```java
    }

    public JComponent getComponent() {
        return getPanel();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/TFSVersionFilterComponent.java`
#### Snippet
```java
    }

    protected void installCheckBoxListener(final ActionListener filterListener) {
        super.installCheckBoxListener(filterListener);
        useAuthorFilter.addActionListener(filterListener);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
    /**
     * @return the presentable string for server name (the URL without URL escaping applied). For example, URL
     * "http://tfs/collection%20name" will be presented here as "http://tfs/collection name".
     */
    public String getServerDisplayName() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
    /**
     * @return the presentable string for server name (the URL without URL escaping applied). For example, URL
     * "http://tfs/collection%20name" will be presented here as "http://tfs/collection name".
     */
    public String getServerDisplayName() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindWorkspaceCommand.java`
#### Snippet
```java
     * Parses the output of the workfold command. (NOT XML)
     * SAMPLE
     * Access denied connecting to TFS server https://organization.visualstudio.com/ (authenticating as Personal Access Token)  <-- line is optional
     * =====================================================================================================================================================
     * Workspace:  MyNewWorkspace2
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindWorkspaceCommand.java`
#### Snippet
```java
     * =====================================================================================================================================================
     * Workspace:  MyNewWorkspace2
     * Collection: http://java-tfs2015:8081/tfs/
     * $/tfsTest_01: D:\tmp\test
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
     * Parses output for the workspace attributes
     * <p>
     * tf workspaces -format:detailed -collection:http://organization.visualstudio.com/ WorkspaceName
     * ===========================================================================================================================================================================================================
     * Workspace:   WorkspaceName
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
     * Computer:    computerName
     * Comment:     Workspace created through IntelliJ
     * Collection:  http://organization.visualstudio.com/
     * Permissions: Private
     * File Time:   Current
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * local workspaces that were created on the local machine
     * <p>
     * Collection: https://account3.visualstudio.com/
     * Workspace      Owner      Computer     Comment
     * -------------- ---------- ------------ ------------------------------------------------------------------------------------------------------------------------------------------------
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * TFVC_11dfdfdf  John Smith computerName Workspace created through IntelliJ
     * <p>
     * Collection: https://demo.visualstudio.com/
     * Workspace Owner      Computer     Comment
     * --------- ---------- ------------ ---------------------------------------------------------------------------------------------------------------------------------------------------
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
     * <p/>
     * name restrictions for TFS:
     * https://go.microsoft.com/fwlink/?LinkId=77936
     *
     * @param gitUrl    git fetch/push url
```

### JavadocLinkAsPlainText
Link specified as plain text
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    /**
     * Removes any user information from an URL, e.g. will remove the "username@" part from the URL
     * "https://username@dev.azure.com/".
     */
    public static String removeUserInfo(final String url) {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/external/commands/CreateBranchCommand.java`
#### Snippet
```java
    public static final Logger logger = LoggerFactory.getLogger(CreateBranchCommand.class);

    private static String BRANCH_EXISTS_ERROR = "An error occurred: The item %s already exists.";

    private final String workingFolder;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesForm.java`
#### Snippet
```java
    private JPanel workspacesPanel;
    private JButton reloadWorkspacesButton;
    private boolean isShowWorkspaces = true;
    private final EventDispatcher<Listener> eventDispatcher = EventDispatcher.create(Listener.class);
    private final ContentProvider<Object> contentProvider;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/FeedbackAction.java`
#### Snippet
```java

    private final Project project;
    private final String feedbackContextInfo;
    private static final String URL_PRIVACY_POLICY = "https://go.microsoft.com/fwlink/?LinkID=277167"; // This is the same URL used by Visual Studio Send a Smile

```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/SearchFilter.java`
#### Snippet
```java
 */
public class SearchFilter extends JPanel {
    private final JLabel filerLabel;
    private final SearchTextField searchField;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/MergeNameDialog.java`
#### Snippet
```java
    private final String myLocalName;
    private final String myServerName;
    private final Project myProject;

    public MergeNameDialog(final String yourName, String theirsName, Project project) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(ServerContextManager.class);

    private final String CONNECTION_DATA_REST_API_PATH = "/_apis/connectionData?connectOptions=IncludeServices&lastChangeId=-1&lastChangeId64=-1&api-version=1.0";
    private final String TFS2015_NEW_SERVICE = "distributedtask";

```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java

    private final String CONNECTION_DATA_REST_API_PATH = "/_apis/connectionData?connectOptions=IncludeServices&lastChangeId=-1&lastChangeId64=-1&api-version=1.0";
    private final String TFS2015_NEW_SERVICE = "distributedtask";

    private Map<String, ServerContext> contextMap = new HashMap<String, ServerContext>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
    private JPanel changesToMergePanel;
    private final Project project;
    private final ServerContext serverContext;
    //private final SelectRevisionForm mySelectRevisionForm;
    //private final JTable myChangesetsTable;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTreeModel.java`
#### Snippet
```java

public class PullRequestsTreeModel extends DefaultTreeModel implements FilteredModel {
    private final PRTreeNode root;
    private final PRTreeNode requestedByMeRoot;
    private final PRTreeNode assignedToMeRoot;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelForm.java`
#### Snippet
```java
    }

    private final Project project;
    private final List<ItemInfo> itemInfos;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/authentication/facades/VsoAuthInfoProvider.java`
#### Snippet
```java

    private final SecretStore<TokenPair> accessTokenStore;
    private final SecretStore<Token> tokenStore;
    private final DeviceFlowResponsePrompt deviceFlowResponsePrompt;
    private final VstsPatAuthenticator vstsPatAuthenticator;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageImpl.java`
#### Snippet
```java

public class LoginPageImpl extends JPanel implements LoginPage {
    private final String DATA_FORM = "dataForm";
    private final String LOGIN_FORM = "loginForm";
    private final BasicForm dataForm;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageImpl.java`
#### Snippet
```java
public class LoginPageImpl extends JPanel implements LoginPage {
    private final String DATA_FORM = "dataForm";
    private final String LOGIN_FORM = "loginForm";
    private final BasicForm dataForm;
    private final LoginForm loginForm;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PRTreeCellRenderer.java`
#### Snippet
```java
    private final static short REVIEWER_VOTE_REJECTED = -10;

    private PRTreeNodeForm prViewForm;

    public PRTreeCellRenderer() {
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `onBeforeBatch()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSRepositoryLocation.java`
#### Snippet
```java

    @Override
    public void onBeforeBatch() throws VcsException {
    }

```

### RedundantMethodOverride
Method `onAfterBatch()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSRepositoryLocation.java`
#### Snippet
```java

    @Override
    public void onAfterBatch() {
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

### RedundantMethodOverride
Method `isCellEditable()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java

    @Override
    public boolean isCellEditable(final int rowIndex, final int columnIndex) {
        return false;
    }
```

### RedundantMethodOverride
Method `isCellEditable()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java

    @Override
    public boolean isCellEditable(final int rowIndex, final int columnIndex) {
        return false;
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
Method `getZipper()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java

    @Nullable
    public VcsCommittedListsZipper getZipper() {
        return null;
    }
```

### RedundantMethodOverride
Method `supportsIncomingChanges()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java

    @Override
    public boolean supportsIncomingChanges() {
        return true;
    }
```

### RedundantMethodOverride
Method `isMaxCountSupported()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public boolean isMaxCountSupported() {
        return true;
    }
```

### RedundantMethodOverride
Method `refreshCacheByNumber()` is identical to its super method
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSCommittedChangesProvider.java`
#### Snippet
```java
    }

    public boolean refreshCacheByNumber() {
        return true;
    }
```

## RuleId[id=UnusedReceiverParameter]
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
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
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
    get() = if (itemType == ItemType.FILE) encodingName else null

private val ExtendedItem.lockStatus
    get() = lockLevel.toUIString()

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
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

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
        else encoding?.name

private val ExtendedItem.fileEncodingName
    get() = if (itemType == ItemType.FILE) encodingName else null

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
        else pendingChange.toUIString(false, this)

private val ExtendedItem.itemTypeName
    get() = itemType.toUIString()

```

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

## RuleId[id=MemberVisibilityCanBePrivate]
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

## RuleId[id=NullArgumentToVariableArgMethod]
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `plugin/src/com/microsoft/alm/common/artifact/GitRefArtifactID.java`
#### Snippet
```java
        if (components.length > 3) {
            for (int index = 3; index < components.length; index++) {
                refName = refName + URI_SEPARATOR + components[index];
            }
        }
```

## RuleId[id=UnusedAssignment]
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
Variable `wasWorkItemAssociated` initializer `false` is redundant
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java

                        // check if branch creation succeeded before associating the work item to it
                        boolean wasWorkItemAssociated = false;
                        if (wasBranchCreated) {
                            wasWorkItemAssociated = createWorkItemBranchAssociation(context, branchName, workItem.getId());
```

## RuleId[id=ConstantValue]
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
Value `hasNotifiedUser` is always 'true'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
            hasNotifiedUser = true;
        }
        return hasNotifiedUser;
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

## RuleId[id=SuspiciousNameCombination]
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

## RuleId[id=RedundantLengthCheck]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'setModelForView(T)' as a member of raw type 'com.microsoft.alm.plugin.idea.common.ui.common.tabs.TabForm'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabImpl.java`
#### Snippet
```java

    public void setViewModel(final T modelView) {
        form.setModelForView(modelView);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/external/models/SyncResults.java`
#### Snippet
```java
     */
    public SyncResults() {
        this(false, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/external/models/SyncResults.java`
#### Snippet
```java
     */
    public SyncResults() {
        this(false, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/external/models/SyncResults.java`
#### Snippet
```java
     */
    public SyncResults() {
        this(false, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/external/models/SyncResults.java`
#### Snippet
```java
     */
    public SyncResults() {
        this(false, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'com.microsoft.alm.plugin.idea.common.ui.common.treetable.ContentProvider'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesDialog.java`
#### Snippet
```java
    protected JComponent createCenterPanel() {
        if (manageWorkspacesForm == null) {
            manageWorkspacesForm = new ManageWorkspacesForm((ContentProvider<Object>) getProperty(PROP_CONTEXT_PROVIDER));
            manageWorkspacesForm.setShowWorkspaces(true);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'setViewModel(T)' as a member of raw type 'com.microsoft.alm.plugin.idea.common.ui.common.tabs.Tab'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java
        }
        if (arg == null) {
            tab.setViewModel(model.getModelForView());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'setRenderer(ListCellRenderer)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchForm.java`
#### Snippet
```java
        if (!this.initialized) {
            // override the renderer so it doesn't show the object toString but instead shows the branch name
            remoteBranchComboBox.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchForm.java`
#### Snippet
```java
    public void setRemoteBranchDropdownModel(final ComboBoxModel model) {
        if (model != null) {
            remoteBranchComboBox.setModel(model);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ApplyLabelDialog.java`
#### Snippet
```java
    @Nullable
    protected JComponent createCenterPanel() {
        form = new ApplyLabelForm(this.getProject(), (List<ItemInfo>) getProperty(PROP_ITEMS));
        setOkEnabled(false);

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Hashtable'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
            final String key = repoName.concat(accountUrl).toLowerCase();
            if (!contextTable.containsKey(key) && !deleteContexts.contains(context)) {
                contextTable.put(key, context);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: 'contextTable' has raw type, so result of values is erased
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
        }
        tableModel.clearRows();
        tableModel.addServerContexts(new ArrayList<ServerContext>(contextTable.values()));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        sourceText.getTextField().addFocusListener(mySourceFieldFocusListener);

        targetCombo.setModel(new DefaultComboBoxModel());
//    targetCombo.setRenderer(new DefaultListCellRenderer() {
//      public Component getListCellRendererComponent(final JList list,
```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        });

        changesTypeCombo.setModel(new DefaultComboBoxModel(ChangesType.values()));

        changesTypeCombo.addActionListener(new ActionListener() {
```

### UNCHECKED_WARNING
Unchecked call to 'DefaultComboBoxModel(E\[\])' as a member of raw type 'javax.swing.DefaultComboBoxModel'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
        });

        changesTypeCombo.setModel(new DefaultComboBoxModel(ChangesType.values()));

        changesTypeCombo.addActionListener(new ActionListener() {
```

### UNCHECKED_WARNING
Unchecked call to 'addElement(E)' as a member of raw type 'javax.swing.DefaultComboBoxModel'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/MergeBranchForm.java`
#### Snippet
```java
            ((DefaultComboBoxModel) targetCombo.getModel()).removeAllElements();
            for (final String targetBranch : targetBranches) {
                ((DefaultComboBoxModel) targetCombo.getModel()).addElement(targetBranch);
            }
            //mySelectRevisionForm.init(project, myWorkspace, sourceText.getText(), mySourceIsDirectory);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.microsoft.alm.plugin.idea.tfvc.ui.management.ManageWorkspacesModel.ServerWorkspaceContentProvider' to 'com.microsoft.alm.plugin.idea.common.ui.common.treetable.ContentProvider'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
    public ManageWorkspacesModel(final Project project) {
        this.project = project;
        this.contentProvider = new ServerWorkspaceContentProvider();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsDialog.java`
#### Snippet
```java
    @Nullable
    protected JComponent createCenterPanel() {
        form = new LockItemsForm((List<ExtendedItemInfo>) getProperty(PROP_ITEMS));
        form.addListener(new LockItemsTableModel.Listener() {
            public void selectionChanged() {
```

### UNCHECKED_WARNING
Unchecked call to 'setRenderer(ListCellRenderer)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    private void createUIComponents() {
        this.targetBranchDropdown = new JComboBox();
        this.targetBranchDropdown.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list,
```

### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestForm.java`
#### Snippet
```java
    public void setTargetBranchDropdownModel(ComboBoxModel model) {
        if (model != null) {
            this.targetBranchDropdown.setModel(model);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'addItem(E)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceForm.java`
#### Snippet
```java
    public void setLocation(final Workspace.Location locationOption) {
        this.location.removeAllItems(); // clear previous item since we only have one item in there with it disabled
        this.location.addItem(locationOption);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'addItem(E)' as a member of raw type 'javax.swing.JComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceForm.java`
#### Snippet
```java
            computer.setText(loadingMessage);
            location.setEnabled(false); // always disabled
            location.addItem(loadingMessage);
        } else {
            name.setEnabled(true);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.intellij.util.ui.ColumnInfo\[\]' to 'com.intellij.util.ui.ColumnInfo\[\]'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
                        mapping.isCloaked() ? MappingType.CLOAKED : MappingType.MAPPED));
            }
            setModel(new ColumnInfo[]{new MappingTypeColumn(), new ServerPathColumn(project, serverContext), new LocalPathColumn(project)}, rows);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ComboBox(ComboBoxModel, int)' as a member of raw type 'com.intellij.openapi.ui.ComboBox'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceMappingsTableEditor.java`
#### Snippet
```java
                    final ComboBoxModel model = new EnumComboBoxModel<MappingType>(MappingType.class);
                    model.setSelectedItem(value);
                    myCombo = new ComboBox(model, getWidth(table));
                    return myCombo;
                }
```

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=DataFlowIssue]
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
Method invocation `concat` may produce `NullPointerException`
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static URI getFileURI(final String remoteUrl, final String filePath, final String gitRemoteBranchName) {
        String uri = getHttpsGitUrlFromSshUrl(remoteUrl).concat(URL_PATH_SEGMENT).concat(filePath);

        if (uri == null) {
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
Argument `localPathFromTfsRepresentation(localPath)` might be null
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/VersionControlPath.java`
#### Snippet
```java

    public static File getFile(String localPath) {
        return new File(localPathFromTfsRepresentation(localPath));
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
Argument `latestServerContext` might be null
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java

            // Get the actual work items
            doLookup(latestServerContext, (WitInputs) inputs);

            // let listeners know that we are done
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
        if (info == null) {
            forget(key);
            logger.warn("getServerContextSecrets: info was null for key: ", key);
            return null;
        }
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=KotlinConstantConditions]
### KotlinConstantConditions
'when' branch is never reachable
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
        try {
            getWorkspace(path.workspace, ".")
```

### KotlinConstantConditions
'when' branch is never reachable
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
fun TfsPath.toCanonicalPathString(): String = when (this) {
    is TfsLocalPath -> LocalPath.canonicalize(path)
    is TfsServerPath -> path
    else -> throw Exception("Unknown path type: $this")
}
```

### KotlinConstantConditions
Condition 'workspace == null' is always false
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
    private fun enumeratePathsWithWorkspace(paths: Iterable<TfsPath>, action: (Workspace, List<TfsPath>) -> Unit) {
        for ((workspace, workspacePathList) in paths.groupBy(::getWorkspaceFor)) {
            if (workspace == null) {
                logger.warn { "Could not determine workspace for paths: " + paths.joinToString() }
                continue
```

### KotlinConstantConditions
Condition 'changedItems == 1' is always false
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
        logger.info { "pendRename result: $changedItems" }

        return changedItems == 1
    }
}
```

### KotlinConstantConditions
Condition 'serverUri == null' is always false
in `client/backend/src/main/kotlin/com/microsoft/tfs/TfsClient.kt`
#### Snippet
```java
            val serverUri = workspaceInfo.serverURI
            val workspaceName = workspaceInfo.name.orEmpty()
            if (serverUri == null) {
                logger.warn { "Server URI is null for workspace ${workspaceName}; no mappings will be available." }
                return emptyList()
```

### KotlinConstantConditions
'when' branch is never reachable
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
    else -> throw Exception("Unknown path type: $path")
}
```

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=RedundantCollectionOperation]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/external/commands/CreateWorkspaceCommand.java`
#### Snippet
```java
        if (StringUtils.isNotEmpty(comment)) {
            builder.addSwitch("comment", comment);
        }
        if (fileTime != null) {
            builder.addSwitch("filetime", fileTime.toString());
        }
        if (permission != null) {
            builder.addSwitch("permission", permission.toString());
        }

        return builder;
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetLabelsCommand.java`
#### Snippet
```java
                final Element label = (Element) nodes.item(i);

                // Read comment element
                final NodeList commentNodes = label.getElementsByTagName("comment");
                final String comment;
                if (commentNodes.getLength() == 1) {
                    comment = commentNodes.item(0).getTextContent();
                } else {
                    comment = "";
                }
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutController.java`
#### Snippet
```java
        final ValidationInfo result;

        final ModelValidationInfo error;
        if (model.hasErrors()) {
            //We will display first relevant error only
            error = model.getErrors().get(0);
        } else {
            error = pageModel.validate();
        }

        if (error != null) {
            final JComponent errorSource = model.isVsoSelected() ?
                    vsoController.getComponent(error.getValidationSource()) : tfsController.getComponent(error.getValidationSource());
            result = new ValidationInfo(error.getValidationMessage(), errorSource);
        } else {
            result = null;
        }

        return result;
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
            repositoryFilter.setActionCommand(CMD_REPO_FILTER_CHANGED);
            refreshButton.setActionCommand(CMD_REFRESH);

            // Fix HiDPI scaling for table
            SwingHelper.scaleTableRowHeight(repositoryTable);

            // Fix tabbing in table
            SwingHelper.fixTabKeys(repositoryTable);
            repositoryTable.addFocusListener(new TableFocusListener(repositoryTable));

            // Set help text and popup text
            helpPanel.addPopupCommand(TfPluginBundle.message(TfPluginBundle.KEY_VSO_LOOKUP_HELP_ENTER_URL), CMD_GOTO_TFS);
            helpPanel.addPopupCommand(TfPluginBundle.message(TfPluginBundle.KEY_VSO_LOOKUP_HELP_VIEW_ACCOUNTS), CMD_GOTO_SPS_PROFILE);
            helpPanel.setVisible(false); // Don't show this help panel until we know if it's vs.com
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
            final int refreshButtonHeight = (int) refreshButton.getMinimumSize().getHeight();
            final Dimension size = new Dimension(refreshButtonHeight, refreshButtonHeight);
            refreshButton.setMinimumSize(size);
            refreshButton.setPreferredSize(size);
            busySpinner.setMinimumSize(size);
            busySpinner.setPreferredSize(size);

            // Setup document events for filter
            // Using a timer so that we don't respond to every character typed
            // The timer is created in the create components method
            repositoryFilter.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(final DocumentEvent e) {
                    onFilterChanged();
                }

                @Override
                public void removeUpdate(final DocumentEvent e) {
                    onFilterChanged();
                }

                @Override
                public void changedUpdate(final DocumentEvent e) {
                    onFilterChanged();
                }

                private void onFilterChanged() {
                    if (timer.isRunning()) {
                        timer.restart();
                    } else {
                        timer.start();
                    }
                }
            });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
        repositoryTable.setModel(tableModel);
        repositoryTable.setSelectionModel(selectionModel);

        // Setup table sorter
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        repositoryTable.setRowSorter(sorter);

        // Attach an index converter to fix the indexes if the user sorts the list
        tableModel.setSelectionConverter(new TableModelSelectionConverter() {
            @Override
            public int convertRowIndexToModel(int viewRowIndex) {
                if (viewRowIndex >= 0) {
                    return repositoryTable.convertRowIndexToModel(viewRowIndex);
                }

                return viewRowIndex;
            }
        });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        workItemsTable.setRowSorter(sorter);

        // Attach an index converter to fix the indexes if the user sorts the list
        tableModel.setSelectionConverter(new TableModelSelectionConverter() {
            @Override
            public int convertRowIndexToModel(int viewRowIndex) {
                if (viewRowIndex >= 0) {
                    return workItemsTable.convertRowIndexToModel(viewRowIndex);
                }

                return viewRowIndex;
            }
        });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
            final String parentDirectory = getParentDirectory();
            if (parentDirectory == null || parentDirectory.isEmpty()) {
                return ModelValidationInfo.createWithResource(PROP_PARENT_DIR,
                        TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_PARENT_DIR_EMPTY);
            }

            final File parentDirectoryOnDisk = new File(parentDirectory);
            if (!parentDirectoryOnDisk.exists()) {
                return ModelValidationInfo.createWithResource(PROP_PARENT_DIR,
                        TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_PARENT_DIR_NOT_FOUND);
            }

            // We test this method and so we need to check to see if we are in IntelliJ before using VirtualFileManager
            // ApplicationManager is null if we are not in IntelliJ
            if (ApplicationManager.getApplication() != null) {
                final VirtualFile destinationParent = LocalFileSystem.getInstance().findFileByPath(parentDirectory);
                if (destinationParent == null) {
                    return ModelValidationInfo.createWithResource(PROP_PARENT_DIR,
                            TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_PARENT_DIR_NOT_FOUND);
                }
            }
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutPageModelImpl.java`
#### Snippet
```java
            final String directoryName = getDirectoryName();
            if (directoryName == null || directoryName.isEmpty()) {
                return ModelValidationInfo.createWithResource(PROP_DIRECTORY_NAME,
                        TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_DIR_NAME_EMPTY);
            }

            final File destDirectoryOnDisk = new File(parentDirectory, directoryName);
            //verify the destination directory does not exist
            if (destDirectoryOnDisk.exists() && destDirectoryOnDisk.isDirectory()) {
                return ModelValidationInfo.createWithResource(PROP_DIRECTORY_NAME,
                        TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_DESTINATION_EXISTS, directoryName);
            }
            //verify destination directory parent exists, we can reach this condition if user specifies a path for directory name
            if (destDirectoryOnDisk.getParentFile() == null || !destDirectoryOnDisk.getParentFile().exists()) {
                return ModelValidationInfo.createWithResource(PROP_DIRECTORY_NAME,
                        TfPluginBundle.KEY_CHECKOUT_DIALOG_ERRORS_DIR_NAME_INVALID,
                        directoryName, destDirectoryOnDisk.getParent());
            }
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsForm.java`
#### Snippet
```java
        contextTable.setModel(tableModel);
        contextTable.setSelectionModel(selectionModel);

        // Setup table sorter
        final RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
        contextTable.setRowSorter(sorter);

        // Attach an index converter to fix the indexes if the user sorts the list
        tableModel.setSelectionConverter(new TableModelSelectionConverter() {
            @Override
            public int convertRowIndexToModel(int viewRowIndex) {
                if (viewRowIndex >= 0) {
                    return contextTable.convertRowIndexToModel(viewRowIndex);
                }
                return viewRowIndex;
            }
        });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
        searchFilter.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(final DocumentEvent e) {
                onFilterChanged();
            }

            @Override
            public void removeUpdate(final DocumentEvent e) {
                onFilterChanged();
            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                onFilterChanged();
            }

            private void onFilterChanged() {
                if (timer.isRunning()) {
                    timer.restart();
                } else {
                    timer.start();
                }
            }
        });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsForm.java`
#### Snippet
```java
        workItemsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                //double click
                if (mouseEvent.getClickCount() == 2) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                } else if (mouseEvent.isPopupTrigger() || ((mouseEvent.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)) {
                    //right click, show pop up
                    showPopupMenu(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY(), listener);
                }
            }
        });

        //keyboard listener
        workItemsTable.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
                    triggerEvent(CMD_OPEN_SELECTED_ITEM_IN_BROWSER);
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/VcsWorkItemsModel.java`
#### Snippet
```java
        final HashMap<String, Object> attributes = new HashMap<String, Object>();
        attributes.put(LINK_NAME_KEY, LINK_NAME_VALUE);

        // create link object to add to the work item
        final Link link = new Link();
        link.setUrl(gitRefArtifactID.encodeURI());
        link.setTitle(StringUtils.EMPTY);
        link.setRel(ARTIFACT_LINK_RELATION);
        link.setAttributes(attributes);

        // create the operation that will add the link to the work item
        final JsonPatchOperation operation = new JsonPatchOperation();
        operation.setOp(com.microsoft.visualstudio.services.webapi.patch.Operation.ADD);
        operation.setPath(RELATIONS_PATH);
        operation.setValue(link);

        final JsonPatchDocument doc = new JsonPatchDocument();
        doc.add(operation);
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/BranchAction.java`
#### Snippet
```java
            final ServerContext serverContext = actionContext.getServerContext();
            final Project project = actionContext.getProject();
            final String sourceServerPath = actionContext.getItem().getServerItem();
            final boolean isFolder = actionContext.getItem().isFolder();
            final String workingFolder = isFolder ?
                    actionContext.getItem().getLocalItem() :
                    Path.getDirectoryName(actionContext.getItem().getLocalItem());
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceModel.java`
#### Snippet
```java
                logger.info("loadWorkspace: getting server context");
                currentServerContext = ServerContextManager.getInstance().createContextFromTfvcServerUrl(
                        URI.create(repositoryContext.getUrl()),
                        repositoryContext.getTeamProjectName(),
                        true);
                if (currentServerContext == null) {
                    logger.warn("loadWorkspace: Could not get the context for the repository. User may have canceled.");
                    throw new NotAuthorizedException(TfPluginBundle.message(TfPluginBundle.KEY_WORKSPACE_DIALOG_ERRORS_AUTH_FAILED, repositoryContext.getUrl()));
                }
```

### DuplicatedCode
Duplicated code
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size(); i++) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(get(i));
            }
            return sb.toString();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java

        // parse the exception to get individual exceptions instead of 1 large one
        exceptions.addAll(parseException(stderr));

        // parse output for file changes
```

## RuleId[id=UnnecessaryToStringCall]
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
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
    public static URI resolveEndpointUri(URI baseUri, String endpointPath) {
        if (!baseUri.getPath().endsWith("/")) {
            baseUri = createUri(baseUri.toString() + "/");
        }

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
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
    public static String getTokenDescription(final String emailAddress) {
        final String tokenDescription = String.format(TOKEN_DESCRIPTION_FORMATTER,
                emailAddress, SystemHelper.getComputerName(), new Date().toString());

        return tokenDescription;
```

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `HelpIdeTooltip` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/HelpPanel.java`
#### Snippet
```java
    }

    private class HelpIdeTooltip extends IdeTooltip {
        private boolean showing = false;

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
Inner class `WitResults` may be 'static'
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
    }

    public class WitResults extends ResultsImpl {
        private final List<WorkItem> workItems;
        private final ServerContext context;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/FileHelper.java`
#### Snippet
```java
        } else if (System.getProperty(FORCE_HONOR_CASE_SYSPROP) != null) {
            fileSystemIgnoresCase = false;
        } else if (Platform.isWindows() || Platform.isMac()) {
            fileSystemIgnoresCase = true;
        } else {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     */
    private static boolean doesChangeSetHaveChanges(final List<ChangeSet> changeSets, final int index) {
        if (changeSets == null
                || index >= changeSets.size()
                || changeSets.get(index).getChanges() == null
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
            return false;
        }
        if (!StringUtils.equals(this.server, workspace.server)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java

    private static boolean isToolSpecificIDWellFormed(final String toolSpecificId) {
        if (isNullOrEmpty(toolSpecificId)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         * artifact type cannot contain forward slashes
         */
        if (artifactType.indexOf(URI_SEPARATOR) != -1) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/artifact/ArtifactID.java`
#### Snippet
```java
         * must be non-zero length
         */
        if ((tool.indexOf('\\') != -1) || (tool.indexOf(URI_SEPARATOR) != -1) || (tool.indexOf('.') != -1)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
        if (changeSetDate != null ? !changeSetDate.equals(that.changeSetDate) : that.changeSetDate != null)
            return false;
        if (workspaceName != null ? !workspaceName.equals(that.workspaceName) : that.workspaceName != null)
            return false;

```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTreeModel.java`
#### Snippet
```java

        // filter on the data shown in the node view
        if (StringUtils.containsIgnoreCase(pr.getTitle(), filter) ||
                StringUtils.containsIgnoreCase(pr.getCreatedBy().getDisplayName(), filter) ||
                StringUtils.containsIgnoreCase(String.valueOf(pr.getPullRequestId()), filter) ||
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
        if (uri != null && uri.getHost() != null) {
            final String host = uri.getHost().toLowerCase();
            if (StringUtils.endsWith(host, HOST_VSO) ||
                    StringUtils.endsWith(host, HOST_TFS_ALL_IN) ||
                    UrlHelper.isOrganizationHost(host)) {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            // ssh://account@organization.visualstudio.com:22/Collection/_git/Repo
            // account@organization.visualstudio.com:22/Collection/_git/Repo
            if (StringUtils.contains(gitRemoteUrl, "@")) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static boolean isOrganizationHost(final String host) {
       if (StringUtils.equalsIgnoreCase(host, HOST_AZURE) ||
               StringUtils.endsWithIgnoreCase(host, HOST_AZURE_ORG)) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java

    public static boolean isTeamServicesUrl(final String url) {
        if (StringUtils.containsIgnoreCase(url, HOST_VSO) ||
                StringUtils.containsIgnoreCase(url, HOST_TFS_ALL_IN) ||
                UrlHelper.isOrganizationUrl(url)) {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/common/utils/UrlHelper.java`
#### Snippet
```java
            // or "_git" must be the n-2 segment for a limited ref url, and n-1 segment is either "_optimized" or "_full"
            final String thirdToLastSegment = segments[segments.length - 3];
            if (URL_GIT_PATH_SEGMENT.equals(thirdToLastSegment)
                    && (URL_OPTIMIZED_REF_PATH_SEGMENT.equals(secondToLastSegment) || URL_FULL_REF_PATH_SEGMENT.equals(secondToLastSegment))) {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/LockItemsTableModel.java`
#### Snippet
```java
                if (currentLevel == LockCommand.LockLevel.NONE && selectIfNone) {
                    item.selected = true;
                } else if (currentLevel != LockCommand.LockLevel.NONE && !selectIfNone) {
                    item.selected = true;
                } else {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
        }

        if (serverItem.charAt(i - 1) == '.' || Character.isWhitespace(serverItem.charAt(i - 1))) {
            // It is not legal to end a path part with whitespace or a dot.
            return false;
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java
            // compare,
            // then it is a child.
            if (ServerPath.isSeparator(possibleChild.charAt(parentPath.length()))) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/versioncontrol/path/ServerPath.java`
#### Snippet
```java

        // Check the last path part.
        if (!isCanonicalizedPathPart(serverItem, serverItem.length(), pathPartLength)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/OpenFileInBrowserAction.java`
#### Snippet
```java

        final Change change = changeListManager.getChange(vFile);
        if (change != null && change.getType() == Change.Type.NEW) {
            // a new file that has not yet been checked in
            return false;
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java

        final String remoteUrl = gitRemote.getFirstUrl();
        if (remoteUrl != null
            && (remoteUrl.contains(".visualstudio.com/")
                || remoteUrl.contains(".azure.com/")
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
        if (StringUtils.endsWith(line, ":")) {
            // File paths are different on different OSes
            if (StringUtils.containsAny(line, "\\/")) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
        final GitLocalBranch sourceBranch = this.getSourceBranch();
        if (changesContainer.getSourceBranchName() != null && sourceBranch != null) {
            if (!changesContainer.getSourceBranchName().equals(sourceBranch.getName())) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
    public static boolean isDeviceFlowEnvSetTrue() {
        final String property = System.getProperty(DEVICE_FLOW_PROPERTY, StringUtils.EMPTY);
        if (StringUtils.isNotEmpty(property) && StringUtils.equals(ENABLE_DEVICE_FLOW_VALUE, property)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
        }

        if (throwable != null && throwable.getCause() != null && (throwable.getCause() instanceof NotAuthorizedException ||
                (throwable.getCause() instanceof VssServiceResponseException &&
                        (StringUtils.containsIgnoreCase(throwable.getMessage(), "unauthorized"))))) {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportForm.java`
#### Snippet
```java

        // show the helpPanel if the server is a VSO server
        if (!userAccountPanel.isWindowsAccount() || UrlHelper.isTeamServicesUrl(name)) {
            helpPanel.setVisible(true);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java

        // show the helpPanel if the server is a VSO server
        if (!userAccountPanel.isWindowsAccount() || UrlHelper.isTeamServicesUrl(name)) {
            helpPanel.setVisible(true);
        } else {
```

## RuleId[id=CharsetObjectCanBeUsed]
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
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
            // decode URI since CLC does not expect encoded collection urls
            try {
                builder.addSwitch("collection", URLDecoder.decode(collectionURI, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.warn("Error while decoding collection url. Using encoded url instead", e);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Closeable' used without 'try'-with-resources statement
in `plugin/src/com/microsoft/alm/plugin/external/reactive/RdIdeaLoggerFactory.java`
#### Snippet
```java
    public synchronized static void initialize() {
        if (!initialized) {
            Statics.Companion.of(JvmClassMappingKt.getKotlinClass(ILoggerFactory.class)).push(INSTANCE);
            initialized = true;
        }
```

## RuleId[id=RedundantNullableReturnType]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param e` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabControllerImpl.java`
#### Snippet
```java
     * Perform action based on event
     *
     * @param e
     */
    protected void performAction(final ActionEvent e) {
```

### JavadocDeclaration
`@param localPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ChangelistBuilderStatusVisitor.java`
#### Snippet
```java
     * Create the previous revision of a file that has been renamed
     *
     * @param localPath
     * @param revision
     * @return
```

### JavadocDeclaration
`@param revision` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ChangelistBuilderStatusVisitor.java`
#### Snippet
```java
     *
     * @param localPath
     * @param revision
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/ChangelistBuilderStatusVisitor.java`
#### Snippet
```java
     * @param localPath
     * @param revision
     * @return
     */
    private TFSContentRevision getPreviousRenamedRevision(final FilePath localPath, final int revision) {
```

### JavadocDeclaration
`@param cellRenderer` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CustomTreeTable.java`
#### Snippet
```java
    /**
     * @param columns      first one will be used as tree-style
     * @param cellRenderer
     */
    public CustomTreeTable(final List<? extends TreeTableColumn<T>> columns,
```

### JavadocDeclaration
`@param listener` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Creates and returns the menu items to be shown in the popup menu
     *
     * @param listener
     * @return list of menu items
     */
```

### JavadocDeclaration
`@param resourceKey` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Creates a menu item to use in the popup menu
     *
     * @param resourceKey
     * @param icon
     * @param actionCommand
```

### JavadocDeclaration
`@param icon` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     *
     * @param resourceKey
     * @param icon
     * @param actionCommand
     * @param listener
```

### JavadocDeclaration
`@param actionCommand` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * @param resourceKey
     * @param icon
     * @param actionCommand
     * @param listener
     * @return menu item
```

### JavadocDeclaration
`@param listener` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * @param icon
     * @param actionCommand
     * @param listener
     * @return menu item
     */
```

### JavadocDeclaration
`@param status` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Set the tab's status in the toolbar
     *
     * @param status
     */
    public void setStatus(final VcsTabStatus status) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Create and return the tab panel
     *
     * @return
     */
    public JComponent getPanel() {
```

### JavadocDeclaration
`@param modelView` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Sets the view model that is used for the tab
     *
     * @param modelView
     */
    public abstract void setModelForView(final T modelView);
```

### JavadocDeclaration
`@param component` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Display popup menu on the view
     *
     * @param component
     * @param x
     * @param y
```

### JavadocDeclaration
`@param x` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     *
     * @param component
     * @param x
     * @param y
     * @param listener
```

### JavadocDeclaration
`@param y` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * @param component
     * @param x
     * @param y
     * @param listener
     */
```

### JavadocDeclaration
`@param listener` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * @param x
     * @param y
     * @param listener
     */
    protected void showPopupMenu(final Component component, final int x, final int y, final ActionListener listener) {
```

### JavadocDeclaration
`@param actions` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     * Creates the toolbar for top of the tab
     *
     * @param actions
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabFormImpl.java`
#### Snippet
```java
     *
     * @param actions
     * @return
     */
    protected ActionToolbar createToolbar(DefaultActionGroup actions) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Deletes a list of files
     *
     * @param context
     * @param filePaths
     * @param workingFolder
```

### JavadocDeclaration
`@param filePaths` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param filePaths
     * @param workingFolder
     * @param recursive
```

### JavadocDeclaration
`@param workingFolder` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param filePaths
     * @param workingFolder
     * @param recursive
     * @return
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param filePaths
     * @param workingFolder
     * @param recursive
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workingFolder
     * @param recursive
     * @return
     */
    public static TfvcDeleteResult deleteFiles(final ServerContext context, final List<String> filePaths,
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param collectionName the name of the collection (if it contains spaces, then they should be passed as spaces,
     *                       not "%20").
     * @param workspaceName
     * @param authInfo
     * @return
```

### JavadocDeclaration
`@param authInfo` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *                       not "%20").
     * @param workspaceName
     * @param authInfo
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workspaceName
     * @param authInfo
     * @return
     */
    public static Workspace getDetailedWorkspace(final String collectionName, final String workspaceName, final AuthenticationInfo authInfo) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Resolves conflicts with the given resolution type
     *
     * @param context
     * @param conflicts
     * @param type
```

### JavadocDeclaration
`@param conflicts` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param conflicts
     * @param type
     * @return
```

### JavadocDeclaration
`@param type` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param conflicts
     * @param type
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param conflicts
     * @param type
     * @return
     */
    public static List<Conflict> resolveConflictsByPath(final ServerContext context, final List<String> conflicts, final ResolveConflictsCommand.AutoResolveType type) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method forces the Get of a file from the server
     *
     * @param context
     * @param filePath
     */
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param filePath
     */
    public static void forceGetFile(final ServerContext context, final String filePath) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * history. Look at the last 50 history entries first and if not found there look at all the history
     *
     * @param context
     * @param serverName
     * @param root
```

### JavadocDeclaration
`@param serverName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param serverName
     * @param root
     * @param type
```

### JavadocDeclaration
`@param root` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param serverName
     * @param root
     * @param type
     * @return
```

### JavadocDeclaration
`@param type` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param serverName
     * @param root
     * @param type
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param root
     * @param type
     * @return
     */
    private static RenameConflict findLocalRename(final ServerContext context, final String serverName,
```

### JavadocDeclaration
`@param changeSets` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Checks that a changeset in the list contains a change
     *
     * @param changeSets
     * @param index
     * @return
```

### JavadocDeclaration
`@param index` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param changeSets
     * @param index
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param changeSets
     * @param index
     * @return
     */
    private static boolean doesChangeSetHaveChanges(final List<ChangeSet> changeSets, final int index) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Note: this method does NOT sync the workspace.
     *
     * @param context
     * @param oldWorkspace
     * @param newWorkspace
```

### JavadocDeclaration
`@param oldWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param oldWorkspace
     * @param newWorkspace
     */
```

### JavadocDeclaration
`@param newWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param oldWorkspace
     * @param newWorkspace
     */
    public static String updateWorkspace(final ServerContext context, final Workspace oldWorkspace, final Workspace newWorkspace) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method returns a list of server that have workspaces locally
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    public static List<Server> getAllWorkspaces(final ServerContext context) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method deletes a given workspace
     *
     * @param context
     * @param workspaceName
     */
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param workspaceName
     */
    public static void deleteWorkspace(final ServerContext context, final String workspaceName) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Calls the merge command and returns the results
     *
     * @param context
     * @param source
     * @param destination
```

### JavadocDeclaration
`@param source` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param source
     * @param destination
     * @param versionSpec
```

### JavadocDeclaration
`@param destination` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param source
     * @param destination
     * @param versionSpec
     * @param recursive
```

### JavadocDeclaration
`@param versionSpec` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param source
     * @param destination
     * @param versionSpec
     * @param recursive
     * @return
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param destination
     * @param versionSpec
     * @param recursive
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param versionSpec
     * @param recursive
     * @return
     */
    public static MergeResults merge(final ServerContext context, final String workingFolder, final String source,
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Renames a file
     *
     * @param context
     * @param oldName
     * @param newName
```

### JavadocDeclaration
`@param oldName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param oldName
     * @param newName
     */
```

### JavadocDeclaration
`@param newName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param oldName
     * @param newName
     */
    public static void renameFile(final ServerContext context, final String oldName, final String newName) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Calls the branch command and returns the changeset number of the changeset created.
     *
     * @param context
     * @param workingFolder
     * @param recursive
```

### JavadocDeclaration
`@param workingFolder` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param workingFolder
     * @param recursive
     * @param comment
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param workingFolder
     * @param recursive
     * @param comment
     * @param author
```

### JavadocDeclaration
`@param comment` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workingFolder
     * @param recursive
     * @param comment
     * @param author
     * @param existingItem
```

### JavadocDeclaration
`@param author` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param recursive
     * @param comment
     * @param author
     * @param existingItem
     * @param newBranchedItem
```

### JavadocDeclaration
`@param existingItem` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param comment
     * @param author
     * @param existingItem
     * @param newBranchedItem
     * @return
```

### JavadocDeclaration
`@param newBranchedItem` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param author
     * @param existingItem
     * @param newBranchedItem
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param existingItem
     * @param newBranchedItem
     * @return
     */
    public static String createBranch(final ServerContext context, final String workingFolder,
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method determines the workspace name from the project and then calls getWorkspace with the name.
     *
     * @param context
     * @param project
     * @return
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param project
     * @return
     */

```

### JavadocDeclaration
`@param authInfo` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method refreshes the cache for a server to pull in any remote changes
     *
     * @param authInfo
     * @param serverUrl
     */
```

### JavadocDeclaration
`@param serverUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param authInfo
     * @param serverUrl
     */
    public static void refreshWorkspacesForServer(final AuthenticationInfo authInfo, final String serverUrl) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Checks in the list of files
     *
     * @param context
     * @param files
     * @param preparedComment
```

### JavadocDeclaration
`@param files` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param files
     * @param preparedComment
     * @return
```

### JavadocDeclaration
`@param preparedComment` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param files
     * @param preparedComment
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param files
     * @param preparedComment
     * @return
     */
    public static String checkinFiles(final ServerContext context, final List<String> files,
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Get the status for a list of files
     *
     * @param context
     * @param files
     * @return
```

### JavadocDeclaration
`@param files` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param files
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param files
     * @return
     */
    public static List<PendingChange> getStatusForFiles(
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Adds the given files to the repo
     *
     * @param context
     * @param filesToAddPaths
     * @return
```

### JavadocDeclaration
`@param filesToAddPaths` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param filesToAddPaths
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param filesToAddPaths
     * @return
     */
    public static List<String> addFiles(final ServerContext context, final List<String> filesToAddPaths) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Returns a list of labels from the server.
     *
     * @param context
     * @param workingFolder
     * @param nameFilter
```

### JavadocDeclaration
`@param workingFolder` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param workingFolder
     * @param nameFilter
     * @return
```

### JavadocDeclaration
`@param nameFilter` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param workingFolder
     * @param nameFilter
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workingFolder
     * @param nameFilter
     * @return
     */
    public static List<TfvcLabel> getLabels(final ServerContext context, final String workingFolder, final String nameFilter) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Lock::None is how you unlock a file (cannot unlock errors are ignored)
     *
     * @param context
     * @param workingFolder
     * @param lockLevel
```

### JavadocDeclaration
`@param workingFolder` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param workingFolder
     * @param lockLevel
     * @param recursive
```

### JavadocDeclaration
`@param lockLevel` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param workingFolder
     * @param lockLevel
     * @param recursive
     * @param itemSpecs
```

### JavadocDeclaration
`@param recursive` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workingFolder
     * @param lockLevel
     * @param recursive
     * @param itemSpecs
     */
```

### JavadocDeclaration
`@param itemSpecs` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param lockLevel
     * @param recursive
     * @param itemSpecs
     */
    public static void lock(final ServerContext context, final String workingFolder, final LockCommand.LockLevel lockLevel,
```

### JavadocDeclaration
`@param serverContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Adds a workspace mapping to the workspace named
     *
     * @param serverContext
     * @param workspaceName
     * @param serverPath
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param serverContext
     * @param workspaceName
     * @param serverPath
     * @param localPath
```

### JavadocDeclaration
`@param serverPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param serverContext
     * @param workspaceName
     * @param serverPath
     * @param localPath
     */
```

### JavadocDeclaration
`@param localPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param workspaceName
     * @param serverPath
     * @param localPath
     */
    public static String addWorkspaceMapping(final ServerContext serverContext, final String workspaceName, final String serverPath, final String localPath) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Finds the conflicts under a given directory
     *
     * @param context
     * @param root
     * @return
```

### JavadocDeclaration
`@param root` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param root
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param root
     * @return
     */
    public static List<Conflict> getConflicts(final ServerContext context, final String root, final MergeResults mergeResults) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * Calls the get branches command and returns the list of branched items associated with the source item.
     *
     * @param context
     * @param sourceItem
     * @return
```

### JavadocDeclaration
`@param originalArgumentBuilder` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunnerCache.java`
#### Snippet
```java
     * that tell the CLC to start up and then wait for arguments to be passed via
     * standard input.
     * @param originalArgumentBuilder
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunnerCache.java`
#### Snippet
```java
     * standard input.
     * @param originalArgumentBuilder
     * @return
     */
    private static ToolRunner.ArgumentBuilder getStartAndWaitArguments(final ToolRunner.ArgumentBuilder originalArgumentBuilder) {
```

### JavadocDeclaration
`@param sourceItem` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param sourceItem
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param sourceItem
     * @return
     */
    public static List<String> getBranches(final ServerContext context, final String workingFolder,
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * This method returns the fully filled out Workspace object.
     *
     * @param context
     * @param workspaceName
     * @return
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     *
     * @param context
     * @param workspaceName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/CommandUtils.java`
#### Snippet
```java
     * @param context
     * @param workspaceName
     * @return
     */
    public static Workspace getWorkspace(final ServerContext context, final String workspaceName) {
```

### JavadocDeclaration
`@param object` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
     * The comment and mappings don't make the workspace unique
     *
     * @param object
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/models/Workspace.java`
#### Snippet
```java
     *
     * @param object
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindWorkspaceCommand.java`
#### Snippet
```java
     * Check specifically to see if an authentication exception is thrown
     *
     * @param stderr
     */
    @Override
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * This constructor is used by Manage Workspaces when we already know the context and the workspace info
     *
     * @param project
     * @param context
     * @param workspace
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     *
     * @param project
     * @param context
     * @param workspace
     */
```

### JavadocDeclaration
`@param workspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * @param project
     * @param context
     * @param workspace
     */
    public WorkspaceController(final Project project, final ServerContext context, final Workspace workspace) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * the workspace path.
     *
     * @param project
     * @param repositoryContext
     * @param workspaceName
```

### JavadocDeclaration
`@param repositoryContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     *
     * @param project
     * @param repositoryContext
     * @param workspaceName
     */
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * @param project
     * @param repositoryContext
     * @param workspaceName
     */
    public WorkspaceController(final Project project, final RepositoryContext repositoryContext, final ServerContext serverContext, final String workspaceName) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * Use this constructor to edit the workspace for the current project.
     *
     * @param project
     */
    public WorkspaceController(final Project project, final ServerContext serverContext) {
```

### JavadocDeclaration
`@param autoSaveWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     * If you choose not to auto save the workspace, you should call saveWorkspace if this method returns true.
     *
     * @param autoSaveWorkspace
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/workspace/WorkspaceController.java`
#### Snippet
```java
     *
     * @param autoSaveWorkspace
     * @return
     */
    public boolean showModalDialog(final boolean autoSaveWorkspace) {
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/CreateBranchCommand.java`
#### Snippet
```java
     * Parse for specific error messages from CreateBranchCommand command
     *
     * @param stderr
     */
    @Override
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcWorkspaceLocator.java`
#### Snippet
```java
     * This method will return just the workspace name or empty string (never null)
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TfvcWorkspaceLocator.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    public static String getWorkspaceName(final Project project) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
         * This method forces the thread to end by interrupting it and joining with the calling thread.
         *
         * @throws InterruptedException
         */
        public void cleanUp() throws InterruptedException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
         * This method forces the thread to end by interrupting it and joining with the calling thread.
         *
         * @throws InterruptedException
         */
        public void cleanUp() throws InterruptedException {
```

### JavadocDeclaration
`@param toolSpecifiedId` tag description is missing
in `plugin/src/com/microsoft/alm/common/artifact/GitRefArtifactID.java`
#### Snippet
```java
     * Decode the ToolSpecifiedId into its 3 separate components
     *
     * @param toolSpecifiedId
     */
    private void decodeGitRefToolSpecifiedId(final String toolSpecifiedId) {
```

### JavadocDeclaration
`@param refName` tag description is missing
in `plugin/src/com/microsoft/alm/common/artifact/GitRefArtifactID.java`
#### Snippet
```java
     * Ex: GBBranchName
     *
     * @param refName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/common/artifact/GitRefArtifactID.java`
#### Snippet
```java
     *
     * @param refName
     * @return
     */
    private String decodeRefName(final String refName) {
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindConflictsCommand.java`
#### Snippet
```java
     * tfsTest_01/TestAdd.txt: The item content has changed
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindConflictsCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindConflictsCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param returnCode` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindConflictsCommand.java`
#### Snippet
```java
     * This occurs in the case where resolve is in preview and not completed
     *
     * @param returnCode
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/FindConflictsCommand.java`
#### Snippet
```java
     *
     * @param returnCode
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param serverURI` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
    /**
     * Sets the proxy URI for the server URI provided. The Property service is used as the backing store.
     * @param serverURI
     * @param proxyURI
     */
```

### JavadocDeclaration
`@param proxyURI` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * Sets the proxy URI for the server URI provided. The Property service is used as the backing store.
     * @param serverURI
     * @param proxyURI
     */
    public static void setProxyServer(final String serverURI, final String proxyURI) {
```

### JavadocDeclaration
`@param currentWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * If so, the method returns false, if not, it returns true.
     *
     * @param currentWorkspace
     * @param newWorkspace
     * @return
```

### JavadocDeclaration
`@param newWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     *
     * @param currentWorkspace
     * @param newWorkspace
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * @param currentWorkspace
     * @param newWorkspace
     * @return
     */
    public static boolean areMappingsDifferent(final Workspace currentWorkspace, final Workspace newWorkspace) {
```

### JavadocDeclaration
`@param serverURI` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
    /**
     * Retrieves the proxy URI from the property service using the serverURI as a key.
     * @param serverURI
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * Retrieves the proxy URI from the property service using the serverURI as a key.
     * @param serverURI
     * @return
     */
    public static String getProxyServer(final String serverURI) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * @param currentWorkspace The current workspace with the current mappings
     * @param newWorkspace     The new workspace with the way you want the mappings to look
     * @return
     */
    public static List<Workspace.Mapping> getMappingsToRemove(final Workspace currentWorkspace, final Workspace newWorkspace) {
```

### JavadocDeclaration
`@param mappings1` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * If so, the method returns false, if not, it returns true.
     *
     * @param mappings1
     * @param mappings2
     * @return
```

### JavadocDeclaration
`@param mappings2` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     *
     * @param mappings1
     * @param mappings2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * @param mappings1
     * @param mappings2
     * @return
     */
    public static boolean areMappingsDifferent(final List<Workspace.Mapping> mappings1, final List<Workspace.Mapping> mappings2) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/utils/WorkspaceHelper.java`
#### Snippet
```java
     * @param currentWorkspace The current workspace with the current mappings
     * @param newWorkspace     The new workspace with the way you want the mappings to look
     * @return
     */
    public static List<Workspace.Mapping> getMappingsToChange(final Workspace currentWorkspace, final Workspace newWorkspace) {
```

### JavadocDeclaration
`@param icon` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/IconPanel.java`
#### Snippet
```java
     * Create the IconPanel. The preferred size and min size are derived from the width and height of the icon.
     *
     * @param icon
     */
    public IconPanel(Icon icon) {
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
     * $/WorkspaceName: /Users/JohnSmith/WorkspaceName
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetDetailedWorkspaceCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsDialog.java`
#### Snippet
```java
     * Override so only OK action is created and not Cancel
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * Check if PATH contains the path to the tf command
     *
     * @return
     */
    private static String getExeFromPath(final String[] exeNames) {
```

### JavadocDeclaration
`@param paths` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * Search thru given directories to find one of the given acceptable tf commands
     *
     * @param paths
     * @param exeNames
     * @return
```

### JavadocDeclaration
`@param exeNames` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     *
     * @param paths
     * @param exeNames
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * @param paths
     * @param exeNames
     * @return
     */
    private static String searchDirectories(final File[] paths, final String[] exeNames) {
```

### JavadocDeclaration
`@param exePath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * Checks if the given path contains one of the given acceptable tf commands
     *
     * @param exePath
     * @param exeNames
     * @return
```

### JavadocDeclaration
`@param exeNames` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     *
     * @param exePath
     * @param exeNames
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * @param exePath
     * @param exeNames
     * @return
     */
    private static String checkTfPath(final String exePath, final String[] exeNames) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
     * Try to find the tf command by checking common places based on the OS
     *
     * @return
     */
    public static String tryDetectTf() {
```

### JavadocDeclaration
`@param filePath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
     * Creates a revision number for the given file
     *
     * @param filePath
     * @param fileName
     * @return
```

### JavadocDeclaration
`@param fileName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
     *
     * @param filePath
     * @param fileName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
     * @param filePath
     * @param fileName
     * @return
     */
    private VcsRevisionNumber getRevisionNumber(final String filePath, final String fileName) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSDiffProvider.java`
#### Snippet
```java
     * The mappings will update if more than a minute is passed to make sure the mapping is up-to-date
     *
     * @return
     */
    private List<Workspace.Mapping> getUpdatedMappings() {
```

### JavadocDeclaration
`@param repositoryContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTabLookupListener.java`
#### Snippet
```java
     * Load PR data based on the git url
     *
     * @param repositoryContext
     */
    public void loadData(final RepositoryContext repositoryContext, Operation.Inputs inputs) {
```

### JavadocDeclaration
`@param returnCode` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
     * This occurs in the case where conflicts exists
     *
     * @param returnCode
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
     *
     * @param returnCode
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
     * merge, branch: $/tfsTest_03/src/main/java/com/microsoft/build/Demand2.java;C215 -> $/tfsTest_03/branch_06/Demand2.java
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/MergeCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param stream` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
     * Reading cached changelist values from the stream and repopulating the data into the changelist
     *
     * @param stream
     */
    private void readFromStream(final DataInput stream) {
```

### JavadocDeclaration
`@param stream` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
     * Save object to stream so it can be cached
     *
     * @param stream
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
     *
     * @param stream
     * @throws IOException
     */
    void writeToStream(final DataOutput stream) throws IOException {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
     * is what JetBrains did as well so it doesn't differ from their experience.
     *
     * @return
     */
    public Collection<Change> getChanges() {
```

### JavadocDeclaration
`@param pendingChange` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
     * Determine which state the change is in so we know how to handle it
     *
     * @param pendingChange
     * @return ServerState
     */
```

### JavadocDeclaration
`@param statusVisitor` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
     * Finds the status of the file and then uses that status to determine how to add it to the local changes list
     *
     * @param statusVisitor
     * @param pendingChange
     */
```

### JavadocDeclaration
`@param pendingChange` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/StatusProvider.java`
#### Snippet
```java
     *
     * @param statusVisitor
     * @param pendingChange
     */
    public static void visitByStatus(final @NotNull StatusVisitor statusVisitor,
```

### JavadocDeclaration
`@param authInfo` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * from a specific server using a server call but don't have a server context
     *
     * @param authInfo
     * @param serverUrl
     */
```

### JavadocDeclaration
`@param serverUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     *
     * @param authInfo
     * @param serverUrl
     */
    public GetAllWorkspacesCommand(final AuthenticationInfo authInfo, final String serverUrl) {
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * newWorksp John Smith computerName
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetAllWorkspacesCommand.java`
#### Snippet
```java
     * from a specific server using a server call
     *
     * @param context
     */
    public GetAllWorkspacesCommand(final ServerContext context) {
```

### JavadocDeclaration
`@param repositoryContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
     * Use this method to get a properly authenticated context based on the repositoryContext given.
     *
     * @param repositoryContext
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/Operation.java`
#### Snippet
```java
     *
     * @param repositoryContext
     * @return
     */
    protected static ServerContext getServerContext(final RepositoryContext repositoryContext, final boolean forcePrompt, final boolean allowPrompt, final Logger logger) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * Validates a provided server context and if validation succeeds saves a server context with the user's team foundation Id
     *
     * @param context
     */
    public ServerContext validateServerConnection(final ServerContext context) {
```

### JavadocDeclaration
`@param gitRemoteUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * Note that this will require server calls and should be done on a background thread.
     *
     * @param gitRemoteUrl
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     *
     * @param gitRemoteUrl
     * @return
     */
    public ServerContext createContextFromGitRemoteUrl(final String gitRemoteUrl) {
```

### JavadocDeclaration
`@param parseResult` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         * If some call fails we simply return false and ignore the results.
         *
         * @param parseResult
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         *
         * @param parseResult
         * @return
         */
        @Override
```

### JavadocDeclaration
`@param contexts` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * other contexts that share that auth info and removes the old contexts from use
     *
     * @param contexts
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     *
     * @param contexts
     * @return
     */
    public void updateServerContextsAuthInfo(final List<ServerContext> contexts) {
```

### JavadocDeclaration
`@param collectionUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         * This method queries the server with the given TFVC URL for collection information
         *
         * @param collectionUrl
         * @param teamProjectName
         * @param possibleCollectionName
```

### JavadocDeclaration
`@param teamProjectName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         *
         * @param collectionUrl
         * @param teamProjectName
         * @param possibleCollectionName
         * @return true if server information is determined
```

### JavadocDeclaration
`@param possibleCollectionName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         * @param collectionUrl
         * @param teamProjectName
         * @param possibleCollectionName
         * @return true if server information is determined
         */
```

### JavadocDeclaration
`@param url` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * Use this method to get the appropriate AuthenticationProvider based on an url.
     *
     * @param url
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     *
     * @param url
     * @return
     */
    public AuthenticationProvider getAuthenticationProvider(final String url) {
```

### JavadocDeclaration
`@param remoteUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * Has to be called on a background thread, will hang if called on UI thread
     *
     * @param remoteUrl
     */
    public ServerContext updateAuthenticationInfo(final String remoteUrl) {
```

### JavadocDeclaration
`@param collectionUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         * 1: the collection name (no slashes)
         *
         * @param collectionUrl
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         *
         * @param collectionUrl
         * @return
         */
        private String[] splitTfvcCollectionUrl(final String collectionUrl) {
```

### JavadocDeclaration
`@param gitRemoteUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
         * If unable to get the info, it parses the Git remote url and tries to verify it by querying the server again
         *
         * @param gitRemoteUrl
         * @return true if server information is determined
         */
```

### JavadocDeclaration
`@param remoteUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
     * TODO: so we can specifically retry on that and remove the bad cached creds
     *
     * @param remoteUrl
     * @return context
     */
```

### JavadocDeclaration
`@param files` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     * Recursively look for files that have a status UNKNOWN
     *
     * @param files
     * @param fileStatusManager
     * @return
```

### JavadocDeclaration
`@param fileStatusManager` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     *
     * @param files
     * @param fileStatusManager
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/TfsFileUtil.java`
#### Snippet
```java
     * @param files
     * @param fileStatusManager
     * @return
     */
    public static boolean findUnknownFiles(final VirtualFile[] files, final FileStatusManager fileStatusManager) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/settings/TeamServicesSettingsModel.java`
#### Snippet
```java
     * Check if any changes have been made to the page
     *
     * @return
     */
    public boolean isModified() {
```

### JavadocDeclaration
`@param returnCode` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     * This occurs in the case where conflicts exists
     *
     * @param returnCode
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     *
     * @param returnCode
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     * just getting an error code exception (such as "Workspace not found" which can be an error from here)
     *
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     * Conflict /Users/user/tfvc-tfs/tfsTest_01/TestAdd.txt - Unable to perform the get operation because you have a conflicting edit
     *
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     *
     * @param stderr
     * @return
     */
    private List<SyncException> parseException(final String stderr) {
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     * Conflict D:\tmp\test\test_renamed.txt - Unable to perform the get operation because you have a conflicting rename, edit
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/SyncCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java
     * Generates a new server context with session token information for VSO and saves it as the active context
     *
     * @param context
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java
     *
     * @param context
     * @return
     */
    public ServerContext completeSignIn(final ServerContext context) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
     * used to reside while the server path is needed to pull down that version of the file from the server for diffs
     *
     * @param project
     * @param orignalPath:     path of the file before it was renamed
     * @param changeset
```

### JavadocDeclaration
`@param changeset` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
     * @param project
     * @param orignalPath:     path of the file before it was renamed
     * @param changeset
     * @param modificationDate
     * @param serverPath:      path of the file on the server
```

### JavadocDeclaration
`@param modificationDate` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
     * @param orignalPath:     path of the file before it was renamed
     * @param changeset
     * @param modificationDate
     * @param serverPath:      path of the file on the server
     * @return
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentRevision.java`
#### Snippet
```java
     * @param modificationDate
     * @param serverPath:      path of the file on the server
     * @return
     */
    public static TFSContentRevision createRenameRevision(final Project project,
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/CreateWorkspaceCommand.java`
#### Snippet
```java
     * Parse for specific error messages from CreateWorkspace command
     *
     * @param stderr
     */
    @Override
```

### JavadocDeclaration
`@param uri` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
     * Take the given URI and process the arguments passed inside of it to initiate the given workflow they are calling
     *
     * @param uri
     * @throws RuntimeException
     * @throws UnsupportedEncodingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
     *
     * @param uri
     * @throws RuntimeException
     * @throws UnsupportedEncodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
     * @param uri
     * @throws RuntimeException
     * @throws UnsupportedEncodingException
     */
    protected abstract void processUri(final String uri) throws RuntimeException, UnsupportedEncodingException;
```

### JavadocDeclaration
`@param args` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
     * Take the given command-line arguments and process them to initiate the given workflow they are calling
     *
     * @param args
     * @throws RuntimeException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/ApplicationStarterBase.java`
#### Snippet
```java
     *
     * @param args
     * @throws RuntimeException
     */
    protected abstract void processCommand(final List<String> args) throws RuntimeException;
```

### JavadocDeclaration
`@param repositoryContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTabLookupListener.java`
#### Snippet
```java
     * Load work item data based on the repository context
     *
     * @param repositoryContext
     */
    public void loadData(final RepositoryContext repositoryContext, final Operation.Inputs inputs) {
```

### JavadocDeclaration
`@param uri` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/starters/VstsStarter.java`
#### Snippet
```java
     * Parse URI to find the given key-value attributes it contains
     *
     * @param uri
     * @return Map of the key-value attributes contained in the URI
     */
```

### JavadocDeclaration
`@param serverName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Get the partially populated workspace object
     *
     * @param serverName
     * @param workspaceName
     * @return
```

### JavadocDeclaration
`@param workspaceName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     *
     * @param serverName
     * @param workspaceName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * @param serverName
     * @param workspaceName
     * @return
     */
    protected Workspace getPartialWorkspace(final String serverName, final String workspaceName) {
```

### JavadocDeclaration
`@param selectedServer` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Reload the workspaces for the given server
     *
     * @param selectedServer
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     *
     * @param selectedServer
     * @throws VcsException
     */
    protected void reloadWorkspaces(final Server selectedServer) throws VcsException {
```

### JavadocDeclaration
`@param server` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Get the proxy settings for the given server
     *
     * @param server
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     *
     * @param server
     * @return
     */
    private String getProxy(final Server server) {
```

### JavadocDeclaration
`@param selectedWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Open the edit workspace dialog with given workspace info
     *
     * @param selectedWorkspace
     * @param update
     */
```

### JavadocDeclaration
`@param update` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     *
     * @param selectedWorkspace
     * @param update
     */
    protected void editWorkspace(final Workspace selectedWorkspace, final Runnable update) throws VcsException {
```

### JavadocDeclaration
`@param selectedWorkspace` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Delete the given workspace
     *
     * @param selectedWorkspace
     */
    protected void deleteWorkspace(final Workspace selectedWorkspace) throws VcsException {
```

### JavadocDeclaration
`@param server` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Save the proxy settings
     *
     * @param server
     * @param newProxy
     */
```

### JavadocDeclaration
`@param newProxy` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     *
     * @param server
     * @param newProxy
     */
    private void setProxy(final Server server, final String newProxy) {
```

### JavadocDeclaration
`@param selectedServer` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java
     * Open the proxy dialog for editing
     *
     * @param selectedServer
     */
    public void editProxy(final Server selectedServer) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
     * recursion level values. They are case sensitive and the generated client has the incorrect casing.
     *
     * @param project
     * @param scopePath
     * @param recursionLevel
```

### JavadocDeclaration
`@param scopePath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
     *
     * @param project
     * @param scopePath
     * @param recursionLevel
     * @param versionDescriptor
```

### JavadocDeclaration
`@param recursionLevel` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
     * @param project
     * @param scopePath
     * @param recursionLevel
     * @param versionDescriptor
     * @return
```

### JavadocDeclaration
`@param versionDescriptor` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
     * @param scopePath
     * @param recursionLevel
     * @param versionDescriptor
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/TfvcHttpClientEx.java`
#### Snippet
```java
     * @param recursionLevel
     * @param versionDescriptor
     * @return
     */
    public List<TfvcItem> getItems(
```

### JavadocDeclaration
`@param statusString` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/models/ServerStatusType.java`
#### Snippet
```java
     * Figure out server status type from string
     *
     * @param statusString
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/models/ServerStatusType.java`
#### Snippet
```java
     *
     * @param statusString
     * @return
     */
    public static List<ServerStatusType> getServerStatusTypes(final String statusString) {
```

### JavadocDeclaration
`@param conflicts` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Resolve the conflicts based on auto resolve type and then refresh the table model to update the list of conflicts
     *
     * @param conflicts
     * @param type
     */
```

### JavadocDeclaration
`@param type` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param conflicts
     * @param type
     */
    public void acceptChangeAsync(final List<Conflict> conflicts, final ResolveConflictsCommand.AutoResolveType type, final ResolveConflictsModel model) {
```

### JavadocDeclaration
`@param conflict` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Process a conflict that has both rename and content conflicts
     *
     * @param conflict
     * @param context
     * @param model
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param conflict
     * @param context
     * @param model
     * @param conflictPath
```

### JavadocDeclaration
`@param model` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflict
     * @param context
     * @param model
     * @param conflictPath
     * @param contentTriplet
```

### JavadocDeclaration
`@param conflictPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param context
     * @param model
     * @param conflictPath
     * @param contentTriplet
     * @throws VcsException
```

### JavadocDeclaration
`@param contentTriplet` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param model
     * @param conflictPath
     * @param contentTriplet
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflictPath
     * @param contentTriplet
     * @throws VcsException
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param conflict` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Determines which type of merge conflict is present (content or name) and then gives the user the ability to resolve the issue
     *
     * @param conflict
     * @param model
     * @throws VcsException
```

### JavadocDeclaration
`@param model` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param conflict
     * @param model
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflict
     * @param model
     * @throws VcsException
     */
    public void acceptMerge(final @NotNull Conflict conflict, final ResolveConflictsModel model) throws VcsException {
```

### JavadocDeclaration
`@param conflict` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Process a rename conflict specifically
     *
     * @param conflict
     * @param context
     * @param model
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param conflict
     * @param context
     * @param model
     * @throws VcsException
```

### JavadocDeclaration
`@param model` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflict
     * @param context
     * @param model
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param context
     * @param model
     * @throws VcsException
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param conflict` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Gets contents for the 3 way diff
     *
     * @param conflict
     * @param conflictPath
     * @param localPath
```

### JavadocDeclaration
`@param conflictPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param conflict
     * @param conflictPath
     * @param localPath
     * @param context
```

### JavadocDeclaration
`@param localPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflict
     * @param conflictPath
     * @param localPath
     * @param context
     * @return
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param conflictPath
     * @param localPath
     * @param context
     * @return
     * @throws VcsException
```

### JavadocDeclaration
Tag `return` is not allowed here
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param localPath
     * @param context
     * @return
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param context
     * @return
     * @throws VcsException
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * Process a content conflict specifically
     *
     * @param context
     * @param model
     * @param contentTriplet
```

### JavadocDeclaration
`@param model` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param context
     * @param model
     * @param contentTriplet
     * @param localPath
```

### JavadocDeclaration
`@param contentTriplet` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param context
     * @param model
     * @param contentTriplet
     * @param localPath
     * @throws VcsException
```

### JavadocDeclaration
`@param localPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param model
     * @param contentTriplet
     * @param localPath
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param contentTriplet
     * @param localPath
     * @throws VcsException
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param localPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * then reload the conflicts
     *
     * @param localPath
     * @param updatedPath
     * @param type
```

### JavadocDeclaration
`@param updatedPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     *
     * @param localPath
     * @param updatedPath
     * @param type
     * @param context
```

### JavadocDeclaration
`@param type` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param localPath
     * @param updatedPath
     * @param type
     * @param context
     * @param model
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param updatedPath
     * @param type
     * @param context
     * @param model
     * @param updateFiles
```

### JavadocDeclaration
`@param model` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param type
     * @param context
     * @param model
     * @param updateFiles
     * @throws VcsException
```

### JavadocDeclaration
`@param updateFiles` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param context
     * @param model
     * @param updateFiles
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
     * @param model
     * @param updateFiles
     * @throws VcsException
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     * Checks if the IDE is Rider
     *
     * @return
     */
    public static boolean isRider() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     * @param directory    the directory under the idea.plugin/resource directory to for the resource
     * @return the path to the resource
     * @throws UnsupportedEncodingException
     */
    public static String getResourcePath(final URL resourceUrl, final String resourceName, final String directory) throws UnsupportedEncodingException {
```

### JavadocDeclaration
`@param runnable` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     * Runs a task async in IntelliJ (shows no status so not for user actions that need to show progress)
     *
     * @param runnable
     */
    public static void executeOnPooledThread(final Runnable runnable) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     *
     * @param executable executable file for application
     * @throws FileNotFoundException
     */
    public static void setExecutablePermissions(final File executable) throws FileNotFoundException {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     * Shows an error dialog
     *
     * @param project
     * @param message
     */
```

### JavadocDeclaration
`@param message` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     *
     * @param project
     * @param message
     */
    public static void showErrorDialog(@NotNull final Project project, @NotNull final String message) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     * Shows an error dialog
     *
     * @param project
     * @param throwable
     */
```

### JavadocDeclaration
`@param throwable` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/IdeaHelper.java`
#### Snippet
```java
     *
     * @param project
     * @param throwable
     */
    public static void showErrorDialog(@NotNull final Project project, final Throwable throwable) {
```

### JavadocDeclaration
`@param t` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/LocalizationServiceImpl.java`
#### Snippet
```java
     * Gets the localized exception message
     *
     * @param t
     * @return localized string
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/actions/OpenFileInBrowserAction.java`
#### Snippet
```java
     *
     * @param project, vFile
     * @return
     */
    private boolean isEnabled(final ChangeListManager changeListManager, final Project project, final VirtualFile vFile) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * It works for TF Git or TFVC repositories. Any other type of repo will return null.
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    public static RepositoryContext getRepositoryContext(final Project project) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * Find the VCS type of the given project
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    public static String getVcsType(final Project project) {
```

### JavadocDeclaration
`@param serverPath` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * If no team project name is found an empty string is returned.
     *
     * @param serverPath
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param serverPath
     * @return
     */
    public static String getTeamProjectFromTfvcServerPath(final String serverPath) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * Returns the Git repository object for the project or null if this is not a Git repo project.
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    public static GitRepository getGitRepository(final Project project) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * Use this method to check if the given project is a VSTS/TFS project
     *
     * @param project
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param project
     * @return
     */
    public static boolean isVstsRepo(final Project project) {
```

### JavadocDeclaration
`@param file` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     * or null if the file isn't under a TFVC repo
     *
     * @param file
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/VcsHelper.java`
#### Snippet
```java
     *
     * @param file
     * @return
     */
    public static TFSVcs getTFSVcsByPath(final VirtualFile file) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
     *
     * @param gitRepository must not be <code>null</code>
     * @return
     */
    public static boolean isTfGitRepository(@NotNull final GitRepository gitRepository) {
```

### JavadocDeclaration
`@param gitRepository` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
     * Will not try to prompt the user and create the server context
     *
     * @param gitRepository
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/TfGitHelper.java`
#### Snippet
```java
     *
     * @param gitRepository
     * @return
     */
    public static ServerContext getSavedServerContext(@NotNull final GitRepository gitRepository) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * This method enables the action if one or more items are selected.
     *
     * @param project
     * @param files
     * @return
```

### JavadocDeclaration
`@param files` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     *
     * @param project
     * @param files
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * @param project
     * @param files
     * @return
     */
    protected boolean isEnabled(final Project project, final VirtualFile[] files) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * This method returns false if errors exist and true otherwise.
     *
     * @param context
     * @param runnable
     * @return
```

### JavadocDeclaration
`@param runnable` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     *
     * @param context
     * @param runnable
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * @param context
     * @param runnable
     * @return
     */
    protected boolean runWithProgress(final MultipleItemActionContext context, final Runnable runnable, final String progressMessage) {
```

### JavadocDeclaration
`@param actionContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * The context parameter should contain all the item information needed by the action.
     *
     * @param actionContext
     */
    protected abstract void execute(final @NotNull MultipleItemActionContext actionContext);
```

### JavadocDeclaration
`@param context` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/actions/MultipleItemAction.java`
#### Snippet
```java
     * This method shows the errors in the VCS error window.
     *
     * @param context
     */
    protected void showErrors(final MultipleItemActionContext context) {
```

### JavadocDeclaration
`@param directory` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemQueriesLookupOperation.java`
#### Snippet
```java
         * Constructor for QueryInputs that takes a specific root directory to search under
         *
         * @param directory
         */
        public QueryInputs(final QueryRootDirectories directory) {
```

### JavadocDeclaration
`@param nameChoice1` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/NameMerger.java`
#### Snippet
```java

    /**
     * @param nameChoice1
     * @param nameChoice2
     * @param project
```

### JavadocDeclaration
`@param nameChoice2` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/NameMerger.java`
#### Snippet
```java
    /**
     * @param nameChoice1
     * @param nameChoice2
     * @param project
     * @return null if user cancelled
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/NameMerger.java`
#### Snippet
```java
     * @param nameChoice1
     * @param nameChoice2
     * @param project
     * @return null if user cancelled
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     * Old way to read passwords which is deprecated and should only be used in older version of IDEA
     *
     * @param key
     */
    private static String readPasswordOldWay(final String key) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     * Old way to write passwords which is deprecated and should only be used in older version of IDEA
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    private static void writePasswordOldWay(final String key, final String value) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     * If that doesn't exist it will fall back to the old way which doesn't store multiple passwords and is deprecated
     *
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     *
     * @param key
     * @param value
     */
    private static void writePassword(final String key, final String value) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     * If that doesn't exist it will fall back to the old way which is deprecated
     *
     * @param key
     * @return unencrypted password or and empty string if no password is found
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSecrets.java`
#### Snippet
```java
     * Forget password by overwriting existing password with null
     *
     * @param key
     */
    private static void forgetPassword(final String key) {
```

### JavadocDeclaration
`@param level` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/LockCommand.java`
#### Snippet
```java
         * We ignore the "-" in check-in and check-out to match those forms as well.
         *
         * @param level
         * @return
         */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/LockCommand.java`
#### Snippet
```java
         *
         * @param level
         * @return
         */
        public static LockLevel fromString(final String level) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/ServerPathCellEditor.java`
#### Snippet
```java
     * Get a server path to pass into the dialog
     *
     * @return
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param rows` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
     * Find the values of the selected rows
     *
     * @param rows
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
     *
     * @param rows
     * @return
     */
    private List<Conflict> getSelectedConflicts(final int[] rows) {
```

### JavadocDeclaration
`@param rows` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
     * Accept your local changes
     *
     * @param rows
     */
    public void acceptYours(final int[] rows) {
```

### JavadocDeclaration
`@param rows` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ResolveConflictsModel.java`
#### Snippet
```java
     * Accept server changes
     *
     * @param rows
     */
    public void acceptTheirs(final int[] rows) {
```

### JavadocDeclaration
`@param project` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
     * Get the hash associated with the last commit on a branch
     *
     * @param project
     * @param gitRepository
     * @param branch
```

### JavadocDeclaration
`@param gitRepository` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
     *
     * @param project
     * @param gitRepository
     * @param branch
     * @return
```

### JavadocDeclaration
`@param branch` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
     * @param project
     * @param gitRepository
     * @param branch
     * @return
     * @throws VcsException
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
     * @param gitRepository
     * @param branch
     * @return
     * @throws VcsException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/utils/GeneralGitHelper.java`
#### Snippet
```java
     * @param branch
     * @return
     * @throws VcsException
     */
    public static String getLastCommitHash(@NotNull final Project project, @NotNull final GitRepository gitRepository,
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/utils/BackCompatibleUtils.java`
#### Snippet
```java
     * Find the proxy login username
     *
     * @return
     */
    public static String getProxyLogin() {
```

### JavadocDeclaration
`@param client` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/VstsHttpClient.java`
#### Snippet
```java
     * Send a HTTP GET request to a URI and read JSON response as object of specified class
     *
     * @param client
     * @param uri
     * @param resultClass
```

### JavadocDeclaration
`@param uri` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/VstsHttpClient.java`
#### Snippet
```java
     *
     * @param client
     * @param uri
     * @param resultClass
     * @param <TResult>
```

### JavadocDeclaration
`@param resultClass` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/VstsHttpClient.java`
#### Snippet
```java
     * @param client
     * @param uri
     * @param resultClass
     * @param <TResult>
     * @return Object of type resultClass
```

### JavadocDeclaration
`@param ` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/VstsHttpClient.java`
#### Snippet
```java
     * @param uri
     * @param resultClass
     * @param <TResult>
     * @return Object of type resultClass
     */
```

### JavadocDeclaration
`@param titleLabelText` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
     * Setup the UI components for the menu
     *
     * @param titleLabelText
     * @param pickerLabel
     */
```

### JavadocDeclaration
`@param pickerLabel` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/FilterDropDown.java`
#### Snippet
```java
     *
     * @param titleLabelText
     * @param pickerLabel
     */
    protected void initializeUI(final String titleLabelText, final JLabel pickerLabel) {
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetBaseVersionCommand.java`
#### Snippet
```java
     * Note: the changeset we return is in the first column and the last row
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetBaseVersionCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/GetBaseVersionCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param listener` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * when the command process finishes.
     *
     * @param listener
     */
    public void run(final Listener<T> listener) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * more specific message or we want the IDE to handle the error differently so subclasses can override this
     *
     * @return
     */
    protected boolean shouldThrowBadExitCode() {
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * This method is used by Checkin and CreateBranch to parse out the changeset number.
     *
     * @param buffer
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     *
     * @param buffer
     * @return
     */
    protected String getChangesetNumber(final String buffer) {
```

### JavadocDeclaration
`@param result` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         * set, the result parameter may be null.
         *
         * @param result
         * @param error
         */
```

### JavadocDeclaration
`@param error` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         *
         * @param result
         * @param error
         */
        void completed(final T result, final Throwable error);
```

### JavadocDeclaration
`@param output` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * Checks for the tf memory error
     *
     * @param output
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     *
     * @param output
     * @return
     */
    @VisibleForTesting
```

### JavadocDeclaration
`@param output` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         * This method is called to notify the owner of progress made by the command process.
         *
         * @param output
         * @param outputType
         * @param percentComplete
```

### JavadocDeclaration
`@param outputType` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         *
         * @param output
         * @param outputType
         * @param percentComplete
         */
```

### JavadocDeclaration
`@param percentComplete` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
         * @param output
         * @param outputType
         * @param percentComplete
         */
        void progress(final String output, final int outputType, final int percentComplete);
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * You should also limit this to fast local commands.
     *
     * @return
     */
    public T runSynchronously() {
```

### JavadocDeclaration
`@param returnCode` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/Command.java`
#### Snippet
```java
     * Default method for parsing return code that can be overridden if need be
     *
     * @param returnCode
     * @return returnCode
     */
```

### JavadocDeclaration
`@param gitPullRequestToCreate` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
     * [Preview API 3.1-preview.1] Create a git pull request
     *
     * @param gitPullRequestToCreate
     * @param repositoryId
     * @param linkBranchWorkitems
```

### JavadocDeclaration
`@param repositoryId` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
     *
     * @param gitPullRequestToCreate
     * @param repositoryId
     * @param linkBranchWorkitems
     * @param linkCommitWorkitems
```

### JavadocDeclaration
`@param linkBranchWorkitems` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
     * @param gitPullRequestToCreate
     * @param repositoryId
     * @param linkBranchWorkitems
     * @param linkCommitWorkitems
     * @return GitPullRequest
```

### JavadocDeclaration
`@param linkCommitWorkitems` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/rest/GitHttpClientEx.java`
#### Snippet
```java
     * @param repositoryId
     * @param linkBranchWorkitems
     * @param linkCommitWorkitems
     * @return GitPullRequest
     */
```

### JavadocDeclaration
`@param targetBranch` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
     * Set the target branch
     *
     * @param targetBranch
     */
    public synchronized void setTargetBranch(final GitRemoteBranch targetBranch) {
```

### JavadocDeclaration
`@param localVer` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
     * Types of statuses that are found on the server and how to process them
     *
     * @param localVer
     * @param isDirectory
     * @param sourceItem
```

### JavadocDeclaration
`@param isDirectory` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
     *
     * @param localVer
     * @param isDirectory
     * @param sourceItem
     * @param targetItem
```

### JavadocDeclaration
`@param sourceItem` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
     * @param localVer
     * @param isDirectory
     * @param sourceItem
     * @param targetItem
     */
```

### JavadocDeclaration
`@param targetItem` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/ServerStatus.java`
#### Snippet
```java
     * @param isDirectory
     * @param sourceItem
     * @param targetItem
     */
    protected ServerStatus(final int localVer,
```

### JavadocDeclaration
`@param stdout` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/ResolveConflictsCommand.java`
#### Snippet
```java
     * Resolved /Users/leantk/tfvc-tfs/tfsTest_01/addFold/testHere2 as KeepYours
     *
     * @param stdout
     * @param stderr
     * @return
```

### JavadocDeclaration
`@param stderr` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/ResolveConflictsCommand.java`
#### Snippet
```java
     *
     * @param stdout
     * @param stderr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/external/commands/ResolveConflictsCommand.java`
#### Snippet
```java
     * @param stdout
     * @param stderr
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentStoreFactory.java`
#### Snippet
```java
     * @param revision:   revision number of the file
     * @param actualPath: file path acknowledged by the server (could differ local path in case of renames)
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/revision/TFSContentStoreFactory.java`
#### Snippet
```java
     * @param actualPath: file path acknowledged by the server (could differ local path in case of renames)
     * @return
     * @throws IOException
     */
    public static TFSContentStore findOrCreate(final String localPath, final int revision, final String actualPath, final Project project) throws IOException {
```

### JavadocDeclaration
`@param type` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     * Returns the NTCredentials or UsernamePasswordCredentials object
     *
     * @param type
     * @param authenticationInfo
     * @return
```

### JavadocDeclaration
`@param authenticationInfo` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     *
     * @param type
     * @param authenticationInfo
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     * @param type
     * @param authenticationInfo
     * @return
     */
    public static Credentials getCredentials(final ServerContext.Type type, final AuthenticationInfo authenticationInfo) {
```

### JavadocDeclaration
`@param userName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     * Returns an NTCredentials object for given username and password
     *
     * @param userName
     * @param password
     * @return
```

### JavadocDeclaration
`@param password` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     *
     * @param userName
     * @param password
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
     * @param userName
     * @param password
     * @return
     */
    public static NTCredentials getNTCredentials(final String userName, final String password) {
```

### JavadocDeclaration
`@param query` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
         * Constructor for WitInputs with a field's parameter to only return the specified fields of the work item
         *
         * @param query
         * @param fields
         */
```

### JavadocDeclaration
`@param fields` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
         *
         * @param query
         * @param fields
         */
        public WitInputs(final String query, final List<String> fields) {
```

### JavadocDeclaration
`@param query` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/operations/WorkItemLookupOperation.java`
#### Snippet
```java
         * Constructor for WitInputs that will return all information of the work item
         *
         * @param query
         */
        public WitInputs(final String query) {
```

### JavadocDeclaration
`@param vstsDirectory` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
     * If no location is found or they mismatch, insert the new location into the file.
     *
     * @param vstsDirectory
     * @param currentLocation
     */
```

### JavadocDeclaration
`@param currentLocation` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
     *
     * @param vstsDirectory
     * @param currentLocation
     */
    protected void cacheIdeLocation(final File vstsDirectory, final String currentLocation) {
```

### JavadocDeclaration
`@param parentDirectory` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/setup/ApplicationStartup.java`
#### Snippet
```java
     * Create .vsts directory in user's home directory if not already there
     *
     * @param parentDirectory
     * @return the vsts directory
     */
```

### JavadocDeclaration
`@param teamProjectName` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextBuilder.java`
#### Snippet
```java
     * This method creates an incomplete TP reference that should be replaced later after getting more information
     * from the server.
     * @param teamProjectName
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextBuilder.java`
#### Snippet
```java
     * from the server.
     * @param teamProjectName
     * @return
     */
    public ServerContextBuilder teamProject(final String teamProjectName) {
```

### JavadocDeclaration
`@param gitRepository` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/DiffCompareInfoProvider.java`
#### Snippet
```java
     * list as a diff still
     *
     * @param gitRepository
     * @return compare info which contains empty commits and diff lists
     */
```

### JavadocDeclaration
`@param activeOperation` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
     * Only do this if another operation is not in progress though.
     *
     * @param activeOperation
     */
    protected void loadData(final Operation activeOperation, final Operation.Inputs inputs) {
```

### JavadocDeclaration
`@param repositoryContext` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/tabs/TabLookupListenerImpl.java`
#### Snippet
```java
     * Load data based on the repository context
     *
     * @param repositoryContext
     */
    public abstract void loadData(final RepositoryContext repositoryContext, final Operation.Inputs inputs);
```

### JavadocDeclaration
`@param name` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     * This method is a wrapper for the System.getenv method which cannot be mocked.
     *
     * @param name
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     *
     * @param name
     * @return
     */
    public static String getEnvironmentVariable(final String name) {
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
    /**
     * Convert a string value into an integer or a default value.
     * @return
     */
    public static int toInt(final String value, final int defaultValue) {
```

### JavadocDeclaration
`@param path1` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     * Compares to file paths to see if they are the same based on the OS that is being used
     *
     * @param path1
     * @param path2
     * @return
```

### JavadocDeclaration
`@param path2` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     *
     * @param path1
     * @param path2
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     * @param path1
     * @param path2
     * @return
     */
    public static boolean areFilePathsSame(final String path1, final String path2) {
```

### JavadocDeclaration
`@param path` tag description is missing
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java
     * Takes in a path and converts it to Unix standard if Windows OS is detected
     *
     * @param path
     * @return path with forward slashes
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * @param args command line args
     * @return SimpleCheckoutStarter with associated Git Url passed in args
     * @throws RuntimeException
     */
    public static SimpleCheckoutStarter createWithCommandLineArgs(final List<String> args) throws RuntimeException {
```

### JavadocDeclaration
`@param gitUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * Creates a SimpleCheckoutStarter object after verifying Git Url
     *
     * @param gitUrl
     * @return SimpleCheckoutStarter with associated Git Url
     * @throws RuntimeException
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * @param gitUrl
     * @return SimpleCheckoutStarter with associated Git Url
     * @throws RuntimeException
     */
    public static SimpleCheckoutStarter createWithGitUrl(final String gitUrl, final String ref) throws RuntimeException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * @param args Uri attributes
     * @return SimpleCheckoutStarter with URI's decoded Git Url
     * @throws RuntimeException
     * @throws UnsupportedEncodingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * @return SimpleCheckoutStarter with URI's decoded Git Url
     * @throws RuntimeException
     * @throws UnsupportedEncodingException
     */
    public static SimpleCheckoutStarter createWithUriAttributes(Map<String, String> args) throws RuntimeException, UnsupportedEncodingException {
```

### JavadocDeclaration
`@param gitUrl` tag description is missing
in `plugin/src/com/microsoft/alm/plugin/idea/git/starters/SimpleCheckoutStarter.java`
#### Snippet
```java
     * Private constructor so that Git Url can be checked as a precaution
     *
     * @param gitUrl
     */
    private SimpleCheckoutStarter(final String gitUrl, final String ref) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `eventDispatcher` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/servertree/TfsTreeForm.java`
#### Snippet
```java
    private JPanel messagePanel;
    private TfsTreeBuilder treeBuider;
    private EventDispatcher<SelectionListener> eventDispatcher = EventDispatcher.create(SelectionListener.class);
    private SelectedItem selectedItem; // have to cache selected item to be available after form is disposed

```

### FieldMayBeFinal
Field `fileSystemIgnoresCase` may be 'final'
in `plugin/src/com/microsoft/alm/common/utils/FileHelper.java`
#### Snippet
```java
     * test.
     */
    private static boolean fileSystemIgnoresCase;

    static {
```

### FieldMayBeFinal
Field `BRANCH_EXISTS_ERROR` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/commands/CreateBranchCommand.java`
#### Snippet
```java
    public static final Logger logger = LoggerFactory.getLogger(CreateBranchCommand.class);

    private static String BRANCH_EXISTS_ERROR = "An error occurred: The item %s already exists.";

    private final String workingFolder;
```

### FieldMayBeFinal
Field `listenerProxy` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
    private StreamProcessor standardOutProcessor;
    private ProcessWaiter processWaiter;
    private ListenerProxy listenerProxy;

    /**
```

### FieldMayBeFinal
Field `secretArgumentIndexes` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
        private static final String STARS = "********";
        private List<String> arguments = new ArrayList<String>(5);
        private Set<Integer> secretArgumentIndexes = new HashSet<Integer>(5);
        private String workingDirectory;

```

### FieldMayBeFinal
Field `arguments` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/ToolRunner.java`
#### Snippet
```java
    public static class ArgumentBuilder {
        private static final String STARS = "********";
        private List<String> arguments = new ArrayList<String>(5);
        private Set<Integer> secretArgumentIndexes = new HashSet<Integer>(5);
        private String workingDirectory;
```

### FieldMayBeFinal
Field `value` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/context/rest/VersionControlRecursionTypeCaseSensitive.java`
#### Snippet
```java
    FULL(120),;

    private int value;

    private VersionControlRecursionTypeCaseSensitive(final int value) {
```

### FieldMayBeFinal
Field `PROGRAM_FILE_PATHS` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/tools/TfTool.java`
#### Snippet
```java
            new File("/usr/local")};

    private static File[] PROGRAM_FILE_PATHS = {
            new File(SYSTEM_DRIVE, "Program Files"),
            new File(SYSTEM_DRIVE, "Program Files (x86)"),
```

### FieldMayBeFinal
Field `validationListenerContainer` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
    private JTabbedPane tabPanel;
    private ActionListenerContainer listenerContainer = new ActionListenerContainer();
    private ValidationListenerContainer validationListenerContainer = new ValidationListenerContainer();
    private final Project project;
    private final boolean showFeedback;
```

### FieldMayBeFinal
Field `listenerContainer` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/BaseDialogImpl.java`
#### Snippet
```java
public class BaseDialogImpl extends DialogWrapper implements BaseDialog {
    private JTabbedPane tabPanel;
    private ActionListenerContainer listenerContainer = new ActionListenerContainer();
    private ValidationListenerContainer validationListenerContainer = new ValidationListenerContainer();
    private final Project project;
```

### FieldMayBeFinal
Field `authenticationProvider` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/VsoImportPageModel.java`
#### Snippet
```java
 */
public class VsoImportPageModel extends ImportPageModelImpl {
    private VsoAuthenticationProvider authenticationProvider = VsoAuthenticationProvider.getInstance();
    private static final Logger logger = LoggerFactory.getLogger(VsoImportPageModel.class);

```

### FieldMayBeFinal
Field `myVcs` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFSChangeList.java`
#### Snippet
```java
    private static final SimpleDateFormat TFVC_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    private TFSVcs myVcs;
    private int changeSetId;
    private String author;
```

### FieldMayBeFinal
Field `timer` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/BusySpinnerPanel.java`
#### Snippet
```java
public class BusySpinnerPanel extends JPanel implements Disposable {
    private int rotationAngle = 0;
    private Timer timer;

    public BusySpinnerPanel() {
```

### FieldMayBeFinal
Field `owner` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/controls/BusySpinnerPanel.java`
#### Snippet
```java
    private static class TimerListener implements ActionListener {

        private BusySpinnerPanel owner;

        public TimerListener(BusySpinnerPanel owner) {
```

### FieldMayBeFinal
Field `myConflicts` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/resolve/ConflictsTableModel.java`
#### Snippet
```java
    }

    private List<Conflict> myConflicts = new ArrayList<Conflict>();

    @Override
```

### FieldMayBeFinal
Field `contextMap` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/context/ServerContextManager.java`
#### Snippet
```java
    private final String TFS2015_NEW_SERVICE = "distributedtask";

    private Map<String, ServerContext> contextMap = new HashMap<String, ServerContext>();

    private static class Holder {
```

### FieldMayBeFinal
Field `pageModel` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/LoginPageModelImpl.java`
#### Snippet
```java
    private String userName = "";
    private String serverName = "";
    private PageModel pageModel;

    public LoginPageModelImpl(final PageModel pageModel) {
```

### FieldMayBeFinal
Field `authenticationProvider` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/VsoCheckoutPageModel.java`
#### Snippet
```java
public class VsoCheckoutPageModel extends CheckoutPageModelImpl {
    private static final Logger logger = LoggerFactory.getLogger(VsoCheckoutPageModel.class);
    private VsoAuthenticationProvider authenticationProvider = VsoAuthenticationProvider.getInstance();
    private final ServerContextLookupOperation.ContextScope scope;

```

### FieldMayBeFinal
Field `messageKey` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/exceptions/TeamServicesException.java`
#### Snippet
```java
public class TeamServicesException extends RuntimeException implements LocalizedException {

    private String messageKey;

    @Override
```

### FieldMayBeFinal
Field `selectionModel` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/PullRequestsTreeModel.java`
#### Snippet
```java
    private final PRTreeNode requestedByMeRoot;
    private final PRTreeNode assignedToMeRoot;
    private TreeSelectionModel selectionModel;
    private final List<GitPullRequest> allRequestedByMePullRequests;
    private final List<GitPullRequest> allAssignedToMePullRequests;
```

### FieldMayBeFinal
Field `selectionModel` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java
    };

    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<WorkItem> rows = new ArrayList<WorkItem>(100);
    private List<WorkItem> filteredRows = null;
```

### FieldMayBeFinal
Field `rows` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/WorkItemsTableModel.java`
#### Snippet
```java

    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<WorkItem> rows = new ArrayList<WorkItem>(100);
    private List<WorkItem> filteredRows = null;
    private String filter;
```

### FieldMayBeFinal
Field `INSTANCE` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/services/PluginServiceProvider.java`
#### Snippet
```java

    private static class ProviderHolder {
        private static PluginServiceProvider INSTANCE = new PluginServiceProvider();
    }

```

### FieldMayBeFinal
Field `INSTANCE` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/services/LocalizationServiceImpl.java`
#### Snippet
```java

    private static class Holder {
        private static LocalizationServiceImpl INSTANCE = new LocalizationServiceImpl();
    }

```

### FieldMayBeFinal
Field `DEFAULT_INSTANCE` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/settings/TeamServicesSettingsService.java`
#### Snippet
```java

    // This default instance is only returned in the case of tests or we are somehow running outside of IntelliJ
    private static TeamServicesSettingsService DEFAULT_INSTANCE = new TeamServicesSettingsService();

    public static TeamServicesSettingsService getInstance() {
```

### FieldMayBeFinal
Field `messageKey` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/external/exceptions/ToolException.java`
#### Snippet
```java
public class ToolException extends RuntimeException implements LocalizedException {

    private String messageKey;

    @Override
```

### FieldMayBeFinal
Field `selectionModel` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java
    };

    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<ServerContext> rows = new ArrayList<ServerContext>(1000);
    private List<ServerContext> filteredRows = null;
```

### FieldMayBeFinal
Field `rows` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ServerContextTableModel.java`
#### Snippet
```java

    private ListSelectionModel selectionModel = new DefaultListSelectionModel();
    private List<ServerContext> rows = new ArrayList<ServerContext>(1000);
    private List<ServerContext> filteredRows = null;
    private String filter;
```

### FieldMayBeFinal
Field `contextMap` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/context/RepositoryContextManager.java`
#### Snippet
```java
    private static final Logger logger = LoggerFactory.getLogger(RepositoryContextManager.class);

    private Map<String, RepositoryContext> contextMap = new HashMap<String, RepositoryContext>();

    public static RepositoryContextManager getInstance() {
```

### FieldMayBeFinal
Field `gitRepository` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java

    private Project project;
    private GitRepository gitRepository;
    private GitRemoteBranch targetBranch;
    private String title;
```

### FieldMayBeFinal
Field `actionListeners` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ActionListenerContainer.java`
#### Snippet
```java

public class ActionListenerContainer {
    private java.util.List<ActionListener> actionListeners = new ArrayList<ActionListener>();

    public void triggerEvent(final ActionEvent event) {
```

### FieldMayBeFinal
Field `remoteBranchComboModel` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java
    private String branchName;
    private GitRemoteBranch selectedRemoteBranch;
    private SortedComboBoxModel<GitRemoteBranch> remoteBranchComboModel;
    private boolean checkoutBranch = true;
    private boolean branchWasCreated = false;
```

### FieldMayBeFinal
Field `ourLogger` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/settings/ProjectConfigurableForm.java`
#### Snippet
```java

public class ProjectConfigurableForm {
    private static Logger ourLogger = Logger.getInstance(ProjectConfigurableForm.class);

    private JButton myManageButton;
```

### FieldMayBeFinal
Field `ENABLE_DEVICE_FLOW_VALUE` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java

    private static String DEVICE_FLOW_PROPERTY = "userAgentProvider";
    private static String ENABLE_DEVICE_FLOW_VALUE = "none";

    /**
```

### FieldMayBeFinal
Field `DEVICE_FLOW_PROPERTY` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java
    private final static Logger logger = LoggerFactory.getLogger(AuthHelper.class);

    private static String DEVICE_FLOW_PROPERTY = "userAgentProvider";
    private static String ENABLE_DEVICE_FLOW_VALUE = "none";

```

### FieldMayBeFinal
Field `repositoryType` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/checkout/CheckoutForm.java`
#### Snippet
```java
    private JCheckBox serverWorkspaceCheckBox;
    private boolean initialized = false;
    private RepositoryContext.Type repositoryType;
    private Timer timer;

```

### FieldMayBeFinal
Field `validationListeners` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/ValidationListenerContainer.java`
#### Snippet
```java

public class ValidationListenerContainer {
    private List<ValidationListener> validationListeners = new ArrayList<ValidationListener>();

    public ValidationInfo doValidate() {
```

### FieldMayBeFinal
Field `timer` may be 'final'
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/workitem/SelectWorkItemsForm.java`
#### Snippet
```java
    private HelpPanel helpPanel;
    private boolean initialized = false;
    private Timer timer;

    @NonNls
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `plugin/src/com/microsoft/alm/common/utils/SystemHelper.java`
#### Snippet
```java

public class SystemHelper {
    private static Logger logger = LoggerFactory.getLogger(SystemHelper.class);
    private final static String COMPUTER_NAME = "computername";

```

## RuleId[id=UnnecessaryLocalVariable]
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
Local variable `tokenDescription` is redundant
in `plugin/src/com/microsoft/alm/plugin/authentication/AuthHelper.java`
#### Snippet
```java

    public static String getTokenDescription(final String emailAddress) {
        final String tokenDescription = String.format(TOKEN_DESCRIPTION_FORMATTER,
                emailAddress, SystemHelper.getComputerName(), new Date().toString());

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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugin/src/com/microsoft/alm/plugin/idea/common/ui/common/treetable/CustomTreeTable.java`
#### Snippet
```java

    public CustomTreeTable(final CellRenderer<T> renderer, final boolean showCellFocus, final boolean showSelection) {
        this(Arrays.asList(new FakeColumn<T>()), new FakeContentProvider<T>(), renderer, showCellFocus, showSelection);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
            try {
                progressIndicator.setText(TfPluginBundle.message(TfPluginBundle.KEY_TFVC_CONFLICT_RESOLVING_STATUS, conflict.getLocalPath()));
                final List<Conflict> resolved = CommandUtils.resolveConflictsByConflict(TFSVcs.getInstance(project).getServerContext(false), Arrays.asList(conflict), type);

                // check if error is a rename so the correct file name is displayed in the Update Info tab
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java
                    }
                } else {
                    skip(Arrays.asList(conflict));
                }
            } catch (Exception e) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/tfs/conflicts/ResolveConflictHelper.java`
#### Snippet
```java

        try {
            final List<Conflict> resolvedConflicts = CommandUtils.resolveConflictsByPath(context, Arrays.asList(localPath), type);
            if (resolvedConflicts.size() == 1 && nameMergerResolution != null) {
                // Use the local path returned by the Resolve command for future needs.
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/branch/CreateBranchModel.java`
#### Snippet
```java

            logger.info("CreateBranchModel.createBranch sending create ref call to server");
            final List<GitRefUpdateResult> results = context.getGitHttpClient().updateRefs(Arrays.asList(gitRefUpdate),
                    context.getGitRepository().getId(), context.getTeamProjectReference().getId().toString());

```

## RuleId[id=PointlessBooleanExpression]
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
`((CredInputsImpl) inputs).getPromptForCreds() == true` can be simplified to '((CredInputsImpl) inputs).getPromptForCreds()'
in `plugin/src/com/microsoft/alm/plugin/operations/PullRequestLookupOperation.java`
#### Snippet
```java
        final ServerContext context;

        if (((CredInputsImpl) inputs).getPromptForCreds() == true) {
            final List<ServerContext> authenticatedContexts = new ArrayList<ServerContext>();
            final List<Future> authTasks = new ArrayList<Future>();
```

## RuleId[id=UseBulkOperation]
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

## RuleId[id=UnusedSymbol]
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
Function "tryGetWorkspace" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/ClientEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun VersionControlClient.tryGetWorkspace(path: TfsPath): Workspace? = when(path) {
    is TfsLocalPath -> tryGetWorkspace(path.path)
    is TfsServerPath -> {
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
Property "lockStatus" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
    get() = if (itemType == ItemType.FILE) encodingName else null

private val ExtendedItem.lockStatus
    get() = lockLevel.toUIString()

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
Function "toCanonicalPathItemSpec" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
}

fun TfsPath.toCanonicalPathItemSpec(recursionType: RecursionType): ItemSpec =
    ItemSpec(toCanonicalPathString(), recursionType)

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
Property "fileEncodingName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else encoding?.name

private val ExtendedItem.fileEncodingName
    get() = if (itemType == ItemType.FILE) encodingName else null

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
Property "itemTypeName" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/DataConversion.kt`
#### Snippet
```java
        else pendingChange.toUIString(false, this)

private val ExtendedItem.itemTypeName
    get() = itemType.toUIString()

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
Function "isPathMapped" is never used
in `client/backend/src/main/kotlin/com/microsoft/tfs/sdk/WorkspaceEx.kt`
#### Snippet
```java
import com.microsoft.tfs.model.host.TfsServerPath

fun Workspace.isPathMapped(path: TfsPath): Boolean = when (path) {
    is TfsLocalPath -> isLocalPathMapped(path.path)
    is TfsServerPath -> isServerPathMapped(path.path)
```

## RuleId[id=UnstableApiUsage]
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
'NotificationGroup(java.lang.String, com.intellij.notification.NotificationDisplayType, boolean)' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/core/TFVCNotifications.java`
#### Snippet
```java

public class TFVCNotifications {
    private static final NotificationGroup TFS_NOTIFICATIONS = new NotificationGroup(
            TfPluginBundle.message(TfPluginBundle.KEY_TFVC_NOTIFICATIONS),
            NotificationDisplayType.BALLOON,
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
in `plugin/src/com/microsoft/alm/plugin/idea/tfvc/ui/management/ManageWorkspacesModel.java`
#### Snippet
```java

        try {
            VcsUtil.runVcsProcessWithProgress(new VcsRunnable() {
                public void run() throws VcsException {
                    editWorkspace(selectedWorkspace, update);
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
                    deleteWorkspace(selectedWorkspace);
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

    public void setGitCommitCompareInfo(final GitCommitCompareInfo gitCommitCompareInfo) {
        this.gitCommitCompareInfo = gitCommitCompareInfo;
    }
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
    private String sourceBranchHash;
    private String targetBranchHash;
    private GitCommitCompareInfo gitCommitCompareInfo;
    private GitRepository gitRepository;

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
'notifyError(java.lang.@com.intellij.openapi.util.NlsContexts.NotificationTitle @org.jetbrains.annotations.NotNull String, java.lang.@com.intellij.openapi.util.NlsContexts.NotificationContent @org.jetbrains.annotations.NotNull String, com.intellij.notification.@org.jetbrains.annotations.Nullable NotificationListener)' is scheduled for removal in version 2020.4
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/vcsimport/ImportPageModelImpl.java`
#### Snippet
```java

    private void notifyImportError(final Project project, final String message) {
        VcsNotifier.getInstance(project).notifyError(TfPluginBundle.message(TfPluginBundle.KEY_IMPORT_FAILED), message, NotificationListener.URL_OPENING_LISTENER);
    }

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
'git4idea.util.GitCommitCompareInfo' is scheduled for removal in version 2021.3
in `plugin/src/com/microsoft/alm/plugin/idea/git/ui/pullrequest/CreatePullRequestModel.java`
#### Snippet
```java
    private GitChangesContainer localBranchChanges;

    private final LoadingCache<Pair<String, String>, GitCommitCompareInfo> diffCache;

    /* Executor service for running diff calculating Futures */
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

        try {
            GitCommitCompareInfo changes
                    = this.diffCache.get(new Pair<String, String>(currBranchHash, remoteBranchHash));

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
                        new CacheLoader<Pair<String, String>, GitCommitCompareInfo>() {
                            @Override
                            public GitCommitCompareInfo load(Pair<String, String> key) throws Exception {
                                // if we missed the cache, then show the loading spinner, otherwise
                                // just switch to the diff we have to avoid flickering the screen
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

    public GitCommitCompareInfo getBranchCompareInfo(final Project project, final GitRepository gitRepository,
                                                     final String source, final String target)
            throws VcsException {
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

