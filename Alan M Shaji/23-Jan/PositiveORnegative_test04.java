import java.util.Scanner;

public class PositiveORnegative_test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number-->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0)
			System.out.print(a+" is zero");
		else if(a>0)
			System.out.print(a+" is +ve");
		else
			System.out.print(a+" is -ve");
		sc.close();
	}

}
