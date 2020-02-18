package feb15;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Fb_Login {
	public WebDriver driver;
	String url="https://www.facebook.com/";
	//LOcators
	private By fname=By.xpath("//*[@id=\"u_0_m\"]");
	private By lastname=By.xpath("//*[@id=\"u_0_o\"]");
	private By mobile=By.xpath("//*[@id=\"u_0_r\"]");
	private By pwd=By.xpath("//*[@id=\"u_0_w\"]");
	private By day=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By Female=By.xpath("//*[@id=\"u_0_6\"]");
	private By male=By.xpath("//*[@id=\"u_0_7\"]");
	private By custom=By.xpath("//*[@id=\"u_0_8\"]");
	//Submit
	private By submit=By.xpath("//*[@id=\"u_0_13\"]");
  @Test(dataProvider = "dp")
  public void f(String FirstName, String	LastName, String MobileNumber , String Password , String BirthMonth, String	BirthDay, String	BirthYear, String	Gender ) throws InterruptedException
  {
	  driver.findElement(fname).sendKeys(FirstName);
	  driver.findElement(lastname).sendKeys(LastName);
	  driver.findElement(mobile).sendKeys(MobileNumber);
	  driver.findElement(pwd).sendKeys(Password);
	  Select dy=new Select(driver.findElement(day));
	  dy.selectByVisibleText(BirthDay);
	  Select mnt=new Select(driver.findElement(month));
	  dy.selectByVisibleText(BirthMonth);
	  Select yea=new Select(driver.findElement(year));
	  dy.selectByVisibleText(BirthYear);
	  if(Gender.equals("Male"))
	  {
		  driver.findElement(male).click();
	  }
	  else if(Gender.equals("Female"))
	  {
		  driver.findElement(Female).click();
	  }
	  else
	  {
		  driver.findElement(custom).click();
	  }
	  Thread.sleep(5000);
	  driver.navigate().to(url);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
