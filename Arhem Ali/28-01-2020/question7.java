import java.util.ArrayList;
import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>a1= new ArrayList<String>();
		a1.add("arhem");
		a1.add("Jseem");
		a1.add("AMITH");
		System.out.println(a1);
		System.out.println("Enter new value: ");
		String s=sc.nextLine();
		a1.set(1,s);
		System.out.println(a1);
		
	}

}
