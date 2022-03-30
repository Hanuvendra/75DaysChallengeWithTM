package dsaproblems;

public class find_the_duplicate_number {
	
	public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                return Math.abs(nums[i]);
            }else{
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
        return nums[0];
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-the-duplicate-number/
		// Call function here
	}

}
