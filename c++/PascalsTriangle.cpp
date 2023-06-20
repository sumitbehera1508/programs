#include <bits\stdc++.h>
using namespace std;
//bruteforce vector 
 vector<int> getRow(int rowIndex) {
       vector<vector<int>>ans;
       for(int i=0;i<=rowIndex;i++){
           vector<int>v;
           for(int j=0;j<=i;j++){
               if(j==0 || j==i){
                   v.push_back(1);
               }
               else
               v.push_back(ans[i-1][j]+ans[i-1][j-1]);
           }
           ans.push_back(v);
       }
       return ans[rowIndex];
    }

// Recurrsion
vector<int> getRow(int rowIndex) {
        if(rowIndex==0) return {1}; // Base Case

        vector<int> currentRow = {1}; // current row with 1 value in it
        vector<int> previousRow = getRow(rowIndex-1); // get the previous row

        // Now fill the current row based on previous row
        for(int i=1;i<rowIndex;i++){
            currentRow.push_back(previousRow[i-1]+previousRow[i]);
        }

        currentRow.push_back(1); // fill the last element of current row
        return currentRow;
}

