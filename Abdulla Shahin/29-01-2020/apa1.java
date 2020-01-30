package apache_proj;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apa1 {

	public static void main(String[] args) throws Exception
	{
		
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("example.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created");
	}

}
