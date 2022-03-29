package dsaproblems;

import java.util.*;

public class pairs_of_songs_with_total_durations_divisible_by_60 {
	
	public int numPairsDivisibleBy60(int[] time) {
        int n=time.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num=time[i]%60;
            int diff = num == 0 ? 0 : 60 - num;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
		// Call function here
	}

}
