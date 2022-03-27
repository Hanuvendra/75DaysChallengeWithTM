package dsaproblems;

import java.util.*;

public class subarray_sum_equals_k {
	
	public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            if(map.containsKey(prefixsum-k)){
                count += map.get(prefixsum-k);
            }
            if(map.containsKey(prefixsum)){
                map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
            }else{
                map.put(prefixsum,1);
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/subarray-sum-equals-k/
		// Call function here
	}

}
