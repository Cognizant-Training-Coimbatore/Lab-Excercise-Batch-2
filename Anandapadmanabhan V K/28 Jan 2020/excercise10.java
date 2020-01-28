import java.util.LinkedList;

public class excercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> list = new LinkedList<String>();
		 list.add("Red");
		 list.add("Green");
		 list.add("Black");
		 list.add("Pink");
		 list.add("orange");     
		 System.out.println("Original linked list:" + list);   
		 Object first_element = list.getFirst();
		 System.out.println("First Element is: "+first_element);
		 Object last_element = list.getLast();
		 System.out.println("Last Element is: "+last_element);
	}

}
