import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day3_ex5_q10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile="D:\\qq10.csv";
		BufferedReader br = null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String [] data= line.split(cvsSplitBy);
			System.out.println(data[0]+" "+data[1]+" "+data[2]);
		}
		br.close();
	}

}
