import java.util.ArrayList;

//Write a Java program to update specific array element by given element.  
public class program_Q5
{

	public static void main(String[] args) 
	{
		ArrayList mylist=new ArrayList();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		System.out.println("Items :Orginal"+mylist);
		mylist.set(0,"Item 0");
		System.out.println("Items :New"+mylist);
	}

}
