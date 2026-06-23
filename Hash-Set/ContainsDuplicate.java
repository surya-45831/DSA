class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>m=new HashSet<>();
        for(int mp:nums)
        {
            if(m.contains(mp))
            {
                return true;
            }
            m.add(mp);
        }
        return false;
    }
}