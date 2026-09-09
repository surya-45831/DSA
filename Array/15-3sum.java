// Problem Number: 15
// Problem Name: 3Sum
// Difficulty: Medium
// Topic: Array, Two Pointers, Sorting

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i<num.length; i++) {
            int j = i+1;
            int k = num.length-1;
            while(j<k&&j<num.length) {
                    int sum = num[i] + num[j] + num[k];
                    if(sum==0) {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[k]);
                        res.add(tmp);
                        j++;
                        k--;
                    } else if(sum>0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        return res;
        }
    }
}