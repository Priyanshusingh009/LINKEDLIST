public class nodeLength {
    public static void count(Node head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        System.out.println(" no.s of nodes are = "+count);
    }
    public static class  Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }    
    }
    public static void main(String[] args) {
        Node head=new Node(6);
        Node second=new Node(6);
        Node third=new Node(6);
        Node fourth=new Node(6);
        Node fifth=new Node(6);
        //now connecting each other
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;
        //calling function
        count(head);
    }
   
    
}
