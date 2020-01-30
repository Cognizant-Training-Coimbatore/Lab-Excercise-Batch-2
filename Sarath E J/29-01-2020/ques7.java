package sample;

import java.io.BufferedReader;
import java.io.FileReader;

public class ques7 
{

	public static void main(String[] args) 
	{
		String datafile ="D:\\hello.csv";
		BufferedReader br = null;
		
		int count = 0;
		try
		{	
			br = new BufferedReader(new FileReader(datafile));
		
			while(( br.readLine())!=null)
			{
				count++;
				
			}	
			System.out.println("no of lines : " +count);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
