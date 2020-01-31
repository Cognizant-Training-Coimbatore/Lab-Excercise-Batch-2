import java.util.ArrayList;

public class program61_ArrayList_two {

	public static void main(String[] args) 
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		System.out.println("Total items   "+list.size());
		System.out.println("searched element is present or not "+list.contains("item4"));
		System.out.println("print all"+list);
		System.out.println("removing item 3");
		list.remove("item3");
		System.out.println("after removing "+list);
		System.out.println("no of elements after removal"+list.size());
	}

}
