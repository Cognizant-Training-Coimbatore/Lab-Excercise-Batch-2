import java.util.LinkedList;

public class exercise28_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(100);
		list1.add(100);
		list1.add(500);
		System.out.println("The first occurence of 100 : " + list1.indexOf(100));
		System.out.println("The first occurence of 100 : " + list1.lastIndexOf(100));
	}

}
