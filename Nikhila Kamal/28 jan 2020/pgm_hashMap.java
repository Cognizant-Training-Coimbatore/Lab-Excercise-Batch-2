import java.util.HashMap;

public class pgm_hashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"nikhila");
		map1.put(2,"ammu");
		map1.put(3, "anu");
		map1.put(4,"malu");
		String empname=map1.get(4);
		System.out.println(empname);

	}

}
