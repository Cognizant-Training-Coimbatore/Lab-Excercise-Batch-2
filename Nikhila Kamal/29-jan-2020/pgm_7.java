import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pgm_7 {

	public static void main(String[] args) throws Exception {
		int count=0;
		String datafile = "E:\\mydata.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while ((line = br.readLine()) != null)
		{
		        count+=1;
		       
		}
	System.out.println(count);
		}
	

	}


