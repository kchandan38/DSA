package com.datastructure.graph;

//UndirectedGraph Using Adjacency List

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Shorted Path - Unweighted Graph
// Undirected Graph and Source Vertex
// Find shorted paths from given Vertex to all other Vertices.
// BFS based solution. (Breadth First Search)

public class Lab9 {
    private static void findShortedPath(UndirectedGraph undirectedGraph, int source){
        int[] distance = new int[undirectedGraph.vertex];
        //Arrays.fill(distance, Integer.MAX_VALUE);

        Queue<Integer> myqueue = new LinkedList<>();
        boolean[] visited = new boolean[undirectedGraph.vertex];

        distance[source] = 0;
        visited[source] = true;
        myqueue.add(source);

        while (!myqueue.isEmpty()){
            int currentVertex = myqueue.poll();
            for (int vertex:undirectedGraph.adjList.get(currentVertex)) {

                if(!visited[vertex]){
                    distance[vertex] = distance[currentVertex]+1;
                    visited[vertex] = true;
                    myqueue.add(vertex);
                }
            }
        }
        for (int j : distance) {
            System.out.print(j + "\t");
        }
    }

    public static void main(String[] args) {

        UndirectedGraph undirectedGraph = new UndirectedGraph(5);

        undirectedGraph.addEdges(0, 1);
        undirectedGraph.addEdges(0, 2);

        undirectedGraph.addEdges(1, 2);
        undirectedGraph.addEdges(1, 3);

        undirectedGraph.addEdges(2, 3);
       // undirectedGraph.addEdges(2, 4);

        undirectedGraph.addEdges(3, 4);
        //undirectedGraph.printData();
        findShortedPath(undirectedGraph,0);
        System.out.println("\n-----------------------");
        findShortedPath(undirectedGraph,1);
        System.out.println("\n-----------------------");
        findShortedPath(undirectedGraph,2);
    }

}