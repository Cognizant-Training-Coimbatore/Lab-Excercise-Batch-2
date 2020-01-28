import java.util.ArrayList;
import java.util.Scanner;

public class exercise28_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value to be updated: ");
		value = sc.nextInt();
		list1.set(1,value);
		System.out.println(list1);
	}

}
