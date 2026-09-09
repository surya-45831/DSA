// Problem Number: 65
// Problem Name: Valid Number
// Difficulty: Hard
// Topic: String

class Solution {
public:
    bool isNumber(const char *s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        for (char *p = s; *p != 0; ++p){
            if ((*p < 48 || *p > 57) && *p != 46 && *p != 32 && *p != 101) return false;
            else if ((p == s || *(p + 1) == 0) && (*p = 101 || *p == 46)) return false;
        }
    return true;
    }
};