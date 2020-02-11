package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex_10 {

	public static void main(String[] args) throws IOException {
		String datafile="D:\\data.csv";
		BufferedReader br=null;
		String line="";
		String csvSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(csvSplitBy);
		
           System.out.println(data[0]+data[1]+data[2]);

	}
		
	}
}


