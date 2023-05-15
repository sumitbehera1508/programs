#include <stdio.h>
int main() {
    int i,j,n,m ,k;
    printf("enter the number of rows in a pyramid pattern :- ");
    scanf("%d",&n);
    // printf("enter the number of columns : - ");
    // scanf("%d",&m);
    for(i=0;i<n-1;i++){
        for(k=0;k<n-i-1;k++){
            printf(" ");
        }
        for(j=0;j<2*i+1;j++){
            if (j==0 || j==2*i)
            {
                printf("*");/* code */
            }
            else {
                printf(" ");
            }
            
            
        }
        printf("\n");
    }
    for ( i = 0; i <n+1; i++) {
         for(k=0;k<i;k++){
            printf(" ");
        }
        for(j=0;j<(2*(n-i)-1);j++) {
             if (j==0 || j==(2*(n-i)-2))
            {
                printf("*");/* code */
            }
            else {
                printf(" ");
            }
            
        }
       printf("\n");
    }
}