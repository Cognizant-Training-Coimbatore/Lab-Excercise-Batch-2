

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		homepage home = new homepage(driver);
		home.clickLogin();
		Thread.sleep(5000);
		loginPage login = new loginPage(driver);
		login.enterUsername("venkat");
		login.enterPassword("venkat123$");
		driver.quit();

	}

}
