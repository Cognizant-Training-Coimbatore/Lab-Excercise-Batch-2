package Exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Q02_ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		Iterator iterator1 =  colors.iterator();
		
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}
