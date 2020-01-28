import java.util.LinkedList;
import java.util.Iterator;
public class ex10 
{
	public static void main(String[] args) 
	{
		 LinkedList<String> mylist = new LinkedList<String>();		
		 mylist.add("blue");
		 mylist.add("green");		
		 mylist.add("red");	
		 mylist.add("pink");
	     mylist.add("white");
	     System.out.println("Original linked list:" + mylist);  
		 Object first_element = mylist.getFirst();
		 System.out.println("First Element is: "+first_element);
		 Object last_element = mylist.getLast();
		 System.out.println("Last Element is: "+last_element);
	}

}