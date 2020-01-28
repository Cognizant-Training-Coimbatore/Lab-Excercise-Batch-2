package hello;

import java.util.LinkedList;

public class ques10 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		  
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(58);
		      
		      
		   System.out.println("Original linked list:" +list);  
		 
		    Object firstelement = list.getFirst();
		    System.out.println("First Element is: "+firstelement);
		 
		   
		    Object lastelement = list.getLast();
		    System.out.println("Last Element is: "+lastelement);
	}

}
