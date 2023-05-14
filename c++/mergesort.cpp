#include <iostream>
using namespace std;
int c=0;
void merge(int * arr,int s,int e){
    int mid = (s+e)/2;
    int len1=mid-s+1;
    int len2=e-mid;

    //devide the arr into two
    int * first = new int[len1];
    int * second = new int[len2];
    int mainarrindex=s;
    for(int i=0;i<len1;i++) first[i]=arr[mainarrindex++];
    for(int i=0;i<len2;i++) second[i]=arr[mainarrindex++];

    //merge divided two arr
    int index1 =0,index2=0;
    mainarrindex=s;
    while (index1<len1 && index2<len2)
    {
        if(first[index1]<=second[index2]) arr[mainarrindex++] = first[index1++];
        else {arr[mainarrindex++]=second[index2++];c+=len1-index1;}
    }
    // left while merging 
    while(index1<len1) arr[mainarrindex++]=first[index1++];
    while(index2<len2) arr[mainarrindex++] = second[index2++];

    delete [] first;
    delete [] second;
}
void mergesort(int * arr,int s,int e){
    if(s>=e) return;
    int mid = (s+e)/2;
    mergesort(arr,s,mid);
    mergesort(arr,mid+1,e);
    merge(arr,s,e);
}
int main(){
    int n;
    cout<<"enter the number of elements in the array : ";
    cin>>n;
    int * arr = new int[n];
    for(int i=0;i<n;i++){
        cout<<"enter the "<<i+1<<"th element : ";
        cin>>arr[i];
    }
    cout<<"the array is \n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    mergesort(arr,0,n-1);
    cout<<"\n the sorted array is : \n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<"\n "<<c;
}