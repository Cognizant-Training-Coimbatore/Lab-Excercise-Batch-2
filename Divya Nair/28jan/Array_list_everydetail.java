import java.util.ArrayList;
import java.util.List;

public class Array_list_everydetail {

	public static void main(String[] args)
	{
		List<String> list2=new ArrayList<String>();
		list2.add("item1");
		list2.add("item2");
		list2.add("item3");
		list2.add("item4");
		System.out.println("Total items:"+list2.size());
		System.out.println("Does itrm4 exixt:"+list2.contains("item4"));
		System.out.println("The items are:"+list2);
		System.out.println("Removing item2...");
		list2.remove("item2");
		System.out.println("printing all items after removing.."+list2);
		System.out.println("Total items after Removing.."+list2.size());
		

	}

}
