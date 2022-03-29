package dsaproblems;

import java.util.*;

public class four_sum {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(j>0 && nums[j]==nums[j-1]){
                continue;
            }
            
            for(int i=j+1;i<nums.length-1;i++){
                if(i>j+1 && nums[i]==nums[i-1]){
                    continue;
                }
                int lo=i+1;
                int hi=nums.length-1;
                while(lo<hi){
                    int tar = nums[j]+nums[i]+nums[lo]+nums[hi];
                    if(tar==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[j]);
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
        }
        return ans;
    }
	
	public static void main(String args[]) {
		// https://leetcode.com/problems/4sum/
		// Call function here
	}

}
