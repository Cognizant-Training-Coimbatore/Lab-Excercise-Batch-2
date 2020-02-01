package Project;

import java.util.Arrays;

public class pgm31_q13 {

	public static double main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,3,3,7,2,4};
		int k = 3;
		System.out.print("Original Array: "+Arrays.toString(nums));
		System.out.print("\nValue of k: "+k);
		System.out.print("\nMaximum average value: "+find_max_average(nums, k));       
		 double find_max_average(int[] nums, int k) {
		        int sum = 0;
		        for (int i = 0; i < k; i++) {
		            sum += nums[i];
		        }
		        int max_val = sum;
		        

			for (int i = k; i < nums.length; i++) {
			    sum = sum - nums[i - k] + nums[i];
			    max_val = Math.max(max_val, sum);
			}
			return (double) max_val / k;
	}
	


	
	}

	private static String find_max_average(int[] nums, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
