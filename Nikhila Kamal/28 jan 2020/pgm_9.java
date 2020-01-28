package pgm_excercises_28_jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class pgm_9 {

	public static void main(String[] args) {
		LinkedList<String> mylist=new LinkedList<String>();
		mylist.add("nikhila");
		mylist.add("kamal");
		mylist.add("java");
		//System.out.println(mylist);
		Iterator iterator1=mylist.iterator();
		while(iterator1.hasNext())
		{
			
			System.out.println(iterator1.next());

	}
	}
}



