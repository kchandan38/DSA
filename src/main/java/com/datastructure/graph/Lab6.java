package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Input Undirected Connected Graph (Cyclic or Acyclic) with Source Vertex
//DFS (Depth First Search) Traversal
class MyGraph6 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph6(int vertex) {
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

    public void dfsConnected(int sourceVertex) {

        boolean[] visited = new boolean[vertex];
        dfs(sourceVertex, visited);
    }
    public void dfs(int myVertex, boolean[] visited){
        visited[myVertex] = true;
        System.out.println(myVertex + "\t");
        for (int vertex: adjList.get(myVertex)) {
            if(!visited[vertex]){
               dfs(vertex, visited); //recursion
            }
        }
    }
}
public class Lab6 {

    public static void main(String[] args) {

        MyGraph6 myGraph = new MyGraph6(6);
        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);

        myGraph.addEdges(1,3);
        myGraph.addEdges(1,5);

        myGraph.addEdges(2,3);
        myGraph.addEdges(2,4);

        myGraph.addEdges(3,4);

        myGraph.addEdges(4,5);

        myGraph.dfsConnected(5);

    }
}
