// Problem Number: 20
// Problem Name: Valid Parentheses
// Difficulty: Easy
// Topic: String, Stack, Bracket Sequences

class Solution {
public:
    bool isValid(string s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int size=s.size();
        stack<char> st;
        if (size==0) return true;
        
        for(int i=0; i<size;i++){
            if(i==0)
                st.push(s[i]);
            else{
                if(s[i]==')'){
                    if (!st.empty()&&st.top()=='(')
                        st.pop();
                    else
                        return false;
                }
                else ifs[i]=='}'){
                    if (!st.empty()&&st.top()=='{')
                        st.pop();
                    else
                        return false;
                }
                else if(s[i]==']'){
                    if (!st.empty()&&st.top()=='[')
                        st.pop();
                    else
                        return false;
                }
                else
                    st.push(s[i]);
                    
            }
        }
        return st.empty();
    }
};