# commons-rdf 
 
# Bad smells
I found 252 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 121 | false |
| OptionalUsedAsFieldOrParameterType | 15 | false |
| OptionalAssignedToNull | 15 | false |
| BoundedWildcard | 14 | false |
| RedundantFieldInitialization | 11 | false |
| ConstantValue | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 9 | false |
| ReturnNull | 9 | false |
| UnnecessarySuperQualifier | 8 | false |
| DataFlowIssue | 6 | false |
| OptionalContainsCollection | 6 | false |
| DeprecatedIsStillUsed | 5 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| MissortedModifiers | 2 | false |
| NestedAssignment | 2 | false |
| EmptyMethod | 2 | false |
| DoubleCheckedLocking | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| EqualsBetweenInconvertibleTypes | 1 | false |
| IgnoreResultOfCall | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| SynchronizeOnThis | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
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

### SimplifyStreamApiCallChains
'collect(summingLong())' can be replaced with 'mapToLong().sum()'
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java
        final long quads = Iter.asStream(datasetGraph.listGraphNodes())
                .map(datasetGraph::getGraph)
                .collect(Collectors.summingLong(org.apache.jena.graph.Graph::size));
        return quads + datasetGraph.getDefaultGraph().size();
    }
```

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JGraphLike.java`
#### Snippet
```java
     * @return The corresponding RDF4J Model.
     */
    Optional<Model> asModel();

    /**
```

### OptionalContainsCollection
'Optional' contains collection `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/AbstractRepositoryGraphLike.java`
#### Snippet
```java

    @Override
    public Optional<Model> asModel() {
        return Optional.empty();
    }
```

### OptionalContainsCollection
'Optional' contains collection `Model`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ModelGraphImpl.java`
#### Snippet
```java

    @Override
    public Optional<Model> asModel() {
        return Optional.of(model);
    }
```

### OptionalContainsCollection
'Optional' contains collection `Node`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java

    Predicate<RDFDataset.Quad> quadFilter(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        final Optional<Node> subjectNode = Optional.ofNullable(subject).map(factory::asJsonLdNode);
        final Optional<Node> predicateNode = Optional.ofNullable(predicate).map(factory::asJsonLdNode);
        final Optional<Node> objectNode = Optional.ofNullable(object).map(factory::asJsonLdNode);
```

### OptionalContainsCollection
'Optional' contains collection `Node`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    Predicate<RDFDataset.Quad> quadFilter(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        final Optional<Node> subjectNode = Optional.ofNullable(subject).map(factory::asJsonLdNode);
        final Optional<Node> predicateNode = Optional.ofNullable(predicate).map(factory::asJsonLdNode);
        final Optional<Node> objectNode = Optional.ofNullable(object).map(factory::asJsonLdNode);

```

### OptionalContainsCollection
'Optional' contains collection `Node`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
        final Optional<Node> subjectNode = Optional.ofNullable(subject).map(factory::asJsonLdNode);
        final Optional<Node> predicateNode = Optional.ofNullable(predicate).map(factory::asJsonLdNode);
        final Optional<Node> objectNode = Optional.ofNullable(object).map(factory::asJsonLdNode);

        return q -> {
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Triple`
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/GraphImpl.java`
#### Snippet
```java
    }

    private Stream<Triple> getTriples(final Predicate<Triple> filter) {
        return stream().filter(filter);
    }
```

### BoundedWildcard
Can generalize to `? super Statement`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ConvertedStatements.java`
#### Snippet
```java
    private final Function<Statement, T> statementAdapter;

    ConvertedStatements(final Supplier<RepositoryConnection> repositoryConnector, final Function<Statement, T> statementAdapter,
            final Resource subj, final org.eclipse.rdf4j.model.IRI pred, final Value obj, final Resource... contexts) {
        this.statementAdapter = statementAdapter;
```

### BoundedWildcard
Can generalize to `? extends T`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ConvertedStatements.java`
#### Snippet
```java
    private final Function<Statement, T> statementAdapter;

    ConvertedStatements(final Supplier<RepositoryConnection> repositoryConnector, final Function<Statement, T> statementAdapter,
            final Resource subj, final org.eclipse.rdf4j.model.IRI pred, final Value obj, final Resource... contexts) {
        this.statementAdapter = statementAdapter;
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    }

    Stream<List<RDFDataset.Quad>> filteredGraphs(final Optional<BlankNodeOrIRI> graphName) {
        return rdfDataSet.graphNames().parallelStream()
                // if graphName == null (wildcard), select all graphs,
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java

    @Override
    public boolean contains(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return datasetGraph.contains(toJenaPattern(graphName), toJenaPattern(subject), toJenaPattern(predicate),
                toJenaPattern(object));
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java

    @Override
    public Stream<? extends Quad> stream(final Optional<BlankNodeOrIRI> g, final BlankNodeOrIRI s, final IRI p, final RDFTerm o) {
        final JenaRDF factory = new JenaRDF(salt);
        return Iter.asStream(datasetGraph.find(toJenaPattern(g), toJenaPattern(s), toJenaPattern(p), toJenaPattern(o)), true)
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaDatasetImpl.java`
#### Snippet
```java

    @Override
    public void remove(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        datasetGraph.deleteAny(toJenaPattern(graphName), toJenaPattern(subject),
                toJenaPattern(predicate), toJenaPattern(object));
```

### BoundedWildcard
Can generalize to `? super TripleLike`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *         consumer
     */
    public StreamRDF streamJenaToGeneralizedTriple(final Consumer<TripleLike> generalizedConsumer) {
        return new StreamRDFBase() {
            @Override
```

### BoundedWildcard
Can generalize to `? super QuadLike`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *         consumer
     */
    public StreamRDF streamJenaToGeneralizedQuad(final Consumer<QuadLike<RDFTerm>> generalizedConsumer) {
        return new StreamRDFBase() {
            @Override
```

### BoundedWildcard
Can generalize to `? super Quad`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     *         consumer
     */
    public static StreamRDF streamJenaToQuad(final RDF factory, final Consumer<Quad> consumer) {
        return new StreamRDFBase() {
            @Override
```

### BoundedWildcard
Can generalize to `? super Quad`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
        private final Consumer<Quad> quadTarget;

        private AddToQuadConsumer(final Consumer<Quad> quadTarget) {
            this.quadTarget = quadTarget;
        }
```

### BoundedWildcard
Can generalize to `? super Quad`
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java
    }

    private Stream<Quad> getQuads(final Predicate<Quad> filter) {
        return stream().filter(filter);
    }
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetImpl.java`
#### Snippet
```java

    @Override
    public Stream<Quad> stream(final Optional<BlankNodeOrIRI> graphName, final BlankNodeOrIRI subject, final IRI predicate,
            final RDFTerm object) {
        final Optional<BlankNodeOrIRI> newGraphName;
```

### BoundedWildcard
Can generalize to `? extends BlankNodeOrIRI`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    }

    private Resource[] asContexts(final Optional<BlankNodeOrIRI> graphName) {
        Resource[] contexts;
        if (graphName == null) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/W3CRDFSyntax.java`
#### Snippet
```java
     * format</a>.
     */
    private final static class FormatIRI implements IRI {
        private static final String BASE = "http://www.w3.org/ns/formats/";
        private final String format;
```

### MissortedModifiers
Missorted modifiers `final static`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java
    }

    private final static class AddToModel extends AbstractRDFHandler {
        private final Model model;

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

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    }

    JsonLdGraphImpl(final RDFDataset rdfDataSet, final Optional<BlankNodeOrIRI> graphName, final String bnodePrefix) {
        super(rdfDataSet, bnodePrefix);
        this.graphName = Objects.requireNonNull(graphName);
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
     *            The quad object (<code>null</code> is a wildcard)
     */
    void remove(Optional<BlankNodeOrIRI> graphName, BlankNodeOrIRI subject, IRI predicate, RDFTerm object);

    /**
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
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
    }

    private Resource[] asContexts(final Optional<BlankNodeOrIRI> graphName) {
        Resource[] contexts;
        if (graphName == null) {
```

## RuleId[id=OptionalAssignedToNull]
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
Null is used for 'Optional' type in parameter
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    public void remove(final Triple t) {
        // Remove from ALL graphs, not just default graph
        super.remove(null, t.getSubject(), t.getPredicate(), t.getObject());
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    @Override
    public boolean contains(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return super.contains(graphName, subject, predicate, object);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    @Override
    public void remove(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        super.remove(graphName, subject, predicate, object);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    @Override
    public void add(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        super.add(graphName.orElse(null), subject, predicate, object);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java
    public void add(final Triple t) {
        // Ensure it's added in the correct graph
        super.add(graphName.orElse(null), t.getSubject(), t.getPredicate(), t.getObject());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    public void remove(final Triple t) {
        // Remove from ALL graphs, not just default graph
        super.remove(null, t.getSubject(), t.getPredicate(), t.getObject());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public boolean contains(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        return super.contains(null, subject, predicate, object);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public void add(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        super.add(null, subject, predicate, object);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
    @Override
    public void remove(final BlankNodeOrIRI subject, final IRI predicate, final RDFTerm object) {
        super.remove(null, subject, predicate, object);
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/LiteralImpl.java`
#### Snippet
```java
        sb.append(QUOTE);
        // Escape special characters
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/LiteralImpl.java`
#### Snippet
```java
        // Escape special characters
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/LiteralImpl.java`
#### Snippet
```java
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
        sb.append(QUOTE);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/LiteralImpl.java`
#### Snippet
```java
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
        sb.append(QUOTE);

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/RDFSyntax.java`
#### Snippet
```java
     */
    static Optional<RDFSyntax> byMediaType(final String mediaType) {
        final String type = mediaType.toLowerCase(Locale.ROOT).split("\\s*;", 2)[0];
        return w3cSyntaxes().stream().filter(t -> t.mediaTypes().contains(type))
                .findAny();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdLiteral.java`
#### Snippet
```java
        sb.append('"');
        // Escape special characters
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdLiteral.java`
#### Snippet
```java
        // Escape special characters
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdLiteral.java`
#### Snippet
```java
        sb.append(getLexicalForm().replace("\\", "\\\\"). // escaped to \\
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
        sb.append('"');
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdLiteral.java`
#### Snippet
```java
                replace("\"", "\\\""). // escaped to \"
                replace("\r", "\\r"). // escaped to \r
                replace("\n", "\\n")); // escaped to \n
        sb.append('"');

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JBlankNode.java`
#### Snippet
```java
/**
 * Marker interface for RDF4J implementations of Commons RDF
 * {@link org.apache.commons.rdf.api.BlankNode}.
 * <p>
 * The underlying RDF4J {@link BNode} instance can be retrieved with
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JBlankNodeOrIRI.java`
#### Snippet
```java
 * {@link BlankNodeOrIRI} (e.g. the subject of a {@link Triple}).
 * <p>
 * The underlying RDF4J {@link org.eclipse.rdf4j.model.Resource} instance can be
 * retrieved with {@link #asValue()}.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/TripleImpl.java`
#### Snippet
```java

    @Override
    public org.apache.commons.rdf.api.IRI getPredicate() {
        return (org.apache.commons.rdf.api.IRI) RDF4J.asRDFTerm(statement.getPredicate(), null);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/TripleImpl.java`
#### Snippet
```java
    @Override
    public org.apache.commons.rdf.api.IRI getPredicate() {
        return (org.apache.commons.rdf.api.IRI) RDF4J.asRDFTerm(statement.getPredicate(), null);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/IRIImpl.java`
#### Snippet
```java
import org.apache.commons.rdf.rdf4j.RDF4JIRI;

final class IRIImpl extends AbstractRDFTerm<org.eclipse.rdf4j.model.IRI> implements RDF4JIRI {

    IRIImpl(final org.eclipse.rdf4j.model.IRI iri) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/IRIImpl.java`
#### Snippet
```java
final class IRIImpl extends AbstractRDFTerm<org.eclipse.rdf4j.model.IRI> implements RDF4JIRI {

    IRIImpl(final org.eclipse.rdf4j.model.IRI iri) {
        super(iri);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/IRIImpl.java`
#### Snippet
```java
            return asValue().equals(impl.asValue());
        }
        if (obj instanceof org.apache.commons.rdf.api.IRI) {
            final org.apache.commons.rdf.api.IRI iri = (org.apache.commons.rdf.api.IRI) obj;
            return value.toString().equals(iri.getIRIString());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/IRIImpl.java`
#### Snippet
```java
        }
        if (obj instanceof org.apache.commons.rdf.api.IRI) {
            final org.apache.commons.rdf.api.IRI iri = (org.apache.commons.rdf.api.IRI) obj;
            return value.toString().equals(iri.getIRIString());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/IRIImpl.java`
#### Snippet
```java
        }
        if (obj instanceof org.apache.commons.rdf.api.IRI) {
            final org.apache.commons.rdf.api.IRI iri = (org.apache.commons.rdf.api.IRI) obj;
            return value.toString().equals(iri.getIRIString());
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
    }

    public JenaGraph createGraph(final org.apache.jena.graph.Graph graph, final UUID salt) {
        return new JenaGraphImpl(graph, salt);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
    }

    public JenaTriple createTriple(final org.apache.jena.graph.Triple triple, final UUID salt) {
        return new JenaTripleImpl(triple, salt);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
    }

    public JenaGeneralizedTripleLike createGeneralizedTriple(final org.apache.jena.graph.Triple triple, final UUID salt) {
        return new JenaGeneralizedTripleLikeImpl(triple, salt);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
    }

    public JenaGeneralizedQuadLike createGeneralizedQuad(final org.apache.jena.sparql.core.Quad quad, final UUID salt) {
        return new JenaGeneralizedQuadLikeImpl(quad, salt);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/InternalJenaFactory.java`
#### Snippet
```java
    }

    public JenaQuad createQuad(final org.apache.jena.sparql.core.Quad quad, final UUID salt) {
        return new JenaQuadImpl(quad, salt);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.IRI} as a Commons RDF
     * {@link org.apache.commons.rdf.api.IRI}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * @return A {@link RDF4JIRI} that corresponds to the RDF4J IRI
     */
    public RDF4JIRI asRDFTerm(final org.eclipse.rdf4j.model.IRI value) {
        return RDF4J.createIRIImpl(value);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    @Override
    public RDF4JLiteral createLiteral(final String lexicalForm) throws IllegalArgumentException {
        final org.eclipse.rdf4j.model.Literal lit = getValueFactory().createLiteral(lexicalForm);
        return asRDFTerm(lit);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
     * {@link org.apache.commons.rdf.api.Literal}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    public org.apache.commons.rdf.api.Literal createLiteral(final String lexicalForm, final org.apache.commons.rdf.api.IRI dataType)
            throws IllegalArgumentException {
        final org.eclipse.rdf4j.model.IRI iri = getValueFactory().createIRI(dataType.getIRIString());
        final org.eclipse.rdf4j.model.Literal lit = getValueFactory().createLiteral(lexicalForm, iri);
        return asRDFTerm(lit);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            throws IllegalArgumentException {
        final org.eclipse.rdf4j.model.IRI iri = getValueFactory().createIRI(dataType.getIRIString());
        final org.eclipse.rdf4j.model.Literal lit = getValueFactory().createLiteral(lexicalForm, iri);
        return asRDFTerm(lit);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.Resource} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNodeOrIRI}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.Resource} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNodeOrIRI}
     * <p>
     * @param value
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * @return A {@link RDF4JBlankNodeOrIRI} that corresponds to the RDF4J Resource
     */
    public RDF4JBlankNodeOrIRI asRDFTerm(final org.eclipse.rdf4j.model.Resource value) {
        if(value instanceof IRI){
            return asRDFTerm((IRI)value);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            final RDFTerm object) throws IllegalArgumentException {
        final Statement statement = getValueFactory().createStatement(
                (org.eclipse.rdf4j.model.Resource) asValue(subject), (org.eclipse.rdf4j.model.IRI) asValue(predicate),
                asValue(object), (org.eclipse.rdf4j.model.Resource) asValue(graphName));
        return asQuad(statement);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            final RDFTerm object) throws IllegalArgumentException {
        final Statement statement = getValueFactory().createStatement(
                (org.eclipse.rdf4j.model.Resource) asValue(subject), (org.eclipse.rdf4j.model.IRI) asValue(predicate),
                asValue(object), (org.eclipse.rdf4j.model.Resource) asValue(graphName));
        return asQuad(statement);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        final Statement statement = getValueFactory().createStatement(
                (org.eclipse.rdf4j.model.Resource) asValue(subject), (org.eclipse.rdf4j.model.IRI) asValue(predicate),
                asValue(object), (org.eclipse.rdf4j.model.Resource) asValue(graphName));
        return asQuad(statement);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    public org.apache.commons.rdf.api.Literal createLiteral(final String lexicalForm, final String languageTag)
            throws IllegalArgumentException {
        final org.eclipse.rdf4j.model.Literal lit = getValueFactory().createLiteral(lexicalForm, languageTag);
        return asRDFTerm(lit);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * The value will be of the same kind as the term, e.g. a
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode} is converted to a
     * {@link org.apache.commons.rdf.api.BlankNode}, a
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} is converted to a
     * {@link org.apache.commons.rdf.api.IRI} and a
     * {@link org.eclipse.rdf4j.model.Literal}. is converted to a
     * {@link org.apache.commons.rdf.api.Literal}
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return RDF4J.createBlankNodeImpl((BNode) value, salt);
        }
        if (value instanceof org.eclipse.rdf4j.model.Literal) {
            return RDF4J.createLiteralImpl((org.eclipse.rdf4j.model.Literal) value);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        }
        if (value instanceof org.eclipse.rdf4j.model.Literal) {
            return RDF4J.createLiteralImpl((org.eclipse.rdf4j.model.Literal) value);
        }
        if (value instanceof org.eclipse.rdf4j.model.IRI) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            return RDF4J.createLiteralImpl((org.eclipse.rdf4j.model.Literal) value);
        }
        if (value instanceof org.eclipse.rdf4j.model.IRI) {
            return RDF4J.createIRIImpl((org.eclipse.rdf4j.model.IRI) value);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        }
        if (value instanceof org.eclipse.rdf4j.model.IRI) {
            return RDF4J.createIRIImpl((org.eclipse.rdf4j.model.IRI) value);
        }
        throw new IllegalArgumentException("Value is not a BNode, Literal or IRI: " + value.getClass());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.Literal} as a Commons RDF
     * {@link org.apache.commons.rdf.api.Literal}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            throws IllegalArgumentException {
        final Statement statement = getValueFactory().createStatement(
                (org.eclipse.rdf4j.model.Resource) asValue(subject), (org.eclipse.rdf4j.model.IRI) asValue(predicate),
                asValue(object));
        return asTriple(statement);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
            throws IllegalArgumentException {
        final Statement statement = getValueFactory().createStatement(
                (org.eclipse.rdf4j.model.Resource) asValue(subject), (org.eclipse.rdf4j.model.IRI) asValue(predicate),
                asValue(object));
        return asTriple(statement);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * <p>
     * The value will be of the same kind as the term, e.g. a
     * {@link org.apache.commons.rdf.api.BlankNode} is converted to a
     * {@link org.eclipse.rdf4j.model.BNode}, a
     * {@link org.apache.commons.rdf.api.IRI} is converted to a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * The value will be of the same kind as the term, e.g. a
     * {@link org.apache.commons.rdf.api.BlankNode} is converted to a
     * {@link org.eclipse.rdf4j.model.BNode}, a
     * {@link org.apache.commons.rdf.api.IRI} is converted to a
     * {@link org.eclipse.rdf4j.model.IRI} and a
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.BNode}, a
     * {@link org.apache.commons.rdf.api.IRI} is converted to a
     * {@link org.eclipse.rdf4j.model.IRI} and a
     * {@link org.apache.commons.rdf.api.Literal} is converted to a
     * {@link org.eclipse.rdf4j.model.Literal}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * {@link org.eclipse.rdf4j.model.IRI} and a
     * {@link org.apache.commons.rdf.api.Literal} is converted to a
     * {@link org.eclipse.rdf4j.model.Literal}.
     * <p>
     * If the provided {@link RDFTerm} is <code>null</code>, then the returned
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
                return getValueFactory().createLiteral(label, lang);
            }
            final org.eclipse.rdf4j.model.IRI dataType = (org.eclipse.rdf4j.model.IRI) asValue(literal.getDatatype());
            return getValueFactory().createLiteral(label, dataType);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
                return getValueFactory().createLiteral(label, lang);
            }
            final org.eclipse.rdf4j.model.IRI dataType = (org.eclipse.rdf4j.model.IRI) asValue(literal.getDatatype());
            return getValueFactory().createLiteral(label, dataType);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        }

        final org.eclipse.rdf4j.model.Resource subject = (org.eclipse.rdf4j.model.Resource) asValue(tripleLike.getSubject());
        final org.eclipse.rdf4j.model.IRI predicate = (org.eclipse.rdf4j.model.IRI) asValue(tripleLike.getPredicate());
        final Value object = asValue(tripleLike.getObject());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        }

        final org.eclipse.rdf4j.model.Resource subject = (org.eclipse.rdf4j.model.Resource) asValue(tripleLike.getSubject());
        final org.eclipse.rdf4j.model.IRI predicate = (org.eclipse.rdf4j.model.IRI) asValue(tripleLike.getPredicate());
        final Value object = asValue(tripleLike.getObject());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

        final org.eclipse.rdf4j.model.Resource subject = (org.eclipse.rdf4j.model.Resource) asValue(tripleLike.getSubject());
        final org.eclipse.rdf4j.model.IRI predicate = (org.eclipse.rdf4j.model.IRI) asValue(tripleLike.getPredicate());
        final Value object = asValue(tripleLike.getObject());

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java

        final org.eclipse.rdf4j.model.Resource subject = (org.eclipse.rdf4j.model.Resource) asValue(tripleLike.getSubject());
        final org.eclipse.rdf4j.model.IRI predicate = (org.eclipse.rdf4j.model.IRI) asValue(tripleLike.getPredicate());
        final Value object = asValue(tripleLike.getObject());

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        final Value object = asValue(tripleLike.getObject());

        org.eclipse.rdf4j.model.Resource context = null;
        if (tripleLike instanceof Quad) {
            final Quad quad = (Quad) tripleLike;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
        if (tripleLike instanceof Quad) {
            final Quad quad = (Quad) tripleLike;
            context = (org.eclipse.rdf4j.model.Resource) asValue(quad.getGraphName().orElse(null));
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     *
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.BNode} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNode}
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
     * Adapt a RDF4J
     * {@link org.eclipse.rdf4j.model.BNode} as a Commons RDF
     * {@link org.apache.commons.rdf.api.BlankNode}
     * <p>
     * For the purpose of {@link BlankNode} equivalence, this method will use an
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java

    @Override
    public org.apache.commons.rdf.api.IRI getDatatype() {
        return new IRIImpl(value.getDatatype());
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java
            return true;
        }
        if (obj instanceof org.apache.commons.rdf.api.Literal) {
            final org.apache.commons.rdf.api.Literal other = (org.apache.commons.rdf.api.Literal) obj;
            return getLexicalForm().equals(other.getLexicalForm()) &&
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java
        }
        if (obj instanceof org.apache.commons.rdf.api.Literal) {
            final org.apache.commons.rdf.api.Literal other = (org.apache.commons.rdf.api.Literal) obj;
            return getLexicalForm().equals(other.getLexicalForm()) &&
                    getDatatype().equals(other.getDatatype()) &&
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java
        }
        if (obj instanceof org.apache.commons.rdf.api.Literal) {
            final org.apache.commons.rdf.api.Literal other = (org.apache.commons.rdf.api.Literal) obj;
            return getLexicalForm().equals(other.getLexicalForm()) &&
                    getDatatype().equals(other.getDatatype()) &&
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java
    private static final String QUOTE = "\"";

    LiteralImpl(final org.eclipse.rdf4j.model.Literal literal) {
        super(literal);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/LiteralImpl.java`
#### Snippet
```java
import org.eclipse.rdf4j.rio.turtle.TurtleUtil;

final class LiteralImpl extends AbstractRDFTerm<org.eclipse.rdf4j.model.Literal> implements RDF4JLiteral {

    private static final String QUOTE = "\"";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ConvertedStatements.java`
#### Snippet
```java

    ConvertedStatements(final Supplier<RepositoryConnection> repositoryConnector, final Function<Statement, T> statementAdapter,
            final Resource subj, final org.eclipse.rdf4j.model.IRI pred, final Value obj, final Resource... contexts) {
        this.statementAdapter = statementAdapter;
        this.conn = repositoryConnector.get();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ModelGraphImpl.java`
#### Snippet
```java

    @Override
    public Stream<RDF4JTriple> stream(final BlankNodeOrIRI subject, final org.apache.commons.rdf.api.IRI predicate,
            final RDFTerm object) {
        return model.filter((Resource) rdf4jTermFactory.asValue(subject),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ModelGraphImpl.java`
#### Snippet
```java

    @Override
    public boolean contains(final BlankNodeOrIRI subject, final org.apache.commons.rdf.api.IRI predicate, final RDFTerm object) {
        return model.contains((Resource) rdf4jTermFactory.asValue(subject),
                (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate), rdf4jTermFactory.asValue(object));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ModelGraphImpl.java`
#### Snippet
```java

    @Override
    public void remove(final BlankNodeOrIRI subject, final org.apache.commons.rdf.api.IRI predicate, final RDFTerm object) {
        model.remove((Resource) rdf4jTermFactory.asValue(subject),
                (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate), rdf4jTermFactory.asValue(object));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/ModelGraphImpl.java`
#### Snippet
```java

    @Override
    public void add(final BlankNodeOrIRI subject, final org.apache.commons.rdf.api.IRI predicate, final RDFTerm object) {
        model.add((Resource) rdf4jTermFactory.asValue(subject),
                (org.eclipse.rdf4j.model.IRI) rdf4jTermFactory.asValue(predicate), rdf4jTermFactory.asValue(object));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `commons-rdf-api/src/main/java/org/apache/commons/rdf/api/Literal.java`
#### Snippet
```java
     * As the value space for language tags is lower-space, if they are present,
     * they MUST be compared character by character
     * using the equivalent of {@link String#toLowerCase(java.util.Locale)} with
     * the locale {@link Locale#ROOT}.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraph.java`
#### Snippet
```java

    @Override
    JsonLdTriple asTripleOrQuad(final com.github.jsonldjava.core.RDFDataset.Quad jsonldQuad) {
        return factory.asTriple(jsonldQuad);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaTripleLike.java`
#### Snippet
```java
 * @see JenaGeneralizedQuadLike
 */
public interface JenaTripleLike extends org.apache.commons.rdf.api.TripleLike {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/QuadImpl.java`
#### Snippet
```java

    @Override
    public org.apache.commons.rdf.api.IRI getPredicate() {
        return (org.apache.commons.rdf.api.IRI) RDF4J.asRDFTerm(statement.getPredicate(), null);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/QuadImpl.java`
#### Snippet
```java
    @Override
    public org.apache.commons.rdf.api.IRI getPredicate() {
        return (org.apache.commons.rdf.api.IRI) RDF4J.asRDFTerm(statement.getPredicate(), null);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JLiteral.java`
#### Snippet
```java
 * @see RDF4J#createLiteral(String)
 */
public interface RDF4JLiteral extends RDF4JTerm, org.apache.commons.rdf.api.Literal {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaTriple.java`
#### Snippet
```java
 * {@link #asJenaTriple()}.
 */
public interface JenaTriple extends org.apache.commons.rdf.api.Triple, JenaTripleLike {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
        // add triples to default graph by default
        BlankNodeOrIRI graphName = null;
        if (t instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad q = (org.apache.commons.rdf.api.Quad) t;
            graphName = q.getGraphName().orElse(null);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
        BlankNodeOrIRI graphName = null;
        if (t instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad q = (org.apache.commons.rdf.api.Quad) t;
            graphName = q.getGraphName().orElse(null);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
        BlankNodeOrIRI graphName = null;
        if (t instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad q = (org.apache.commons.rdf.api.Quad) t;
            graphName = q.getGraphName().orElse(null);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java

    String graphNameAsJsonLdString(final T tripleOrQuad) {
        if (tripleOrQuad instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad quad = (org.apache.commons.rdf.api.Quad) tripleOrQuad;
            return quad.getGraphName().map(factory::asJsonLdString).orElse("@default");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    String graphNameAsJsonLdString(final T tripleOrQuad) {
        if (tripleOrQuad instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad quad = (org.apache.commons.rdf.api.Quad) tripleOrQuad;
            return quad.getGraphName().map(factory::asJsonLdString).orElse("@default");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdGraphLike.java`
#### Snippet
```java
    String graphNameAsJsonLdString(final T tripleOrQuad) {
        if (tripleOrQuad instanceof org.apache.commons.rdf.api.Quad) {
            final org.apache.commons.rdf.api.Quad quad = (org.apache.commons.rdf.api.Quad) tripleOrQuad;
            return quad.getGraphName().map(factory::asJsonLdString).orElse("@default");
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdDataset.java`
#### Snippet
```java

    @Override
    Quad asTripleOrQuad(final com.github.jsonldjava.core.RDFDataset.Quad jsonldQuad) {
        return factory.asQuad(jsonldQuad);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdDataset.java`
#### Snippet
```java
import com.github.jsonldjava.core.RDFDataset;

public interface JsonLdDataset extends JsonLdGraphLike<org.apache.commons.rdf.api.Quad>, Dataset {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdDataset.java`
#### Snippet
```java
}

class JsonLdDatasetImpl extends AbstractJsonLdGraphLike<org.apache.commons.rdf.api.Quad> implements JsonLdDataset {

    JsonLdDatasetImpl(final RDFDataset rdfDataSet) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java

    @Override
    JsonLdTriple asTripleOrQuad(final com.github.jsonldjava.core.RDFDataset.Quad jsonldQuad) {
        return factory.asTriple(jsonldQuad);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
}

class JsonLdUnionGraphImpl extends AbstractJsonLdGraphLike<org.apache.commons.rdf.api.Triple>
        implements JsonLdUnionGraph {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdUnionGraph.java`
#### Snippet
```java
 * multiple graphs.
 */
public interface JsonLdUnionGraph extends JsonLdGraphLike<org.apache.commons.rdf.api.Triple>, Graph {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdQuad.java`
#### Snippet
```java
// Note: To avoid confusion - don't import either Quad

public interface JsonLdQuad extends org.apache.commons.rdf.api.Quad, JsonLdTripleLike {

}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdQuad.java`
#### Snippet
```java
            return true;
        }
        if (!(obj instanceof org.apache.commons.rdf.api.Quad)) {
            return false;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdQuad.java`
#### Snippet
```java
            return false;
        }
        final org.apache.commons.rdf.api.Quad other = (org.apache.commons.rdf.api.Quad) obj;
        return getGraphName().equals(other.getGraphName()) && getSubject().equals(other.getSubject())
                && getPredicate().equals(other.getPredicate()) && getObject().equals(other.getObject());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdQuad.java`
#### Snippet
```java
            return false;
        }
        final org.apache.commons.rdf.api.Quad other = (org.apache.commons.rdf.api.Quad) obj;
        return getGraphName().equals(other.getGraphName()) && getSubject().equals(other.getSubject())
                && getPredicate().equals(other.getPredicate()) && getObject().equals(other.getObject());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdQuad.java`
#### Snippet
```java
        implements JsonLdQuad {

    JsonLdQuadImpl(final com.github.jsonldjava.core.RDFDataset.Quad quad, final String blankNodePrefix) {
        super(quad, blankNodePrefix);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.rdf.model` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @return Adapted {@link JenaGraph}
     */
    public JenaGraph asGraph(final org.apache.jena.rdf.model.Model model) {
        return INTERNAL_JENA_FACTORY.createGraph(model, salt());
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
     * @param dataset
     *            Commons RDF {@link Dataset} to convert
     * @return Converted Jena {@link org.apache.jena.sparql.core.DatasetGraph}
     */
    public DatasetGraph asJenaDatasetGraph(final Dataset dataset) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java

        @Override
        public void handleStatement(final org.eclipse.rdf4j.model.Statement st) throws RDFHandlerException {
            // TODO: if getRdfTermFactory() is a non-rdf4j factory, should
            // we use factory.createQuad() instead?
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/experimental/RDF4JParser.java`
#### Snippet
```java

        @Override
        public void handleStatement(final org.eclipse.rdf4j.model.Statement st) throws RDFHandlerException {
            model.add(st);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java

    @Override
    public org.apache.jena.graph.Graph asJenaGraph() {
        return graph;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java
class JenaGraphImpl implements JenaGraph {

    private final org.apache.jena.graph.Graph graph;
    private final UUID salt;
    private final transient JenaRDF factory;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java
    private Model model;

    JenaGraphImpl(final org.apache.jena.graph.Graph graph, final UUID salt) {
        this.graph = graph;
        this.salt = salt;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java

    /**
     * Adapt a JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad} as a
     * Commons RDF {@link org.apache.commons.rdf.api.Triple}.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    /**
     * Adapt a JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad} as a
     * Commons RDF {@link org.apache.commons.rdf.api.Triple}.
     * <p>
     * The underlying JsonLd quad can be retrieved with
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
     *
     * @param quad
     *            A JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad} to
     *            adapt
     * @return Adapted {@link JsonLdTriple}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    /**
     * Adapt a Commons RDF {@link Triple} as a JsonLd
     * {@link com.github.jsonldjava.core.RDFDataset.Quad}.
     *
     * @param triple
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
     * @param triple
     *            Commons RDF {@link Triple} to adapt
     * @return Adapted JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad}
     */
    public RDFDataset.Quad asJsonLdQuad(final Triple triple) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    /**
     * Adapt a Commons RDF {@link org.apache.commons.rdf.api.Quad} as a JsonLd
     * {@link com.github.jsonldjava.core.RDFDataset.Quad}.
     *
     * @param quad
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
     * @param quad
     *            Commons RDF {@link org.apache.commons.rdf.api.Quad} to adapt
     * @return Adapted JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad}
     */
    public RDFDataset.Quad asJsonLdQuad(final org.apache.commons.rdf.api.Quad quad) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
     * @return Adapted JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad}
     */
    public RDFDataset.Quad asJsonLdQuad(final org.apache.commons.rdf.api.Quad quad) {
        final BlankNodeOrIRI g = quad.getGraphName().orElse(null);
        return createJsonLdQuad(g, quad.getSubject(), quad.getPredicate(), quad.getObject());
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java

    /**
     * Adapt a JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad} as a
     * Commons RDF {@link org.apache.commons.rdf.api.Quad}.
     * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary and can be removed
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
     *
     * @param quad
     *            A JsonLd {@link com.github.jsonldjava.core.RDFDataset.Quad} to
     *            adapt
     * @return Adapted {@link JsonLdQuad}
```

### UnnecessaryFullyQualifiedName
Qualifier `com.github.jsonldjava.core` is unnecessary, and can be replaced with an import
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdTripleLike.java`
#### Snippet
```java
     * @return The JsonLD {@link com.github.jsonldjava.core.RDFDataset.Quad}
     */
    com.github.jsonldjava.core.RDFDataset.Quad asJsonLdQuad();

}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.rdf4j.model` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JIRI.java`
#### Snippet
```java

    @Override
    org.eclipse.rdf4j.model.IRI asValue();

}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JIRI.java`
#### Snippet
```java
 * @see RDF4J#createIRI(String)
 */
public interface RDF4JIRI extends RDF4JBlankNodeOrIRI, org.apache.commons.rdf.api.IRI {

    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
 * {@link #asJenaGraph()}.
 */
public interface JenaGraph extends org.apache.commons.rdf.api.Graph {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaGraph.java`
#### Snippet
```java
     * @return A Jena {@link org.apache.jena.graph.Graph}
     */
    org.apache.jena.graph.Graph asJenaGraph();

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.rdf.api` is unnecessary, and can be replaced with an import
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaQuad.java`
#### Snippet
```java
 * with {@link #asJenaQuad()}.
 */
public interface JenaQuad extends org.apache.commons.rdf.api.Quad, JenaQuadLike<BlankNodeOrIRI> {
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    AbstractQuadLike(final org.apache.jena.sparql.core.Quad quad, final UUID salt) {
        this.quad = Objects.requireNonNull(quad);
        this.subject = (S) INTERNAL_JENA_FACTORY.createRDFTerm(quad.getSubject(), salt);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
    final P predicate;
    final O object;
    org.apache.jena.sparql.core.Quad quad = null;
    org.apache.jena.graph.Triple triple = null;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java

    @Override
    public org.apache.jena.graph.Triple asJenaTriple() {
        final JenaRDF factory = new JenaRDF();
        if (triple == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
        final JenaRDF factory = new JenaRDF();
        if (triple == null) {
            triple = org.apache.jena.graph.Triple.create(
                    factory.asJenaNode(subject),
                    factory.asJenaNode(predicate),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    AbstractQuadLike(final org.apache.jena.graph.Triple triple, final UUID salt) {
        this.triple = Objects.requireNonNull(triple);
        this.subject = (S) INTERNAL_JENA_FACTORY.createRDFTerm(triple.getSubject(), salt);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.graph` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
    final O object;
    org.apache.jena.sparql.core.Quad quad = null;
    org.apache.jena.graph.Triple triple = null;


```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java

    @Override
    public org.apache.jena.sparql.core.Quad asJenaQuad() {
        final JenaRDF factory = new JenaRDF();
        if (quad == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.jena.sparql.core` is unnecessary and can be removed
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
        final JenaRDF factory = new JenaRDF();
        if (quad == null) {
            quad = org.apache.jena.sparql.core.Quad.create(
                    graphName.map(factory::asJenaNode).orElse(Quad.defaultGraphIRI),
                    factory.asJenaNode(subject),
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/QuadImpl.java`
#### Snippet
```java
            return hashCode;
        }
        return hashCode = Objects.hash(getSubject(), getPredicate(), getObject(), getGraphName());
    }

```

### NestedAssignment
Result of assignment expression used
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/BlankNodeImpl.java`
#### Snippet
```java
            return hashCode;
        }
        return hashCode = uniqueReference().hashCode();
    }

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `model` is accessed in both synchronized and unsynchronized contexts
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java
    private final UUID salt;
    private final transient JenaRDF factory;
    private Model model;

    JenaGraphImpl(final org.apache.jena.graph.Graph graph, final UUID salt) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4JBlankNodeOrIRI.java`
#### Snippet
```java

    @Override
    Resource asValue();

}
```

### EmptyMethod
The method is empty
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
     *             {@link #getContentTypeSyntax()} is not compatible or invalid
     */
    protected void checkContentType() throws IllegalStateException {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/QuadImpl.java`
#### Snippet
```java

final class QuadImpl implements RDF4JQuad {
    private transient int hashCode = 0;
    private final UUID salt;
    private final Statement statement;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    private String contentType = null;
    private IRI base = null;
    private InputStream sourceInputStream = null;
    private Path sourceFile = null;
    private IRI sourceIri = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    private RDFSyntax contentTypeSyntax = null;
    private String contentType = null;
    private IRI base = null;
    private InputStream sourceInputStream = null;
    private Path sourceFile = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    }

    private RDF rdfTermFactory = null;
    private RDFSyntax contentTypeSyntax = null;
    private String contentType = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    private InputStream sourceInputStream = null;
    private Path sourceFile = null;
    private IRI sourceIri = null;
    private Consumer<Quad> target;
    private Dataset targetDataset;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    private IRI base = null;
    private InputStream sourceInputStream = null;
    private Path sourceFile = null;
    private IRI sourceIri = null;
    private Consumer<Quad> target;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
    private RDF rdfTermFactory = null;
    private RDFSyntax contentTypeSyntax = null;
    private String contentType = null;
    private IRI base = null;
    private InputStream sourceInputStream = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java

    private RDF rdfTermFactory = null;
    private RDFSyntax contentTypeSyntax = null;
    private String contentType = null;
    private IRI base = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/BlankNodeImpl.java`
#### Snippet
```java
final class BlankNodeImpl extends AbstractRDFTerm<BNode> implements RDF4JBlankNode {

    private transient int hashCode = 0;
    private final long saltUUIDleast;
    private final long saltUUIDmost;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
    final P predicate;
    final O object;
    org.apache.jena.sparql.core.Quad quad = null;
    org.apache.jena.graph.Triple triple = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/AbstractQuadLike.java`
#### Snippet
```java
    final O object;
    org.apache.jena.sparql.core.Quad quad = null;
    org.apache.jena.graph.Triple triple = null;


```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/RDF4J.java`
#### Snippet
```java
    public Value asValue(final RDFTerm term) {
        if (term == null) {
            return null;
        }
        if (term instanceof RDF4JTerm) {
```

### ReturnNull
Return of `null`
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/DatasetGraphView.java`
#### Snippet
```java
    private Optional<BlankNodeOrIRI> unionOrNamedGraph() {
        if (unionGraph) {
            return null;
        }
        return Optional.ofNullable(namedGraph);
```

### ReturnNull
Return of `null`
in `commons-rdf-simple/src/main/java/org/apache/commons/rdf/simple/experimental/AbstractRDFParser.java`
#### Snippet
```java
        return threadpool.submit(() -> {
            c.parseSynchronusly();
            return null;
        });
    }
```

### ReturnNull
Return of `null`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
    public static RDFTerm asRDFTerm(final RDF factory, final Node node) {
        if (node == null) {
            return null;
        }
        if (factory instanceof JenaRDF) {
```

### ReturnNull
Return of `null`
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/JenaRDF.java`
#### Snippet
```java
    public Node asJenaNode(final RDFTerm term) {
        if (term == null) {
            return null;
        }
        if (term instanceof JenaRDFTerm) {
```

### ReturnNull
Return of `null`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    String asJsonLdString(final BlankNodeOrIRI blankNodeOrIRI) {
        if (blankNodeOrIRI == null) {
            return null;
        }
        if (blankNodeOrIRI instanceof IRI) {
```

### ReturnNull
Return of `null`
in `commons-rdf-jsonld-java/src/main/java/org/apache/commons/rdf/jsonldjava/JsonLdRDF.java`
#### Snippet
```java
    JsonLdTerm asRDFTerm(final Node node, final String blankNodePrefix) {
        if (node == null) {
            return null; // e.g. default graph
        }
        if (node.isIRI()) {
```

### ReturnNull
Return of `null`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryGraphImpl.java`
#### Snippet
```java
        }
        // Make sure the RepositoryConnection is closed
        return stream == null ? null : stream.onClose(conn::close);
    }

```

### ReturnNull
Return of `null`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        }
        // Make sure the RepositoryConnection is closed
        return stream == null ? null : stream.onClose(conn::close);

    }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        if (graphName == null) {
            // no contexts == any contexts
            contexts = new Resource[0];
        } else {
            final BlankNodeOrIRI g = graphName.orElse(null);
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `commons-rdf-jena/src/main/java/org/apache/commons/rdf/jena/impl/JenaGraphImpl.java`
#### Snippet
```java
    public Model asJenaModel() {
        if (model == null) {
            synchronized (this) {
                // As Model can be used for locks, we should make sure we don't
                // make
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

## RuleId[id=ConstantValue]
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

### ConstantValue
Condition `graphName.get() instanceof BlankNodeOrIRI` is always `true` when reached
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
Condition `stream == null` is always `false`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryGraphImpl.java`
#### Snippet
```java
        }
        // Make sure the RepositoryConnection is closed
        return stream == null ? null : stream.onClose(conn::close);
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
Condition `object instanceof BlankNodeImpl` is always `false` when reached
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
Condition `object instanceof IRIImpl` is always `false` when reached
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
Condition `stream == null` is always `false`
in `commons-rdf-rdf4j/src/main/java/org/apache/commons/rdf/rdf4j/impl/RepositoryDatasetImpl.java`
#### Snippet
```java
        }
        // Make sure the RepositoryConnection is closed
        return stream == null ? null : stream.onClose(conn::close);

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

