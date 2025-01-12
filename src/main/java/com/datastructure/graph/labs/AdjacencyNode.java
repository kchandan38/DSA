package com.datastructure.graph.labs;

public class AdjacencyNode {
    int sourceNode;
    int destinationNode;
    int weight;

    public AdjacencyNode(){}
    public AdjacencyNode(int sourceNode, int destinationNode, int weight){
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[sourceNode=" + sourceNode + ", destinationNode=" + destinationNode + ", weight=" + weight + "]";
    }
}
