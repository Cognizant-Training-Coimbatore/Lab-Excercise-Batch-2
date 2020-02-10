package webdriver_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_implicite_wait 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//GIVE Time... not code repeated as thread..only once in code...constant tym 
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in1")).click();
		
		driver.quit();
	}

}
