import java.util.HashMap;

public class pgm31_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "shilpa");
		map1.put(2, "kv");
		map1.put(3, "bisnu");
		map1.put(4, "sreedhar");
		String empname=map1.get(2);
		System.out.println(empname);
	}

}
