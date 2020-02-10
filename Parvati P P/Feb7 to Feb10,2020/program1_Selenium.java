package ptogram1_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_Selenium {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Java Programs\\Selenium_Examples\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open the url "https://selenium.dev/"
		driver.get("http://selenium.dev/");
		System.out.println("Page Title"+driver.getTitle());
		System.out.println("Page Title"+driver.getTitle().length());
		//Wait 5 Seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
	}

}
