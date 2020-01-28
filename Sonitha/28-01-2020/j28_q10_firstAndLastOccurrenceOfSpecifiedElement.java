import java.util.LinkedList;

public class j28_q10_firstAndLastOccurrenceOfSpecifiedElement {

	public  static void main(String[] args) {
		LinkedList<String> list = new  LinkedList<String>();
		list.add("red");
		list.add("Blue");
		list.add("Yellow");
		list.add("white");
		list.add("Brown");
		System.out.println("The original list is : "+ list);
		Object firstelement = list.getFirst();
		System.out.println("The first occurrence is : "+ firstelement);
		Object secondelement = list.getLast();
		System.out.println("The last occurrence is : "+ secondelement);
		

	}

}
