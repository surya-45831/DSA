// Problem Number: 127
// Problem Name: Word Ladder
// Difficulty: Hard
// Topic: Hash Table, String, Breadth-First Search, Bidirectional Search

public class Solution {
    public boolean is_one_letter_diff(String str1, String str2){
        int count = 0;
        if(str1.length() != str2.length())
        return false;
        
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
                count++;
        }
        if(count == 1)
            return true;
        else
            return false;
    }
    public int ladderLength(String start, String end, HashSet<String> dict) {
        Set already = new HashSet();
        ArrayList<String> result = new ArrayList<String>();
        while(already.size() < dict.size())
        {
            String current = start;
            for(String str : dict){
                if (already.contains(str))
                    continue;
                if(is_one_letter_diff(current,str)){
                    already.add(str);
                    result.add(str);
                    if (str.equals(end)){
                        return result.size();
                    }
                    
                }
            }
        }
        return 0;
    }
}
