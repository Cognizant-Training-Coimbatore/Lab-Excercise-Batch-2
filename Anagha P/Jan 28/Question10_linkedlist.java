package demo;

import java.util.LinkedList;

public class Question10_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("apple");
		list1.add("orange");
		list1.add("banana");
		list1.add("grapes");
		list1.add("orange");
		
		System.out.println("first occurance:"+list1.indexOf("orange"));
		System.out.println("last occurance:"+list1.lastIndexOf("orange"));

	}

}
