import java.util.Scanner;

public class program5_lab5 {

	public static void main(String[] args) {
		int i;
		String names[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 5 names");
		for(i=0;i<5;i++)
		{
			names[i]=sc.nextLine();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(names[i].toUpperCase());
		}

	}

}
