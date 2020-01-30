package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_launch_browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();//to get title...store
		System.out.println(s);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
