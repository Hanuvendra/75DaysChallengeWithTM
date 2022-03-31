package dsaproblems;

public class max_area_of_island {
	
	static int[] xdir = {-1,0,1,0};
    static int[] ydir = {0,-1,0,1};
    static int count;
    public static void countones(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return;
        }
        count++;
        grid[i][j]=0;
        for(int d=0;d<4;d++){
            int r=i + xdir[d];
            int c=j + ydir[d];
            countones(grid,r,c);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count=0;
                    countones(grid,i,j);
                    res = Math.max(res,count);
                }
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/max-area-of-island/
		// Call function here
	}

}
