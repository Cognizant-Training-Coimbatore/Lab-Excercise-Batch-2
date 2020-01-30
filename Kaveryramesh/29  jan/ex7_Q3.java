package project1;
interface base1
{
	int a=20;
    }
interface base2
{
	int b=40;
   }
class child implements base1,base2
{
	
    void sum()
    {
    	System.out.println(a+"from 1st interface");
    	System.out.println(b+"from 2nd interface");
    	System.out.println("sum is "+(a+b));
    }
}

public class ex7_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c=new child();
		c.sum();

	}

}
