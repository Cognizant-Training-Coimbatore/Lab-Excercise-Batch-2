import java.util.HashMap;

public class program48_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1,"venkat");
		map1.put(2, "raja");
		map1.put(3, "raju");
		String empname = map1.get(2);
		System.out.println(empname);

	}

}
