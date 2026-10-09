// Problem Number: 1652
// Problem Name: Defuse the Bomb
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int[n];
        if(k==0)
        {
            return arr;
        }
        else if(k>0)
        {
            int sum=0;
            for(int i=1;i<=k;i++)
            {
                sum+=code[i];
            }
            arr[0]=sum;
            int r=1;
            while(r<n)
            {
                int l=r+k;
                if(l>=n)
                {
                    l=l-n;
                }
                sum=arr[r-1]-code[r]+code[l];
                arr[r++]=sum;
            }
            return arr;
        }
        else
        {
            int sum=0;
            for(int i=n-1;i>=n+k;i--)
            {
                sum+=code[i];
            }
            arr[0]=sum;
            int r=1;
            while(r<n)
            {
                int l=r+k-1;
                if(l<0)
                {
                    l=n+l;
                }
                sum=sum+code[r-1]-code[l];
                arr[r++]=sum;
            }
            return arr;

        }
    }
}