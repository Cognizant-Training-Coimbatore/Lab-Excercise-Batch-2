import java.util.ArrayList;
public class program51 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		System.out.println("total items"+list1.size());
		System.out.println("testing item4 exists"+list1.contains("item4"));
		System.out.println("printing all items"+list1);
		System.out.println("removing item3....");
		list1.remove("item3");
		System.out.println("printing all items after removing"+list1);
		System.out.println("total items after removing"+list1.size());
		
		// TODO Auto-generated method stub

	}

}
