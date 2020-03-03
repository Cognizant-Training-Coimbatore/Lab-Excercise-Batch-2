import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class data_driven_testing {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
String filePath="E:\\JIJO A J\\ECLIPSE2\\JXL_DEMO\\testdata.xls";
FileInputStream ip=new FileInputStream(filePath);
Workbook wb=Workbook.getWorkbook(ip);
Sheet sh=wb.getSheet("Sheet1");
int NRows= sh.getRows();
int Ncol=sh.getColumns();
for(int row=0;row<NRows;row++)
	{	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	for(int col=0;col<Ncol;col++)
		{String value=sh.getCell(col, row).getContents();
		driver.findElement(By.id("gender-male")).click();
			if(col==0)
			{
				driver.findElement(By.id("FirstName")).sendKeys(value);
			}
			else if(col==1)
			{
				driver.findElement(By.id("LastName")).sendKeys(value);
			}
			else if(col==2)
			{
				driver.findElement(By.id("Email")).sendKeys(value);
			}
			else
			{
				driver.findElement(By.id("Password")).sendKeys(value);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(value);
			}
			driver.findElement(By.id("register-button")).click();
		}
	}
}

}
