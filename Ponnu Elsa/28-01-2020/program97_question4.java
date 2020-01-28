import java.util.ArrayList;
import java.util.Scanner;

public class program97_question4 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Parvathy");
		arr.add("Dona");
		arr.add("Ponnu");
		arr.add("kootharaz");
		System.out.println("Enter the index (between 0 and 3): ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String nm=arr.get(a);
		System.out.println(nm);
		

	}

}
