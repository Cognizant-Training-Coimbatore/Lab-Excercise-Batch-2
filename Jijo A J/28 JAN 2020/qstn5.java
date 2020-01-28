import java.util.ArrayList;
import java.util.Scanner;

public class qstn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>List1=new ArrayList<String>();
List1.add("Red");
List1.add("yellow");
List1.add("green");
List1.add("blue");
Scanner sc=new Scanner(System.in);
int xx;
System.out.println("Enter the element and position :");
String x=sc.nextLine();
xx=sc.nextInt();
List1.add(xx, x);
System.out.println(List1);
	}

}
