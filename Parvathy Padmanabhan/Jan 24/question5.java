class disp
{
	void display()
	{
		for (int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
public class question5 {

	public static void main(String[] args) 
	{
		disp obj= new disp();
		obj.display();

	}

}
