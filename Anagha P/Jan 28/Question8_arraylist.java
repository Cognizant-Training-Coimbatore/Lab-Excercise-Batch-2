package demo;

import java.util.ArrayList;
import java.util.List;

public class Question8_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();
		
		a1.add("red");
		a1.add("green");
		a1.add("blue");
		a1.add("orange");
		a1.add("violet");
		a1.add("white");
		int len=a1.size();
		System.out.println("elements are");
		for(int i=0;i<len;i++)
		{
			System.out.println(a1.get(i));
		}

	}

}