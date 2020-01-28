package demo;
class stat1
{
	static int x;
	static void set() {
		
		x=1;
	}
	static int get()
	{
		return x;
	}
	
   }

public class ex3_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 stat1 obj=new stat1();
 obj.set();
 int a=obj.get();
 System.out.println(a);
		
	}

}
