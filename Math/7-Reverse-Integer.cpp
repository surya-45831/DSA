// Problem Number: 7
// Problem Name: Reverse Integer
// Difficulty: Medium
// Topic: Math

class Solution {
public:
    int reverse(int x) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if(x/10==0)return x;
        bool flag=x>0;
        if(!flag)x=-x;
        vector<int> digits;
        while(x!=0){
            digits.push_back(x%10);
            x/=10;
        }
        int ret=0;
         
        for(int i=0;i<digits.size();i++){
           ret*=10;
           ret+=digits[i];
            
        }
        if(!flag)ret=-ret;
        return ret;
    }
};