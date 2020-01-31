import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class program68_read_from_csv {

	public static void main(String[] args) throws IOException 
	{
		String datafile="E:/mydata.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while ((line=br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}

	}

}
