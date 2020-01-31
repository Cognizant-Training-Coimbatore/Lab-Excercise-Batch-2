package jan31;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]=new int[10];
		int b[]=new int[10];
		int s[]=new int[10];
		System.out.println("Enter first array numbers");
		Scanner scanner=new Scanner(System.in);
		for(i=0;i<5;i++) {
		a[i]=scanner.nextInt();}
		System.out.println("Enter second array numbers");
		for(i=0;i<5;i++) {
		b[i]=scanner.nextInt();}
		for(i=0;i<5;i++) {

			s[i]=a[i]+b[i];
			System.out.println("Sum of corresponding elements of array : " +s[i]);
}
			

	}

}
