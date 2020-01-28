package day6;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Jishnu");
		myset.add("Java");
		myset.add("selenium");
		myset.add("Coimbatore");
		myset.add("Tamilnadu");
		System.out.println(myset);
		Iterator it1=myset.iterator();
		System.out.println("Printing using iterator");
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("Printing using loop");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}
	}

}
