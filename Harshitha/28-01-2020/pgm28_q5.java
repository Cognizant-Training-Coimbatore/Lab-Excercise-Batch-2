import java.util.ArrayList;
import java.util.Scanner;

public class pgm28_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		System.out.println("Enter the position of element to be updated:");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the new element :");
		String s1=sc.next();
		li.set(n, s1);
		for(String s2:li)
			System.out.println(s2);	
	}

}
