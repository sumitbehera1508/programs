#include <bits/stdc++.h>
using namespace std;

class Node {
    public:
    int data;
    Node * left=nullptr;
    Node * right=nullptr;
    Node(int data){
        this->data=data;
    }
};

Node* insert(Node * & root,int data){
    if(root==nullptr){
        root = new Node(data);
        return root;
    }

    if(data> root->data){
        //insert to right
        root->right = insert(root->right,data);
    }
    else{
        root->left = insert(root->left,data);
    }

    return root;
}

void takeInput(Node * & root){
    int data;
    cin>>data;
    while (data!=-1)
    {
        /* code */
        root = insert(root,data);
        cin>>data;
    }
    
}

void levelOrderTraversal(Node* root) {
    queue<Node*> q;
    q.push(root);
    q.push(NULL);

    while(!q.empty()) {
        Node* temp = q.front();
        q.pop();

        if(temp == NULL) { 
            //purana level complete traverse ho chuka hai
            cout << endl;
            if(!q.empty()) { 
                //queue still has some child ndoes
                q.push(NULL);
            }  
        }
        else{
            cout << temp -> data << " ";
            if(temp ->left) {
                q.push(temp ->left);
            }

            if(temp ->right) {
                q.push(temp ->right);
            }
        }
    }

}

bool search(Node * root , int data){
    if(root==nullptr){
        return false;
    }
    if(root->data == data){
        return true;
    }

    if(root->data<data){
        return search(root->right,data);
    }

    if(root->data>data){
        return search(root->left,data);
    }
}

int main(){

    Node * root = nullptr;
    cout<<"input data to make BST \n\t:";
    takeInput(root);

    levelOrderTraversal(root);
    return 0;
}