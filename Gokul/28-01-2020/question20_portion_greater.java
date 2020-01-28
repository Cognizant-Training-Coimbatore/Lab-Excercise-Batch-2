import java.util.Scanner;
import java.util.TreeMap;

public class question20_portion_greater {

	public static void main(String[] args) {
		TreeMap<Integer, String> b1=new TreeMap<Integer, String>();
		b1.put(1, "gokul");
		b1.put(2, "Amritha");
		b1.put(3, "Ami");
		b1.put(4, "Aayisha");
		System.out.println("Enter a key value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The key-map equal to or greater than the inputted value "+b1.tailMap(n));
	}

}
