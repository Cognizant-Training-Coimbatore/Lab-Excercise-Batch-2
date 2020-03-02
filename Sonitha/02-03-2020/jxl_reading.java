import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxl_reading
{

	public static void main(String[] args) throws BiffException, IOException 
	{
		String FilePath = "C:\\Users\\Admin\\Documents\\jxl_reading.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// To get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		
		for (int row = 1; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				String value = sh.getCell(col, row).getContents();
			
				if(col == 0)
				{
					driver.findElement(By.name("FirstName")).sendKeys(value);
					System.out.println(value);
				}
				if(col == 1)
				{
					driver.findElement(By.name("LastName")).sendKeys(value);
					System.out.println(value);
				}
				if(col == 2)
				{
					driver.findElement(By.name("Email")).sendKeys(value);
					System.out.println(value);
				}
			
			
			}
			driver.navigate().to("http://demowebshop.tricentis.com/register");;
			System.out.println();

	}
		driver.quit();
	}
}
