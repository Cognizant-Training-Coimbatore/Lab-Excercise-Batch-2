import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csv_readdata_from_csvfile_eg1 
{

	public static void main(String[] args) throws IOException
	{
		String datafile="E:/myfile10.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}
		// TODO Auto-generated method stub

	}

}
