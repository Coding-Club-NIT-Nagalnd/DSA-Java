import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        /**
         * Initialize an empty graph.
         */
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        /**
         * Add a vertex to the graph.
         *
         * @param vertex The vertex to be added.
         */
        // pass
    }

    public void addEdge(int vertex1, int vertex2) {
        /**
         * Add an edge between two vertices in the graph.
         *
         * @param vertex1 The first vertex.
         * @param vertex2 The second vertex.
         */
        // pass
    }

    public List<Integer> getNeighbors(int vertex) {
        /**
         * Get the neighbors of a vertex.
         *
         * @param vertex The vertex to get neighbors for.
         * @return A list of neighboring vertices.
         */
        // pass
        return new ArrayList<>();
    }

    public void depthFirstSearch(int startVertex) {
        /**
         * Perform a depth-first search (DFS) starting from a vertex.
         *
         * @param startVertex The vertex to start the DFS from.
         */
        // pass
    }

    public void breadthFirstSearch(int startVertex) {
        /**
         * Perform a breadth-first search (BFS) starting from a vertex.
         *
         * @param startVertex The vertex to start the BFS from.
         */
        // pass
    }
}