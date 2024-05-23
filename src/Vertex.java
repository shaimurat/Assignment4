import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacent_vertices;
    public Vertex(){}
    public Vertex(V data){
        this.data = data;
    }
    public Map<Vertex<V>, Double> getAdjacent_vertices() {
        return adjacent_vertices;
    }
    public void addAdjacentVertex(Vertex<V> destination, double weight){
        adjacent_vertices.put(destination,weight);
    }
}
