package dsaproblems;

public class jump_game_ii {
	
	public int jump(int[] nums) {
        int res=0;
        int i=0;
        int r=0;
        int max_idx=0;
        while(r<nums.length-1){
            int j=i;
            while(j<=r){
                max_idx = Math.max(max_idx,j+nums[j]);
                j++;
            }
            i=r+1;
            r=max_idx;
            res++;
        }
        return res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/jump-game-ii/
		// Call function here
	}

}
