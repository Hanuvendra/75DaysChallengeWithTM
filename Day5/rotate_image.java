package dsaproblems;

public class rotate_image {
	
	public static void reverse(int[][] matrix,int row,int n){
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            int temp = matrix[row][lo];
            matrix[row][lo] = matrix[row][hi];
            matrix[row][hi] = temp;
            lo++;
            hi--;
        }
    }
    public void rotate(int[][] matrix) {
        // Find traverse
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Reversing every row
        for(int i=0;i<n;i++){
            reverse(matrix,i,n);
        }
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/rotate-image/
		// Call function rotate here
	}

}
