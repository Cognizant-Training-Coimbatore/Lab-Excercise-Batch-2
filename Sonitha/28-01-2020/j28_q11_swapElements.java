import java.util.Collections;
import java.util.LinkedList;

public class j28_q11_swapElements {

	public static void main(String[] args) {
		LinkedList< String> list = new LinkedList<String>();
		list.add("red");
		list.add("Gray");
		list.add("Blue");
		list.add("Yellow");
		list.add("white");
		list.add("Brown");
		System.out.println("The original list : "+list);
		Collections.swap(list, 0, 2);
System.out.println("The list after swap : "+ list);
	}

}
