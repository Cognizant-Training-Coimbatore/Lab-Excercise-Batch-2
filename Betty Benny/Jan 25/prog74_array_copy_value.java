
public class prog74_array_copy_value {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		b=a;
		System.out.println("Contents of a ");
		        for (int i=0; i<a.length; i++)
		        {
		            System.out.println(a[i]);
		        }

		        System.out.println("Contents of b ");
		        {
		        for (int i=0; i<b.length; i++)
		            System.out.println(b[i]);
		        }
		
		// TODO Auto-generated method stub

	}

}
