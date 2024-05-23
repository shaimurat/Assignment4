import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V>{
    private final boolean undirected;
    private final Map<V, Vertex<V>> map = new HashMap<>();

    public WeightedGraph() {
        this.undirected = true;
    }
    public WeightedGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(V vert) {
        map.put(vert, new Vertex<>(vert));
    }

    public void addEdge(V source, V dest) {
        if (!hasVertex(source)){
            addVertex((source));
        }

        if (!hasVertex(dest))
            addVertex(dest);

        if (hasEdge(source, dest)
                || source.equals(dest))
            return; // reject parallels & self-loops

        map.get(source).add(dest);

        if (undirected)
            map.get(dest).add(source);
    }

    public int getVerticesCount() {
        return map.size();
    }

    public int getEdgesCount() {
        int count = 0;
        for (Vertex v : map.keySet()) {
            count += map.get(v).size();
        }

        if (undirected)
            count /= 2;

        return count;
    }


    public boolean hasVertex(V v) {
        return map.containsKey(v);
    }

    public boolean hasEdge(Vertex source, Vertex dest) {
        if (!hasVertex(source)) return false;
        return map.get(source).contains(dest);
    }

    public List<Vertex> adjacencyList(Vertex v) {
        if (!hasVertex(v)) return null;

        return map.get(v);
    }

    public abstract void addEdge(Vertex source, Vertex dest, double weight);
}