package com.datastructure.graph.dijkstras;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// Given either DAG or Un directed Graph and weighted Graph
// Given source vertex
// Find the shorted path from to source to all other Vertices
public class Lab18 {

    public static int[] dijkstraPath(MyGraph mygraph, int sourceVertex){

        // Step1: Define Distance Array With Max
        int[] distance = new int[mygraph.vertex];
        Arrays.fill(distance, Integer.MAX_VALUE);

        // Step2: Create Priority Queue
        PriorityQueue<AdjacentNode> myqueue = new PriorityQueue<>(Comparator.comparingInt(v -> v.weight));

        // Step3: Initialize source vertex to zero
        distance[sourceVertex] = 0;

        // Step4: Add Source Vertex weight
        myqueue.add(new AdjacentNode(sourceVertex, sourceVertex,0));

        // Step5:
        while (!myqueue.isEmpty()){
            AdjacentNode vertex = myqueue.poll();
            for (AdjacentNode adjacentNode: mygraph.arrayList.get(vertex.destinationNode)) {
                int vertex1 = vertex.destinationNode;
                int vertex2 = adjacentNode.destinationNode;
                int weight = adjacentNode.weight;
                if (distance[vertex2] > distance[vertex1] + weight) {
                    distance[vertex2] = distance[vertex1] + weight;
                    myqueue.add(new AdjacentNode(vertex2,vertex2,distance[vertex2]));
                }
            }
        }return distance;
    }

    public static void main(String[] args) {

//        MyGraph myGraph = new MyGraph(4);
//        myGraph.addNodeAndWeights(0, 1, 5);
//        myGraph.addNodeAndWeights(0, 2, 10);
//
//        myGraph.addNodeAndWeights(1, 0, 5);
//        myGraph.addNodeAndWeights(1, 2, 3);
//        myGraph.addNodeAndWeights(1, 3, 20);
//
//        myGraph.addNodeAndWeights(2, 0, 10);
//        myGraph.addNodeAndWeights(2, 1, 3);
//        myGraph.addNodeAndWeights(2, 3, 2);
//
//        myGraph.addNodeAndWeights(3, 1, 20);
//        myGraph.addNodeAndWeights(3, 2, 2);

        MyGraph myGraph = new MyGraph(6);
        myGraph.addNodeAndWeights(0, 1, 1);
        myGraph.addNodeAndWeights(0, 2, 10);

        myGraph.addNodeAndWeights(1, 0, 1);
        myGraph.addNodeAndWeights(1, 3, 20);
        myGraph.addNodeAndWeights(1, 4, 5);

        myGraph.addNodeAndWeights(2, 0, 10);
        myGraph.addNodeAndWeights(2, 3, 20);

        myGraph.addNodeAndWeights(3, 1, 20);
        myGraph.addNodeAndWeights(3, 2, 20);

        myGraph.addNodeAndWeights(4, 1, 5);
        myGraph.addNodeAndWeights(4, 5, 2);

        myGraph.addNodeAndWeights(5, 3, 15);
        myGraph.addNodeAndWeights(3, 4, 2);


        int[] distance = dijkstraPath(myGraph, 0);

        for (int a: distance)
            System.out.println(a);
    }
}
//Time Complexity = O(V+E)