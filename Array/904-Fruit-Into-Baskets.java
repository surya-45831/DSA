// Problem Number: 904
// Problem Name: Fruit Into Baskets
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int l=0;
        int m=0;
        int r=0;
        while(r<fruits.length)
        {
            hs.put(fruits[r],hs.getOrDefault(fruits[r],0)+1);
            while(hs.size()>2)
            {
                hs.put(fruits[l],hs.get(fruits[l])-1);
                if(hs.get(fruits[l])==0)
                {
                    hs.remove(fruits[l]);
                }
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;
    }
}