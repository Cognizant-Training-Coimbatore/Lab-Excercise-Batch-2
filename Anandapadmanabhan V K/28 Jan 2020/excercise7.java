import java.util.ArrayList;
import java.util.Scanner;

public class excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("blue");
		list1.add("Green");
		list1.add("White");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color to be added at position 2");
		String x=sc.nextLine();
		list1.add(1,x);
		System.out.println("The new list is " + list1);
		
		
	}

}
