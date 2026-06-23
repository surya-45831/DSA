class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int n:nums)
        {
            if(mp.containsKey(n))
            {
                mp.put(n,mp.get(n)+1);
            }
            else
            {
                mp.put(n,1);
            }
        }
        int m=nums.length/2;
        for(int n:mp.keySet())
        {
            if(mp.get(n)>m)
            {
                return n;
            }
        }
        return -1;
    }
}