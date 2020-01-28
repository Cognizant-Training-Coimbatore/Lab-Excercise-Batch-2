package sol.java;

import java.util.HashMap;

public class program8_hashmap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "venkat");
		map1.put(2, "ravi");
		map1.put(3," luka");
		map1.put(4, "hyder");
		String empname = map1.get(2);
		System.out.println(empname);
	}

}
