import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;



public class corejava_q2_iterate_all_elements 
{

	public static void main(String[] args)
	{
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Blue");
		list_Strings.add("Green");
		System.out.println(list_Strings);
		
		
		Iterator itr=list_Strings.iterator();
		System.out.println("Iterating the elements:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
