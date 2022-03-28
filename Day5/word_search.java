package dsaproblems;

public class word_search {
	
	private boolean dfs(char[][] board,String word,int idx,int i,int j,boolean[][] visited){
        if(word.length() == idx){
            return true;
        }
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || board[i][j]!=word.charAt(idx) ||visited[i][j]==true){
            return false;
        }
        
        visited[i][j]=true;
        if(dfs(board,word,idx+1,i-1,j,visited) || dfs(board,word,idx+1,i,j-1,visited) || dfs(board,word,idx+1,i+1,j,visited) || dfs(board,word,idx+1,i,j+1,visited)){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,word,0,i,j,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/word-search/
		// Call function exist here
	}

}
