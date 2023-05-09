# sisu.mojos 
 
# Bad smells
I found 16 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DefaultAnnotationParam | 10 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| SynchronizeOnNonFinalField | 1 | false |
| Deprecation | 1 | false |
## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `project`
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
    public void execute()
    {
        synchronized ( project )
        {
            new SisuIndex( outputDirectory )
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[classPath.size()\]'
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
            dumpEntries( "classPath", classPath );
        }
        return URLClassLoader.newInstance( classPath.toArray( new URL[classPath.size()] ) );
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new URL\[indexPath.size()\]'
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
            dumpEntries( "indexPath", indexPath );
        }
        return indexPath.toArray( new URL[indexPath.size()] );
    }

```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma Separated list of Types to include when indexing.
     */
    @Parameter( property = "includeTypes", defaultValue = "" )
    protected String includeTypes;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma separated list of ArtifactIds to exclude when indexing.
     */
    @Parameter( property = "excludeArtifactIds", defaultValue = "" )
    protected String excludeArtifactIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma Separated list of Classifiers to include when indexing.
     */
    @Parameter( property = "includeClassifiers", defaultValue = "" )
    protected String includeClassifiers;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma separated list of ArtifactIds to include when indexing.
     */
    @Parameter( property = "includeArtifactIds", defaultValue = "" )
    protected String includeArtifactIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Scope to include. Empty string indicates all scopes (default).
     */
    @Parameter( property = "includeScope", defaultValue = "" )
    protected String includeScope;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Scope to exclude. Empty string indicates no scopes (default).
     */
    @Parameter( property = "excludeScope", defaultValue = "" )
    protected String excludeScope;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma separated list of GroupIds to include when indexing.
     */
    @Parameter( property = "includeGroupIds", defaultValue = "" )
    protected String includeGroupIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma separated list of GroupIds to exclude when indexing.
     */
    @Parameter( property = "excludeGroupIds", defaultValue = "" )
    protected String excludeGroupIds;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma Separated list of Classifiers to exclude when indexing.
     */
    @Parameter( property = "excludeClassifiers", defaultValue = "" )
    protected String excludeClassifiers;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
     * Comma Separated list of Types to exclude when indexing.
     */
    @Parameter( property = "excludeTypes", defaultValue = "" )
    protected String excludeTypes;

```

## RuleId[id=Deprecation]
### Deprecation
'getDependencyArtifacts()' is deprecated
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
            final FilterArtifacts filter = new FilterArtifacts();

            filter.addFilter( new ProjectTransitivityFilter( project.getDependencyArtifacts(), excludeTransitive ) );
            filter.addFilter( new ScopeFilter( cleanList( includeScope ), cleanList( excludeScope ) ) );
            filter.addFilter( new TypeFilter( cleanList( includeTypes ), cleanList( excludeTypes ) ) );
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'artifact' to 'Artifact'
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
        for ( final Object artifact : project.getArtifacts() )
        {
            appendFileToClassPath( classPath, ( (Artifact) artifact ).getFile() );
        }
        if ( getLog().isDebugEnabled() )
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'artifact' to 'Artifact'
in `src/main/java/org/eclipse/sisu/mojos/IndexMojo.java`
#### Snippet
```java
                for ( final Object artifact : filter.filter( project.getArtifacts() ) )
                {
                    appendFileToClassPath( indexPath, ( (Artifact) artifact ).getFile() );
                }
            }
```

