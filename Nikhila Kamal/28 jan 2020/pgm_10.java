package pgm_excercises_28_jan;

import java.util.LinkedList;

public class pgm_10 {

	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<String>();

		   mylist.add("selenium");

		          mylist.add("nikhila");

		          mylist.add("kamal");

		          mylist.add("java");

		          mylist.add("c++");

		      

		      

		   System.out.println("Original list:" + mylist);  

		 

	
		    Object first_element = mylist.getFirst();

		    System.out.println("First Element is: "+first_element);

		 

		   
		    Object last_element = mylist.getLast();

		    System.out.println("Last Element is: "+last_element);

		 }

	}


