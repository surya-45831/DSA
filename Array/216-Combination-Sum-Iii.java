// Problem Number: 216
// Problem Name: Combination Sum III
// Time Complexity: O(1)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>> all =new ArrayList<>();
    static List<Integer>a=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        all.clear();
        a.clear();
        find(1,0,k,n);
        return all;
    }
    static void find(int i,int s,int k,int n)
    {
        if(s==n&&a.size()==k)
        {
            all.add(new ArrayList<>(a));
            return;
        }
        if(s>n||i==10||a.size()>k)
        {
            return;
        }
        a.add(i);
        find(i+1,s+i,k,n);
        a.remove(a.size()-1);
        find(i+1,s,k,n);
    }
}