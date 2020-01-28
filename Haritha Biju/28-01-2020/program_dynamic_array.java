import java.util.ArrayList;

public class program_dynamic_array 
{
	public static void main(String[] args)
	{
		//dynamic list
		System.out.println("\n\n Dynamic List");
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println("Total items"+list1.size());
		System.out.println("Printing all items"+list1);
		System.out.println("Removing item 3");
		list1.remove(2);
		System.out.println("Printing all items"+list1);
		
		System.out.println("Whether the list contains 200"+list1.contains(200));
	}
}
