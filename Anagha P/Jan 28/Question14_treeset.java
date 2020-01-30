package project1;

import java.util.Iterator;
import java.util.TreeSet;

public class Question14_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a1=new TreeSet<Integer>();
		a1.add(2);
		a1.add(6);
		a1.add(8);
		a1.add(9);
		System.out.println("elements"+a1);
		//Iterator<E> it1=new a1.iterator(
		//int l=7;
		for(Integer obj:a1)
		{
			if(obj<7)
			{
				System.out.println(obj);
			}
		}
		
		
		

	}

}
