package DataStructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

class UndirectedGraph {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList;

    public UndirectedGraph(int vertex) {
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

    public void printData() {

        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " => ");
            for (int edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }

    }
}

