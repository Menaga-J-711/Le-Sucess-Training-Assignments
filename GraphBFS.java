import java.util.*;

public class GraphBFS {
    public static List<Integer> bfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V]; // To mark visited nodes
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from node 0
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();     // Dequeue front node
            bfs.add(node);              // Add to traversal list

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);       // Enqueue unvisited neighbors
                    visited[neighbor] = true;  // Mark as visited
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(4);

        adj.get(3).add(1);
        adj.get(3).add(4);

        adj.get(4).add(2);
        adj.get(4).add(3);

        // Run BFS
        List<Integer> result = bfsTraversal(V, adj);
        System.out.println("BFS Traversal: " + result);
    }
}
