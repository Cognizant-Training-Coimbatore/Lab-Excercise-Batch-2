import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class RedBus {
	
	WebDriver driver;
	String srcdate,dstdate,date,month,year;
	
  @Test
  public void f() throws BiffException, IOException, InterruptedException {
	  
	  FileInputStream fi = new FileInputStream("E:\\JIJO A J\\ECLIPSE2\\SBA_SELENIUM\\ss.xls"); 
	  Workbook wrkbook = Workbook.getWorkbook(fi); 
	  Sheet wrksheet = wrkbook.getSheet(0);
//	  String a[][] = new String[wrksheet.getRows()][wrksheet.getColumns()];  
	  for(int rowCnt = 1; rowCnt<wrksheet.getRows(); rowCnt++) 
	  	{ 
		  driver.navigate().to("http://www.redbus.in/");
		  driver.findElement(By.id("src")).sendKeys(wrksheet.getCell(0, rowCnt).getContents());
		  driver.findElement(By.id("dest")).sendKeys(wrksheet.getCell(1, rowCnt).getContents());
		  Thread.sleep(1000);
		  driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		  driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  srcdate=wrksheet.getCell(2, rowCnt).getContents();
		  String[] cal= srcdate.split(" ");
		  date = cal[0].replaceAll("[^0-9]", ""); month = cal[1]; year = cal[2];
		  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div")).click();
		  while(true)
		  {
			  if(month.contains(driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().split(" ")[0]))
			  { 
				  WebElement calender=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody"));
				  List<WebElement> allDates = calender.findElements(By.tagName("tr"));
				  for (int i = 2; i < allDates.size(); i++) {
					  List<WebElement> allDate = allDates.get(i).findElements(By.tagName("td"));
					  for (int j = 0; j < allDate.size(); j++) {
						  if(date.equals(allDate.get(j).getText()))
						  {
							  allDate.get(j).click();
							  break;
						  }
					  	}
					  }
				  break;
			  }
			  else
			  {
				  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			  }
			  
		  }		  
		  
		  dstdate=wrksheet.getCell(3, rowCnt).getContents();
		  cal= dstdate.split(" ");
		  date = cal[0].replaceAll("[^0-9]", ""); month = cal[1]; year = cal[2];
		  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div")).click();
		  while(true)
		  {
			  if(month.contains(driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]")).getText().split(" ")[0]))
			  { 
				  WebElement calender=driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody"));
				  List<WebElement> allDates = calender.findElements(By.tagName("tr"));
				  for (int i = 2; i < allDates.size(); i++) {
					  List<WebElement> allDate = allDates.get(i).findElements(By.tagName("td"));
					  for (int j = 0; j < allDate.size(); j++) {
						  if(date.equals(allDate.get(j).getText()))
						  {
							  allDate.get(j).click();
							  break;
						  }
					  	}
					  }
				  break;
			  }
			  else
			  {
				  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			  }
			  
		  }		  	
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		  Thread.sleep(7000);
	  	}
	  
  }

  
  @BeforeClass
  public void beforeClass() {
	  
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.redbus.in/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  	
	  Thread.sleep(4000);
	  driver.quit();
  }

}
