package java50programs;
import java.lang.Math;
import java.util.Scanner;
public class q3 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the length of a side");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		double area =(6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println(area);
	}

}
