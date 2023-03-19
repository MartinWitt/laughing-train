# xtext-web 
 
# Bad smells
I found 713 bad smells with 30 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 262 | false |
| UnstableApiUsage | 145 | false |
| UNUSED_IMPORT | 51 | false |
| ReturnNull | 49 | false |
| ConstantValue | 30 | false |
| RedundantFieldInitialization | 23 | false |
| Convert2MethodRef | 19 | false |
| UnnecessaryLocalVariable | 17 | true |
| MethodOverloadsParentMethod | 13 | false |
| DataFlowIssue | 12 | false |
| TypeParameterExtendsObject | 9 | false |
| PointlessArithmeticExpression | 8 | false |
| StaticPseudoFunctionalStyleMethod | 8 | false |
| BoundedWildcard | 8 | false |
| UnusedAssignment | 7 | false |
| StringBufferReplaceableByString | 6 | false |
| CodeBlock2Expr | 5 | true |
| AssignmentToMethodParameter | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| UnnecessaryReturn | 3 | true |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| ReplaceNullCheck | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| UnnecessaryUnboxing | 2 | false |
| NestedAssignment | 2 | false |
| Convert2Lambda | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| TrivialStringConcatenation | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
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
`ABSTRACT_ELEMENT_FEATURE_COUNT + 0` can be replaced with 'ABSTRACT_ELEMENT_FEATURE_COUNT'
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

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
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

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
`31 * 1` can be replaced with '31'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingResult.java`
#### Snippet
```java
	@Override
	public int hashCode() {
		return 31 * 1 + ((this.regions == null) ? 0 : this.regions.hashCode());
	}

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ServerLauncher` has only 'static' members, and lacks a 'private' constructor
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/ServerLauncher.java`
#### Snippet
```java
import org.eclipse.jetty.webapp.WebXmlConfiguration;

public class ServerLauncher {

	public static void main(String[] args) {
```

## RuleId[id=DataFlowIssue]
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
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
			return result;
		} catch (Exception e) {
			throw Exceptions.sneakyThrow(e);
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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
    if (modelPackage == null)
    {
      modelPackage = StatemachinePackage.eINSTANCE;
    }
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `modelPackage` from instance context
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
    if (modelPackage == null)
    {
      modelPackage = StatemachinePackage.eINSTANCE;
    }
  }
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `_format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	}

	protected void _format(Property property, IFormattableDocument document) {
		document.surround(regionFor(property).keyword(":"), this::noSpace);
		document.format(property.getType());
```

### MethodOverloadsParentMethod
Method `_format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	}

	protected void _format(PackageDeclaration pkg, @Extension IFormattableDocument document) {
		ISemanticRegion open = regionFor(pkg).keyword("{");
		ISemanticRegion close = regionFor(pkg).keyword("}");
```

### MethodOverloadsParentMethod
Method `_format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	}

	protected void _format(Operation operation, IFormattableDocument document) {
		document.append(regionFor(operation).keyword("op"), this::oneSpace);
		document.surround(regionFor(operation).keyword("("), this::noSpace);
```

### MethodOverloadsParentMethod
Method `_format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java
	}

	protected void _format(Entity entity, IFormattableDocument document) {
		ISemanticRegion open = regionFor(entity).keyword("{");
		ISemanticRegion close = regionFor(entity).keyword("}");
```

### MethodOverloadsParentMethod
Method `_format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/formatting2/EntitiesFormatter.java`
#### Snippet
```java

public class EntitiesFormatter extends XbaseFormatter {
	protected void _format(Entities entities, @Extension IFormattableDocument document) {
		document.append(document.prepend(entities, (IHiddenRegionFormatter it) -> {
			it.setNewLines(0, 0, 1);
```

### MethodOverloadsParentMethod
Method `_infer()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
	private IJvmModelAssociations jvmModelAssociations;

	protected void _infer(Entity entity, IJvmDeclaredTypeAcceptor acceptor, boolean prelinkingPhase) {
		acceptor.accept(jvmTypesBuilder.toClass(entity, qualifiedNameProvider.getFullyQualifiedName(entity)),
				(JvmGenericType it) -> {
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	private StatemachineGrammarAccess ga;

	protected void format(Statemachine statemachine, IFormattableDocument doc) {
		for (Signal signal : statemachine.getSignals()) {
			doc.format(signal);
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(Signal signal, IFormattableDocument doc) {
		ISemanticRegion signalKeyword = regionFor(signal).keyword(ga.getSignalAccess().getSignalKeyword_1());
		doc.prepend(signalKeyword, it -> it.oneSpace());
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(Condition condition, IFormattableDocument doc) {
		ISemanticRegion andKeyword = regionFor(condition).keyword(ga.getConditionAccess().getAndKeyword_1_0());
		doc.prepend(andKeyword, it -> it.oneSpace());
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(State state, IFormattableDocument doc) {
		doc.append(regionFor(state).keyword(ga.getStateAccess().getStateKeyword_0()), it -> it.oneSpace());
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(Transition transition, IFormattableDocument doc) {
		doc.append(regionFor(transition).keyword(ga.getTransitionAccess().getIfKeyword_0()), it -> it.oneSpace());
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(Event event, IFormattableDocument doc) {
		ISemanticRegion equalsSignEqualsSignKeyword = regionFor(event)
				.keyword(ga.getEventAccess().getEqualsSignEqualsSignKeyword_1());
```

### MethodOverloadsParentMethod
Method `format()` overloads a compatible method of a superclass, when overriding might have been intended
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	}

	protected void format(Command command, IFormattableDocument doc) {
		doc.append(regionFor(command).keyword(ga.getCommandAccess().getSetKeyword_0()), it -> it.oneSpace());
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	protected void format(Signal signal, IFormattableDocument doc) {
		ISemanticRegion signalKeyword = regionFor(signal).keyword(ga.getSignalAccess().getSignalKeyword_1());
		doc.prepend(signalKeyword, it -> it.oneSpace());
		doc.append(signalKeyword, it -> it.oneSpace());
	}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion signalKeyword = regionFor(signal).keyword(ga.getSignalAccess().getSignalKeyword_1());
		doc.prepend(signalKeyword, it -> it.oneSpace());
		doc.append(signalKeyword, it -> it.oneSpace());
	}

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
	protected void format(Condition condition, IFormattableDocument doc) {
		ISemanticRegion andKeyword = regionFor(condition).keyword(ga.getConditionAccess().getAndKeyword_1_0());
		doc.prepend(andKeyword, it -> it.oneSpace());
		doc.append(andKeyword, it -> it.oneSpace());
		for (Event event : condition.getEvents()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion andKeyword = regionFor(condition).keyword(ga.getConditionAccess().getAndKeyword_1_0());
		doc.prepend(andKeyword, it -> it.oneSpace());
		doc.append(andKeyword, it -> it.oneSpace());
		for (Event event : condition.getEvents()) {
			doc.format(event);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(State state, IFormattableDocument doc) {
		doc.append(regionFor(state).keyword(ga.getStateAccess().getStateKeyword_0()), it -> it.oneSpace());
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
		doc.append(nameAssignment, it -> it.newLine());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		doc.append(regionFor(state).keyword(ga.getStateAccess().getStateKeyword_0()), it -> it.oneSpace());
		ISemanticRegion nameAssignment = regionFor(state).assignment(ga.getStateAccess().getNameAssignment_1());
		doc.append(nameAssignment, it -> it.newLine());
		doc.interior(nameAssignment, regionFor(state).keyword(ga.getStateAccess().getEndKeyword_5()),
				it -> it.indent());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		doc.append(nameAssignment, it -> it.newLine());
		doc.interior(nameAssignment, regionFor(state).keyword(ga.getStateAccess().getEndKeyword_5()),
				it -> it.indent());
		for (Command command : state.getCommands()) {
			doc.format(command);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		for (Command command : state.getCommands()) {
			doc.format(command);
			doc.append(command, it -> it.newLine());
		}
		for (Transition transition : state.getTransitions()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		for (Transition transition : state.getTransitions()) {
			doc.format(transition);
			doc.append(transition, it -> it.newLine());
		}
		for (State nestedState : state.getNestedStates()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		for (State nestedState : state.getNestedStates()) {
			doc.format(nestedState);
			doc.append(nestedState, it -> it.newLine());
		}
	}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Transition transition, IFormattableDocument doc) {
		doc.append(regionFor(transition).keyword(ga.getTransitionAccess().getIfKeyword_0()), it -> it.oneSpace());
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
		doc.prepend(gotoKeyword, it -> it.oneSpace());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		doc.append(regionFor(transition).keyword(ga.getTransitionAccess().getIfKeyword_0()), it -> it.oneSpace());
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
		doc.prepend(gotoKeyword, it -> it.oneSpace());
		doc.append(gotoKeyword, it -> it.oneSpace());
		if (transition.getCondition() != null) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion gotoKeyword = regionFor(transition).keyword(ga.getTransitionAccess().getGotoKeyword_2());
		doc.prepend(gotoKeyword, it -> it.oneSpace());
		doc.append(gotoKeyword, it -> it.oneSpace());
		if (transition.getCondition() != null) {
			doc.format(transition.getCondition());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion equalsSignEqualsSignKeyword = regionFor(event)
				.keyword(ga.getEventAccess().getEqualsSignEqualsSignKeyword_1());
		doc.prepend(equalsSignEqualsSignKeyword, it -> it.oneSpace());
		doc.append(equalsSignEqualsSignKeyword, it -> it.oneSpace());
	}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
				.keyword(ga.getEventAccess().getEqualsSignEqualsSignKeyword_1());
		doc.prepend(equalsSignEqualsSignKeyword, it -> it.oneSpace());
		doc.append(equalsSignEqualsSignKeyword, it -> it.oneSpace());
	}

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java

	protected void format(Command command, IFormattableDocument doc) {
		doc.append(regionFor(command).keyword(ga.getCommandAccess().getSetKeyword_0()), it -> it.oneSpace());
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
		doc.prepend(equalsSignKeyword, it -> it.oneSpace());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		doc.append(regionFor(command).keyword(ga.getCommandAccess().getSetKeyword_0()), it -> it.oneSpace());
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
		doc.prepend(equalsSignKeyword, it -> it.oneSpace());
		doc.append(equalsSignKeyword, it -> it.oneSpace());
	}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web.example.statemachine/src/org/eclipse/xtext/web/example/statemachine/formatting2/StatemachineFormatter.java`
#### Snippet
```java
		ISemanticRegion equalsSignKeyword = regionFor(command).keyword(ga.getCommandAccess().getEqualsSignKeyword_2());
		doc.prepend(equalsSignKeyword, it -> it.oneSpace());
		doc.append(equalsSignKeyword, it -> it.oneSpace());
	}

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistService.java`
#### Snippet
```java
					});
			result.getEntries()
					.addAll(Lists.transform(sorted, (Pair<Integer, ContentAssistEntry> it) -> it.getValue()));
		}
		return result;
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelInferrer.java`
#### Snippet
```java
		entitiesJvmModelHelper.handleDuplicateJvmOperations(inferredType, (Collection<JvmOperation> jvmOperations) -> {
			// we only remove getters/setters we created automatically
			JvmOperation getterOrSetter = Iterables.getFirst(Iterables.filter(jvmOperations,
					it -> jvmModelAssociations.getPrimarySourceElement(it) instanceof Property), null);
			if (getterOrSetter != null) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverService.java`
#### Snippet
```java
			return surroundWithDiv(nameHtml, ((SimpleImageDescription) it).getImageID() + "-icon");
		} else if (it instanceof AlternativeImageDescription) {
			List<String> strings = Lists
					.transform(((AlternativeImageDescription) it).getImageIDs(), (String s) -> s + "-icon");
			return surroundWithDiv(nameHtml,
					strings.toArray(new String[strings.size()]));
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
		Multimap<String, Property> name2properties = HashMultimap.create();
		IterableExtensions
				.filter(Iterables.filter(entity.getFeatures(), Property.class),
						(f) -> !StringExtensions.isNullOrEmpty(f.getName()))
				.forEach((p) -> name2properties.put(p.getName(), p));
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
	public void checkOperationNamesAreUnique(Entity entity) {
		JvmGenericType inferredJavaClass = IterableExtensions
				.head(Iterables.filter(jvmModelAssociations.getJvmElements(entity), JvmGenericType.class));
		Multimap<String, JvmOperation> signature2Declarations = HashMultimap.create();
		overrideHelper.getResolvedFeatures(inferredJavaClass).getDeclaredOperations().forEach((it) -> {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
		signature2Declarations.asMap().values().forEach((jvmOperations) -> {
			if (jvmOperations.size() > 1) {
				Iterables
						.filter(IterableExtensions.map(jvmOperations,
								(op) -> jvmModelAssociations.getPrimarySourceElement(op)), Operation.class)
						.forEach((op) -> {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistService.java`
#### Snippet
```java
					});
			result.getEntries()
					.addAll(Lists.transform(sorted, (Pair<Integer, ContentAssistEntry> it) -> it.getValue()));
		}
		return result;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.statemachine.ide/src/org/eclipse/xtext/web/example/statemachine/ide/StatemachineWebContentProposalProvider.java`
#### Snippet
```java
			IScope scope = getScopeProvider().getScope(context.getCurrentModel(),
					StatemachinePackage.Literals.EVENT__SIGNAL);
			for (IEObjectDescription description : Iterables.filter(scope.getAllElements(),
					it -> StatemachinePackage.Literals.INPUT_SIGNAL.equals(it.getEClass()))) {
				ContentAssistEntry entry = getProposalCreator().createProposal(description.getName().toString(),
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `org.eclipse.xtext.web.example.statemachine.ide/src/org/eclipse/xtext/web/example/statemachine/ide/StatemachineWebContentProposalProvider.java`
#### Snippet
```java
			IScope scope = getScopeProvider().getScope(context.getCurrentModel(),
					StatemachinePackage.Literals.COMMAND__SIGNAL);
			for (IEObjectDescription description_1 : Iterables.filter(scope.getAllElements(),
					it -> StatemachinePackage.Literals.OUTPUT_SIGNAL.equals(it.getEClass()))) {
				ContentAssistEntry entry = getProposalCreator().createProposal(description_1.getName().toString(),
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'gson' in a Serializable class
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
	private final IResourceServiceProvider.Registry serviceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;

	private final Gson gson = new Gson();

	@Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'LOG' in a Serializable class
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextServlet.java`
#### Snippet
```java
	private static final long serialVersionUID = -6273795508296110114L;

	private final Logger LOG = Logger.getLogger(this.getClass());

	private final IResourceServiceProvider.Registry serviceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'disposableRegistry' in a Serializable class
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/MyXtextServlet.java`
#### Snippet
```java

	private static final long serialVersionUID = 7755930570117246031L;
	DisposableRegistry disposableRegistry;

	@Override
```

## RuleId[id=StringBufferReplaceableByString]
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
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
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
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
```

## RuleId[id=UnnecessaryReturn]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super HighlightingResult.Region`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/syntaxcoloring/HighlightingService.java`
#### Snippet
```java

	protected IHighlightedPositionAcceptor createHighlightedPositionAcceptor(
			List<HighlightingResult.Region> positions) {
		return (int offset, int length, String... ids) -> {
			HighlightingResult.Region region = new HighlightingResult.Region(offset, length, ids);
```

### BoundedWildcard
Can generalize to `? super Collection`
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/jvmmodel/EntitiesJvmModelHelper.java`
#### Snippet
```java
	 * erasure; each collection of duplicates is passed to the consumer.
	 */
	public void handleDuplicateJvmOperations(JvmDeclaredType jvmDeclaredType, Consumer<Collection<JvmOperation>> consumer) {
		// takes into consideration overloading and type erasure
		List<IResolvedOperation> methods = overrideHelper.getResolvedFeatures(jvmDeclaredType).getDeclaredOperations();
```

### BoundedWildcard
Can generalize to `? super IXtextWebDocument`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
	}

	protected <T extends Object> T doAccess(CancelableUnitOfWork<T, IXtextWebDocument> synchronousWork,
			boolean priority, boolean modify, CancelableUnitOfWork<?, IXtextWebDocument> asynchronousWork) {
		try {
```

### BoundedWildcard
Can generalize to `? super IXtextWebDocument`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java

	protected <T extends Object> T doAccess(CancelableUnitOfWork<T, IXtextWebDocument> synchronousWork,
			boolean priority, boolean modify, CancelableUnitOfWork<?, IXtextWebDocument> asynchronousWork) {
		try {
			DocumentSynchronizer synchronizer = document.getSynchronizer();
```

### BoundedWildcard
Can generalize to `? super AbstractElement`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/StatemachineParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StatemachineGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSignalAccess().getAlternatives_0(), "rule__Signal__Alternatives_0");
			builder.put(grammarAccess.getStatemachineAccess().getGroup(), "rule__Statemachine__Group__0");
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtext.web.example.statemachine.ide/src-gen/org/eclipse/xtext/web/example/statemachine/ide/contentassist/antlr/StatemachineParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StatemachineGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSignalAccess().getAlternatives_0(), "rule__Signal__Alternatives_0");
			builder.put(grammarAccess.getStatemachineAccess().getGroup(), "rule__Statemachine__Group__0");
```

### BoundedWildcard
Can generalize to `? super AbstractElement`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/EntitiesParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EntitiesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
```

### BoundedWildcard
Can generalize to `? super String`
in `org.eclipse.xtext.web.example.entities.ide/src-gen/org/eclipse/xtext/web/example/entities/ide/contentassist/antlr/EntitiesParser.java`
#### Snippet
```java
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EntitiesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `org.eclipse.xtext.web.example.jetty/src/main/java/org/eclipse/xtext/web/example/jetty/ServerLauncher.java`
#### Snippet
```java
			server.start();
			log.info("Server started " + server.getURI() + "...");
			new Thread() {

				public void run() {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
						"The parameter '" + key + "' must be specified.");
			}
			return defaultValue.get().booleanValue();
		}
		String lowerCase = stringValue.toLowerCase();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
						"The parameter '" + key + "' must be specified.");
			}
			return defaultValue.get().intValue();
		}
		try {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/HttpServiceContext.java`
#### Snippet
```java
			String[] contentType = null;
			if (request.getContentType() != null) {
				contentType = request.getContentType().split(";(\\s*)");
			}
			if (contentType != null && "application/x-www-form-urlencoded".equals(contentType[0])) {
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
					return key + "='" + value.substring(0, 16) + "...'";
				} else {
					if (value.matches(".*\\s+.*")) {
						return key + "='" + value + "'";
					} else {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
					}
				}
			}).replaceAll("(\\n|\\f|\\r)+", " ");
			LOG.trace("xtext-service/" + serviceType + stringParams);
		}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/InputSignal.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getInputSignal()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue <em>New Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue <em>New Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @return the value of the '<em>New Value</em>' attribute.
   * @see #setNewValue(boolean)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_NewValue()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(Signal)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCommand_Signal()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue <em>New Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Command.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachineFactory.java`
#### Snippet
```java
   * @generated
   */
  StatemachineFactory eINSTANCE = org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineFactoryImpl.init();

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/AbstractElementImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.AbstractElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl#getBody <em>Body</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.OperationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal#getName()
   * @see #getSignal()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Condition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition#getEvents()
   * @see #getCondition()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * @generated
   */
  StatemachinePackage eINSTANCE = org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachinePackageImpl.init();

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates <em>Nested States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nested States</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates()
   * @see #getState()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal <em>Output Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState()
   * @see #getTransition()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue()
   * @see #getEvent()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getSignals()
   * @see #getStatemachine()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal <em>Input Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getName()
   * @see #getState()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Value</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command#isNewValue()
   * @see #getCommand()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands()
   * @see #getState()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal()
   * @see #getEvent()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command#getSignal()
   * @see #getCommand()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition()
   * @see #getTransition()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions()
   * @see #getState()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/StatemachinePackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/OutputSignal.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getOutputSignal()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal_Name()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Signal.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getSignal()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl#getElements <em>Elements</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntitiesImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_ImportSection()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities_Elements()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getElements <em>Elements</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getElements <em>Elements</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntities()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entities.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement_Name()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/AbstractElement.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getAbstractElement()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl#isValue <em>Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/EventImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.EventImpl#isValue <em>Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/SignalImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.SignalImpl#getName <em>Name</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl#isNewValue <em>New Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/CommandImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.CommandImpl#isNewValue <em>New Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getNestedStates <em>Nested States</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getNestedStates <em>Nested States</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StateImpl.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StateImpl#getNestedStates <em>Nested States</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Body()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody <em>Body</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody <em>Body</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.common.types` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Operation.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getOperation_Params()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Name()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature_Type()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType <em>Type</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Feature.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getFeature()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/ConditionImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.ConditionImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
   * @generated
   */
  DomainmodelFactory eINSTANCE = org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelFactoryImpl.init();

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelFactory.java`
#### Snippet
```java
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/validation/AbstractEntitiesValidator.java`
#### Snippet
```java
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xbase"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Transition
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Condition
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.State
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal <em>Input Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.InputSignal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Event
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal <em>Output Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.OutputSignal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Signal
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.Command
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.Command}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Commands()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions <em>Transitions</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates <em>Nested States</em>}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates <em>Nested States</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.State#getNestedStates <em>Nested States</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Transitions()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_Name()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Nested States</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/State.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested States</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getState_NestedStates()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl#getState <em>State</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.TransitionImpl#getState <em>State</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl#getStates <em>States</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachineImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.impl.StatemachineImpl#getStates <em>States</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/PackageDeclaration.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/PackageDeclarationImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.PackageDeclarationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.entities.domainmodel.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_Features()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(JvmParameterizedTypeReference)
   * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity_SuperType()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Entity.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getEntity()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#eNS_URI
   * @see #init()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#eNS_URI
   * @see #init()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation#getParams()
   * @see #getOperation()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity#getFeatures()
   * @see #getEntity()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature#getType()
   * @see #getFeature()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * @generated
   */
  DomainmodelPackage eINSTANCE = org.eclipse.xtext.web.example.entities.domainmodel.impl.DomainmodelPackageImpl.init();

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities#getElements()
   * @see #getEntities()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities#getImportSection()
   * @see #getEntities()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation#getBody()
   * @see #getOperation()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Property
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entities</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity#getSuperType()
   * @see #getEntity()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/DomainmodelPackage.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature#getName()
   * @see #getFeature()
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_Condition()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState <em>State</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState <em>State</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Transition#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Transition.java`
#### Snippet
```java
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getTransition_State()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_States()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.Signal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Signals()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getStates <em>States</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine#getStates <em>States</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Statemachine.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getStatemachine()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Value()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(Signal)
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent_Signal()
   * @model
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue <em>Value</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue <em>Value</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getEvent()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Event.java`
#### Snippet
```java

  /**
   * Sets the value of the '{@link org.eclipse.xtext.web.example.statemachine.statemachine.Event#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entity
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Entities
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.AbstractElement
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Operation
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.PackageDeclaration
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Feature
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.web.example.entities.domainmodel.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.web.example.entities.domainmodel.Property
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl#getType <em>Type</em>}</li>
 * </ul>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel.impl` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.web.example.entities.domainmodel.impl.FeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.web.example.statemachine.statemachine.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition_Events()
   * @model containment="true"
   * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.web.example.statemachine.statemachine.Condition#getEvents <em>Events</em>}</li>
 * </ul>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/Condition.java`
#### Snippet
```java
 * </ul>
 *
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage#getCondition()
 * @model
 * @generated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary, and can be replaced with an import
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/validation/AbstractStatemachineValidator.java`
#### Snippet
```java
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage.eINSTANCE);
		return result;
	}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statemachine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.statemachine.statemachine` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.web.example.statemachine.statemachine.StatemachinePackage
 * @generated
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.emf.ecore` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.xtext.web.example.entities.domainmodel` is unnecessary and can be removed
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/Property.java`
#### Snippet
```java
 *
 *
 * @see org.eclipse.xtext.web.example.entities.domainmodel.DomainmodelPackage#getProperty()
 * @model
 * @generated
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/DocumentSynchronizer.java`
#### Snippet
```java
			if (priority) {
				if (waitingPriorityJobs.decrementAndGet() == 0) {
					return this.canceled = false;
				}
				return false;
```

### NestedAssignment
Result of assignment expression used
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocument.java`
#### Snippet
```java
			}
		}
		return text = newText;
	}

```

## RuleId[id=ReplaceNullCheck]
### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextResourcesServlet.java`
#### Snippet
```java
					String mimeType = getServletContext().getMimeType(fileName);
					String contentType = null;
					if (mimeType != null) {
						contentType = mimeType;
					} else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElseGet()'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			ResourceSet resourceSet = resourceSetProvider.get(resourceId, context);
			String uriString = null;
			if (resourceId != null) {
				uriString = resourceId;
			} else {
```

### ReplaceNullCheck
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/GeneratorService.java`
#### Snippet
```java
		List<GeneratorResult> artifacts = getResult(document).artifacts;
		final String searchString;
		if (artifactId != null) {
			searchString = artifactId;
		} else {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/validation/ValidationService.java`
#### Snippet
```java
		List<Issue> issues = resourceValidator.validate(it.getResource(), CheckMode.ALL, cancelIndicator);
		ValidationResult result = new ValidationResult();
		IterableExtensions.filter(issues, i -> !Severity.IGNORE.equals(i.getSeverity())).forEach(issue -> {
			result.getIssues().add(new ValidationResult.Issue(issue.getMessage(), translate(issue.getSeverity()),
					issue.getLineNumber(), issue.getColumn(), issue.getOffset(), issue.getLength()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			serviceDescriptor.context = context;
			serviceDescriptor.service = () -> {
				return new ServiceConflictResult("invalidStateId");
			};
			serviceDescriptor.hasConflict = true;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
		name2properties.asMap().values().forEach((properties) -> {
			if (properties.size() > 1) {
				properties.forEach((p) -> {
					error("Duplicate property " + p.getName(), p, DomainmodelPackage.Literals.FEATURE__NAME,
							IssueCodes.DUPLICATE_PROPERTY);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
				.head(Iterables.filter(jvmModelAssociations.getJvmElements(entity), JvmGenericType.class));
		Multimap<String, JvmOperation> signature2Declarations = HashMultimap.create();
		overrideHelper.getResolvedFeatures(inferredJavaClass).getDeclaredOperations().forEach((it) -> {
			signature2Declarations.put(it.getResolvedErasureSignature(), it.getDeclaration());
		});
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `org.eclipse.xtext.web.example.entities/src/org/eclipse/xtext/web/example/entities/validation/EntitiesValidator.java`
#### Snippet
```java
						.filter(IterableExtensions.map(jvmOperations,
								(op) -> jvmModelAssociations.getPrimarySourceElement(op)), Operation.class)
						.forEach((op) -> {
							error("Duplicate operation " + op.getName(), op, DomainmodelPackage.Literals.FEATURE__NAME, IssueCodes.DUPLICATE_OPERATION);
						});
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
				if (!skipAsyncWork && priority && documentAccess != null && !synchronizer.isCanceled()
						&& !Thread.currentThread().isInterrupted()) {
					executorService1.submit(new Runnable() {
						public void run() {
							try {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/XtextWebDocumentAccess.java`
#### Snippet
```java
					});
					currentThreadOwnsLock = false;
					executorService2.submit(new Runnable() {
						public void run() {
							try {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass featureEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private boolean isInitialized = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass entitiesEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass operationEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass entityEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass propertyEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private boolean isCreated = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/DomainmodelPackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private static boolean isInited = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private static boolean isInited = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass transitionEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass outputSignalEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass signalEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass eventEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private boolean isCreated = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass statemachineEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass stateEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass inputSignalEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass commandEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private EClass conditionEClass = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/StatemachinePackageImpl.java`
#### Snippet
```java
   * @generated
   */
  private boolean isInitialized = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/XtextResourcesServlet.java`
#### Snippet
```java
	private static final long DEFAULT_EXPIRE_TIME_S = 86400L; // 1 day

	private boolean disableCache = false;

	@Override
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gradle/java-compiler-settings.gradle`
#### Snippet
```java
 */

sourceCompatibility = '11'

tasks.withType(JavaCompile) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/OperationImpl.java`
#### Snippet
```java
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.OPERATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntitiesImpl.java`
#### Snippet
```java
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ENTITIES__IMPORT_SECTION, oldImportSection, newImportSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/EntityImpl.java`
#### Snippet
```java
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ENTITY__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/impl/TransitionImpl.java`
#### Snippet
```java
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `msgs`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/impl/FeatureImpl.java`
#### Snippet
```java
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.FEATURE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
			});
		} catch (Throwable t) {
			if (t instanceof IOException) {
				return null;
			} else {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/ISession.java`
#### Snippet
```java
    @Override
    public <T extends Object> T get(Object key) {
      return null;
    }
    
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/hover/HoverService.java`
#### Snippet
```java
					nameHtml, (String $0, IImageDescription $1) -> addIconDivs($1, $0));
		}
		return null;
	}

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/services/StatemachineGrammarAccess.java`
#### Snippet
```java
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/UpdateDocumentService.java`
#### Snippet
```java
			public Object exec(IXtextWebDocument doc, CancelIndicator cancelIndicator) throws Exception {
				doc.setText(fullText);
				return null;
			}
		});
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/model/UpdateDocumentService.java`
#### Snippet
```java
					doc.updateText(deltaText, offset, replaceLength);
				}
				return null;
			}
		});
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingService.java`
#### Snippet
```java
		IParseResult parseResult = resource.getParseResult();
		if (parseResult == null) {
			return null;
		}
		ICompositeNode rootNode = parseResult.getRootNode();
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/formatting/FormattingService.java`
#### Snippet
```java
					it.updateText(textWrapper.get(), regionWrapper.get().getOffset(), regionWrapper.get().getLength());
				}
				return null;
			}
		};
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createEObjectAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createTransitionAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createStatemachineAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createConditionAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createStateAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createInputSignalAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createEventAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createOutputSignalAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createSignalAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineAdapterFactory.java`
#### Snippet
```java
  public Adapter createCommandAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.servlet/src/main/java/org/eclipse/xtext/web/servlet/HttpServiceContext.java`
#### Snippet
```java
				return parameters.put(IServiceContext.SERVICE_TYPE, substring);
			}
			return null;
		} catch (IOException e) {
			throw Exceptions.sneakyThrow(e);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T defaultCase(EObject object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseOperation(Operation object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseFeature(Feature object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseEntity(Entity object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseProperty(Property object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelSwitch.java`
#### Snippet
```java
  public T caseEntities(Entities object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/generator/DefaultContentTypeProvider.java`
#### Snippet
```java
      return URLConnection.guessContentTypeFromName(fileName);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/services/EntitiesGrammarAccess.java`
#### Snippet
```java
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createEntityAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createEObjectAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createEntitiesAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createOperationAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createFeatureAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.entities/src-gen/org/eclipse/xtext/web/example/entities/domainmodel/util/DomainmodelAdapterFactory.java`
#### Snippet
```java
  public Adapter createPropertyAdapter()
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/util/ElementAtOffsetUtil.java`
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
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
							return formatterPreferencesProvider.getPreferenceValues($0.getResource());
						}
						return null;
					}
				});
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/XtextServiceDispatcher.java`
#### Snippet
```java
		} catch (Throwable t) {
			if (t instanceof IOException) {
				return null;
			} else {
				throw Exceptions.sneakyThrow(t);
```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T defaultCase(EObject object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseEvent(Event object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseSignal(Signal object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseState(State object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseStatemachine(Statemachine object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseCommand(Command object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseTransition(Transition object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseInputSignal(InputSignal object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseOutputSignal(OutputSignal object)
  {
    return null;
  }

```

### ReturnNull
Return of `null`
in `org.eclipse.xtext.web.example.statemachine/src-gen/org/eclipse/xtext/web/example/statemachine/statemachine/util/StatemachineSwitch.java`
#### Snippet
```java
  public T caseCondition(Condition object)
  {
    return null;
  }

```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `org.eclipse.xtext.web/src/main/java/org/eclipse/xtext/web/server/contentassist/ContentAssistService.java`
#### Snippet
```java
	public ContentAssistContext[] getContexts(IXtextWebDocument document, ITextRegion selection, int caretOffset) {
		if (caretOffset > document.getText().length()) {
			return new ContentAssistContext[] {};
		}
		ContentAssistContextFactory contextFactory = contextFactoryProvider.get();
```

## RuleId[id=UnusedAssignment]
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
  class NullImpl implements ISession {
    @Override
    public <T extends Object> T get(Object key) {
      return null;
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
    
    @Override
    public <T extends Object> T get(Object key, Function0<? extends T> factory) {
      return factory.apply();
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

## RuleId[id=ConstantValue]
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

## RuleId[id=UnstableApiUsage]
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

	protected void format(Condition condition, IFormattableDocument doc) {
		ISemanticRegion andKeyword = regionFor(condition).keyword(ga.getConditionAccess().getAndKeyword_1_0());
		doc.prepend(andKeyword, it -> it.oneSpace());
		doc.append(andKeyword, it -> it.oneSpace());
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

