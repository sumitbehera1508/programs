#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
    int data;
    Node * right;
    Node * down;
    Node(int data){
        this->data=data;
        this->down=NULL;
        this->right=NULL;
    }
};

void print(Node * head){
    while(head){
        Node* temp = head->down;
        while(head){
            cout<<head->data<<" ";
            head= head->right;
        }
        cout<<endl;
        head = temp;
    }
}

Node* matrix(int **arr,int n){
    Node * head = new Node(arr[0][0]);
    Node * temp = head;
    for(int i=0;i<n;i++){
        Node * t = temp;
        for(int j=0;j<n;j++){
            if(j+1==n) temp->right=NULL;
            else temp->right=new Node(arr[i][j+1]);

            if(i+1==n) temp->down=NULL;
            else temp->down = new Node(arr[i+1][j]);

            temp=temp->right;
        }
        temp = t->down;
    }
    return head;
}

int main(){
    cout<<"Enter the no. of elements in the row of sq. matrix : ";
    int n;
    cin>>n;
    int **arr = new int*[n];
    for(int i=0;i<n;i++){
        cout<<"enter "<<n<<" elements of "<<i<<"th row : ";
        *(arr+i) = new int[n];
        for(int j=0;j<n;j++){
            cin>>arr[i][j];
        }
    }
    Node* head =matrix(arr,n);
    print(head);
}