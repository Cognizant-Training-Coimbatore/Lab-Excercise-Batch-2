package hello;

import java.util.TreeSet;

public class ques15 {

	public static void main(String[] args) 
	{
		TreeSet <Integer> num = new TreeSet<Integer>();
	     
		 
		   num.add(1);
		   num.add(2);
		   num.add(3);
		   num.add(5);
		   num.add(6);
		   num.add(7);
		   num.add(8);
		   num.add(9);
		   num.add(10);
		     
		 System.out.println("Greater than or equal to 3 : "+num.ceiling(3));
		   System.out.println("Greater than or equal to 10 : "+num.ceiling(10));

	}

}
