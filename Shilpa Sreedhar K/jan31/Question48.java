package jan31;

import java.util.Scanner;
import java.util.TreeSet;

public class Question48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter an element from the set: ");
		   int n=sc.nextInt();
		   ts1=(TreeSet<Integer>)ts.tailSet(n,true);
		   System.out.println("Greater than " +n + ":" +ts1);

	}

}
