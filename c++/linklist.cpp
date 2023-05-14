#include <iostream>
using namespace std;

//8-145 single linked list
//147-333 doubly linked list
//336-430 singly circular linked list

//single linked list
class slnode{
    public:
    int data;
    slnode * next;

    slnode(int data){
        this->data=data;
        this->next=NULL;
    }
};

class singlelnkedlist{
    public:
    static void insertAtbegin(slnode * &head,int data){
        slnode * temp = new slnode(data);
        temp->next=head;
        head = temp;
    }

    static void print(slnode* &head){
        slnode *temp = head;
        while(temp!=NULL){
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout <<endl;
        
    }

    static void insertTail(slnode * &tail,int data){
        slnode * temp = new slnode(data);
        tail->next=temp;
        tail=tail->next;
    }

    static void insertAtposition(slnode* &head,int data,int &c,int pos){
        if(c==0)insertAtbegin(head,data);
        while((++c)!=pos){
             head=head->next;
        }
        if(c<pos) {cout<<"invalid postion "<<endl;return;}
        slnode * temp = new slnode(data);
        temp->next=head->next;
        head->next=temp;
    }

    static void deletebegin(slnode* &head){
        slnode* temp = head;
        head=head->next;
        free(temp);
    }

    static void deleteEnd(slnode* &head){
        slnode * end = head;
        slnode * prev = head;

        while(end->next){
           prev=end;
           end=end->next;
        }
        prev->next=NULL;
        free(end);
    }

    static void deleteAnyPos(slnode * &head,int &c,int pos){
        if(pos ==0) deletebegin(head);
        slnode * prev = head;
        slnode * next = head;
        while(c!=pos){
           prev=next;
           next=next->next;c++;
        }
        prev->next=next->next;
        free(next);

    }

    static void deleteAnyValue(slnode* &head,int data){
        slnode * temp = head;
        slnode * prev=head;
        while(temp!=NULL){
            if(temp->data==data){
                slnode * i=temp;
                prev->next=temp->next;
                temp=temp->next;
                i->next=NULL;
                free(i);
                continue;
                
            }
            prev=temp;
            temp=temp->next;
        }
    }

    static int length(slnode* &head){
        slnode * temp = head;
        int c=0;
        while(temp){
            c++;
            temp=temp->next;
        }
        cout<<"the the length of the single linked list is "<<c<<endl;
    }
};

void slfunc(){
    slnode * n1 = new slnode(10);
    slnode* head = n1;
    for(int i=9;i>-1;i--){
        singlelnkedlist::insertTail(head,0);
        singlelnkedlist::insertTail(head,0);
        singlelnkedlist::insertTail(head,0);
        singlelnkedlist::insertTail(head,i);
    }

    singlelnkedlist::print(n1);
    head=n1;
    int index =0;
    singlelnkedlist::insertAtposition(head,22,index,5);
    singlelnkedlist::print(n1);

    singlelnkedlist::deletebegin(n1);
    singlelnkedlist::print(n1);

    singlelnkedlist::deleteEnd(n1);
    singlelnkedlist::print(n1);

    index =0;head=n1;
    singlelnkedlist::deleteAnyPos(head,index,5);
    singlelnkedlist::print(n1);

    head=n1;
    singlelnkedlist::deleteAnyValue(head,0);
    if(n1->data==0) singlelnkedlist::deletebegin(n1);
    singlelnkedlist::print(n1);
}

//double linked list
class dlnode{
    public:
    int data;
    dlnode * prev;
    dlnode * next;

    dlnode(int data){
        this->data=data;
        this->next=NULL;
        this->prev=NULL;
    }
};

class doublelinkedlist{
    public:
    static void print(dlnode * &head){
        dlnode * temp = head;
        while(temp){
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }

    static void reverse(dlnode* &head){
        dlnode* temp = head;
        while(temp->next){
            temp= temp->next;
        }
        while(temp){
            cout<<temp->data<<" ";
            temp= temp->prev;
        }
        cout<<endl;
    }

    static int length(dlnode * &head){
        int c=0;
        dlnode* temo=head;
        while(temo){
            c++;
            temo=temo->next;
        }
        cout<<"the length of doubly linked list is "<<c<<endl;
    }

    static void insertatbegin(dlnode* &head,int data){
        dlnode * temp = new dlnode(data);
        temp->next=head;
        head->prev=temp;
        head = temp;
    }

    static void insedtAtEnd(dlnode* &head,int data){
        dlnode* end = new dlnode(data);
        dlnode * temp = head;
        while(temp->next){
            temp=temp->next;
        }
        temp->next=end;
        end->prev=temp;
    }

    static void insertAtany(dlnode* &head,int data,int pos){
        if(pos==0) {insertatbegin(head,data);return;}
        dlnode* node = new dlnode(data);
        dlnode* temp = head;
        int c=0;
        while((++c)<pos && temp->next!=NULL){
            temp=temp->next;
        }
        if(c<pos) {cout<<"invalid position "<<endl;return;}
        if(temp->next==NULL) {insedtAtEnd(head,data);return;};
        node->next=temp->next;
        node->prev=temp;
        temp->next=node;
        (node->next)->prev=node;
    }

    static void deleteatbegin(dlnode* &head){
        dlnode * temp = head;
        head=head->next;
        head->prev=NULL;
        free(temp);
    }
    static void deleteEnd(dlnode* &head){
        dlnode* prev=NULL;
        dlnode* next =head;
        while(next->next){
            prev=next;
            next=next->next;
        }
        next->prev=NULL;
        prev->next=NULL;
        free(next);
    }

    static void deleteAny(dlnode* &head,int pos){
        if(pos==0){deleteatbegin(head);return;}
        dlnode * prev=NULL;
        dlnode* next =head;
        int c=0;
        while((c++)<pos && next->next){
            prev=next;
            next=next->next;
        }
        if(c<pos){cout<<"invalid position"<<endl;return;}
        if(next->next==NULL){deleteEnd(head);return;}
        prev->next=next->next;
        (next->next)->prev=prev;
        free(next);

    }

    static void deleteValue(dlnode* &head,int data){
        dlnode* prev=NULL;
        dlnode* next = head;
        while(next->next){
            if(next->data==data){
                dlnode* temp=next;
                prev->next=next->next;
                next=next->next;
                next->prev=prev;
                free(temp);
                continue;
            }
            else{
            prev=next;
            next=next->next;    
            }
        }
        if(next->data==data){
            (next->prev)->next=NULL;
            free(next);
        }
    }
};

void dlfunc(){
    cout<<"enter the first element in the doubly linked list : ";
    int data;
    cin>>data;
    dlnode * n = new dlnode(data);

    for(int i=data-1;i>-1;i--)
    doublelinkedlist::insertatbegin(n,i);

    doublelinkedlist::print(n);
    doublelinkedlist::length(n);

    doublelinkedlist::insedtAtEnd(n,50);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);

    int pos;
    cout<<"enter the position you want to insert : ";
    cin>>pos;
    doublelinkedlist::insertAtany(n,50,pos);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);

    doublelinkedlist::deleteatbegin(n);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);

    doublelinkedlist::deleteEnd(n);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);

    cout<<"enter the position you Want to delete : ";
    cin>>pos;
    doublelinkedlist::deleteAny(n,pos);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);

    cout<<"enter the value you Want to delete : ";
    cin>>data;
    doublelinkedlist::deleteValue(n,data);
    doublelinkedlist::print(n);
    doublelinkedlist::reverse(n);
    doublelinkedlist::length(n);
}

//circular single linked list 
class slcir{
    public:
    int data;
    slcir * next;

    slcir(int data){
        this->data=data;
        this->next=this;
    }
    ~slcir(){
        int value =this->data;
        if(this->next!=NULL){
            delete next;
            next = NULL;
        }
        cout<<"memory is free from node with data "<<value<<" .\n";
    }
};

class singlycircular{
    public:
    static void insertelemrnt(slcir* &tail,int element,int data){
        slcir * temp= tail;
        slcir * next = new slcir(data);
        if(temp==NULL) {
            next->next=next;
            tail = next; return;
        }
        while(temp->data!=element){
            temp=temp->next;
        }
        next->next=temp->next;
        temp->next=next;
    }

    static void print(slcir* tail){
        slcir * stop = tail;
        do{
            cout<<tail->data<<" ";
            tail=tail->next;
        }
        while(tail!=stop);
        cout<<endl;
    }

    static void deleteelement(slcir* &tail,int data){
        if(tail->next==NULL) {cout<<"Empty circular linked list "<<endl;return;}
        slcir* prev=tail;
        slcir* next = prev->next;
        while(next->data!=data){
            prev=next;
            next=next->next;
            if(next->next==next) {cout<<"invalid input "<<endl;return;}
        }
        prev->next=next->next;
        next->next=NULL;
        delete next;

    }

    static void search(slcir* tail,int data){
        if(tail->next==NULL){cout<<"empty circular Linked list"<<endl;return;}
        slcir* stop=tail;
        do{
            if(tail->data==data){
                cout<<"the element is present "<<endl;
                return;
            }
            tail=tail->next;
        }while(tail!=stop);
        cout<<"The element is not found"<<endl;
    }
};

void sincircularfunction(){
    int n;
    cout<<"enter the elements you want to insert : ";
    cin>>n;
    slcir * tail = new slcir(0);
    for(int i=1;i<=n;i++){
        singlycircular::insertelemrnt(tail,i-1,i);
    }
    singlycircular::print(tail);

    cout <<"the element you want to delete : ";
    cin>>n;
    singlycircular::deleteelement(tail,n);
    singlycircular::print(tail);

    cout<<"the element you want to search : ";
    cin>>n;
    singlycircular::search(tail,n);
    singlycircular::print(tail);
}

int main(){
    int n;
    cout<<"\n\t1. for single linked list\n\t2.double linked list\n\t3.single circular linked list\nenter: ";
    cin>>n;
    switch (n)
    {
    case 1:
        slfunc();
        break;
    case 2:
        dlfunc();
        break;
    case 3:
        sincircularfunction();
        break;
    default:
        cout<<"invalid input"<<endl;
        break;
    }
    return 0;
}