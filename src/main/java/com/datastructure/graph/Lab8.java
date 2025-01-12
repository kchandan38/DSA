package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

//Input Undirected Disconnected Graph (Cyclic or Acyclic)
//DFS (Depth First Search) Traversal
class MyGraph8 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph8(int vertex) {
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

    public int dfsDisconnected(int sourceVertex) {

        boolean[] visited = new boolean[vertex];
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if(!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int myVertex, boolean[] visited){
        visited[myVertex] = true;
        for (int vertex: adjList.get(myVertex)) {
            if(!visited[vertex]){
               dfs(vertex, visited); //recursion
            }
        }
    }
}
public class Lab8 {

    public static void main(String[] args) {

        MyGraph8 myGraph = new MyGraph8(8);
        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);

        myGraph.addEdges(1,2);

        myGraph.addEdges(3,4);

        myGraph.addEdges(5,6);
        myGraph.addEdges(5,7);

        System.out.println(myGraph.dfsDisconnected(5));

    }
}
