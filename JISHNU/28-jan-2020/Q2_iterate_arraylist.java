package day6;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2_iterate_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		Iterator<Integer>iteratornew=list1.iterator();
		while(iteratornew.hasNext())
		{
			Object obj=iteratornew.next();
			System.out.println(obj);
		}
	}

}
