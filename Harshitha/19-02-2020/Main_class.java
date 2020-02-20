package execution;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelFileIO.ReadExcel_File;

public class Main_class {
@Test
public void FBLogin() throws IOException
{
	WebDriver driver=new ChromeDriver();
	ReadExcel_File file=new ReadExcel_File();
	ReadObject object=new ReadObject();
	Properties properties=object.getProp();
	Operation opr=new Operation(driver);
	Sheet sh=file.readExcel("D:\\","FB_Login.xlsx","Keyword_driven");
	int row=sh.getLastRowNum()-sh.getFirstRowNum();
	for(int i=1;i<row+1;i++)
	{
		
	}
	}
	
	
}

