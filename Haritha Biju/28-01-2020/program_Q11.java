import java.util.Collections;
import java.util.LinkedList;
//Write a Java program of swap two elements in an linked list. 
public class program_Q11
{

	public static void main(String[] args) 
	{
		LinkedList <String>  mylist=new LinkedList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("The list:"+mylist);
		Collections.swap(mylist, 0, 4);
	    System.out.println("The New linked list after swap: " + mylist);
	}

}
