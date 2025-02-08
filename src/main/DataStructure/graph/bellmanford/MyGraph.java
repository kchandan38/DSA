package DataStructure.graph.bellmanford;

import java.util.ArrayList;

public class MyGraph {
    int vertex;
    ArrayList<MyEdge> edgeList;
    public MyGraph(int vertex){
        this.vertex = vertex;
        this.edgeList = new ArrayList<>(vertex);
    }
    public void addNodeAndWeights(int sourceNode, int destinationNode, int weight){
        edgeList.add(new MyEdge(sourceNode, destinationNode, weight));
    }

    public void printGraph() {

        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " => ");
            for (int j = 0; j < edgeList.size(); j++) {
                System.out.print(edgeList.get(i) + "\t");
            }
            System.out.println();
        }
    }
}
