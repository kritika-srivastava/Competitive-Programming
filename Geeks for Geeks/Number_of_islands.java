/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Number_of_islands.java
 * @author Kritika Srivastava
 * @since July 27, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1/
 */
// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                char[][] grid = new char[n][m];
                for(int i = 0; i < n; i++){
                    String[] S = br.readLine().trim().split(" ");
                    for(int j = 0; j < m; j++){
                        grid[i][j] = S[j].charAt(0);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.numIslands(grid);
                System.out.println(ans);
            }
        }
    }// } Driver Code Ends
    
    
    
    class Solution
    {
        //Function to find the number of islands.
        public int numIslands(char[][] grid)
        {
            boolean visited[][]=new boolean[grid.length][grid[0].length];
            int x=0;
            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[0].length;j++)
                {
                    if(!visited[i][j] && grid[i][j]=='1')
                    {
                        x++;
                         dfs(grid,visited,i,j);
                    }
                }
            }
           return x;
            
        }
        static void dfs(char[][] grid,boolean[][] visited,int i,int j)
        {
            if(visited[i][j])
            {
                return;
            }
            if(!visited[i][j])
            {
                visited[i][j]=true;
            }
            if(grid[i][j]=='0')
            {
                return;
            }
            if(i-1>=0 && j-1>=0)
            {
                dfs(grid,visited,i-1,j-1);
            }
            if(j-1>=0)
            {
                dfs(grid,visited,i,j-1);
            }
            if(i+1<grid.length && j-1>=0)
            {
                dfs(grid,visited,i+1,j-1);
            }
            if(i-1>=0)
            {
                dfs(grid,visited,i-1,j);
            }
            if(i+1<grid.length)
            {
                dfs(grid,visited,i+1,j);
            }
            if(i-1>=0 && j+1<grid[0].length)
            {
                dfs(grid,visited,i-1,j+1);
            }
            if(j+1<grid[0].length)
            {
                dfs(grid,visited,i,j+1);
            }
            if(i+1<grid.length && j+1<grid[0].length)
            {
                dfs(grid,visited,i+1,j+1);
            }
            return;
        }
    }