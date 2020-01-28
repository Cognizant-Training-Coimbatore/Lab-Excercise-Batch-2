import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class program14_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>(); 
		map1.put(1, "ardra");
		map1.put(2, "anusha");
		map1.put(3, "anakha");
		map1.put(4, "ameena");
		String ename=map1.get(2);
		System.out.println(ename);

	}

}
