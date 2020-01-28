package demo;
class Addamount
{  int amount=50;
	
   Addamount()
   {
	   
   }
   
 Addamount(int x)
 {
	 amount=amount+x;
 }

}

public class Q7 {

	public static void main(String[] args) {
		
           Addamount a=new Addamount();
           System.out.println(a.amount);
           Addamount a1=new Addamount(10);
           System.out.println(a1.amount);
	}

}
