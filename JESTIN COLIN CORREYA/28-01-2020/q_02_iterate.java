package demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q_02_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l1=new ArrayList<String>();
		l1.add("red");
		l1.add("yellow");
		l1.add("black");
		l1.add("blue");
		l1.add("green");
		System.out.println(l1);
		Iterator it1=l1.iterator();
		
		while(it1.hasNext())
		{
			Object obj=it1.next();
			
			System.out.println(obj);
		}
			
	}

}
