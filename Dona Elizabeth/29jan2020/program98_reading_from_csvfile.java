import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program98_reading_from_csvfile {

	public static void main(String[] args) throws IOException {
		String datafile="D:/data.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitBy);
			System.out.println(data[0]+" "+data[1]+" "+data[2]);
		}
	}

}
