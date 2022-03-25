package dsaproblems;

public class find_pivot_index {
	
	public int pivotIndex(int[] arr) {
        int n=arr.length;
        int tsum=0;
        int lsum=0;
        for(int i=0;i<n;i++){
            tsum += arr[i];
        }
        for(int i=0;i<n;i++){
            tsum -= arr[i];
            if(lsum==tsum){
                return i;
            }
            lsum += arr[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-pivot-index/submissions/
		// Call function here
	}

}
