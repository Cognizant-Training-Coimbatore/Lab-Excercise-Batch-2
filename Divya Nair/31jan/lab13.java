package project1;

import java.util.Scanner;

public class lab13 {

	public static void main(String[] args)
	{
	int[] nums = new int[5];
	Scanner in=new Scanner(System.in);
	System.out.print("Enter k length:" );
	int k=in.nextInt();
	System.out.print("Original Array:" );
	
	
	for(int i=0;i<5;i++)
	{
		nums[i]=in.nextInt();
	}
	
	System.out.print("\nMaximum average value: "+find_max_average(nums, k));       
}     
public static double find_max_average(int[] nums, int k) {
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


