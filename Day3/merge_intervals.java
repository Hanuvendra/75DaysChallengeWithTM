package dsaproblems;

import java.util.*;

public class merge_intervals {
	
	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n=intervals.length;
        int[][] res = new int[n][2];
        Stack<Integer> st = new Stack<>();
        int j=0;
        for(int i=0;i<n;i++){
            int curr_st = intervals[i][0];
            int curr_end = intervals[i][1];
            if(st.size()==0){
                st.push(curr_st);
                st.push(curr_end);
            }else{
                int end = st.pop();
                int start = st.pop();
                if(curr_st>end){
                    res[j][0]=start;
                    res[j][1]=end;
                    st.push(curr_st);
                    st.push(curr_end);
                    j++;
                }else{
                    st.push(Math.min(curr_st,start));
                    st.push(Math.max(curr_end,end));
                }
            }
        }
        while(st.size()>0){
            res[j][1]=st.pop();
            res[j][0]=st.pop();
            j++;
        }
        int[][] ans = new int[j][2];
        for(int i=0;i<j;i++){
            ans[i][0] = res[i][0];
            ans[i][1] = res[i][1];
        }
        return ans;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/merge-intervals/
		// Call function here
	}

}
