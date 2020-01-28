package day6;

import java.util.LinkedList;
import java.util.Scanner;

public class Q9_linked_list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>st=new LinkedList<String>();
		st.add("Jishnu");
		st.add("Kannur");
		st.add("Kerala");
		st.add("India");
		st.add("Human");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the position to start (First position corresponds to 0)");
		n=sc.nextInt();
		for(int i=n;i<st.size();i++)
		{
			System.out.println(st.get(i));
		}
	}

}
