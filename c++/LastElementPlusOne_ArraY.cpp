#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        digits[n-1]+=1;
        if(digits[n-1]>9)
        for(int i=n-1;i>=0;i--){
            if(digits[i]>9 && i>0){
                digits[i]=0;
                digits[i-1]+=1;
            }
        }
        if(digits[0]>9){
            digits[0] = 0;
            digits.push_back(0);
            for(int i=n;i>0;i--){
                digits[i]=digits[i-1];
            }
            digits[0]=1;
        }

        return digits;
    }
};