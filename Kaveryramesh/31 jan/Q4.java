package practical_excercise;

import java.util.Scanner;



public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
             Scanner s=new Scanner(System.in);
             System.out.println("Enter a string");
             String str=s.nextLine();
     		
     		str=s.nextLine();
     		int n=str.length(),i;
     		
     	      String a="";
     		for(i=n-1;i>=0;i--)
     		{
     		   a=a+str.charAt(i);
     		}	
//     		for(i=0;i<str.length();i++)
     			System.out.print(a);

}
}
