
public class q17 {

	public static void main(String[] args) 
	{
			
			for(char i='A';i<='G';i++)
			{
				for(int o=0;o<=7-i;o++)
				{
					System.out.print(" ");
				}
				
					for(char j='A';j>='A';j--)
					{
						System.out.print(j);
					}
					for( char k='B';k<=i;k++)
					{
						System.out.print(k);
					}
					System.out.println();
			}
			for(int i=7;i>=1;i--)
			{
				for(int o=7-i;o>=0;o--)
						
				{
					System.out.print(" ");
				}
				
					for(int j=i;j>=1;j--)
					{
						System.out.print(j);
					}
					for( int k=2;k<=i;k++)
					{
						System.out.print(k);
					}
					System.out.println();
			}
		
		

	}

}