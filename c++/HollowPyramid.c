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
        for(k=0;k<(2*i);k++){
            if (k==0||k==2*i-2)
            {
                printf("*"); /* code */
            }
            else {
                printf(" ");
            }
            
           
        }
        printf("\n");
        
    }
    for ( i = 0; i < 2*n-1; i++)
    {
        printf("*"); /* code */
    }
    
    
    return 0 ;
}