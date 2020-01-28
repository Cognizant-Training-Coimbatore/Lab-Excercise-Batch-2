import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class exercise28_Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list1 = new TreeSet<Integer>();
		TreeSet<Integer> list2 = new TreeSet<Integer>();
		list1.add(10);
		list1.add(2);
		list1.add(3);
		list1.add(40);
		list1.add(5);
		System.out.println(list1);
		
		System.out.println("The number greater than or equal to the number 10: " + list1.ceiling(11));
		
	}

}
