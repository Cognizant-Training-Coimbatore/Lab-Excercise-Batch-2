import java.util.Scanner;

public class program9_str_length {

	public static void main(String[] args) {
		String str;
		int n=0;
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			n++;
		}
		System.out.println("The length is " + n);

	}

}
