package demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class program52_readFromCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dataFile = "C:\\Users\\jomon\\Desktop\\CTS\\Training\\Java\\FileIO\\data.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		try {
		br = new BufferedReader(new FileReader(dataFile));
		while((line = br.readLine()) != null)
		{
			String[] data = line.split(csvSplitBy);
			System.out.println(data[0] + data[1] + data[2]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
