import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homepage home = new homepage(driver);
		home.clickLogin();
		loginpage login = new loginpage(driver);
		login.enterUsername("Jaseem");
		login.enterPassword("pass123$");
		driver.quit();
	}

}