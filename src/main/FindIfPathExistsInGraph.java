package main;

import java.util.*;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        Stack<Integer> stack = new Stack();
        boolean[] visited = new boolean[n];
        //Set<Integer> set = new HashSet<>();
        for(int i=0; i<n;i++) {
            graph.put(i,new ArrayList());
        }

        for(int[]edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        stack.push(source);

        while(!stack.isEmpty()) {
            int current = stack.pop();

            if(!visited[current]) {
                visited[current] = true;
            }else{
                continue;
            }

            //if(!set.contains(current)) {
            //    set.add(current);
            //} else {
            //    continue;
            //}

            if(current == destination ){return true;}

            for(var neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }

        return false;
    }
}
