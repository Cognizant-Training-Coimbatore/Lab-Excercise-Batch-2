class stac
{
			static int x;
	static void set()
	{
		x=1;	
	}
	static int get()
	{
		return x;	
	}

}
public class ques6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
				
		stac obj=new stac();
		obj.set();
		int a=obj.get();
		System.out.println(a);
	}

		

}


