import java.util.Collections;
import java.util.LinkedList;

public class practice_Q11 
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
	     
	     Collections.swap(newlist, 0, 2);
	     System.out.println("The New linked list after swap: " + newlist);
	}

}
