import java.util.*;
class Solution {
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        
        int V = adj.size();           
        boolean visited[] = new boolean[V];
        
        ArrayList<Integer> result = new ArrayList<>();
        dfsHelper(0, adj, visited, result); 
        
        return result;
    }
 
    public void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> result) {
        
        visited[node] = true;      
        result.add(node);        
        for (int i = 0; i < adj.get(node).size(); i++) {
            int neighbour = adj.get(node).get(i);
            
            if (!visited[neighbour]) {
                dfsHelper(neighbour, adj, visited, result);
            }
        }
    }
}
