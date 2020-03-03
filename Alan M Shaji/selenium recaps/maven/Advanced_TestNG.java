import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Advanced_TestNG extends Search_TestNG{

	@Test
  public void f() throws InterruptedException, IOException{
		Advanced_Search obj =new Advanced_Search(driver);
		obj.launch();
		obj.selectBrideOrGroom("Bride");
		obj.selectAgeFrom("20");
		obj.selectAgeTo("23");
		obj.selectCommunity("Anglo Indian");
		obj.selectHeightFrom("135");
		obj.selectHeightTo("168");
		obj.clickOnSearch();
		obj.screenshots();
}
	
	/*
	@BeforeTest
	public void launchApp()
	{
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver=new ChromeDriver();
		
		
	}
	*/
	/*
	@AfterTest
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	*/
	@AfterSuite
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}