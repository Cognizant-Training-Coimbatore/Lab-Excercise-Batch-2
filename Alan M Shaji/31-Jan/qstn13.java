package javatest;

import java.util.Scanner;

public class qstn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array numbers...");
		int[] nums = new int[10];
		for(int i=0;i<10;i++)
			nums[i]=sc.nextInt();
		System.out.println("enter subarray length");
		int k = sc.nextInt();
		int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max_val = sum;
        
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max_val = Math.max(max_val, sum);
        }
        double avg=max_val / k;
        System.out.println(avg);


	}

}
