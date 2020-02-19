package log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class NewDemoTest 
{
	public WebDriver driver;
	String url="https://facebook.com";
	String url1 ="http://demowebshop.tricentis.com/register";
	
	//locators
	private By fname=By.xpath("//*[@name='firstname']");
	private By lname=By.xpath("//*[@name='lastname']");
	private By mobile=By.xpath("//*[@name='reg_email__']");
	private By pwd=By.xpath("//*[@name='reg_passwd__']");
	private By day=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By male=By.xpath("//*[@value='2']");
	private By fmale=By.xpath("//*[@value='1']");
	private By custom=By.xpath("//*[@value='-1']");
	
	//Submit Button
	private By submit=By.xpath("//*[@id=\"u_0_13\"]");
	
	//locators2
		private By male1 = By.xpath("//input[@id='gender-male']");
		private By female1 = By.xpath("//input[@id='gender-female']");
		private By firstname1 =By.xpath("//input[@id='FirstName']");
		private By lastname1 = By.xpath("//input[@id='LastName']");
		private By email1 = By.xpath("//input[@id='Email']");
		private By password1 =By.xpath("//input[@id='Password']");
		private By confirmpassword1 =By.xpath("//input[@id='ConfirmPassword']");
		private By register = By.xpath("//input[@id='register-button']");

	  @Test(dataProvider = "FB_Login")
	  public void f(String FirstName,String LastName,String MobileNumber,String Passwd,String BirthMonth,String BirthDay,String BirthYear,String Gender
				,String Gender1,String FirstName1,String	LastName1,String Email,String Password,String ConfirmPassword
) throws InterruptedException 
	  {
		  
		/*  
		   driver.findElement(fname).sendKeys(FirstName);
		 
		  driver.findElement(lname).sendKeys(LastName);
		 
		  driver.findElement(mobile).sendKeys(MobileNumber);
		 
		  driver.findElement(pwd).sendKeys(Passwd);
		  
		  Select dy=new Select(driver.findElement(day));
		  dy.selectByVisibleText(BirthDay);
		 
		  Select mnt=new Select(driver.findElement(month));
		  mnt.selectByVisibleText(BirthMonth);
		 
		  Select yer=new Select(driver.findElement(year));
		  yer.selectByVisibleText(BirthYear);
		 
		  if(Gender.equals("Male"))
		  {
			  driver.findElement(male).click();
			 
		  }
		  else if(Gender.equals("Female"))
		  {
			  driver.findElement(fmale).click();
			 
		  }
		  else
		  {
			  driver.findElement(custom).click();
			 
		  }
		  Thread.sleep(5000);
		 
		  driver.navigate().to(url);
		  */
	 
		  
		  if(Gender1.equals("Male"))
		  {
			  driver.findElement(male1).click();
			 
		  }
		  else 
		  if (Gender1.equals("Female"))
		  {
			  driver.findElement(female1).click();
			 
		  }
		 
		
		  
		  //demowebshop
		  driver.findElement(firstname1).sendKeys(FirstName1);
		  driver.findElement(lastname1).sendKeys(LastName1);
		  driver.findElement(email1).sendKeys(Email);
		  driver.findElement(password1).sendKeys(Password);
		  driver.findElement(confirmpassword1).sendKeys(ConfirmPassword);
		  driver.findElement(register).click();
		  
		  driver.navigate().to(url1);
     
	  }

  @DataProvider(name = "FB_Login")
  public Object[][] dp() throws Exception, IOException 
  {
	  Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Documents\\Datasheet3.xls","FB_Login");
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
	} 
	  catch (IOException e) 
	  {
		e.printStackTrace();
	} 
	  catch (BiffException e) {
		e.printStackTrace();
	}
	return arrayExcelData;
   }

  @BeforeClass
  public void beforeClass() 
  {
	
	 DOMConfigurator.configure("C:\\Users\\Admin\\Desktop\\java prgms\\PageObjectModel\\src\\log4j\\log4j_configure.xml");
	  driver=new ChromeDriver();
	
	  driver.manage().window().maximize();
	
	  driver.get(url1);
	 
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
	 
  }

}
