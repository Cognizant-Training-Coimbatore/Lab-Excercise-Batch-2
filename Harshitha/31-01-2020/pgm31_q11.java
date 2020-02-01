package Project;

import java.util.Scanner;

public class pgm31_q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n1= sc.nextInt();
		double n=n1,c=0;
		while(n1%4==0) {
			n1/=4;
			c++;
			}
		if(Math.pow(4,c)==n)
			System.out.println(n+" is the power of 4");
		else
			System.out.println(n+" is not the power of 4");
		}
			
	}


