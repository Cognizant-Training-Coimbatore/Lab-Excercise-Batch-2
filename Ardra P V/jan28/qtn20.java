import java.util.TreeMap;

public class qtn20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>(); 
		map1.put(10, "ardra");
		map1.put(20, "anusha");
		map1.put(30, "anakha");
		map1.put(40, "ameena");
		System.out.println(map1);
		System.out.println(map1.headMap(30));

	}

}
