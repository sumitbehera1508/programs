#include <stdio.h>
int main() {
    int n=1 , i,j ,count;
    printf("input number of rows :- ");
    scanf("%d",&count);
    for ( i = 0; i < count; i++)
    {
        for ( j= 0; j <i+1; j++)
        {
            printf("%d ",n);
            n++;
        }
        printf("\n");
    }
    
}