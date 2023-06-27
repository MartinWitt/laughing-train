# xtext-web 
 
# Bad smells
I found 1081 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 705 | false |
| UnstableApiUsage | 145 | false |
| UNUSED_IMPORT | 51 | false |
| ConstantValue | 30 | false |
| TrivialIf | 26 | false |
| SwitchStatementWithTooFewBranches | 20 | false |
| RedundantCast | 17 | false |
| UnnecessaryLocalVariable | 17 | true |
| DataFlowIssue | 12 | false |
| TypeParameterExtendsObject | 9 | false |
| PointlessArithmeticExpression | 8 | false |
| UnusedAssignment | 7 | false |
| StringBufferReplaceableByString | 6 | false |
| JavadocLinkAsPlainText | 6 | false |
| JavadocReference | 3 | false |
| DuplicatedCode | 3 | false |
| UnnecessaryReturn | 3 | true |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| FieldMayBeFinal | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| EmptyStatementBody | 1 | false |
| TrivialStringConcatenation | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strings.size()\]'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverService.java`
#### Snippet
```java
					.transform(((AlternativeImageDescription) it).getImageIDs(), (String s) -> s + "-icon");
			return surroundWithDiv(nameHtml,
					strings.toArray(new String[strings.size()]));
		} else if (it instanceof DecoratedImageDescription) {
			return IterableExtensions.fold(
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/IServiceContext.java`
#### Snippet
```java
   * Key for the service type parameter, which determines the actual service to be invoked.
   */
  static String SERVICE_TYPE = "serviceType";
  
  /**
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`31 * 1` can be replaced with '31'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return 31 * 1 + ((this.issues == null) ? 0 : this.issues.hashCode());
	}

```

### PointlessArithmeticExpression
`31 * 1` can be replaced with '31'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return 31 * 1 + ((this.regions == null) ? 0 : this.regions.hashCode());
	}

```

### PointlessArithmeticExpression
`SIGNAL_FEATURE_COUNT + 0` can be replaced with 'SIGNAL_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @ordered
   */
  int INPUT_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

  /**
```

### PointlessArithmeticExpression
`SIGNAL_FEATURE_COUNT + 0` can be replaced with 'SIGNAL_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @ordered
   */
  int OUTPUT_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

  /**
```

### PointlessArithmeticExpression
`ABSTRACT_ELEMENT_FEATURE_COUNT + 0` can be replaced with 'ABSTRACT_ELEMENT_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
```

### PointlessArithmeticExpression
`FEATURE_FEATURE_COUNT + 0` can be replaced with 'FEATURE_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @ordered
   */
  int OPERATION__PARAMS = FEATURE_FEATURE_COUNT + 0;

  /**
```

### PointlessArithmeticExpression
`FEATURE_FEATURE_COUNT + 0` can be replaced with 'FEATURE_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
```

### PointlessArithmeticExpression
`ABSTRACT_ELEMENT_FEATURE_COUNT + 0` can be replaced with 'ABSTRACT_ELEMENT_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `getFileName(String,String)` is inaccessible from here
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
	 * match the name of one of the generator results; each name is created by
	 * concatenating the output configuration name and the file name (see
	 * {@link InMemoryFileSystemAccess#getFileName(String,String)}). If artifactId
	 * is null, {@link #DEFAULT_ARTIFACT} is used as identifier. If the requested
	 * artifact is in {@link IFileSystemAccess#DEFAULT_OUTPUT}, the output
```

### JavadocReference
Cannot resolve symbol `getResult(XtextWebDocumentAccess)`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingService.java`
#### Snippet
```java
	 * Compute the highlighting result for the given document. This method should
	 * not be called directly from the service dispatcher; use
	 * {@link #getResult(XtextWebDocumentAccess)} instead in order to avoid
	 * duplicate computations.
	 */
```

### JavadocReference
Cannot resolve symbol `XtextWebDocumentAccess`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingService.java`
#### Snippet
```java
	 * Compute the highlighting result for the given document. This method should
	 * not be called directly from the service dispatcher; use
	 * {@link #getResult(XtextWebDocumentAccess)} instead in order to avoid
	 * duplicate computations.
	 */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/FileResourceHandler.java`
#### Snippet
```java
			}
		} catch (Throwable e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(exception.getCause())` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/FileResourceHandler.java`
#### Snippet
```java
			return document;
		} catch (WrappedException exception) {
			throw Exceptions.sneakyThrow(exception.getCause());
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentSynchronizer.java`
#### Snippet
```java
			return false;
		} catch (InterruptedException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocument.java`
#### Snippet
```java
			refreshText();
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/HttpServiceContext.java`
#### Snippet
```java
			return null;
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			return document;
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(t)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
					return resourceHandler.get(resourceId, context);
				} catch (Throwable t) {
					throw Exceptions.sneakyThrow(t);
				}
			});
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(t)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
				return null;
			} else {
				throw Exceptions.sneakyThrow(t);
			}
		}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(throwable)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			return new ServiceConflictResult("canceled");
		}
		throw Exceptions.sneakyThrow(throwable);
	}

```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextResourcesServlet.java`
#### Snippet
```java
			}
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

### DataFlowIssue
Dereference of `Exceptions.sneakyThrow(e)` will produce `NullPointerException`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
			return result;
		} catch (Exception e) {
			throw Exceptions.sneakyThrow(e);
		}
	}
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.xtext.web.example.statemachine.ide/src/org/eclipse/xtext/web/example/statemachine/ide/StatemachineWebContentProposalProvider.java`
#### Snippet
```java
				acceptor.accept(entry, getProposalPriorities().getCrossRefPriority(description_1, entry));
			}
		} else if (assignment == statemachineGrammarAccess.getEventAccess().getValueAssignment_2()
				|| assignment == statemachineGrammarAccess.getCommandAccess().getNewValueAssignment_3()) {
			// Proposals are created by RuleCall dispatch method
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PACKAGE_DECLARATION__ELEMENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PACKAGE_DECLARATION__ELEMENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PACKAGE_DECLARATION__ELEMENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PACKAGE_DECLARATION__ELEMENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PACKAGE_DECLARATION__ELEMENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ABSTRACT_ELEMENT__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ABSTRACT_ELEMENT__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ABSTRACT_ELEMENT__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ABSTRACT_ELEMENT__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.CONDITION__EVENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.CONDITION__EVENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StatemachinePackage.CONDITION__EVENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StatemachinePackage.CONDITION__EVENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatemachinePackage.CONDITION__EVENTS:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.FEATURE__TYPE:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StatemachinePackage.TRANSITION__CONDITION:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StatemachinePackage.SIGNAL__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.SIGNAL__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.SIGNAL__NAME:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatemachinePackage.SIGNAL__NAME:
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    entitiesEClass = createEClass(ENTITIES);
    createEReference(entitiesEClass, ENTITIES__IMPORT_SECTION);
    createEReference(entitiesEClass, ENTITIES__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			int deltaOffset = getInt(context, "deltaOffset", Optional.absent());
			if (deltaOffset < 0) {
				throw new InvalidRequestException.InvalidParametersException(
						"The parameter 'deltaOffset' must not be negative.");
			}
			int deltaReplaceLength = getInt(context, "deltaReplaceLength", Optional.absent());
			if (deltaReplaceLength < 0) {
				throw new InvalidRequestException.InvalidParametersException(
						"The parameter 'deltaReplaceLength' must not be negative.");
			}
```

### DuplicatedCode
Duplicated code
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		XtextWebDocumentAccess document = getDocumentAccess(context);
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		serviceDescriptor.service = () -> {
			try {
				return validationService.getResult(document);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		};
		return serviceDescriptor;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (newValue: ");
    result.append(newValue);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
								// The document has changed since we executed our synchronous work - stop
								// precomputation
								return;
							} catch (Throwable throwable) {
								if (operationCanceledManager.isOperationCanceledException(throwable)) {
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
		if (entity instanceof Entity) {
			_infer((Entity) entity, acceptor, prelinkingPhase);
			return;
		} else if (entity != null) {
			_infer(entity, acceptor, prelinkingPhase);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
		} else if (entity != null) {
			_infer(entity, acceptor, prelinkingPhase);
			return;
		} else {
			throw new IllegalArgumentException(
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		} else {
			throw new IllegalArgumentException(
					"Unhandled parameter types: " + Arrays.asList(service, exception).toString());
		}
	}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
		} else {
			throw new IllegalArgumentException(
					"Unhandled parameter types: " + Arrays.asList(entity, acceptor, prelinkingPhase).toString());
		}
	}
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/generator/StatemachineGenerator.java`
#### Snippet
```java

	private CharSequence generateHtml(Statemachine statemachine) {
		return ""
				+ "<!DOCTYPE html>\n"
				+ "<html>\n"
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/scoping/StatemachineScopeProvider.java`
#### Snippet
```java
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/generator/StatemachineGenerator.java`
#### Snippet
```java
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class StatemachineGenerator extends AbstractGenerator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/validation/StatemachineValidator.java`
#### Snippet
```java
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class StatemachineValidator extends AbstractStatemachineValidator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelHelper.java`
#### Snippet
```java

/**
 * @author Lorenzo Bettini - Initial contribution and API, https://github.com/eclipse/xtext-eclipse/issues/1205
 */
public class EntitiesJvmModelHelper {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class EntitiesValidator extends AbstractEntitiesValidator {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/scoping/EntitiesScopeProvider.java`
#### Snippet
```java
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
			return false;
		if (stateId == null) {
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
			return false;
		if (writeRegions == null) {
			if (other.writeRegions != null)
				return false;
		} else if (!writeRegions.equals(other.writeRegions))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
			if (other.writeRegions != null)
				return false;
		} else if (!writeRegions.equals(other.writeRegions))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
				return false;
			if (this.length == null) {
				if (other.length != null)
					return false;
			} else if (!this.length.equals(other.length))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
				if (other.length != null)
					return false;
			} else if (!this.length.equals(other.length))
				return false;
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		ValidationResult other = (ValidationResult) obj;
		if (this.issues == null) {
			if (other.issues != null)
				return false;
		} else if (!this.issues.equals(other.issues))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			if (other.issues != null)
				return false;
		} else if (!this.issues.equals(other.issues))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		HighlightingResult other = (HighlightingResult) obj;
		if (this.regions == null) {
			if (other.regions != null)
				return false;
		} else if (!this.regions.equals(other.regions))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			if (other.regions != null)
				return false;
		} else if (!this.regions.equals(other.regions))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
				return false;
			if (this.styleClasses == null) {
				if (other.styleClasses != null)
					return false;
			} else if (!Arrays.deepEquals(this.styleClasses, other.styleClasses))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
				if (other.styleClasses != null)
					return false;
			} else if (!Arrays.deepEquals(this.styleClasses, other.styleClasses))
				return false;
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
			GeneratedArtifacts other = (GeneratedArtifacts) obj;
			if (artifacts == null) {
				if (other.artifacts != null)
					return false;
			} else if (!artifacts.equals(other.artifacts))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
				if (other.artifacts != null)
					return false;
			} else if (!artifacts.equals(other.artifacts))
				return false;
			return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
			return false;
		if (stateId == null) {
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
		DocumentStateResult other = (DocumentStateResult) obj;
		if (stateId == null) {
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
			return false;
		if (stateId == null) {
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
		ServiceConflictResult other = (ServiceConflictResult) obj;
		if (conflict == null) {
			if (other.conflict != null)
				return false;
		} else if (!conflict.equals(other.conflict))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
			if (other.conflict != null)
				return false;
		} else if (!conflict.equals(other.conflict))
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultValue'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
	 *                                                            is absent
	 */
	protected boolean getBoolean(IServiceContext context, String key, Optional<Boolean> defaultValue)
			throws InvalidRequestException.InvalidParametersException {
		String stringValue = context.getParameter(key);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultValue'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
	 *                                                            is absent
	 */
	protected int getInt(IServiceContext context, String key, Optional<Integer> defaultValue)
			throws InvalidRequestException.InvalidParametersException {
		String stringValue = context.getParameter(key);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultValue'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
	 *                                                            is absent
	 */
	protected String getString(IServiceContext context, String key, Optional<String> defaultValue)
			throws InvalidRequestException.InvalidParametersException {
		String stringValue = context.getParameter(key);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.*;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
package org.eclipse.xtext.web.example.entities.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.*;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.impl.*;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.util.EcoreUtil;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/parser/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
package org.eclipse.xtext.web.example.entities.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.*;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.impl.*;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.util.EcoreUtil;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.EObject;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.Map;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/internal/InternalEntitiesParser.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.*;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
package org.eclipse.xtext.web.example.statemachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.*;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.impl.*;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.util.EcoreUtil;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.antlr.XtextTokenStream;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.web.example.statemachine.services.StatemachineGrammarAccess;
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/parser/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineLexer.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
package org.eclipse.xtext.web.example.statemachine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.*;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.impl.*;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.util.EcoreUtil;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.emf.ecore.EObject;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.antlr.XtextTokenStream;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
```

### UNUSED_IMPORT
Unused import `import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.web.example.statemachine.services.StatemachineGrammarAccess;

```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/internal/InternalStatemachineParser.java`
#### Snippet
```java
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
					}
				}
			}).replaceAll("(\\n|\\f|\\r)+", " ");
			LOG.trace("xtext-service/" + serviceType + stringParams);
		}
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `JvmParameterizedTypeReference` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
    {
      case DomainmodelPackage.ENTITY__SUPER_TYPE:
        setSuperType((JvmParameterizedTypeReference)null);
        return;
      case DomainmodelPackage.ENTITY__FEATURES:
```

### RedundantCast
Casting `null` to `XImportSection` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
    {
      case DomainmodelPackage.ENTITIES__IMPORT_SECTION:
        setImportSection((XImportSection)null);
        return;
      case DomainmodelPackage.ENTITIES__ELEMENTS:
```

### RedundantCast
Casting `null` to `JvmTypeReference` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
        return;
      case DomainmodelPackage.FEATURE__TYPE:
        setType((JvmTypeReference)null);
        return;
    }
```

### RedundantCast
Casting `null` to `Condition` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
    {
      case StatemachinePackage.TRANSITION__CONDITION:
        setCondition((Condition)null);
        return;
      case StatemachinePackage.TRANSITION__STATE:
```

### RedundantCast
Casting `null` to `State` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
        return;
      case StatemachinePackage.TRANSITION__STATE:
        setState((State)null);
        return;
    }
```

### RedundantCast
Casting `null` to `Signal` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
    {
      case StatemachinePackage.COMMAND__SIGNAL:
        setSignal((Signal)null);
        return;
      case StatemachinePackage.COMMAND__NEW_VALUE:
```

### RedundantCast
Casting `null` to `Signal` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
    {
      case StatemachinePackage.EVENT__SIGNAL:
        setSignal((Signal)null);
        return;
      case StatemachinePackage.EVENT__VALUE:
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
						if (f instanceof Property) {
							// for properties we create a field, a getter and a setter
							JvmField field = jvmTypesBuilder.toField(f, ((Property) f).getName(),
									((Property) f).getType());
							it.getMembers().add(field);
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
							// for properties we create a field, a getter and a setter
							JvmField field = jvmTypesBuilder.toField(f, ((Property) f).getName(),
									((Property) f).getType());
							it.getMembers().add(field);
							it.getMembers().add(
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
							it.getMembers().add(field);
							it.getMembers().add(
									jvmTypesBuilder.toGetter(f, ((Property) f).getName(), ((Property) f).getType()));
							it.getMembers().add(
									jvmTypesBuilder.toSetter(f, ((Property) f).getName(), ((Property) f).getType()));
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
							it.getMembers().add(field);
							it.getMembers().add(
									jvmTypesBuilder.toGetter(f, ((Property) f).getName(), ((Property) f).getType()));
							it.getMembers().add(
									jvmTypesBuilder.toSetter(f, ((Property) f).getName(), ((Property) f).getType()));
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
									jvmTypesBuilder.toGetter(f, ((Property) f).getName(), ((Property) f).getType()));
							it.getMembers().add(
									jvmTypesBuilder.toSetter(f, ((Property) f).getName(), ((Property) f).getType()));
						} else if (f instanceof Operation) {
							// operations are mapped to methods
```

### RedundantCast
Casting `f` to `Property` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
									jvmTypesBuilder.toGetter(f, ((Property) f).getName(), ((Property) f).getType()));
							it.getMembers().add(
									jvmTypesBuilder.toSetter(f, ((Property) f).getName(), ((Property) f).getType()));
						} else if (f instanceof Operation) {
							// operations are mapped to methods
```

### RedundantCast
Casting `f` to `Operation` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
							// operations are mapped to methods
							JvmTypeReference operationType = null;
							if (((Operation) f).getType() != null) {
								operationType = ((Operation) f).getType();
							} else {
```

### RedundantCast
Casting `f` to `Operation` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
							JvmTypeReference operationType = null;
							if (((Operation) f).getType() != null) {
								operationType = ((Operation) f).getType();
							} else {
								operationType = jvmTypesBuilder.inferredType();
```

### RedundantCast
Casting `f` to `Operation` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
								operationType = jvmTypesBuilder.inferredType();
							}
							it.getMembers().add(jvmTypesBuilder.toMethod(f, ((Operation) f).getName(), operationType,
									(JvmOperation o) -> {
										jvmTypesBuilder.setDocumentation(o, jvmTypesBuilder.getDocumentation(f));
```

### RedundantCast
Casting `null` to `XExpression` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
        return;
      case DomainmodelPackage.OPERATION__BODY:
        setBody((XExpression)null);
        return;
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelSwitch()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Entities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntities(Entities object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelSwitch<T> extends Switch<T>
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDeclarationImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class PackageDeclarationImpl extends AbstractElementImpl implements PackageDeclaration
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends AbstractElementImpl implements Entity
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference superType;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(JvmParameterizedTypeReference newSuperType, NotificationChain msgs)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntitiesImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class EntitiesImpl extends MinimalEObjectImpl.Container implements Entities
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getImportSection()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * @see #getImportSection()
   * @generated
   * @ordered
   */
  protected XImportSection importSection;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainmodelFactory init()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelFactoryImpl extends EFactoryImpl implements DomainmodelFactory
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactoryImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/OutputSignalImpl.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputSignalImpl extends SignalImpl implements OutputSignal
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/OutputSignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/OutputSignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputSignalImpl()
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement()
 * @model
 * @generated
 */
public interface AbstractElement extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement_Name()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement_Name()
   * @model
   * @generated
   */
  String getName();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command
   * @generated
   */
  public Adapter createCommandAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event
   * @generated
   */
  public Adapter createEventAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal
   * @generated
   */
  public Adapter createInputSignalAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine
   * @generated
   */
  public Adapter createStatemachineAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineSwitch<Adapter> modelSwitch =
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal
   * @generated
   */
  public Adapter createSignalAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
public class StatemachineAdapterFactory extends AdapterFactoryImpl
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State
   * @generated
   */
  public Adapter createStateAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal
   * @generated
   */
  public Adapter createOutputSignalAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatemachineAdapterFactory()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StatemachinePackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Output Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputSignal(OutputSignal object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Input Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputSignal(InputSignal object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StatemachinePackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatemachineSwitch()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignal(Signal object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Statemachine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatemachine(Statemachine object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
public class StatemachineSwitch<T> extends Switch<T>
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getNestedStates()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * @see #getNestedStates()
   * @generated
   * @ordered
   */
  protected EList<State> nestedStates;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class AbstractElementImpl extends MinimalEObjectImpl.Container implements AbstractElement
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractElementImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entities</em>'.
   * @generated
   */
  Entities createEntities();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelFactory eINSTANCE = org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelFactoryImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
public interface DomainmodelFactory extends EFactory
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainmodelPackage getDomainmodelPackage();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Property.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getProperty()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Property.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @see #setValue(boolean)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Value()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Value()
   * @model
   * @generated
   */
  boolean isValue();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @see #setSignal(Signal)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Signal()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Signal()
   * @model
   * @generated
   */
  Signal getSignal();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends AbstractElement
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @see #setSuperType(JvmParameterizedTypeReference)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_SuperType()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_SuperType()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getSuperType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(JvmParameterizedTypeReference value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatemachineFactoryImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StatemachineFactory init()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachineFactoryImpl extends EFactoryImpl implements StatemachineFactory
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #isNewValue()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * @see #isNewValue()
   * @generated
   * @ordered
   */
  protected static final boolean NEW_VALUE_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected Signal signal;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSignal()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #isNewValue()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
   * @see #isNewValue()
   * @generated
   * @ordered
   */
  protected boolean newValue = NEW_VALUE_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @see #setType(JvmTypeReference)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Type()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Name()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signal> signals;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PropertyImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PropertyImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PropertyImpl.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropertyImpl extends FeatureImpl implements Property
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelSwitch<Adapter> modelSwitch =
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelAdapterFactory extends AdapterFactoryImpl
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelAdapterFactory()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities
   * @generated
   */
  public Adapter createEntitiesAdapter()
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Signals()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_States()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelPackageImpl extends EPackageImpl implements DomainmodelPackage
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainmodelPackageImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entitiesEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainmodelPackage init()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinePackageImpl extends EPackageImpl implements StatemachinePackage
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputSignalEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statemachineEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputSignalEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StatemachinePackage init()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StatemachinePackageImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @see #setState(State)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_State()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_State()
   * @model
   * @generated
   */
  State getState();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @see #setCondition(Condition)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_Condition()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.OutputSignalImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getOutputSignal()
   * @generated
   */
  int OUTPUT_SIGNAL = 3;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.OutputSignalImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getOutputSignal()
     * @generated
     */
    EClass OUTPUT_SIGNAL = eINSTANCE.getOutputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.ConditionImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 6;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EVENTS = eINSTANCE.getCondition_Events();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal
   * @generated
   */
  EClass getSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NEW_VALUE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Output Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal
   * @generated
   */
  EClass getOutputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.ConditionImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NEW_VALUE = eINSTANCE.getCommand_NewValue();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Signal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Command</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command
   * @generated
   */
  EClass getCommand();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__SIGNAL = eINSTANCE.getEvent_Signal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.InputSignalImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getInputSignal()
   * @generated
   */
  int INPUT_SIGNAL = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NESTED_STATES = 3;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition#getEvents()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Events();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.SignalImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Input Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal
   * @generated
   */
  EClass getInputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Condition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getState()
   * @generated
   */
  int STATE = 4;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>State</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State
   * @generated
   */
  EClass getState();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__VALUE = eINSTANCE.getEvent_Value();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Signal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates()
   * @see #getState()
   * @generated
   */
  EReference getState_NestedStates();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EVENTS = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__SIGNAL = eINSTANCE.getCommand_Signal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SIGNAL__NAME = SIGNAL__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands()
   * @see #getState()
   * @generated
   */
  EReference getState_Commands();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__SIGNAL = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.InputSignalImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getInputSignal()
     * @generated
     */
    EClass INPUT_SIGNAL = eINSTANCE.getInputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__COMMANDS = eINSTANCE.getState_Commands();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StatemachineFactory getStatemachineFactory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_NewValue();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatemachinePackage eINSTANCE = org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Event</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event
   * @generated
   */
  EClass getEvent();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.SignalImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__CONDITION = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 5;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 7;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__NESTED_STATES = eINSTANCE.getState_NestedStates();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__VALUE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine
   * @generated
   */
  EClass getStatemachine();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__SIGNALS = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl
     * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__SIGNALS = eINSTANCE.getStatemachine_Signals();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition
   * @generated
   */
  EClass getTransition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "statemachine";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/web/example/Statemachine";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 8;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__COMMANDS = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Value();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "statemachine";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getSignals()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Signals();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIGNAL__NAME = SIGNAL__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition
   * @generated
   */
  EClass getCondition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__SIGNAL = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Signal</em>'.
   * @generated
   */
  OutputSignal createOutputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Signal</em>'.
   * @generated
   */
  InputSignal createInputSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statemachine</em>'.
   * @generated
   */
  Statemachine createStatemachine();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal</em>'.
   * @generated
   */
  Signal createSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatemachineFactory eINSTANCE = org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineFactoryImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
public interface StatemachineFactory extends EFactory
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StatemachinePackage getStatemachinePackage();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition_Events()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @see #setSignal(Signal)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_Signal()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_Signal()
   * @model
   * @generated
   */
  Signal getSignal();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @param value the new value of the '<em>New Value</em>' attribute.
   * @see #isNewValue()
   * @generated
   */
  void setNewValue(boolean value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @see #setNewValue(boolean)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_NewValue()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_NewValue()
   * @model
   * @generated
   */
  boolean isNewValue();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends MinimalEObjectImpl.Container implements Signal
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignalImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/OutputSignal.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getOutputSignal()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/OutputSignal.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getOutputSignal()
 * @model
 * @generated
 */
public interface OutputSignal extends Signal
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/InputSignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputSignalImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/InputSignalImpl.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InputSignalImpl extends SignalImpl implements InputSignal
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/InputSignalImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal_Name()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal_Name()
   * @model
   * @generated
   */
  String getName();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSignal()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #isValue()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * @see #isValue()
   * @generated
   * @ordered
   */
  protected static final boolean VALUE_EDEFAULT = false;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #isValue()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * @see #isValue()
   * @generated
   * @ordered
   */
  protected boolean value = VALUE_EDEFAULT;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected Signal signal;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends AbstractElement
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities()
 * @model
 * @generated
 */
public interface Entities extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_Elements()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @see #setImportSection(XImportSection)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_ImportSection()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection()
   * @see #getEntities()
   * @generated
   */
  EReference getEntities_ImportSection();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES__IMPORT_SECTION = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/Entities";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature
   * @generated
   */
  EClass getFeature();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities#getElements()
   * @see #getEntities()
   * @generated
   */
  EReference getEntities_Elements();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITIES__ELEMENTS = eINSTANCE.getEntities_Elements();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getEntities()
     * @generated
     */
    EClass ENTITIES = eINSTANCE.getEntities();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getEntities()
   * @generated
   */
  int ENTITIES = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = FEATURE__TYPE;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation
   * @generated
   */
  EClass getOperation();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.AbstractElementImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Property
   * @generated
   */
  EClass getProperty();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity
   * @generated
   */
  EClass getEntity();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.PackageDeclarationImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Body();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.PackageDeclarationImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMS = FEATURE_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainmodel";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 6;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Entities</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities
   * @generated
   */
  EClass getEntities();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.PropertyImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__BODY = eINSTANCE.getOperation_Body();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.PropertyImpl
     * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__BODY = FEATURE_FEATURE_COUNT + 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = FEATURE__TYPE;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DomainmodelPackage extends EPackage
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation#getParams()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Params();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement
   * @generated
   */
  EClass getAbstractElement();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FEATURE__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITIES__IMPORT_SECTION = eINSTANCE.getEntities_ImportSection();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainmodelFactory getDomainmodelFactory();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelPackage eINSTANCE = org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl.init();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.AbstractElementImpl
   * @see org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainmodel";
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITIES__ELEMENTS = 1;
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Commands()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @return the value of the '<em>Nested States</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_NestedStates()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_NestedStates()
   * @model containment="true"
   * @generated
   */
  EList<State> getNestedStates();
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Name()
   * @model
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Name()
   * @model
   * @generated
   */
  String getName();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/InputSignal.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getInputSignal()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/InputSignal.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getInputSignal()
 * @model
 * @generated
 */
public interface InputSignal extends Signal
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @see #setBody(XExpression)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Body()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParams();
```

### JavadocDeclaration
Wrong tag `model`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation()
 * @model
 * @generated
 */
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> params;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends FeatureImpl implements Operation
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
```

### JavadocDeclaration
Wrong tag `ordered`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XExpression body;
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
```

### JavadocDeclaration
Wrong tag `generated`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `resourceBaseProvider` may be 'final'
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/EntitiesWebModule.java`
#### Snippet
```java
 */
public class EntitiesWebModule extends AbstractEntitiesWebModule {
	private IResourceBaseProvider resourceBaseProvider;

	public void configureResourceBaseProvider(Binder binder) {
```

### FieldMayBeFinal
Field `resourceBaseProvider` may be 'final'
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/StatemachineWebModule.java`
#### Snippet
```java
 */
public class StatemachineWebModule extends AbstractStatemachineWebModule {
	private IResourceBaseProvider resourceBaseProvider;

	@Override
```

### FieldMayBeFinal
Field `resourceBaseProvider` may be 'final'
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/StatemachineWebSetup.java`
#### Snippet
```java
public class StatemachineWebSetup extends StatemachineStandaloneSetup {

	private IResourceBaseProvider resourceBaseProvider;

	public StatemachineWebSetup(IResourceBaseProvider resourceBaseProvider) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `entity` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }
```

### UnnecessaryLocalVariable
Local variable `abstractElement` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }
```

### UnnecessaryLocalVariable
Local variable `packageDeclaration` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }
```

### UnnecessaryLocalVariable
Local variable `operation` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }
```

### UnnecessaryLocalVariable
Local variable `property` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }
```

### UnnecessaryLocalVariable
Local variable `feature` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }
```

### UnnecessaryLocalVariable
Local variable `entities` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelFactoryImpl.java`
#### Snippet
```java
  public Entities createEntities()
  {
    EntitiesImpl entities = new EntitiesImpl();
    return entities;
  }
```

### UnnecessaryLocalVariable
Local variable `condition` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }
```

### UnnecessaryLocalVariable
Local variable `signal` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }
```

### UnnecessaryLocalVariable
Local variable `state` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }
```

### UnnecessaryLocalVariable
Local variable `transition` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }
```

### UnnecessaryLocalVariable
Local variable `inputSignal` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public InputSignal createInputSignal()
  {
    InputSignalImpl inputSignal = new InputSignalImpl();
    return inputSignal;
  }
```

### UnnecessaryLocalVariable
Local variable `outputSignal` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public OutputSignal createOutputSignal()
  {
    OutputSignalImpl outputSignal = new OutputSignalImpl();
    return outputSignal;
  }
```

### UnnecessaryLocalVariable
Local variable `statemachine` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Statemachine createStatemachine()
  {
    StatemachineImpl statemachine = new StatemachineImpl();
    return statemachine;
  }
```

### UnnecessaryLocalVariable
Local variable `command` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }
```

### UnnecessaryLocalVariable
Local variable `event` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineFactoryImpl.java`
#### Snippet
```java
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }
```

### UnnecessaryLocalVariable
Local variable `service` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
		Injector injector = getInjector(serviceContext);
		XtextServiceDispatcher serviceDispatcher = injector.getInstance(XtextServiceDispatcher.class);
		XtextServiceDispatcher.ServiceDescriptor service = serviceDispatcher.getService(serviceContext);
		return service;
	}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `resourceServiceProvider` initializer `null` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
	protected Injector getInjector(HttpServiceContext serviceContext)
			throws InvalidRequestException.UnknownLanguageException {
		IResourceServiceProvider resourceServiceProvider = null;
		String parameter = serviceContext.getParameter("resource");
		if (parameter == null) {
```

### UnusedAssignment
Variable `contentType` initializer `null` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
					&& ((IUnwrappableServiceResult) result).getContent() != null) {
				IUnwrappableServiceResult unwrapResult = ((IUnwrappableServiceResult) result);
				String contentType = null;
				if (unwrapResult.getContentType() != null) {
					contentType = unwrapResult.getContentType();
```

### UnusedAssignment
Variable `charset` initializer `null` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/HttpServiceContext.java`
#### Snippet
```java
			}
			if (contentType != null && "application/x-www-form-urlencoded".equals(contentType[0])) {
				String charset = null;
				if (contentType != null && contentType.length >= 2 && contentType[1].startsWith("charset=")) {
					charset = (contentType[1]).substring("charset=".length());
```

### UnusedAssignment
Variable `uriString` initializer `null` is redundant
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		try {
			ResourceSet resourceSet = resourceSetProvider.get(resourceId, context);
			String uriString = null;
			if (resourceId != null) {
				uriString = resourceId;
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
	 */
	protected XtextWebDocumentAccess getDocumentAccess(IServiceContext context) throws InvalidRequestException {
		XtextWebDocument document = null;
		boolean initializedFromFullText = false;
		if (context.getParameterKeys().contains("fullText")) {
```

### UnusedAssignment
Variable `contentType` initializer `null` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextResourcesServlet.java`
#### Snippet
```java
					}
					String mimeType = getServletContext().getMimeType(fileName);
					String contentType = null;
					if (mimeType != null) {
						contentType = mimeType;
```

### UnusedAssignment
Variable `operationType` initializer `null` is redundant
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
						} else if (f instanceof Operation) {
							// operations are mapped to methods
							JvmTypeReference operationType = null;
							if (((Operation) f).getType() != null) {
								operationType = ((Operation) f).getType();
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ISession.java`
#### Snippet
```java
   * done in an atomic block, thus the session store may be accessed from multiple threads.
   */
  <T extends Object> T get(Object key, Function0<? extends T> factory);
  
  /**
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ISession.java`
#### Snippet
```java
    
    @Override
    public <T extends Object> T get(Object key, Function0<? extends T> factory) {
      return factory.apply();
    }
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ISession.java`
#### Snippet
```java
   * is associated with that key.
   */
  <T extends Object> T get(Object key);
  
  /**
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ISession.java`
#### Snippet
```java
  class NullImpl implements ISession {
    @Override
    public <T extends Object> T get(Object key) {
      return null;
    }
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	}

	protected <T extends Object> T doAccess(CancelableUnitOfWork<T, IXtextWebDocument> synchronousWork,
			boolean priority, boolean modify, CancelableUnitOfWork<?, IXtextWebDocument> asynchronousWork) {
		try {
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	 * units are canceled if they support cancellation.
	 */
	public <T extends Object> T modify(CancelableUnitOfWork<T, IXtextWebDocument> work) {
		return doAccess(work, true, true, null);
	}
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	 * the document, but is not relevant for the current service request.
	 */
	public <T extends Object> T modify(CancelableUnitOfWork<T, IXtextWebDocument> work,
			CancelableUnitOfWork<?, IXtextWebDocument> asynchronousWork) {
		return doAccess(work, true, true, asynchronousWork);
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	 * are canceled if they support cancellation.
	 */
	public <T extends Object> T priorityReadOnly(CancelableUnitOfWork<T, IXtextWebDocument> work) {
		return doAccess(work, true, false, null);
	}
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	 * Execute the given work unit with read-only access and return its result.
	 */
	public <T extends Object> T readOnly(CancelableUnitOfWork<T, IXtextWebDocument> work) {
		return doAccess(work, false, false, null);
	}
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `readRegions == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		final int prime = 31;
		int result = 1;
		result = prime * result + ((readRegions == null) ? 0 : readRegions.hashCode());
		result = prime * result + ((stateId == null) ? 0 : stateId.hashCode());
		result = prime * result + ((writeRegions == null) ? 0 : writeRegions.hashCode());
```

### ConstantValue
Condition `writeRegions == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		result = prime * result + ((readRegions == null) ? 0 : readRegions.hashCode());
		result = prime * result + ((stateId == null) ? 0 : stateId.hashCode());
		result = prime * result + ((writeRegions == null) ? 0 : writeRegions.hashCode());
		return result;
	}
```

### ConstantValue
Condition `readRegions == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
			return false;
		OccurrencesResult other = (OccurrencesResult) obj;
		if (readRegions == null) {
			if (other.readRegions != null)
				return false;
```

### ConstantValue
Condition `writeRegions == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		} else if (!stateId.equals(other.stateId))
			return false;
		if (writeRegions == null) {
			if (other.writeRegions != null)
				return false;
```

### ConstantValue
Condition `this.issues == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			return false;
		ValidationResult other = (ValidationResult) obj;
		if (this.issues == null) {
			if (other.issues != null)
				return false;
```

### ConstantValue
Condition `this.issues == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return 31 * 1 + ((this.issues == null) ? 0 : this.issues.hashCode());
	}

```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ENTITY__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ENTITY__SUPER_TYPE, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
      NotificationChain msgs = null;
      if (importSection != null)
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ENTITIES__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ENTITIES__IMPORT_SECTION, null, msgs);
```

### ConstantValue
Condition `this.regions == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return 31 * 1 + ((this.regions == null) ? 0 : this.regions.hashCode());
	}

```

### ConstantValue
Condition `this.regions == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			return false;
		HighlightingResult other = (HighlightingResult) obj;
		if (this.regions == null) {
			if (other.regions != null)
				return false;
```

### ConstantValue
Condition `artifacts == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
				return false;
			GeneratedArtifacts other = (GeneratedArtifacts) obj;
			if (artifacts == null) {
				if (other.artifacts != null)
					return false;
```

### ConstantValue
Condition `artifacts == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
			final int prime = 31;
			int result = 1;
			result = prime * result + ((artifacts == null) ? 0 : artifacts.hashCode());
			return result;
		}
```

### ConstantValue
Value `resourceId` is always 'null'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/IWebDocumentProvider.java`
#### Snippet
```java
    public XtextWebDocument get(String resourceId, IServiceContext serviceContext) {
      if (resourceId == null) {
        return new XtextWebDocument(resourceId, synchronizerProvider.get());
      } else {
        return new XtextWebDocument(resourceId, serviceContext.getSession().get(DocumentSynchronizer.class,  () -> this.synchronizerProvider.get()));
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
    {
      case StatemachinePackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StatemachinePackage.STATE__COMMANDS:
        return commands != null && !commands.isEmpty();
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
    {
      case DomainmodelPackage.ABSTRACT_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
    {
      case DomainmodelPackage.FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.FEATURE__TYPE:
        return type != null;
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.FEATURE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.FEATURE__TYPE, null, msgs);
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__CONDITION, null, msgs);
```

### ConstantValue
Condition `entries == null` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
			return false;
		ContentAssistResult other = (ContentAssistResult) obj;
		if (entries == null) {
			if (other.entries != null)
				return false;
```

### ConstantValue
Condition `entries == null` is always `false` when reached
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entries == null) ? 0 : entries.hashCode());
		result = prime * result + ((stateId == null) ? 0 : stateId.hashCode());
		return result;
```

### ConstantValue
Value `grammar` is always 'null'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/services/EntitiesGrammarAccess.java`
#### Snippet
```java
			}
		}
		return grammar;
	}
	
```

### ConstantValue
Condition `contentType != null` is always `true`
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/HttpServiceContext.java`
#### Snippet
```java
			if (contentType != null && "application/x-www-form-urlencoded".equals(contentType[0])) {
				String charset = null;
				if (contentType != null && contentType.length >= 2 && contentType[1].startsWith("charset=")) {
					charset = (contentType[1]).substring("charset=".length());
				} else {
```

### ConstantValue
Condition `lowerCase != null` is always `true`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		}
		String lowerCase = stringValue.toLowerCase();
		if (lowerCase != null) {
			switch (lowerCase) {
			case "true":
```

### ConstantValue
Value `exception` is always 'null'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		} else {
			throw new IllegalArgumentException(
					"Unhandled parameter types: " + Arrays.asList(service, exception).toString());
		}
	}
```

### ConstantValue
Value `serviceType` is always 'null'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		} else {
			throw new InvalidRequestException.InvalidParametersException(
					"The service type '" + serviceType + "' is not supported.");
		}
	}
```

### ConstantValue
Condition `t instanceof IOException` is always `false`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			});
		} catch (Throwable t) {
			if (t instanceof IOException) {
				return null;
			} else {
```

### ConstantValue
Value `grammar` is always 'null'
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/services/StatemachineGrammarAccess.java`
#### Snippet
```java
			}
		}
		return grammar;
	}
	
```

### ConstantValue
Condition `NAME_EDEFAULT == null` is always `true`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
    {
      case StatemachinePackage.SIGNAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
```

### ConstantValue
Value `entity` is always 'null'
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
		} else {
			throw new IllegalArgumentException(
					"Unhandled parameter types: " + Arrays.asList(entity, acceptor, prelinkingPhase).toString());
		}
	}
```

### ConstantValue
Value `msgs` is always 'null'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.OPERATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.OPERATION__BODY, null, msgs);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("formattedText", this.formattedText);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("formattedText", this.formattedText);
		b.add("replaceRegion", this.replaceRegion);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("formattedText", this.formattedText);
		b.add("replaceRegion", this.replaceRegion);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
		b.add("stateId", this.stateId);
		b.add("formattedText", this.formattedText);
		b.add("replaceRegion", this.replaceRegion);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingResult.java`
#### Snippet
```java
		b.add("formattedText", this.formattedText);
		b.add("replaceRegion", this.replaceRegion);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("writeRegions", this.writeRegions);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("writeRegions", this.writeRegions);
		b.add("readRegions", this.readRegions);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("writeRegions", this.writeRegions);
		b.add("readRegions", this.readRegions);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		b.add("stateId", this.stateId);
		b.add("writeRegions", this.writeRegions);
		b.add("readRegions", this.readRegions);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/occurrences/OccurrencesResult.java`
#### Snippet
```java
		b.add("writeRegions", this.writeRegions);
		b.add("readRegions", this.readRegions);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("issues", this.issues);
		return b.toString();
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("issues", this.issues);
		return b.toString();
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("issues", this.issues);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("issues", this.issues);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("issues", this.issues);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.skipNulls();
			b.add("description", this.description);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.skipNulls();
			b.add("description", this.description);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.skipNulls();
			b.add("description", this.description);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.skipNulls();
			b.add("description", this.description);
			b.add("severity", this.severity);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			ToStringBuilder b = new ToStringBuilder(this);
			b.skipNulls();
			b.add("description", this.description);
			b.add("severity", this.severity);
			b.add("line", this.line);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.skipNulls();
			b.add("description", this.description);
			b.add("severity", this.severity);
			b.add("line", this.line);
			b.add("column", this.column);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.add("description", this.description);
			b.add("severity", this.severity);
			b.add("line", this.line);
			b.add("column", this.column);
			b.add("offset", this.offset);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.add("severity", this.severity);
			b.add("line", this.line);
			b.add("column", this.column);
			b.add("offset", this.offset);
			b.add("length", this.length);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.add("line", this.line);
			b.add("column", this.column);
			b.add("offset", this.offset);
			b.add("length", this.length);
			return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.add("column", this.column);
			b.add("offset", this.offset);
			b.add("length", this.length);
			return b.toString();
		}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationResult.java`
#### Snippet
```java
			b.add("offset", this.offset);
			b.add("length", this.length);
			return b.toString();
		}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.singleLine();
			b.add("offset", this.offset);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.singleLine();
			b.add("offset", this.offset);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.singleLine();
			b.add("offset", this.offset);
```

### UnstableApiUsage
'singleLine()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.singleLine();
			b.add("offset", this.offset);
			b.add("length", this.length);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			ToStringBuilder b = new ToStringBuilder(this);
			b.singleLine();
			b.add("offset", this.offset);
			b.add("length", this.length);
			b.add("styleClasses", this.styleClasses);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			b.singleLine();
			b.add("offset", this.offset);
			b.add("length", this.length);
			b.add("styleClasses", this.styleClasses);
			return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			b.add("offset", this.offset);
			b.add("length", this.length);
			b.add("styleClasses", this.styleClasses);
			return b.toString();
		}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
			b.add("length", this.length);
			b.add("styleClasses", this.styleClasses);
			return b.toString();
		}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("regions", this.regions);
		return b.toString();
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("regions", this.regions);
		return b.toString();
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("regions", this.regions);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("regions", this.regions);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("regions", this.regions);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("artifacts", artifacts);
			return b.toString();
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("artifacts", artifacts);
			return b.toString();
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("artifacts", artifacts);
			return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("artifacts", artifacts);
			return b.toString();
		}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("artifacts", artifacts);
			return b.toString();
		}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
		b.add("dirty", this.dirty);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
		b.add("dirty", this.dirty);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
		b.add("fullText", this.fullText);
		b.add("stateId", this.stateId);
		b.add("dirty", this.dirty);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/persistence/ResourceContentResult.java`
#### Snippet
```java
		b.add("stateId", this.stateId);
		b.add("dirty", this.dirty);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("stateId", this.stateId);
		return b.toString();
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("stateId", this.stateId);
		return b.toString();
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("stateId", this.stateId);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("stateId", this.stateId);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentStateResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("stateId", this.stateId);
		return b.toString();
	}

```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Command command, IFormattableDocument doc) {
		doc.append(regionFor(command).keyword(ga.getCommandAccess().getSetKeyword_0()), it -> it.oneSpace());
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
		doc.prepend(equalsSignKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	protected void format(Command command, IFormattableDocument doc) {
		doc.append(regionFor(command).keyword(ga.getCommandAccess().getSetKeyword_0()), it -> it.oneSpace());
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
		doc.prepend(equalsSignKeyword, it -> it.oneSpace());
		doc.append(equalsSignKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(State state, IFormattableDocument doc) {
		doc.append(regionFor(state).keyword(ga.getStateAccess().getStateKeyword_0()), it -> it.oneSpace());
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
		doc.append(nameAssignment, it -> it.newLine());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	protected void format(State state, IFormattableDocument doc) {
		doc.append(regionFor(state).keyword(ga.getStateAccess().getStateKeyword_0()), it -> it.oneSpace());
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
		doc.append(nameAssignment, it -> it.newLine());
		doc.interior(nameAssignment, regionFor(state).keyword(ga.getStateAccess().getEndKeyword_5()),
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
		doc.append(nameAssignment, it -> it.newLine());
		doc.interior(nameAssignment, regionFor(state).keyword(ga.getStateAccess().getEndKeyword_5()),
				it -> it.indent());
		for (Command command : state.getCommands()) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Signal signal, IFormattableDocument doc) {
		ISemanticRegion signalKeyword = regionFor(signal).keyword(ga.getSignalAccess().getSignalKeyword_1());
		doc.prepend(signalKeyword, it -> it.oneSpace());
		doc.append(signalKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Event event, IFormattableDocument doc) {
		ISemanticRegion equalsSignEqualsSignKeyword = regionFor(event)
				.keyword(ga.getEventAccess().getEqualsSignEqualsSignKeyword_1());
		doc.prepend(equalsSignEqualsSignKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Condition condition, IFormattableDocument doc) {
		ISemanticRegion andKeyword = regionFor(condition).keyword(ga.getConditionAccess().getAndKeyword_1_0());
		doc.prepend(andKeyword, it -> it.oneSpace());
		doc.append(andKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'AbstractJavaFormatter()' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
import com.google.inject.Inject;

public class StatemachineFormatter extends AbstractJavaFormatter {

	@Inject
```

### UnstableApiUsage
'org.eclipse.xtext.formatting2.AbstractJavaFormatter' is marked unstable with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
import com.google.inject.Inject;

public class StatemachineFormatter extends AbstractJavaFormatter {

	@Inject
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Transition transition, IFormattableDocument doc) {
		doc.append(regionFor(transition).keyword(ga.getTransitionAccess().getIfKeyword_0()), it -> it.oneSpace());
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
		doc.prepend(gotoKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	protected void format(Transition transition, IFormattableDocument doc) {
		doc.append(regionFor(transition).keyword(ga.getTransitionAccess().getIfKeyword_0()), it -> it.oneSpace());
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
		doc.prepend(gotoKeyword, it -> it.oneSpace());
		doc.append(gotoKeyword, it -> it.oneSpace());
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("name", this.name);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("name", this.name);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("name", this.name);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("name", this.name);
		b.add("contentType", this.contentType);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("name", this.name);
		b.add("contentType", this.contentType);
		b.add("content", this.content);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
		b.skipNulls();
		b.add("name", this.name);
		b.add("contentType", this.contentType);
		b.add("content", this.content);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
		b.add("name", this.name);
		b.add("contentType", this.contentType);
		b.add("content", this.content);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorResult.java`
#### Snippet
```java
		b.add("contentType", this.contentType);
		b.add("content", this.content);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("entries", this.entries);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("entries", this.entries);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("entries", this.entries);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistResult.java`
#### Snippet
```java
		b.add("stateId", this.stateId);
		b.add("entries", this.entries);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("conflict", this.conflict);
		return b.toString();
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("conflict", this.conflict);
		return b.toString();
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("conflict", this.conflict);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("conflict", this.conflict);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ServiceConflictResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.add("conflict", this.conflict);
		return b.toString();
	}

```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("context", context);
			b.add("service", service);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("context", context);
			b.add("service", service);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("context", context);
			b.add("service", service);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("context", context);
			b.add("service", service);
			b.add("hasSideEffects", hasSideEffects);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("context", context);
			b.add("service", service);
			b.add("hasSideEffects", hasSideEffects);
			b.add("hasConflict", hasConflict);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			b.add("context", context);
			b.add("service", service);
			b.add("hasSideEffects", hasSideEffects);
			b.add("hasConflict", hasConflict);
			return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			b.add("service", service);
			b.add("hasSideEffects", hasSideEffects);
			b.add("hasConflict", hasConflict);
			return b.toString();
		}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			b.add("hasSideEffects", hasSideEffects);
			b.add("hasConflict", hasConflict);
			return b.toString();
		}
	}
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(Property property, IFormattableDocument document) {
		document.surround(regionFor(property).keyword(":"), this::noSpace);
		document.format(property.getType());
	}
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(Property property, IFormattableDocument document) {
		document.surround(regionFor(property).keyword(":"), this::noSpace);
		document.format(property.getType());
	}
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(Entity entity, IFormattableDocument document) {
		ISemanticRegion open = regionFor(entity).keyword("{");
		ISemanticRegion close = regionFor(entity).keyword("}");
		document.surround(regionFor(entity).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME),
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	protected void _format(Entity entity, IFormattableDocument document) {
		ISemanticRegion open = regionFor(entity).keyword("{");
		ISemanticRegion close = regionFor(entity).keyword("}");
		document.surround(regionFor(entity).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME),
				this::oneSpace);
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		ISemanticRegion open = regionFor(entity).keyword("{");
		ISemanticRegion close = regionFor(entity).keyword("}");
		document.surround(regionFor(entity).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME),
				this::oneSpace);
		document.surround(entity.getSuperType(), this::oneSpace);
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		ISemanticRegion close = regionFor(entity).keyword("}");
		document.surround(regionFor(entity).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME),
				this::oneSpace);
		document.surround(entity.getSuperType(), this::oneSpace);
		document.append(open, this::newLine);
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		document.surround(regionFor(entity).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME),
				this::oneSpace);
		document.surround(entity.getSuperType(), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
```

### UnstableApiUsage
'newLine(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
				this::oneSpace);
		document.surround(entity.getSuperType(), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
		format(entity.getSuperType(), document);
```

### UnstableApiUsage
'indent(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		document.surround(entity.getSuperType(), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
		format(entity.getSuperType(), document);
		for (Feature feature : entity.getFeatures()) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(Operation operation, IFormattableDocument document) {
		document.append(regionFor(operation).keyword("op"), this::oneSpace);
		document.surround(regionFor(operation).keyword("("), this::noSpace);
		if (!operation.getParams().isEmpty()) {
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(Operation operation, IFormattableDocument document) {
		document.append(regionFor(operation).keyword("op"), this::oneSpace);
		document.surround(regionFor(operation).keyword("("), this::noSpace);
		if (!operation.getParams().isEmpty()) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	protected void _format(Operation operation, IFormattableDocument document) {
		document.append(regionFor(operation).keyword("op"), this::oneSpace);
		document.surround(regionFor(operation).keyword("("), this::noSpace);
		if (!operation.getParams().isEmpty()) {
			for (ISemanticRegion comma : regionFor(operation).keywords(",")) {
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	protected void _format(Operation operation, IFormattableDocument document) {
		document.append(regionFor(operation).keyword("op"), this::oneSpace);
		document.surround(regionFor(operation).keyword("("), this::noSpace);
		if (!operation.getParams().isEmpty()) {
			for (ISemanticRegion comma : regionFor(operation).keywords(",")) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		document.surround(regionFor(operation).keyword("("), this::noSpace);
		if (!operation.getParams().isEmpty()) {
			for (ISemanticRegion comma : regionFor(operation).keywords(",")) {
				document.append(document.prepend(comma, this::noSpace), this::oneSpace);
			}
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		if (!operation.getParams().isEmpty()) {
			for (ISemanticRegion comma : regionFor(operation).keywords(",")) {
				document.append(document.prepend(comma, this::noSpace), this::oneSpace);
			}
			for (JvmFormalParameter params : operation.getParams()) {
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		if (!operation.getParams().isEmpty()) {
			for (ISemanticRegion comma : regionFor(operation).keywords(",")) {
				document.append(document.prepend(comma, this::noSpace), this::oneSpace);
			}
			for (JvmFormalParameter params : operation.getParams()) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
				document.format(params);
			}
			document.prepend(regionFor(operation).keyword(")"), this::noSpace);
		}
		if (operation.getType() != null) {
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
				document.format(params);
			}
			document.prepend(regionFor(operation).keyword(")"), this::noSpace);
		}
		if (operation.getType() != null) {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		}
		if (operation.getType() != null) {
			document.append(regionFor(operation).keyword(")"), this::noSpace);
			document.append(document.prepend(operation.getType(), this::noSpace), this::oneSpace);
			document.format(operation.getType());
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		}
		if (operation.getType() != null) {
			document.append(regionFor(operation).keyword(")"), this::noSpace);
			document.append(document.prepend(operation.getType(), this::noSpace), this::oneSpace);
			document.format(operation.getType());
```

### UnstableApiUsage
'noSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		if (operation.getType() != null) {
			document.append(regionFor(operation).keyword(")"), this::noSpace);
			document.append(document.prepend(operation.getType(), this::noSpace), this::oneSpace);
			document.format(operation.getType());
		} else {
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		if (operation.getType() != null) {
			document.append(regionFor(operation).keyword(")"), this::noSpace);
			document.append(document.prepend(operation.getType(), this::noSpace), this::oneSpace);
			document.format(operation.getType());
		} else {
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
			document.format(operation.getType());
		} else {
			document.append(regionFor(operation).keyword(")"), this::oneSpace);
		}
		document.format(operation.getBody());
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
			document.format(operation.getType());
		} else {
			document.append(regionFor(operation).keyword(")"), this::oneSpace);
		}
		document.format(operation.getBody());
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	}

	protected void _format(PackageDeclaration pkg, @Extension IFormattableDocument document) {
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	protected void _format(PackageDeclaration pkg, @Extension IFormattableDocument document) {
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	protected void _format(PackageDeclaration pkg, @Extension IFormattableDocument document) {
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
		document.append(open, this::newLine);
```

### UnstableApiUsage
'regionFor(org.eclipse.emf.ecore.EObject)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
```

### UnstableApiUsage
'oneSpace(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
```

### UnstableApiUsage
'newLine(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		ISemanticRegion close = regionFor(pkg).keyword("}");
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
		for (AbstractElement element : pkg.getElements()) {
```

### UnstableApiUsage
'indent(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
		document.surround(regionFor(pkg).feature(DomainmodelPackage.Literals.ABSTRACT_ELEMENT__NAME), this::oneSpace);
		document.append(open, this::newLine);
		document.interior(open, close, this::indent);
		for (AbstractElement element : pkg.getElements()) {
			document.format(element);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.Extension' is marked unstable with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

public class EntitiesFormatter extends XbaseFormatter {
	protected void _format(Entities entities, @Extension IFormattableDocument document) {
		document.append(document.prepend(entities, (IHiddenRegionFormatter it) -> {
			it.setNewLines(0, 0, 1);
```

### UnstableApiUsage
'newLine(org.eclipse.xtext.formatting2.IHiddenRegionFormatter)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
			it.setNewLines(0, 0, 1);
			it.noSpace();
		}), this::newLine);
		format(entities.getImportSection(), document);
		for (AbstractElement element : entities.getElements()) {
```

### UnstableApiUsage
'formatUsingPolymorphicDispatcher(java.lang.Object, org.eclipse.xtext.formatting2.IFormattableDocument)' is declared in unstable class 'org.eclipse.xtext.formatting2.AbstractJavaFormatter' marked with @Beta
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

	public void format(Object object, IFormattableDocument document) {
		formatUsingPolymorphicDispatcher(object, document);
	}
}
```

### UnstableApiUsage
'org.eclipse.xtend.lib.annotations.FinalFieldsConstructor' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/util/CancelIndicatorProgressMonitor.java`
#### Snippet
```java
import org.eclipse.xtext.util.CancelIndicator;

@FinalFieldsConstructor
public class CancelIndicatorProgressMonitor implements IProgressMonitor {
  private final CancelIndicator delegate;
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'ToStringBuilder(java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' is marked unstable with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
```

### UnstableApiUsage
'skipNulls()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("title", this.title);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
		ToStringBuilder b = new ToStringBuilder(this);
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("title", this.title);
		b.add("content", this.content);
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
		b.skipNulls();
		b.add("stateId", this.stateId);
		b.add("title", this.title);
		b.add("content", this.content);
		return b.toString();
```

### UnstableApiUsage
'add(java.lang.String, java.lang.Object)' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
		b.add("stateId", this.stateId);
		b.add("title", this.title);
		b.add("content", this.content);
		return b.toString();
	}
```

### UnstableApiUsage
'toString()' is declared in unstable class 'org.eclipse.xtext.xbase.lib.util.ToStringBuilder' marked with @Beta
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverResult.java`
#### Snippet
```java
		b.add("title", this.title);
		b.add("content", this.content);
		return b.toString();
	}

```

