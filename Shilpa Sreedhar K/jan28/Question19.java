package jan28;


import java.util.TreeMap;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map1=new TreeMap<Integer, String>();
		map1.put(1, "red");
		map1.put(2, "green");
		map1.put(3, "white");
		map1.put(4, "blue");
		System.out.println("Original map: " +map1);
		System.out.println("least key-value : " +map1.firstEntry());
		System.out.println("greatest key-value : " +map1.lastEntry());
		

	}

}
