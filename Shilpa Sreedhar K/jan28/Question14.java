package jan28;

import java.util.TreeSet;
import java.util.Iterator;

  public class Question14 {
	  
  public static void main(String[] args) {
	  
   TreeSet <Integer>ts = new TreeSet<Integer>();
   TreeSet<Integer> ts1 = new TreeSet<Integer>();
  
     
   ts.add(1);
   ts.add(2);
   ts.add(3);
   ts.add(4);
   ts.add(5);
   ts.add(7);
   ts.add(8);
   ts.add(9);
   ts.add(10);
   ts1=(TreeSet<Integer>)ts.headSet(7);
   System.out.println("Less than 7 : "+ts1);
   
   }    
}