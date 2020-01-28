package demo;
class a
{
    a(char c,int b )
    {
    	System.out.println("1st constructor"+c+b);
    	
    }
    
    a(int b,char c)
    {
    	System.out.println("2nd constructor"+c+b);
    }
    
}



public class Q9 {

	public static void main(String[] args) {
		
		a x=new a('c',2);
		a x1=new a(2,'p');
	

	}

}
