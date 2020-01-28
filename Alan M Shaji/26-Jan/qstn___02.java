import java.util.Scanner;

public class qstn___02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no.s");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		try {
			System.out.println("Quotient\t:\t"+number1/number2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
