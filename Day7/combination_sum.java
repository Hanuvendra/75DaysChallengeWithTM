package dsaproblems;

import java.util.*;

public class combination_sum {
	
	public static void findSum(int[] candidates,int idx,int target,List<List<Integer>> final_res,List<Integer> curr_res){
        if(target==0){
            final_res.add(new ArrayList<>(curr_res));
            return;
        }
        if(idx==candidates.length || target<0){
            return;
        }
        findSum(candidates,idx+1,target,final_res,curr_res);
        curr_res.add(candidates[idx]);
        findSum(candidates,idx,target-candidates[idx],final_res,curr_res);
        curr_res.remove(curr_res.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> final_res = new ArrayList<>();
        List<Integer> curr_res = new ArrayList<>();
        findSum(candidates,0,target,final_res,curr_res);
        return final_res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/combination-sum/
		// Call function here
	}

}
