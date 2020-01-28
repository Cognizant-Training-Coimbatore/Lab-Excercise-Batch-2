import java.util.ArrayList;

//Write a Java program to print all the elements of a 
//ArrayList using the position of the elements.  
public class program_Q8
{

	public static void main(String[] args)
	{
		ArrayList<String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		for (int i= 0; i <mylist.size(); i++) 
		   System.out.println("Element: "+(i+1)+" : "+mylist.get(i));

	}

}
