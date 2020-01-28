import java.util.Collections;
import java.util.LinkedList;

public class Q11_swap {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("orange");
		l1.add("red");
		l1.add("White");
		l1.add("Black");
		l1.add("Blue");
		l1.add("violet");
		System.out.println("Entered values  :"+l1);
		Collections.swap(l1, 2, 5);
		System.out.println("After Swaping"+l1);

	}

}
