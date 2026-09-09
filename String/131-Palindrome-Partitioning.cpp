// Problem Number: 131
// Problem Name: Palindrome Partitioning
// Difficulty: Medium
// Topic: String, Dynamic Programming, Backtracking

class Solution {
public:
    vector<vector<string>> partition(string s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<vector<string>> vec;
        if(vec.size()==0)
            return vec;
        vector<int> index;
        index.push_back(-1);
        backtracing(vec,0,s,index);
        return vec;
    }
    
    void backtracing(vector<vector<string>> &vec, int i, string s, vector<int> &index)
    {
        if(i==s.size())
        {
            vector<string> str;
            for(int t=0;t<index.size()-1;t++)
            {
                str.push_back(s.substr(index[t]+1,index[t+1]-index[t]));
            }
            vec.push_back(str);
        }
        
        for(int j=i;j<s.size();j++)
        {
            if(isPalin(s,i,j))
            {
                index.push_back(j);
                backtracing(vec,j+1,s,index);
                index.pop_back();
            }
        }
    }
    
    bool isPalin(string s, int i, int j)
    {
        while(i<j)
        {
            if(s[i++]!=s[j--])
                return false;
        }
        return true;
    }
};