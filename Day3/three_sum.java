package dsaproblems;

import java.util.*;

public class three_sum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int lo=i+1;
            int hi=nums.length-1;
            int target = -nums[i];
            while(lo<hi){
                int tar = nums[lo]+nums[hi];
                if(tar==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[lo]);
                    temp.add(nums[hi]);
                    ans.add(temp);
                    lo++;
                    hi--;
                    while(lo<hi && nums[lo]==nums[lo-1]) lo++;
                    while(lo<hi && nums[hi]==nums[hi+1]) hi--;
                }else if(tar > target){
                    hi--;
                }else{
                    lo++;
                }
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/3sum/
		// Call function here

	}

}
