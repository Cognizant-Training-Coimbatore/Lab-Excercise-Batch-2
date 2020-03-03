import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxl_Sample {
	public static void main(String args[]) throws BiffException, IOException {	  
		  FileInputStream fi = new FileInputStream("D:/demousers.xls"); 
		  Workbook wrkbook = Workbook.getWorkbook(fi); 
		  Sheet wrksheet = wrkbook.getSheet(0);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			

//		  String a[][] = new String[wrksheet.getRows()][wrksheet.getColumns()];  
		  
		  for(int rowCnt = 1; rowCnt<wrksheet.getRows(); rowCnt++) 
		  	{ 
			  int colCnt=0;
				  System.out.print(wrksheet.getCell(colCnt,rowCnt).getContents()+"\t");
				  	driver.findElement(By.linkText("Register")).click();
					driver.findElement(By.id("gender-male")).click();
					driver.findElement(By.id("FirstName")).sendKeys(wrksheet.getCell(colCnt,rowCnt).getContents());
					colCnt++;
					driver.findElement(By.id("LastName")).sendKeys(wrksheet.getCell(colCnt,rowCnt).getContents());
					colCnt++;
					driver.findElement(By.id("Email")).sendKeys(wrksheet.getCell(colCnt,rowCnt).getContents());
					colCnt++;
					driver.findElement(By.name("Password")).sendKeys(wrksheet.getCell(colCnt,rowCnt).getContents());
					driver.findElement(By.name("ConfirmPassword")).sendKeys(wrksheet.getCell(colCnt,rowCnt).getContents());
					driver.findElement(By.name("register-button")).click();
					
				driver.findElement(By.linkText("Log out")).click();
	  }
		  driver.quit();
}
}

