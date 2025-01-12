package com.datastructure.graph.minimumspinningtree;

import java.util.Arrays;
import java.util.PriorityQueue;

// Given either DAG or Un directed Graph and weighted Graph
// Given source vertex
// Find the shorted path from to source to all other Vertices
public class Lab20 {

    public static int prims(MyGraph mygraph, int sourceVertex){

       return 0;
    }

    public static void main(String[] args) {

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


        int distance = prims(myGraph, 0);

        myGraph.printGraph();

    }
}
//Time Complexity = O(V+E)