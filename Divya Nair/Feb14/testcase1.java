package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		POM home=new POM(driver);
		home.clickLogin();
		loginpage login=new loginpage(driver);
		login.enterUsername("divya");
		login.enterPassword("divya123");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
