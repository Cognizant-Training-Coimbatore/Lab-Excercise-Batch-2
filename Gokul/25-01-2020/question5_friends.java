package classworkA;

import java.util.Scanner;

public class question5_friends {

	public static void main(String[] args) 
	{
     String name[]=new String[5];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your friends name");
     int c=1;
    for(int i=0;i<5;i++)
    {
    	name[i]=sc.next();
    	System.out.println("Friend"+c+"-Name:"+name[i]);
    	c++;
    }
    
	}

}
