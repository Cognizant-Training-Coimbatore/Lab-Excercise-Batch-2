package packagee;

import java.util.Iterator;
import java.util.TreeSet;

public class program14_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>geet2=new TreeSet<Integer>();
		TreeSet<Integer>geet=new TreeSet<Integer>();
		
		geet.add(1);
		geet.add(4);
		geet.add(8);
		geet.add(9);
		geet.add(0);
		geet.add(15);
		geet.add(4);
		geet.add(3);
		geet.add(11);
		geet.add(2);
		 System.out.println(geet);
		 geet2=(TreeSet)geet.headSet(7);
		 Iterator i1=geet2.iterator();
		 while(i1.hasNext()) {
			 
			 System.out.println(i1.next());
		 }

		
		
			
		

	}

}
