package jan31;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
	}

}
