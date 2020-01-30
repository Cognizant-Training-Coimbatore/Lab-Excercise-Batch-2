package apache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example1poi {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wk = new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("example.xlsx"));
		wk.write(file);
		file.close();
		wk.close();
		System.out.println("Created");
	}

}
