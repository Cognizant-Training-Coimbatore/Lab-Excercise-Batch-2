import java.util.TreeMap;

public class qtn19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>(); 
		map1.put(1, "ardra");
		map1.put(2, "anusha");
		map1.put(3, "anakha");
		map1.put(4, "ameena");
		System.out.println("Orginal map : " +map1);
		
		System.out.println("first key : " +map1.get(1));

		System.out.println("last key : " +map1.get(map1.size()));
		

	}

}
