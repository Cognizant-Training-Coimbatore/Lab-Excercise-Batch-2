package Tuesday;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		a1.add(0,str);
		System.out.println(a1);
	}

}
