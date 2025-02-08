package doublelinklist;

public class Lab12 {

    static Node head;
    static Node tail;

    private static void InsertNode(int data){

        Node temp = new Node(data);

        if(head==null){
             head = tail = temp;
        }else{

            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void printNextData(){

        Node headNode = head;

        while (headNode!=null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    static String toStringDLL(){

        if(head ==null){
            return "[]";
        }
        StringBuilder str = new StringBuilder("[");
        Node headNode = head;

        while (headNode!=null) {
            str.append(headNode.data).append(",");
            headNode = headNode.next;
        }
        return str.substring(0,str.length()-1) + "]";
    }

    public static void main(String[] args) {

        InsertNode(10);
        InsertNode(20);
        InsertNode(30);
        InsertNode(40);
        InsertNode(50);
        InsertNode(99);
        InsertNode(100);
        InsertNode(501);
        printNextData();
        System.out.print("\n-------------------\n");

        System.out.println("\n"+toStringDLL());

    }
}
