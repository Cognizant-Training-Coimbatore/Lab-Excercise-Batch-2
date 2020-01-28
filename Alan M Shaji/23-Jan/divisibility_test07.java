import java.util.Scanner;

public class divisibility_test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a-->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%7==0)
			System.out.print("Divisible by 7");		
		else
			System.out.println(" not Divisible by 7");
		sc.close();
	}

}
