/**
 *		threes
 *			finds the number of threes in an array
 *
 * 		Anirudh Mathukumilli
 *
 *
 * 
 */

public class threes {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,345,3,4,3,3};

		System.out.println(getThrees(nums));
	}

	/**
	 * 		getThrees
	 * 		find the number of threes in an array
	 *
	 * 		@param nums - the array you want to find the number of threes in 
	 * 		@return - the number of threes in the array
	 * 
	 */
	public static int getThrees(int[] nums){
		int counter = 0;
		for(int i : nums){
			if(i == 3){
				counter++;
			}
		}
		return counter;
	}
}