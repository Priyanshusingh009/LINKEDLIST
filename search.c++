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
    int nodeNumber=0;
    Node *head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(30);
    int key=20;
    Node* temp=head;
    bool found=false;
    while(temp!=NULL){
        nodeNumber++;
        if(temp->data==key){
            found=true;
            break;
        }
        temp=temp->next;
    }
    if(found){
        cout<<"Element found in the linked list at node: " << nodeNumber << endl;
    }
    else{
        cout<<"Element not found in the linked list."<<endl;
    }

}