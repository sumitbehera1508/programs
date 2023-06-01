#include<stdio.h>
#include<stdlib.h>

struct poly {
    int data;
    int pow;
    struct poly * next;
};

void insertnext(struct poly* p,int pow){
    struct poly * head = p;
    while(pow--){ 
        struct poly* temp = (struct poly*) malloc(sizeof(struct poly));
        int da;
        printf("enter coefficient: ");
        scanf("%d",da);
        temp->data= da;
        temp->pow=pow;
        head->next=temp;
        head = head->next;
        temp->next=NULL;

    }
   
}

int main(){

}