package demo;
import java.util.Scanner;

public class ex5_Q4{

	public static void main(String[] args) {
		int a[] = new int[3];

		try

		{

			System.out.println("Access 1 :" +a[2]);

		}

		catch(ArrayIndexOutOfBoundsException e)

		{

			System.out.println("Array :" +e);

		}

		finally

		{

			a[0]=6;

			System.out.println("First : " +a[0]);

			System.out.println("Finally");

		}

	}



}