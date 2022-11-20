# commons-graph 
 
# Bad smells
I found 206 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=AssignmentToMethodParameter] | 51 | false |
| RuleId[ruleID=DataFlowIssue] | 50 | false |
| RuleId[ruleID=BoundedWildcard] | 40 | false |
| RuleId[ruleID=ReturnNull] | 13 | false |
| RuleId[ruleID=ObsoleteCollection] | 9 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 8 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 7 | false |
| RuleId[ruleID=SuspiciousNameCombination] | 6 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 4 | false |
| RuleId[ruleID=ConstantValue] | 4 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 2 | false |
| RuleId[ruleID=SimplifiableBooleanExpression] | 2 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 2 | true |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 1 | true |
| RuleId[ruleID=EmptyMethod] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 1 | false |
| RuleId[ruleID=ConstantMathCall] | 1 | false |
| RuleId[ruleID=UnusedAssignment] | 1 | false |
| RuleId[ruleID=UseBulkOperation] | 1 | false |
| RuleId[ruleID=RedundantSuppression] | 1 | false |
## RuleId[ruleID=SuspiciousNameCombination]
### RuleId[ruleID=SuspiciousNameCombination]
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

### RuleId[ruleID=SuspiciousNameCombination]
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

### RuleId[ruleID=SuspiciousNameCombination]
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

### RuleId[ruleID=SuspiciousNameCombination]
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

### RuleId[ruleID=SuspiciousNameCombination]
'y' should probably not be passed as parameter 'left'
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
            y.setRight( x.getChild().getRight() );
            x.getChild().setRight( y );
            y.getRight().setLeft( y );
        }

```

### RuleId[ruleID=SuspiciousNameCombination]
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

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/DotExporter.java`
#### Snippet
```java
    public DotExporter<V, E> withVertexLabels( Mapper<V, String> vertexLabels )
    {
        super.addVertexProperty( LABEL, vertexLabels );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/DotExporter.java`
#### Snippet
```java
    public DotExporter<V, E> withEdgeLabels( Mapper<E, String> edgeLabels )
    {
        super.addEdgeProperty( LABEL, edgeLabels );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/DotExporter.java`
#### Snippet
```java
    public <N extends Number> DotExporter<V, E> withEdgeWeights( Mapper<E, N> edgeWeights )
    {
        super.addEdgeProperty( WEIGHT, edgeWeights );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/GraphMLExporter.java`
#### Snippet
```java
    public GraphMLExporter<V, E> withVertexLabels( Mapper<V, String> vertexLabels )
    {
        super.addVertexProperty( LABEL, vertexLabels );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/GraphMLExporter.java`
#### Snippet
```java
    public <N extends Number> GraphMLExporter<V, E> withEdgeWeights( Mapper<E, N> edgeWeights )
    {
        super.addEdgeProperty( WEIGHT, edgeWeights );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/GraphMLExporter.java`
#### Snippet
```java
    public <N extends Number> GraphMLExporter<V, E> withVertexWeights( Mapper<V, N> vertexWeights )
    {
        super.addVertexProperty( WEIGHT, vertexWeights );
        return this;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/graph/export/GraphMLExporter.java`
#### Snippet
```java
    public GraphMLExporter<V, E> withEdgeLabels( Mapper<E, String> edgeLabels )
    {
        super.addEdgeProperty( LABEL, edgeLabels );
        return this;
    }
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/graph/elo/GameResult.java`
#### Snippet
```java
     * DRAW
     */
    DRAW;

}
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/graph/visit/VisitState.java`
#### Snippet
```java
     * SKIP state
     */
    SKIP;

}
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.graph` is unnecessary and can be removed
in `src/main/java/org/apache/commons/graph/spanning/ShortestEdges.java`
#### Snippet
```java

/**
 * The predecessor list is a list of vertex of a {@link org.apache.commons.graph.Graph}.
 * Each vertex' entry contains the index of its predecessor in a path through the graph.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/graph/export/GraphExportException.java`
#### Snippet
```java
     * @param messagePattern  A <a href="../util/Formatter.html#syntax">format string</a>
     * @param messageArguments Arguments referenced by the format specifiers in the format string
     * @see java.lang.String#format(String, Object...)
     */
    public GraphExportException( Throwable cause, String messagePattern, Object...messageArguments )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/graph/GraphException.java`
#### Snippet
```java
     * @param messagePattern The error message text pattern
     * @param arguments Arguments referenced by the format specifiers in the format string
     * @see java.lang.String#format(String, Object...)
     */
    public GraphException( String messagePattern, Object...arguments )
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.graph` is unnecessary and can be removed
in `src/main/java/org/apache/commons/graph/shortestpath/PredecessorsList.java`
#### Snippet
```java

/**
 * The predecessor list is a list of vertex of a {@link org.apache.commons.graph.Graph}.
 * Each vertex' entry contains the index of its predecessor in a path through the graph.
 *
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
    public Iterable<V> getConnectedVertices( V v )
    {
        v = checkNotNull( v, "Impossible to get the degree of a null vertex" );

        if ( target.equals( v ) )
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingBelmannFord( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Belmann-Ford algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/builder/DefaultLinkedConnectionBuilder.java`
#### Snippet
```java
    public G withConnections( GraphConnection<V, E> graphConnection )
    {
        graphConnection = checkNotNull( graphConnection, "Input graph cannot be configured with null connections" );

        GraphConnector<V, E> grapher = new DefaultGrapher<V, E>( graph );
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );

        handler.discoverGraph( graph );
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    public WeightedPath<V, WE, W> findShortestPath( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        WeightedPath<V, WE, W> path = paths.get( new VertexPair<V>( source, target ) );
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

        shortestDistances.put( new VertexPair<V>( source, target ), distance );
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

        paths.put( new VertexPair<V>( source, target ), weightedPath );
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    W getShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    boolean hasShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingFloydWarshall( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Floyd-Warshall algorithm can not be applied using null weight operations" );

        AllVertexPairsShortestPath<V, WE, W> shortestPaths = new AllVertexPairsShortestPath<V, WE, W>( weightOperations );
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/coloring/ColoredVertices.java`
#### Snippet
```java
    public C getColor( V v )
    {
        v = checkNotNull( v, "Impossible to get the color for a null Vertex" );

        return coloredVertices.get( v );
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
    public ColoredVertices<V, C> applyingBackTrackingAlgorithm( ColoredVertices<V, C> partialColoredVertex )
    {
        partialColoredVertex = checkNotNull( partialColoredVertex, "PartialColoredVertex must be not null" );

        final List<V> verticesList = new ArrayList<V>();
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultHeuristicBuilder.java`
#### Snippet
```java
    public <H extends Heuristic<V, W>> WeightedPath<V, WE, W> withHeuristic( H heuristic )
    {
        heuristic = checkNotNull( heuristic, "A* algorithm can not be applied using a null heuristic" );

        // Cost from start along best known path.
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingBidirectionalDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Bidirectional Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistancesForward = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractExporter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/graph/export/AbstractExporter.java`
#### Snippet
```java
    private Writer writer;

    public AbstractExporter( Graph<V, E> graph, String name )
    {
        this.graph = graph;
```

## RuleId[ruleID=SimplifiableBooleanExpression]
### RuleId[ruleID=SimplifiableBooleanExpression]
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

### RuleId[ruleID=SimplifiableBooleanExpression]
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

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java

        // create a new stack and put root on it
        Stack<FibonacciHeapNode<E>> stack = new Stack<FibonacciHeapNode<E>>();
        stack.push( minimumNode );

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java

        // create a new stack and put root on it
        Stack<FibonacciHeapNode<E>> stack = new Stack<FibonacciHeapNode<E>>();
        stack.push( minimumNode );

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private final Map<V, Integer> sscId = new HashMap<V, Integer>();

    private final Stack<V> s = new Stack<V>();

    private final Stack<V> p = new Stack<V>();
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private final Map<V, Integer> sscId = new HashMap<V, Integer>();

    private final Stack<V> s = new Stack<V>();

    private final Stack<V> p = new Stack<V>();
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private final Stack<V> s = new Stack<V>();

    private final Stack<V> p = new Stack<V>();

    private int preorderCounter = 0;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private final Stack<V> s = new Stack<V>();

    private final Stack<V> p = new Stack<V>();

    private int preorderCounter = 0;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
                                                                          V vertex,
                                                                          Map<V, TarjanVertexMetaInfo> verticesMetaInfo,
                                                                          Stack<V> s,
                                                                          Set<V> stronglyConnectedComponent,
                                                                          Integer index )
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
    {
        final Map<V, TarjanVertexMetaInfo> verticesMetaInfo = new HashMap<V, TarjanVertexMetaInfo>();
        final Stack<V> s = new Stack<V>();
        final Set<Set<V>> stronglyConnectedComponents = new LinkedHashSet<Set<V>>();
        Integer index = 0;
```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
    {
        final Map<V, TarjanVertexMetaInfo> verticesMetaInfo = new HashMap<V, TarjanVertexMetaInfo>();
        final Stack<V> s = new Stack<V>();
        final Set<Set<V>> stronglyConnectedComponents = new LinkedHashSet<Set<V>>();
        Integer index = 0;
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `src/main/java/org/apache/commons/graph/visit/GraphVisitHandler.java`
#### Snippet
```java
     * Called upon termination of the search algorithm.
     */
    void finishGraph( G graph );

    /**
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/graph/coloring/UncoloredOrderedVertices.java`
#### Snippet
```java
            private Iterator<Integer> keys = orderedVertices.keySet().iterator();

            private Iterator<V> pending = null;

            private V next = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/graph/coloring/UncoloredOrderedVertices.java`
#### Snippet
```java
            private Iterator<V> pending = null;

            private V next = null;

            public boolean hasNext()
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/graph/export/DefaultExportSelector.java`
#### Snippet
```java
    private final Graph<V, E> graph;

    private String name = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     * {@code t(H)} the number of trees in the root list.
     */
    private int trees = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     * The number of nodes currently in {@code H} is kept in {@code n[H]}.
     */
    private int size = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     * {@code m(H)} the number of marked nodes in {@code H}.
     */
    private int markedNodes = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private final Stack<V> p = new Stack<V>();

    private int preorderCounter = 0;

    private int sscCounter = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/graph/scc/CheriyanMehlhornGabowAlgorithm.java`
#### Snippet
```java
    private int preorderCounter = 0;

    private int sscCounter = 0;

    public CheriyanMehlhornGabowAlgorithm( DirectedGraph<V, E> graph )
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
    public int getDegree( V v )
    {
        v = checkNotNull( v, "Impossible to get the degree of a null vertex" );
        checkArgument( successors.containsKey( v ),
                       "Impossible to get the degree of input vertex; %s not contained in this path", v );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
    public Iterable<V> getConnectedVertices( V v )
    {
        v = checkNotNull( v, "Impossible to get the degree of a null vertex" );

        if ( target.equals( v ) )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightedEdges`
in `src/main/java/org/apache/commons/graph/flow/DefaultFlowWeightedEdgesBuilder.java`
#### Snippet
```java
    public <W, M extends Mapper<WE, W>> FromHeadBuilder<V, WE, W> whereEdgesHaveWeights( M weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultFromHeadBuilder<V, WE, W>( graph, weightedEdges );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tail`
in `src/main/java/org/apache/commons/graph/flow/DefaultToTailBuilder.java`
#### Snippet
```java
    public <T extends V> MaxFlowAlgorithmSelector<V, WE, W> to( T tail )
    {
        tail = checkNotNull( tail, "tail vertex has to be specifies when looking for the max flow" );
        return new DefaultMaxFlowAlgorithmSelector<V, WE, W>( graph, weightedEdges, head, tail );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends DirectedGraph<V, WE>> FlowWeightedEdgesBuilder<V, WE> findMaxFlow( G graph )
    {
        graph = checkNotNull( graph, "Max flow can not be calculated on null graph" );
        return new DefaultFlowWeightedEdgesBuilder<V, WE>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> ConnectivityBuilder<V, E> findConnectedComponent( G graph )
    {
        graph = checkNotNull( graph, "Connected Component cannot be calculated from a null graph" );
        return new DefaultConnectivityBuilder<V, E>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> VisitSourceSelector<V, E, G> visit( G graph )
    {
        graph = checkNotNull( graph, "No algorithm can be applied on null graph!" );
        return new DefaultVisitSourceSelector<V, E, G>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends Graph<V, E>> NamedExportSelector<V, E> export( G graph )
    {
        graph = checkNotNull( graph, "Null graph can not be exported" );
        return new DefaultExportSelector<V, E>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends DirectedGraph<V, E>> SccAlgorithmSelector<V, E> findStronglyConnectedComponent( G graph )
    {
        graph = checkNotNull( graph, "Strongly Connected Component cannot be calculated from a null graph" );
        return new DefaultSccAlgorithmSelector<V, E>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends Graph<V, WE>> SpanningWeightedEdgeMapperBuilder<V, WE> minimumSpanningTree( G graph )
    {
        graph = checkNotNull( graph, "Minimum spanning tree can not be calculated on null graph" );
        return new DefaultSpanningWeightedEdgeMapperBuilder<V, WE>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, E, G extends UndirectedGraph<V, E>> ColorsBuilder<V, E> coloring( G graph )
    {
        graph = checkNotNull( graph, "Coloring can not be calculated on null graph"  );
        return new DefaultColorsBuilder<V, E>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <V, WE, G extends Graph<V, WE>> PathWeightedEdgesBuilder<V, WE> findShortestPath( G graph )
    {
        graph = checkNotNull( graph, "Shortest path can not be calculated on null graph" );
        return new DefaultWeightedEdgesSelector<V, WE>( graph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tournamentGraph`
in `src/main/java/org/apache/commons/graph/CommonsGraph.java`
#### Snippet
```java
    public static <P, TG extends DirectedGraph<P, GameResult>> RankingSelector<P> eloRate( TG tournamentGraph )
    {
        tournamentGraph = checkNotNull( tournamentGraph, "ELO ranking can not be applied on null graph!" );
        return new DefaultRankingSelector<P>( tournamentGraph );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `playersRank`
in `src/main/java/org/apache/commons/graph/elo/DefaultRankingSelector.java`
#### Snippet
```java
    public KFactorBuilder<P> wherePlayersAreRankedIn( PlayersRank<P> playersRank )
    {
        playersRank = checkNotNull( playersRank, "ELO ranking can not be applied if players can not be ranked!" );
        return new DefaultKFactorBuilder<P>( tournamentGraph, playersRank );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `vertices`
in `src/main/java/org/apache/commons/graph/connectivity/DefaultConnectivityBuilder.java`
#### Snippet
```java
    public ConnectivityAlgorithmsSelector<V, E> includingVertices( V... vertices )
    {
        vertices = checkNotNull( vertices,
                                 "Graph connectivity cannote be applied on null vertices array, use no-args if you intend specify no vertices" );
        return new DefaultConnectivityAlgorithmsSelector<V, E>( graph, asList( vertices ) );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
    public <T extends V> ShortestPathAlgorithmSelector<V, WE, W> to( T target )
    {
        target = checkNotNull( target, "Shortest path can not be calculated to a null target" );
        return new DefaultShortestPathAlgorithmSelector<V, WE, W>( graph, weightedEdges, source, target );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightOperations`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultTargetSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingBelmannFord( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Belmann-Ford algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitSourceSelector.java`
#### Snippet
```java
    public <S extends V> VisitAlgorithmsSelector<V, E, G> from( S source )
    {
        source = checkNotNull( source, "Impossible to visit input graph %s with null source", graph );
        checkState( graph.containsVertex( source ), "Vertex %s does not exist in the Graph", source );
        return new DefaultVisitAlgorithmsSelector<V, E, G>( graph, source );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tail`
in `src/main/java/org/apache/commons/graph/builder/DefaultTailVertexConnector.java`
#### Snippet
```java
    public <T extends V> void to( T tail )
    {
        tail = checkNotNull( tail, "Null tail vertex not admitted" );
        graph.addEdge( head, edge, tail );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightedEdges`
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningWeightedEdgeMapperBuilder.java`
#### Snippet
```java
    public <W> SpanningTreeSourceSelector<V, W, WE> whereEdgesHaveWeights( Mapper<WE, W> weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultSpanningTreeSourceSelector<V, W, WE>( graph, weightedEdges );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `graphConnection`
in `src/main/java/org/apache/commons/graph/builder/DefaultLinkedConnectionBuilder.java`
#### Snippet
```java
    public G withConnections( GraphConnection<V, E> graphConnection )
    {
        graphConnection = checkNotNull( graphConnection, "Input graph cannot be configured with null connections" );

        GraphConnector<V, E> grapher = new DefaultGrapher<V, E>( graph );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `colors`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColorsBuilder.java`
#### Snippet
```java
    public <C> ColoringAlgorithmsSelector<V, E, C> withColors( Set<C> colors )
    {
        colors = checkNotNull( colors, "Colors set must be not null" );
        return new DefaultColoringAlgorithmsSelector<V, E, C>( graph, colors );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `arc`
in `src/main/java/org/apache/commons/graph/builder/DefaultGrapher.java`
#### Snippet
```java
    public <A extends E> HeadVertexConnector<V, E> addEdge( A arc )
    {
        arc = checkNotNull( arc, "Null edge not admitted" );
        return new DefaultHeadVertexConnector<V, E>( graph, arc );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `src/main/java/org/apache/commons/graph/builder/DefaultGrapher.java`
#### Snippet
```java
    public <N extends V> N addVertex( N node )
    {
        node = checkNotNull( node, "Null vertex not admitted" );
        graph.addVertex( node );
        return node;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `handler`
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );

        handler.discoverGraph( graph );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    public WeightedPath<V, WE, W> findShortestPath( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        WeightedPath<V, WE, W> path = paths.get( new VertexPair<V>( source, target ) );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    void addShortestDistance( V source, V target, W distance )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `distance`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        distance = checkNotNull( distance, "Impossible to add a shortest distance with a null distance" );

        shortestDistances.put( new VertexPair<V>( source, target ), distance );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    void addShortestPath( V source, V target, WeightedPath<V, WE, W> weightedPath )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightedPath`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );
        weightedPath = checkNotNull( weightedPath, "Impossible to add a null weightedPath path to a null target" );

        paths.put( new VertexPair<V>( source, target ), weightedPath );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    W getShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    boolean hasShortestDistance( V source, V target )
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
    {
        source = checkNotNull( source, "Impossible to add a shortest path from a null source" );
        target = checkNotNull( target, "Impossible to add a shortest path to a null target" );

        if ( source.equals( target ) )
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `directedGraph`
in `src/main/java/org/apache/commons/graph/model/RevertedGraph.java`
#### Snippet
```java
    public RevertedGraph( DirectedGraph<V, E> directedGraph )
    {
        directedGraph = checkNotNull( directedGraph, "Adapted DirectedGraph must be not null" );
        this.directedGraph = directedGraph;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    public <H extends V> TargetSourceSelector<V, WE, W> from( H source )
    {
        source = checkNotNull( source, "Shortest path can not be calculated from a null source" );
        return new DefaultTargetSourceSelector<V, WE, W>( graph, weightedEdges, source );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightOperations`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> AllVertexPairsShortestPath<V, WE, W> applyingFloydWarshall( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Floyd-Warshall algorithm can not be applied using null weight operations" );

        AllVertexPairsShortestPath<V, WE, W> shortestPaths = new AllVertexPairsShortestPath<V, WE, W>( weightOperations );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/graph/coloring/ColoredVertices.java`
#### Snippet
```java
    public C getColor( V v )
    {
        v = checkNotNull( v, "Impossible to get the color for a null Vertex" );

        return coloredVertices.get( v );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightedEdges`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultWeightedEdgesSelector.java`
#### Snippet
```java
    public <W, M extends Mapper<WE, W>> PathSourceSelector<V, WE, W> whereEdgesHaveWeights( M weightedEdges )
    {
        weightedEdges = checkNotNull( weightedEdges, "Function to calculate edges weight can not be null." );
        return new DefaultPathSourceSelector<V, WE, W>( graph, weightedEdges );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `head`
in `src/main/java/org/apache/commons/graph/flow/DefaultFromHeadBuilder.java`
#### Snippet
```java
    public <H extends V> ToTailBuilder<V, WE, W> from( H head )
    {
        head = checkNotNull( head, "head vertex has to be specifies when looking for the max flow" );
        return new DefaultToTailBuilder<V, WE, W>( graph, weightedEdges, head );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `partialColoredVertex`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
    public ColoredVertices<V, C> applyingBackTrackingAlgorithm( ColoredVertices<V, C> partialColoredVertex )
    {
        partialColoredVertex = checkNotNull( partialColoredVertex, "PartialColoredVertex must be not null" );

        final List<V> verticesList = new ArrayList<V>();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
        vertexMetaInfo.setIndex( index );
        vertexMetaInfo.setLowLink( index );
        index++;
        s.push( vertex );

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `head`
in `src/main/java/org/apache/commons/graph/builder/DefaultHeadVertexConnector.java`
#### Snippet
```java
    public <H extends V> TailVertexConnector<V, E> from( H head )
    {
        head = checkNotNull( head, "Null head vertex not admitted" );
        return new DefaultTailVertexConnector<V, E>( graph, edge, head );
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningTreeSourceSelector.java`
#### Snippet
```java
    public <S extends V> SpanningTreeAlgorithmSelector<V, W, WE> fromSource( S source )
    {
        source = checkNotNull( source, "Spanning tree cannot be calculated without expressing the source vertex" );
        checkState( graph.containsVertex( source ), "Vertex %s does not exist in the Graph", source );
        return new DefaultSpanningTreeAlgorithmSelector<V, W, WE>( graph, weightedEdges, source );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `heuristic`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultHeuristicBuilder.java`
#### Snippet
```java
    public <H extends Heuristic<V, W>> WeightedPath<V, WE, W> withHeuristic( H heuristic )
    {
        heuristic = checkNotNull( heuristic, "A* algorithm can not be applied using a null heuristic" );

        // Cost from start along best known path.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightOperations`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingBidirectionalDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Bidirectional Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistancesForward = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightOperations`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> WeightedPath<V, WE, W> applyingDijkstra( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "Dijkstra algorithm can not be applied using null weight operations" );

        final ShortestDistances<V, W> shortestDistances = new ShortestDistances<V, W>( weightOperations );
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `weightOperations`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultShortestPathAlgorithmSelector.java`
#### Snippet
```java
    public <WO extends OrderedMonoid<W>> HeuristicBuilder<V, WE, W> applyingAStar( WO weightOperations )
    {
        weightOperations = checkNotNull( weightOperations, "A* algorithm can not be applied using null weight operations" );
        return new DefaultHeuristicBuilder<V, WE, W>( graph, weightedEdges, source, target, weightOperations );
    }
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'lock' in a Serializable class
in `src/main/java/org/apache/commons/graph/SynchronizedGraph.java`
#### Snippet
```java
    private static final long serialVersionUID = 4472623111635514693L;

    protected final Object lock;

    protected final Graph<V, E> g;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
        if ( target.equals( v ) )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/LongWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1 + s2;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/spanning/ReverseDeleteGraph.java`
#### Snippet
```java
            return edge;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/spanning/ReverseDeleteGraph.java`
#### Snippet
```java
            return graph.getVertices( e );
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/FloatWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1 + s2;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/BigDecimalWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1.add( s2 );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/spanning/ShortestEdges.java`
#### Snippet
```java
        if ( edge == null )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
        if ( isEmpty() )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
        if ( isEmpty() )
        {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/DoubleWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1 + s2;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/BigIntegerWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1.add( s2 );
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/visit/BaseGraphVisitHandler.java`
#### Snippet
```java
    public O onCompleted()
    {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/graph/weight/primitive/IntegerWeightBaseOperations.java`
#### Snippet
```java
        if ( s1 == null || s2 == null )
        {
            return null;
        }
        return s1 + s2;
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`stack.size() > 0` can be replaced with '!stack.isEmpty()'
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
        }

        while ( stack.size() > 0 )
        {
            // remove the last element from the expanded vertices list
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`untouchedVertices.size() > 0` can be replaced with '!untouchedVertices.isEmpty()'
in `src/main/java/org/apache/commons/graph/connectivity/DefaultConnectivityAlgorithmsSelector.java`
#### Snippet
```java
        final Collection<List<V>> connectedVertices = new LinkedList<List<V>>();

        while ( untouchedVertices.size() > 0 )
        {
            V source = untouchedVertices.remove( 0 );
```

## RuleId[ruleID=ConstantMathCall]
### RuleId[ruleID=ConstantMathCall]
Constant call to `sqrt()` can be simplified
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     * The <i>Phi</i> constant value.
     */
    private static final double LOG_PHI = log( ( 1 + sqrt( 5 ) ) / 2 );

    /**
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super W`
in `src/main/java/org/apache/commons/graph/spanning/WeightedEdgesComparator.java`
#### Snippet
```java
    private final Mapper<WE, W> weightedEdges;

    public WeightedEdgesComparator( Comparator<W> weightComparator, Mapper<WE, W> weightedEdges )
    {
        this.weightComparator = weightComparator;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WE`
in `src/main/java/org/apache/commons/graph/spanning/WeightedEdgesComparator.java`
#### Snippet
```java
    private final Mapper<WE, W> weightedEdges;

    public WeightedEdgesComparator( Comparator<W> weightComparator, Mapper<WE, W> weightedEdges )
    {
        this.weightComparator = weightComparator;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends W`
in `src/main/java/org/apache/commons/graph/spanning/WeightedEdgesComparator.java`
#### Snippet
```java
    private final Mapper<WE, W> weightedEdges;

    public WeightedEdgesComparator( Comparator<W> weightComparator, Mapper<WE, W> weightedEdges )
    {
        this.weightComparator = weightComparator;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WE`
in `src/main/java/org/apache/commons/graph/model/InMemoryWeightedPath.java`
#### Snippet
```java
     * @param weightedEdges
     */
    public InMemoryWeightedPath( V start, V target, Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        super( start, target );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends W`
in `src/main/java/org/apache/commons/graph/model/InMemoryWeightedPath.java`
#### Snippet
```java
     * @param weightedEdges
     */
    public InMemoryWeightedPath( V start, V target, Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        super( start, target );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WE`
in `src/main/java/org/apache/commons/graph/model/MutableSpanningTree.java`
#### Snippet
```java
     * @param weightedEdges
     */
    public MutableSpanningTree( Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends W`
in `src/main/java/org/apache/commons/graph/model/MutableSpanningTree.java`
#### Snippet
```java
     * @param weightedEdges
     */
    public MutableSpanningTree( Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WE`
in `src/main/java/org/apache/commons/graph/spanning/ReverseDeleteGraph.java`
#### Snippet
```java
    private final Collection<WE> visitedEdge;

    public ReverseDeleteGraph( Graph<V, WE> graph, Collection<WE> sortedEdge, Collection<WE> visitedEdge )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WE`
in `src/main/java/org/apache/commons/graph/spanning/ReverseDeleteGraph.java`
#### Snippet
```java
    private final Collection<WE> visitedEdge;

    public ReverseDeleteGraph( Graph<V, WE> graph, Collection<WE> sortedEdge, Collection<WE> visitedEdge )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/export/DotExporter.java`
#### Snippet
```java
    }

    private Map<V, Integer> generateVertexIdentifiers( Graph<V, E> graph )
    {
        Map<V, Integer> vertexIdentifiers = new HashMap<V, Integer>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WE`
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
     * @param weightComparator the comparator used to sort the weighted edges
     */
    public SuperVertex( final V source, final Graph<V, WE> graph, final WeightedEdgesComparator<W, WE> weightComparator )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
     * @param other the {@link SuperVertex} to be merged into this
     */
    public void merge( final SuperVertex<V, W, WE> other )
    {
        for ( final V v : other.vertices )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WE`
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
     * @param other the {@link SuperVertex} to be merged into this
     */
    public void merge( final SuperVertex<V, W, WE> other )
    {
        for ( final V v : other.vertices )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super W`
in `src/main/java/org/apache/commons/graph/shortestpath/ShortestDistances.java`
#### Snippet
```java
    private final OrderedMonoid<W> weightOperations;

    public ShortestDistances( OrderedMonoid<W> weightOperations )
    {
        this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super P`
in `src/main/java/org/apache/commons/graph/elo/DefaultKFactorBuilder.java`
#### Snippet
```java

    public DefaultKFactorBuilder( DirectedGraph<P, GameResult> tournamentGraph,
                                 PlayersRank<P> playerRanking )
    {
        this.tournamentGraph = tournamentGraph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super WE`
in `src/main/java/org/apache/commons/graph/flow/DefaultMaxFlowAlgorithmSelector.java`
#### Snippet
```java
        private final Mapper<WE, W> weightedEdges;

        public MapperWrapper( WO weightOperations, Mapper<WE, W> weightedEdges )
        {
            this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends W`
in `src/main/java/org/apache/commons/graph/flow/DefaultMaxFlowAlgorithmSelector.java`
#### Snippet
```java
        private final Mapper<WE, W> weightedEdges;

        public MapperWrapper( WO weightOperations, Mapper<WE, W> weightedEdges )
        {
            this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     *         less than, equal to, or greater than the second
     */
    private int compare( FibonacciHeapNode<E> o1, FibonacciHeapNode<E> o2 )
    {
        if ( comparator != null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
     *         less than, equal to, or greater than the second
     */
    private int compare( FibonacciHeapNode<E> o1, FibonacciHeapNode<E> o2 )
    {
        if ( comparator != null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
     */
    private void searchRecursive( final DirectedGraph<V, E> g, final V source,
                                  final Collection<V> coll, final Set<V> visited,
                                  final boolean forward )
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/scc/KosarajuSharirAlgorithm.java`
#### Snippet
```java
     */
    private void searchRecursive( final DirectedGraph<V, E> g, final V source,
                                  final Collection<V> coll, final Set<V> visited,
                                  final boolean forward )
    {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/builder/DefaultTailVertexConnector.java`
#### Snippet
```java
    private final V head;

    public DefaultTailVertexConnector( MutableGraph<V, E> graph, E edge, V head )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `src/main/java/org/apache/commons/graph/builder/DefaultTailVertexConnector.java`
#### Snippet
```java
    private final V head;

    public DefaultTailVertexConnector( MutableGraph<V, E> graph, E edge, V head )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/connectivity/DefaultConnectivityAlgorithmsSelector.java`
#### Snippet
```java
     * @param includedVertices included vertices
     */
    public DefaultConnectivityAlgorithmsSelector( Graph<V, E> graph, Iterable<V> includedVertices )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/shortestpath/PredecessorsList.java`
#### Snippet
```java
     * @return the weighted path related to source to target
     */
    public WeightedPath<V, WE, W> buildPath( V source, V touch, V target, PredecessorsList<V, WE, W> backwardsList ) {
        InMemoryWeightedPath<V, WE, W> path = new InMemoryWeightedPath<V, WE, W>( source, target, weightOperations, weightedEdges );

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/shortestpath/PredecessorsList.java`
#### Snippet
```java
    private final Map<V, V> predecessors = new HashMap<V, V>();

    public PredecessorsList( Graph<V, WE> graph, Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends WE`
in `src/main/java/org/apache/commons/graph/shortestpath/PredecessorsList.java`
#### Snippet
```java
    private final Map<V, V> predecessors = new HashMap<V, V>();

    public PredecessorsList( Graph<V, WE> graph, Monoid<W> weightOperations, Mapper<WE, W> weightedEdges )
    {
        this.graph = graph;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
     * @return the result of {@link GraphVisitHandler#onCompleted()}
     */
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
     * @return the result of {@link GraphVisitHandler#onCompleted()}
     */
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super G`
in `src/main/java/org/apache/commons/graph/visit/DefaultVisitAlgorithmsSelector.java`
#### Snippet
```java
     * @return the result of {@link GraphVisitHandler#onCompleted()}
     */
    private <O> O applyingSearch( GraphVisitHandler<V, E, G, O> handler, boolean enqueue )
    {
        handler = checkNotNull( handler, "Graph visitor handler can not be null." );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends W`
in `src/main/java/org/apache/commons/graph/shortestpath/AllVertexPairsShortestPath.java`
#### Snippet
```java
     * Constructor visible only inside the package
     */
    AllVertexPairsShortestPath( OrderedMonoid<W> weightOperations )
    {
        this.weightOperations = weightOperations;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    }

    private void pathReconstruction( PredecessorsList<V, WE, W> path,
                                     V source, V target,
                                     Map<VertexPair<V>, V> next )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/shortestpath/DefaultPathSourceSelector.java`
#### Snippet
```java
    private void pathReconstruction( PredecessorsList<V, WE, W> path,
                                     V source, V target,
                                     Map<VertexPair<V>, V> next )
    {
        V k = next.get( new VertexPair<V>( source, target ) );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/SynchronizedMutableGraph.java`
#### Snippet
```java
     * @param g The {@link Graph} that has to be synchronized
     */
    public SynchronizedMutableGraph( MutableGraph<V, E> g )
    {
        super( g );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `src/main/java/org/apache/commons/graph/SynchronizedMutableGraph.java`
#### Snippet
```java
     * @param g The {@link Graph} that has to be synchronized
     */
    public SynchronizedMutableGraph( MutableGraph<V, E> g )
    {
        super( g );
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     * @return true if there is a valid coloring for the graph, false otherwise.
     */
    private boolean backtraking( int currentVertexIndex, List<V> verticesList, ColoredVertices<V, C> coloredVertices )
    {
        if ( currentVertexIndex != -1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     * @return
     */
    private boolean isThereColorConflict( V currentVertex, ColoredVertices<V, C> coloredVertices )
    {
        if ( currentVertex == null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends C`
in `src/main/java/org/apache/commons/graph/coloring/DefaultColoringAlgorithmsSelector.java`
#### Snippet
```java
     * @return
     */
    private boolean isThereColorConflict( V currentVertex, ColoredVertices<V, C> coloredVertices )
    {
        if ( currentVertex == null )
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
    private static <V, E> void strongConnect( DirectedGraph<V, E> graph,
                                                                          V vertex,
                                                                          Map<V, TarjanVertexMetaInfo> verticesMetaInfo,
                                                                          Stack<V> s,
                                                                          Set<V> stronglyConnectedComponent,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super V`
in `src/main/java/org/apache/commons/graph/scc/TarjanAlgorithm.java`
#### Snippet
```java
                                                                          Map<V, TarjanVertexMetaInfo> verticesMetaInfo,
                                                                          Stack<V> s,
                                                                          Set<V> stronglyConnectedComponent,
                                                                          Integer index )
    {
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
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

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `components.size() == 1` is always `false` when reached
in `src/main/java/org/apache/commons/graph/spanning/DefaultSpanningTreeAlgorithmSelector.java`
#### Snippet
```java
            // if there is no edge anymore for a component, and there is still more than 1 component,
            // the graph is unconnected
            checkState( !edges.isEmpty() || components.size() == 1, "unconnected graph" );

            for ( final WE edge : edges )
```

### RuleId[ruleID=ConstantValue]
Condition `x != null` is always `true`
in `src/main/java/org/apache/commons/graph/collections/FibonacciHeap.java`
#### Snippet
```java
        FibonacciHeapNode<E> x = minimumNode;

        if ( x != null )
        {
            numRoots++;
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=UseBulkOperation]
### RuleId[ruleID=UseBulkOperation]
Iteration can be replaced with bulk 'Collection.addAll()' call
in `src/main/java/org/apache/commons/graph/spanning/SuperVertex.java`
#### Snippet
```java
        for ( final V v : other.vertices )
        {
            vertices.add( v );
        }

```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/graph/model/InMemoryPath.java`
#### Snippet
```java
                       "Impossible to get the degree of input vertex; %s not contained in this path", v );

        @SuppressWarnings( "unchecked" ) // type driven by input type
        List<V> connected = asList( successors.get( v ) );
        return connected;
    }
```

