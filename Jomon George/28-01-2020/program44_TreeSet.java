package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class program44_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> mySet = new TreeSet<String>();
		mySet.add("venkat");
		mySet.add("sarath");
		mySet.add("jijo");
		mySet.add("gokul");
		mySet.add("alan");
		mySet.add("venkat");
		
		System.out.println(mySet);
		
		Iterator iterator1 =  mySet.iterator();
		
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}
