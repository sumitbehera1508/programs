#include <bits/stdc++.h>
using namespace std;

void heapify(int arr[],int size , int i){
    int largest = i, left = 2*i,right=2*i+1;
    if(left < size && arr[largest] < arr[left]){
        largest = left;
    }
    if(right < size && arr[largest] < arr[right]){
        largest = right;
    }

    if(largest !=i){
        swap(arr[largest],arr[i]);
        heapify(arr,size,largest);
    }
}


class heap{
    public:
    int arr[100],size=0;

    void insert(int val){
        size++;
        int index = size;
        arr[index] = val;

        while(index > 1){
            int parent = index/2;
            if(arr[parent]<arr[index]){
                swap(arr[parent],arr[index]);
                index = parent;
            }
            else{
                return;
            }
        }
    }

    void print(){
        for(int i=1;i<=size;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }

    void deleteheap(){
        if(size==0){
            cout<<"Nothing to be deleted from empty heap"<<endl;
            return ;
        }
        arr[1]=arr[size];
        size--;

        heapify(arr,size,1);
    }
};


int main(){
    heap h1;
    cout<<"enter the number you want to enter : ";
    int n;
    cin>>n;
    cout<<"enter the "<<n<<" numbers : ";
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        h1.insert(temp);
    }

    h1.print();
    h1.deleteheap(),h1.print();
}
