// Problem Number: 115
// Problem Name: Distinct Subsequences
// Difficulty: Hard
// Topic: String, Dynamic Programming

class Solution {
public:
    int numDistinct(string S, string T) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int sizes=S.size();
        int sizet=T.size();
        if(sizes==0)return 0;
        if(sizet==0)return 0;
        if(sizes<sizet)return 0;
        vector<vector <int>> result;
        vector<int> inter;
        int initial=0;
        for(int i=0;i<sizes;i++)
        {
            result.push_back(inter);
        }
        for(int i=0;i<sizes;i++)
        {
            for(int j=0;j<sizet;j++)
            {
                result[i].push_back(initial);
            }
        }
        if(S[0]==T[0])result[0][0]=1;
        else result[0][0]=0;
        for(int i=1;i<sizes;i++)
        {
            result[i][0]=result[i-1][0];
            if(S[i]==T[0])result[i][0]++;
        }
        for(int j=1;j<sizet;j++)
        {
            for(int i=j;i<sizes;i++)
            {
                result[i][j]=result[i-1][j];
                if(S[i]==T[j])result[i][j]=result[i][j]+result[i-1][j-1];
            }
        }
        return result[sizes-1][sizet-1];
    }
};