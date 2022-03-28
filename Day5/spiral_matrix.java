package dsaproblems;

import java.util.*;

public class spiral_matrix {
	
	public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int rmin=0,cmin=0;
        int rmax=arr.length-1,cmax=arr[0].length-1;
        int total = arr.length*arr[0].length;
        int count=0;
        while(count<total){
            // Top
            for(int i=cmin;i<=cmax && count<total;i++){
                res.add(arr[rmin][i]);
                count++;
            }
            rmin++;
            // Right
            for(int i=rmin;i<=rmax && count<total;i++){
                res.add(arr[i][cmax]);
                count++;
            }
            cmax--;
            // Bottom
            for(int i=cmax;i>=cmin && count<total;i--){
                res.add(arr[rmax][i]);
                count++;
            }
            rmax--;
            // Left
            for(int i=rmax;i>=rmin && count<total;i--){
                res.add(arr[i][cmin]);
                count++;
            }
            cmin++;
        }
        return res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/spiral-matrix/
		// Call function here
	}

}
