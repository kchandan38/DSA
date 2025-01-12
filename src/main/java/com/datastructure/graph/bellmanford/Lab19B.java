package com.datastructure.graph.bellmanford;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given either DAG or Un directed Graph and weighted Graph
// Given source vertex
// Find the shorted path from to source to all other Vertices
public class Lab19B {

    public static Map<Integer, Integer>  bellmanFord(MyGraph mygraph, int sourceVertex){

        // Step1: Define Distance Array With Max

        Map<Integer, Integer> distance = new HashMap<>();
        for (int i = 0; i < mygraph.vertex; i++) {
            distance.put(i,Integer.MAX_VALUE);
        }
        // Step2: Initialize node and source vertex to zero
        distance.put(0,0);

        // Step3:
        for (int i = 1; i < mygraph.vertex; i++) {
            for (MyEdge myEdge: mygraph.edgeList) {
                int vertex1 = myEdge.sourceVertex;
                int vertex2 = myEdge.destinationVertex;
                int weight = myEdge.weight;
                if (distance.get(vertex2) > distance.get(vertex1) + weight) {
                    distance.put(vertex2, distance.get(vertex1) + weight);
                }
            }
        }return distance;
    }

    public static void main(String[] args) {

//        MyGraph myGraph = new MyGraph(4);
//        myGraph.addNodeAndWeights(0, 1, 5);
//        myGraph.addNodeAndWeights(0, 2, 1);
//
//        myGraph.addNodeAndWeights(1, 0, 5);
//        myGraph.addNodeAndWeights(1, 2, 3);
//        myGraph.addNodeAndWeights(1, 3, 1);
//
//        myGraph.addNodeAndWeights(2, 0, 1);
//        myGraph.addNodeAndWeights(2, 1, 3);
//        myGraph.addNodeAndWeights(2, 3, 2);
//
//        myGraph.addNodeAndWeights(3, 1, 1);
//        myGraph.addNodeAndWeights(3, 2, 0);

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

        Map<Integer, Integer> distance = bellmanFord(myGraph, 0);

        for (Map.Entry<Integer, Integer> map:distance.entrySet()) {
            System.out.println("Node = "+ map.getKey() +"\t Cost = " + map.getValue() );
        }
    }
}

//Time Complexity = O(V*E)