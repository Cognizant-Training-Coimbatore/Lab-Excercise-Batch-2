import java.util.TreeMap;

public class pgm28_q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Venki");
		map1.put(2, "Ravi");
		map1.put(3, "jikki");
		map1.put(4, "Amal");
		System.out.println("Original:"+map1);
		System.out.println("SubMap:"+map1.subMap(1,3));
		
	}
	}


