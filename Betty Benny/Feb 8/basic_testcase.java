package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page Title:" +driver.getTitle());
		System.out.println("Page Title Length :" +driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		
		//Close the browser
		driver.quit();
		


	}

}
