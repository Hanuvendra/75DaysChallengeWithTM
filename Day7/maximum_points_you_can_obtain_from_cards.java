package dsaproblems;

public class maximum_points_you_can_obtain_from_cards {
	
 	public int maxScore(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int n=arr.length;
        int i=0;
        int res = sum;
        while(i<k){
            sum -= arr[k-i-1];
            sum += arr[n-i-1];
            res = Math.max(sum,res);
            //System.out.println(sum);
            i++;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
