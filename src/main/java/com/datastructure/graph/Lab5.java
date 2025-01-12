package com.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Input Undirected Disconnected Graph (Cyclic or Acyclic) with Source Vertex
//Count the Islands in disconnected graph
class MyGraph5 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph5(int vertex) {
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

    public int bfsDisconnected() {
        boolean[] visited = new boolean[vertex];

        int count= 0;
        for (int i = 0; i < vertex; i++) {
            if(!visited[i]) {
                bfs(i, visited);
                count++;
            }
        }
        return count;
    }
    public void bfs(int sourceVertex, boolean[] visited){
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(sourceVertex);
        visited[sourceVertex] = true;

        while (!myQueue.isEmpty()){
            int myVertex = myQueue.poll();
            for (int vertex: adjList.get(myVertex)) {
                if(!visited[vertex]){
                    myQueue.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
    }
}
public class Lab5 {

    public static void main(String[] args) {

        MyGraph5 myGraph = new MyGraph5(12);

        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);

        myGraph.addEdges(1,2);

        myGraph.addEdges(3,4);

        myGraph.addEdges(5,6);
        myGraph.addEdges(5,7);

        myGraph.addEdges(8,9);
        myGraph.addEdges(8,11);
        myGraph.addEdges(9,10);
        myGraph.addEdges(11,10);


        int islandCount = myGraph.bfsDisconnected();
        System.out.println(islandCount);

    }
}
