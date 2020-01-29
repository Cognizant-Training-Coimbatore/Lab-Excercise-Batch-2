package appoch1;

import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;



public class apoch_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook ob=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("sample.xlsx"));
		ob.write(file);
		file.close();
		System.out.println("file created");

	}

}
