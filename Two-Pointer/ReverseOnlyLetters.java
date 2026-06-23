class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j)
        {
            if(Character.isLetter(s.charAt(i))&&Character.isLetter(s.charAt(j)))
            {
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else if(Character.isLetter(s.charAt(i)))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new String(arr);
    }
}