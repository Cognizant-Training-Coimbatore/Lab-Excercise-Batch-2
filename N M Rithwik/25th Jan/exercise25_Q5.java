import java.util.Scanner;

public class exercise25_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[5];
		String result;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of 5 friends: ");
		for(i=0;i<5;i++)
		{
			str[i] = sc.next();
		}
		System.out.println("After conversion : ");
		for(i=0;i<5;i++)
		{
			result = str[i].toUpperCase();
			System.out.println(result);
		}
	}

}
