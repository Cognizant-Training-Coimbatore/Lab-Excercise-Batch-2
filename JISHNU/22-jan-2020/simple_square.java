package demo;
import java.lang.Math;
import java.util.Scanner;

public class simple_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double c=Math.pow(a, 2);
		System.out.println("Square : "+c);
	}

}
