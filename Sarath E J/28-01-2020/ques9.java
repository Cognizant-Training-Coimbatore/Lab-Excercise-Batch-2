package hello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ques9 {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		  
		list.add("Green");
		list.add("Blue");
		list.add("yellow");
		list.add("red");
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the index");
		   int n = sc.nextInt();       
		   Iterator p = list.listIterator(n);

		 
		   while (p.hasNext()) 
		   {
			   System.out.println(p.next());
		   }
		   }

}


