class lengthOfLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    // public static Node reverse(Node head) {

    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;

        // while (current != null) {

        //     // Step 1: Store next node
        //     next = current.next;

        //     // Step 2: Reverse the link
        //     current.next = prev;

        //     // Step 3: Move prev and current one step forward
        //     prev = current;
        //     current = next;
        // }

        
    //}

    
    
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // counting length of linked list
        int length=0;
        Node current=head;
        while(current!=null){
            length++;
            current=current.next;
        }
        System.out.println("Length of linked list is: " + length);
        
    }
}
