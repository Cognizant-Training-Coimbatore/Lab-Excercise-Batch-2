package samplepackage;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
XSSFWorkbook ob= new XSSFWorkbook();
FileOutputStream file = new FileOutputStream(new File("sample2.xlsx"));
ob.write(file);
file.close();
System.out.println("file created successfully.");
	}

}
