import java.util.HashMap;

public class program6_hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1,"Anjana");
		map1.put(2,"Anu");
		map1.put(3,"Nandhu");
	
	String empname=map1.get(2);
	System.out.println(empname);
	}
}
