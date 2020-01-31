import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class example3_readingg_csv {

	public static void main(String[] args) throws IOException 
	{
			String datafile = "C:\\Users\\Admin\\Desktop\\Jan 29\\src\\mydata.csv";
			BufferedReader br = null;
			String line="", split=","; 
			br = new BufferedReader(new FileReader(datafile));
			while((line=br.readLine()) != null)
			{
				String [] data = line.split(split);
				System.out.println(data[0] + data[1] + data[2]);
			}
	}

}
