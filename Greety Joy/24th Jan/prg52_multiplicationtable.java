import java.util.Scanner;
class multiplication

{
	int i,j,n,m,sum;
	void display(int n) 
{
	 
   for(i=1;i<=n;i++)
   {
	   
	   for(j=;j<=10;j++)
	  {
		   
		  sum=i*j;
		  System.out.println(i + "*" + j + "="+sum);
		  
	  }
	  
   }
   
   
}
	


}
public class prg52_multiplicationtable {

	public static void main(String[] args)
	{
		int i,j,a;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a");
       a= sc.nextInt();
   
       multiplication obj= new multiplication();
       obj.display(a);
       
	}

}
