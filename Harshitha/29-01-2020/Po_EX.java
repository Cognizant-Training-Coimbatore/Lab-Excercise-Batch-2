package Apache;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Po_EX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("example.xlxs"));
		wk.write(file);
		file.close();
		System.out.println("File created");
	}

}
