package Package3;

import java.util.Iterator;
import java.util.LinkedList;

public class program111_set6_q9 {

	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		  
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		
		   Iterator p = l_list.listIterator(1); // print list from second position
           while (p.hasNext()) {
		   System.out.println(p.next());
		   }
		   

	}

}
