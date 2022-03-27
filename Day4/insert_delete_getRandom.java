package dsaproblems;

import java.util.*;

class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> arr;
    Random genRandom;
    public RandomizedSet() {
        arr = new ArrayList<Integer>();
        map = new HashMap<>();
        genRandom = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            arr.add(val);
            map.put(val,arr.size()-1);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int idx = map.get(val);
            if(idx < arr.size()-1){
                int lastidx_val = arr.get(arr.size()-1);
                arr.set(idx,lastidx_val);
                map.put(lastidx_val,idx);
            }
            map.remove(val);
            arr.remove(arr.size()-1);
            return true;
        }
    }
    
    public int getRandom() {
        int random_number = arr.get(genRandom.nextInt(arr.size()));
        return random_number;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

public class insert_delete_getRandom {

	public static void main(String[] args) {
		// https://leetcode.com/problems/insert-delete-getrandom-o1/
	}
}
