class sample7
{
	static int a = 10; 
   
	static void m1() 
    { 
        System.out.println("from m1");
        System.out.println(a);
    } 
}
public class program_static_variables {

	public static void main(String[] args)
	{
		sample7 obj=new sample7();
		obj.m1();
		
		

	}

}
