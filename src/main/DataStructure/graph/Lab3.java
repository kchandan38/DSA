package DataStructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Input Undirected Connected Graph (Cyclic or Acyclic) with Source Vertex
//Example of BFS (Breath First Search) Traversal
class MyGraph3 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph3(int vertex) {
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

    public void printData(){

        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i +" => ");
            for (int edge:adjList.get(i)) {
                System.out.print(edge +" ");
            }
            System.out.println();
        }

    }
    public void bfsConnected(int sourceVertex) {

        boolean[] visited = new boolean[vertex];
        bfs(sourceVertex, visited);
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
    }
}
public class Lab3 {

    public static void main(String[] args) {

        MyGraph3 myGraph = new MyGraph3(4);
        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);
        myGraph.addEdges(1,3);
        myGraph.addEdges(2,3);

        myGraph.printData();

        myGraph.bfsConnected(3);

    }
}
