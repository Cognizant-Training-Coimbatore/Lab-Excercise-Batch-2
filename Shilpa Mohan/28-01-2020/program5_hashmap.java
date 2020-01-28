import java.util.HashMap;

public class program5_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "shilpa");
		map1.put(2, "abhi");
		map1.put(3,"jay");
		map1.put(4,"chakkara");
		String empname = map1.get(2);
		System.out.println(empname);
	}

}
