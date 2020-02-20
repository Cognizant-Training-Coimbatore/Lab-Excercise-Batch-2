package sample_log4j;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Flipkart {
	public WebDriver driver;
	String url="https://www.flipkart.com/?gclid=EAIaIQobChMIu5qv7NnG5wIVyxwrCh16Hw_AEAAYASAAEgL88PD_BwE&ef_id=EAIaIQobChMIu5qv7NnG5wIVyxwrCh16Hw_AEAAYASAAEgL88PD_BwE:G:s&s_kwcid=AL!739!3!265109269849!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog";

	
	//locators
	private By s1=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	private By s2=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	private By s3=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");
	private By s4=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	private By s5=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	private By s6=By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	private By s7=By.linkText("Cello Striker Jar Ball Pen");
	private By s8=By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	private By s9=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");
	private By s10=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/svg");
	
	//Submit Button
	private By s11=By.linkText("Logout");
	
  @Test(dataProvider = "FB_Login")
  public void f(String FirstName,String LastName,String MobileNumber,String Passwd,String BirthMonth,String BirthDay,String BirthYear,String Gender
) throws InterruptedException 
  {
	 
		
		driver.findElement(s1).sendKeys("8921105535");
		driver.findElement(s2).sendKeys("p123$%^");
      driver.findElement(s3).click();
      
      driver.findElement(s4).sendKeys("pen");
      driver.findElement(s5).sendKeys(Keys.ENTER);
      driver.findElement(s6).sendKeys("pen",Keys.ENTER);
      Thread.sleep(5000);
 
   driver.findElement(s7).click();
   
   
   String windowHandle = driver.getWindowHandle();
   driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
   
   ArrayList tabs = new ArrayList (driver.getWindowHandles());
   System.out.println(tabs.size());
   driver.switchTo().window((String) tabs.get(1)); 
   
  
   driver.findElement(s8).click();
   WebElement ele = driver.findElement(s9);
   Actions action = new Actions(driver);
   action.moveToElement(ele).build().perform();
   Thread.sleep(5000);
   driver.findElement(s10);
	 driver.findElement(s11).click();
	 
	 
	 driver.navigate().to(url);
	 
  }

  @DataProvider(name = "FB_Login")
  public Object[][] dp() throws Exception, IOException 
  {
	  Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Documents\\Datasheet.xls", "FB_Login");

		return arrayObject;
  }
  
  private String[][] getExcelData(String Filename, String Sheetname) throws BiffException, IOException 
  {
	  String[][] arrayExcelData = null;
	  try {
		  FileInputStream file=new FileInputStream(Filename);
		  Workbook wb=Workbook.getWorkbook(file);
		  Sheet sh=wb.getSheet(Sheetname);
		  int totalNoOfCols = sh.getColumns();
		  int totalNoOfRows = sh.getRows();
		  arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
	
			for (int i= 1 ; i < totalNoOfRows; i++) {
	
				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}
	
			}
	} 
	  catch (FileNotFoundException e) 
	  {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		//e.printStackTrace();
	} catch (BiffException e) {
		e.printStackTrace();
	}
	return arrayExcelData;
}

@BeforeClass
  public void beforeClass() {
	
	DOMConfigurator.configure("C:\\Users\\Admin\\Desktop\\java prgms\\sample\\src\\test\\java\\sample_log4j\\log4jconfiguration.xml");
	  driver=new ChromeDriver();
	
	  driver.manage().window().maximize();
	
	  driver.get(url);
	 
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
	 
  }

}
