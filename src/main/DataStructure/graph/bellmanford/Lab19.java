package DataStructure.graph.bellmanford;

import java.util.Arrays;

// Given either DAG or Un directed Graph and weighted Graph
// Given source vertex
// Find the shorted path from to source to all other Vertices
public class Lab19 {

    public static int[] bellmanFord(MyGraph mygraph, int sourceVertex){

        // Step1: Define Distance Array With Max
        int[] distance = new int[mygraph.vertex];
        Arrays.fill(distance, Integer.MAX_VALUE);

        // Step2: Initialize source vertex to zero
        distance[sourceVertex] = 0;

        // Step3:
        for (int i = 0; i < mygraph.vertex-1; i++) {
            for (MyEdge myEdge: mygraph.edgeList) {
                int vertex1 = myEdge.sourceVertex;
                int vertex2 = myEdge.destinationVertex;
                int weight = myEdge.weight;

                if (distance[vertex2] > distance[vertex1] + weight) {
                    distance[vertex2] = distance[vertex1] + weight;
                }
            }
        }return distance;
    }

    public static void main(String[] args) {

//        MyGraph myGraph = new MyGraph(4);
//        myGraph.addNodeAndWeights(0, 1, 5);
//        myGraph.addNodeAndWeights(0, 2, 10);
//
//        myGraph.addNodeAndWeights(1, 0, 5);
//        myGraph.addNodeAndWeights(1, 2, 3);
//        myGraph.addNodeAndWeights(1, 3, 20);
//
//        myGraph.addNodeAndWeights(2, 0, 10);
//        myGraph.addNodeAndWeights(2, 1, 3);
//        myGraph.addNodeAndWeights(2, 3, 2);
//
//        myGraph.addNodeAndWeights(3, 1, 20);
//        myGraph.addNodeAndWeights(3, 2, 2);

        MyGraph myGraph = new MyGraph(6);
        myGraph.addNodeAndWeights(0, 1, 1);
        myGraph.addNodeAndWeights(0, 2, 10);

        myGraph.addNodeAndWeights(1, 0, 1);
        myGraph.addNodeAndWeights(1, 3, 20);
        myGraph.addNodeAndWeights(1, 4, 5);

        myGraph.addNodeAndWeights(2, 0, 10);
        myGraph.addNodeAndWeights(2, 3, 20);

        myGraph.addNodeAndWeights(3, 1, 20);
        myGraph.addNodeAndWeights(3, 2, 20);

        myGraph.addNodeAndWeights(4, 1, 5);
        myGraph.addNodeAndWeights(4, 5, 2);

        myGraph.addNodeAndWeights(5, 3, 15);
        myGraph.addNodeAndWeights(3, 4, 2);


        int[] distance = bellmanFord(myGraph, 0);

        for (int a: distance)
            System.out.println(a);
    }
}

//Time Complexity = O(V*E)