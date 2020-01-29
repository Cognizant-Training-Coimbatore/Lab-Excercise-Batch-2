import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Amit");
		arr.add("Vijay");
		arr.add("Binoy");
		arr.add("Adhil");
		System.out.println("Enter the index (between 0 and 3): ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String nm=arr.get(a);
		System.out.println(nm);
		

	}

}
