package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		Thread.sleep(5000);
		System.out.println("Page title" +driver.getTitle());
		System.out.println("Page title" +driver.getTitle().length());
		driver.quit();
		
		//Launch the chrome browser
		//Open the url "https://www.selenium.dev/"
		//Wait 5 seconds
		//Close the Browser
	}

}
