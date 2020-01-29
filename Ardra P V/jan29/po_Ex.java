package apache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class po_Ex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("ex.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created");

	}

}
