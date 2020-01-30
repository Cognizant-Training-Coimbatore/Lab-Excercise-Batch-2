package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("sample2.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created successfully");
	}

}
