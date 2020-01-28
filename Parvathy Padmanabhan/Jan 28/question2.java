import java.util.*;
public class question2 {

	public static void main(String[] args) {
		TreeSet<String> myset = new TreeSet<String>();
		Scanner input= new Scanner(System.in);
		String p;
		System.out.println("Press 1 to stop entering");
		for(;;)
		{
			p = input.next();
			if(p.equals("1"))
			{
				break;
				
			}
			else
			{
				myset.add(p);
			}
			

		}
		System.out.println(myset);
		input.close();
		Iterator<String> it1=myset.iterator();
		while(it1.hasNext())
		{
			Object obj= it1.next();
			System.out.println(obj);
		}
	}

}
