package Exercise;

import java.util.LinkedList;

public class Collection_Q10_LinkedListOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

	     // Add elements
	     list.add("AA");
	     list.add("BB");
	     list.add("CC");
	     list.add("AA");
	     list.add("DD");
	     list.add("AA");
	     list.add("EE");
	 
	     System.out.println("LinkedList elements: "+list);

	     System.out.println("FirstIndex of AA:"+list.indexOf("AA"));
	     System.out.println("LastIndex of ZZ:"+list.lastIndexOf("AA"));
	  }

}
