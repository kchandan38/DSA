package DataStructure.graph.minimumspinningtree;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyGraph {
    int vertex;
    ArrayList<LinkedList<AdjacentNode>> arrayList = new ArrayList<>();
    public MyGraph(int vertex){
        this.vertex = vertex;
        this.arrayList = new ArrayList<LinkedList<AdjacentNode>>(vertex);
        for (int i = 0; i < vertex; i++) {
            this.arrayList.add(new LinkedList<AdjacentNode>());
        }
    }
    public void addNodeAndWeights(int sourceNode, int destinationNode, int weight){
        arrayList.get(sourceNode).add(new AdjacentNode(sourceNode, destinationNode, weight));
    }

    public void printGraph() {

        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " => ");
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
