import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter fst number:  ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b= sc.nextInt();
		for(int i=a+1;i<b;i++)
				System.out.println(i);

	}

}
