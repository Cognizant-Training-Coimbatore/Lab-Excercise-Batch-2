class printOdd
{
	
	void display()
	{
		int i;
		for(i=1;i<99;i++)
		{
			if((i%2)!=0)
			{
				System.out.println(i);
			}
		}
	}
}
public class lab5_oddnumbers {

	public static void main(String[] args) {
		printOdd obj=new printOdd();
		obj.display();
	}

}
