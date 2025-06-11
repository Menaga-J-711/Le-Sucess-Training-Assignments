import java.util.*;

public class RatInMaze {

    public static List<String> findPaths(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return result; // no path if start or end is blocked

        boolean[][] visited = new boolean[n][n];
        dfs(0, 0, "", maze, visited, result, n);
        return result;
    }

    private static void dfs(int row, int col, String path, int[][] maze,
                            boolean[][] visited, List<String> result, int n) {
        // If destination is reached
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Possible directions and their row/col changes
        int[] dx = {1, 0, 0, -1};  // D, L, R, U
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        for (int i = 0; i < 4; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];

            if (isSafe(newRow, newCol, maze, visited, n)) {
                dfs(newRow, newCol, path + dir[i], maze, visited, result, n);
            }
        }

        // Backtrack
        visited[row][col] = false;
    }

    private static boolean isSafe(int row, int col, int[][] maze, boolean[][] visited, int n) {
        return row >= 0 && col >= 0 && row < n && col < n &&
               maze[row][col] == 1 && !visited[row][col];
    }

    // Test
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = 4;

        List<String> paths = findPaths(maze, n);
        System.out.println(paths);
    }
}
