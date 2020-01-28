package jan28;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

  public class Question15 {
	  
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
   System.out.println(ts);
   System.out.println("enter an element from list");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
   ts1=(TreeSet<Integer>)ts.tailSet(n);
   System.out.println("numbers greater than or equal to " +n + " is " +ts1);
   
   }    
}