import java.util.ArrayList;
import java.util.Iterator;
//Write a Java program to iterate through all elements in a linked list
//starting at the specified position. 
public class program_Q9
{

	public static void main(String[] args) 
	{
		ArrayList<String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");

		Iterator p = mylist.listIterator(1);
		while (p.hasNext()) 
		   System.out.println(p.next());
	}

}
