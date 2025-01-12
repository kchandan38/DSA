import java.util.ArrayList;
import java.util.LinkedList;

public class DirectedGraphExample {

    public int vertex;
    public ArrayList<LinkedList<Integer>> adjList;
    public DirectedGraphExample(int vertex){
         this.vertex = vertex;
         this.adjList = new ArrayList<>(vertex);

         for (int i = 0; i < vertex ; i++) {
             adjList.add(new LinkedList<>());
         }
    }

    public void addEdge(int vertex, int data){
         adjList.get(vertex).add(data);
     }

     public void printGraph(){

         for (int i = 0; i < vertex; i++) {

             System.out.print("Vertex " + i + " => " );
             for (int edge:adjList.get(i)) {
                 System.out.print(edge + " ");
             }
            System.out.println();

         }
     }


    public static void main(String[] args) {

         DirectedGraphExample directedGraphExample = new DirectedGraphExample(4);
         directedGraphExample.addEdge(0,1);
         directedGraphExample.addEdge(0,2);

         directedGraphExample.addEdge(1,2);
         directedGraphExample.addEdge(1,3);

         directedGraphExample.addEdge(2,3);

         directedGraphExample.printGraph();

    }

}
