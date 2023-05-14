#include <iostream>
using namespace std;

void rec(int n,string arr[]){
    if(n==0) return;
    rec(n/10,arr);
    cout<<arr[n%10]<<endl;
}

void rev(int n,string arr[]){
    if(n==0) return;
    cout<<arr[n%10]<<endl;
    rec(n/10,arr);
}

int main(){
    string arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    int n;
    cout<<"enter your number : ";
    cin>>n;
    rec(n,arr);
    cout<<"\nthe reverse order is\n\n";
    rev(n,arr);
}