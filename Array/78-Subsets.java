// Problem Number: 78
// Problem Name: Subsets
// Difficulty: Medium
// Topic: Array, Backtracking, Bit Manipulation

class Solution {
    static List<List<Integer>>al=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     al.clear();
     ArrayList<Integer>l=new ArrayList<>();
     find(0,nums,l);  
     return al; 
    }
    static void find(int i,int nums[],ArrayList<Integer>l)
    {
        if(i==nums.length)
        {
        al.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        find(i+1,nums,l);
        l.remove(l.size()-1);
        find(i+1,nums,l);
    }
}