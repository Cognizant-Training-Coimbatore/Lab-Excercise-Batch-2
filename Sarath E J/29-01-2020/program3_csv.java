package jan29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class program3_csv
{

	public static void main(String[] args) throws FileNotFoundException
	{
		String datafile ="C:\\mydata.csv";
		BufferedReader br = null;
		String line="";
		String cvsSplitBy = ",";
		try
		{
			br = new BufferedReader(new FileReader(datafile));
		
			while((line = br.readLine())!=null)
			{
			String[] data = line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
