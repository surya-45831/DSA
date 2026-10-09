// Problem Number: 2379
// Problem Name: Minimum Recolors to Get K Consecutive Black Blocks
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                c++;
            }
        }
        int min=c;
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i)=='W')
            {
                c++;
            }
            if(blocks.charAt(i-k)=='W')
            {
                c--;
            }
            min=Math.min(min,c);
        }
        return min;
    }
}