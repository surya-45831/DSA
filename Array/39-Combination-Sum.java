// Problem Number: 39
// Problem Name: Combination Sum
// Time Complexity: O(1)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>> all=new ArrayList<>();
    static List<Integer>al=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        all.clear();
        al.clear();
        find(0,candidates,target,0);
        return all;
    }
    static void find(int i,int arr[],int t,int s)
    {
        if(s==t)
        {
            all.add(new ArrayList<>(al));
            return;
        }
        if(i==arr.length||t<s)
        {
            return;
        }
        al.add(arr[i]);
        find(i,arr,t,s+arr[i]);
        al.remove(al.size()-1);
        find(i+1,arr,t,s);

    }
}