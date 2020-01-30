package set_7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class qn_7 {

	public static void main(String[] args) throws IOException {
		
		
				// TODO Auto-generated method stub
				String datafile = "D:/mydata.csv";
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


