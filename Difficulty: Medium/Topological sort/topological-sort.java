//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edges = Integer.parseInt(st[0]);
            int vertices = Integer.parseInt(st[1]);

            for (int i = 0; i < vertices; i++) adj.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edges; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
            }

            ArrayList<Integer> res = new Solution().topologicalSort(adj);

            if (check(adj, vertices, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        int[] visited = new int[v];
        Stack<Integer> stack = new Stack<>();
        
        // Perform DFS for all unvisited nodes
        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, stack, adj);
            }
        }

        // Convert the stack to an ArrayList (reversing the order)
        ArrayList<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        
        return result;
    }
    private static void dfs(int node, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = 1;
        
        // Explore neighbors
        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 0) {
                dfs(neighbor, visited, stack, adj);
            }
        }
        
        // Push node to stack after processing all neighbors
        stack.push(node);
    }
}
