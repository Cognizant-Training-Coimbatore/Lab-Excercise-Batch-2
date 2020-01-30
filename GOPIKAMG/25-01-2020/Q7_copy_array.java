package PackA;

public class Q7_copy_array {
	void display()
	{
		int a[]={2,3,4,5,6};
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(a[i]);
			
		}
		System.out.println('\n');
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
	}
	public static void main(String[] args) {
		Q7_copy_array obj=new Q7_copy_array();
		obj.display();
		
	}

}
