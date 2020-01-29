package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_csv_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile = "E:/mydata.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";// csvSplitBy is object name
		br = new BufferedReader(new FileReader(datafile));
		while ((line = br.readLine()) != null) {
			String[] data = line.split(csvSplitBy);
			System.out.println(data[0] + data[1] + data[2]);
		}
		br.close();
	}
}
