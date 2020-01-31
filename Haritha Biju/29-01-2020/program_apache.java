package pack1;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class program_apache
{
		public static void main(String[] args) throws Exception
		{
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream f1=new FileOutputStream(new File("example.xlsx"));
		wk.write(f1);
		f1.close();
		System.out.println(" File created");
		}
}
