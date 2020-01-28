import java.util.ArrayList;
import java.util.Scanner;

public class Qstion5 {

	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("amith");
		list.add("arhem");
		list.add("jaseem");
		list.add("suresh");
		System.out.println(list);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the which element you want to remove ");
		list.remove(sc.nextLine());
		System.out.println("enter the position you want to add");
		int b=sc.nextInt();
		Scanner o=new Scanner(System.in);
		System.out.println("enter the element you wanted to add");
		list.add(b,o.nextLine());
		System.out.println(list);
	}

}
