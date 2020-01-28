import java.util.ArrayList;

public class prog62 {

	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		System.out.println("total items: "+list1.size());
		System.out.println("Testing item4 exists..."+list1.contains("item4"));
		System.out.println("printning all items"+list1);
		System.out.println("removing item 3...");
		list1.remove("item3");
		System.out.println("Printning all after reoving"+list1);
		System.out.println("Total items after removing"+list1.size());


	}
}
