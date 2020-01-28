import java.util.ArrayList;
import java.util.Scanner;

public class pgm28_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new element :");
		String s1=sc.next();
		li.set(2, s1);
		for(String s2:li)
			System.out.println(s2);	
	}
	}


