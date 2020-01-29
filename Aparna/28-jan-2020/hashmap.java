package collection;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map1=new HashMap<Integer,String>();
map1.put(1, "aparna");
map1.put(2, "janaki");
map1.put(3, "agnes");
map1.put(4, "ram");
String empname=map1.get(3);
System.out.println(empname);
	}

}
