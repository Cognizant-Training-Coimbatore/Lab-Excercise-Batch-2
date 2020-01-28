import java.util.Scanner;

public class pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   /* System.out.println("Enter a string");
    String s=sc.next();*/
    String s="";
    if(s.equals(""))
    	throw new NullPointerException("Enter another string");
    else
    {
       	System.out.println("Count of characters :"+s.length());
    }
    
	}

}
