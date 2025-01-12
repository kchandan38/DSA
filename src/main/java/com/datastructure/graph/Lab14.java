package com.datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;

// Directed Acyclic Graph (DAG)
// Check Graph is Cyclic or not
// BFS based solution. (Kahn's Algorithm)

public class Lab14 {
    private static boolean isCyclic(DirectedGraph directedGraph) {
        int[] inDegrees = new int[directedGraph.vertex];

        //Step1: Find In degree of all the vertices
        for (int i = 0; i < inDegrees.length; i++) {
            for (int vertex : directedGraph.adjList.get(i)) {
                inDegrees[vertex]++;
            }
        }
        // Step2: Create the Queue
        Queue<Integer> myqueue = new LinkedList<>();

        //Step3: Ass Zero In degree Vertices to Queue
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0)
                myqueue.add(i);
        }
        //Step4: Take the Counter
        int counter = 0;

        // Step5: Fetch the adjacent list from queue value and decrease
        // the In degree and add the value in queue whose degree is zero
        while (!myqueue.isEmpty()) {
            int currentVertex = myqueue.poll();
            for (int vertex : directedGraph.adjList.get(currentVertex)) {
                inDegrees[vertex]--;
                if (inDegrees[vertex] == 0)
                    myqueue.add(vertex);
            }
            counter++;
        }
        return directedGraph.vertex!=counter;
    }

public static void main(String[] args) {

    DirectedGraph directedGraph = new DirectedGraph(5);

    directedGraph.addEdges(0, 2);
    directedGraph.addEdges(3, 0);

    directedGraph.addEdges(1, 3);
    directedGraph.addEdges(1, 4);

    directedGraph.addEdges(2, 3);

    boolean flag = isCyclic(directedGraph);
    System.out.println(flag);

}
}