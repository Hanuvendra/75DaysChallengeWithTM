package dsaproblems;

public class game_of_life {
	
	static int[] xdir = {-1,-1,0,1,1,1,0,-1};
    static int[] ydir = {0,-1,-1,-1,0,1,1,1};
    public static int dfs(int[][] board,int i,int j){
        int count=0;
        for(int d=0;d<8;d++){
            int r=i+xdir[d];
            int c=j+ydir[d];
            if(r>=0 && c>=0 && r<board.length && c<board[0].length && (board[r][c]==1 || board[r][c]==2)){
                count++;
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int ones = dfs(board,i,j);
                if(board[i][j]==0 && ones==3){
                    board[i][j]=3;
                }
                if(board[i][j]==1 && (ones<2 || ones>3)){
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = board[i][j]%2;       
            }
        }
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/game-of-life/
		// Call function here
	}

}
