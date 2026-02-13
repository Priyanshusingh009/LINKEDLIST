class reverselinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            // Step 1: Store next node
            next = current.next;

            // Step 2: Reverse the link
            current.next = prev;

            // Step 3: Move prev and current one step forward
            prev = current;
            current = next;
        }

        return prev;  // new head
    }

    // Function to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("\nReversed List:");
        printList(head);
    }
}
