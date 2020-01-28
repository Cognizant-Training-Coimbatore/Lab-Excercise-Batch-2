import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qstion7 {

	public static void main(String[] args) 
	{
		List<String>a1=new ArrayList<String>();
		a1.add("amith");
		a1.add("suresh");
		a1.add("mahesh");
		a1.add("jinesh");
		a1.remove(1);
		System.out.println("enter the element you want to add");
		Scanner sc= new Scanner(System.in);
		a1.add(1,sc.nextLine());
		System.out.println(a1);

	}

}
