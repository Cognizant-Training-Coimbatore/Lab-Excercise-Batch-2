import java.util.HashMap;

public class program45_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "fathima");
		map1.put(2,"kavery");
		map1.put(3,"navya");
		String empname=map1.get(2);
		System.out.println(empname);

	}

}
