// Problem Number: 46
// Problem Name: Permutations
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>>all=new ArrayList<>();
    static List<Integer>a=new ArrayList<>();
    static boolean v[];
    public List<List<Integer>> permute(int[] nums) {
        all.clear();
        a.clear();
        v=new boolean[nums.length];
        find(nums);
        return all;
    }
    static void find(int arr[])
    {
        if(a.size()==arr.length)
        {
            all.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!v[i])
            {
                a.add(arr[i]);
                v[i]=true;
                find(arr);
                a.remove(a.size()-1);
                v[i]=false;
            }
        }
    }
}