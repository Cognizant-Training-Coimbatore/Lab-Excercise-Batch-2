class loop
{
	void display()
	{
		int i =1,j;
		while(i<=5)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
}
public class pgm50_loopprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop obj = new loop();
		obj.display();
	}

}
