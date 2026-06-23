class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>p=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                int n=target-nums[i];
                if(p.containsKey(n))
                {
                    return new int[]{p.get(n),i};
                }
                p.put(nums[i],i);
            }
            return new int[]{};
    }
}