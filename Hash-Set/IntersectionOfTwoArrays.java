class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>s=new HashSet<>();
        HashSet<Integer>inter=new HashSet<>();
        for(int n:nums1)
        {
            s.add(n);
        }
        for(int n:nums2)
        {
            if(s.contains(n))
            {
                inter.add(n);
            }
        }
        int arr[]=new int[inter.size()];
        int in=0;
        for(int nu:inter)
        {
            arr[in++]=nu;
        }
        return arr;
    }
}