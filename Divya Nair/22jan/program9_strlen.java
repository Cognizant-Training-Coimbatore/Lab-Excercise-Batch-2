import java.util.Scanner;

public class program9_strlen {
	

	public static void main(String[] args) 
	{
		String str;
		int len;
		System.out.println("Enter the string");
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		len=str.length();
		System.out.println("\nThe length of the string is:"+len);

	}

}
