import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Fb_Ac_CT 
{
	public WebDriver driver;
	private By fname=By.xpath("//*[@id=\"u_0_m\"]");
	private By lname=By.xpath(" //*[@id=\"u_0_o\"]");
	private By mobile=By.xpath(" //*[@id=\"u_0_r\"]");
	private By day=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By male=By.xpath(" //*[@id=\"u_0_a\"]");
	private By female=By.xpath(" //*[@id=\"u_0_9\"]");
	private By submit=By.xpath(" //*[@id=\"u_0_13\"]");
  @Test(dataProvider = "dp")
  public void f(String Firstname,String Lastname,String	Mobilenumber,String Passwd,String BirthMonth,String	BirthDay,String	BirthYear,String Gender
) {
	  driver.findElement(fname).sendKeys("FirstName");
	  
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
  }

  @AfterClass
  public void afterClass() {
  }

}
