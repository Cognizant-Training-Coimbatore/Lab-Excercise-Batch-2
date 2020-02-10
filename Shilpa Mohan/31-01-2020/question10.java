package jan31;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[100];
		int b[] = new int[100];
		int i;
		System.out.println("Enter the elements in array 1");
		for(i=1;i<=size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the elements in array 2");
		for(i=1;i<=size;i++)
		{
			b[i] = sc.nextInt();
		}
		for(i=1;i<=size;i++)
		{
		System.out.println(a[i]*b[i]);
		}
	}

}
