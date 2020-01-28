import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prgmd28_q7_replace {

	public static void main(String[] args)
	{
		List<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("css");
		a1.add("php");
		a1.add("html");
		System.out.println(a1);
		System.out.println("enter the element to be replaced with");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		a1.set(2, str);
		System.out.println("After replacement");
		System.out.println(a1);

	}

}
