package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws Exception 
	{
		
XSSFWorkbook obj =new XSSFWorkbook();
FileOutputStream file =new FileOutputStream(new File("sample2.xlsx"));
obj.write(file);
file.close();
System.out.println("file created successfully");
	}

}
