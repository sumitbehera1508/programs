#include <iostream>
using namespace std;
bool ispresent(int arr[],int n,int k){
    if(n==0) return false;
    if(arr[0]==k) return true;
    ispresent(arr+1,n-1,k);
}
long long sum(int arr[],int n){
    if(n==1) return arr[0];
    return arr[0]+sum(arr+1,n-1);
}
bool issort(int arr[],int n){
    if(n<2) return true;
    if(arr[0]>arr[1]) return false;
    else issort(arr+1,n-1);
}
int main(){
    int n,k;
    cout<<"enter the number of elemts in arr : ";
    cin>>n;
    int * arr = new int[n];
    for(int i=0;i<n;i++){
        cout << "enter the element at index "<<i<<" : ";
        cin>>arr[i];
    }
    if(issort(arr,n)) cout<<"Sorted"<<endl;
    else cout<<"Not Sorted"<<endl;

    cout<<"the sum is "<<sum(arr,n)<<endl;

    cout<<"\n enter the element you want to search : ";
    cin>>k;
    cout<<"the number is "<<(ispresent(arr,n,k)?"present":"not present");
    delete [] arr;
    return 0;
}