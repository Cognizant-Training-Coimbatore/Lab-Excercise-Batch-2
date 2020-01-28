import java.util.ArrayList;

//Write a Java program to insert an element into the
//array list at the first position. 
public class program_Q3 
{

	public static void main(String[] args) 
	{
		ArrayList <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		System.out.println("Items orginal"+mylist);
		mylist.add(0,"ItemNew");
		System.out.println("Items new"+mylist);
	}

}
