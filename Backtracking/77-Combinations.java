// Problem Number: 77
// Problem Name: Combinations
// Difficulty: Medium
// Topic: Backtracking

class Solution {
    static ArrayList<List<Integer>>all=new ArrayList<>();
    static ArrayList<Integer>a=new ArrayList<>();
    static int arr[],s;
    public List<List<Integer>> combine(int n, int k) {
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        s=k;
        all.clear();
        a.clear();
        find(a,0);
        return all;
    }
    static void find(ArrayList<Integer>a,int i)
    {
        if(i==arr.length)
        {
            if(a.size()==s)
            {
                all.add(new ArrayList<>(a));
            }
            return;
        }
        a.add(arr[i]);
        find(a,i+1);
        a.remove(a.size()-1);
        find(a,i+1);
    }
}