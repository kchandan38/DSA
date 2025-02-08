package DataStructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

//Input Undirected Disconnected Graph (Cyclic or Acyclic)
//DFS (Depth First Search) Traversal
class MyGraph7 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public MyGraph7(int vertex) {
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

    public void dfsDisconnected(int sourceVertex) {

        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if(!visited[i])
                dfs(i, visited);
        }
    }
    public void dfs(int myVertex, boolean[] visited){
        visited[myVertex] = true;
        System.out.print(myVertex + "\t");
        for (int vertex: adjList.get(myVertex)) {
            if(!visited[vertex]){
               dfs(vertex, visited); //recursion
            }
        }
    }
}
public class Lab7 {

    public static void main(String[] args) {

        MyGraph7 myGraph = new MyGraph7(8);
        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);

        myGraph.addEdges(1,2);

        myGraph.addEdges(3,4);

        myGraph.addEdges(5,6);
        myGraph.addEdges(5,7);

        myGraph.dfsDisconnected(5);

    }
}
