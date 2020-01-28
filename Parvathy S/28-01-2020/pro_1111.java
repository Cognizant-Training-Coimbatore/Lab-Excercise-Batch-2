import java.util.ArrayList;
import java.util.Scanner;

public class pro_1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Paaru");
		arr.add("Ponnu");
		arr.add("Dona");
		arr.add("Irfan");
		System.out.println("Enter the index (between 0 and 3): ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String nm=arr.get(a);
		System.out.println(nm);

	}

}
