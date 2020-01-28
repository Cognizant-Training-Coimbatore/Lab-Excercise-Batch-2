package jan28;


import java.util.TreeMap;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map1=new TreeMap<Integer, String>();
		map1.put(7, "shilpa");
		map1.put(2, "kv");
		map1.put(12, "bisnu");
		map1.put(4, "sreedhar");
		System.out.println("Original map: " +map1);
		System.out.println("least key-value : " +map1.firstEntry());
		System.out.println("greatest key-value : " +map1.lastEntry());
		

	}

}
