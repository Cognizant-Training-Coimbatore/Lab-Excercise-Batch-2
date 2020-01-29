package packagee;

import java.util.ArrayList;
import java.util.Iterator;

public class program2_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ab=new ArrayList<String>();
		ab.add("ammu");
		ab.add("appu");
		ab.add("abu");
		System.out.println(ab);
		Iterator iter1= ab.iterator();
		while(iter1.hasNext()) {
			Object obj=iter1.next();
			System.out.println(obj);
		}
			
		

	}

}
