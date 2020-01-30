import java.util.HashMap;

public class Program_89_Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>map1 =new HashMap<Integer,String>();
		map1.put(1,"Diya");
		map1.put(2,"Dia");
		map1.put(3,"Diy");
		map1.put(4,"Dya");
		String empname=map1.get(2);
		System.out.println(empname);

	}

}
