package packagee;

import java.util.HashMap;
import java.util.TreeMap;

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String>input=new TreeMap<String, String>();
		input.put("a1", "abc");
		input.put("a2", "abcd");
		input.put("a3", "abcde");
		input.put("a4", "abcdef");
		System.out.println("least key value:"+input.firstEntry());
		System.out.println("greatest key value:"+input.lastEntry());
		


	


	}

}