// Problem Number: 17
// Problem Name: Letter Combinations of a Phone Number
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    static String d[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String>all=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        all.clear();
        find(digits,0,new StringBuilder());
        return all;
    }
    static void find(String s,int i,StringBuilder ss)
    {
        if(ss.length()==s.length())
        {
            all.add(ss.toString());
            return;
        }
        String l=d[s.charAt(i)-'0'];
        for(int j=0;j<l.length();j++)
        {
            ss.append(l.charAt(j));
            find(s,i+1,ss);
            ss.deleteCharAt(ss.length()-1);

        }
    }
}