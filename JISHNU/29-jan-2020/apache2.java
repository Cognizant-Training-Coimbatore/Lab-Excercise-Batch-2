package javasersion8;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apache2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("myfile.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("File is created");
		

	}

}
