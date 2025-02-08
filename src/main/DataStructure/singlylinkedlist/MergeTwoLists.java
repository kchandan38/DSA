package DataStructure.singlylinkedlist;


public class MergeTwoLists {

    public static Node head1 = null;
    public static Node tail1 = null;

    public static Node head2 = null;
    public static Node tail2 = null;
    private static void insert1(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = newNode;
        } else {
            tail1.next = newNode;
        }
        tail1 = newNode;
    }

    private static void insert2(int data) {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = newNode;
        } else {
            tail2.next = newNode;
        }
        tail2 = newNode;
    }

    private static void listData(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static Node mergeList(Node head1, Node head2){

        Node list = head1;
        while (list.next != null) {
            list = list.next;
        }
        list.next = head2;

        return head1;
    }

    private static Node sortList(Node node){

        boolean flag;

    do {
        flag = false;
        Node current = head1;
        while (current.next != null) {
            listData(head1);
            System.out.println();
            if (current.data > current.next.data) {
                swap(current, current.next);
                flag = true;
            }
            current = current.next;
        }
    }while (flag);
    return head1;
    }

    private static void swap(Node node1, Node node2) {
        int temp1 = node2.data;
        node2.data = node1.data;
        node1.data = temp1;
    }

    public static void main(String[] args) {

        insert1(10);
        insert1(30);
        insert1(60);
        insert1(70);

     // list1.listData(head1);

      //  System.out.println("\n------------------");
        insert2(20);
        insert2(40);
        insert2(80);
        insert2(50);

        listData(mergeList(head1, head2));
        System.out.println("\n-----------------------");

        listData(sortList(head1));
    }
}
