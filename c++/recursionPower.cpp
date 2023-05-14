#include <iostream>
using namespace std;

long long pow(int a,int n){
    if(n==0) return 1;
    return a*pow(a,n-1);
}

int main(){
    int a,b;
    cout<<"enter the num and power : ";
    cin>>a>>b;
    cout<<"the number is : "<<((b%2==0)?pow(a,b/2)*pow(a,b/2):a*pow(a,b/2)*pow(a,b/2));
}