package Tuesday;
import java.util.ArrayList;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList lis=new ArrayList();
		lis.add("mom");
		lis.add("dad");
		lis.add("sis");
		System.out.println(lis);
		Scanner scan=new Scanner(System.in);
		String b=scan.nextLine();
		String c=scan.nextLine();
		int f=0,i=0;
		for(Object obj:lis)
		{
			if(obj.equals(b))
			{
				System.out.println(i);
				f=1;
				break;
			}
			i++;
		}
			if(f==1)
			{
				System.out.println(i);lis.set(i, c);
			}
			System.out.println(lis);
		
		
		
	}

}
