package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

//DirectedGraph Using Adjacency List
class DirectedGraph {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public DirectedGraph(int vertex) {
        this.vertex = vertex;
        this.adjList = new ArrayList<>(vertex);

        for (int i = 0; i < vertex; i++) {
            adjList.add(new LinkedList<>());
        }
    }
    public void addEdges(int vertex1, int vertex2) {
        adjList.get(vertex1).add(vertex2);
    }
}
