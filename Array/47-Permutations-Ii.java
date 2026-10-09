// Problem Number: 47
// Problem Name: Permutations II
// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>>all=new ArrayList<>();
    static List<Integer>a=new ArrayList<>();
    static boolean v[];
    public List<List<Integer>> permuteUnique(int[] nums) {
        all.clear();
        a.clear();
        v=new boolean[nums.length];
        Arrays.sort(nums);
        find(nums);
        return all;
    }
    static void find(int arr[])
    {
        if(a.size()==arr.length)
        {
            all.add(new ArrayList<>(a));
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!v[i])
            {
                if(i>0&&arr[i]==arr[i-1]&&!v[i-1])
                {
                    continue;
                }
                a.add(arr[i]);
                v[i]=true;
                find(arr);
                a.remove(a.size()-1);
                v[i]=false;
            }
        }
    }
}