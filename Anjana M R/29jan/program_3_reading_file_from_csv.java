import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class program_3_reading_file_from_csv {

	public static void main(String[] args) throws IOException {
		
		String datafile="E:/mydata.csv";
		BufferedReader br=null;
		String line= "";
		String csvSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
			
		{
			String[] data=line.split(csvSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}
		
	}

}
