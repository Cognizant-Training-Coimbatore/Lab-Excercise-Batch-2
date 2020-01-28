import java.util.ArrayList;

//Write a Java program to replace the second element of a
//ArrayList with the specified element. 
public class program_Q7 
{

	public static void main(String[] args) 
	{
		ArrayList<String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		mylist.add("Item6");
		System.out.println("Items before adding"+mylist);
		mylist.set(1,"Item New");
		System.out.println("Second element after replacing"+mylist);

	}

}
