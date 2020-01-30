import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q7_csv_no_of_lines {

	public static void main(String[] args) throws IOException {
		String dfile="E:/file1.csv";
		BufferedReader br=null;
		String line="";
		int i=0;
		br=new BufferedReader(new FileReader(dfile));	
		while ((line= br.readLine()) != null)
		{
			i++;
		}
		System.out.println(i);
		br.close();

	}

}
