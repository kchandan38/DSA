package com.datastructure.graph.labs;

// Implement weighted directed graph

public class Lab15 {

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
    }
}
