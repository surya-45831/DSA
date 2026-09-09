// Problem Number: 132
// Problem Name: Palindrome Partitioning II
// Difficulty: Hard
// Topic: String, Dynamic Programming

class Solution {
public:
bool isPal(string& str, int i, int j) {
   while (i < j) {
      if (str[i] != str[j]) return false;
      i++;
      j--;
   }
   return true;
}

int minCut(string& str, int start, int end) {
   if (end-start < 2 || isPal(str, start, end)) return 0; 
   int minVal = INT_MAX;
   for (int i = start+1; i < end; i++) {
      minVal = min(minCut(str, start, i) + 1 + minCut(str, i+1, end), minVal); 
   } 
   return minVal;
}

    int minCut(string s) {
        minCut(s, 0, s.length())
    }
};