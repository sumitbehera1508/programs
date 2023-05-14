#include <iostream>
using namespace std;
bool cheak(string str,int s,int n){
    if(s>n) return true;
    if(str[s]!=str[n]) return false;
    cheak(str,s-1,n-1);
}
int main(){
    string k ;
    cout<<"input your string : ";
    cin>>k;
    cout<<(((k.size()%2==0)&&(cheak(k,0,k.size()-1)))?"palindrome":"not Palindrome");
}