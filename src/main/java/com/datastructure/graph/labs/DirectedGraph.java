package com.datastructure.graph.labs;

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectedGraph {

    int vertex;
    ArrayList<LinkedList<AdjacencyNode>> arrayList = new ArrayList<>();
    public DirectedGraph(int vertex){
        this.vertex = vertex;
        this.arrayList = new ArrayList<LinkedList<AdjacencyNode>>(vertex);
        for (int i = 0; i < vertex; i++) {
            this.arrayList.add(new LinkedList<AdjacencyNode>());
        }
    }
    public void addNodeAndEdges(int sourceNode, int destinationNode, int weight){
        arrayList.get(sourceNode).add(new AdjacencyNode(sourceNode, destinationNode, weight));
    }

    public void printGraph() {

        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " => ");
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}
