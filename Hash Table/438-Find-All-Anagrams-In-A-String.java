// Problem Number: 438
// Problem Name: Find All Anagrams in a String
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer>l=new ArrayList<>();
        if(n<m)
        {
            return l;
        }
        int arr[]=new int[26];
        for(int i=0;i<m;i++)
        {
            arr[s.charAt(i)-'a']--;
            arr[p.charAt(i)-'a']++;
        }
        boolean b=true;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                b=false;
                break;
            }
        }
        if(b)
        {
            l.add(0);
        }
        for(int i=m;i<n;i++)
        {
            arr[s.charAt(i-m)-'a']++;
            arr[s.charAt(i)-'a']--;
            b=true;
            for(int in=0;in<26;in++)
            {
                if(arr[in]!=0)
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                l.add(i-m+1);
            }
        }
        return l;
    }
}