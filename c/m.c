#include <stdio.h>
#include <stdbool.h>
#include <math.h>
int gcd(int a,int b){
    return b==0?a:gcd(b,a%b);
}
long int fact(int n){
    if(n<0) return -1;
    else if(n==0) return 0;
    else {
        int f=1;
        for(int i=2;i<=n;i++){
            f*=i;
        }
        return f;
    }
}
long int fab(int n){
    if (n<0) return -1;
    if(n>0 && n<3)
        return 1;
    int arr[n];
    arr[0]=1;
    arr[1]=1;
    for (int i = 2; i < n; i++)
    {
        arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n-1];
}

bool isPrime(int n){
    bool flag = true;
    if(n<2){
        return false;
    }
    if(n==2 || n==3){
        return true;
    }
    for(int i=2;i<sqrt(n);i++){
        if(n%i==0){
            flag = false;
        }
    }
    return flag;
}

bool isStrong(int n){
    long int a = n;
    long int sum =0;
    while(n>0){
        sum+=fact(n%10);
        n/=10;
    }
    return (a==sum)?true:false;
}
bool isPalindrome(long int n){
    long int sum=0,temp=n;
    while(n>0){
        sum=sum*10+n%10;
        n/=10;
    }
    return (temp==sum)?true:false;
}
int main() {
    int a,b;
    printf("Input numbers : ");
    scanf("%d %d",&a,&b);
    int k = gcd(a,b);
    printf("gcd : %d\nlcm :%d \nfab(a) : %li \nfab(b): %li\nfact(a): %li \nfact(d): %li\n",k,(a*b)/k,fab(a),fab(b),fact(a),fact(b));
    printf("isPrime(a): %s\nisPrime(b): %s\n",(isPrime(a))?"PRIME":"NOT PRIME",(isPrime(b))?"PRIME":"NOT PRIME");
    printf("isStrong(a) : %s\nisStrong(b) : %s\n",(isStrong(a))?"Strong":"Not Strong",(isStrong(b))?"Strong":"Not Strong");
    printf("isPalindrome(a): %s\nisPalindrome(b): %s\n",(isPalindrome(a)?"palindrome":"Not Palindrome"),(isPalindrome(b)?"palindrome":"Not Palindrome"));
}