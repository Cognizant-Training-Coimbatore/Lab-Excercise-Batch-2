import java.util.Scanner;

public class program20_square
{

	public static void main(String[] args)
	{
	 Scanner s = new Scanner(System.in);
	{
		int number, square;
		s = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = s.nextInt();		
		
		square = number * number;
		
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);
	}
}
}
