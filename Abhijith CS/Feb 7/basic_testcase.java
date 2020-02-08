package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ABHIJITH C S\\selenium\\selenium examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//Open the url "https://selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("Page title : "+driver.getTitle());
		System.out.println("Page title length: "+driver.getTitle().length());
		//wait 5 Seconds
		Thread.sleep(5000);
		//Close the browser
		driver.quit();
	}

}
