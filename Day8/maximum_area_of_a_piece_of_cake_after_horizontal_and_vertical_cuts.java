package dsaproblems;

import java.util.*;

public class maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts {
	
	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long mod=1000000007;
        int n=horizontalCuts.length;
        int maxh=0;
        int currh=0;
        Arrays.sort(horizontalCuts);
        for(int i=0;i<n;i++){
            maxh = Math.max(maxh,horizontalCuts[i]-currh);
            currh = horizontalCuts[i];
        }
        maxh = Math.max(maxh,h-currh);
        int m=verticalCuts.length;
        int maxv=0;
        int currv=0;
        Arrays.sort(verticalCuts);
        for(int i=0;i<m;i++){
            maxv = Math.max(maxv,verticalCuts[i]-currv);
            currv = verticalCuts[i];
        }
        maxv = Math.max(maxv,w-currv);
        long ans = (maxh%mod*maxv%mod)%mod;
        return (int)ans;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
		// Call function here
	}

}
