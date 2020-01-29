package javasersion8;
import java.io.BufferedReader;
import java.io.FileReader;
public class Q7_csv_file_read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String datafile = "E:/Q7file2901202.csv";
		BufferedReader br = null;
		String line="";
		br = new BufferedReader(new FileReader(datafile));
		int i=0;
		while ((line = br.readLine()) != null)
		{
			i++;
		}
		System.out.println(i);
		br.close();

	}

}
