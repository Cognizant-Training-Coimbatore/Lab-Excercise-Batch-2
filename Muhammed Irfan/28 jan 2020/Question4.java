package Tuesday;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lis=new ArrayList();
		lis.add("mom");
		lis.add("dad");
		lis.add("sis");
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		System.out.println(b+"th element is "+lis.get(b));
		
	}

}
