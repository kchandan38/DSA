package DataStructure.graph;
import java.util.Stack;

// Directed Acyclic Graph (DAG)
// Find Topological Ordering/Sorting of DAG
// DFS based solution

public class Lab11 {
    private static void topologicalOrder(DirectedGraph directedGraph) {

        boolean[] visited = new boolean[directedGraph.vertex];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < directedGraph.vertex; i++) {
            if (!visited[i])
                dfs(directedGraph, stack, visited, i);
        }
        //To print the stack values
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    private static void dfs(DirectedGraph directedGraph, Stack<Integer> stack, boolean[] visited, int source) {

        visited[source] = true;
        for (int vertex : directedGraph.adjList.get(source)) {

            if (!visited[vertex])
                dfs(directedGraph, stack, visited, vertex);
        }
        stack.push(source);
    }

    public static void main(String[] args) {

        DirectedGraph directedGraph = new DirectedGraph(5);

        directedGraph.addEdges(0, 2);
        directedGraph.addEdges(0, 3);

        directedGraph.addEdges(1, 3);
        directedGraph.addEdges(1, 4);

        directedGraph.addEdges(2, 3);

        topologicalOrder(directedGraph);

    }
}