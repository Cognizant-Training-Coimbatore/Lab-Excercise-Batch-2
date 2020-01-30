package apache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class po_ex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	   XSSFWorkbook wk=new XSSFWorkbook();
	   FileOutputStream file=new FileOutputStream(new File("example.xlsx"));
			   wk.write(file);
			   file.close();
			   System.out.println("file created");

	}

}
