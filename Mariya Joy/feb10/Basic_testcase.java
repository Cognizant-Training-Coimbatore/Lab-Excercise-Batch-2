package basic_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open the url "http://www.selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page title:"+driver.getTitle());
		System.out.println("Page title Length:"+driver.getTitle().length());
		//Wait 5 seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();

	}

}
