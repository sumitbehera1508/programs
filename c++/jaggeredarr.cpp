#include <iostream>
using namespace std;
int main(){
    int row,col;
    cout<<"input no. of rows : ";
    cin>>row;
    int ** arr = new int*[row];
    int * size = new int[row];
    for(int i=0;i<row;i++){
        cout<<"input the number of cols : ";
        cin>>col;
        size[i]=col;
        *(arr+i)=new int[col];
        for(int j=0;j<col;j++){
            cout<<"enter the "<<j+1<<"th number : ";
            cin>>arr[i][j];
        }
    }
   
    for(int i=0;i<row;i++){
        for(int j=0;j<size[i];j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
    for(int i=0;i<row;i++){
        delete arr[i];
    }
    delete arr;
    return 0;
}