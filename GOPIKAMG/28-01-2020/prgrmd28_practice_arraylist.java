import java.util.ArrayList;
import java.util.List;

public class prgrmd28_practice_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a1=new ArrayList<String>();
		a1.add("item1");
		a1.add("item2");
		a1.add("item3");
		a1.add("item4");
		a1.add("item5");
		System.out.println("Total items" + a1.size());
		System.out.println("Testing item4 exists " +a1.contains("item4"));
		System.out.println("Printing all the items" +a1);
		System.out.println("Removing item3");
		a1.remove("item3");
		System.out.println("printing all items after removing" +a1);
		System.out.println("Total items after removing "+a1.size());
	}

}
