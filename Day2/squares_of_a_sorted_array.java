package dsaproblems;

public class squares_of_a_sorted_array {

	public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] res = new int[j+1];
        int idx=j;
        while(i<=j){
            int num1 = Math.abs(nums[i]);
            int num2 = Math.abs(nums[j]);
            if(num1<num2){
                res[idx]=num2*num2;
                j--;
            }else{
                res[idx]=num1*num1;
                i++;
            }
            idx--;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
		// Call function here
	}

}
