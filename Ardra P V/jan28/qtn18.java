import java.util.HashMap;
import java.util.TreeMap;

public class qtn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>(); 
		map1.put(3, "ardra");
		map1.put(2, "anusha");
		map1.put(7, "anakha");
		map1.put(5, "ameena");
		System.out.println("Orginal map : " +map1);
		System.out.println("Least key : " +map1.firstEntry());
		System.out.println("Greatest key : " +map1.lastEntry());

		
	}

}
