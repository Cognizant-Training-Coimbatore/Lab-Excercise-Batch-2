import java.util.LinkedList;

public class prgd28_q10_linkedlist {

	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("orange");
		list.add("grapes");
		list.add("mango");
		System.out.println("linked list" +list);
		System.out.println("First element is "+list.getFirst());
		System.out.println("Last element is "+list.getLast());
		

	}

}
