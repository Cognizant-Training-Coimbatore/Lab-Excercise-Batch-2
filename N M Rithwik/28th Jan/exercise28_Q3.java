import java.util.ArrayList;
import java.util.Scanner;

public class exercise28_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to be added:");
		n = sc.nextInt();
		list1.add(0,n);
		System.out.println(list1);
	}

}
