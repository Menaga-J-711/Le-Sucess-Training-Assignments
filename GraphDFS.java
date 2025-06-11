import java.util.*;

public class GraphDFS {

    public static void dfsTraversal(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsTraversal(neighbor, visited, adj, dfs); // Recursive DFS call
            }
        }
    }

    public static List<Integer> startDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsTraversal(0, visited, adj, dfs); // Start DFS from vertex 0
        return dfs;
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

        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);

        adj.get(3).add(2);

        adj.get(4).add(2);

        // Run DFS
        List<Integer> result = startDFS(V, adj);
        System.out.println("DFS Traversal: " + result);
    }
}
