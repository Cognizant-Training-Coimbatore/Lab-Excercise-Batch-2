package hello;



import java.util.Collections;
import java.util.LinkedList;

public class ques11 {

	public static void main(String[] args)
	{

		LinkedList<Integer> list = new LinkedList<Integer>();
		  
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(58);
		      
		      
		   System.out.println("Original linked list:" +list);  
		 
		   Collections.swap(list, 0, 2);
		    System.out.println("The New linked list after swap: " +list);
	}
	

}
