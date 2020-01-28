import java.util.LinkedList;
import java.util.Scanner;

public class Q9_iterate_linked_list {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("orange");
		l1.add("red");
		l1.add("White");
		l1.add("Black");
		l1.add("Blue");
		l1.add("violet");
		int a=l1.size();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		for(int i=n;i<a;i++)
		{
			System.out.println("print  :"+l1.get(i));
		}

	}

}
