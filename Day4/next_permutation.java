package dsaproblems;

class Solution {
    public static int findFromRight(int[] nums){
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static int justGreateOnRight(int[] nums,int idx){
        int i=nums.length-1;
        while(i>idx){
            if(nums[i]>nums[idx]){
                return i;
            }
            i--;
        }
        return -1;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int first_sm_from_right = findFromRight(nums);
        //System.out.println(first_sm_from_right);
        if(first_sm_from_right==-1){
            reverse(nums,0,nums.length-1);
        }else{
            int just_greater = justGreateOnRight(nums,first_sm_from_right);
            //System.out.println(just_greater);
            swap(nums,first_sm_from_right,just_greater);
            reverse(nums,first_sm_from_right+1,nums.length-1);
        }
    }
}

public class next_permutation {

	public static void main(String[] args) {
		// https://leetcode.com/problems/next-permutation/
	}
}
