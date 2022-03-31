package dsaproblems;

public class majority_element {
	
	public int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(Integer key : map.keySet()){
            if(k==0){
                if(map.get(key)>=2){
                    count++;
                }
            }else{
                if(map.containsKey(key+k)){
                    count++;
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// https://leetcode.com/problems/majority-element/submissions/
		// Call function here
	}

}
