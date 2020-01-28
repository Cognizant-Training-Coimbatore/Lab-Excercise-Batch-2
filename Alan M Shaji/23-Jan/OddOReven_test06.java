import java.util.Scanner;

public class OddOReven_test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number-->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
			System.out.print(a+" is even");
		else
			System.out.print(a+" is odd");
		sc.close();

	}

}
