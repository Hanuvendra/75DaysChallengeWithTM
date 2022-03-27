package dsaproblems;

public class container_with_most_water {

	public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int ht = Math.min(height[i],height[j]);
            ans = Math.max(ans,(j-i)*ht);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// https://leetcode.com/problems/container-with-most-water/
		// Call function here
	}

}
