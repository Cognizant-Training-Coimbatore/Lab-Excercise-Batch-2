package demo;

import java.util.TreeSet;

public class ex6_Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list1 = new TreeSet<Integer>();
		list1.add(7);
		list1.add(10);
		list1.add(5);
		list1.add(8);
		for(Integer s:list1)
		{
			if(s>=7)
			System.out.println(s);
		}
	}
	
	}


