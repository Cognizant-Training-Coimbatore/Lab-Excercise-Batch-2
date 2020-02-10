package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_capture_title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/cts%20app.html");
		System.out.println(driver.getTitle());
		driver.quit();
		// TODO Auto-generated method stub

	}

}
