import java.util.ArrayList;

public class practice_Q8 
{

	public static void main(String[] args) 
	{
		ArrayList <String> c1 = new ArrayList <String> ();
		  c1.add("Blue");
		  c1.add("Red");
		  c1.add("Black");
		  c1.add("White");
		  c1.add("orange");
		  System.out.println("\nOriginal array list: " + c1);
		  System.out.println("\nPrint using index of an element: ");
		  int no_of_elements = c1.size();
		  for (int i = 0; i < no_of_elements; i++)
		   System.out.println(c1.get(i));

	}

}
