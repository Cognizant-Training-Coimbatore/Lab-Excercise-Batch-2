package Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_Q08_PrintArrayListIndexElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		Iterator iterator1 =  colors.iterator();
		
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}
}


