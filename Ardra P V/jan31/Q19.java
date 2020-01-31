package jan31;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]=new int[10];
		System.out.println("Enter first array numbers");
		Scanner scanner=new Scanner(System.in);
		for(i=0;i<5;i++) {
		a[i]=scanner.nextInt();}
		System.out.println("Enter a charecter");
		int x=scanner.nextInt();
		for(i=0;i<5;i++) {
		if(a[i]==x) {
		System.out.println("present");	
		}
		
		}
	}

}
