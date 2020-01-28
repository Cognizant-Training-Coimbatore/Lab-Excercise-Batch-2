
public class pgm7_copy_array {

	public static void main(String[] args) {
	int a[]=new int[5];
	int b[]=new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	b=a;
	//b[0]++;
	System.out.println("contents of a[]");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
		
	}
	System.out.println("contents of b[]");
	for(int i=0;i<5;i++)
	{
		System.out.println(b[i]);
	}
	
	}

}
