import java.util.LinkedList;

public class Q10_first_last_occurance {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("orange");
		l1.add("red");
		l1.add("White");
		l1.add("Black");
		l1.add("Blue");
		l1.add("violet");
		Object First_element=l1.getFirst();
		System.out.println("First element  :"+First_element);
		Object Last_element=l1.getLast();
		System.out.println("Last element   :"+Last_element);
	}

}
