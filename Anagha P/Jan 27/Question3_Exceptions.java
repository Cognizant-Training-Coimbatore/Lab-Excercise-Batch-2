package demo;

import java.util.Scanner;
import java.lang.*;

public class Question3_Exceptions {
	//int i,len,count=0;

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int count=0,i,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sring");
		s=sc.nextLine();
		len=s.length();
		if(len==0)
		{
	
			throw new NullPointerException("not valid");
			
		}
		else 
		{
			System.out.println("no of letters:+len");
		}
		//try
		//{
			//if(len!=0)
			//{
			//s=sc.next();
			//len=s.length();
			//for(i=0;i<len;i++)
			//{
				//count++;
			//}
			//System.out.println("numbers of string:"+count);
			//}
		//}
		//catch(NullPointerException e)
		//{
			//System.out.println("error");
		//}
		

	//}
	}
}

