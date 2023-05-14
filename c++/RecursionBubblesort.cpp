#include <iostream>
using namespace std;
void put(int *arr,int s,int e){
    if(s==e) return;
    if(arr[s]>arr[s+1]) swap(arr[s],arr[s+1]);
    put(arr,s+1,e);
}
void boubleSort(int *arr,int s,int e){
       if(s==e) return;
       put(arr,0,e-1);
       boubleSort(arr,s+1,e);
}
int main(){
     int e;
     cout<<"the size of array : ";
     cin>>e;
     int * arr = new int[e];
     for(int i=0;i<e;i++){
        cout<<"input "<<i+1<<"th element : ";
        cin>>arr[i];
     }
     boubleSort(arr,1,e);
     for(int i=0;i<e;i++) cout<<arr[i]<<" ";
     delete [] arr;
}