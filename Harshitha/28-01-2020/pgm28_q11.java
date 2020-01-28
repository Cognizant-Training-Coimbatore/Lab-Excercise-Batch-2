
import java.util.Collections;
import java.util.LinkedList;

public class pgm28_q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		li.add("Indigo");
		System.out.println("Original list:"+li);
		Collections.swap(li,1,2);
		System.out.println("Swapped list:"+li);
	}

}
