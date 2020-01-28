import java.util.HashMap;

public class date28_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map1=new HashMap<Integer, String>();
		map1.put(1, "stani");
		map1.put(2, "jacky");
		map1.put(3, "abhijith");
		map1.put(4, "irfan");
		
		System.out.println(map1);
		map1.put(2,"vishnu");
		System.out.println("after updating");
		System.out.println(map1);
	}

}
