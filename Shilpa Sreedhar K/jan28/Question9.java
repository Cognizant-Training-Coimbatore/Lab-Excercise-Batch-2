package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		list1.add("grey");
		//System.out.println(list1);
		System.out.println("enter the starting index");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ListIterator<String> iterator=list1.listIterator(n);
		System.out.println(list1);
		while(iterator.hasNext())
		{
		
		System.out.println(iterator.next());
		}
	}

}
