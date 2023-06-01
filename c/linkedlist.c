#include <stdio.h>
#include <stdlib.h>
struct Node 
{
    int data;
    struct Node* next;
}*head=NULL;

void insertFront(){
    int n;
    printf("the number of nodes you want to add to the front : ");
    scanf("%d",&n);
    while(n--){
        struct Node * new_node = (struct Node*) malloc(sizeof(struct Node));
        if(new_node == NULL)
    {
        printf(" Memory can not be allocated.");
    }else{
        int temp;
        printf("enter your data : ");
        scanf("%d",&temp);
        new_node -> data = temp;
        new_node ->next = head;
        head = new_node; }
    }
}

void display(){
    struct Node * k = head;
    printf("\n");
    while (k!=NULL)
    {
       printf("%d ",k->data);
       k= k->next;
    }
    printf("\n");
}

void insertBack(){
    int d;
    printf("enter the data : ");
    scanf("%d",&d);
    struct Node *fnnode=(struct Node * )malloc(sizeof(struct Node));
    struct Node *tmp;
    tmp = head;
    fnnode->next=NULL;
    fnnode->data=d;
    while(tmp->next!=NULL) tmp = tmp->next;
    tmp->next=fnnode;
}
void deleteFirst(){
    struct Node * temp;
    temp = head;
    head = head->next;
    free(temp);
}
void deleteEnd(){
    struct Node * prev = NULL;
    struct Node * end = head;
    while(end->next){
        prev = end;
        end=end->next;
    }
    prev->next=NULL;
    free(end);
}

void search(){
    int k,c=0;
    printf("the element want to search : ");
    scanf("%d",&k);
    struct Node * temp = head;
    while(temp->next){
        if(temp->data==k) {printf("found it in %d index",c);return;}
        temp=temp->next;
        c++;
    }
    if(temp->data==k) {printf("found it in %d index",c);return;}
    printf("the number is not found");
}

void insertAny (int pos, int data)
{
   struct Node * temp=(struct Node * )malloc(sizeof(struct Node)),*t=head;
   temp->next=NULL;
   temp->data=data;
   while (--pos)
   {
    t=t->next;
   }
    temp->next = t->next;
    t->next=temp;
   
}
int main(){
    printf("\ninsert at front\n");
    //insertFront();
    display();
    printf("\ninsert at end \n");
    insertBack();
    display();
    printf("\ndelete first \n");
    deleteFirst();
    display();
    printf("\ndelete End \n");
    deleteEnd();
    display();
    printf("\nsearch data\n");
    search();
    display();
    printf("\ninsert at any position\nprovide data and index ");
    int data,pos;
    scanf("%d %d",&data,&pos);
    insertAny(pos,data);
    display();
    return 0;
}
