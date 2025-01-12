package com.datastructure.graph.labs;

// DAG and weighted Graph
// Given Source Vertex
// Find the shortest path from Source vertex to all other vertices


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lab17 {

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

    public static int[] shortestPaths(DirectedGraph directedGraph, int sourceNode) {

        // Step1: Define Distance Array with Max Value
        int[] distance = new int[directedGraph.vertex];
        Arrays.fill(distance, Integer.MAX_VALUE);

        //Step2: Initialize  Source Distance to Zero
        distance[sourceNode] = 0;

        // Step3: Find Top Logical Order of Graph
        ArrayList<Integer> topOrder = topologicalOrder(directedGraph);

        //Step4: For each vertex in Top logical Order
        for (int sourceVertex : topOrder) {
            for (AdjacencyNode adjacencyNode : directedGraph.arrayList.get(sourceVertex)) {
                if (distance[adjacencyNode.destinationNode] > distance[sourceVertex] + adjacencyNode.weight)
                    distance[adjacencyNode.destinationNode] = distance[sourceVertex] + adjacencyNode.weight;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(6);
        graph.addNodeAndEdges(0, 1, 2);
        graph.addNodeAndEdges(0, 4, 1);

        graph.addNodeAndEdges(1, 2, 3);
        graph.addNodeAndEdges(4, 2, 2);

        graph.addNodeAndEdges(2, 3, 6);
        graph.addNodeAndEdges(4, 5, 4);
        graph.addNodeAndEdges(5, 3, 1);

        //graph.printGraph();
        int[] distance = shortestPaths(graph, 0);

        for (int j : distance) {
            System.out.print(j + "\t");
        }
    }
}

// Time Complexity = O(V+E)
