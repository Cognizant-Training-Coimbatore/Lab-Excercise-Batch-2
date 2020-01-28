

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class program99q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> myset = new  ArrayList <String> ();
		myset.add("sasna");
		myset.add("sam");
		myset.add("shyam");
		myset.add("ram");
		System.out.println(myset);
		
		Iterator iterator1 =  myset.iterator();
		while(iterator1.hasNext()) {
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}
