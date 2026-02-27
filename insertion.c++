# include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node(int value){
        data=value;
        next=NULL;
    }
};
int main(){
    //deletion at head
    Node* head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(30);
    Node* temp=head;
    head=head->next;
    delete temp;
    cout<<head->data<<endl;
}