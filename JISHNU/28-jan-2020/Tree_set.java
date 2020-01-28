package day6;

import java.util.Iterator;
import java.util.TreeSet;
public class Tree_set {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Jishnu");
		myset.add("Jishnu");
		myset.add("RAvi");
		myset.add("Vishnu");
		myset.add("Shabin");
		myset.add("Arjun");
		System.out.println(myset);//will not take duplicates and sorted in alphabetical order
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
	}

}
