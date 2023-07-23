#include <stdio.h>
#include <stdlib.h>

struct stack {
    int front;
    int size;
    int *q;
};

struct stack* st;

void createStack(int size) {
    st = (struct stack*)malloc(sizeof(struct stack));
    st->size = size;
    st->q = (int*)malloc(st->size * sizeof(int));
    st->front = 0;
}

void push(int data) {
    if (st->front == st->size) {
        printf("The stack is full");
    } else {
        st->q[st->front] = data;
        st->front = st->front + 1;
    }
}

int pop() {
    if (st == NULL || st->front <= 0) {
        printf("The stack is empty");
        return -1; // Return an invalid value to indicate an error or empty stack
    } else {
        int data = st->q[st->front - 1]; // Corrected the index for popping
        st->front--;
        return data;
    }
}

int isEmpty() {
    if (st == NULL || st->front == 0) {
        return 1;
    } else {
        return 0;
    }
}

int stsize() {
    return st->front;
}

int main() {
    int size;
    printf("Enter size of stack: \n");
    scanf("%d", &size);
    createStack(size);
    printf("Enter -1 to stop adding: \n");
    int data = 0;
    while (data != -1) {
        scanf("%d", &data);
        if (data != -1)
            push(data);
    }
    printf("The popped item is %d\n", pop());
    printf("The popped item is %d\n", pop());
    printf("The popped item is %d\n", pop());
    printf("The size of stack is %d\n", stsize());
    printf("Is empty? %d\n", isEmpty());
    
    // Free the memory allocated for the stack
    free(st->q);
    free(st);
    
    return 0;
}