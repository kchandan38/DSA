package DataStructure.graph;

import java.util.LinkedList;
import java.util.Queue;

// Directed Acyclic Graph (DAG)
// Find Topological Ordering/Sorting of DAG
// BFS based solution. (Kahn's Algorithm)

public class Lab10 {
    private static void topologicalOrder(DirectedGraph directedGraph) {
        int[] inDegrees = new int[directedGraph.vertex];

        // Count the In degree of all the vertices
        for (int i = 0; i < inDegrees.length; i++) {
            for (int vertex : directedGraph.adjList.get(i)) {
                inDegrees[vertex]++;
            }
        }
        Queue<Integer> myqueue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0)
                myqueue.add(i);
        }
        while (!myqueue.isEmpty()) {
            int currentVertex = myqueue.poll();
            System.out.println(currentVertex);

            for (int vertex : directedGraph.adjList.get(currentVertex)) {
                inDegrees[vertex]--;
                if (inDegrees[vertex] == 0)
                    myqueue.add(vertex);
            }
        }
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