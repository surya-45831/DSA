class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.add(ch);
            }
            else
            {
                if(st.size()==0)
                {
                    return false;
                }
                char cc=st.pop();
                if((ch==')' && cc!='(')||(ch=='}'&& cc!='{')||(ch==']'&&cc!='['))
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}