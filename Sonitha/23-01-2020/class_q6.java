import java.util.Scanner;

class test0 
{
	String n;
	
	void name(String str)
	{ 
		if( str == null)
	{
		System.out.println("Unknown");
	}
		else 
	{
		System.out.println(str);
	} 
	}
}
public  class class_q6 {

	public static void main(String[] args) 
	{
         test0 ob = new test0();
         Scanner sc = new Scanner(System.in);
         System.out.println("To pass the argument press 0 else 1");
         int a = sc.nextInt();
         if(a==0 ) 
         {
          String st = "Name";
          ob.name(st);
         }
         else
        	 if(a==1)
        	 {
        	 ob.name(null);
        	 }
        	 }
         
	}

