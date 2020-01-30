package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question11_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();
		
		a1.add("red");
		a1.add("green");
		a1.add("blue");
		a1.add("orange");
		a1.add("violet");
		a1.add("white");
		System.out.println("list before swapping"+a1);
		Collections.swap(a1,2,5);
		System.out.println("list after swapping"+a1);
		

	}

}
