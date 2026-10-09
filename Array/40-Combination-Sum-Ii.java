// Problem Number: 40
// Problem Name: Combination Sum II
// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>> all = new ArrayList<>();
    static List<Integer> al = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        all.clear();
        al.clear();
        Arrays.sort(candidates);
        find(candidates, target, 0);
        return all;
    }
    static void find(int[] arr, int target, int start) {
        if (target == 0) {
            all.add(new ArrayList<>(al));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            al.add(arr[i]);
            find(arr, target - arr[i], i + 1);
            al.remove(al.size() - 1);
        }
    }
}