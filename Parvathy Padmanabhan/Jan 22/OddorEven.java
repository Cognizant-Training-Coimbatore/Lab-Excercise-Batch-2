import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner soc =new Scanner(System.in);
		int a;
		a=soc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
				
		}
		else {
		System.out.println("odd number");
		}

	}

}
