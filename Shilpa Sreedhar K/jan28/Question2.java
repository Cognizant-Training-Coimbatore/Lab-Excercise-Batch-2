package jan28;

import java.util.ArrayList;
import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		System.out.println(list1);
		Iterator iterator1=list1.iterator();
		while(iterator1.hasNext())
			{
			Object obj=iterator1.next();
			System.out.println(obj);
			}

	}

}
