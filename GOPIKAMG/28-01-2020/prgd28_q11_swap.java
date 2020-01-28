import java.util.Collections;
import java.util.LinkedList;

public class prgd28_q11_swap {

	public static void main(String[] args)
	{

		LinkedList<String> list=new LinkedList<String>();
		list.add("car");
		list.add("scooter");
		list.add("bike");
		list.add("van");
		System.out.println("linked list" +list);
		Collections.swap(list, 0, 2);
		System.out.println("the new linked list is " +list);

	}

}
