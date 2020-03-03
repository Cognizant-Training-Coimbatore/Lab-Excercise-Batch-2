import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_TestNG {
	//Webdriver driver;
	public static WebDriver driver;	

/*	@BeforeTest
	public void launchApp()
	{
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver=new ChromeDriver();	
	}
	
	*/
	@BeforeSuite
	public void launchApp()
	{
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver=new ChromeDriver();	
	}
	@Test
  public void f() throws InterruptedException, IOException {
		Search obj1= new Search(driver);
		obj1.launchme();
		obj1.clickSearch();
		obj1.screenshots();
  }
	/*
	@AfterTest
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	*/
}
