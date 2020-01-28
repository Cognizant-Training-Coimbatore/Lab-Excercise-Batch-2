import java.util.HashMap;
import java.util.Scanner;
public class question8 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> myset = new HashMap<Integer,String>();
		Scanner input= new Scanner(System.in);
		String p;
		int i=0;
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
				myset.put(i,p);
				i++;
			}
		}
		for(i=0;i<myset.size();i++)
		{
			String name= myset.get(i);
			System.out.println(i +"   "+ name);
		}
		input.close();
	}

}
