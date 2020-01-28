import java.util.HashMap;

public class program44_hashmap {

	public static void main(String[] args)
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "Venkat");
		map1.put(2, "Jaseem");
		map1.put(3, "Amith");
		map1.put(4, "Arhem");
		String employeename = map1.get(4);
		System.out.println(employeename);
	}

}
