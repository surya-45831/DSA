// Problem Number: 541
// Problem Name: Reverse String II
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int l=i;
            int j=Math.min(i+k-1,s.length()-1);
            while(l<j)
            {
                char ch=arr[l];
                arr[l]=arr[j];
                arr[j]=ch;
                l++;
                j--;
            }
        }
        return new String(arr);
    }
}