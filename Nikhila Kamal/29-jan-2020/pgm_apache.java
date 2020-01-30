package project1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pgm_apache {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("sample1.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created successfully");
		
	}

}
