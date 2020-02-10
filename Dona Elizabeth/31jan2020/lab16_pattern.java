
public class lab16_pattern {

	public static void main(String[] args) {

		int i,j,k,m;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=7-i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(m=2;m<=i;m++)
			{
				System.out.print(m);
			}
			System.out.print("\n");
		}
		for(i=6;i>=1;i--)
		{
			for(j=6-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(m=2;m<=i;m++)
			{
				System.out.print(m);
			}
			System.out.print("\n");
		}
		
	}

}
