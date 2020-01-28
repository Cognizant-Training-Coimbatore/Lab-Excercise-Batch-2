import java.util.HashMap;

public class Q4 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "Venkat");
		map1.put(2, "Jaseem");
		map1.put(3, "Amith");
		map1.put(4, "Arhem");
		String friends = map1.get(4);
		System.out.println(friends);
	}

}
