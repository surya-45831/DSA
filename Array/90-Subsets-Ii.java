// Problem Number: 90
// Problem Name: Subsets II
// Difficulty: Medium
// Topic: Array, Backtracking, Bit Manipulation

class Solution {
    static List<List<Integer>>all=new ArrayList<>();
    static ArrayList<Integer>b=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        all.clear();
        b.clear();
        Arrays.sort(nums);
        find(b,nums,0);
        return all;
    }
    static void find(ArrayList<Integer>a,int arr[],int i)
    {
        if(i==arr.length)
        {
            all.add(new ArrayList<>(a));
            return;
        }
        a.add(arr[i]);
        find(a,arr,i+1);
        a.remove(a.size()-1);
        while(i+1<arr.length&&arr[i]==arr[i+1])
        {
            i++;
        }
        find(a,arr,i+1);
    }
}