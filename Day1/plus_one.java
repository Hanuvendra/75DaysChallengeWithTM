package dsaproblems;

import java.util.*;

public class plus_one {
	
	public int[] plusOne(int[] digits) {
        ArrayList<Integer> res = new ArrayList<>();
        int n=digits.length;
        int sum = digits[n-1]+1;
        int carry = sum/10;
        int rem = sum%10;
        res.add(rem);
        for(int i=n-2;i>=0;i--){
            sum = carry + digits[i];
            rem = sum%10;
            carry = sum/10;
            res.add(rem);
        }
        if(carry>0){
            res.add(carry);
        }
        int size = res.size();
        int[] ans = new int[size];
        for(int i=size-1;i>=0;i--){
            ans[size-1-i] = res.get(i);
        }
        return ans;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/plus-one/
		// Call function here
	}

}
