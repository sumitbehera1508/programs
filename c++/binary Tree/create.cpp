#include <iostream>
#include <queue>

using namespace std;

class Node {

    public:

    int data;
    Node * left;
    Node * right;

    Node(int d){
        this->data=d;
        this->left=NULL;
        this->right=NULL;
    }
};

Node* buildTree(Node* root){
    cout<<"Enter The Data : ";
    int data ;
    cin>>data;
    root = new Node(data);

    if(data ==-1){
        return NULL;
    }

    cout<<"Enter data for Left of "<<data<<" : ";
    root->left = buildTree(root->left);
    cout<<"Enter data for Right of "<<data<<" : ";
    root->right = buildTree(root->right);

    return root;
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

void inorder(Node * root){
    //  L-N-R
    if(root==NULL) return;
    
    //L
    inorder(root->left);
    //N
    cout<<root->data<<" ";
    //R
    inorder(root->right);

}

void preorder(Node * root){
    //N-L-R
    if(root==NULL) return;

    //N
    cout<<root->data<<" ";
    //L
    preorder(root->left);
    //R
    preorder(root->right);
}

void postOrder(Node* root){
    //L-R-N
    if(root==NULL) return;

    //L
    postOrder(root->left);
    //R
    postOrder(root->right);
    //N
    cout<<root->data<<" ";
}

int main(){

    Node * root = NULL;

    root = buildTree(root);

    levelOrderTraversal(root);
    cout<<endl;
    // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
    inorder(root);
    cout<<endl;
    preorder(root);
    cout<<endl;
    postOrder(root);
    cout<<endl;
    return 0;
}