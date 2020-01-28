package day3;
class loop
{
	void print()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\n");
			for(int j=1;j<=i;j++)
				System.out.print(j+"");
		}
	}
}
public class Q5_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop obj=new loop();
		obj.print();
	}

}
