
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RedBus_Excel_tstNG {
		String xlFilePath = "D:\\SS.xls";
	    String sheetName = "Sheet";
		WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String From, String To,String OD, String RD) throws InterruptedException {
		  WebElement qq=driver.findElement(By.xpath("//*[@id=\"src\"]"));
		  qq.sendKeys(From);
		  Thread.sleep(1000);
		  
		  qq.sendKeys(Keys.ENTER);
		  WebElement qc=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		  qc.sendKeys(To);
		  Thread.sleep(1000);
		  
		  qc.sendKeys(Keys.ENTER);
		  
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
			
		  
		  Thread.sleep(5000);
		  
	  }
	  @DataProvider(name="dp")
	  public Object[][] userFormData() throws Exception
	  {
	      Object[][] data = testData(xlFilePath, sheetName);
	      return data;
	  }
	   
	  public Object[][] testData(String xlFilePath, String sheetName) throws Exception
	  {
	      FileInputStream file= new FileInputStream(xlFilePath);
	      XSSFWorkbook wb = new XSSFWorkbook(file);
	      XSSFSheet sheet = wb.getSheet(sheetName);
	      int rowCount = sheet.getLastRowNum();
	      int column = sheet.getRow(0).getLastCellNum();
	      Object[][] data = new Object[rowCount][column];
	      for (int i = 1; i <= rowCount; i++) {
	          XSSFRow row = sheet.getRow(i);
	          for (int j = 0; j < column; j++) {
	              XSSFCell cell = row.getCell(j);
	              DataFormatter formatter = new DataFormatter();
	              String val = formatter.formatCellValue(cell);
	              data[i - 1][j] = val;
	          }
	      }

	      return data;
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.redbus.in/");
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}
