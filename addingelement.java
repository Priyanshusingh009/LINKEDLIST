public class addingelement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
    void insertAtTail(int val){          //not using static because it is already defined in static class
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
            
        }
        tail=temp;
    }
    void insertAthead(int val){
        Node temp=new Node(val);

        if(head==null){
            temp=head;
            tail=head;
        }
        else{
            temp.next=head;
            head=temp;
        }

    }
    int getAt(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;

    }
    void deleteAat(int idx){
        if(idx==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
    } 
     void display(){
        Node temp=head;
        System.out.println("Nodes are as follows ");
        while(temp!=null){
            System.out.print(temp.data+ "-->");
            temp=temp.next;
        }  
            System.out.print("null");

    }
    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        System.out.println("no. of nodes are ");
        return count;

    }
    void insertAt(int idx,int val){
        Node t=new Node(val);
        Node temp=head;
        if(idx==0){
            insertAthead(val);
            return;
        }
        else if(idx==size()){
            insertAtTail(val);
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
            return;
        }
        t.next=temp.next;
        temp.next=t;
    }
    }   
     public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertAtTail(5);
        ll.insertAtTail(6);
        ll.insertAtTail(7);
        ll.insertAthead(9);
        System.out.println();
        System.out.println(ll.size());
        System.out.println();
        ll.insertAt(4, 8);
        System.out.println();
        ll.insertAt(0,12);
        ll.display();
        System.out.println();
        System.out.println("tail is ");
        System.out.println(ll.tail.data);
        System.out.println("head is ");
        System.out.println(ll.head.data);
        System.out.println("element at this index is ");
        System.out.print(ll.getAt(3));
        
        System.out.println();
        ll.deleteAat(0);System.out.println();
        ll.display();
        System.out.println("tail is ");
        System.out.println(ll.tail.data);
        System.out.println("head is ");
        System.out.println(ll.head.data);
    }
    
}
