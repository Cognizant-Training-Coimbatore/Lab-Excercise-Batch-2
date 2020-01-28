package day6;

import java.util.LinkedList;

public class Q11_swap {

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
		System.out.println("Before swapping "+list);
		String s=list.get(2);
		list.set(2, list.get(3));
		list.set(3, s);
		System.out.println("After swapping "+ list);
	}

}
