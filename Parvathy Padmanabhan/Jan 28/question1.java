import java.util.*;
public class question1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		Scanner input= new Scanner(System.in);
		System.out.println("Press 1 to stop entering");
		String p;
		for(;;)
		{
			p = input.next();
			if(p.equals("1"))
			{
				break;
				
			}
			else
			{
				list1.add(p);
			}
			

		}
		System.out.println(list1);
		input.close();
	}

}
