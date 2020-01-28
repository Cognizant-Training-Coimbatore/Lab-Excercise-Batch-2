import java.util.ArrayList;
import java.util.Scanner;

public class exercise28_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		System.out.println("Size of the array : " + list1.size());
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to be added:");
		n = sc.nextInt();
		list1.add(n);
		System.out.println(list1);
		System.out.println("Size of the array : " + list1.size());
		
	}

}
