class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int k = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                k = 0;
                ans[i] = 0;
            } else {
                k++;
                ans[i] = k;
            }
        }
        k = n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                k = 0;
                ans[i] = 0;
            } else {
                k++;
                ans[i] = Math.min(ans[i], k);
            }
        }

        return ans;
    }
}