import java.util.LinkedList;
import java.util.Scanner;

public class pgm28_q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		li.add("Indigo");
		System.out.println("Enter the position:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<li.size();i++)
			System.out.println(li.get(i));
	}

}
