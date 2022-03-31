package dsaproblems;

import java.util.*;

public class find_all_duplicates_in_an_array {
	
	public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0){
                res.add(idx+1);
            }else{
                nums[idx] = -nums[idx];
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-all-duplicates-in-an-array/
		// Call function here
	}

}
