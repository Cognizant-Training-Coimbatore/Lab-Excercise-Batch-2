import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

//Write a Java program to iterate through all elements in a array list. 
public class program_Q2 
{	
	public static void main(String[] args) 
	{	
		ArrayList <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		mylist.add("Item6");
		mylist.add("Item7");
		for(String s:mylist);
			System.out.println("Items are:"+mylist);
		
	}

}
