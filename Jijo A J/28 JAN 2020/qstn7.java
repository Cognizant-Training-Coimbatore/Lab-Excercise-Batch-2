import java.util.ArrayList;
import java.util.Scanner;

public class qstn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>List1=new ArrayList<String>();
List1.add("Red");
List1.add("yellow");
List1.add("green");
List1.add("blue");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element :");
String x=sc.nextLine();
List1.add(1, x);
System.out.println(List1);
	}

}
