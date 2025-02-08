package DataStructure.graph;


// Undirected Graph
// Find Graph is Cyclic or Not
// DFS Based Solution
public class Lab12 {

    private static boolean isCyclic(UndirectedGraph undirectedGraph) {

        boolean[] visited = new boolean[undirectedGraph.vertex];

        for (int i = 0; i < undirectedGraph.vertex; i++) {
            if(!visited[i]){
                if(dfs(undirectedGraph, visited, i, -1)){
                    return true;
            }
        }
    }
        return false;
    }
    private static boolean dfs(UndirectedGraph graph, boolean[] visited, int currentVertex, int parent) {

        visited[currentVertex] = true;

        for (int vertex : graph.adjList.get(currentVertex)) {
            if (!visited[vertex]) {
                if (dfs(graph, visited, vertex, currentVertex))
                    return true;
            }
                else if(vertex != parent)
                    return true;
        }
        return false;
    }
    public static void main(String[] args) {

        UndirectedGraph graph = new UndirectedGraph(5);
            graph.addEdges(0,1);
            graph.addEdges(1,2);
            graph.addEdges(1,3);
            graph.addEdges(2,3);
            graph.addEdges(2,4);
        graph.addEdges(4,3);


        boolean result = isCyclic(graph);
            System.out.println(result);

    }

}
