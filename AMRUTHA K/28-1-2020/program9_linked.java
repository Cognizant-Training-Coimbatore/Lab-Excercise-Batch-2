package packagee;

import java.util.Iterator;
import java.util.LinkedList;

public class program9_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>abc=new LinkedList<String>();
		abc.add("man");
		abc.add("moon");
		abc.add("sun");
		abc.add("man");
		abc.add("moon");
		abc.add("sun");
		Iterator it=abc.listIterator(2);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
