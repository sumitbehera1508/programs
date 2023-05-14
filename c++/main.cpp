#include <bits/stdc++.h>
using namespace std;
int f(int arr[],int n,int k){
    int s=0,e=n-1,ans=-1;
    int mid =(s+e)/2;
    while(s<=e){
        if(arr[mid]==k){
            ans = mid;
            e=mid-1;
        }
        else if(arr[mid]>k){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        mid =(s+e)/2;
    }
    return ans;
}
int l(int arr[],int n,int k){
    int s=0,e=n-1,ans=-1;
    int mid=(s+e)/2;
    while(s<=e){
        if(arr[mid]==k){
            ans=mid;
            s=mid+1;
        }
        else if(arr[mid]<k){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=(s+e)/2;
    }
    return ans;
}
int main(int argc, char const *argv[])
{
    int arr[]={1,2,2,3,3,4,5};
    cout<<f(arr,7,2)<<"       "<<l(arr,7,2);
    return 0;/* code */
}
