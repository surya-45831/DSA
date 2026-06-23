class Solution {
    public int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
     int max=0;
     int n=height.length;
     while(i<j)
     {
        int min=Math.min(height[i],height[j]);
        max=Math.max(max,(j-i)*min);
        if(min==height[i])
        {
            i++;
        }
        else
        {
            j--;
        }
     }   
     return max;
    }
}