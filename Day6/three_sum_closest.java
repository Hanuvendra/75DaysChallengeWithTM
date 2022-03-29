package dsaproblems;

import java.util.*;

public class three_sum_closest {
	
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int result = nums[0]+nums[1]+nums[2];
        while(i<nums.length){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if(sum>target){
                    hi--;
                }else{
                    lo++;
                }
                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result = sum;
                }
            }
            i++;
        }
        return result;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/3sum-closest/
		// Call function here
	}

}
