import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class fb_test {
	public WebDriver driver;
	public WebDriverWait wait;
	private By fname=By.xpath("//*[@id=\"u_0_m\"]");
	private By lname=By.xpath("//*[@id=\"u_0_o\"]");
	private By mobile=By.xpath("//*[@id=\"u_0_r\"]");
	private By pwd=By.xpath("//*[@id=\"u_0_w\"]");
	private By day=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By male=By.xpath("//*[@id=\"u_0_6\"]");
	private By female=By.xpath("//*[@id=\"u_0_7\"]");
	private By custom=By.xpath("//*[@id=\"u_0_8\"]");
	
	private By submit=By.xpath("//*[@id=\"u_0_13\"]");
	
	
  @Test(dataProvider = "dp")
  public void f(String FirstName, String LastName,String MobileNumber,String passwd,String BirthMonth,String Birthday,String Birthyear,String Gender) throws InterruptedException {
  driver.findElement(fname).sendKeys(FirstName);
  driver.findElement(lname).sendKeys(LastName);
  driver.findElement(mobile).sendKeys(MobileNumber);
  driver.findElement(pwd).sendKeys(passwd);
  driver.findElement(month).sendKeys(BirthMonth);
  driver.findElement(day).sendKeys(Birthday);
  driver.findElement(year).sendKeys(Birthyear);
  
  if (Gender.equals("male"))
  {
	  driver.findElement(male).click();
  }
  else if (Gender.equals("female"))
  {
	  driver.findElement(female).click();
  }
  else
  {
	  driver.findElement(custom).click();
  }
  Thread.sleep(4000);
  driver.findElement(submit).click();
  
  driver.navigate().to("https://www.facebook.com/");
  }
    @DataProvider
  public Object[][] dp() {
    	Object[][] arrayObject = getExcelData("E:\\JIJO A J\\FB.xls","FBlogin");
		return arrayObject;};
  
public String[][] getExcelData(String fileName, String sheetName) {
	String[][] arrayExcelData = null;
	try {
		FileInputStream fs = new FileInputStream(fileName);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(sheetName);

		int totalNoOfCols = sh.getColumns();
		int totalNoOfRows = sh.getRows();
		
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		
		for (int i= 1 ; i < totalNoOfRows; i++) {

			for (int j=0; j < totalNoOfCols; j++) {
				arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
			}

		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		e.printStackTrace();
	} catch (BiffException e) {
		e.printStackTrace();
	}
	return arrayExcelData;
}


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
