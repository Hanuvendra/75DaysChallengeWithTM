package dsaproblems;

import java.util.*;

public class subarray_sums_divisible_by_k{
	
	public boolean subarraysDivByK(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int preSum = 0;
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            preSum += arr[i];
            int rem = preSum%k;
            if(rem < 0) rem+=k;
            if(freq.containsKey(rem)){
                count += freq.get(rem);
                freq.put(rem,freq.get(rem)+1);
            }else{
                freq.put(rem,1);
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-all-duplicates-in-an-array/
		// Call subarraysDivByK function here
	}

}
