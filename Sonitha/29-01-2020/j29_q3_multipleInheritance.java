package samplepackage;

interface c1
{
	 int x =50;
	int  y =20;
	
}
interface c2
{
	void add(int a,int b);
	void sub(int a,int b);
}

class c3  implements c1,c2
{
	@Override
	public  void add(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition Result :"+ (x+y));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Subtraction Result :"+(x-y));
	}
}
	public class j29_q3_multipleInheritance 
	{
	public static void main(String[] args) 
	{
		c3 ob= new c3();
		ob.add(0, 0);
		ob.sub(0, 0);
		
         
         
	}

	
}
