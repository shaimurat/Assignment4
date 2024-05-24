public class DepthFirstSearch<V> extends Search<V> {
    public DepthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        dfs(graph, source);
    }

    private void dfs(MyGraph<V> graph, V curr) {
        marked.add(curr);
        for (V vertex : graph.getAdjacent_vertices()) {
            if (!marked.contains(vertex)) {
                edgeTo.put(vertex, curr);
                dfs(graph, vertex);
            }
        }
    }
}