package demo_29_01_2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileReader;
public class csv {

	public static void main(String[] args) throw IOException
	{
		// TODO Auto-generated method stub

		String datafile="C:/mydata.csv";
		BufferedReader br= null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[]data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}
		
		
		
	}

}
