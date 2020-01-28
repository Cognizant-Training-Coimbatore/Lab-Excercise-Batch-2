package day6;

import java.util.LinkedList;

public class Q10_linkedlist_first_and_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("Java");
		list.add("Eclipse");
		list.add("Programming");
		list.add("Computer");
		list.add("Java");
		System.out.println("list" +list);
		System.out.println("First element "+ list.getFirst());
		System.out.println("LAst element "+ list.getLast());
		
	}

}
