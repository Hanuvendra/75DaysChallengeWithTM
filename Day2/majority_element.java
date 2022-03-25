package dsaproblems;

public class majority_element {
	
	public int majorityElement(int[] nums) {
        int count=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }else{
                if(count==0){
                    val = nums[i];
                    count=1;
                }else{
                    count--;
                }
            }
        }
        return val;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/majority-element/submissions/
		// Call function here
	}

}
