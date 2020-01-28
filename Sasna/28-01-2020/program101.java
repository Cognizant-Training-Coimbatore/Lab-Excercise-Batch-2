import java.util.HashMap;

public class program101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> map1 = new HashMap <Integer, String>();
		map1.put(1,"sasna");
		map1.put(2,"salim");
		map1.put(3,"jaleel");
		map1.put(4,"smriti");
		
		String student = map1.get(2);
		System.out.println(student);
		
	}

}
