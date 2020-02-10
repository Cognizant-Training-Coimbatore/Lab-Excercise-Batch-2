class printNum
{
	int i;
	void display()
	{
		for(i=1;i<=100;i++)
		{
			if((i%3)==0||(i%11)==0)
			{
				System.out.println(i);
			}
			else
			{
				if((i%3)==0&&(i%11)==0)
					System.out.println(i);
			}
		}
	}
}
public class lab7_divisibleby_3_11_both {

	public static void main(String[] args) {
		printNum obj=new printNum();
		obj.display();
	}
		
	}



