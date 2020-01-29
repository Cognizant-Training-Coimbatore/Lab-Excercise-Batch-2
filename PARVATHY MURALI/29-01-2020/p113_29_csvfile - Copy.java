import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p113_29_csvfile 
{

	public static void main(String[] args) throws IOException 
	{
		String datafile="D:/datafile.csv";
		BufferedReader br=null;
		String line="";
		String csvSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(csvSplitBy);
			System.out.println(data[0]+"  "+data[1]+"  "+data[2]);
		}
		

	}

}
