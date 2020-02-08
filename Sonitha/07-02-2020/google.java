package BasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java prgms\\selenium_Examples\\chromedriver.exe");//going to control the web
		
		//  Launch the chrome browser 
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("Nature Images");
		 driver.findElement(By.name("q")).submit();//autosubmit-submit()
		 
		 

	}

}
