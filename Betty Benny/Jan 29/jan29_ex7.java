package project1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class jan29_ex7 {

	public static void main(String[] args) throws Exception 
	{
		String datafile ="E:/mydata.csv";
		BufferedReader br = null;
		String line="";
		String cvsSplitBy=",";
		br = new BufferedReader(new FileReader(datafile));
		int count=0;
		while ((line = br.readLine())!=null)
		{
			String [] data = line.split(cvsSplitBy);
			count++;
			System.out.println(data[0]);
	    }
		System.out.println("Number of lines: "+count);
	}
}
