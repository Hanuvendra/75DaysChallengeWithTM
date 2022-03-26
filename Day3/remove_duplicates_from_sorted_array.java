package dsaproblems;

public class remove_duplicates_from_sorted_array {
	
	public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int curridx=1;
        int currval=nums[0];
        int k=1;
        while(curridx<n){
            if(nums[curridx]==currval){

            }else{
                nums[k]=nums[curridx];
                currval = nums[curridx];
                k++;
            }
            curridx++;
        }
        return k;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
		// Call function here
	}

}
