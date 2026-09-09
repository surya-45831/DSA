// Problem Number: 350
// Problem Name: Intersection of Two Arrays II
// Difficulty: Easy
// Topic: Array, Hash Table, Two Pointers, Binary Search, Sorting

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int x:nums1)
        {
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        for(int x:nums2)
        {
            if(hs.getOrDefault(x,0)>0)
            {
                al.add(x);
                hs.put(x,hs.get(x)-1);
            }
        }
        int arr[]=new int[al.size()];
        int i=0;
        for(int x:al)
        {
            arr[i++]=x;
        }
        return arr;
    }
}