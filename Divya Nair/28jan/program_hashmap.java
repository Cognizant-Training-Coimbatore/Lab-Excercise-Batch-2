import java.util.HashMap;

public class program_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Divya");
		map1.put(2,"Diya");
		map1.put(3,"Bindu");
		String empname=map1.get(2);
		System.out.println(empname);
		
	}

}
 