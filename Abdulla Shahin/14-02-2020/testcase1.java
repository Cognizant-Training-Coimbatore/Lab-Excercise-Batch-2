package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homePage home = new homePage(driver);
		home.clickLogin();
		loginPage login = new loginPage(driver);
		login.enterUsername("shaheen");
		login.enterPassword("shaheen@123");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
