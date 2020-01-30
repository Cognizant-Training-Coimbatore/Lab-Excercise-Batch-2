package package1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q7_read_csv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile = "D:\\\\amrutha\\\\text\\\\mydata.csv";
		BufferedReader br = null;
		String line="";
		br = new BufferedReader(new FileReader(datafile));
		int i=0;
		while ((line = br.readLine()) != null)
		{
			i++;
		}
		System.out.println(i);
		br.close();

	}

}
