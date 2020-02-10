package Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day3Exercise5 {

	public static void main(String[] args) throws IOException {
		
		
		String dataFile = "C:\\Users\\jomon\\Desktop\\CTS\\Training\\Java\\eclipse-workspace\\seleniumJava\\src\\Exercise\\Day3Exercise5.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

		br = new BufferedReader(new FileReader(dataFile));
		while((line = br.readLine()) != null)
		{
			String[] data = line.split(csvSplitBy);
			System.out.println(data[0] + "\t" + data[1] + "\t" + data[2] );
			
		}
		
		br.close();
	}

}
