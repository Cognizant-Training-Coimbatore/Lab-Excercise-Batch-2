package set_5;

import java.util.Scanner;

public class qn_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		Scanner scanner1=new Scanner(System.in);
		int y=scanner1.nextInt();
		
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch (Exception e)
		{
			System.out.println("error in the code" +e);
			System.out.println("out of the block");
		}
		
			}
	}


