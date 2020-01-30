import java.io.BufferedReader;
import java.io.FileReader;

public class pr7 {

	public static void main(String[] args) throws Exception
	{
		String dataFile="E://mydata.csv";
		BufferedReader br= null;
		String line="";
		String csvSplit=",";
		int count =0;
		br= new BufferedReader(new FileReader(dataFile));
		while((line=br.readLine())!=null)
		{
			count++;
		}
		System.out.println(count);
		br.close();
	}

}