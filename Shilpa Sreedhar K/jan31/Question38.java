package jan31;

import java.util.LinkedList;
import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		System.out.println(list1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index to which you want to insert element: ");
		int index=sc.nextInt();
		System.out.println("enter the element you want to insert: ");
		String element=sc.next();
		list1.add(index,element);
		System.out.println("after insertion: " +list1);

	}

}
