import java.util.LinkedList;
import java.util.Scanner;

public class question10_set {

	public static void main(String[] args) {
	LinkedList<Integer> in=new LinkedList<Integer>();
	in.add(100);
	in.add(800);
	in.add(100);
	in.add(200);
	in.add(300);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to search");
	int n=sc.nextInt();
System.out.println("First instance of element "+in.indexOf(100));
System.out.println("Last instance of the element "+in.lastIndexOf(100));
	}

}
