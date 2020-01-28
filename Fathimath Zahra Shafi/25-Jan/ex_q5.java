import java.util.Scanner;

public class ex_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str[]=new String[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 friend names");
		for(int i=0;i<5;i++)
		{
			str[i]=scanner.nextLine();
			str[i]=str[i].toUpperCase();
		}
		
		System.out.println("names are : ");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(str[i]);
		}
	}

}
