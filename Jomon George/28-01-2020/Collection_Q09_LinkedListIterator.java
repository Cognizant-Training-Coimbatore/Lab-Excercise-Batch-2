package Exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection_Q09_LinkedListIterator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		LinkedList lList = new LinkedList();
		   
	    lList.add("1");
	    lList.add("2");
	    lList.add("3");
	    lList.add("4");
	    lList.add("5");
	    
	    System.out.print("enter index : ");
	    int index = scanner.nextInt();
//	    for(int i=index; i<lList.size();i++)
//	    {
//	    	System.out.println(lList.get(i));
//	    }
	    
	    Iterator p = lList.listIterator(index);

	    while (p.hasNext()) {
	    System.out.println(p.next());
	    }
	 
	  }

}
