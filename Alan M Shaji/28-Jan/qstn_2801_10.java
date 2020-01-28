import java.util.LinkedList;
public class qstn_2801_10 {
	  public static void main(String[] args) {	    
		  LinkedList<String> linked_list = new LinkedList<String>();
		  linked_list.add("Red");
	      linked_list.add("Green");
	      linked_list.add("Black");
	      linked_list.add("Pink");
	      linked_list.add("orange");
	      System.out.println("Original linked list:" + linked_list);  
	      Object first_element = linked_list.getFirst();
	      System.out.println("First Element is: "+first_element);
	      Object last_element = linked_list.getLast();
	      System.out.println("Last Element is: "+last_element);
	 }
	}