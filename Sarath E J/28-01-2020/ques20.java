package hello;

import java.util.TreeMap;

public class ques20 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> s= new TreeMap<Integer,String>();
	     
		 
		   s.put(1,"yellow");
		   s.put(2,"Black");
		   s.put(3,"Brown");
		   s.put(4,"white");
		   s.put(5,"blue");
		   s.put(6,"grey");
		   System.out.println(s);
		   System.out.println("checking for 4");
		   System.out.println(s.headMap(4));
	}

}
