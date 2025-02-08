package DataStructure.singlylinkedlist;

//Delete the Node at given position of S.L.L


public class Lab11 {

    public static Node head = null;
    public static Node tail = null;

    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    private void listData(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static int listNodeLength(Node list){

        int length=0;

        while(list!=null){
            length++;
            list = list.next;
        }
        return length;
    }

    private static void removeNthFromEnd(int n) {

        Node list = head;
        Node temp = null;

        if (list.next == null && n == 1) {
            head = null;
            return;
        }
        int nodeLength = listNodeLength(list);
        if(nodeLength==n) {
           head = list.next;
        }

        if (list.next != null) {
            for (int i = 1; i < nodeLength - n; i++) {
                    list = list.next;
                }


            list.next = list.next.next;
            }
        }
    public static void main(String[] args) {

        Lab11 lab = new Lab11();
        lab.insert(10);
        lab.insert(20);
        lab.insert(30);
        lab.insert(40);
        lab.insert(50);
        lab.insert(60);
        lab.insert(70);
        lab.listData(head);

        System.out.println("\n-----------------------------");

        removeNthFromEnd(7);

        lab.listData(head);
    }

}
