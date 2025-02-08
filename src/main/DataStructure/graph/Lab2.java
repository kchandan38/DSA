package DataStructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;

//Implementation of Directed Graph Using Adjacency List
class MyGraph2 {
    int vertex;
    ArrayList<LinkedList<Integer>> adjList = null;

    public MyGraph2(int vertex) {
        this.vertex = vertex;
        this.adjList = new ArrayList<>(vertex);

        for (int i = 0; i < vertex; i++) {
            adjList.add(new LinkedList<Integer>());
        }
    }

    public void addEdges(int vertex1, int vertex2) {
        adjList.get(vertex1).add(vertex2);
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

}
    public class Lab2 {

        public static void main(String[] args) {

            MyGraph2 myGraph = new MyGraph2(6);

        myGraph.addEdges(0,1);
        myGraph.addEdges(0,2);
        myGraph.addEdges(0,5);

        myGraph.addEdges(1,2);
        myGraph.addEdges(1,5);

        myGraph.addEdges(2,3);
        myGraph.addEdges(2,4);

        myGraph.addEdges(3,4);
        myGraph.addEdges(3,5);

        myGraph.addEdges(4,5);
        myGraph.addEdges(5,2);

        myGraph.printData();

        }
    }
