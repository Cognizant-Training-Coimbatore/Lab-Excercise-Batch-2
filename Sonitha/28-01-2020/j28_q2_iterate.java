import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class j28_q2_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> colorlist = new TreeSet<String>();
	     colorlist.add("White");
	     colorlist.add("Red");
	     colorlist.add("Blue");
	     colorlist.add("Grey");
	     System.out.println(colorlist);
	     Iterator iter1 = colorlist.iterator();
	     while(iter1.hasNext()) {
	    	 Object ob= iter1.next();
	    	 System.out.println(ob);
	     }

	}

}
