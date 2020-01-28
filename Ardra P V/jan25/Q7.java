package packA;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[] = new int[6];
		int x[]=new int[6];
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(i=1;i<6;i++) {
			x[i]=sc.nextInt();
			}
		for(i=1;i<6;i++) {
			a[i]=x[i];}
			
		for(i=1;i<6;i++) {
			System.out.println("The numbers are:" +a[i]);
		}
		
	}

}
