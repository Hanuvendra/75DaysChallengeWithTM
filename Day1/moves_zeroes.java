package dsaproblems;

public class moves_zeroes {
	
	public void moveZeroes(int[] nums) {
        int idx=0;
        int zero_idx=0;
        while(zero_idx<nums.length){
            if(nums[zero_idx]==0){
                zero_idx++;
            }else{
                int temp = nums[idx];
                nums[idx] = nums[zero_idx];
                nums[zero_idx] = temp;
                zero_idx++;
                idx++;
            }
        }
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/move-zeroes/submissions/
		// Call function here
	}

}
