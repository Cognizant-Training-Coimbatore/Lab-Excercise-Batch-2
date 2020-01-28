import java.util.ArrayList;
import java.util.Scanner;

public class pgm28_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		//li.add(0,"Indigo");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an element:");
		String s=sc.next();
		li.add(0,s);
		for(String s1:li)
			System.out.println(s1);	
	}

}
