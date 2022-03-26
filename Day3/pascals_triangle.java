package dsaproblems;

import java.util.*;
public class pascals_triangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        res.add(temp);
        for(int i=1;i<numRows;i++){
            temp = new ArrayList<Integer>();
            temp.add(1);
            if(i>=2){
                for(int j=0;j<res.get(res.size()-1).size()-1;j++){
                    temp.add(res.get(res.size()-1).get(j)+res.get(res.size()-1).get(j+1));
                }
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/pascals-triangle/
		// Call function here
	}

}
