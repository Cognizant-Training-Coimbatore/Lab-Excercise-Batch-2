package demo;

import java.util.ArrayList;
import java.util.TreeSet;

public class ex6_Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list1 = new TreeSet<Integer>();
		list1.add(1);
		list1.add(10);
		list1.add(5);
		list1.add(6);
		for(Integer s:list1)
		{
			if(s<7)
			System.out.println(s);
		}
	}
	}


