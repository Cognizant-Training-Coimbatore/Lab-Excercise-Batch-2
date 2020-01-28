package Package3;

import java.util.Iterator;
import java.util.TreeSet;

public class program113_set6_q14 {  //Find numbers less than 7 in a TreeSet

	public static void main(String[] args) {
		  TreeSet <Integer>num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		   num.add(1);
		   num.add(2);
		   num.add(3);
		   num.add(5);
		   num.add(6);
		   num.add(7);
		   num.add(8);
		   num.add(9);
		   num.add(10);
		treeheadset = (TreeSet)num.headSet(7);  
		   Iterator iterator;
		   iterator = treeheadset.iterator();
		  
		   System.out.println("Tree set data: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   }
	}

}
