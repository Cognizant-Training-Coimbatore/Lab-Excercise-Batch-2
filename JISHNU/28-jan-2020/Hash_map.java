package day6;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Jishnu");
		map1.put(2, "vishnu");
		map1.put(3, "Vishu");
		map1.put(4, "Onam");//each item has an id and can be called using that id
		String empname=map1.get(3);
		System.out.println(empname);
	}

}
