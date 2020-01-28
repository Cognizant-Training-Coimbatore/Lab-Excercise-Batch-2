import java.util.Scanner;

public class pgm11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 1st number");
      int n1=sc.nextInt();
      System.out.println("Enter 2nd number");
      int n2=sc.nextInt();
      if(n2==0)
    	  throw new Exception("Please enter number other than 0");
      else
    	  {
    	  System.out.println("Result:"+n1/n2);
  		
    		}
    	  
	}

}
