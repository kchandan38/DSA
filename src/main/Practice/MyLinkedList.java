public class MyLinkedList {

    int data;
    Node head;
    Node tail;
    static int size;

    public void addMyNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void printLinkedList(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addMyNode(10);
        myLinkedList.addMyNode(30);
        myLinkedList.addMyNode(50);
        myLinkedList.addMyNode(70);
        myLinkedList.addMyNode(90);

        myLinkedList.printLinkedList();
        System.out.println("\n"+ "Linked List Size : "+size);
    }
}
