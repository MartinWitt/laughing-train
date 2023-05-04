# commons-rdf 
 
# Bad smells
I found 418 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 325 | false |
| OptionalUsedAsFieldOrParameterType | 15 | false |
| OptionalAssignedToNull | 15 | false |
| DataFlowIssue | 8 | false |
| ConstantValue | 8 | false |
| JavadocDeclaration | 7 | false |
| JavadocLinkAsPlainText | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| DuplicatedCode | 5 | false |
| TrivialIf | 5 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| AutoCloseableResource | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| EmptyStatementBody | 2 | false |
| DoubleCheckedLocking | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| DanglingJavadoc | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    }

    Stream<List<RDFDataset.Quad>> filteredGraphs(final Optional<BlankNodeOrIRI> graphName) {
        return rdfDataSet.graphNames().parallelStream()
                // if graphName == null (wildcard), select all graphs,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    // This will be made public in JsonLdDataset
    // and is used by the other methods.
    boolean contains(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI s, final IRI p, final RDFTerm o) {
        return filteredGraphs(graphName).flatMap(List::stream).anyMatch(quadFilter(s, p, o));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    // NOTE: This is made public in JsonLdDataset and is used by the other
    // remove methods.
    void remove(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        // remove the quads which match our filter (which could have nulls as
        // wildcards)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    }

    private Resource[] asContexts(final Optional<BlankNodeOrIRI> graphName) {
        Resource[] contexts;
        if (graphName == null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ofNullable'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGeneralizedQuadLikeImpl.java`
#### Snippet
```java
        implements JenaGeneralizedQuadLike {

    JenaGeneralizedQuadLikeImpl(final RDFTerm subject, final RDFTerm predicate, final RDFTerm object, final Optional<RDFTerm> ofNullable) {
        super(subject, predicate, object, ofNullable);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java
    }

    private Node toJenaPattern(final Optional<? extends RDFTerm> graphName) {
        // In theory we could have done:
        // factory.toJena(graphName.orElse(internalJenaFactory::createAnyVariable))
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
class JenaQuadImpl extends AbstractQuadLike<BlankNodeOrIRI, IRI, RDFTerm, BlankNodeOrIRI> implements JenaQuad {

    JenaQuadImpl(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object, final Optional<BlankNodeOrIRI> graphName) {
        super(subject, predicate, object, graphName);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'graphName'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
    private static final DefaultGraphChecker DEFAULT_GRAPH_CHECKER = new DefaultGraphChecker();

    final Optional<G> graphName;
    final S subject;
    final P predicate;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java


    AbstractQuadLike(final S subject, final P predicate, final O object, final Optional<G> graphName) {
        this.subject = Objects.requireNonNull(subject);
        this.predicate = Objects.requireNonNull(predicate);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     *         pattern.
     */
    boolean contains(Optional<BlankNodeOrIRI> graphName, BlankNodeOrIRI subject, IRI predicate, RDFTerm object);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    default Iterable<Quad> iterate(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI subject, final IRI predicate,
            final RDFTerm object) throws ConcurrentModificationException, IllegalStateException {
        return ((Stream<Quad>) stream(graphName, subject, predicate, object))::iterator;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     * @return A {@link Stream} over the matched quads.
     */
    Stream<? extends Quad> stream(Optional<BlankNodeOrIRI> graphName, BlankNodeOrIRI subject, IRI predicate,
            RDFTerm object);

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     *            The quad object (<code>null</code> is a wildcard)
     */
    void remove(Optional<BlankNodeOrIRI> graphName, BlankNodeOrIRI subject, IRI predicate, RDFTerm object);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'graphName'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
class JsonLdGraphImpl extends AbstractJsonLdGraphLike<Triple> implements JsonLdGraph {

    private final Optional<BlankNodeOrIRI> graphName;

    JsonLdGraphImpl(final RDFDataset rdfDataSet) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'graphName'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    }

    JsonLdGraphImpl(final RDFDataset rdfDataSet, final Optional<BlankNodeOrIRI> graphName, final String bnodePrefix) {
        super(rdfDataSet, bnodePrefix);
        this.graphName = Objects.requireNonNull(graphName);
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JsonLdGraph' used without 'try'-with-resources statement
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/JsonLdParser.java`
#### Snippet
```java
            }
            // TODO: Modify JsonLdProcessor to have an actual triple callback
            final Graph parsedGraph = getJsonLdFactory().asGraph(rdfDataset);
            // sequential() as we don't know if destination is thread safe :-/
            parsedGraph.stream().sequential().forEach(intoGraph::add);
```

### AutoCloseableResource
'JsonLdDataset' used without 'try'-with-resources statement
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/JsonLdParser.java`
#### Snippet
```java
                // appending.
            }
            final Dataset fromDataset = getJsonLdFactory().asDataset(rdfDataset);
            // .sequential() as we don't know if destination is thread-safe :-/
            fromDataset.stream().sequential().forEach(intoDataset::add);
```

### AutoCloseableResource
'JsonLdDataset' used without 'try'-with-resources statement
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/JsonLdParser.java`
#### Snippet
```java
            fromDataset.stream().sequential().forEach(intoDataset::add);
        } else {
            final Dataset fromDataset = getJsonLdFactory().asDataset(rdfDataset);
            // No need for .sequential() here
            fromDataset.stream().forEach(getTarget());
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    @Override
    public void clear() {
        filteredGraphs(null).forEach(List::clear);
        // In theory we could use
        // rdfDataSet.clear();
```

### OptionalAssignedToNull
Optional value is compared with null
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
                // otherwise check its jsonld string
                // (including @default for default graph)
                .filter(g -> graphName == null || g.equals(graphName.map(factory::asJsonLdString).orElse("@default")))
                // remove the quads which match our filter (which could have
                // nulls as wildcards)
```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    @Override
    public Stream<RDF4JQuad> stream() {
        return stream(null, null, null, null);
    }

```

### OptionalAssignedToNull
Optional value is compared with null
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    private Resource[] asContexts(final Optional<BlankNodeOrIRI> graphName) {
        Resource[] contexts;
        if (graphName == null) {
            // no contexts == any contexts
            contexts = new Resource[0];
```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    @Override
    public ClosableIterable<Quad> iterate() throws ConcurrentModificationException, IllegalStateException {
        return iterate(null, null, null, null);
    }

```

### OptionalAssignedToNull
Optional value is compared with null
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java
        // but because of generics casting rules that doesn't work :(

        if (graphName == null) {
            return ANY;
        }
```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/JsonLdParser.java`
#### Snippet
```java
        } else if (getTargetDataset().isPresent()) {
            final Dataset intoDataset = getTargetDataset().get();
            if (intoDataset instanceof JsonLdDataset && !intoDataset.contains(null, null, null, null)) {
                final JsonLdDataset jsonLdDataset = (JsonLdDataset) intoDataset;
                // Empty - we can just do a brave replace!
```

### OptionalAssignedToNull
Optional value is compared with null
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
            final RDFTerm object) {
        final Optional<BlankNodeOrIRI> newGraphName;
        if (graphName == null) {
            // Avoid Optional<Optional<BlankNodeOrIRI>> ...
            newGraphName = null;
```

### OptionalAssignedToNull
Null is used for 'Optional' type in assignment
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
        if (graphName == null) {
            // Avoid Optional<Optional<BlankNodeOrIRI>> ...
            newGraphName = null;
        } else {
            newGraphName = graphName.map(g -> (BlankNodeOrIRI) internallyMap(g));
```

### OptionalAssignedToNull
Optional value is compared with null
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java

        return getQuads(t -> {
            if (newGraphName != null && !t.getGraphName().equals(newGraphName)) {
                // This would check Optional.empty() == Optional.empty()
                return false;
```

### OptionalAssignedToNull
Null is used for 'Optional' type in return statement
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetGraphView.java`
#### Snippet
```java
    private Optional<BlankNodeOrIRI> unionOrNamedGraph() {
        if (unionGraph) {
            return null;
        }
        return Optional.ofNullable(namedGraph);
```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public Stream<JsonLdTriple> stream(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return filteredGraphs(null).flatMap(List::stream).filter(quadFilter(subject, predicate, object))
                .map(factory::asTriple)
                // Make sure we don't have duplicate triples
```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public void remove(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        super.remove(null, subject, predicate, object);
    }

```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public boolean contains(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return super.contains(null, subject, predicate, object);
    }

```

### OptionalAssignedToNull
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    public void remove(final Triple t) {
        // Remove from ALL graphs, not just default graph
        super.remove(null, t.getSubject(), t.getPredicate(), t.getObject());
    }

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof IRI)'
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/IRIImpl.java`
#### Snippet
```java
            return true;
        }
        if (obj == null || !(obj instanceof IRI)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof Literal)'
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/LiteralImpl.java`
#### Snippet
```java
            return true;
        }
        if (obj == null || !(obj instanceof Literal)) {
            return false;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'obj == null' covered by subsequent condition '!(obj instanceof IRI)'
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/W3CRDFSyntax.java`
#### Snippet
```java
                return true;
            }
            if (obj == null || !(obj instanceof IRI)) {
                return false;
            }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Resource`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JBlankNodeOrIRI.java`
#### Snippet
```java
 * {@link BlankNodeOrIRI} (e.g. the subject of a {@link Triple}).
 * <p>
 * The underlying RDF4J {@link org.eclipse.rdf4j.model.Resource} instance can be
 * retrieved with {@link #asValue()}.
 */
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraphLike.java`
#### Snippet
```java
 * <p>
 * This is a common interface for {@link RDF4JGraph} and {@link RDF4JDataset}
 * which provides access to the underlying RDF4J {@link Model} and/or
 * {@link Repository}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraphLike.java`
#### Snippet
```java
 * This is a common interface for {@link RDF4JGraph} and {@link RDF4JDataset}
 * which provides access to the underlying RDF4J {@link Model} and/or
 * {@link Repository}.
 * <p>
 * At least one of {@link #asModel()} or {@link #asRepository()} will always be
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraphLike.java`
#### Snippet
```java

    /**
     * Return the corresponding RDF4J {@link Model}, if present.
     * <p>
     * The return value is {@link Optional#isPresent()} if this is backed by a
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraphLike.java`
#### Snippet
```java

    /**
     * Return the corresponding RDF4J {@link Repository}, if present.
     * <p>
     * The return value is {@link Optional#isPresent()} if this is backed by a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JLiteral.java`
#### Snippet
```java
 * {@link org.apache.commons.rdf.api.Literal}.
 * <p>
 * The underlying RDF4J {@link org.eclipse.rdf4j.model.Literal} instance can be
 * retrieved with {@link #asValue()}.
 *
```

### JavadocReference
Cannot resolve symbol `DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaDataset.java`
#### Snippet
```java
 * A Jena-backed {@link Dataset}.
 * <p>
 * The underlying Jena {@link DatasetGraph} can be accessed with
 * {@link #asJenaDatasetGraph()}.
 */
```

### JavadocReference
Cannot resolve symbol `DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaDataset.java`
#### Snippet
```java

    /**
     * Return the underlying Jena {@link DatasetGraph}.
     * <p>
     * Changes to the Jena <em>dataset graph</em> are reflected in the Commons
```

### JavadocReference
Cannot resolve symbol `DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaDataset.java`
#### Snippet
```java
     * RDF dataset and vice versa.
     *
     * @return A Jena {@link DatasetGraph}
     */
    DatasetGraph asJenaDatasetGraph();
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaLiteral.java`
#### Snippet
```java
 * A Jena-backed {@link Literal}
 *
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isLiteral()
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaLiteral.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isLiteral()
 */
public interface JenaLiteral extends JenaRDFTerm, Literal {
```

### JavadocReference
Cannot resolve symbol `isLiteral()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaLiteral.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isLiteral()
 */
public interface JenaLiteral extends JenaRDFTerm, Literal {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * <p>
 * Use the {@link org.apache.commons.rdf.rdf4j.RDF4J} to convert between Commons RDF and RDF4J types, for
 * instance {@link org.apache.commons.rdf.rdf4j.RDF4J#asQuad(org.eclipse.rdf4j.model.Statement)} converts a
 * RDF4J {@link org.eclipse.rdf4j.model.Statement} to a
 * {@link org.apache.commons.rdf.api.Quad}. Converted RDF terms implement the
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * Use the {@link org.apache.commons.rdf.rdf4j.RDF4J} to convert between Commons RDF and RDF4J types, for
 * instance {@link org.apache.commons.rdf.rdf4j.RDF4J#asQuad(org.eclipse.rdf4j.model.Statement)} converts a
 * RDF4J {@link org.eclipse.rdf4j.model.Statement} to a
 * {@link org.apache.commons.rdf.api.Quad}. Converted RDF terms implement the
 * {@link org.apache.commons.rdf.rdf4j.RDF4JTerm} interface, and converted statements the
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * underlying RDF4J implementations.
 * <p>
 * RDF4J {@link org.eclipse.rdf4j.model.Model}s and
 * {@link org.eclipse.rdf4j.repository.Repository} instances can be adapted to
 * Commons RDF {@link org.apache.commons.rdf.api.Graph} and {@link org.apache.commons.rdf.api.Dataset}, e.g. using
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.repository.Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * <p>
 * RDF4J {@link org.eclipse.rdf4j.model.Model}s and
 * {@link org.eclipse.rdf4j.repository.Repository} instances can be adapted to
 * Commons RDF {@link org.apache.commons.rdf.api.Graph} and {@link org.apache.commons.rdf.api.Dataset}, e.g. using
 * {@link org.apache.commons.rdf.rdf4j.RDF4J#asGraph(org.eclipse.rdf4j.model.Model)} or
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * {@link org.eclipse.rdf4j.repository.Repository} instances can be adapted to
 * Commons RDF {@link org.apache.commons.rdf.api.Graph} and {@link org.apache.commons.rdf.api.Dataset}, e.g. using
 * {@link org.apache.commons.rdf.rdf4j.RDF4J#asGraph(org.eclipse.rdf4j.model.Model)} or
 * {@link org.apache.commons.rdf.rdf4j.RDF4J#asDataset(org.eclipse.rdf4j.repository.Repository, RDF4J.Option...)}
 * The returned adapted graph/dataset is directly mapped, so changes are
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.repository.Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/package-info.java`
#### Snippet
```java
 * Commons RDF {@link org.apache.commons.rdf.api.Graph} and {@link org.apache.commons.rdf.api.Dataset}, e.g. using
 * {@link org.apache.commons.rdf.rdf4j.RDF4J#asGraph(org.eclipse.rdf4j.model.Model)} or
 * {@link org.apache.commons.rdf.rdf4j.RDF4J#asDataset(org.eclipse.rdf4j.repository.Repository, RDF4J.Option...)}
 * The returned adapted graph/dataset is directly mapped, so changes are
 * propagated both ways. For convenience, the marker interface
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaQuadLike.java`
#### Snippet
```java

/**
 * A {@link QuadLike} wrapper of a Jena {@link Quad}.
 * <p>
 * This is a marker interface common to its specializations {@link JenaQuad} and
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaQuadLike.java`
#### Snippet
```java
     * Return the adapted Jena quad
     *
     * @return Adapted Jena {@link Quad}.
     */
    Quad asJenaQuad();
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JBlankNode.java`
#### Snippet
```java
 * {@link org.apache.commons.rdf.api.BlankNode}.
 * <p>
 * The underlying RDF4J {@link BNode} instance can be retrieved with
 * {@link #asValue()}.
 *
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTripleLike.java`
#### Snippet
```java

    /**
     * Return the corresponding RDF4J {@link Statement}.
     *
     * @return The corresponding RDF4J Statement.
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTripleLike.java`
#### Snippet
```java
 * {@link RDF4JQuad}.
 * <p>
 * This is backed by a {@link Statement} retrievable with
 * {@link #asStatement()}.
 *
```

### JavadocReference
Cannot resolve symbol `Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaTripleLike.java`
#### Snippet
```java

/**
 * A {@link TripleLike} wrapper of a Jena {@link Triple}.
 * <p>
 * This is a marker interface common to its specializations {@link JenaTriple},
```

### JavadocReference
Cannot resolve symbol `Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaTripleLike.java`
#### Snippet
```java
     * Return the adapted Jena triple
     *
     * @return Adapted Jena {@link Triple}.
     */
    Triple asJenaTriple();
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaTriple.java`
#### Snippet
```java
 * A Jena-backed {@link org.apache.commons.rdf.api.Triple}.
 * <p>
 * The underlying Jena {@link org.apache.jena.graph.Triple} can be accessed with
 * {@link #asJenaTriple()}.
 */
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaBlankNode.java`
#### Snippet
```java
 * A Jena-backed {@link BlankNode}.
 * <p>
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isBlank()
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaBlankNode.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isBlank()
 */
public interface JenaBlankNode extends JenaRDFTerm, BlankNode {
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaBlankNode.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isBlank()
 */
public interface JenaBlankNode extends JenaRDFTerm, BlankNode {
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JDataset} from a RDF4J {@link Repository}.
     * <p>
     * Changes in the dataset will be reflected in the repsitory, and vice
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to adapt
     * @param handleInitAndShutdown
     *            If <code>true</code>, the {@link RDF4JDataset} will initialize
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JGraph} from a RDF4J {@link Model}.
     * <p>
     * Changes in the graph will be reflected in the model, and vice versa.
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param model
     *            RDF4J {@link Model} to adapt
     * @param rdf4jTermFactory
     *            factory to use for adapting graph triples
```

### JavadocReference
Cannot resolve symbol `IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JIRI} from a RDF4J {@link IRI}.
     *
     * @param iri
```

### JavadocReference
Cannot resolve symbol `IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param iri
     *            RDF4J {@link IRI} to adapt
     * @return Adapted {@link RDF4JIRI}
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
 * internal use by Commons RDF and may change in any minor update. Use instead
 * {@link RDF4J} methods like {@link RDF4J#createBlankNode()},
 * {@link RDF4J#asRDFTerm(org.eclipse.rdf4j.model.Value)} and
 * {@link RDF4J#asGraph(Repository, Option...)}
 * <p>
```

### JavadocReference
Cannot resolve symbol `asGraph(Repository, Option...)`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
 * {@link RDF4J} methods like {@link RDF4J#createBlankNode()},
 * {@link RDF4J#asRDFTerm(org.eclipse.rdf4j.model.Value)} and
 * {@link RDF4J#asGraph(Repository, Option...)}
 * <p>
 * This class exists as a <code>public</code> bridge between the packages
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
 * {@link RDF4J} methods like {@link RDF4J#createBlankNode()},
 * {@link RDF4J#asRDFTerm(org.eclipse.rdf4j.model.Value)} and
 * {@link RDF4J#asGraph(Repository, Option...)}
 * <p>
 * This class exists as a <code>public</code> bridge between the packages
```

### JavadocReference
Cannot resolve symbol `Option`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
 * {@link RDF4J} methods like {@link RDF4J#createBlankNode()},
 * {@link RDF4J#asRDFTerm(org.eclipse.rdf4j.model.Value)} and
 * {@link RDF4J#asGraph(Repository, Option...)}
 * <p>
 * This class exists as a <code>public</code> bridge between the packages
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JGraph} from a RDF4J {@link Model}.
     * <p>
     * Changes in the graph will be reflected in the model, and vice versa.
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to adapt
     * @param handleInitAndShutdown
     *            If <code>true</code>, the {@link RDF4JGraph} will initialize
```

### JavadocReference
Cannot resolve symbol `Resource`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *            If true, any inferred quads are included in the dataset
     * @param contextMask
     *            Zero or more {@link Resource}s contexts. The array may contain
     *            the value <code>null</code> for the default graph - however
     *            care must be taken to not provide a null-array
```

### JavadocReference
Cannot resolve symbol `Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JLiteral} from a RDF4J {@link Literal}.
     *
     * @param literal
```

### JavadocReference
Cannot resolve symbol `Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param literal
     *            RDF4J {@link Literal}
     * @return Adapted {@link RDF4JLiteral}
     */
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JQuad} from a RDF4J {@link Statement}.
     *
     * @param statement
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param statement
     *            RDF4J {@link Statement} to adapt
     * @param salt
     *            {@link UUID} for adapting any {@link BNode}s
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *            RDF4J {@link Statement} to adapt
     * @param salt
     *            {@link UUID} for adapting any {@link BNode}s
     * @return Adapted {@link RDF4JQuad}
     */
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JBlankNode} from a RDF4J {@link BNode}.
     *
     * @param bNode
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param bNode
     *            RDF4J {@link BNode} to adapt
     * @param salt
     *            {@link UUID} to use for {@link BlankNode#uniqueReference()} in
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     * @param salt
     *            {@link UUID} to use for {@link BlankNode#uniqueReference()} in
     *            combination with {@link BNode#getID()}
     * @return Adapted {@link RDF4JBlankNode}
     */
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     * @param salt
     *            {@link UUID} to use for {@link BlankNode#uniqueReference()} in
     *            combination with {@link BNode#getID()}
     * @return Adapted {@link RDF4JBlankNode}
     */
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java

    /**
     * Construct a {@link RDF4JTriple} from a RDF4J {@link Statement}.
     *
     * @param statement
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *
     * @param statement
     *            RDF4J {@link Statement} to adapt
     * @param salt
     *            {@link UUID} for adapting any {@link BNode}s
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/InternalRDF4JFactory.java`
#### Snippet
```java
     *            RDF4J {@link Statement} to adapt
     * @param salt
     *            {@link UUID} for adapting any {@link BNode}s
     * @return Adapted {@link RDF4JTriple}
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JIRI.java`
#### Snippet
```java
 * {@link org.apache.commons.rdf.api.IRI}.
 * <p>
 * The underlying RDF4J {@link org.eclipse.rdf4j.model.IRI} instance can be
 * retrieved with {@link #asValue()}.
 *
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDFTerm.java`
#### Snippet
```java
 * A Jena-backed {@link RDFTerm}.
 * <p>
 * The underlying Jena {@link Node} can be retrieved with {@link #asJenaNode()}.
 *
 * @see JenaIRI
```

### JavadocReference
Cannot resolve symbol `JsonLdParser`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/package-info.java`
#### Snippet
```java
 * {@link org.apache.commons.rdf.jsonldjava} package.
 * <ul>
 * <li>{@link JsonLdParser} - an JSONLD-Java-backed implementations of
 * {@link org.apache.commons.rdf.experimental.RDFParser}.</li>
 * </ul>
```

### JavadocReference
Cannot resolve symbol `asTriple(Quad)`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
     *
     *
     * @see JsonLdRDF#asTriple(Quad)
     * @see JsonLdRDF#asQuad(Quad)
     * @param jsonldQuad
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
     *
     *
     * @see JsonLdRDF#asTriple(Quad)
     * @see JsonLdRDF#asQuad(Quad)
     * @param jsonldQuad
```

### JavadocReference
Cannot resolve symbol `asQuad(Quad)`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
     *
     * @see JsonLdRDF#asTriple(Quad)
     * @see JsonLdRDF#asQuad(Quad)
     * @param jsonldQuad
     *            jsonld quad to convert
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
     *
     * @see JsonLdRDF#asTriple(Quad)
     * @see JsonLdRDF#asQuad(Quad)
     * @param jsonldQuad
     *            jsonld quad to convert
```

### JavadocReference
Cannot resolve symbol `bnodePrefix()`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java

    /**
     * Used by {@link #bnodePrefix()} to get a unique UUID per JVM run
     */
    private static final UUID SALT = UUID.randomUUID();
```

### JavadocReference
Cannot resolve symbol `asDataset(org.eclipse.rdf4j.repository.Repository, Option...)`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JDataset.java`
#### Snippet
```java
 *
 * @see RDF4J#createDataset()
 * @see RDF4J#asDataset(org.eclipse.rdf4j.repository.Repository, Option...)
 */
public interface RDF4JDataset extends Dataset, RDF4JGraphLike<Quad> {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.repository.Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JDataset.java`
#### Snippet
```java
 *
 * @see RDF4J#createDataset()
 * @see RDF4J#asDataset(org.eclipse.rdf4j.repository.Repository, Option...)
 */
public interface RDF4JDataset extends Dataset, RDF4JGraphLike<Quad> {
```

### JavadocReference
Cannot resolve symbol `Option`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JDataset.java`
#### Snippet
```java
 *
 * @see RDF4J#createDataset()
 * @see RDF4J#asDataset(org.eclipse.rdf4j.repository.Repository, Option...)
 */
public interface RDF4JDataset extends Dataset, RDF4JGraphLike<Quad> {
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
     * <p>
     * If the set is not {@link Set#isEmpty()}, the mask determines which
     * <em>contexts</em> in the corresponding RDF4J {@link Model} or
     * {@link Repository} that this graph reflect. Modifications to the graph
     * (e.g. {@link #add(Triple)} will be performed for all the specified
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
     * If the set is not {@link Set#isEmpty()}, the mask determines which
     * <em>contexts</em> in the corresponding RDF4J {@link Model} or
     * {@link Repository} that this graph reflect. Modifications to the graph
     * (e.g. {@link #add(Triple)} will be performed for all the specified
     * contexts, while retrieval (e.g. {@link #contains(Triple)}) will succeed
```

### JavadocReference
Cannot resolve symbol `asGraph(Repository, Set, Option...)`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
     * <p>
     * The returned set is an immutable copy; to specify a different mask, use
     * {@link RDF4J#asGraph(Repository, Set, Option...)}
     *
     * @return The context mask as a set of {@link BlankNodeOrIRI} graph names,
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
     * <p>
     * The returned set is an immutable copy; to specify a different mask, use
     * {@link RDF4J#asGraph(Repository, Set, Option...)}
     *
     * @return The context mask as a set of {@link BlankNodeOrIRI} graph names,
```

### JavadocReference
Cannot resolve symbol `Option`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
     * <p>
     * The returned set is an immutable copy; to specify a different mask, use
     * {@link RDF4J#asGraph(Repository, Set, Option...)}
     *
     * @return The context mask as a set of {@link BlankNodeOrIRI} graph names,
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 *
 * @see RDF4J#createGraph()
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
```

### JavadocReference
Cannot resolve symbol `asGraph(Repository, Option...)`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#createGraph()
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#createGraph()
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
```

### JavadocReference
Cannot resolve symbol `Option`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#createGraph()
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
```

### JavadocReference
Cannot resolve symbol `asGraphUnion(Repository, Option...)`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
 * @see RDF4JDataset#getGraph(BlankNodeOrIRI)
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
 * @see RDF4JDataset#getGraph(BlankNodeOrIRI)
```

### JavadocReference
Cannot resolve symbol `Option`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraph.java`
#### Snippet
```java
 * @see RDF4J#asGraph(Model)
 * @see RDF4J#asGraph(Repository, Option...)
 * @see RDF4J#asGraphUnion(Repository, Option...)
 * @see RDF4JDataset#getGraph()
 * @see RDF4JDataset#getGraph(BlankNodeOrIRI)
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    /**
     * Adapt a Commons RDF {@link Triple} or {@link Quad} as a RDF4J
     * {@link Statement}.
     * <p>
     * If the <code>tripleLike</code> argument is an {@link RDF4JTriple} or a
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link RDF4JQuad}, then its {@link RDF4JTripleLike#asStatement()} is
     * returned as-is. Note that this means that a {@link RDF4JTriple} would
     * preserve its {@link Statement#getContext()}, and that any
     * {@link BlankNode}s would be deemed equivalent in RDF4J if they have the
     * same {@link BNode#getID()}.
```

### JavadocReference
Cannot resolve symbol `getContext()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link RDF4JQuad}, then its {@link RDF4JTripleLike#asStatement()} is
     * returned as-is. Note that this means that a {@link RDF4JTriple} would
     * preserve its {@link Statement#getContext()}, and that any
     * {@link BlankNode}s would be deemed equivalent in RDF4J if they have the
     * same {@link BNode#getID()}.
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * preserve its {@link Statement#getContext()}, and that any
     * {@link BlankNode}s would be deemed equivalent in RDF4J if they have the
     * same {@link BNode#getID()}.
     *
     * @param tripleLike
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * preserve its {@link Statement#getContext()}, and that any
     * {@link BlankNode}s would be deemed equivalent in RDF4J if they have the
     * same {@link BNode#getID()}.
     *
     * @param tripleLike
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * @param tripleLike
     *            A {@link Triple} or {@link Quad} to adapt
     * @return A corresponding {@link Statement}
     */
    public Statement asStatement(final TripleLike tripleLike) {
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt an RDF4J {@link Repository} as a Commons RDF {@link Graph}.
     * <p>
     * The graph will only include triples in the default graph (equivalent to
```

### JavadocReference
Cannot resolve symbol `RepositoryConnection`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>Note:</strong> Some operations on the {@link RDF4JGraph} requires
     * the use of try-with-resources to close underlying
     * {@link RepositoryConnection}s, including {@link RDF4JGraph#iterate()} and
     * {@link RDF4JGraph#stream()}.
     *
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to connect to.
     * @param options
     *            Zero or more {@link Option}
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt an RDF4J {@link Repository} as a Commons RDF {@link Dataset}.
     * <p>
     * Changes to the dataset are reflected in the repository, and vice versa.
```

### JavadocReference
Cannot resolve symbol `RepositoryConnection`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>Note:</strong> Some operations on the {@link RDF4JDataset}
     * requires the use of try-with-resources to close underlying
     * {@link RepositoryConnection}s, including {@link RDF4JDataset#iterate()},
     * {@link RDF4JDataset#stream()} and {@link RDF4JDataset#getGraphNames()}.
     *
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to connect to.
     * @param options
     *            Zero or more {@link Option}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Resource`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.Resource} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNodeOrIRI}
     * <p>
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * @param value
     *            The RDF4J {@link Value} to convert.
     * @return A {@link RDF4JBlankNodeOrIRI} that corresponds to the RDF4J Resource
     */
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt a RDF4J {@link Statement} as a Commons RDF {@link Triple}.
     * <p>
     * For the purpose of {@link BlankNode} equivalence, this method will use an
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * <strong>NOTE:</strong> If combining RDF4J statements from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J statements from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J statements from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param statement
     *            The RDF4J {@link Statement} to adapt.
     * @return A {@link RDF4JTriple} that is equivalent to the statement
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.IRI} as a Commons RDF
     * {@link org.apache.commons.rdf.api.IRI}
     * <p>
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * @param value
     *            The RDF4J {@link Value} to convert.
     * @return A {@link RDF4JIRI} that corresponds to the RDF4J IRI
     */
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    /**
     *
     * Adapt a RDF4J {@link Value} as a Commons RDF {@link RDFTerm}.
     * <p>
     * The value will be of the same kind as the term, e.g. a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
     * {@link org.apache.commons.rdf.api.Literal}
     * <p>
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param value
     *            The RDF4J {@link Value} to convert.
     * @return A {@link RDFTerm} that corresponds to the RDF4J value
     * @throws IllegalArgumentException
```

### JavadocReference
Cannot resolve symbol `RepositoryConnection`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>Note:</strong> Some operations on the {@link RDF4JDataset}
     * requires the use of try-with-resources to close underlying
     * {@link RepositoryConnection}s, including {@link RDF4JDataset#iterate()},
     * {@link RDF4JDataset#stream()} and {@link RDF4JDataset#getGraphNames()}.
     *
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt a RDF4J {@link Statement} as a Commons RDF {@link Quad}.
     * <p>
     * For the purpose of {@link BlankNode} equivalence, this method will use an
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * internal salt UUID that is unique per instance of {@link RDF4J}.
     * <p>
     * <strong>NOTE:</strong> If combining RDF4J {@link Statement}s multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * <strong>NOTE:</strong> If combining RDF4J {@link Statement}s multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J {@link Statement}s multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J {@link Statement}s multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        includeInferred,
        /**
         * The graph/dataset should handle {@link Repository#initialize()} (if
         * needed) and {@link Repository#shutDown()} on {@link Graph#close()} /
         * {@link Dataset#close()}.
```

### JavadocReference
Cannot resolve symbol `initialize()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        includeInferred,
        /**
         * The graph/dataset should handle {@link Repository#initialize()} (if
         * needed) and {@link Repository#shutDown()} on {@link Graph#close()} /
         * {@link Dataset#close()}.
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        /**
         * The graph/dataset should handle {@link Repository#initialize()} (if
         * needed) and {@link Repository#shutDown()} on {@link Graph#close()} /
         * {@link Dataset#close()}.
         */
```

### JavadocReference
Cannot resolve symbol `shutDown()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        /**
         * The graph/dataset should handle {@link Repository#initialize()} (if
         * needed) and {@link Repository#shutDown()} on {@link Graph#close()} /
         * {@link Dataset#close()}.
         */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.BNode} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNode}
     * <p>
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>NOTE:</strong> If combining RDF4J values from multiple
     * repositories or models, then their {@link BNode}s may have the same
     * {@link BNode#getID()}, which with this method would become equivalent
     * according to {@link BlankNode#equals(Object)} and
     * {@link BlankNode#uniqueReference()}, unless a separate {@link RDF4J}
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param value
     *            The RDF4J {@link BNode} to convert.
     * @return A {@link RDF4JBlankNode} that corresponds to the RDF4J BNode
     */
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * This constructor is intended for use with the value factory from
     * {@link Repository#getValueFactory()} when using Repository-based graphs
     * and datasets.
     *
```

### JavadocReference
Cannot resolve symbol `getValueFactory()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * This constructor is intended for use with the value factory from
     * {@link Repository#getValueFactory()} when using Repository-based graphs
     * and datasets.
     *
```

### JavadocReference
Cannot resolve symbol `ValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param valueFactory
     *            The RDF4J {@link ValueFactory} to use
     */
    public RDF4J(final ValueFactory valueFactory) {
```

### JavadocReference
Cannot resolve symbol `ValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param valueFactory
     *            The RDF4J {@link ValueFactory} to use
     * @param salt
     *            An {@link UUID} salt to be used by any created
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt an RDF4J {@link Repository} as a Commons RDF {@link Graph}.
     * <p>
     * The graph will include triples in the specified contexts.
```

### JavadocReference
Cannot resolve symbol `RepositoryConnection`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <strong>Note:</strong> Some operations on the {@link RDF4JGraph} requires
     * the use of try-with-resources to close underlying
     * {@link RepositoryConnection}s, including {@link RDF4JGraph#iterate()} and
     * {@link RDF4JGraph#stream()}.
     *
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to connect to.
     * @param contexts
     *            A {@link Set} of {@link BlankNodeOrIRI} specifying the graph
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt a RDF4J {@link Value} as a Commons RDF {@link RDFTerm}.
     * <p>
     * The value will be of the same kind as the term, e.g. a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
     * {@link org.apache.commons.rdf.api.Literal}
     *
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param value
     *            The RDF4J {@link Value} to convert.
     * @param salt
     *            A {@link UUID} salt to use for uniquely mapping any
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * @param salt
     *            A {@link UUID} salt to use for uniquely mapping any
     *            {@link BNode}s. The salt should typically be the same for
     *            multiple statements in the same {@link Repository} or
     *            {@link Model} to ensure {@link BlankNode#equals(Object)} and
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *            A {@link UUID} salt to use for uniquely mapping any
     *            {@link BNode}s. The salt should typically be the same for
     *            multiple statements in the same {@link Repository} or
     *            {@link Model} to ensure {@link BlankNode#equals(Object)} and
     *            {@link BlankNode#uniqueReference()} works as intended.
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *            {@link BNode}s. The salt should typically be the same for
     *            multiple statements in the same {@link Repository} or
     *            {@link Model} to ensure {@link BlankNode#equals(Object)} and
     *            {@link BlankNode#uniqueReference()} works as intended.
     * @return A {@link RDFTerm} that corresponds to the RDF4J value
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt an RDF4J {@link Model} as a Commons RDF {@link Graph}.
     * <p>
     * Changes to the graph are reflected in the model, and vice versa.
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param model
     *            RDF4J {@link Model} to adapt.
     * @return Adapted {@link Graph}.
     */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.Literal} as a Commons RDF
     * {@link org.apache.commons.rdf.api.Literal}
     * <p>
```

### JavadocReference
Cannot resolve symbol `Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * @param value
     *            The RDF4J {@link Literal} to convert.
     * @return A {@link RDF4JLiteral} that corresponds to the RDF4J literal
     */
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt a Commons RDF {@link RDFTerm} as a RDF4J {@link Value}.
     * <p>
     * The value will be of the same kind as the term, e.g. a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * The value will be of the same kind as the term, e.g. a
     * {@link org.apache.commons.rdf.api.BlankNode} is converted to a
     * {@link org.eclipse.rdf4j.model.BNode}, a
     * {@link org.apache.commons.rdf.api.IRI} is converted to a
     * {@link org.eclipse.rdf4j.model.IRI} and a
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode}, a
     * {@link org.apache.commons.rdf.api.IRI} is converted to a
     * {@link org.eclipse.rdf4j.model.IRI} and a
     * {@link org.apache.commons.rdf.api.Literal} is converted to a
     * {@link org.eclipse.rdf4j.model.Literal}.
```

### JavadocReference
Cannot resolve symbol `org.eclipse.rdf4j.model.Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} and a
     * {@link org.apache.commons.rdf.api.Literal} is converted to a
     * {@link org.eclipse.rdf4j.model.Literal}.
     * <p>
     * If the provided {@link RDFTerm} is <code>null</code>, then the returned
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * If the provided term is an instance of {@link RDF4JTerm}, then the
     * {@link RDF4JTerm#asValue()} is returned without any conversion. Note that
     * this could mean that a {@link Value} from a different kind of
     * {@link ValueFactory} could be returned.
     *
```

### JavadocReference
Cannot resolve symbol `ValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link RDF4JTerm#asValue()} is returned without any conversion. Note that
     * this could mean that a {@link Value} from a different kind of
     * {@link ValueFactory} could be returned.
     *
     * @param term
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * @param term
     *            RDFTerm to adapt to RDF4J Value
     * @return Adapted RDF4J {@link Value}
     */
    public Value asValue(final RDFTerm term) {
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

    /**
     * Adapt an RDF4J {@link Repository} as a Commons RDF {@link Graph}.
     * <p>
     * The graph will include triples in any contexts (e.g. the union graph).
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * @param repository
     *            RDF4J {@link Repository} to connect to.
     * @param options
     *            Zero or more {@link Option}
```

### JavadocReference
Cannot resolve symbol `SimpleValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * RDF4J implementation of RDF.
 * <p>
 * The {@link #RDF4J()} constructor uses a {@link SimpleValueFactory} to create
 * corresponding RDF4J {@link Value} instances. Alternatively, this factory can
 * be constructed with a different {@link ValueFactory} using
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * The {@link #RDF4J()} constructor uses a {@link SimpleValueFactory} to create
 * corresponding RDF4J {@link Value} instances. Alternatively, this factory can
 * be constructed with a different {@link ValueFactory} using
 * {@link #RDF4J(ValueFactory)}.
```

### JavadocReference
Cannot resolve symbol `ValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * The {@link #RDF4J()} constructor uses a {@link SimpleValueFactory} to create
 * corresponding RDF4J {@link Value} instances. Alternatively, this factory can
 * be constructed with a different {@link ValueFactory} using
 * {@link #RDF4J(ValueFactory)}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `ValueFactory`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * corresponding RDF4J {@link Value} instances. Alternatively, this factory can
 * be constructed with a different {@link ValueFactory} using
 * {@link #RDF4J(ValueFactory)}.
 * <p>
 * {@link #asRDFTerm(Value)} can be used to convert any RDF4J {@link Value} to
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #RDF4J(ValueFactory)}.
 * <p>
 * {@link #asRDFTerm(Value)} can be used to convert any RDF4J {@link Value} to
 * an RDFTerm. Note that adapted {@link BNode}s are considered equal if they are
 * converted with the same {@link RDF4J} instance and have the same
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #RDF4J(ValueFactory)}.
 * <p>
 * {@link #asRDFTerm(Value)} can be used to convert any RDF4J {@link Value} to
 * an RDFTerm. Note that adapted {@link BNode}s are considered equal if they are
 * converted with the same {@link RDF4J} instance and have the same
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * {@link #asRDFTerm(Value)} can be used to convert any RDF4J {@link Value} to
 * an RDFTerm. Note that adapted {@link BNode}s are considered equal if they are
 * converted with the same {@link RDF4J} instance and have the same
 * {@link BNode#getID()}.
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * an RDFTerm. Note that adapted {@link BNode}s are considered equal if they are
 * converted with the same {@link RDF4J} instance and have the same
 * {@link BNode#getID()}.
 * <p>
 * {@link #createGraph()} creates a new Graph backed by {@link LinkedHashModel}.
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * an RDFTerm. Note that adapted {@link BNode}s are considered equal if they are
 * converted with the same {@link RDF4J} instance and have the same
 * {@link BNode#getID()}.
 * <p>
 * {@link #createGraph()} creates a new Graph backed by {@link LinkedHashModel}.
```

### JavadocReference
Cannot resolve symbol `LinkedHashModel`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link BNode#getID()}.
 * <p>
 * {@link #createGraph()} creates a new Graph backed by {@link LinkedHashModel}.
 * To use other models, see {@link #asGraph(Model)}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * {@link #createGraph()} creates a new Graph backed by {@link LinkedHashModel}.
 * To use other models, see {@link #asGraph(Model)}.
 * <p>
 * To adapt a RDF4J {@link Repository} as a {@link Dataset} or {@link Graph},
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * To use other models, see {@link #asGraph(Model)}.
 * <p>
 * To adapt a RDF4J {@link Repository} as a {@link Dataset} or {@link Graph},
 * use {@link #asDataset(Repository, Option...)} or
 * {@link #asGraph(Repository, Option...)}.
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * To adapt a RDF4J {@link Repository} as a {@link Dataset} or {@link Graph},
 * use {@link #asDataset(Repository, Option...)} or
 * {@link #asGraph(Repository, Option...)}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * To adapt a RDF4J {@link Repository} as a {@link Dataset} or {@link Graph},
 * use {@link #asDataset(Repository, Option...)} or
 * {@link #asGraph(Repository, Option...)}.
 * <p>
 * {@link #asTriple(Statement)} can be used to convert a RDF4J {@link Statement}
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #asGraph(Repository, Option...)}.
 * <p>
 * {@link #asTriple(Statement)} can be used to convert a RDF4J {@link Statement}
 * to a Commons RDF {@link Triple}, and equivalent {@link #asQuad(Statement)} to
 * convert a {@link Quad}.
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #asGraph(Repository, Option...)}.
 * <p>
 * {@link #asTriple(Statement)} can be used to convert a RDF4J {@link Statement}
 * to a Commons RDF {@link Triple}, and equivalent {@link #asQuad(Statement)} to
 * convert a {@link Quad}.
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * {@link #asTriple(Statement)} can be used to convert a RDF4J {@link Statement}
 * to a Commons RDF {@link Triple}, and equivalent {@link #asQuad(Statement)} to
 * convert a {@link Quad}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * convert a {@link Quad}.
 * <p>
 * To convert any {@link Triple} or {@link Quad} to RDF4J {@link Statement},
 * use {@link #asStatement(TripleLike)}. This recognises previously converted
 * {@link RDF4JTriple}s and {@link RDF4JQuad}s without re-converting their
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * <p>
 * Likewise, {@link #asValue(RDFTerm)} can be used to convert any Commons RDF
 * {@link RDFTerm} to a corresponding RDF4J {@link Value}. This recognises
 * previously converted {@link RDF4JTerm}s without re-converting their
 * {@link RDF4JTerm#asValue()}.
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * For the purpose of {@link BlankNode} equivalence, this factory contains an
 * internal {@link UUID} salt that is used by adapter methods like
 * {@link #asQuad(Statement)}, {@link #asTriple(Statement)},
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
```

### JavadocReference
Cannot resolve symbol `Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * For the purpose of {@link BlankNode} equivalence, this factory contains an
 * internal {@link UUID} salt that is used by adapter methods like
 * {@link #asQuad(Statement)}, {@link #asTriple(Statement)},
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * internal {@link UUID} salt that is used by adapter methods like
 * {@link #asQuad(Statement)}, {@link #asTriple(Statement)},
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
 * the same {@link BNode#getID()}, converting them with the above methods might
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #asQuad(Statement)}, {@link #asTriple(Statement)},
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
 * the same {@link BNode#getID()}, converting them with the above methods might
 * cause accidental {@link BlankNode} equivalence. Note that the {@link Graph}
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
 * the same {@link BNode#getID()}, converting them with the above methods might
 * cause accidental {@link BlankNode} equivalence. Note that the {@link Graph}
 * and {@link Dataset} adapter methods like
```

### JavadocReference
Cannot resolve symbol `getID()`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * {@link #asRDFTerm(Value)} as well as {@link #createBlankNode(String)}. As
 * RDF4J {@link BNode} instances from multiple repositories or models may have
 * the same {@link BNode#getID()}, converting them with the above methods might
 * cause accidental {@link BlankNode} equivalence. Note that the {@link Graph}
 * and {@link Dataset} adapter methods like
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * cause accidental {@link BlankNode} equivalence. Note that the {@link Graph}
 * and {@link Dataset} adapter methods like
 * {@link #asDataset(Repository, Option...)} and
 * {@link #asGraph(Repository, Option...)} therefore uses a unique {@link RDF4J}
 * internally.
```

### JavadocReference
Cannot resolve symbol `Repository`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
 * and {@link Dataset} adapter methods like
 * {@link #asDataset(Repository, Option...)} and
 * {@link #asGraph(Repository, Option...)} therefore uses a unique {@link RDF4J}
 * internally.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt an existing Jena {@link org.apache.jena.sparql.core.Quad} to
     * CommonsRDF {@link Quad}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * CommonsRDF {@link Quad}.
     * <p>
     * If the quad contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * CommonsRDF {@link Quad}.
     * <p>
     * If the quad contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the quad contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the quad contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * purpose of its {@link BlankNode#uniqueReference()}.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuad} has a {@link Quad#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `isDefaultGraph()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * purpose of its {@link BlankNode#uniqueReference()}.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuad} has a {@link Quad#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Convert from Jena {@link Node} to any Commons RDF implementation.
     * <p>
     * Note that if the {@link Node#isBlank()}, then the factory's
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Convert from Jena {@link Node} to any Commons RDF implementation.
     * <p>
     * Note that if the {@link Node#isBlank()}, then the factory's
     * {@link RDF#createBlankNode(String)} will be used, meaning that care
     * should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Convert from Jena {@link Node} to any Commons RDF implementation.
     * <p>
     * Note that if the {@link Node#isBlank()}, then the factory's
     * {@link RDF#createBlankNode(String)} will be used, meaning that care
     * should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * conversion sessions.
     *
     * @see #asRDFTerm(Node)
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *            {@link RDF} to use for creating {@link RDFTerm}.
     * @param node
     *            The Jena Node to adapt. It's {@link Node#isConcrete()} must be
     *            <code>true</code>.
     * @return Adapted {@link RDFTerm}
```

### JavadocReference
Cannot resolve symbol `isConcrete()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *            {@link RDF} to use for creating {@link RDFTerm}.
     * @param node
     *            The Jena Node to adapt. It's {@link Node#isConcrete()} must be
     *            <code>true</code>.
     * @return Adapted {@link RDFTerm}
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @return Adapted {@link RDFTerm}
     * @throws ConversionException
     *             If the {@link Node} can't be represented as an
     *             {@link RDFTerm}, e.g. if the node is not concrete or
     *             represents a variable in Jena.
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Adapt an existing Jena Triple to CommonsRDF {@link Triple}.
     * <p>
     * If the triple contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Adapt an existing Jena Triple to CommonsRDF {@link Triple}.
     * <p>
     * If the triple contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the triple contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the triple contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
     * @see #asTriple(RDF, org.apache.jena.graph.Triple)
     *
     * @param triple
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param triple
     *            Jena {@link org.apache.jena.graph.Triple} to adapt
     * @return Adapted {@link JenaTriple}
     * @throws ConversionException
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt a generalized Jena {@link org.apache.jena.graph.Triple} to a
     * CommonsRDF {@link TripleLike}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link TripleLike#getObject()}.
     * <p>
     * If the Jena triple contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link TripleLike#getObject()}.
     * <p>
     * If the Jena triple contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link BlankNode#uniqueReference()}.
     *
     * @see #asTriple(RDF, org.apache.jena.graph.Triple)
     *
     * @param triple
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Adapt an existing Jena Node to CommonsRDF {@link RDFTerm}.
     * <p>
     * If {@link Node#isLiteral()}, then the returned value is a
     * {@link Literal}. If {@link Node#isURI()}, the returned value is a IRI. If
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
```

### JavadocReference
Cannot resolve symbol `isLiteral()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * Adapt an existing Jena Node to CommonsRDF {@link RDFTerm}.
     * <p>
     * If {@link Node#isLiteral()}, then the returned value is a
     * {@link Literal}. If {@link Node#isURI()}, the returned value is a IRI. If
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * If {@link Node#isLiteral()}, then the returned value is a
     * {@link Literal}. If {@link Node#isURI()}, the returned value is a IRI. If
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
     * will use a {@link UUID} salt from this {@link JenaRDF} instance in
```

### JavadocReference
Cannot resolve symbol `isURI()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * If {@link Node#isLiteral()}, then the returned value is a
     * {@link Literal}. If {@link Node#isURI()}, the returned value is a IRI. If
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
     * will use a {@link UUID} salt from this {@link JenaRDF} instance in
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
     * will use a {@link UUID} salt from this {@link JenaRDF} instance in
     * combination with {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {$@link Node#isBlank()}, the returned value is a {@link BlankNode}, which
     * will use a {@link UUID} salt from this {@link JenaRDF} instance in
     * combination with {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link BlankNode#uniqueReference()}.
     *
     * @see #asRDFTerm(RDF, Node)
     *
     * @param node
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param node
     *            The Jena Node to adapt. It's {@link Node#isConcrete()} must be
     *            <code>true</code>.
     * @return Adapted {@link JenaRDFTerm}
```

### JavadocReference
Cannot resolve symbol `isConcrete()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param node
     *            The Jena Node to adapt. It's {@link Node#isConcrete()} must be
     *            <code>true</code>.
     * @return Adapted {@link JenaRDFTerm}
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @return Adapted {@link JenaRDFTerm}
     * @throws ConversionException
     *             If the {@link Node} can't be represented as an
     *             {@link RDFTerm}, e.g. if the node is not concrete or
     *             represents a variable in Jena.
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param term
     *            Commons RDF {@link RDFTerm} to convert
     * @return Converted Jena {@link Node}
     */
    public Node asJenaNode(final RDFTerm term) {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param graph
     *            Commons RDF {@link Graph} to convert
     * @return Converted Jena {@link org.apache.jena.graph.Graph}
     */
    public org.apache.jena.graph.Graph asJenaGraph(final Graph graph) {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
    /**
     * Convert a CommonsRDF {@link Triple} to a Jena
     * {@link org.apache.jena.graph.Triple}.
     * <p>
     * If the triple was from Jena originally, return that original object, else
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param triple
     *            Commons RDF {@link Triple} to convert
     * @return Converted Jena {@link org.apache.jena.graph.Triple}
     */
    public org.apache.jena.graph.Triple asJenaTriple(final Triple triple) {
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Create a {@link StreamRDF} instance that inserts the converted
     * {@link Quad}s. into a the provided {@link Consumer}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link Quad}s. into a the provided {@link Consumer}.
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
```

### JavadocReference
Cannot resolve symbol `RDFDataMgr`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `parse(StreamRDF, String)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param consumer
     *            A {@link Consumer} of {@link Quad}s
     * @return A {@link StreamRDF} that will stream converted quads to the
     *         consumer
     */
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Create a {@link StreamRDF} instance that inserts generalized
     * {@link QuadLike}s. into a the provided {@link Consumer}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link QuadLike#getObject()} and {@link QuadLike#getGraphName()} .
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
```

### JavadocReference
Cannot resolve symbol `RDFDataMgr`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `parse(StreamRDF, String)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param generalizedConsumer
     *            A {@link Consumer} of generalized {@link QuadLike}s
     * @return A {@link StreamRDF} that will stream generalized quads to the
     *         consumer
     */
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
 * <p>
 * Instances of JenaRDF can also convert existing objects from Jena with methods
 * like {@link #asRDFTerm(Node)} and
 * {@link #asGraph(org.apache.jena.graph.Graph)}, and vice versa from any
 * Commons RDF object to Jena with the <code>asJena*</code> methods like
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
 * Instances of JenaRDF can also convert existing objects from Jena with methods
 * like {@link #asRDFTerm(Node)} and
 * {@link #asGraph(org.apache.jena.graph.Graph)}, and vice versa from any
 * Commons RDF object to Jena with the <code>asJena*</code> methods like
 * {@link #asJenaNode(RDFTerm)} and {@link #asJenaGraph(Graph)}.
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.query.Dataset`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt an existing Jena {@link org.apache.jena.query.Dataset} to
     * CommonsRDF {@link Dataset}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaDataset#asJenaDatasetGraph()}.
     * <p>
     * If the dataset contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaDataset#asJenaDatasetGraph()}.
     * <p>
     * If the dataset contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.query.Dataset`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param datasetGraph
     *            Jena {@link org.apache.jena.query.Dataset} to adapt
     * @return Adapted {@link JenaDataset}
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt an existing Jena {@link org.apache.jena.graph.Graph} to CommonsRDF
     * {@link Graph}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaGraph#asJenaGraph()}.
     * <p>
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaGraph#asJenaGraph()}.
     * <p>
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param graph
     *            Jena {@link org.apache.jena.graph.Graph} to adapt
     * @return Adapted {@link JenaGraph}
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.query.Dataset`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param dataset
     *            Commons RDF {@link Dataset} to convert
     * @return Converted Jena {@link org.apache.jena.query.Dataset}
     */
    public org.apache.jena.query.Dataset asJenaDataset(final Dataset dataset) {
```

### JavadocReference
Cannot resolve symbol `Lang`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Return {@link RDFSyntax} corresponding to a Jena {@link Lang}.
     *
     * @param lang
```

### JavadocReference
Cannot resolve symbol `Lang`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param lang
     *            {@link Lang} to convert
     * @return Matched {@link RDFSyntax}, otherwise {@link Optional#empty()}
     */
```

### JavadocReference
Cannot resolve symbol `Lang`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Return Jena {@link Lang} corresponding to a {@link RDFSyntax}.
     *
     * @param rdfSyntax
```

### JavadocReference
Cannot resolve symbol `Lang`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param rdfSyntax
     *            {@link RDFSyntax} to convert
     * @return Matched {@link Lang}, otherwise {@link Optional#empty()}
     */
    public Optional<Lang> asJenaLang(final RDFSyntax rdfSyntax) {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `isDefaultGraph(Node)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt a generalized Jena {@link org.apache.jena.sparql.core.Quad} to a
     * CommonsRDF {@link QuadLike}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link QuadLike#getPredicate()} or {@link QuadLike#getObject()}.
     * <p>
     * If the Jena quad contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link QuadLike#getPredicate()} or {@link QuadLike#getObject()}.
     * <p>
     * If the Jena quad contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link BlankNode#uniqueReference()}.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuadLike} has a {@link JenaQuadLike#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `isDefaultGraph()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link BlankNode#uniqueReference()}.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuadLike} has a {@link JenaQuadLike#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * of {@link Optional#empty()}.
     *
     * @see #asQuad(org.apache.jena.sparql.core.Quad)
     * @see #asGeneralizedTriple(org.apache.jena.graph.Triple)
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @see #asQuad(org.apache.jena.sparql.core.Quad)
     * @see #asGeneralizedTriple(org.apache.jena.graph.Triple)
     *
     * @param quad
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `isDefaultGraph(Node)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * recognize a {@link JenaIRI} which {@link JenaRDFTerm#asJenaNode()}
     * represent the default graph according to
     * {@link org.apache.jena.sparql.core.Quad#isDefaultGraph(Node)}, in which
     * case the returned JenaQuad will have a {@link Quad#getGraphName()} of
     * {@link Optional#empty()} rather than the provided IRI.
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param dataset
     *            Commons RDF {@link Dataset} to convert
     * @return Converted Jena {@link org.apache.jena.sparql.core.DatasetGraph}
     */
    public DatasetGraph asJenaDatasetGraph(final Dataset dataset) {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Convert from Jena {@link org.apache.jena.graph.Triple} to a Commons RDF
     * {@link Triple}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link Triple}.
     * <p>
     * Note that if any of the triple's nodes {@link Node#isBlank()}, then the
     * factory's {@link RDF#createBlankNode(String)} will be used, meaning that
     * care should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link Triple}.
     * <p>
     * Note that if any of the triple's nodes {@link Node#isBlank()}, then the
     * factory's {@link RDF#createBlankNode(String)} will be used, meaning that
     * care should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * conversion sessions.
     *
     * @see #asTriple(org.apache.jena.graph.Triple)
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt an existing Jena {@link DatasetGraph} to CommonsRDF
     * {@link Dataset}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaDataset#asJenaDatasetGraph()}.
     * <p>
     * If the dataset contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaDataset#asJenaDatasetGraph()}.
     * <p>
     * If the dataset contains any {@link Node#isBlank()}, then any
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * corresponding {@link BlankNode} will use a {@link UUID} salt from this
     * {@link JenaRDF} instance in combination with
     * {@link Node#getBlankNodeId()} for the purpose of its
     * {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `DatasetGraph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param datasetGraph
     *            Jena {@link DatasetGraph} to adapt
     * @return Adapted {@link JenaDataset}
     */
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Create a {@link StreamRDF} instance that inserts generalized
     * {@link TripleLike}s. into a the provided {@link Consumer}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link TripleLike#getObject()}.
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
```

### JavadocReference
Cannot resolve symbol `RDFDataMgr`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `parse(StreamRDF, String)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * <p>
     * The returned {@link StreamRDF} can be used for instance with Jena's
     * {@link RDFDataMgr#parse(StreamRDF, String)}.
     *
     * @param generalizedConsumer
```

### JavadocReference
Cannot resolve symbol `StreamRDF`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param generalizedConsumer
     *            A {@link Consumer} of generalized {@link TripleLike}s
     * @return A {@link StreamRDF} that will stream generalized triples to the
     *         consumer
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
    /**
     * Convert a CommonsRDF {@link Quad} to a Jena
     * {@link org.apache.jena.sparql.core.Quad}.
     * <p>
     * If the quad was from Jena originally, return that original object,
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param quad
     *            Commons RDF {@link Quad} to convert
     * @return Converted Jena {@link org.apache.jena.sparql.core.Quad}
     */
    public org.apache.jena.sparql.core.Quad asJenaQuad(final Quad quad) {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Convert from Jena {@link org.apache.jena.sparql.core.Quad} to a Commons
     * RDF {@link Quad}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * RDF {@link Quad}.
     * <p>
     * Note that if any of the quad's nodes {@link Node#isBlank()}, then the
     * factory's {@link RDF#createBlankNode(String)} will be used, meaning that
     * care should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * RDF {@link Quad}.
     * <p>
     * Note that if any of the quad's nodes {@link Node#isBlank()}, then the
     * factory's {@link RDF#createBlankNode(String)} will be used, meaning that
     * care should be taken if reusing an {@link RDF} instance for multiple
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * conversion sessions.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuadLike} has a {@link JenaQuadLike#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `isDefaultGraph()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * conversion sessions.
     * <p>
     * If the provided quad {@link org.apache.jena.sparql.core.Quad#isDefaultGraph()},
     * the returned {@link JenaQuadLike} has a {@link JenaQuadLike#getGraphName()}
     * of {@link Optional#empty()}.
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * of {@link Optional#empty()}.
     *
     * @see #asQuad(org.apache.jena.sparql.core.Quad)
     * @see #asGeneralizedQuad(org.apache.jena.sparql.core.Quad)
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @see #asQuad(org.apache.jena.sparql.core.Quad)
     * @see #asGeneralizedQuad(org.apache.jena.sparql.core.Quad)
     *
     * @param factory
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *            {@link RDFTerm}s.
     * @param quad
     *            Jena {@link org.apache.jena.sparql.core.Quad} to adapt
     * @return Converted {@link Quad}
     * @throws ConversionException
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.rdf.model.Model`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java

    /**
     * Adapt an existing Jena {@link org.apache.jena.rdf.model.Model} to
     * CommonsRDF {@link Graph}.
     * <p>
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaGraph#asJenaGraph()}.
     * <p>
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `isBlank()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * {@link JenaGraph#asJenaGraph()}.
     * <p>
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `getBlankNodeId()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * If the graph contains any {@link Node#isBlank()}, then any corresponding
     * {@link BlankNode} will use a {@link UUID} salt from this {@link JenaRDF}
     * instance in combination with {@link Node#getBlankNodeId()} for the
     * purpose of its {@link BlankNode#uniqueReference()}.
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.rdf.model.Model`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *
     * @param model
     *            Jena {@link org.apache.jena.rdf.model.Model} to adapt
     * @return Adapted {@link JenaGraph}
     */
```

### JavadocReference
Cannot resolve symbol `ParserConfig`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java

    /**
     * Set an RDF4J {@link ParserConfig} to use
     *
     * @param parserConfig
```

### JavadocReference
Cannot resolve symbol `ParserConfig`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java

    /**
     * Get the RDF4J {@link ParserConfig} to use.
     * <p>
     * If no parser config is set, the default configuration is provided.
```

### JavadocReference
Cannot resolve symbol `ParserConfig`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
     * <strong>Note:</strong> The parser config is mutable - changes in the
     * returned config is reflected in this instance of the parser. To avoid
     * mutation, create a new {@link ParserConfig} and set
     * {@link #setParserConfig(ParserConfig)}.
     *
```

### JavadocReference
Cannot resolve symbol `ParserConfig`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
     * returned config is reflected in this instance of the parser. To avoid
     * mutation, create a new {@link ParserConfig} and set
     * {@link #setParserConfig(ParserConfig)}.
     *
     * @return The RDF4J {@link ParserConfig}
```

### JavadocReference
Cannot resolve symbol `ParserConfig`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
     * {@link #setParserConfig(ParserConfig)}.
     *
     * @return The RDF4J {@link ParserConfig}
     */
    public ParserConfig getParserConfig() {
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
 * A Jena-backed {@link org.apache.commons.rdf.api.Graph}.
 * <p>
 * The underlying Jena {@link org.apache.jena.graph.Graph} can be accessed with
 * {@link #asJenaGraph()}.
 */
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java

    /**
     * Return the graph as a Jena {@link Model}.
     * <p>
     * Changes to the Jena model are reflected in the Commons RDF graph and vice
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
     * versa.
     * <p>
     * Note that in some cases there is no underlying Jena {@link Model}, in
     * which case this method will create one. Subsequent calls should return
     * the same model.
```

### JavadocReference
Cannot resolve symbol `Model`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
     * the same model.
     *
     * @return A Jena {@link Model}
     */
    Model asJenaModel();
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java

    /**
     * Return the underlying Jena {@link org.apache.jena.graph.Graph}.
     * <p>
     * Changes to the Jena graph are reflected in the Commons RDF graph and vice
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.graph.Graph`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
     * versa.
     *
     * @return A Jena {@link org.apache.jena.graph.Graph}
     */
    org.apache.jena.graph.Graph asJenaGraph();
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTerm.java`
#### Snippet
```java

    /**
     * Return the RDF4J {@link Value} that this RDFTerm represents.
     *
     * @return The wrapped {@link Value} (e.g. a {@link Literal}, {@link IRI} or
```

### JavadocReference
Cannot resolve symbol `Value`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTerm.java`
#### Snippet
```java
     * Return the RDF4J {@link Value} that this RDFTerm represents.
     *
     * @return The wrapped {@link Value} (e.g. a {@link Literal}, {@link IRI} or
     *         {@link BNode}.
     */
```

### JavadocReference
Cannot resolve symbol `Literal`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTerm.java`
#### Snippet
```java
     * Return the RDF4J {@link Value} that this RDFTerm represents.
     *
     * @return The wrapped {@link Value} (e.g. a {@link Literal}, {@link IRI} or
     *         {@link BNode}.
     */
```

### JavadocReference
Cannot resolve symbol `IRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTerm.java`
#### Snippet
```java
     * Return the RDF4J {@link Value} that this RDFTerm represents.
     *
     * @return The wrapped {@link Value} (e.g. a {@link Literal}, {@link IRI} or
     *         {@link BNode}.
     */
```

### JavadocReference
Cannot resolve symbol `BNode`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JTerm.java`
#### Snippet
```java
     *
     * @return The wrapped {@link Value} (e.g. a {@link Literal}, {@link IRI} or
     *         {@link BNode}.
     */
    Value asValue();
```

### JavadocReference
Cannot resolve symbol `org.apache.jena.sparql.core.Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaQuad.java`
#### Snippet
```java
 * A Jena-backed {@link org.apache.commons.rdf.api.Quad}.
 * <p>
 * The underlying Jena {@link org.apache.jena.sparql.core.Quad} can be accessed
 * with {@link #asJenaQuad()}.
 */
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaIRI.java`
#### Snippet
```java
 * A Jena-backed {@link IRI}.
 * <p>
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isURI()
```

### JavadocReference
Cannot resolve symbol `Node`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaIRI.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isURI()
 */
public interface JenaIRI extends JenaRDFTerm, IRI {
```

### JavadocReference
Cannot resolve symbol `isURI()`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaIRI.java`
#### Snippet
```java
 * The underlying Jena {@link Node} can be accessed from {@link #asJenaNode()}.
 *
 * @see Node#isURI()
 */
public interface JenaIRI extends JenaRDFTerm, IRI {
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
     * <urn:x-arq:DefaultGraphNode> from any IRI instance, so they can be
     * replaced with Optional.empty(). Note that this code does not hardcode the
     * internal Jena IRIs but uses Jena's constants {@link Quad#defaultGraphIRI}
     * and {@link Quad#defaultGraphNodeGenerated}.
     */
```

### JavadocReference
Cannot resolve symbol `defaultGraphIRI`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
     * <urn:x-arq:DefaultGraphNode> from any IRI instance, so they can be
     * replaced with Optional.empty(). Note that this code does not hardcode the
     * internal Jena IRIs but uses Jena's constants {@link Quad#defaultGraphIRI}
     * and {@link Quad#defaultGraphNodeGenerated}.
     */
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
     * replaced with Optional.empty(). Note that this code does not hardcode the
     * internal Jena IRIs but uses Jena's constants {@link Quad#defaultGraphIRI}
     * and {@link Quad#defaultGraphNodeGenerated}.
     */
    private static class DefaultGraphChecker {
```

### JavadocReference
Cannot resolve symbol `defaultGraphNodeGenerated`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
     * replaced with Optional.empty(). Note that this code does not hardcode the
     * internal Jena IRIs but uses Jena's constants {@link Quad#defaultGraphIRI}
     * and {@link Quad#defaultGraphNodeGenerated}.
     */
    private static class DefaultGraphChecker {
```

### JavadocReference
Cannot resolve symbol `Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java

/**
 * A generalized {@link QuadLike}, backed by a Jena {@link Quad} or
 * {@link Triple}.
 * <p>
```

### JavadocReference
Cannot resolve symbol `Triple`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
/**
 * A generalized {@link QuadLike}, backed by a Jena {@link Quad} or
 * {@link Triple}.
 * <p>
 * This class does not implement any particular {@link #equals(Object)} or
```

### JavadocReference
Cannot resolve symbol `internalJenaFactory`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
 * @see JenaTripleImpl
 * @see JenaQuadImpl
 * @see internalJenaFactory#createGeneralizedTriple(RDFTerm, RDFTerm, RDFTerm)
 * @see internalJenaFactory#createGeneralizedQuad(RDFTerm, RDFTerm, RDFTerm,
 *      RDFTerm)
```

### JavadocReference
Cannot resolve symbol `createGeneralizedTriple(RDFTerm, RDFTerm, RDFTerm)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
 * @see JenaTripleImpl
 * @see JenaQuadImpl
 * @see internalJenaFactory#createGeneralizedTriple(RDFTerm, RDFTerm, RDFTerm)
 * @see internalJenaFactory#createGeneralizedQuad(RDFTerm, RDFTerm, RDFTerm,
 *      RDFTerm)
```

### JavadocReference
Cannot resolve symbol `internalJenaFactory`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
 * @see JenaQuadImpl
 * @see internalJenaFactory#createGeneralizedTriple(RDFTerm, RDFTerm, RDFTerm)
 * @see internalJenaFactory#createGeneralizedQuad(RDFTerm, RDFTerm, RDFTerm,
 *      RDFTerm)
 */
```

### JavadocReference
Cannot resolve symbol `createGeneralizedQuad(RDFTerm, RDFTerm, RDFTerm,
* RDFTerm)`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
 * @see JenaQuadImpl
 * @see internalJenaFactory#createGeneralizedTriple(RDFTerm, RDFTerm, RDFTerm)
 * @see internalJenaFactory#createGeneralizedQuad(RDFTerm, RDFTerm, RDFTerm,
 *      RDFTerm)
 */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `subject instanceof BlankNodeOrIRI` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaTripleImpl.java`
#### Snippet
```java
        super(triple, salt);
        // Check the conversion
        if (!(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI) || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized triple: " + quad);
        }
```

### DataFlowIssue
Condition `predicate instanceof IRI` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaTripleImpl.java`
#### Snippet
```java
        super(triple, salt);
        // Check the conversion
        if (!(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI) || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized triple: " + quad);
        }
```

### DataFlowIssue
Condition `object instanceof RDFTerm` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaTripleImpl.java`
#### Snippet
```java
        super(triple, salt);
        // Check the conversion
        if (!(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI) || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized triple: " + quad);
        }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return asRDFTerm((BNode)value);
        }
        throw new IllegalArgumentException("Value is not a BNode or IRI: " + value.getClass());
    }

```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return RDF4J.createIRIImpl((org.eclipse.rdf4j.model.IRI) value);
        }
        throw new IllegalArgumentException("Value is not a BNode, Literal or IRI: " + value.getClass());
    }

```

### DataFlowIssue
Condition `subject instanceof BlankNodeOrIRI` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
        // Check the conversion
        if ((graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI))
                || !(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI)
                || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized quad: " + quad);
```

### DataFlowIssue
Condition `predicate instanceof IRI` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
        // Check the conversion
        if ((graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI))
                || !(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI)
                || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized quad: " + quad);
```

### DataFlowIssue
Condition `object instanceof RDFTerm` is redundant and can be replaced with a null check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
        if ((graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI))
                || !(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI)
                || !(object instanceof RDFTerm)) {
            throw new ConversionException("Can't adapt generalized quad: " + quad);
        }
```

## RuleId[id=DoubleCheckedLocking]
### DoubleCheckedLocking
Double-checked locking
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java
    @Override
    public Model asJenaModel() {
        if (model == null) {
            synchronized (this) {
                // As Model can be used for locks, we should make sure we don't
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
            return new JenaBlankNodeImpl(node, salt);
        }
        if (node.equals(Node.ANY)) {
            // NOTE: JenaAny no longer supported by Commons RDF
            // return JenaAnyImpl.Singleton.instance;
```

### EmptyStatementBody
`if` statement has empty body
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
            // return JenaAnyImpl.Singleton.instance;
        }
        if (node.isVariable()) {
            // NOTE: JenaVariable no longer supported by Commons RDF
            // return new JenaVariableImpl(node);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(summingLong())' can be replaced with 'mapToLong().sum()'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdDataset.java`
#### Snippet
```java
    public long size() {
        return rdfDataSet.graphNames().stream().map(rdfDataSet::getQuads)
                .collect(Collectors.summingLong(List::size));
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Graph.java`
#### Snippet
```java
     * </p>
     * <p>
     * Implementations might not need {@link #close()}, hence the default
     * implementation does nothing.
     * </p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/BlankNode.java`
#### Snippet
```java
     * string.
     * <p>
     * The {@link #uniqueReference()} of two <code>BlankNode</code> instances
     * MUST be equal if and only if the two blank nodes are equal according to
     * {@link #equals(Object)}.
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     * the dataset.
     * <p>
     * Implementations might not need {@link #close()}, hence the default
     * implementation does nothing.
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/experimental/RDFParser.java`
#### Snippet
```java
     * Calling this method will override any earlier targets set with
     * {@link #target(Graph)}, {@link #target(Consumer)} or
     * {@link #target(Dataset)}.
     * <p>
     * The default implementation of this method calls {@link #target(Consumer)}
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/experimental/RDFParser.java`
#### Snippet
```java
     * <p>
     * Calling this method will override any earlier targets set with
     * {@link #target(Graph)}, {@link #target(Consumer)} or
     * {@link #target(Dataset)}.
     * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/experimental/RDFParser.java`
#### Snippet
```java
     * <p>
     * Calling this method will override any earlier targets set with
     * {@link #target(Graph)}, {@link #target(Consumer)} or
     * {@link #target(Dataset)}.
     * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
     * If this is {@link Optional#isPresent()} and is recognized by
     * {@link RDFSyntax#byMediaType(String)}, then the corresponding
     * {@link RDFSyntax} is set on {@link #getContentType()}, otherwise that is
     * {@link Optional#empty()}.
     *
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getTriples' is still used
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Graph.java`
#### Snippet
```java
     */
    @Deprecated
    default Stream<? extends Triple> getTriples() {
        return stream();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getTriples' is still used
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Graph.java`
#### Snippet
```java
     */
    @Deprecated
    default Stream<? extends Triple> getTriples(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return stream(subject, predicate, object);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'RDFTermFactory' is still used
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/RDFTermFactory.java`
#### Snippet
```java
 */
@Deprecated
public interface RDFTermFactory {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'SimpleRDFTermFactory' is still used
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/SimpleRDFTermFactory.java`
#### Snippet
```java
 */
@Deprecated
public class SimpleRDFTermFactory implements RDFTermFactory {

    private final SimpleRDF factory = new SimpleRDF();
```

### DeprecatedIsStillUsed
Deprecated member 'RDF_PLAINLITERAL' is still used
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/Types.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Types RDF_PLAINLITERAL = new Types("http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral");

    /**
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdLiteral.java`
#### Snippet
```java
        if (getLanguageTag().isPresent()) {
            sb.append("@");
            sb.append(getLanguageTag().get());
        } else if (!getDatatype().equals(Types.XSD_STRING)) {
            sb.append("^^");
            sb.append(getDatatype().ntriplesString());
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        final Resource subj = (Resource) rdf4jTermFactory.asValue(subject);
        final org.eclipse.rdf4j.model.IRI pred = (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate);
        final Value obj = rdf4jTermFactory.asValue(object);
        try (RepositoryConnection conn = getRepositoryConnection()) {
            conn.add(subj, pred, obj, context);
            conn.commit();
        }
```

### DuplicatedCode
Duplicated code
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        final Resource subj = (Resource) rdf4jTermFactory.asValue(subject);
        final org.eclipse.rdf4j.model.IRI pred = (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate);
        final Value obj = rdf4jTermFactory.asValue(object);
        final Resource[] contexts = asContexts(graphName);
```

### DuplicatedCode
Duplicated code
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        final Resource subj = (Resource) rdf4jTermFactory.asValue(subject);
        final org.eclipse.rdf4j.model.IRI pred = (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate);
        final Value obj = rdf4jTermFactory.asValue(object);
        return new ConvertedStatements<>(this::getRepositoryConnection, rdf4jTermFactory::asQuad, subj, pred, obj,
                contexts);
```

### DuplicatedCode
Duplicated code
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
            if (subject != null && !t.getSubject().equals(newSubject)) {
                return false;
            }
            if (predicate != null && !t.getPredicate().equals(newPredicate)) {
                return false;
            }
            if (object != null && !t.getObject().equals(newObject)) {
                return false;
            }
            return true;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    @Override
    public JsonLdBlankNode createBlankNode() {
        final String id = "_:" + UUID.randomUUID().toString();
        return new JsonLdBlankNodeImpl(new RDFDataset.BlankNode(id), bnodePrefix);
    }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    public RDF4JGraph asGraph(final Repository repository, final Set<? extends BlankNodeOrIRI> contexts, final Option... option) {
        final EnumSet<Option> opts = optionSet(option);
        /** NOTE: asValue() deliberately CAN handle <code>null</code> */
        final Resource[] resources = contexts.stream().map(g -> (Resource) asValue(g)).toArray(Resource[]::new);
        return RDF4J.createRepositoryGraphImpl(Objects.requireNonNull(repository),
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/Types.java`
#### Snippet
```java

    @Override
    public boolean equals(final Object other) {
        return this.field.equals(other);
    }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`isEqual` between objects of inconvertible types 'RDFSyntax' and 'String'
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/experimental/JsonLdParser.java`
#### Snippet
```java
    public JsonLdParser contentType(final String contentType) throws IllegalArgumentException {
        final JsonLdParser c = super.contentType(contentType);
        if (c.getContentType().filter(Predicate.isEqual(RDFSyntax.JSONLD).negate()).isPresent()) {
            throw new IllegalArgumentException("Unsupported contentType: " + contentType);
        }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/experimental/JenaRDFParser.java`
#### Snippet
```java
                dest = jenaRDF.streamJenaToGeneralizedTriple(generalizedConsumerTriple);
            } else {
                dest = JenaRDF.streamJenaToQuad(getRdfTermFactory().get(), getTarget());
            }
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/experimental/JenaRDFParser.java`
#### Snippet
```java
            }
        } else {
            RDFParser.source(getSourceInputStream().get()).base(baseStr).lang(lang).parse(dest);
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
        // must be getSourceInputStream then, this is guaranteed by
        // super.checkSource();
        loader.load(getSourceInputStream().get(), base, formatByMimeType.orElse(null), rdfHandler);
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
    @Override
    public Graph getGraph() {
        return getGraph(null).get();
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `value` is always 'null'
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return asRDFTerm((IRI)value);
        }
        if (value instanceof BNode){
            return asRDFTerm((BNode)value);
        }
```

### ConstantValue
Value `value` is always 'null'
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return RDF4J.createBlankNodeImpl((BNode) value, salt);
        }
        if (value instanceof org.eclipse.rdf4j.model.Literal) {
            return RDF4J.createLiteralImpl((org.eclipse.rdf4j.model.Literal) value);
        }
```

### ConstantValue
Value `value` is always 'null'
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return RDF4J.createLiteralImpl((org.eclipse.rdf4j.model.Literal) value);
        }
        if (value instanceof org.eclipse.rdf4j.model.IRI) {
            return RDF4J.createIRIImpl((org.eclipse.rdf4j.model.IRI) value);
        }
```

### ConstantValue
Condition `!(object instanceof BlankNodeImpl)` is always `true` when reached
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
            return object;
        }
        if (object instanceof BlankNode && !(object instanceof BlankNodeImpl)) {
            final BlankNode blankNode = (BlankNode) object;
            // This guarantees that adding the same BlankNode multiple times to
```

### ConstantValue
Condition `!(object instanceof IRIImpl)` is always `true` when reached
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
            return factory.createBlankNode(blankNode.uniqueReference());
        }
        if (object instanceof IRI && !(object instanceof IRIImpl)) {
            final IRI iri = (IRI) object;
            return factory.createIRI(iri.getIRIString());
```

### ConstantValue
Condition `object instanceof LiteralImpl` is always `false` when reached
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
            return factory.createIRI(iri.getIRIString());
        }
        if (!(object instanceof Literal) || (object instanceof LiteralImpl)) {
            throw new IllegalArgumentException("Not a BlankNode, IRI or Literal: " + object);
        }
```

### ConstantValue
Condition `graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI)` is always `false`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
        super(quad, salt);
        // Check the conversion
        if ((graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI))
                || !(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI)
                || !(object instanceof RDFTerm)) {
```

### ConstantValue
Condition `!(graphName.get() instanceof BlankNodeOrIRI)` is always `false` when reached
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaQuadImpl.java`
#### Snippet
```java
        super(quad, salt);
        // Check the conversion
        if ((graphName.isPresent() && !(graphName.get() instanceof BlankNodeOrIRI))
                || !(subject instanceof BlankNodeOrIRI) || !(predicate instanceof IRI)
                || !(object instanceof RDFTerm)) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Graph.java`
#### Snippet
```java
     * </p>
     * <pre>
     * IRI alice = factory.createIRI("http://example.com/alice");
     * IRI knows = factory.createIRI("http://xmlns.com/foaf/0.1/");
     * for (Triple t : graph.iterate(alice, knows, null)) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Graph.java`
#### Snippet
```java
     * <pre>
     * IRI alice = factory.createIRI("http://example.com/alice");
     * IRI knows = factory.createIRI("http://xmlns.com/foaf/0.1/");
     * for (Triple t : graph.iterate(alice, knows, null)) {
     *     System.out.println(t.getObject());
```

### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/RDF.java`
#### Snippet
```java
     * {@link Literal#getLanguageTag()} present, and SHOULD return a
     * {@link Literal#getDatatype()} that is equal to the IRI
     * <code>http://www.w3.org/2001/XMLSchema#string</code>.
     *
     * @param lexicalForm
```

### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/RDFSyntax.java`
#### Snippet
```java
     *
     * @return Identifying IRI, e.g.
     *         <code>http://www.w3.org/ns/formats/JSON-LD</code>
     */
    IRI iri();
```

### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     *
     * <pre>
     * IRI alice = factory.createIRI("http://example.com/alice");
     * IRI knows = factory.createIRI("http://xmlns.com/foaf/0.1/");
     * for (Quad t : dataset.iterate(null, alice, knows, null)) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Dataset.java`
#### Snippet
```java
     * <pre>
     * IRI alice = factory.createIRI("http://example.com/alice");
     * IRI knows = factory.createIRI("http://xmlns.com/foaf/0.1/");
     * for (Quad t : dataset.iterate(null, alice, knows, null)) {
     *     System.out.println(t.getGraphName());
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `URI.create()` is ignored
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/IRIImpl.java`
#### Snippet
```java
    public IRIImpl(final String iri) {
        // should throw IllegalArgumentException on most illegal IRIs
        URI.create(iri);
        // NOTE: We don't keep the URI as it uses outdated RFC2396 and will get
        // some IDNs wrong
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
                    // we can use our RDF 1.1-compliant .equals()
                    final RDFTerm otherObj = factory.asRDFTerm(q.getObject());
                    if (! (object.equals(otherObj))) {
                        return false;
                    }
```

### TrivialIf
`if` statement can be simplified
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
                } else {
                    // JSONLD-Java's .compareTo can handle IRI, BlankNode and type-mismatch
                    if (objectNode.get().compareTo(q.getObject()) != 0) {
                        return false;
                    }
```

### TrivialIf
`if` statement can be simplified
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/GraphImpl.java`
#### Snippet
```java
                return false;
            }
            if (object != null && !t.getObject().equals(newObject)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/BlankNodeImpl.java`
#### Snippet
```java
        }
        final BlankNodeImpl other = (BlankNodeImpl) obj;
        if (!Objects.equals(uniqueReference, other.uniqueReference)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
                return false;
            }
            if (object != null && !t.getObject().equals(newObject)) {
                return false;
            }
```

