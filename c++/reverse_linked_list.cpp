#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    Node(int data){
        this->data=data;
        this->next=NULL;
    }
};
void insertatend(Node * &head,int data){
    Node * next = new Node(data);
    Node * t = head;
    while(t->next){
        t=t->next;
    }
    t->next=next;
}
void reverse(Node *&head){
    if(head==NULL || head->next==NULL) return;
    Node * prev = NULL;
    Node * curr = head;
    Node * forward = NULL;
    while(curr){
        forward = curr->next;
        curr->next=prev;
        prev = curr;
        curr = forward;
    }
    head = prev;
}

void shift(Node*&prev,Node*&curr,Node*&forward){
    if(curr==NULL) return;
    forward = curr->next;
    curr->next=prev;
    prev = curr;
    curr = forward;
    shift(prev,curr,forward);
}

void rev(Node *&head){
    if(head==NULL || head->next==NULL) return;
    Node * prev = NULL;
    Node * curr = head;
    Node * forward = NULL;

}

void print(Node * head){
    while(head){
        cout<<head->data<<" ";
        head=head->next;
    }
    cout<<endl;
}

int main(){
    Node *n1=new Node(0);
    for(int i=1;i<11;i++){
        insertatend(n1,i);
    }
    print(n1);
    reverse(n1);
    print(n1);
}