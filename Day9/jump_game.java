package dsaproblems;

import java.util.*;

public class jump_game{
	
	public boolean canJump(int[] nums) {
        int l=0;
        int r=0;
        if(nums.length==1) return true;
        while(r<nums.length){
            int max_idx=0;
            for(int i=l;i<=r;i++){
                max_idx = Math.max(max_idx,i+nums[i]);
            }
            l=r+1;
            r=max_idx;
            System.out.println(r);
            if(r>=nums.length-1){
                return true;
            }else if(max_idx==0) return false;
            
        }
        return false;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-all-duplicates-in-an-array/
		// Call canJump function here
	}

}
