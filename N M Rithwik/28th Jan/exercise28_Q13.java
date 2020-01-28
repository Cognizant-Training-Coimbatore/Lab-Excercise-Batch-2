import java.util.LinkedList;
import java.util.TreeSet;

public class exercise28_Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list1 = new TreeSet<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		System.out.println(list1);

		TreeSet<Integer> list2 = new TreeSet<Integer>();
		list2.add(100);
		list2.add(600);
		list2.add(300);
		list2.add(700);
		list2.add(800);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
