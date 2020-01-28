import java.util.Scanner;

public class name_to_caps_and_length {

	public static void main(String[] args)
	{
		System.out.println("enter name");
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		String newname=name.toUpperCase();
		System.out.println(newname);
		int name_length=name.length();
		System.out.println(name_length);

	}

}
