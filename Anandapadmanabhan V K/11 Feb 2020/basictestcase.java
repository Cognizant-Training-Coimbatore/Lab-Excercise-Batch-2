package basic_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basictestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
//		Launch the chrome browser
		WebDriver driver = new ChromeDriver();
//		open the url "http:/www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("page title:" +driver.getTitle());
		System.out.println("page title length:" +driver.getTitle().length());
//		wait 5 sec 
		Thread.sleep(5000);
//		close the browser
		driver.quit();
	}

}