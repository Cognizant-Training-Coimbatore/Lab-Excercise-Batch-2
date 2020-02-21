package execution;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excellFileIO.ReadExcel_File;

public class Main_Class {
@Test
public void FBLogin() throws Exception
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	ReadExcel_File file=new ReadExcel_File();
	ReadObject object=new ReadObject();
	Properties property=object.getProp();
	operation opr=new operation(driver);
	Sheet sh=file.readExcel("C:\\Users\\Admin\\Documents\\", "FB_Login.xlsx", "KeywordDriven");
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