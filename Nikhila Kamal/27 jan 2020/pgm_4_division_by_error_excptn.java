import java.util.Scanner;

public class pgm_4_division_by_error_excptn {

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


