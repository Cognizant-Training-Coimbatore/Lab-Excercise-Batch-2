import java.util.HashMap;
public class program95_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"Ponnu");
		map1.put(2, "Parvathy");
		map1.put(3, "Dona");
		String empname = map1.get(2);
		System.out.println(empname);
	}

}
