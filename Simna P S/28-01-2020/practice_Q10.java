import java.util.LinkedList;

public class practice_Q10 
{

	public static void main(String[] args) 
	{
		 LinkedList<String> newlist = new LinkedList<String>();
		   
	     newlist.add("Red");
	     newlist.add("Green");
	     newlist.add("Black");
	     newlist.add("White");
	     newlist.add("Pink");
	     
	     System.out.println("original list: "+newlist);
	     
	  
	     Object first_element = newlist.getFirst();
	     System.out.println("First Element is: "+first_element);
	  
	     
	     Object last_element = newlist.getLast();
	     System.out.println("Last Element is: "+last_element);

	}

}
