package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Input Undirected Disconnected Graph (Cyclic or Acyclic) with Source Vertex
//Example of BFS (Breath First Search) Traversal
class MyGraph4 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph4(int vertex) {
        this.vertex = vertex;
        this.adjList = new ArrayList<>(vertex);

        for (int i = 0; i < vertex; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEdges(int vertex1, int vertex2) {
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
    }

    public void bfsDisconnected() {
        boolean[] visited = new boolean[vertex];

        for (int i = 0; i < vertex; i++) {
            if(!visited[i])
                bfs(i, visited);
        }
    }
    public void bfs(int sourceVertex, boolean[] visited){
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(sourceVertex);
        visited[sourceVertex] = true;

        while (!myQueue.isEmpty()){
            int myVertex = myQueue.poll();
            System.out.print(myVertex + "\t");

            for (int vertex: adjList.get(myVertex)) {
                if(!visited[vertex]){
                    myQueue.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
        System.out.println();
    }
}
public class Lab4 {

    public static void main(String[] args) {

        MyGraph4 myGraph = new MyGraph4(8);

        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);

        myGraph.addEdges(1,2);

        myGraph.addEdges(3,4);

        myGraph.addEdges(5,6);
        myGraph.addEdges(5,7);

        myGraph.bfsDisconnected();

    }
}
