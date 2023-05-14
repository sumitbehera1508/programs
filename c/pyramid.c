#include <stdio.h>
#include <math.h>
int main() {
    int i,j,n,m ,k;
    printf("enter the number of rows in a rectangle pattern :- ");
    scanf("%d",&n);
    // printf("enter the number of columns : - ");
    // scanf("%d",&m);
    for ( i = 0; i <n; i++)
    {
        for ( j = 0; j < (n-i-1); j++)
        {
                printf(" ");
        
        }
        for(k=0;k<(2*i+1);k++){
            printf("*");
        }
        printf("\n");
        
    }
    
    return 0 ;
}