package dsaproblems;

import java.util.*;

public class two_sum {
	
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// https://leetcode.com/problems/two-sum/
		//Call function here
	}
}
