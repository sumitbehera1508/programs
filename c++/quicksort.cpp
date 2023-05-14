#include <iostream>

using namespace std;

int position(int *arr,int s,int e,int & c){
    int pivot = arr[s];
    int count =0;

    //count position
    for(int i=s+1;i<=e;i++) 
        if(arr[i]<=pivot) count ++;
    
    // swap to deserved position
    int pivotIndex=s+count;
    swap(arr[s],arr[pivotIndex]); c++;
    
    //crate partiotions 
    int i=s,j=e;
    while(i<pivotIndex&&j>pivotIndex){
        //cheak left part
        while(arr[i]<=arr[pivotIndex]) i++;
        //cheak right part
        while(arr[j]>arr[pivotIndex]) j--;

        //swap to make partition 
        if(i<pivotIndex && j>pivotIndex){
            swap(arr[i++],arr[j--]);c++;
        }
    }
    return pivotIndex;
}

void quickSort(int *arr,int s,int e,int& c){
    if(s>=e) return;
    int p=position(arr,s,e,c);
    quickSort(arr,s,p-1,c);
    quickSort(arr,p+1,e,c);
}

int main(){
    int n,c=0;
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
    quickSort(arr,0,n-1,c);
    cout<<"\n the sorted array is : \n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<"\n total swaps is "<<c;
}