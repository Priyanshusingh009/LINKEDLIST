

public class LinkedList {
    //recursion method to display linked list element
    public static void displayR(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        displayR(head.next);

    }

    //recurivly printing revers linkred list
    public static void displayreverse(Node head){
        if(head==null)return;
        displayreverse(head.next);// here function call itself before reaching printing line
        System.out.print(head.data+" ");
    }

    public static  void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public static class Node {
    int data;       // value of this node
    Node next;      // reference (link) to the next node

    Node(int data) {
        this.data = data;
        this.next = null; // initially, no next node
    }
}
    public static void main(String[] args) {
        
        Node head = new Node(10);   // first node
        Node second = new Node(20); // second node
        Node third = new Node(30);  // third node

                              // Step 2: Link them together using 'next'
        head.next = second;  // head node points to second
        second.next = third;// second node points to third
                           // third.next remains null → means end of list

        //  Traversal - start from head and move via 'next'
        Node temp = head;
        System.out.println("Linked List elements (with diagram):");
        while (temp != null) {
            System.out.print(temp.data + " -> "); // print value
            temp = temp.next; // move to the next node
        }
        System.out.println("null"); // end of list
        display(head);
        System.out.println();
        displayR(head);
        System.out.println();
        displayreverse(head);
    }
    
}
