package day4;

public class Q7_array {
	int a[]={1, 2, 3, 4, 5};
	int b[]=new int[5];
	void copy()
	{
		for(int i=0;i<5;i++)
			b[i]=a[i];
		for(int i=0;i<5;i++)
			System.out.println(b[i]);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7_array obj=new Q7_array();
		obj.copy();

	}

}
