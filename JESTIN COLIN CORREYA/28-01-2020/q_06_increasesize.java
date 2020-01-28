package demo2;

import java.util.ArrayList;

public class q_06_increasesize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l1=new ArrayList<String>();
		l1.add("red");
		l1.add("yellow");
		l1.add("black");
		l1.add("blue");
		l1.add("green");
		
		System.out.println("array size=:"+l1.size());
		l1.add("grey");
		System.out.println("array size=:"+l1.size());
		System.out.println(l1);
	
	}

}
