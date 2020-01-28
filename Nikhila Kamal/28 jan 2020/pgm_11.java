package pgm_excercises_28_jan;

import java.util.LinkedList;
import java.util.Scanner;

public class pgm_11 {

	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<String>();

		   mylist.add("selenium");

		          mylist.add("nikhila");

		          mylist.add("kamal");

		          mylist.add("java");

		          mylist.add("c++");

		          System.out.println("Original list:" + mylist);  
		          System.out.println("Enetr the positions to be swapped");

		          Scanner sc=new Scanner(System.in);

		          int a=sc.nextInt();

		          int b=sc.nextInt();

		           String first_element = mylist.get(a);

		           mylist.set(a,mylist.get(b));

		           mylist.set(b,first_element);

		           

		           System.out.println("new list:" + mylist);  

		           

		        }

	}

