// Problem Number: 733
// Problem Name: Flood Fill
// Difficulty: Easy
// Topic: Breadth-First Search

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c=image[sr][sc];
        if(c==color)
        {
            return image;
        }
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        while(!q.isEmpty())
        {
            int p[]=q.poll();
            if(p[0]<0||p[0]>=image.length||p[1]<0||p[1]>=image[0].length)
            {
                continue;
            }
            if(image[p[0]][p[1]]!=c)
            {
                continue;
            }
            int r=p[0];
            int s=p[1];
            image[r][s]=color;
            q.add(new int[]{r+1,s});
            q.add(new int[]{r-1,s});
            q.add(new int[]{r,s+1});
            q.add(new int[]{r,s-1});
        }
        return image;
    }
}