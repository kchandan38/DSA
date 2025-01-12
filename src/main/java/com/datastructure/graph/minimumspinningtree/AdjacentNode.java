package com.datastructure.graph.minimumspinningtree;

public class AdjacentNode {
    int sourceNode;
    int destinationNode;
    int weight;

    public AdjacentNode(){}

    public AdjacentNode(int sourceNode, int destinationNode, int weight){
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[sourceNode=" + sourceNode + ", destinationNode=" + destinationNode + ", weight=" + weight + "]";
    }
}
