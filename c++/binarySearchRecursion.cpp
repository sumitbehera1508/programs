#include <iostream>
using namespace std;

int binarySearch(int *arr,int s,int e,int k){
    if(s>e) return -1;
    int mid=s+(e-s)/2;
    if(arr[mid]==k) return mid;
    if(arr[mid]<k) binarySearch(arr,mid+1,e,k);
    else binarySearch(arr,s,mid-1,k);
}

int main(){
    int arr[] = {1,2,3,4,5,6};
    int n=6,k=6;
    cout<<binarySearch(arr,0,6,2);
}