# commons-graph 
 
# Bad smells
I found 136 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 50 | false |
| JavadocDeclaration | 33 | false |
| JavadocReference | 26 | false |
| SuspiciousNameCombination | 6 | false |
| DuplicatedCode | 4 | false |
| ConstantValue | 4 | false |
| UnnecessarySemicolon | 2 | false |
| SimplifiableBooleanExpression | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| FieldMayBeFinal | 1 | false |
| UnnecessaryContinue | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| PointlessNullCheck | 1 | false |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
| UnusedAssignment | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y' should probably not be passed as parameter 'x'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            {
                // else CUT(H,y,z)
                cut( y, z );
                // CASCADING-CUT(H,z)
                cascadingCut( z );
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            // 2 make y a child of x, incrementing degree[x]
            x.setChild( y );
            y.setRight( y );
            y.setLeft( y );
        }
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'left'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            x.setChild( y );
            y.setRight( y );
            y.setLeft( y );
        }
        else
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'right'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            y.setLeft( x.getChild() );
            y.setRight( x.getChild().getRight() );
            x.getChild().setRight( y );
            y.getRight().setLeft( y );
        }
```

### SuspiciousNameCombination
'y' should probably not be passed as parameter 'left'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            y.setRight( x.getChild().getRight() );
            x.getChild().setRight( y );
            y.getRight().setLeft( y );
        }

```

### SuspiciousNameCombination
'x' should probably not be assigned to 'y'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
                    // 9  exchange x <-> y
                    FibonacciHeapNode<E> pointer = y;
                    y = x;
                    x = pointer;
                }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'G' to 'org.apache.commons.graph.DirectedGraph'
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
            {
                Iterator<V> connected =
                    ( graph instanceof DirectedGraph ) ? ( (DirectedGraph<V, E>) graph ).getOutbound( v ).iterator()
                                    : graph.getConnectedVertices( v ).iterator();

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `BellmannFord`
in `src/main/java/org/apache/commons/graph/shortestpath/NegativeWeightedCycleException.java`
#### Snippet
```java

/**
 * Exception thrown when {@link BellmannFord}'s algorithm detects a negative weighted cycle.
 */
public final class NegativeWeightedCycleException
```

### JavadocReference
Cannot resolve symbol `hasWeight`
in `src/main/java/org/apache/commons/graph/spanning/ShortestEdges.java`
#### Snippet
```java
     * Returns the distance related to input vertex, or null if it does not exist.
     *
     * <b>NOTE</b>: the method {@link hasWeight} should be used first to check if
     * the input vertex has an assiged weight.
     *
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/spanning/ShortestEdges.java`
#### Snippet
```java
 *
 * @param <V> the Graph vertices type
 * @param <E> the Graph edges type
 * @param <W> the weight type
 */
```

### JavadocReference
Cannot resolve symbol `FloydWarshall`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java

/**
 * Represents all shortest paths between all vertex pairs calculated by {@link FloydWarshall} algorithm.
 *
 * @param <V> the Graph vertices type
```

### JavadocReference
Cannot resolve symbol `VisitState.ABORT`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * Checks if the search algorithm should be terminated. Called after the search algorithm has finished
     * visiting the input vertex.
     * @return {@link VisitState.ABORT} if the search algorithm should be terminated after visiting the input vertex, {@link VisitState.CONTINUE} otherwise
     */
    VisitState finishVertex( V vertex );
```

### JavadocReference
Cannot resolve symbol `VisitState.CONTINUE`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * Checks if the search algorithm should be terminated. Called after the search algorithm has finished
     * visiting the input vertex.
     * @return {@link VisitState.ABORT} if the search algorithm should be terminated after visiting the input vertex, {@link VisitState.CONTINUE} otherwise
     */
    VisitState finishVertex( V vertex );
```

### JavadocReference
Cannot resolve symbol `VisitState.CONTINUE`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * based on the return value:
     * <ul>
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input edge;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
```

### JavadocReference
Cannot resolve symbol `VisitState.SKIP`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * <ul>
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input edge;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
     * </ul>
```

### JavadocReference
Cannot resolve symbol `VisitState.ABORT`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input edge;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
     * </ul>
     * @return the state of the visit after operations on the edge
```

### JavadocReference
Cannot resolve symbol `Visit`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
/**
 * A {@link GraphVisitHandler} controls the execution of breadth-first and depth-first search
 * algorithms in {@link Visit}.
 */
public interface GraphVisitHandler<V, E, G extends Graph<V, E>, O>
```

### JavadocReference
Cannot resolve symbol `VisitState.CONTINUE`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * based on the return value:
     * <ul>
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input vertex;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
```

### JavadocReference
Cannot resolve symbol `VisitState.SKIP`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * <ul>
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input vertex;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
     * </ul>
```

### JavadocReference
Cannot resolve symbol `VisitState.ABORT`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     *   <li>{@link VisitState.CONTINUE} continues the visit normally;</li> 
     *   <li>{@link VisitState.SKIP} continues the visit skipping the input vertex;</li>
     *   <li>{@link VisitState.ABORT} terminates the visit.</li>
     * </ul>
     * @return the state of the visit after operations on the vertex
```

### JavadocReference
Cannot resolve symbol `VisitState.ABORT`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * Checks if the search algorithm should be terminated. Called after the search algorithm has finished
     * visiting the input edge.
     * @return {@link VisitState.ABORT} if the search algorithm should be terminated after visiting the input edge, {@link VisitState.CONTINUE} otherwise
     */
    VisitState finishEdge( V head, E edge, V tail );
```

### JavadocReference
Cannot resolve symbol `VisitState.CONTINUE`
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * Checks if the search algorithm should be terminated. Called after the search algorithm has finished
     * visiting the input edge.
     * @return {@link VisitState.ABORT} if the search algorithm should be terminated after visiting the input edge, {@link VisitState.CONTINUE} otherwise
     */
    VisitState finishEdge( V head, E edge, V tail );
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
 * @param <V> the Graph vertices type.
 * @param <E> the Graph edges type.
 * @param <G> the directed graph type
 */
final class TarjanAlgorithm<V, E>
```

### JavadocReference
Cannot resolve symbol `result`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     * This is the recursive step.
     *
     * @param result The set that will be returned
     * @param element the element
     * @return true if there is a valid coloring for the graph, false otherwise.
```

### JavadocReference
Cannot resolve symbol `element`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     *
     * @param result The set that will be returned
     * @param element the element
     * @return true if there is a valid coloring for the graph, false otherwise.
     */
```

### JavadocReference
Cannot resolve symbol `left`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeapNode.java`
#### Snippet
```java
     * Sets the right node reference.
     *
     * @param left the right node reference.
     */
    public void setRight( FibonacciHeapNode<E> right )
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
 * @param <W>  the weight type
 * @param <WE> the Graph weighted edges type
 * @param <G>  the input Graph type
 * @param <WC> the weight operations
 */
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
 * @param <WE> the Graph weighted edges type
 * @param <G>  the input Graph type
 * @param <WC> the weight operations
 */
class SuperVertex<V, W, WE>
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
 * @param <V> the Graph vertices type.
 * @param <E> the Graph edges type.
 * @param <G> the directed graph type
 */
final class KosarajuSharirAlgorithm<V, E>
```

### JavadocReference
Cannot resolve symbol `Semigroup`
in `src/main/java/org/apache/commons/graph/weight/Monoid.java`
#### Snippet
```java

/**
 * A {@link Monoid} is a {@link Semigroup} with an identity value.
 *
 * @param <E> the type of the elements in the {@link Monoid}
```

### JavadocReference
Cannot resolve symbol `Semigroup`
in `src/main/java/org/apache/commons/graph/weight/Monoid.java`
#### Snippet
```java
    /**
     * Returns the result of the associative binary operation defined by this
     * {@link Semigroup} between two elements of appropriate type.
     *
     * @param e1 the first element
```

### JavadocReference
Cannot resolve symbol `alreadyVisited`
in `src/main/java/org/apache/commons/graph/shortestpath/ShortestDistances.java`
#### Snippet
```java
     * Returns the distance related to input vertex, or null if it wasn't previously visited.
     *
     * <b>NOTE</b>: the method {@link alreadyVisited} should be used first to check if
     * the input vertex was already visited and a distance value is available for it.
     *
```

### JavadocReference
Cannot resolve symbol
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
 * @param <V> the Graph vertices type.
 * @param <E> the Graph edges type.
 * @param <G> the directed graph type
 */
final class CheriyanMehlhornGabowAlgorithm<V, E>
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/graph/visit/VisitState.java`
#### Snippet
```java
     * SKIP state
     */
    SKIP;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/graph/elo/GameResult.java`
#### Snippet
```java
     * DRAW
     */
    DRAW;

}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/flow/DefaultToTailBuilder.java`
#### Snippet
```java
    public <T extends V> MaxFlowAlgorithmSelector<V, WE, W> to( T tail )
    {
        tail = checkNotNull( tail, "tail vertex has to be specifies when looking for the max flow" );
        return new DefaultMaxFlowAlgorithmSelector<V, WE, W>( graph, weightedEdges, head, tail );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/flow/DefaultFromHeadBuilder.java`
#### Snippet
```java
    public <H extends V> ToTailBuilder<V, WE, W> from( H head )
    {
        head = checkNotNull( head, "head vertex has to be specifies when looking for the max flow" );
        return new DefaultToTailBuilder<V, WE, W>( graph, weightedEdges, head );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultWeightedEdgesSelector.java`
#### Snippet
```java
    public <W, M extends Mapper<WE, W>> PathSourceSelector<V, WE, W> whereEdgesHaveWeights( M weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultPathSourceSelector<V, WE, W>( graph, weightedEdges );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/flow/DefaultFlowWeightedEdgesBuilder.java`
#### Snippet
```java
    public <W, M extends Mapper<WE, W>> FromHeadBuilder<V, WE, W> whereEdgesHaveWeights( M weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultFromHeadBuilder<V, WE, W>( graph, weightedEdges );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
    public <T extends V> ShortestPathAlgorithmSelector<V, WE, W> to( T target )
    {
        target = checkNotNull( target, "Shortest path can not be calculated to a null target" );
        return new DefaultShortestPathAlgorithmSelector<V, WE, W>( graph, weightedEdges, source, target );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingBelmannFord( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Belmann-Ford algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    W getShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    public WeightedPath<V, WE, W> findShortestPath( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        WeightedPath<V, WE, W> path = paths.get( new VertexPair<V>( source, target ) );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    void addShortestPath( V source, V target, WeightedPath<V, WE, W> weightedPath )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

        paths.put( new VertexPair<V>( source, target ), weightedPath );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    boolean hasShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    void addShortestDistance( V source, V target, W distance )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

        shortestDistances.put( new VertexPair<V>( source, target ), distance );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningWeightedEdgeMapperBuilder.java`
#### Snippet
```java
    public <W> SpanningTreeSourceSelector<V, W, WE> whereEdgesHaveWeights( Mapper<WE, W> weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultSpanningTreeSourceSelector<V, W, WE>( graph, weightedEdges );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/model/RevertedGraph.java`
#### Snippet
```java
    public RevertedGraph( DirectedGraph<V, E> directedGraph )
    {
        directedGraph = checkNotNull( directedGraph, "Adapted DirectedGraph must be not null" );
        this.directedGraph = directedGraph;
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultLinkedConnectionBuilder.java`
#### Snippet
```java
    public G withConnections( GraphConnection<V, E> graphConnection )
    {
        graphConnection = checkNotNull( graphConnection, "Input graph cannot be configured with null connections" );

        GraphConnector<V, E> grapher = new DefaultGrapher<V, E>( graph );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultGrapher.java`
#### Snippet
```java
    public <A extends E> HeadVertexConnector<V, E> addEdge( A arc )
    {
        arc = checkNotNull( arc, "Null edge not admitted" );
        return new DefaultHeadVertexConnector<V, E>( graph, arc );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultGrapher.java`
#### Snippet
```java
    public <N extends V> N addVertex( N node )
    {
        node = checkNotNull( node, "Null vertex not admitted" );
        graph.addVertex( node );
        return node;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/elo/DefaultRankingSelector.java`
#### Snippet
```java
    public KFactorBuilder<P> wherePlayersAreRankedIn( PlayersRank<P> playersRank )
    {
        playersRank = checkNotNull( playersRank, "ELO ranking can not be applied if players can not be ranked!" );
        return new DefaultKFactorBuilder<P>( tournamentGraph, playersRank );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
    public int getDegree( V v )
    {
        v = checkNotNull( v, "Impossible to get the degree of a null vertex" );
        checkArgument( successors.containsKey( v ),
                       "Impossible to get the degree of input vertex; %s not contained in this path", v );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
    public Iterable<V> getConnectedVertices( V v )
    {
        v = checkNotNull( v, "Impossible to get the degree of a null vertex" );

        if ( target.equals( v ) )
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends DirectedGraph<V, E>> SccAlgorithmSelector<V, E> findStronglyConnectedComponent( G graph )
    {
        graph = checkNotNull( graph, "Strongly Connected Component cannot be calculated from a null graph" );
        return new DefaultSccAlgorithmSelector<V, E>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends UndirectedGraph<V, E>> ColorsBuilder<V, E> coloring( G graph )
    {
        graph = checkNotNull( graph, "Coloring can not be calculated on null graph"  );
        return new DefaultColorsBuilder<V, E>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> ConnectivityBuilder<V, E> findConnectedComponent( G graph )
    {
        graph = checkNotNull( graph, "Connected Component cannot be calculated from a null graph" );
        return new DefaultConnectivityBuilder<V, E>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> NamedExportSelector<V, E> export( G graph )
    {
        graph = checkNotNull( graph, "Null graph can not be exported" );
        return new DefaultExportSelector<V, E>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends Graph<V, WE>> PathWeightedEdgesBuilder<V, WE> findShortestPath( G graph )
    {
        graph = checkNotNull( graph, "Shortest path can not be calculated on null graph" );
        return new DefaultWeightedEdgesSelector<V, WE>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <P, TG extends DirectedGraph<P, GameResult>> RankingSelector<P> eloRate( TG tournamentGraph )
    {
        tournamentGraph = checkNotNull( tournamentGraph, "ELO ranking can not be applied on null graph!" );
        return new DefaultRankingSelector<P>( tournamentGraph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> VisitSourceSelector<V, E, G> visit( G graph )
    {
        graph = checkNotNull( graph, "No algorithm can be applied on null graph!" );
        return new DefaultVisitSourceSelector<V, E, G>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends DirectedGraph<V, WE>> FlowWeightedEdgesBuilder<V, WE> findMaxFlow( G graph )
    {
        graph = checkNotNull( graph, "Max flow can not be calculated on null graph" );
        return new DefaultFlowWeightedEdgesBuilder<V, WE>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends Graph<V, WE>> SpanningWeightedEdgeMapperBuilder<V, WE> minimumSpanningTree( G graph )
    {
        graph = checkNotNull( graph, "Minimum spanning tree can not be calculated on null graph" );
        return new DefaultSpanningWeightedEdgeMapperBuilder<V, WE>( graph );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
    public ColoredVertices<V, C> applyingBackTrackingAlgorithm( ColoredVertices<V, C> partialColoredVertex )
    {
        partialColoredVertex = checkNotNull( partialColoredVertex, "PartialColoredVertex must be not null" );

        final List<V> verticesList = new ArrayList<V>();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/connectivity/DefaultConnectivityBuilder.java`
#### Snippet
```java
    public ConnectivityAlgorithmsSelector<V, E> includingVertices( V... vertices )
    {
        vertices = checkNotNull( vertices,
                                 "Graph connectivity cannote be applied on null vertices array, use no-args if you intend specify no vertices" );
        return new DefaultConnectivityAlgorithmsSelector<V, E>( graph, asList( vertices ) );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultHeadVertexConnector.java`
#### Snippet
```java
    public <H extends V> TailVertexConnector<V, E> from( H head )
    {
        head = checkNotNull( head, "Null head vertex not admitted" );
        return new DefaultTailVertexConnector<V, E>( graph, edge, head );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultTailVertexConnector.java`
#### Snippet
```java
    public <T extends V> void to( T tail )
    {
        tail = checkNotNull( tail, "Null tail vertex not admitted" );
        graph.addEdge( head, edge, tail );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/coloring/ColoredVertices.java`
#### Snippet
```java
    public C getColor( V v )
    {
        v = checkNotNull( v, "Impossible to get the color for a null Vertex" );

        return coloredVertices.get( v );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningTreeSourceSelector.java`
#### Snippet
```java
    public <S extends V> SpanningTreeAlgorithmSelector<V, W, WE> fromSource( S source )
    {
        source = checkNotNull( source, "Spanning tree cannot be calculated without expressing the source vertex" );
        checkState( graph.containsVertex( source ), "Vertex %s does not exist in the Graph", source );
        return new DefaultSpanningTreeAlgorithmSelector<V, W, WE>( graph, weightedEdges, source );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingFloydWarshall( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Floyd-Warshall algorithm can not be applied using null weight operations" );

        AllVertexPairsShortestPath<V, WE, W> shortestPaths = new AllVertexPairsShortestPath<V, WE, W>( weightOperations );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    public <H extends V> TargetSourceSelector<V, WE, W> from( H source )
    {
        source = checkNotNull( source, "Shortest path can not be calculated from a null source" );
        return new DefaultTargetSourceSelector<V, WE, W>( graph, weightedEdges, source );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultHeuristicBuilder.java`
#### Snippet
```java
    public <H extends Heuristic<V, W>> WeightedPath<V, WE, W> withHeuristic( H heuristic )
    {
        heuristic = checkNotNull( heuristic, "A* algorithm can not be applied using a null heuristic" );

        // Cost from start along best known path.
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitSourceSelector.java`
#### Snippet
```java
    public <S extends V> VisitAlgorithmsSelector<V, E, G> from( S source )
    {
        source = checkNotNull( source, "Impossible to visit input graph %s with null source", graph );
        checkState( graph.containsVertex( source ), "Vertex %s does not exist in the Graph", source );
        return new DefaultVisitAlgorithmsSelector<V, E, G>( graph, source );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );

        handler.discoverGraph( graph );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/coloring/DefaultColorsBuilder.java`
#### Snippet
```java
    public <C> ColoringAlgorithmsSelector<V, E, C> withColors( Set<C> colors )
    {
        colors = checkNotNull( colors, "Colors set must be not null" );
        return new DefaultColoringAlgorithmsSelector<V, E, C>( graph, colors );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> HeuristicBuilder<V, WE, W> applyingAStar( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "A* algorithm can not be applied using null weight operations" );
        return new DefaultHeuristicBuilder<V, WE, W>( graph, weightedEdges, source, target, weightOperations );
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingBidirectionalDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Bidirectional Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistancesForward = new ShortestDistances<V, W>( weightOperations );
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/PathSourceSelector.java`
#### Snippet
```java
     * Specifies the shortest path source.
     *
     * @param source
     */
    <H extends V> TargetSourceSelector<V, WE, W> from( H source );
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/commons/graph/Mapper.java`
#### Snippet
```java
    /**
     * TODO Fill the java doc
     * @param input
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/Mapper.java`
#### Snippet
```java
     * TODO Fill the java doc
     * @param input
     * @return
     */
    O map( I input );
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java

    /**
     * @param source
     * @param target
     * @param weightedPath
```

### JavadocDeclaration
`@param target` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    /**
     * @param source
     * @param target
     * @param weightedPath
     */
```

### JavadocDeclaration
`@param weightedPath` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
     * @param source
     * @param target
     * @param weightedPath
     */
    void addShortestPath( V source, V target, WeightedPath<V, WE, W> weightedPath )
```

### JavadocDeclaration
`@param source` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java

    /**
     * @param source
     * @param target
     * @param distance
```

### JavadocDeclaration
`@param target` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    /**
     * @param source
     * @param target
     * @param distance
     */
```

### JavadocDeclaration
`@param distance` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
     * @param source
     * @param target
     * @param distance
     */
    void addShortestDistance( V source, V target, W distance )
```

### JavadocDeclaration
`@param tail` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/ToTailBuilder.java`
#### Snippet
```java
     * TODO Fill me!!!
     * 
     * @param tail
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/ToTailBuilder.java`
#### Snippet
```java
     * 
     * @param tail
     * @return
     */
    <T extends V> MaxFlowAlgorithmSelector<V, WE, W> to( T tail );
```

### JavadocDeclaration
`@param weightedEdges` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/FlowWeightedEdgesBuilder.java`
#### Snippet
```java
     * TODO Fill me!!
     * 
     * @param weightedEdges
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/FlowWeightedEdgesBuilder.java`
#### Snippet
```java
     * 
     * @param weightedEdges
     * @return
     */
    <W, M extends Mapper<WE, W>> FromHeadBuilder<V, WE, W> whereEdgesHaveWeights( M weightedEdges );
```

### JavadocDeclaration
`@param heuristic` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/HeuristicBuilder.java`
#### Snippet
```java
    /**
     *
     * @param heuristic
     * @param <H>
     * @return
```

### JavadocDeclaration
`@param ` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/HeuristicBuilder.java`
#### Snippet
```java
     *
     * @param heuristic
     * @param <H>
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/HeuristicBuilder.java`
#### Snippet
```java
     * @param heuristic
     * @param <H>
     * @return
     */
    <H extends Heuristic<V, W>> WeightedPath<V, WE, W> withHeuristic( H heuristic );
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/ShortestPathAlgorithmSelector.java`
#### Snippet
```java
     * @param <WO> the type of weight operations
     * @param weightOperations the class responsible for operations on weights
     * @return
     */
    <WO extends OrderedMonoid<W>> HeuristicBuilder<V, WE, W> applyingAStar( WO weightOperations );
```

### JavadocDeclaration
`@param weightOperations` tag description is missing
in `src/main/java/org/apache/commons/graph/model/MutableSpanningTree.java`
#### Snippet
```java
     * Creates a new instance of {@link MutableSpanningTree}
     * 
     * @param weightOperations 
     * @param weightedEdges
     */
```

### JavadocDeclaration
`@param weightedEdges` tag description is missing
in `src/main/java/org/apache/commons/graph/model/MutableSpanningTree.java`
#### Snippet
```java
     * 
     * @param weightOperations 
     * @param weightedEdges
     */
    public MutableSpanningTree( Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
```

### JavadocDeclaration
`@param algorithm` tag description is missing
in `src/main/java/org/apache/commons/graph/scc/DefaultSccAlgorithmSelector.java`
#### Snippet
```java
     * Just calculates the SCC depending on the selected algorithm.
     *
     * @param algorithm
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/scc/DefaultSccAlgorithmSelector.java`
#### Snippet
```java
     *
     * @param algorithm
     * @return
     */
    private Set<Set<V>> applying( SccAlgorithm<V> algorithm )
```

### JavadocDeclaration
`@param playersRank` tag description is missing
in `src/main/java/org/apache/commons/graph/elo/RankingSelector.java`
#### Snippet
```java
     * TODO Fill me!!!
     * 
     * @param playersRank 
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/elo/RankingSelector.java`
#### Snippet
```java
     * 
     * @param playersRank 
     * @return
     */
    KFactorBuilder<P> wherePlayersAreRankedIn( PlayersRank<P> playersRank );
```

### JavadocDeclaration
`@param currentVertex` tag description is missing
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     * Tests if there is some adjacent vertices with the same color.
     *
     * @param currentVertex
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     *
     * @param currentVertex
     * @return
     */
    private boolean isThereColorConflict( V currentVertex, ColoredVertices<V, C> coloredVertices )
```

### JavadocDeclaration
`@param target` tag description is missing
in `src/main/java/org/apache/commons/graph/shortestpath/TargetSourceSelector.java`
#### Snippet
```java
     * Specifies the shortest path source.
     *
     * @param target
     */
    <T extends V> ShortestPathAlgorithmSelector<V, WE, W> to( T target );
```

### JavadocDeclaration
`@param head` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/FromHeadBuilder.java`
#### Snippet
```java
    /**
     * TODO Fill me !!!
     * @param head
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/graph/flow/FromHeadBuilder.java`
#### Snippet
```java
     * TODO Fill me !!!
     * @param head
     * @return
     */
    <H extends V> ToTailBuilder<V, WE, W> from( H head );
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/graph/export/ExportSelector.java`
#### Snippet
```java
     *
     * @return {@link DotExporter} instance
     * @throws GraphExportException
     */
    DotExporter<V, E> usingDotNotation()
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/graph/export/ExportSelector.java`
#### Snippet
```java
     *
     * @return {@link GraphMLExporter} instance
     * @throws GraphExportException
     */
    GraphMLExporter<V, E> usingGraphMLFormat()
```

### JavadocDeclaration
`@param weightOperations` tag description is missing
in `src/main/java/org/apache/commons/graph/model/InMemoryWeightedPath.java`
#### Snippet
```java
     * @param start the start vertex
     * @param target the target vertex
     * @param weightOperations 
     * @param weightedEdges
     */
```

### JavadocDeclaration
`@param weightedEdges` tag description is missing
in `src/main/java/org/apache/commons/graph/model/InMemoryWeightedPath.java`
#### Snippet
```java
     * @param target the target vertex
     * @param weightOperations 
     * @param weightedEdges
     */
    public InMemoryWeightedPath( V start, V target, Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
```

### JavadocDeclaration
`@param grapher` tag description is missing
in `src/main/java/org/apache/commons/graph/builder/GraphConnection.java`
#### Snippet
```java
     * TODO Fillme!!
     *
     * @param grapher
     */
    void connect( GraphConnector<V, E> grapher );
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`! ( forward ^ visited.contains( v ) )` can be simplified to 'forward==visited.contains( v )'
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
            //  * step1: forward && visited.contains(v)
            //  * step2: !forward && !visited.contains(v)
            if ( ! ( forward ^ visited.contains( v ) ) )
            {
                coll.add( v );
```

### SimplifiableBooleanExpression
`! ( forward ^ ! visited.contains( w ) )` can be simplified to 'forward==! visited.contains( w )'
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
            for ( V w : g.getOutbound( v ) )
            {
                if ( ! ( forward ^ ! visited.contains( w ) ) )
                {
                    stack.addLast( w );
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `keys` may be 'final'
in `src/main/java/org/apache/commons/graph/coloring/UncoloredOrderedVertices.java`
#### Snippet
```java
        {

            private Iterator<Integer> keys = orderedVertices.keySet().iterator();

            private Iterator<V> pending = null;
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
                catch ( PathNotFoundException e )
                {
                    continue;
                }
            }
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
            // still processed. To improve performance, only the items that have been
            // added to the list since the last iteration are removed
            vertices.removeAll( expandedVertexList.subList( idx, expandedVertexList.size() ) );
            idx = expandedVertexList.size();
        }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/graph/flow/DefaultMaxFlowAlgorithmSelector.java`
#### Snippet
```java
        final WO checkedWeightOperations = checkNotNull( weightOperations, "Weight operations can not be null to find the max flow in the graph" );

        // create flow network
        final DirectedGraph<V, EdgeWrapper<WE>> flowNetwork = newFlowNetwok( graph, checkedWeightOperations );

        // create flow network handler
        final FlowNetworkHandler<V, EdgeWrapper<WE>, W> flowNetworkHandler =
                        new FlowNetworkHandler<V, EdgeWrapper<WE>, W>( flowNetwork, source, target, checkedWeightOperations, new MapperWrapper<WE, W, WO>( checkedWeightOperations, weightedEdges ) );
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
        shortestDistances.setWeight( source, weightOperations.identity() );

        final Queue<V> unsettledNodes = new FibonacciHeap<V>( shortestDistances );
        unsettledNodes.add( source );
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
                if ( !closedForward.contains( v ) )
                {
                    WE edge = graph.getEdge( vertex, v );
                    if ( shortestDistancesForward.alreadyVisited( vertex ) )
                    {
                        W shortDist = weightOperations.append( shortestDistancesForward.getWeight( vertex ), weightedEdges.map( edge ) );

                        if ( !shortestDistancesForward.alreadyVisited( v )
                                || weightOperations.compare( shortDist, shortestDistancesForward.getWeight( v ) ) < 0 )
                        {
                            shortestDistancesForward.setWeight( v, shortDist );
                            openForward.add( v );
                            predecessorsForward.addPredecessor( v, vertex );

                            if ( closedBackwards.contains( v ) )
                            {
                                W tmpBest = weightOperations.append( shortDist, shortestDistancesBackwards.getWeight( v ) );

                                if ( best == null || weightOperations.compare( tmpBest, best ) < 0 )
                                {
                                    best = tmpBest;
                                    touch = v;
                                }
                            }
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/graph/shortestpath/PredecessorsList.java`
#### Snippet
```java
        InMemoryWeightedPath<V, WE, W> path = new InMemoryWeightedPath<V, WE, W>( source, target, weightOperations, weightedEdges );

        V vertex = target;
        while ( !source.equals( vertex ) )
        {
            V predecessor = predecessors.get( vertex );
            if ( predecessor == null )
            {
                throw new PathNotFoundException( "Path from '%s' to '%s' doesn't exist", source, target );
            }
            WE edge = graph.getEdge( predecessor, vertex );

            path.addConnectionInHead( predecessor, edge, vertex );

            vertex = predecessor;
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java

        final Set<Set<V>> scc = new HashSet<Set<V>>();
        scc.addAll( indexedSccComponents );
        return scc;
    }
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
        {
            C adjColor = coloredVertices.getColor( abj );
            if ( adjColor != null && nextVertecColor.equals( adjColor ) )
            {
                return true;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java

        @SuppressWarnings( "unchecked" ) // type driven by input type
        List<V> connected = asList( successors.get( v ) );
        return connected;
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `w` initializer `null` is redundant
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
        {
            p.pop();
            V w = null;
            do
            {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
        for ( final V v : other.vertices )
        {
            vertices.add( v );
        }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `components.size() == 1` is always `false` when reached
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningTreeAlgorithmSelector.java`
#### Snippet
```java
            // if there is no edge anymore for a component, and there is still more than 1 component,
            // the graph is unconnected
            checkState( !edges.isEmpty() || components.size() == 1, "unconnected graph" );

            for ( final WE edge : edges )
```

### ConstantValue
Condition `x != null` is always `true`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
        FibonacciHeapNode<E> x = minimumNode;

        if ( x != null )
        {
            numRoots++;
```

### ConstantValue
Condition `minimumNode != null` is always `true`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            // 16 if A[i] != NIL
            // We've got a live one, add it to root list.
            if ( minimumNode != null )
            {
                //  First remove node from root list.
```

### ConstantValue
Condition `lock == null` is always `false` when reached
in `src/main/java/org/apache/commons/graph/SynchronizedGraph.java`
#### Snippet
```java
        int result = 1;
        result = prime * result + ( ( g == null ) ? 0 : g.hashCode() );
        result = prime * result + ( ( lock == null ) ? 0 : lock.hashCode() );
        return result;
    }
```

