package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class poi {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		XSSFWorkbook wk = new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("example.xlsx"));
		wk.write(file);
		file.close();
		System.out.println("file created");
	}

}
