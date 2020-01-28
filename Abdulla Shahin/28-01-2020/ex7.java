import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) 
	{
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("white");
		mylist.add("black");
		mylist.add("red");
		mylist.add("blue");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the color to be added in 2");
		String str = sc.nextLine();
		mylist.add(1,str);
		System.out.println(mylist);

	}

}
