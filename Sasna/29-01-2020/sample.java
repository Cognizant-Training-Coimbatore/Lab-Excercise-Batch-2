package project1;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook obj = new XSSFWorkbook();
		java.io.FileOutputStream file = new FileOutputStream(new File ("sample2.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created succesfully");
	}

}
