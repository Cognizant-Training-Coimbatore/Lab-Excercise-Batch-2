import java.util.HashMap;

public class program58_Hash_Map {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "amith");
		map1.put(2, "suresh");
		map1.put(3, "mahesh");
		map1.put(4, "jinesh");
		map1.put(5, "arhem");
		String empname=map1.get(3);
		System.out.println(empname);

	}

}
