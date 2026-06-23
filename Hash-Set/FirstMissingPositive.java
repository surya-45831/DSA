class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>a=new HashSet<>();
        for(int n:nums)
        {
            a.add(n);
        }
        int i=1;
        for( i=1;i<=nums.length;i++)
        {
            if(!a.contains(i))
            {
                return i; 
            }
        }
        return i;
    }
}