import java.util.Scanner;

public class program50_lab1_listnumbersbetweenlimits {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limits");
		a=sc.nextInt();
		b=sc.nextInt();
		for(c=a;c<=b;c++)
		{
			System.out.println(c);
		}
		
	}

}
