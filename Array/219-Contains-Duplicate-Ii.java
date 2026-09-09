// Problem Number: 219
// Problem Name: Contains Duplicate II
// Difficulty: Easy
// Topic: Array, Hash Table, Sliding Window

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>al=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!al.add(nums[i]))
            {
                return true;
            }
            if(al.size()>k)
            {
                al.remove(nums[i-k]);
            }
        }
        return false;
    }
}