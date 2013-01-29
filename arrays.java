/**
 *		arrays
 *
 * 			Methods for dealing with arrays
 *
 * 		Anirudh Mathukumilli
 *
 *
 *
 *
 * 
 */
public class arrays {



	public static void main(String[] args) {
		int[] nums = {3,6,4,3,2,1,5,6};

		System.out.println(avg(nums));
	}
	

	/**
	 *  sum
	 *  finds the sum of all the elements in an array
	 *
	 * 	@param nums - the array you want to find the sum of
	 *
	 * 	@return the sum of the elements in the array
	 */
	public static double sum(int[] nums){
		double answer = 0;
		for(int i = 0; i < nums.length; i++){
			answer+=nums[i];
		}
		return answer;
	}


	/**
	 *	avg
	 *  finds the mean of an array
	 *
	 * 	@param nums - the array you want to find the average of
	 *
	 * 	@return the mean of the array
	 * 
	 */
	public static double avg(int[] nums){
		double answer = sum(nums);

		answer = answer/nums.length;

		return answer;
	}
}