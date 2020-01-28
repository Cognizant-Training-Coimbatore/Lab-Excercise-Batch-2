import java.util.Iterator;
import java.util.LinkedList;

public class practice_Q9 
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

	   Iterator p = newlist.listIterator(2);

	   
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }

	}

}
