package packA;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,y,count=0;
		
		int x[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i=1;i<10;i++) {
			x[i]=sc.nextInt();
			}
		System.out.println("Enter a number");
		y=sc.nextInt();
		for(i=0;i<10;i++){
			if(x[i]==y) {
				count++;
			}}
		if(count==0) {	
				System.out.println("Element is not present in array");
			}
			else {
				System.out.println("Element is present in array");
			}
		}

	}


