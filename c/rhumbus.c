#include <stdio.h>
int main() {
    int i,j,n,m ,k;
    printf("enter the number of rows in a rhombus pattern :- ");
    scanf("%d",&n);
    // printf("enter the number of columns : - ");
    // scanf("%d",&m);
    for ( i = 0; i <n; i++) {
         for(k=0;k<i;k++){
            printf(" ");
        }
        for(j=0;j<n;j++) {
            printf("*");
        }
       printf("\n");
    }
}