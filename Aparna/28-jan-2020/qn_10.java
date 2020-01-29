package set_6;

import java.util.LinkedList;

public class qn_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new  LinkedList<String>();
		list.add("red");
		list.add("Blue");
		list.add("Yellow");
		list.add("white");
		list.add("Brown");
		System.out.println("The original list is : "+ list);
		Object firstelement = list.getFirst();
		System.out.println("The first occurrence is : "+ firstelement);
		Object secondelement = list.getLast();
		System.out.println("The last occurrence is : "+ secondelement);

	}

}
