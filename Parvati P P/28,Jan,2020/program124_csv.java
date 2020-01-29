package Package3;

import java.io.BufferedReader;
import java.io.FileReader;

public class program124_csv {

	public static void main(String[] args) {
		String datafile="D:/mydata.csv";
		BufferedReader br=null;
		String line="";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[]data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}
	}

}
