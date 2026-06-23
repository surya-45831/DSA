class Solution {
    public int maxVowels(String s, int k) {
        int m=0;
        char arr[]=s.toCharArray();
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='i'||arr[i]=='u')
            {
                c++;
            }
        }
        m=c;
        for(int i=k;i<arr.length;i++)
        {

            if(arr[i-k]=='a'||arr[i-k]=='e'||arr[i-k]=='i'||arr[i-k]=='o'||arr[i-k]=='u')
            {
                c--;
            }
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='i'||arr[i]=='u')
            {
                c++;
            }
            m=Math.max(m,c);
            
        }
        return m;
    }
}