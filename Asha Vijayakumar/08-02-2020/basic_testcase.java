package selenium_examples1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\src\\selenium_examples1\\basic_testcase.java");
		
		// TODO Auto-generated method stub
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		
		//open the url"https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page Title:"+driver.getTitle());
		System.out.println("Page Title Length:" +driver.getTitle().length());
		
		//wait 5 seconds
		Thread.sleep(5000);
		
		//Close the Browser
		driver.quit();

	}

}
