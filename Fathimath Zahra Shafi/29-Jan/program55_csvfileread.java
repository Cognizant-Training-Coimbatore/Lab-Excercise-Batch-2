import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class program55_csvfileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile="C:\\Users\\Admin\\Documents\\mydata.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitBy);
			System.out.println(data[0]+data[1]+data[2]);
		}
		
		
		
		
		

	}

}
