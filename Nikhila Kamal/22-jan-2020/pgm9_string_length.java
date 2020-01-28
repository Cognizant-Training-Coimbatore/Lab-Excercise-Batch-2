import java.util.Scanner;

public class pgm9_string_length {

	public static void main(String[] args)
	{
		String str;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int i=0;
		for(char c :str.toCharArray()) {
			i++;
		}
		System.out.println("length of string is: " + i);
		

	}

}
