package com.datastructure.graph.labs;

// Weighted directed graph
// Find topological ordering/sorting of DAG
// BFS based solution (Kahn's Algorithm)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Lab16 {

    private static ArrayList<Integer> topologicalOrder(DirectedGraph directedGraph) {

        int[] inDegrees = new int[directedGraph.vertex];

        ArrayList<Integer> topOrder = new ArrayList<>();

        //Step1 Count the In degree of all the vertices
        for (int i = 0; i < inDegrees.length; i++) {
            for (AdjacencyNode adjacencyNode : directedGraph.arrayList.get(i)) {
                inDegrees[adjacencyNode.destinationNode]++;
            }
        }
        // Step2 Create Queue
        Queue<Integer> myqueue = new LinkedList<>();

        //Step3: Add Zero In degree vertices to queue
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0)
                myqueue.add(i);
        }
        // Step 4: When queue is not empty
        while (!myqueue.isEmpty()) {

            int currentVertex = myqueue.poll();
            topOrder.add(currentVertex);

            for (AdjacencyNode adjacencyNode : directedGraph.arrayList.get(currentVertex)) {
                inDegrees[adjacencyNode.destinationNode]--;
                if (inDegrees[adjacencyNode.destinationNode] == 0)
                    myqueue.add(adjacencyNode.destinationNode);
            }
        }
        return topOrder;
    }
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(6);
        graph.addNodeAndEdges(0,1,2);
        graph.addNodeAndEdges(0,4,1);

        graph.addNodeAndEdges(1,2,3);
        graph.addNodeAndEdges(4,2,2);

        graph.addNodeAndEdges(2,3,6);
        graph.addNodeAndEdges(4,5,4);
        graph.addNodeAndEdges(5,3,1);

        graph.printGraph();

        ArrayList<Integer> topOrder = topologicalOrder(graph);
        System.out.println(topOrder);
    }
}
