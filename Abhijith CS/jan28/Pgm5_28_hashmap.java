package collections;

import java.util.HashMap;

public class Pgm5_28_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1,"Abhijith");
		map1.put(2,"Stani");
		map1.put(3,"Irfan");
		String empname = map1.get(2);
		System.out.println(empname);
	}

}
