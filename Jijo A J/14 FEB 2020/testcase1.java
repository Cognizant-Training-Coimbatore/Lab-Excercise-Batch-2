import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String d="http://demowebshop.tricentis.com";
	driver.get(d);
	homepage home=new homepage(driver);
	home.ClickLogin();
	loginpage login=new loginpage(driver);
	login.enterusername("venkat");
	login.enterpassword("venkat123$");
	driver.quit();
	}
}
