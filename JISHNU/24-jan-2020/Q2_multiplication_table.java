package day3;

import java.util.Scanner;

class table
{
	void mult(int j)
	{
		for(int i=0;i<=10;i++)
		System.out.println(j+"x"+i+"="+j*i);
	}
}
public class Q2_multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		table obj=new table();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 1 and 9");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
			obj.mult(i);
			
		
	}

}
