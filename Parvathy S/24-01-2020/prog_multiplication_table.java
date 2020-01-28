import java.util.Scanner;

public class prog_multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any no: between 1 and 9");
       int a= sc.nextInt();
       int i,b;
       for(i=1;i<=a;i++)
       {
    	   b=i*a;
    	   System.out.println(i+"*"+a+"="+b);
       }
	}

}
