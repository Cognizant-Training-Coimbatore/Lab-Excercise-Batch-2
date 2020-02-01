package jan31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
		 al.add("car");
	        al.add("bike");
	        al.add("scootty");
	        al.add("jcb");
	        System.out.println("old array lis : ");
	        for(String s:al) {
	        	System.out.println(s);}
	        System.out.println("Enter name");
		     Scanner sc = new Scanner(System.in);
				String x=sc.nextLine();
			String obj;
			obj=x;
			
	        	al.add(0, obj);
	    		for(String s:al) {
	            	System.out.println(s);
	    		
	    	}


		}

	        
	}


