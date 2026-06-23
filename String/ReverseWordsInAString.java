class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder s2=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        { 
           
            s2.append(arr[i]);
            if(i!=0)
            {
                s2.append(" ");
            }
            
        }
        return new String(s2);
    }
}