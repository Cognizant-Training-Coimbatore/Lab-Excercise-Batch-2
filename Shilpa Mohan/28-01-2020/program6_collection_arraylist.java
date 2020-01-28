import java.util.ArrayList;
import java.util.List;

public class program6_collection_arraylist {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Shilpa");
		a1.add("Jayasree");
		a1.add("Mohanan");
		a1.add(1,"Syam");
		System.out.println("An element at 2nd position: " +a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
 