package log4j;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class test2demowebshop 
{
	public WebDriver driver;
	
	String url="http://demowebshop.tricentis.com/register";
	
	//locators
	private By register = By.linkText("Register");
	private By male = By.xpath("//*[@value='M']");
	private By female= By.xpath("//*[@value='F']");
	private By fname= By.xpath("//*[@name='FirstName']");
	private By lname= By.xpath("//*[@name='LastName']");
	private By email = By.xpath("//*[@name='Email']");
	private By password = By.xpath("//*[@name='Password']");
	private By confirmpassword = By.xpath("//*[@name='ConfirmPassword']");
	private By registerButton = By.xpath("//*[@name='register-button']");
	
		
	
	
  @Test(dataProvider = "FB_Login")
  public void test1(String	  Gender1,String FirstName1,String LastName1,String	Email,String Password,String ConfirmPassword
) throws InterruptedException 
  {
	  
     if(Gender1.equalsIgnoreCase("male"))
     {
    	 driver.findElement(male).click();
     }
     else
     if(Gender1.equalsIgnoreCase("female"))
     {
     driver.findElement(female).click();
    }

	driver.findElement(fname).sendKeys(FirstName1);
	driver.findElement(lname).sendKeys(LastName1);
	driver.findElement(email).sendKeys(Email);
	driver.findElement(password).sendKeys(Password);
	driver.findElement(confirmpassword).sendKeys(ConfirmPassword);
	driver.findElement(registerButton).click();
	Thread.sleep(2000);
	driver.navigate().to(url);
	
  }

  @DataProvider(name ="FB_Login")
  public Object[][] dp() throws Exception,IOException
  {
    Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Documents\\TEST2.xls","FB_Login");
    return arrayObject;
	  
  }
  
  private String[][] getExcelData(String Filename, String Sheetname) throws BiffException, IOException 
  {
		  String[][] arrayExcelData = null;
		  try 
		  {
			  FileInputStream file=new FileInputStream(Filename);
			  Workbook wb=Workbook.getWorkbook(file);
			  Sheet sh=wb.getSheet(Sheetname);
			  int totalNoOfCols = sh.getColumns();
			  int totalNoOfRows = sh.getRows();
			  arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		
				for (int i= 1 ; i < totalNoOfRows; i++) 
				{
		
					for (int j=0; j < totalNoOfCols; j++) 
					{
						arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
						System.out.println(sh.getCell(j, i).getContents());
					}
		
				}
		} 
	    catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		  
		{
			e.printStackTrace();
			//e.printStackTrace();
		} 
		catch (BiffException e) 
		{
			e.printStackTrace();
		}
		return arrayExcelData;
		
	}
  
  @BeforeClass
  public void beforeClass() {
	
	DOMConfigurator.configure("C:\\Users\\Admin\\Desktop\\java prgms\\PageObjectModel\\src\\log4j\\log4j_configure.xml");
	  driver=new ChromeDriver();
	
	  driver.manage().window().maximize();
	
	  driver.get(url);
	 
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
	 
  }

}
