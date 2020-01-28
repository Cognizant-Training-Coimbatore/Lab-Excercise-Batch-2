package day6;

import java.util.Iterator;
import java.util.TreeSet;

public class Q14_number_leass_than7_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(5);
		set.add(54);
		set.add(15);
		set.add(53);
		set.add(6);
		set.add(4);
		set.add(23);
		Iterator<Integer>iteratornew=set.iterator();
		while(iteratornew.hasNext())
		{
			int a=iteratornew.next();
			
			if(a<7)
			System.out.println(a);
		}
		

	}

}
