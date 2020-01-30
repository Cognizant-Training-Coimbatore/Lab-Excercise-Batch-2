import java.io.BufferedReader;
import java.io.FileReader;

public class que7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String dataFile="E://myfile2.csv";
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