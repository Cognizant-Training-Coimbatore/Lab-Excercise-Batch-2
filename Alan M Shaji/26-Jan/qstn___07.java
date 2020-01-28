import java.util.Scanner;

public class qstn___07 {

	public static void main(String[] args) throws qstn___07Myexception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee code\t:\t");
		try {
		int empCode= sc.nextInt();
		if (empCode<101 || empCode>200)
			throw new qstn___07Myexception("enter value bw 101 and 200");
		else
			System.out.println("Value entered");
			}
		catch (qstn___07Myexception e)
		{
			System.out.println("enter value bw 101 and 200");
		}
		

	}

}
