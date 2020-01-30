package project1;


import java.util.TreeMap;

public class Question18_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "anagha");
		map.put(2, "john");
		map.put(3, "sam");
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());

	}

}
