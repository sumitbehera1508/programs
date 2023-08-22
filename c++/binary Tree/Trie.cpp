#include <bits/stdc++.h>
using namespace std;

class TrieNode {
    public:
    char data;
    TrieNode* children[26];
    bool isTerminal = false;

    TrieNode(char ch){
        data = ch;
        for(int i=0;i<26;i++){
            children[i]=nullptr;
        }
        isTerminal = false;
    }
};

class Trie{
    TrieNode * root;

    void insertUtil(TrieNode * root, string str){
        if(str.size()<1){
            root->isTerminal = true;    
            return;
        }

        int index = str[0]-'A';

        TrieNode * child;
        if(root->children[index]!= nullptr){
            //prresent
            child = root->children[index];
        }
        else{
            //abscent
            child = new TrieNode(str[0]);
            root->children[index] = child;
        }

        insertUtil(child,str.substr(1));
    }


    bool searchUtil(TrieNode * root,string str){
        if(str.size()==0){
            return root->isTerminal;
        }

        int index = str[0]-'A';
        TrieNode * child;

        //present 
        if(root->children[index]){
            child = root->children[index];
        }
        //abscent
        else return false;

        return searchUtil(child,str.substr(1));
    }


    public:
    Trie(){
        root = new TrieNode(' ');
    }

    void insert(string str){
        insertUtil(root,str);
    }


    bool search(string str){
        return searchUtil(root,str);
    }
};



int main(){
    Trie *t = new Trie();

    t->insert("ABCD");

    cout<<t->search("A")<<"\n"<<t->search("ABCD");
}