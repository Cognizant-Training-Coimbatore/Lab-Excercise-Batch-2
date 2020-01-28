import java.util.Scanner;

public class electr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner soc =new Scanner(System.in);
		System.out.println("enter the old reading");
		int o= soc.nextInt();
		System.out.println("enter the new reading");
		int n= soc.nextInt();
		int uused=n-o;
		float costE=0;
		if(uused<101)
		{
			costE=0;
		}
		else if(uused>101 && uused<201)
		{
			costE=1*uused;
		}
		else if(uused>101 && uused<301)
		{
			costE=2*uused;
		}
		else if(uused>101 && uused<401)
		{
			costE=3*uused;
		}
		else
		{
			costE=4*uused;
			costE=(costE*110/100);
			
		}
		System.out.println(costE);
	}

}
