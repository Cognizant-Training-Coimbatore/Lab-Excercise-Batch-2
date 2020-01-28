import java.util.Scanner;
class Addamount
{
	int Amount=50;
	Addamount()
	{
		//Nothing to be done
		System.out.println(Amount);
	}
	Addamount(int extra)
	{
		Amount=Amount+extra;
		System.out.println(Amount);
	}
}
public class piggiebank {

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		int extra=input.nextInt();
		if(extra!=0)
		{
			Addamount obj= new Addamount(extra);
		}
		else
		{
			Addamount obj1= new Addamount();
		}
	input.close();
	}

}
