package day6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q15_get_element_greater_than_given_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(5);
		set.add(54);
		set.add(15);
		set.add(53);
		set.add(12);
		set.add(4);
		set.add(23);
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		Iterator<Integer>iteratornew=set.iterator();
		while(iteratornew.hasNext())
		{
			int a=iteratornew.next();
			
			if(a>=b)
			System.out.println(a);
		}
	}

}
