package demo;
import java.util.Scanner;

public class ex5_Q3 {

	

	
		
		static void validate(int len)throws NullPointerException
		{
			if(len==0)
				throw new NullPointerException("null");
		}
			

		public static void main(String[] args) {


		//System.out.println("enter a string");
		//Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		//int len =str.length();
		//String str="";
		//int len=str.length();
		
		//if( str ==null) //null value 
	   // System.out.println(str.charAt(0)); 
		try{
			
			System.out.println("enter a string");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int len =str.length();
			validate(len);
			System.out.println("length is:" + len);
			
		}
	        catch(Exception e){
			System.out.println("Exception occured " + e);
		}
		
		

		
		
		}
	}