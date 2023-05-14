#include <iostream>
using namespace std;

string reverse(string k,int s,int n){
    if(s==n) return "\n";
    return reverse(k,s+1,n)+k[s];
}

void rev(string &k,int s,int n){
    if(s>n) return;
    swap(k[s],k[n]);
    rev(k,s+1,n-1);
}
int main(){
    string k;
    cout<<"input your string : ";
    cin>>k;
    int n=k.size(),s=0;
    rev(k,s,n-1);
    cout<<k;
}