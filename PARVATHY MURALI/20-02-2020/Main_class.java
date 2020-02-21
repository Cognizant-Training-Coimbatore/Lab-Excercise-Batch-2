package execution;
import org.apache.poi.ss.usermodel.Sheet;
//connects all the classes to get all the functionality
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keyword_driven.ReadExcel_File;

public class   {
	@Test
	public void FB_Login() throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		ReadExcel_File file=new ReadExcel_File();
		ReadObject object=new ReadObject();
		Properties property=object.getProp();
		Operation opr=new Operation(driver);
		Sheet sh=(Sheet) file.ReadExcel("C:\\Users\\Admin\\Documents\\", "FB_Login.xlsx", "KeywordDriven");
		int row=sh.getLastRowNum()-sh.getFirstRowNum();
		for (int i = 1; i < row+1; i++) {
	        Row r = sh.getRow(i);
	        if(r.getCell(0).toString().length()==0){
	              opr.perform(property, r.getCell(1).toString(), r.getCell(2).toString(),
	                r.getCell(3).toString(), r.getCell(4).toString());
	     }
	        else{
	        	System.out.println("Nothing happens");
	        }
	            }
		
		
	}

}
