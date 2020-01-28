package day5;

public class Ecxeption1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=5,c=5;
			int result;
			result=b/(b-c);
		}
		catch (Exception e)
		{
			System.out.println("Error in code "+ e);
		}
		System.out.println("Out of the block");

	}

}
