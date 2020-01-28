import java.util.HashMap;

public class program90hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "sasna");
		map1.put(2, "sam");
		map1.put(3, "shyam");
		map1.put(4, "ravi");
		String empname = map1.get(2);
		System.out.println(empname);
	}

}
