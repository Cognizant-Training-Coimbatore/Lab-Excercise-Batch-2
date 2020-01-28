import java.util.HashMap;

public class prog_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "a");
		map1.put(1, "b");
		map1.put(1, "c");
		map1.put(1, "d");
		String empname = map1.get(2);
		System.out.println(empname);

	}

}
