package demo;

import java.util.ArrayList;
import java.util.List;

public class Question6_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		System.out.println("size:"+a1.size());
		a1.ensureCapacity(15);

	}

}
