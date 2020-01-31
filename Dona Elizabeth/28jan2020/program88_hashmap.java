import java.util.HashMap;

public class program88_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Abhi");
		map1.put(2,"Job");
		map1.put(3,"Basi");
		
		String name=map1.get(2);
		System.out.println(name);
	}

}
