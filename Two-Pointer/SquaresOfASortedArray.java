class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int arr[]=new int[j+1];
        for(int a=nums.length-1;a>=0;a--)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                arr[a]=nums[i]*nums[i];
                i++;
            }
            else
            {
                arr[a]=nums[j]*nums[j];
                j--;
            }
        }
        return arr;
    }
}