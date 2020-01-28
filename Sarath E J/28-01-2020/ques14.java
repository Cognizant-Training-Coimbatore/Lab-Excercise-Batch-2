package hello;

import java.util.TreeSet;


import java.util.Iterator;
  public class ques14 {
  public static void main(String[] args)
  {
		 
		   TreeSet <Integer> num = new TreeSet<Integer>();
		   TreeSet <Integer> limit = new TreeSet<Integer>();
		     
 
		   num.add(1);
		   num.add(2);
		   num.add(3);
		   num.add(5);
		   num.add(6);
		   num.add(7);
		   num.add(8);
		   num.add(9);
		   num.add(10);
		     
   
			 limit = (TreeSet)num.headSet(7);  
			
			   
			   Iterator iterator;
			   iterator = limit.iterator();
			     
   	
		   System.out.println("Tree set data: ");     
		   while (iterator.hasNext())
		   {
			   System.out.println(iterator.next() + " ");
		   }
   }    
}
