import java.util.ArrayList;
import java.util.Scanner;

//3-Write a Java program to insert an element into the array list at the first position. 
public class p88_q3_insertfst {

	public static void main(String[] args) {
		ArrayList<Integer> c=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		c.add(100);
		c.add(300);
		c.add(800);
		System.out.println("Enter first element");
		c.add(0,sc.nextInt());
		System.out.println(c);

	}

}
